import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Scanner
import java.util.StringTokenizer

class loop {
    val sc : Scanner = Scanner(System.`in`)

    // 2739 구구단
    fun multiplicationTable(){

        var result = sc.nextInt()

        for(i in 1..9){
            println("${result} * $i = ${result * i}")
        }
    }

    // 10950 A+B -3
    fun multipleAddition(){
        val check = sc.nextInt()

        for(i in 0 until check){
            var a = sc.nextInt()
            var b = sc.nextInt()

            println("${a+b}")
        }
    }

    // 8393 합
    fun sum(){
        val check = sc.nextInt()
        var sum : Int = 0
        for(i in 1 .. check){
            sum +=i
        }
        println("$sum")
    }

    // 25304 영수증
    fun receipt(){
        val total  = sc.nextInt()
        val count = sc.nextInt()
        var sum : Int = 0
        for(i in 1..count){
            var a = sc.nextInt()
            var b = sc.nextInt()
            sum +=(a*b)
        }
        if(total == sum){
            println("Yes")
        }else{
            println("No")
        }
    }

    // 25314 코딩은 체육과목입니다
    fun intStr(){
        val count : Int = sc.nextInt()
        var result : java.lang.StringBuffer = StringBuffer("int")

        for(i in 1..(count/4)){
            result.insert(0,"long ")
        }
        println(result.toString())
    }

    // 15552 빠른 A+B
    fun fastString(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        repeat(br.readLine().toInt()){
            val token = StringTokenizer(br.readLine())
            val sum = token.nextToken().toInt()+token.nextToken().toInt()
            bw.write(sum.toString()+"\n")
        }
        bw.flush()
    }

    // 11021 A+B-7
    fun fastString2(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        var count = br.readLine().toInt()

        for(i in 0 until  count){
            val token = StringTokenizer(br.readLine())
            bw.write("Case #$i: "+(token.nextToken().toInt()+token.nextToken().toInt())+"\n")
        }
        bw.flush()

    }
}



