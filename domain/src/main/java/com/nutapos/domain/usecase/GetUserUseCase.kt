package com.nutapos.domain.usecase

import com.nutapos.domain.model.User
import com.nutapos.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(id: Int): Flow<User?> {
        return repository.getUserById(id)
    }
}