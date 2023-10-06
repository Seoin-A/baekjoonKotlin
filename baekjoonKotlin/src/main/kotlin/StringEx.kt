import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

import java.util.*

class StringEx {
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

    // 2675 문자열 반복

    fun printRepeat() = with(BufferedReader(InputStreamReader(System.`in`))){

        repeat(readLine().toInt()){
            var str = StringBuilder()
            val t = StringTokenizer(readLine(), " ")
            val x= t.nextToken().toInt()
            var arr = t.nextToken()
            for ( i in arr.indices){
                repeat(x){
                    str.append(arr[i])
                }
            }
            println(str.toString())
        }
    }

    // 1152 단어의 개수

    fun printWord() = with (BufferedReader(InputStreamReader(System.`in`))){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val arr = StringTokenizer(readLine(), " ")
        bw.write("${arr.countTokens()}")
        bw.flush()
        bw.close()
    }

    // 2908 상수
    fun intReverse() = with(BufferedReader(InputStreamReader(System.`in`))){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        var t = StringTokenizer(readLine()," ")

        var a = t.nextToken().reversed().toInt()
        var b = t.nextToken().reversed().toInt()

        bw.write("${kotlin.math.max(a,b)}")
        bw.flush()
        bw.close()
    }

    // 5622 다이얼

    fun printDial() = with (BufferedReader(InputStreamReader(System.`in`))){
        var result = 0
        val sum = readLine()
        for ( i in sum.indices){
            when(sum[i]){
                'A', 'B', 'C' -> result +=3
                'D', 'E', 'F' -> result +=4
                'G', 'H', 'I' -> result +=5
                'J', 'K', 'L' -> result +=6
                'M', 'N', 'O' -> result +=7
                'P', 'Q', 'R', 'S' -> result +=8
                'T', 'U', 'V' -> result +=9
                'W', 'X', 'Y','Z' -> result +=10
            }
        }
        println("$result")
    }

    // 11718 그대로 출력하기
    fun outputAsIs() = with (BufferedReader(InputStreamReader(System.`in`))){
        while(true){
            readLine()?.let { it ->
                if(it.isNotEmpty()) println(it)
            }?:break
        }
    }
}