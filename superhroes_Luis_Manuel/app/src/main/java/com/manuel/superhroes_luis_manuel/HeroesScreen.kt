package com.manuel.superhroes_luis_manuel

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.manuel.superhroes_luis_manuel.model.Hero


@OptIn(ExperimentalAnimationApi::class)
@Composable

fun HeroesLista(
    heroes: List<Hero>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues()
){
    val visibleState = remember {
        MutableTransitionState(false).apply {
            targetState = true
        }
    }
}

