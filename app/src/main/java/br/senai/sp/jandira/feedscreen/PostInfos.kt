package br.senai.sp.jandira.feedscreen

import android.net.Uri
import androidx.compose.ui.graphics.painter.Painter

data class PostInfos(

    val name: String,
    val date: String,
    val postText: String,
    val likeCount: Int,
    val commentCount: Int,
    val comment: String,
    val postPhoto: Painter,
    val postVideo: Uri?,
    val verified: Boolean
)
