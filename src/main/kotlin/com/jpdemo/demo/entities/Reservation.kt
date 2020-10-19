package com.jpdemo.demo.entities

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Reservation(
        @Id
        @GeneratedValue
        var id: Int? = null,
        var name: String,
        var addedAt: LocalDateTime = LocalDateTime.now()
)