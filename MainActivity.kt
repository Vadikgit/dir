package ru.startandroid.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.*
//import kotlin.math.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*fun toastMe(view : View){
        val myToast = Toast.makeText(this,"Hello", Toast.LENGTH_SHORT)
        myToast.show()
    }*/

    /*fun countMe(view : View){
        val countstr = textView.text.toString()
        var cnt : Int = Integer.parseInt(countstr)
        cnt++
        textView.text = cnt.toString()

    }*/

    fun prDig1(view : View){
        val dig = button3.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun prDig2(view : View){
        val dig = button4.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun prDig3(view : View){
        val dig = button5.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun prDig4(view : View){
        val dig = button6.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun prDig5(view : View){
        val dig = button7.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun prDig6(view : View){
        val dig = button8.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun prDig7(view : View){
        val dig = button9.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun prDig8(view : View){
        val dig = button10.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun prDig9(view : View){
        val dig = button11.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun prDig0(view : View){
        val dig = button12.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun delC(view : View){
        var str = textView2.text.toString()
        var l : Int = str.length-1
        var str2 : String = ""
        for (i in 0..l-1)
            str2 = str2 + str[i]
        textView2.text = str2
    }

    fun del(view : View){
        val dig = button14.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun umn(view : View){
        val dig = button15.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun dim(view : View){
        val dig = button16.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun sum(view : View){
        val dig = button17.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun slft(view : View){
        val dig = button18.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun srgh(view : View){
        val dig = button19.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun pw(view : View){
        val dig = button20.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }

    fun sn(view : View){
        val dig = button.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun cs(view : View){
        val dig = button21.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun tg(view : View){
        val dig = button22.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun ct(view : View){
        val dig = button23.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    fun dt(view : View){
        val dig = button24.text.toString()
        val str = textView2.text.toString()
        textView2.text = str + dig
    }
    var ss : String  = ""

    fun mn(){
        ss  = '(' + ss +')'
        ss = ss.replace("sin","@")
        ss = ss.replace("cos","_")
        ss = ss.replace("tg","$")
        ss = ss.replace("ctg","#")
        for (i in 1..ss.length - 1)
            if ((ss[i] == '-')&&((ss[i-1].toByte() >= 48)&&(ss[i-1].toByte() <= 57) || (ss[i-1] == ')')))
                    ss = ss.replaceRange(i,i+1,":")
    }

    fun solve(s : String):String {
        var sW: String = s
        var s1: String = ""
        var s2: String = ""
        var s3: String = ""
        var i: Int = 0
        var j1: Int = 0
        var j2: Int = 0
        var k: Int = 0
        var l1: Double = 0.0
        var l2: Double = 0.0

        fun ar(c: Char) {
            var c1: Char = c
            if (c1 == '-')
                c1 = ':'
            i = sW.indexOf(c1)
            sW = sW.replace("--", "")
            if (!((c1 == '@')||(c1 == '_')||(c1 == '#')||(c1 == '$'))){
            while (i >= 0) {
                s1 = ""
                s2 = s1
                j1 = i - 1
                j2 = i + 1
                while ((sW[j1].toByte() >= 48) && (sW[j1].toByte() <= 57) && (j1 > 0) || (sW[j1] == '.'))
                    j1--
                if (!((sW[j1].toByte() >= 48) && (sW[j1].toByte() <= 57) || (sW[j1] == '-')))
                    j1++
                s1 = sW.substring(j1, i)

                while ((sW[j2].toByte() >= 48) && (sW[j2].toByte() <= 57) && (j2 < sW.length - 1) || (sW[j2] == '.') || (sW[j2] == '-'))
                    j2++
                if (!((sW[j2].toByte() >= 48) && (sW[j2].toByte() <= 57) || (sW[j2] == '-')))
                    j2--
                s2 = sW.substring(i + 1, j2+1)
                l1 = s1.toDouble()
                l2 = s2.toDouble()
                when (c1) {
                    '*' -> s3 = (l1 * l2).toString()
                    '/' -> s3 = (l1 / l2).toString()
                    '+' -> s3 = (l1 + l2).toString()
                    ':' -> s3 = (l1 - l2).toString()
                    '^' -> s3 = (l1.pow(l2)).toString()
                }
                sW = sW.replaceRange(j1, j2+1, s3)
                i = sW.indexOf(c1)
             }
            }

            else {
                if(i>=0){
                    j2 = i + 1
                    while ((sW[j2].toByte() >= 48) && (sW[j2].toByte() <= 57) && (j2 < sW.length - 1) || (sW[j2] == '.') || (sW[j2] == '-'))
                        j2++
                    if (!((sW[j2].toByte() >= 48) && (sW[j2].toByte() <= 57) || (sW[j2] == '-')))
                        j2--
                    s1 = sW.substring(i+1,j2+1)
                    when(c1){
                        '@' -> s3 = sin(s1.toDouble()).toString()
                        '_' -> s3 = cos(s1.toDouble()).toString()
                        '$' -> s3 = tan(s1.toDouble()).toString()
                        '#' -> s3 = (1/tan(s1.toDouble())).toString()
                    }
                    sW = sW.replaceRange(i, j2+1, s3)
                    i = sW.indexOf(c1)
                }
            }

        }

        ar('^')
        ar('@')
        ar('_')
        ar('#')
        ar('$')
        ar('/')
        ar('*')
        ar('-')
        ar('+')
        return sW
    }

    fun br(){
        var sb : String = ""
        var i : Int
        var j : Int

        j = ss.indexOf(')')
        if (j > 0){
            i = j - 1
            while(!(ss[i] == '('))
                i--
            sb = ss.substring(i+1,j)
            ss = ss.replaceRange(i,j+1,solve(sb))
            br()
        }
    }

    fun COUNT(view : View){
        ss = textView2.text.toString()
        textView2.text = ""
        mn()
        br()
        textView2.text = ss
    }

    /*fun mn(view: View){
        //var i : Int =0;
        var n : Int =0
        var d : Double = 0.0
        var c : Char = ' '
        var s1 : String = ""
        var s2 : String = ""
        var ss : String  = textView2.text.toString()
        //ss = '(' +ss + ')'
        for (i in 0..ss.length-1){
            if ((ss[i] == '-') || (ss[i] == '+') || (ss[i] == '/') || (ss[i] == '*')){
                c = ss[i]
                n = i
            }
            //break;
        }
        for (j in 0..n-1){
            s1 = s1 + ss[j]
        }

        for (j in n+1..ss.length-1){
            s2 = s2 + ss[j]
        }
        d = des(s1,s2,c)
        //val str = textView2.text.toString()
        textView2.text = d.toString()

    }

    fun des(s1 : String, s2 : String, c : Char) : Double = when(c){
        '-' -> s1.toDouble()-s2.toDouble()
        '+' -> s1.toDouble()+s2.toDouble()
        '*' -> s1.toDouble()*s2.toDouble()
        '/' -> s1.toDouble()/s2.toDouble()
        else -> 0.0
    }*/
}
