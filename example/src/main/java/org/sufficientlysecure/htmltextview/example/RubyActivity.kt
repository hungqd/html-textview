package org.sufficientlysecure.htmltextview.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.sufficientlysecure.htmltextview.HtmlTextView

class RubyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruby)
        val textView = findViewById<HtmlTextView>(R.id.tv_ruby)
        textView.setHtml(R.raw.ruby)
    }
}