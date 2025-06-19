package vcmsa.ci.st10495151practicumexam

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Get references to the EditText fields
        val songTitleEditText = findViewById<EditText>(R.id.songTitle)
        val artistNameEditText = findViewById<EditText>(R.id.artistName)
        val totalRatingEditText = findViewById<EditText>(R.id.totalRating)
        val commentEditText = findViewById<EditText>(R.id.Comment)
        val addButton = findViewById<Button>(R.id.Addbtn)
        val nextButton = findViewById<Button>(R.id.Nxtbtn)
        val exitButton = findViewById<Button>(R.id.extBtn)

        // Get the values from the EditText fields
        addButton.setOnClickListener {
            (makeText(this, "Song Added", Toast.LENGTH_SHORT)).show()
            // Get the values from the EditText fields
    val songTitle = songTitleEditText.text.toString()
    val artistName = artistNameEditText.text.toString()
    val totalRating = totalRatingEditText.text.toString()
    val comment = commentEditText.text.toString()
        }
        nextButton.setOnClickListener {
            val intent = Intent(this, songdetails::class.java)
            intent.putExtra("songTitle", songTitleEditText.text.toString())
            intent.putExtra("artistName", artistNameEditText.text.toString())
            intent.putExtra("totalRating", totalRatingEditText.text.toString())
            intent.putExtra("comment", commentEditText.text.toString())
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            finish()
        }
    }
}

