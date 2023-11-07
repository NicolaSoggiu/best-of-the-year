package com.example.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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
        List<String> bestMovies = getMovies();
        String moviesDelimiter = String.join(", ", bestMovies);
        model.addAttribute("getBestMovies", moviesDelimiter);
        return "movies";
    }

    @GetMapping("songs")
    public String songs(Model model) {
        List<String> bestSongs = getSongs();
        String songsDelimiter = String.join(",", bestSongs);
        model.addAttribute("getBestSongs", songsDelimiter);
        return "songs";
    }

    private List<String> getMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("Film 1");
        movies.add("Film 2");
        movies.add("Film 3");
        movies.add("Film 4");
        return movies;
    }

    private List<String> getSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("Canzone 1");
        songs.add("Canzone 2");
        songs.add("Canzone 3");
        songs.add("Canzone 4");
        return songs;
    }
}
