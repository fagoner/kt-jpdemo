package com.jpdemo.demo

import com.jpdemo.demo.entities.Reservation
import com.jpdemo.demo.repositories.ReservationRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class DemoTests {

    @Autowired
    lateinit var reservationRepository: ReservationRepository

    @Test
    fun `Insert some values should return notEmpty`() {
        reservationRepository.save(Reservation(name = "Fly to Tokyo"))
        val result = reservationRepository.findAll()
        assert(result.isNotEmpty())
    }

}