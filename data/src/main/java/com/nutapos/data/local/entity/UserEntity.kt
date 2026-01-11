package com.nutapos.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nutapos.domain.model.User

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String,
    val createdAt: Long = System.currentTimeMillis()
)