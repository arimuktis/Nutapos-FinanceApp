package com.nutapos.data.repository

import com.nutapos.data.local.dao.UserDao
import com.nutapos.data.mapper.toDomain
import com.nutapos.data.mapper.toEntity
import com.nutapos.domain.model.User
import com.nutapos.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    override fun getUserById(id: Int): Flow<User?> {
        return userDao.getUserById(id).map { entity ->
            entity?.toDomain()
        }
    }

    override suspend fun saveUser(user: User) {
        val entity = user.toEntity()
        userDao.insertUser(entity)
    }
}