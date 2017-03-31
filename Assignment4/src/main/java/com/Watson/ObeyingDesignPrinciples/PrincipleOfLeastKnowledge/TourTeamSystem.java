package com.Watson.ObeyingDesignPrinciples.PrincipleOfLeastKnowledge;

import com.Watson.BreakingDesignPrinciples.PrinciplesOfLeastKnowdge.TourTeam;
import java.util.List;


/**
 * Created by Long on 3/31/2017.
 */
public class TourTeamSystem {
    List<TourTeam> team;
    TourTeam tt = new TourTeam();

    public void addTours(Tours t)
    {
        tt.addTours(t);
    }

    public void removeTours(Tours t)
    {
        tt.removeTours(t);
    }

    public void replaceTeam(String name)
    {
        tt.setTourTeam(name);
    }

    public void changeDestination(String newDestination)
    {
        tt.setDestination(newDestination);
    }
}
