package com.generaltrade.server.repositories

import com.generaltrade.server.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long> {

    fun save (user:User)
    override fun findAll():Set<User>
}