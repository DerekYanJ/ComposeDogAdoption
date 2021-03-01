package com.example.androiddevchallenge.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.MainViewModel

@Composable
fun MainUi() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("宠物领养")
                },
            )
        },
    ) {
        val viewModel: MainViewModel = viewModel()
        val currentDogBean = viewModel.currentDogBean

        DogList(viewModel.dogList) { dog ->
            if (currentDogBean == null) {
                viewModel.showDogDetail(dog)
            }
        }
        if (currentDogBean != null) {
            DogDetail(currentDogBean)
        }
    }
}