import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

import java.util.*

class string {
    // 27866 문자와 문자열

    fun charString() = with(Scanner(System.`in`)) {
        print("${next()[nextInt() - 1]}")
    }

    // 2743 단어 길이 재기
    fun lengthStr() = with(BufferedReader(InputStreamReader(System.`in`))){
        println(readLine().length)
    }

    // 9086 문자열
    fun printFirstLast() = with(Scanner(System.`in`)){
        repeat(nextLine().toInt()){
        var str = nextLine()
        println("${str[0]}${str[str.length-1]}")
        }
    }

    fun printAscii() = with(BufferedReader(InputStreamReader(System.`in`))){
        println("${readLine()[0].toInt()}")
    }

    fun printAdditions() = with(BufferedReader(InputStreamReader(System.`in`))){
        var bw = BufferedWriter(OutputStreamWriter(System.out))
        val x = readLine().toInt()
        var sum = 0
        var arr = readLine()

        for(i in 0 until x) {
            sum += arr[i].toString().toInt()
        }
        bw.write("${sum}")
        bw.flush()
        bw.close()
    }


    // 10809 알파벳 찾기
    fun printSearchStr() = with(BufferedReader(InputStreamReader(System.`in`))){
        val str = readLine()
        var arr = IntArray(27){-1}

        for ( i in str.indices){
            if ( arr[str[i].toInt() -97] == -1)
                arr[str[i].toInt()-97]=i
        }
        arr.forEach { print("${it} ") }
        arr.forEach { print("${it} ") }
    }
}