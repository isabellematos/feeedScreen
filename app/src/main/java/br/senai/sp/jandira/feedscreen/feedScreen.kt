package br.senai.sp.jandira.feedscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.node.modifierElementOf
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun feedScreen() {

    //CONTENT
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier

                .height(100.dp),
        ) {
            //HEADER
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(70.dp)
                    .background(Color(79, 254, 199)),
            )
            {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(start = 350.dp, top = 10.dp)

                ) {
                    Icon(
                        imageVector = Icons.Outlined.Settings,
                        contentDescription = "",
                        tint = Color.DarkGray
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.mansmiling),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 20.dp)
                    .size(70.dp)
                    .border(
                        2.dp,
                        color = Color(79, 121, 254),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clip(shape = RoundedCornerShape(8.dp))
                    .align(Alignment.BottomStart)

            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .size(300.dp, 35.dp),
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(25.dp)
            ) {
                Text(
                    text = "Faça uma publicação",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.CameraAlt,
                        modifier = Modifier.size(30.dp),
                        contentDescription = ""
                    )
                }
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Videocam,
                        modifier = Modifier.size(35.dp),
                        contentDescription = ""
                    )
                }
            }
            Text(
                text = "───────────────────────────",
                color = Color.Gray
            )
        }




    }
}






