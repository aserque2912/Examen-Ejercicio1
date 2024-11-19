package com.adrianserranoquero.examenej1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adrianserranoquero.examenej1.ui.theme.ExamenEj1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEj1Theme {
                MyVideojuego();
            }
        }
    }
}

data class videojuego(
    val name: String,
    val price: Double,
    val imageUrl: String
)


@Composable
fun MyVideojuego(List<videojuego> videos: List<videojuego>) {
        LazyColumn {
            items(videos.size) {
                AsyncImage(
                    videos.imageUrl,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    "${videos.name}",
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                )

                Text(
                    "${videos.price}",
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                )
            }
        }

    }
