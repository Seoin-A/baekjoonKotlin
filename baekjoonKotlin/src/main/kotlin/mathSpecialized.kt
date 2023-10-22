import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class mathSpecialized {

    /*
    2745 진법 변환
    1. 진법과 문자를 n과 배열 arr에 저장한다.
    2. 각 자리의 수가 10진수보다 크면 a : 10 .. z: 35 로 대체한다
    */

    fun printBaseConversion() = with(BufferedReader(InputStreamReader(System.`in`))){
        val arr = readLine().toCharArray()
        val n = readLine().toInt()

        var res = 0

        for(i in arr.indices){
            if(n<=10){

            }else{

            }
        }


    }
}