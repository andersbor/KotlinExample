package dk.easj.anbo.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_words.*


val WORDS = "WORDS"
class ShowWordsActivity : AppCompatActivity() {
    private var words = ArrayList<CharSequence>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_words)

        words = intent.getCharSequenceArrayListExtra(WORDS)

        showWordsTextView.text = words.toString()
    }
}
