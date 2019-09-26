package com.aerogramme.HelloWorld;

public interface Hockey extends Sports, Football{
    void homeGoalScored();
    void visitingGoalScored();
    void endOfGame(int period);
    void extraTime(int et);
}
