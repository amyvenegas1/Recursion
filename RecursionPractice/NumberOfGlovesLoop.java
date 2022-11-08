package RecursionPractice;

public class NumberOfGlovesLoop {
    public int numberOfGlovesLoop(int peopleOfPlanetU101InARoom){
        int gloves = 0;
        while(peopleOfPlanetU101InARoom != 0){
            gloves = gloves + 3;
            peopleOfPlanetU101InARoom--;
        }
        return gloves;
    }
}
