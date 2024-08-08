package com.orryfrasetyo.mysimplecleanarchitecture.data

import com.orryfrasetyo.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}