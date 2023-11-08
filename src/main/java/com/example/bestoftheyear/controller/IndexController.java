package com.example.bestoftheyear.controller;


import com.example.bestoftheyear.model.Movie;
import com.example.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("home")
    public String getName(Model model) {
        String name = "Nicola";
        model.addAttribute("myName", name);
        return "home-page";
    }

    @GetMapping("movies")
    public String movies(Model model) {
        List<Movie> bestMovies = getMovies();
        model.addAttribute("getMovies", bestMovies);
        return "movies";
    }

    @GetMapping("songs")
    public String songs(Model model) {
        List<Song> bestSongs = getSongs();
        model.addAttribute("getSongs", bestSongs);
        return "songs";
    }

    private List<Movie> getMovies() {
        Movie[] bestMovies = {new Movie(1, "Harry Potter e il prigioniero di Azkaban"), new Movie(2, "Goodfellas"), new Movie(3, "Inception"), new Movie(4, "Il castello errante di Howl")};
        return Arrays.asList(bestMovies);
    }

    private List<Song> getSongs() {
        Song[] bestSongs = {new Song(1, "Humble"), new Song(2, "Flashing Lights"), new Song(3, "Take Care"), new Song(4, "Circles")};
        return Arrays.asList(bestSongs);
    }
}
