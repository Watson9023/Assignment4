package com.Watson.BreakingDesignPrinciples.PrinciplesOfLeastKnowdge;

import com.Watson.ObeyingDesignPrinciples.PrincipleOfLeastKnowledge.Tours;
import java.util.List;

/**
 * Created by Long on 3/30/2017.
 */
public class TourTeam {

    private List<Tours> team;
    private String destination;
    private String tourTeam;

    public List<Tours> getTeam() {
        return team;
    }

    public void setTeam(List<Tours> team) {
        this.team = team;
    }

    public void addTours(Tours t)
    {
        team.add(t);
    }

    public void removeTours(Tours t)
    {
        team.remove(t);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTourTeam() {
        return tourTeam;
    }

    public void setTourTeam(String tourTeam) {
        this.tourTeam = tourTeam;
    }
    }