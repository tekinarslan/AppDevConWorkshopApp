package com.holidaypirates.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Top
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.holidaypirates.appdevconworkshopap.core.designsystem.R
import com.holidaypirates.designsystem.theme.Typography


@Composable
fun MovieItemView(
    posterPath: String,
    title: String,
    desc: String,
    rating: String
) {
    Box(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Row(
            Modifier
                .padding(all = 4.dp)
                .fillMaxSize()
        ) {
            AsyncImage(
                model = posterPath,
                contentDescription = "contentDescription",
                placeholder = painterResource(R.drawable.ic_broken_image_24),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxHeight()
                    .aspectRatio(0.7f)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop,
            )

            Column(
                verticalArrangement = Top,
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 12.dp)
                    .fillMaxHeight()
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge.copy(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))

                RatingBar(
                    rating = rating,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = desc,
                    modifier = Modifier
                        .padding(vertical = 8.dp),
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis,
                    style = Typography.bodyMedium.copy(
                        color = Color.Black
                    ),
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 0.6.sp
                )
            }
        }
    }
}

@Preview
@Composable
private fun MovieItemPreview() {
    MovieItemView(posterPath = "PosterPath",
        title = "MovieTitle",
        desc = "Movie Description",
        rating = "4.5")
}