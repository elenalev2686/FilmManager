package ru.netology.manager.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void shouldNotAddFilms() {
        FilmManager manager = new FilmManager();
        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilms() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Film I");
        String[] actual = manager.findAll();
        String[] expected = {"Film I"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeFilms() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.findLast();
        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastI() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.addNewFilm("Film V");
        manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastII() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.addNewFilm("Film V");
        manager.addNewFilm("Film VI");
        manager.findLast();
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
