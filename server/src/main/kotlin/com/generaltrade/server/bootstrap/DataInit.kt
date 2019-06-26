package com.generaltrade.server.bootstrap

import com.generaltrade.server.model.User
import com.generaltrade.server.repositories.UserRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class DataInit (private val userRepository: UserRepository) : ApplicationListener<ContextRefreshedEvent> {


    override fun onApplicationEvent(event: ContextRefreshedEvent) {

        val user1 = User(1, "John", 123)
        val user2 = User(2, "Ben", 12)
        val user3 = User(3, "Sam", 21)

        userRepository.save(user1)
        userRepository.save(user2)
        userRepository.save(user3)
    }


}