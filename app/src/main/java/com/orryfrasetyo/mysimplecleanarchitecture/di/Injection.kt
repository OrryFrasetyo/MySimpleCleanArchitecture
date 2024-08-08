package com.orryfrasetyo.mysimplecleanarchitecture.di

import com.orryfrasetyo.mysimplecleanarchitecture.data.IMessageDataSource
import com.orryfrasetyo.mysimplecleanarchitecture.data.MessageDataSource
import com.orryfrasetyo.mysimplecleanarchitecture.data.MessageRepository
import com.orryfrasetyo.mysimplecleanarchitecture.domain.IMessageRepository
import com.orryfrasetyo.mysimplecleanarchitecture.domain.MessageInteractor
import com.orryfrasetyo.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}









