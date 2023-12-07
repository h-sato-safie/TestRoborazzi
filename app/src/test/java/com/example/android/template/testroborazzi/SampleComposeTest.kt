package com.example.android.template.testroborazzi

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.DEFAULT_ROBORAZZI_OUTPUT_DIR_PATH
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(qualifiers = RobolectricDeviceQualifiers.Pixel7Pro)
class SampleComposeTest {

    @get:Rule
    var composeTestRule = createComposeRule()

    @OptIn(ExperimentalRoborazziApi::class)
    private val roborazziOptions = RoborazziOptions(
        compareOptions = RoborazziOptions.CompareOptions(changeThreshold = 0F)
    )

    @Test
    fun testSampleComposeScreenshot() {
        composeTestRule.setContent {
            SampleText()
        }

        val captureFileName = "compose_sample_text"
        composeTestRule.onRoot().captureRoboImage(
            filePath = "$DEFAULT_ROBORAZZI_OUTPUT_DIR_PATH/$captureFileName.png",
            roborazziOptions = roborazziOptions
        )
    }
}
