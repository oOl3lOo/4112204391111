package com.example.a4112204391111

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a4112204391111.ui.theme._4112204391111Theme

import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.remember

import androidx.compose.runtime.setValue

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.background

import androidx.compose.ui.graphics.Color

import androidx.compose.ui.input.pointer.pointerInput

import androidx.compose.foundation.Image

import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                PointerEvents()
                }
            }
        }



@Composable

fun PointerEvents() {

    var msg by remember { mutableStateOf("作者：劉祐顯") }

    Column {

        Text("\n" + msg)

        Box(

            Modifier

                .fillMaxSize()

                .background(Color.Gray)

                .pointerInput(Unit) {

                    awaitPointerEventScope {

                        while (true) {

                            val event = awaitPointerEvent()

                            msg = "${event.type}, ${event.changes.first().position}"

                        }

                    }

                }

        )

    }

}
@Composable

fun Tap() {

    var msg by remember { mutableStateOf("TAP相關手勢實例") }

    Column {

        Text("\n" + msg)

        Image(

            painter = painterResource(id = R.drawable.pu0),

            contentDescription = "靜宜之美",

            modifier = Modifier

                .fillMaxSize()

        )

    }

}