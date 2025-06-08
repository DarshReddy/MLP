package com.project.mlp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.ui.graphics.vector.ImageVector

object Graph {
    const val NAVIGATION_BAR_SCREEN_GRAPH = "navigationBarScreenGraph"
}

data class NavigationItem(
    val unSelectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val title: String,
    val route: String
)


sealed class Routes(var route: String) {
    data object Analyse : Routes("analyse")
    data object Tasks : Routes("tasks")
    data object Account : Routes("account")
}

val navigationItemsLists = listOf(
    NavigationItem(
        unSelectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        title = "Analyse",
        route = Routes.Analyse.route,
    ),
    NavigationItem(
        unSelectedIcon = Icons.Outlined.Search,
        selectedIcon = Icons.Filled.Search,
        title = "Tasks",
        route = Routes.Tasks.route,
    ),
    NavigationItem(
        unSelectedIcon = Icons.Outlined.AccountCircle,
        selectedIcon = Icons.Filled.AccountCircle,
        title = "Account",
        route = Routes.Account.route,
    ),
)