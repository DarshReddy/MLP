package com.project.mlp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.awt.Dimension

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MLP",
    ) {
        window.minimumSize = Dimension(640, 480)
        App()
    }
}