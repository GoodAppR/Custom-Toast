package good.library.toast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

object MyToast {

    fun showToast(text: String, context: Context) {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View =
            inflater.inflate(R.layout.toast_custom, null, false)
        val toast = Toast(context)
        toast.setGravity(Gravity.BOTTOM, 0, 0)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        view.findViewById<TextView>(R.id.textCustomToast).text = text
        toast.show()
    }

}