
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

import java.util.StringTokenizer
import kotlin.text.StringBuilder

class array {

    /*
    * 코틀린 배열
    *
    * -- 생성
    * arrayOf() : 특정 값을 넣어서 배열 생성
    * Array(사이즈 ,{들어갈 값} ) : 크기만 정해서 배열 생성
    *
    * -- 넣기
    * set(인덱스, 넣을 값)
    * array[인덱스] = 넣을 값
    *
    * -- 빼기
    * get(인덱스)
    * array[인덱스]
    * */

    // 10807 개수 세기
    fun countArray(){
        var result = 0
        var size : Int = readln().toInt()
        var arr : Array<Int?> = arrayOfNulls<Int>(size)
        val token = StringTokenizer(readLine())
        var check = readLine()!!.toInt()
        for( i in 0 until size){
            arr[i] = token.nextToken().toInt()
        }
        arr.sort()
        arr.forEach {
            if (it != null) {
                if( it <= check && it == check){
                    result+=1
                }
            }
        }
        println(result)
    }

    // 10871

    fun smallNum(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        var token = StringTokenizer(br.readLine())

        var size = token.nextToken().toInt()
        var check = token.nextToken().toInt()


        token = StringTokenizer(br.readLine())

        for ( i in 1..size){
            var a = token.nextToken().toInt()
            if(a<check){
                bw.write("$a ")
            }
        }
        bw.flush()
    }

    // 10818 최소 최대

    fun minmaxNum(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val size = br.readLine().toInt()
        val token =StringTokenizer(br.readLine())

        var arr = arrayOfNulls<Int>(size)

        for (i in 0 until size){
            arr[i] = token.nextToken().toInt()
        }
        var bw = StringBuilder()
        arr.sort()
        bw.append(arr[0]).append(" ").append(arr[size-1])
        print(bw.toString())
    }

    // 2562 최대값
    fun maxNum() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        var bw = StringBuilder()
        var arr = ArrayList<Int>()

        repeat(9) {
            arr.add(StringTokenizer(br.readLine()).nextToken().toInt())
        }
        var arr2 = arr.sorted()
        bw.append("${arr2[arr.size-1]}\n${arr.indexOf(arr2[arr.size-1])+1}")
        println(bw.toString())
    }


    // 10810 공 넣기
    fun inputBoll(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        var token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        var arr = Array(n){0}

        for(i in 0 until m){
            token = StringTokenizer(br.readLine())
            var a = token.nextToken().toInt()
            var b = token.nextToken().toInt()
            var c = token.nextToken().toInt()

            for(j in a-1 until b){
                arr[j] = c
            }
        }
        arr.forEach {
            print("$it ")
        }
    }

    // => 참조 코드
    fun inputBollSol() = with(BufferedReader(InputStreamReader(System.`in`))){
        println("앞으로 with 이용해보기!")
    }

    // 10813 공바꾸기
    fun changeBoll()= with(BufferedReader(InputStreamReader(System.`in`))){
        var token = StringTokenizer(readLine(), " ")
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        var arr = Array(n){i->i+1}
        var em = 0

        repeat(m){
            token = StringTokenizer(readLine()," ")
            var x = token.nextToken().toInt()-1
            var y = token.nextToken().toInt()-1
            em = arr[x]
            arr[x] = arr[y]
            arr[y] = em
        }
        arr.forEach { print("${it} ") }
    }

    // 5597 과제 안내신분
    fun report()=with(BufferedReader(InputStreamReader(System.`in`))) {
        val arr = Array(30) { it + 1 }.toMutableList()

        repeat(28) {
            var x = readLine().toInt()
            if (x in arr)
                arr.remove(x)
        }
        print("${arr[0]}\n${arr[1]}")
    }

    // 3052 나머지

    fun remain() = with(BufferedReader(InputStreamReader(System.`in`))){
        var arr = mutableSetOf<Int>()
        repeat(10){
            arr.add(readLine().toInt()%42)
        }
        println("${arr.size}")
    }


    // 10811 바구니 뒤집기
    fun basketOver() = with(BufferedReader(InputStreamReader(System.`in`))){
        var token = StringTokenizer(readLine(), " ")

        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        var arr = IntArray(n){ it+1}

        repeat(m){
            token = StringTokenizer(readLine(), " ")
            var i = token.nextToken().toInt()-1
            var j = token.nextToken().toInt()-1

            while(i<j){
                val temp = arr[i]
                arr[i++] = arr[j]
                arr[j--] = temp
            }
        }
        arr.forEach { print("${it} ") }
    }

    fun averageScore() = with(BufferedReader(InputStreamReader(System.`in`))){
        var t = StringTokenizer(readLine(), " ")
        val n = t.nextToken().toInt()

        t= StringTokenizer(readLine(), " ")
        var arr = DoubleArray(n)
        repeat(n){
            arr[it] = t.nextToken().toDouble()
        }

        arr.sort()
        val max = arr[arr.size-1]

        for( i in 0 until arr.size){
            arr[i] = (arr[i]/max) *100
        }
        println(arr.average())
    }
}