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

    /*
    2566 printMaxArrayIndex()
    1. 9*9 행렬 생성
    2. 2중 for 구문 이용하여 초기화
    3. 초기화 화면서 max 값 저장
    4. 출력
    */
    fun printMaxArrayIndex() = with ( BufferedReader(InputStreamReader(System.`in`))){
        var arr = Array(9){IntArray(9)}
        var max = 0;
        var (x,y) = arrayOf(0,0)
        for( i in 0 .. 8){
            val t = StringTokenizer(readLine()," ")

            for ( j in 0 .. 8){
                var a = t.nextToken().toInt()
                if(a>=max) {
                    max = a
                    x = i+1
                    y = j+1
                    arr[i][j] = a
                }
            }
        }
        print("$max\n$x $y")
    }

    /*
    10798 세로 읽기
    1. 5*15 행렬 생성 ' '로 초기화한다.
    2. for문을 이용하여 대입한다.
    3. for문을 반대로 돌려서 차례대로 출력하도록 한다 이떄 -1을 continue
    */

    fun printArrayVertical() = with (BufferedReader(InputStreamReader(System.`in`))){
        val arr = Array(5){CharArray(15){' '} }
        for( i in 0 until 5){
            val t = StringTokenizer(readLine())
            arr[i] = t.nextToken().toCharArray()
        }

        for(i in 0 until 15){
            for( j in 0 until 5){
                   if(arr[j].getOrNull(i) == null) continue
                print(arr[j][i])
            }
        }
    }

    /*
    2563 색종이
    1. 가로 세로 크기 100인 정사각형의 색종이의 크기는 10이므로 100*100 행렬로 초기화한다.
    2. 각 위치에 색종이를 붙이게 되면 행렬을 1로 교체한다.
    3. 겹치는 부분은 자동으로 1로 유지된다.
    4. 넓이를 출력한다.
    */

    fun printSqArea() = with(BufferedReader(InputStreamReader(System.`in`))){
        var bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        val arr = Array(100){IntArray(100){0} }
        var sum = 0
        var z = 0
        repeat(n){
            val t = StringTokenizer(readLine())
            var x = t.nextToken().toInt()
            var y = t.nextToken().toInt()
            for(i in y until  (y+10)){
                for ( j in x until x+10){
                    if(arr[i][j] != 1) z+=1
                    arr[i][j] = 1

                }
            }
        }
        bw.write("$z")
        bw.flush()
        bw.close()


        /*
        println("$z")
        repeat(100){
            i -> var x = i
            repeat(100){
                if(arr[i][it] == 1){
                    sum+=1
                }
            }

        }
        bw.write("$sum")
        bw.flush()
        bw.close()

        -> 오히려 빨라짐? 왜지?
        */
    }
}