/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.bean.Dog

class MainViewModel : ViewModel() {
    var currentDogBean: Dog? by mutableStateOf(null)
    val dogList by mutableStateOf(
        listOf(
            Dog("花花", 1, R.drawable.ic_dog_head_1, "北京市大兴区高米店"),
            Dog("小白", 1, R.drawable.ic_dog_head_2, "北京市朝阳区大悦城"),
            Dog("大黄", 3, R.drawable.ic_dog_head_3, "北京市昌平区沙河"),
            Dog("旺财", 4, R.drawable.ic_dog_head_4, "北京市平谷区"),
            Dog("小牛", 9, R.drawable.ic_dog_head_5, "北京市东城区"),
            Dog("二哈", 2, R.drawable.ic_dog_head_6, "北京市西城区"),
            Dog("公主", 3, R.drawable.ic_dog_head_7, "北京市丰台区"),
            Dog("来福", 7, R.drawable.ic_dog_head_8, "北京市大兴区亦庄"),
            Dog("大白", 6, R.drawable.ic_dog_head_9, "北京市海淀区"),
            Dog("小狮子", 7, R.drawable.ic_dog_head_10, "北京市延庆区"),
        )
    )

    fun closeDogDetail() {
        currentDogBean = null
    }

    fun showDogDetail(dog: Dog) {
        currentDogBean = dog
    }
}
