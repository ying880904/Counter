package tw.pu.edu.csim.s1072754.counter
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

var counter:Int = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text=counter.toString()
    }

    fun AddOne(v: View){
        counter++
        txv.text = counter.toString()
    }
}