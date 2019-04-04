package br.com.fiap.minhabiblioteca

import android.app.Activity
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*

class CustomToast {

    companion object {

        fun showToast(activity: Activity, mensagem: String) {
            val inflater = activity.layoutInflater

            val customToastroot = inflater.inflate(R.layout.custom_toast, null)

            val customtoast = Toast(activity)

            customToastroot.textView1.text = mensagem

            customtoast.view = customToastroot
            customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
            customtoast.duration = Toast.LENGTH_LONG
            customtoast.show()
        }

    }
}
