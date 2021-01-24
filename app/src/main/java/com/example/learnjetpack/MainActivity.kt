package com.example.learnjetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumn(modifier = Modifier
                    .background(color = Color(0xFFF2F2F2))
                    .fillMaxSize()
            ) {
                Image(
                        bitmap = imageFromResource(
                                res = resources,
                                resId = R.drawable.product1
                        ),
                        modifier = Modifier
                                .height(300.dp)
                                .fillMaxWidth(),
                        contentScale = ContentScale.Fit,
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                                text = "Name: Product-1",
                                style = TextStyle(
                                        fontSize = TextUnit.Companion.Sp(21),
                                        fontWeight = FontWeight.Bold,
                                )
                        )
                        Text(
                                text = "Price: 100$",
                                style = TextStyle(
                                        fontSize = TextUnit.Companion.Sp(17),
                                        color = Color.Gray,
                                ),
                                modifier = Modifier.align(alignment = Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                            text = "Colors: Red - Blue",
                            style = TextStyle(
                                    fontSize = TextUnit.Companion.Sp(17),
                            )
                    )
                    Spacer(modifier = Modifier.padding(top = 16.dp))
                    Button(
                            onClick = { },
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                                text = "Add To Cart",
                                style = TextStyle(color = Color.White)
                        )
                    }
                }
            }
        }
    }
}