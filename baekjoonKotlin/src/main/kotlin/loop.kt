import java.util.Scanner

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
        
        for()
    }
}



