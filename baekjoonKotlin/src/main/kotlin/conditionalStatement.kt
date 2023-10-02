import java.util.Scanner

class conditionalStatement {
    val sc : Scanner = Scanner(System.`in`)

    // 1330 두 수 비교하기
    fun Statement(){
        val arr = readLine()!!.split(" ").map{it.toInt()}
        if(arr[1]>arr[0]){
            println("<")
        }else if(arr[0]==arr[1]){
            println("==")
        }else{
            println(">")
        }
    }

    // 9498 시험 성적
    fun grade(){
        var grade = sc.nextInt()
        when(grade){
            in 90..100 -> println("A")
            in 80..89 -> println("B")
            in 70..79 -> println("C")
            in 60..69 -> println("D")
            else -> println("F")
        }
    }

    // 2753 윤년
    fun leapYear(){
        var year = sc.nextInt()
        if(((year%4==0) and (year%100 !=0)) or (year%400 ==0)){
            println("1")
        }else {
            println("0")
        }
    }

    //14681 사분면 고르기
    fun quadrant(){
        var a = sc.nextInt()
        var b = sc.nextInt()

        if((a>=0) and (b>=0)){
            println("1")
        }else if((a<0)and(b>=0)){
            println("2")
        }else if((a<0)and (b<0)){
            println("3")
        }else {
            println("4")
        }
    }

    // 2884 alarm
    fun alarm(){
        val arr = readLine()!!.split(" ").map{it.toInt()}
        if((arr[1]-45)>=0){
            println("${arr[0]} ${arr[1]-45}")
        }else if((arr[1]-45)<0){
            if(arr[0]>0){
                println("${arr[0]-1} ${arr[1]+15}")
            }else{
                println("23 ${arr[1]+15}")
            }
        }
    }

    // 2525 오븐 시계
    fun oven(){
        var a = sc.nextInt()
        var b = sc.nextInt()
        var c = sc.nextInt()


        val sum = 60 * a + b + c

        // A와 B를 분으로 변환한 것에 C를 더함

        var h : Int = sum / 60
        val m : Int = sum % 60

        if (h >= 24) {
            h -= 24
        }

        println("$h $m")
    }

    // 2480 주사위 3개

    fun dice(){
        var arr = readLine()!!.split(" ").map{it.toInt()}
        var max : Int

        if( (arr[0] == arr[1]) and (arr[1] == arr[2])){
            println("${arr[0]*1000+10000}")
            return
        }else {
            arr= arr.sorted()
            if(arr[0]==arr[1]){
                max = arr[0]*100+1000
            }else if(arr[0]==arr[2]){
                max = arr[0]*100+1000
            }else if(arr[1] == arr[2]){
                max = arr[1]*100+1000
            }else{
                max = arr[2]*100
                println(arr.toString())
            }
        }
        println("$max")
    }
}