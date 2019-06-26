package com.generaltrade.server.controllers

import com.generaltrade.server.model.User
import com.generaltrade.server.repositories.UserRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class UserController (private val userRepository: UserRepository){



    @GetMapping("/getUsers")
    @CrossOrigin(origins = ["http://localhost:4200"])
    fun getUsers(): Set<User>{

        return userRepository.findAll()
    }
}