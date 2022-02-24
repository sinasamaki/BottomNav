package com.sinasamaki.bottomnav

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@ExperimentalAnimationApi
@Composable
fun App() {


    val bottomNavItems = listOf(
        Screen.Home,
        Screen.Create,
        Screen.Profile,
        Screen.Settings,
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNav(
                bottomNavItems
            )
        }
    ) {

    }


}

sealed class Screen(
    val title: String,
    val activeIcon: ImageVector,
    val inactiveIcon: ImageVector
) {
    object Home: Screen("Home", Icons.Filled.Home, Icons.Outlined.Home)
    object Create: Screen("Create", Icons.Filled.Create, Icons.Outlined.Create)
    object Profile: Screen("Profile", Icons.Filled.Person, Icons.Outlined.Person)
    object Settings: Screen("Settings", Icons.Filled.Settings, Icons.Outlined.Settings)
}