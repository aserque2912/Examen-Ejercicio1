package com.adrianserranoquero.examenej1

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class videojuego(
    val name: String,
    val price: Double,
    val imageUrl: String
)



@Composable
fun MyVideojuego(List<videojuego> videos: List<videojuego>){
    LazyColumn {
            items(videos.size){
                AsyncImage(
                    videos.imageUrl,
                    modifier = Modifier.fillMaxWidth()
                )
                Text("${videos.name}",
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                )

                Text("${videos.price}",
                    modifier = Modifier
                       .padding(16.dp)
                       .fillMaxWidth()
                )
            }
        }

    }
