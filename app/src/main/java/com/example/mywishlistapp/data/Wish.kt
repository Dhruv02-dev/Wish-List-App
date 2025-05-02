package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,

    @ColumnInfo(name = "wish-title")
    val title: String = "",

    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "google", description = "an endroid watch"),
        Wish(title = "Oculus Qyest 2",
            description = "A VR headset for playing games" ),
        Wish(title = "Bean bag", description = "a compy bean bag to subbstitute a chair")
    )
}