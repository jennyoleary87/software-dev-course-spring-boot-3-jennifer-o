package com.example.springBoot2.controllers;

import com.example.springBoot2.models.Album;
import com.example.springBoot2.repositories.AlbumRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    private final AlbumRepository albumRepository;
    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
//    private final List<Album> albums = List.of(
//        new Album("The Dark Side of the Moon", "Pink Floyd", 1973, 10),
//        new Album("Back in Black", "AC/DC", 1980, 10),
//        new Album("The Bodyguard", "Whitney Houston", 1992, 10)
//    );
//
//    @GetMapping
//    public List<Album> getAlbums() {
//        return albums;
//    }
}
