package com.sparta.lh;

public class Skill {
    private String name;
    private int points;
    private Rank rank;

    public Skill(String name) {
        this.name = name;
        this.points = 0;
        this.rank = Rank.NOVICE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void increaseRank() {
        this.rank = Rank.increaseRank(this.rank);
    }

    @Override
    public String toString() {
        return "You are " + this.rank + " with the " + this.name;
    }
}
