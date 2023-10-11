import java.io.*
import java.util.*

class Array_2D_Ex {

    /*     2738 행렬 덧셈
        *  1. 공백을 두고 n , m 이 주어지므로 BufferedReader. split를 이용하여 int 값을 저장한다.
        *  2. StringTokinzer를 사용하여 한 줄씩 배열에 저장한다.
        *  3. 각 행과 열의 합한 값을 result 헹렬에 저장한다.
        *  4. 출력한다.
    */
    fun sumArray2d() = with(BufferedReader(InputStreamReader(System.`in`))) {
        var token = StringTokenizer(readLine())
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        val arr = Array(n){IntArray(m)}

        for(i in 0 until n){
            token = StringTokenizer(readLine())
            for(j in 0 until m){
                arr[i][j] = token.nextToken().toInt()
            }
        }

        for(i in 0 until n){
            token = StringTokenizer(readLine())
            for(j in 0 until m){
                arr[i][j] += token.nextToken().toInt()
            }
        }


        for ( i in 0 until n) {
            for (j in 0 until m) {
                print("${arr[i][j]} ")
            }
            println()
        }
    }


}