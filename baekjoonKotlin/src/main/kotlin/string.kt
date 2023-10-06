import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
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

    //
}