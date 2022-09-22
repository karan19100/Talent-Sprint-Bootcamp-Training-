package com.npci.training.oop.CricketScore;

public class Bowler {
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public Bowler() {

    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getBalls_bowled() {
        return balls_bowled;
    }

    public void setBalls_bowled(int balls_bowled) {
        this.balls_bowled = balls_bowled;
    }

    public int getRuns_conceded() {
        return runs_conceded;
    }

    public void setRuns_conceded(int runs_conceded) {
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {

        if(wickets < 0 || matches < 0 || balls_bowled < 0 ||runs_conceded < 0)
            System.out.println("Error");

        else if((runs_conceded>0 || balls_bowled >0) && matches==0)
            System.out.println("Error");

        else {
            System.out.println("Name:"+name);
            System.out.println("bowling_avg="+runs_conceded/wickets);
        }
    }

    public void showStatistics() {
        if(wickets < 0 || matches < 0 || balls_bowled < 0 ||runs_conceded < 0) System.out.println("Error");

        else if((runs_conceded>0 || balls_bowled >0) && matches==0) System.out.println("Error");

        else {
            System.out.println("Name="+name);
            System.out.println("wickets="+wickets);
            System.out.println("matches="+matches);
            System.out.println("balls_bowled="+balls_bowled);
            System.out.println("runs_conceded="+runs_conceded);
        }
    }

    public void computeStrikeRate() {
        if(wickets < 0 || matches < 0 || balls_bowled < 0 ||runs_conceded < 0) System.out.println("Error");

        else if((runs_conceded>0 || balls_bowled >0) && matches==0) System.out.println("Error");

        else {
            System.out.println("Name:"+name);
            System.out.println("Strike_rate="+(float)runs_conceded/balls_bowled);
        }
    }

    public static void main(String args[]) {

        Bowler bowler = new Bowler("Sachin",10,5,750,463);

        bowler.computeBowlingAverage();
        System.out.println();

        bowler.showStatistics();
        System.out.println();

        bowler.computeStrikeRate();

    }
}
