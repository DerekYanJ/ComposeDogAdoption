package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun DogList(dogList: List<Dog>, onClick: (Dog) -> Unit = {}) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(dogList) { dog ->
            DogCard(
                dog,
                onClick
            )
        }
    }
}

@Composable
fun DogCard(dog: Dog, onClick: (Dog) -> Unit = {}) {
//    val dog = Dog("狗狗", 3, R.drawable.abc_ic_ab_back_material, "北京")
    Column(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .fillMaxWidth()
            .clickable { onClick.invoke(dog) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .clip(RoundedCornerShape(4.dp))
        ) {
            Image(
                painterResource(id = dog.picRes),
                "dogImg",
                Modifier
                    .size(80.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.height(80.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(text = dog.name)
                Text(text = "${dog.age}岁")
                Text(text = dog.address)
            }
        }
    }

}