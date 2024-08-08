package com.orryfrasetyo.mysimplecleanarchitecture.data

import com.orryfrasetyo.mysimplecleanarchitecture.domain.IMessageRepository
import com.orryfrasetyo.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(
    private val messageDataSource: IMessageDataSource
) : IMessageRepository{
    override fun getWelcomeMessage(name: String)
    = messageDataSource.getMessageFromSource(name)
}