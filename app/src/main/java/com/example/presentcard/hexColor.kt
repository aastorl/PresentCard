package com.example.presentcard

import androidx.compose.ui.graphics.Color

    fun Color.Companion.fromHex(hex: String): Color {
        val colorString = hex.replace("#", "")
        val alpha = if (colorString.length == 8) {
            colorString.substring(0, 2).toInt(16) / 255f
        } else {
            1f
        }
        val red = colorString.substring(colorString.length - 6, colorString.length - 4).toInt(16) / 255f
        val green = colorString.substring(colorString.length - 4, colorString.length - 2).toInt(16) / 255f
        val blue = colorString.substring(colorString.length - 2, colorString.length).toInt(16) / 255f

        return Color(red, green, blue, alpha)
    }
