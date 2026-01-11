package com.nutapos.data.mapper

import com.nutapos.data.local.entity.UserEntity
import com.nutapos.domain.model.User


fun UserEntity.toDomain(): User {
    return User(
        id = this.id,
        name = this.name,
        email = this.email
    )
}

fun User.toEntity(): UserEntity {
    return UserEntity(
        id = this.id,
        name = this.name,
        email = this.email
    )
}