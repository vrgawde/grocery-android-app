package com.example.grocery.onboarding.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.grocery.R

@Composable
fun GetStartedScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.on_board),
            contentDescription = "",
            modifier = Modifier.matchParentSize()
        )

        ConstraintLayout(
            modifier = Modifier.align(Alignment.BottomCenter),
        ) {
            val (ivCarrot, tvWelcome, tvOurStore, tvDescription, btnGetStarted) = createRefs()

            Image(
                painter = painterResource(R.drawable.carrot),
                contentDescription = "",
                modifier = Modifier.constrainAs(ivCarrot) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            Text(
                text = "Welcome",
                fontSize = 48.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 36.dp)
                    .constrainAs(tvWelcome) {
                        top.linkTo(ivCarrot.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }

            )

            Text(
                text = "to our store",
                fontSize = 48.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 5.dp)
                    .constrainAs(tvOurStore) {
                        top.linkTo(tvWelcome.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }

            )

            Text(
                text = "Get your groceries in as fast as one hour",
                fontSize = 16.sp,
                color = Color(0x46FCFCFC),
                modifier = Modifier
                    .padding(top = 5.dp)
                    .constrainAs(tvDescription) {
                        top.linkTo(tvOurStore.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 42.dp, bottom = 90.dp, start = 25.dp, end = 25.dp)
                    .height(67.dp)
                    .constrainAs(btnGetStarted) {
                        top.linkTo(tvDescription.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    },
                onClick = {

                }
            ) {
                Text(
                    text= "Get Started".uppercase(),
                    fontSize = 18.sp
                )
            }
        }
    }
}


@Preview
@Composable
fun GetStartedScreenPreview() {
    GetStartedScreen()
}