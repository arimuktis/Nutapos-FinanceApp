package com.nutapos.domain.repository

import com.nutapos.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getUserById(id: Int): Flow<User?>
    suspend fun saveUser(user: User)
}