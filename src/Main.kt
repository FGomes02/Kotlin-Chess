fun buildMenu(): String {
    return ("1-> Start New Game;\n0-> Exit Game;\n")
}

fun checkName(name: String): Boolean {
    val maiuscula = 'A'..'Z'
    val minuscula = 'a'..'z'
    var spaces = 0
    var capsCheck = true
    var count = 0

    while (count < name.length) {
        val char = name[count]
        if (spaces > 1){ return false}
        else if (char == ' ') { spaces++; capsCheck = true }
        else if (capsCheck) {if (char !in maiuscula) return false else capsCheck = false}
        else if (char !in minuscula) return false
        count += 1
    }
    if (spaces != 1 || name[name.length - 1] == ' '){ return false}

    return true
}

fun showChessLegendOrPieces(message: String): Boolean? {
    if (message == "y" || message == "Y") {
        return true
    } else if (message == "n" || message == "N") {
        return false
    } else {
        return null
    }
}

fun checkIsNumber(number: String): Boolean {
    return number.toIntOrNull() != null
}

fun getCoordinates (readText: String?): Pair<Int, Int>? {

    if (readText == null) return null

    if (readText.length == 2) {
        when (readText) {
            ("A") -> 20
        }
    } else return null


}

fun checkRightPieceSelected (pieceColor: String, turn: Int): Boolean {



}

fun isCoordinateInsideChess (coord: Pair<Int, Int>,numColumns: Int,numLines: Int):Boolean {

}

fun isValidTargetPiece(currentSelectedPiece: Pair<String, String>,currentCoord : Pair<Int, Int>, targetCoord : Pair<Int, Int>, pieces : Array<Pair<String, String>?>, numColumns: Int, numLines: Int): Boolean {

}

fun movePiece( pieces : Array<Pair<String, String>?>, numColumns: Int, numLines: Int, currentCoord: Pair<Int, Int>, targetCoord: Pair<Int, Int>, totalPiecesAndTurn : Array<Int>): Boolean {

}

fun startNewGame (whitePlayer: String, blackPlayer: String, pieces : Array<Pair<String, String>?>, totalPiecesAndTurn : Array<Int?>,numColumns: Int,numLines: Int, showLegend: Boolean= false, showPieces: Boolean = false) {

}

fun isHorseValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,pieces : Array<Pair<String, String>?>,numColumns: Int, numLines: Int): Boolean {

}

fun isKingValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean {

}

fun isTowerValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean {

}

fun isBishopValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int,
        Int>,pieces: Array<Pair<String,
        String>?>,numColumns: Int,numLines:
                  Int): Boolean{

}

fun isQueenValid(currentCoord:
                 Pair<Int, Int>,targetCoord: Pair<Int,
        Int>,pieces: Array<Pair<String,
        String>?>,numColumns: Int,numLines:
                 Int):Boolean{

}

fun isKnightValid(currentCoord:
                  Pair<Int, Int>,targetCoord: Pair<Int,
        Int>,pieces: Array<Pair<String,
        String>?>,numColumns: Int,numLines:
                  Int):Boolean{

}*/

fun createInitialBoard(numColumns: Int,numLines: Int): Array<Pair<String,String>?> {
    val collumnLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var array = arrayOfNulls<Pair<String,String>>(numColumns*numLines)
    var lineNum = 1; var colNum = 0; var count = 0

    if (numColumns == 8 && numLines == 8){
        array[0] = Pair("T","w");array[1] = Pair("H","w");array[2] = Pair("B","w");
        array[3] = Pair("Q","w");array[4] = Pair("K","w");array[5] = Pair("B","w");
        array[6] = Pair("H","w");array[7] = Pair("T","w");
        for (i in 8..15){array[i] = Pair("P","w")}
        for(i in 16..47){array[i] = null}
        for(i in 48..55){array[i] = Pair("P","b")}
        array[56] = Pair("T","b");array[57] = Pair("H","b");array[58] = Pair("B","b");
        array[59] = Pair("Q","b");array[60] = Pair("K","b");array[61] = Pair("B","b");
        array[62] = Pair("H","b");array[63] = Pair("T","b")

    }

    if(numColumns == 7 && numLines == 7){
        array[0] = Pair("T","w");array[1] = Pair("H","w");array[2] = Pair("B","w");
        array[3] = Pair("K","w");array[4] = Pair("B","w");
        array[5] = Pair("H","w");array[6] = Pair("T","w");
        for (i in 7..13){array[i] = Pair("P","w")}
        for(i in 14..34){array[i] = null}
        for(i in 35..41){array[i] = Pair("P","b")}
        array[42] = Pair("T","b");array[43] = Pair("H","b");array[44] = Pair("B","b");
        array[45] = Pair("K","b");array[46] = Pair("B","b");
        array[47] = Pair("H","b");array[48] = Pair("T","b")
    }

    if(numColumns == 6 && numLines == 6){
        array[0] = Pair("H","w");array[1] = Pair("B","w");array[2] = Pair("Q","w");
        array[3] = Pair("K","w");array[4] = Pair("B","w");array[5] = Pair("T","w");
        for (i in 6..11){array[i] = Pair("P","w")}
        for(i in 12..23){array[i] = null}
        for(i in 24..29){array[i] = Pair("P","b")}
        array[30] = Pair("H","b");array[31] = Pair("B","b");array[32] = Pair("Q","b");
        array[33] = Pair("K","b");array[34] = Pair("B","b");array[35] = Pair("T","b");
    }

    if(numColumns == 6 && numLines == 7){
        array[0] = Pair("T","w");array[1] = Pair("B","w");array[2] = Pair("Q","w");
        array[3] = Pair("K","w");array[4] = Pair("B","w");array[5] = Pair("H","w");
        for (i in 6..11){array[i] = Pair("P","w")}
        for(i in 12..29){array[i] = null}
        for(i in 30..35){array[i] = Pair("P","b")}
        array[36] = Pair("T","b");array[37] = Pair("B","b");array[38] = Pair("Q","b");
        array[39] = Pair("K","b");array[40] = Pair("B","b");array[41] = Pair("H","b");
    }

    if(numColumns == 4 && numLines == 4){
        array[0] = null; array[1] = null
        array[2] = Pair("T","w");array[3] = Pair("B","w")
        for(i in 4..11){array[i] = null}
        array[12] = Pair("T","b");array[13] = Pair("B","b")
        array[14] = null; array[15] = null
    }

    return array
}

fun convertStringToUnicode(piece: String, color: String): String{
    var unicode = " "
    if(color == "w"){
        when(piece){
            "H" -> unicode = "\u265E"
            "T" -> unicode = "\u265C"
            "P" -> unicode = "\u265F"
            "K" -> unicode = "\u265A"
            "B" -> unicode = "\u265D"
            "Q" -> unicode = "\u265B"
            else -> unicode = " "
        }
    }else if(color == "b"){
        when(piece){
            "H" -> unicode = "\u2658"
            "T" -> unicode = "\u2656"
            "P" -> unicode = "\u2659"
            "K" -> unicode = "\u2654"
            "B" -> unicode = "\u2657"
            "Q" -> unicode = "\u2655"
            else -> unicode = " "
        }
    }else{
        unicode = " "
    }

    return unicode
}

fun drawSquares(numColumns: Int, line: Int, numLines: Int, drawLegend: Boolean = false, drawPieces: Boolean = false,pieces: Array<Pair<String,String>?>): String{
    var board = ""
    val esc: String = Character.toString(27)
    val end = "$esc[0m"
    val startBlue = "$esc[30;44m" ; val startGrey = "$esc[30;47m"; val startWhite = "$esc[30;30m"
    var piece = ""
    var columnCount = 0; var arrayCount = 0
    var lineCount = line


    while(lineCount < numLines){
        columnCount = 0
        if(drawLegend){board += "$startBlue ${lineCount + 1} $end"}

        if(lineCount%2 == 0){
            while (columnCount < numColumns){
                piece = convertStringToUnicode("${pieces[arrayCount]?.first}","${pieces[arrayCount]?.second}")
                if(drawPieces == false){piece = " "}
                if(columnCount % 2==0){
                    board += "$startGrey $piece $end"
                }else{
                    board += "$startWhite $piece $end"
                }
                columnCount++
                arrayCount++
            }
        }else{
            while (columnCount < numColumns){
                piece = convertStringToUnicode("${pieces[arrayCount]?.first}","${pieces[arrayCount]?.second}")
                if(drawPieces == false){piece = " "}
                if(columnCount % 2==0){
                    board += "$startWhite $piece $end"
                }else{
                    board += "$startGrey $piece $end"
                }
                columnCount++
                arrayCount++
            }
        }

        if(drawLegend){board += "$startBlue   $end"}
        board += "\n"
        lineCount += 1

    }

    return board
}

fun buildBoard(numColumns: Int,numLines: Int, showLegend: Boolean = false, showPieces: Boolean = false,pieces: Array<Pair<String,String>?>): String{
    val esc: String = Character.toString(27)
    val end = "$esc[0m"
    val startBlue = "$esc[30;44m"
    var board = ""
    val drawBlue = "$startBlue   $end"
    val collumnLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var columnLegend = 0

    if (showLegend) {
        board += drawBlue
        while (columnLegend < numColumns) {
            board += "$startBlue ${collumnLetter.get(columnLegend)} $end"
            columnLegend++
        }
        board += drawBlue + "\n"

        board += drawSquares(numColumns, 0, numLines,showLegend, showPieces, pieces)

        board += drawBlue
        columnLegend = 0
        while (columnLegend < numColumns) {
            board += drawBlue
            columnLegend++
        }
        board += drawBlue + "\n"
    } else {
        board += drawSquares(numColumns, 0, numLines, showLegend, showPieces,pieces)
    }

    return board

}

fun createTotalPiecesAndTurn(numColumns: Int, numLines: Int): Array<Int?>{
    return arrayOf((numColumns*numLines)/(numColumns/2),(numColumns*numLines)/(numColumns/2),0)
}

fun main() {
    var columns = 0; var lines = 0; var showPieces: Boolean = false; var showLegend: Boolean = false; val invalid = "Invalid response."
    println("Welcome to the Chess Board Game!")
    do {
        println(buildMenu()); val escolha: Int? = readLine()?.toIntOrNull()

        if (escolha == null || escolha != 1) return

        do {
            println("First player name?\n")
            val firstName = readLine();var checkName1 = false
            if (firstName != null) {checkName1 = checkName(firstName)}
            if (checkName1 == false) println(invalid)

        } while (checkName1 == false)

        do {
            var checkName2 = false
            println("Second player name?\n")
            val secondName = readLine()
            if (secondName != null) {checkName2 = checkName(secondName)}
            if (checkName2 == false) println(invalid)

        } while (checkName2 == false)

        do {
            var checkColumn = false
            println("How many chess columns?\n")
            val numColumns = readLine()
            if (numColumns != null) {
                checkColumn = checkIsNumber(numColumns)
                if(checkColumn) {
                    columns = numColumns.toInt()
                    if (columns < 5) checkColumn = false
                }
            }
            if (checkColumn == false) println(invalid)

        } while (checkColumn == false)

        do {
            var checkLineNum = false
            println("How many chess lines?\n")
            val numLines = readLine()
            if (numLines != null) {
                checkLineNum = checkIsNumber(numLines)
                if(checkLineNum) {
                    lines = numLines.toInt()
                    if (lines < 5) checkLineNum = false
                }
            }
            if (checkLineNum == false) println(invalid)

        } while (checkLineNum == false)

        do {
            var checkLegend : Boolean? = false
            println("Show legend (y/n)?\n")
            val legendResponse = readLine()
            if (legendResponse != null) {
                checkLegend = showChessLegendOrPieces(legendResponse)
                if (checkLegend != null) showLegend = checkLegend
            }
            if (checkLegend == null) println(invalid)

        } while (checkLegend == null || false)

        do {
            var checkPiece : Boolean? = false
            println("Show pieces (y/n)?\n")
            val pieceResponse = readLine()
            if (pieceResponse != null) {
                checkPiece = showChessLegendOrPieces(pieceResponse)
                if (checkPiece != null) showPieces = checkPiece
            }
            if (checkPiece == null) println(invalid)

        } while (checkPiece == null || false)
        var totalTurnsArray = createTotalPiecesAndTurn(columns,lines)
        var boardArray = createInitialBoard(columns,lines)
        println(buildBoard(columns,lines,showLegend,showPieces,boardArray))

        do {

        } while ()
    } while (escolha == 1)

    var boardArray = createInitialBoard(6,6)
    println(buildBoard(6,6,true,true,boardArray))
}