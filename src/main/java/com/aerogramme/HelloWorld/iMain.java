package com.aerogramme.HelloWorld;

public abstract class iMain implements Hockey {

    public static void main(String[] args) {

        iMain mn = new iMain() {
            public void homeGoalScored() {
                System.out.println("I am in home goals scored");
            }

            public void visitingGoalScored() {
                System.out.println("I am in visiting goals scored");
            }

            public void endOfGame(int period) {
                System.out.println("Game ended at :" + period);
            }

            public void extraTime(int et) {
                System.out.println("extra time was :" + et);
            }

            public void homeTeamScored(int goals) {
                System.out.println("home team scored :" + goals);
            }

            public void visitingTeamScored(int goals) {
                System.out.println("visiting team scored :" + goals);
            }

            public void endOfHalfTime(int half) {
                System.out.println("end of half time was :" + half);
            }

            public void setHomeTeam(String name) {
                System.out.println("Name of home team :" + name);
            }

            public void setVisitingTeam(String name) {
                System.out.println("Name of visiting team :" + name);

            }
        };

        mn.setHomeTeam("Liverpool");
        mn.setVisitingTeam("Barca");

        mn.homeTeamScored(100);
        mn.visitingTeamScored(200);
        mn.endOfGame(50);

    }
}
