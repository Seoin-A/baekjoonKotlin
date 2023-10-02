import java.text.SimpleDateFormat
import java.time.ZoneId
import java.time.ZonedDateTime
import java.util.Calendar
import java.util.Scanner
import java.util.SimpleTimeZone

class PoliceAndArithmetic {
    val sc : Scanner = Scanner(System.`in`)

    // 2557 Hello World
    fun helloWorld(){

        println("Hello World!")
    }

    // 1000 A+B
    fun plus(){
        var a : Int = sc.nextInt()
        var b : Int = sc.nextInt()
        println(a+b)
    }

    // 1001 A-B
    fun minus(){
        var a : Int = sc.nextInt()
        var b : Int = sc.nextInt()
        println(a-b)
    }

    // 10998 A×B
    fun multiply(){
        var a : Int = sc.nextInt()
        var b : Int = sc.nextInt()
        println(a*b)
    }

    // 1008 A/B
    fun divide(){
        var a : Double = sc.nextDouble()
        var b : Double = sc.nextDouble()
        println(a/b)
    }

    // 10869 사칙연산

    fun addition(){
        var a = sc.nextInt()
        var b = sc.nextInt()
        println(a+b)
        println(a-b)
        println(a*b)
        println(a/b)
        print(a%b)
    }

    // 10926 ??1
    fun strPlus(){
        var str = sc.next()
        print("$str??!")
    }

    // 18108  1998년생인 내가 태국에서는 2541년생?
    fun ageAddition(){
        val age : Int = 543
        var input = sc.nextInt()
        print(input-age)
    }

    // 10430 나머지
    fun remainder(){
        var A = sc.nextInt()
        var B = sc.nextInt()
        var C = sc.nextInt()
        println((A+B)%C)
        println(((A%C) + (B%C))%C)
        println((A*B)%C)
        println(((A%C) * (B%C))%C)
    }

    // 2588 곱셈
    fun multi(){
        var a = sc.nextInt()
        var b = sc.nextInt()

        var b_1 = b%10
        var b_10 = b%100/10
        var b_100 = b/100

        println("${b_1*a}")
        println("${b_10*a}")
        println("${b_100*a}")
        println("${a*b}")
    }

    // 11382 꼬마정인
    fun littleJ(){
        val arr = readLine()!!.split(" ").map{it.toLong()}
        println("${arr[0]+arr[1]+arr[2]}")
    }

    // 10171 고양이
    fun cat(){
        println("\\    /\\")
        println(" )  ( ')")
        println("(  /  )")
        println(" \\(__)|")
    }

    fun dog(){
        println("|\\_/|")
        println("|q p|   /}")
        println("( 0 )\"\"\"\\")
        println("|\"^\"`    |")
        println("||_/=\\\\__|")
    }

    // 10699 오늘 날짜
    fun dDay(){
        println(ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString().substring(0, 10))
    }

}