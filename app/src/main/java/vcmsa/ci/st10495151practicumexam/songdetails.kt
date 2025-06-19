package vcmsa.ci.st10495151practicumexam

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Comment

class songdetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_songdetails)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Get references to the views
        val returnBtn = findViewById<TextView>(R.id.returnBtn)
        val displaybtn = findViewById<Button>(R.id.displaybtn)
        val AverageBtn = findViewById<Button>(R.id.AverageBtn)
        val menuBtn = findViewById<Button>(R.id.menuBtn)

        val songTitle = intent.getStringExtra("songTitle")
        val artist = intent.getStringExtra("artistName")
        val total = intent.getStringExtra("totalRating")
        val comment = intent.getStringExtra("comment")
        fun displaySongDetails() {
        }
        displaybtn.setOnClickListener {
        // Set the text of the views to the corresponding values
            if (songTitle != null && artist != null && total != null && comment != null) {
                returnBtn.text =
                    "$songTitle: Artist: $artist: Total Rating: $total: Comment: $comment"
                

                }
            }
            menuBtn.setOnClickListener {
                finish()
            }
        }
    }






