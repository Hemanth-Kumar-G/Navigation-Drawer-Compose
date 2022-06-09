package com.hemanth.navigationDrawerCompose

import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id: Int,
    val title: String,
    val contentDescription: String,
    val icon: ImageVector
)

const val MENU_HOME = 0
const val MENU_SETTING = 1