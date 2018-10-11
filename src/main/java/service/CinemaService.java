package service;

import DAO.CinemaDAO;
import entity.Cinema;

public class CinemaService {

    private CinemaDAO cinemaDAO = new CinemaDAO ();

    public void addCinema(Cinema cinema) {
        cinemaDAO.create (cinema);
    }
}
