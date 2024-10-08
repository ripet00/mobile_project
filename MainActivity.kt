package com.example.tugasmobile

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasmobile.ui.theme.TugasmobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasmobileTheme {
                var nama by remember {
                    mutableStateOf("")
                }
                var password by rememberSaveable {
                    mutableStateOf("")
                }
                Image(
                    painter = painterResource(id = R.drawable.group_82__1_),
                    contentDescription = "Atasan"
                )
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Silahkan Masuk",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Masukkan akun yang pernah kamu daftar!",
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(35.dp))

                    //TextField utk Email
                    OutlinedTextField(
                        modifier = Modifier
                            .width(245.dp),
                        value = nama,
                        onValueChange = { text -> nama = text },
                        label = { Text("Masukkan Email", fontSize = 15.sp) }
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    //TextField utk Password
                    OutlinedTextField(
                        modifier = Modifier
                            .width(245.dp),
                        value = password,
                        onValueChange = { text -> password = text },
                        visualTransformation = PasswordVisualTransformation(),
                        label = { Text("Masukkan Kata Sandi", fontSize = 15.sp) }
                    )
                    Spacer(modifier = Modifier.height(80.dp))
                    Button(onClick ={},
                        modifier = Modifier.width(245.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = "#79b791".color
                        )
                        ) {
                        Text(text = "Masuk")

                    }
                    Row {
                        Text("Belum buat akun?", fontSize = 15.sp)
                        Spacer(modifier = Modifier.width(5.dp))
                        ClickableText(
                            text = AnnotatedString(text = "Daftar"),
                            style = TextStyle(
                                color = "#79b791".color,
                                fontSize = 15.sp,
                                textAlign = TextAlign.Center
                            ),
                            onClick = {
                            }

                        )
                    }

                }

                }
            }
        }
    }

@Preview
@Composable
fun SimpleComposable() {
    Row {
        Text("Belum buat akun?", fontSize = 15.sp)
        Spacer(modifier = Modifier.width(5.dp))
        ClickableText(
            text = AnnotatedString(text = "Daftar"),
            style = TextStyle(
                color = "#79b791".color,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            ),
            onClick = {
            }

        )
    }}

val String.color
    get() = Color(parseColor(this))

//Text(
//modifier = Modifier
//.clickable(enabled = enabled) {  },
//text = "Daftar",
//color = "#79b791".color,
//fontWeight = FontWeight.SemiBold,
//fontSize = 12.sp
//)
