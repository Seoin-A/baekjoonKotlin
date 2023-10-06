import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Deepening {
    // 25083

    fun sprout() = with(BufferedReader(InputStreamReader(System.`in`))){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        bw.write("         ,r'\"7\n")
        bw.write("r`-_   ,'  ,/\n")
        bw.write(" \\. \". L_r'\n")
        bw.write("   `~\\/\n")
        bw.write("      |\n")
        bw.write("      |")
        bw.flush()
        bw.close()
    }

}