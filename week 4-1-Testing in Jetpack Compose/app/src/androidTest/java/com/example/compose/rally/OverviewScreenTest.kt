package com.example.compose.rally

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.compose.rally.ui.overview.OverviewBody
import org.junit.Rule
import org.junit.Test

class OverviewScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun overviewScreen_alertDisplay() {
        composeTestRule.setContent {
            OverviewBody()
        }

        composeTestRule.onNodeWithText("Alerts")
            .assertExists()
    }

}