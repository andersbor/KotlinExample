package dk.easj.anbo.kotlinexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val words = ArrayList<CharSequence>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainSaveWordButton.setOnClickListener {
            var word = mainWordEditText.text;
            words.add(word);
        }

        mainClearWordsButton.setOnClickListener {
            words.clear();
        }

        mainShowWordsButton.setOnClickListener {
            //mainMessageTextView.text = words.toString()
            val intent = Intent(this@MainActivity, ShowWordsActivity::class.java)
            intent.putExtra(WORDS, words)
            startActivity(intent)
        }
    }
}