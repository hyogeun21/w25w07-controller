package kr.ac.kumoh.s20210524.w25w07_controller.controller

import kr.ac.kumoh.s20210524.w25w07_controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(private val service: SongService) {
    @GetMapping("/songs")
    fun getSongList() = service.getAllSongs()
}