package good.library.toast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonShowToast = findViewById<Button>(R.id.buttonShowToast)
        buttonShowToast.setOnClickListener {
            showToast("Test Toast")
        }
        
    }

    fun showToast(text: String) {
        val inflater: LayoutInflater = layoutInflater
        val view: View =
            inflater.inflate(R.layout.toast_custom, findViewById(R.id.containerToast))
        val toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM, 0, 0)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        view.findViewById<TextView>(R.id.textCustomToast).text = text
        toast.show()
    }
}