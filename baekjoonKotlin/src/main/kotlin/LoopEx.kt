import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Scanner
import java.util.StringTokenizer

class LoopEx {
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
        var count : Int = 1

        repeat(br.readLine().toInt()){
            val token = StringTokenizer(br.readLine())
            val sum = token.nextToken().toInt()+token.nextToken().toInt()

            bw.write("Case #${count}: ${sum}\n")
            count++
        }
        bw.flush()
        bw.close()

        /*  val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            var count = br.readLine().toInt()
            for(i in 1..count){
                val token = StringTokenizer(br.readLine())
                bw.write("Case #${i}: ${token.nextToken().toInt()+token.nextToken().toInt()}\n")
            }
            bw.flush()
         */
    }

    // 11022 A+B-8

    fun fastString3(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        for (i in 1..br.readLine().toInt()){
            var token = StringTokenizer(br.readLine())
            var a = token.nextToken().toInt()
            var b = token.nextToken().toInt()
            bw.write("Case #${i}: ${a} + ${b} = ${a+b}\n")
        }
        bw.flush()
        bw.close()
    }

    // 2438 별찍기

    fun starStamp1(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        var count = br.readLine().toInt()

        for(i in 0 until count){
            for(j in 0.. i){
                bw.write("*")
            }
            bw.write("\n")
        }
        bw.flush()
        bw.close()
    }

    // 2439 별찍기2
    fun starStamp2(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        var count = br.readLine().toInt()

        for ( i in 1..count){
            for(j in count downTo 1){
                bw.write(
                    if(j<=i) "*"
                    else " "
                )
            }
            bw.write("\n")
        }
        bw.flush()
        bw.close()
    }

    // 10952 A+B-5

    fun addition(){
        val br = BufferedReader(InputStreamReader(System.`in`))

        while(true){
            var token = StringTokenizer(br.readLine())
            var a = token.nextToken().toInt()
            var b = token.nextToken().toInt()

            if(a==0 && b==0) break
            println("${a+b}\n")
            }
    }

    // 10951 A+B-4

    fun addition2(){
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        var str : String?
        while(br.readLine().also{ str = it} !=null){
            var token = StringTokenizer(str)
            var a = token.nextToken().toInt()
            var b = token.nextToken().toInt()

            bw.write("${a+b}\n")
            bw.flush()
        }
    }
}





