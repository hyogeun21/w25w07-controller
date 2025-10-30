package kr.ac.kumoh.s20210524.w25w07_controller.service

import kr.ac.kumoh.s20210524.w25w07_controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(private val repository: SongRepository) {
    fun getAllSongs() = repository.findAll()
}