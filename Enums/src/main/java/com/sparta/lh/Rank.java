package com.sparta.lh;

public enum Rank {
    NOVICE(0),
    APPRENTICE(10),
    ADEPT(35),
    EXPERT(50),
    MASTER(75),
    LEGENDARY(100);

    private int pointRequirement;

    Rank(int pointRequirement) {
        this.pointRequirement = pointRequirement;
    }

    public int getPointRequirement() {
        return this.pointRequirement;
    }

    public static Rank increaseRank(Rank rank) {
        if (rank == LEGENDARY) {
            return LEGENDARY;
        }

        return values()[rank.ordinal() + 1];
    }

    public boolean isHigher(Rank rank) {
        return this.ordinal() > rank.ordinal();
    }
}
