package com.orryfrasetyo.mysimplecleanarchitecture.data

import com.orryfrasetyo.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String)
    = MessageEntity("Hello $name! Welcome to Clean Architecture")
}