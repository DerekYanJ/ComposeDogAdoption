package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.bean.Dog

@Composable
fun DogDetail(dog: Dog) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painterResource(dog.picRes),
            "dogPic",
            Modifier
                .aspectRatio(1f)
                .padding(10.dp)
                .clip(RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )

        Column(
            Modifier.padding(16.dp, 8.dp)
        ) {
            Text("名字: ${dog.name}", style = MaterialTheme.typography.h4)
            ProvideTextStyle(MaterialTheme.typography.h5) {
                Text(text = "年龄：${dog.age}岁")
                Text(text = "地址：${dog.address}")
            }
        }
    }
}

