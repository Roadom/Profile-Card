package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.profilecard.ui.theme.ProfileCardTheme
import com.example.profilecard.R
import android.widget.ImageButton
import android.content.Intent
import android.net.Uri

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val facebookButton = findViewById<ImageButton>(R.id.facebook)
        val twitterButton = findViewById<ImageButton>(R.id.twitter)
        val linkedinButton = findViewById<ImageButton>(R.id.linkedin)
        val githubButton = findViewById<ImageButton>(R.id.github)

        facebookButton.setOnClickListener {
            val facebookUrl = "https://www.facebook.com/mondavid.olarte/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
            startActivity(intent)
        }

        twitterButton.setOnClickListener {
            val twitterUrl = "https://twitter.com/ryangosling?lang=en" // I don't have twitter so...
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(twitterUrl))
            startActivity(intent)
        }

        linkedinButton.setOnClickListener {
            val linkedinUrl = "https://www.linkedin.com/in/mon-david-olarte-70a031249/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedinUrl))
            startActivity(intent)
        }

        githubButton.setOnClickListener {
            val githubUrl = "https://github.com/Roadom"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
            startActivity(intent)
        }
    }

    }

