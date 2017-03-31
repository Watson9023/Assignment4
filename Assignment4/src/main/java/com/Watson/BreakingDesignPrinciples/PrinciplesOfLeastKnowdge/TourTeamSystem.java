package com.Watson.BreakingDesignPrinciples.PrinciplesOfLeastKnowdge;
import java.util.List;
/**
 * Created by Long on 3/30/2017.
 */
public class TourTeamSystem {
    List<TourTeam> team;
    TourTeam tt = new TourTeam();

    public void addTours(com.Watson.ObeyingDesignPrinciples.PrincipleOfLeastKnowledge.Tours t)
    {
        tt.addTours(t);
    }

    public void replaceGuide(String name)
    {
        tt.setTourTeam(name);
    }
}
