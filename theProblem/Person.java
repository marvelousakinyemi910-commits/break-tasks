package theProblem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Problem> problems;

    public Person(String name){
        this.name = name;
        this.problems = new ArrayList<>();
    }
    public void addProblem(Problem problem){
        problems.add(problem);
    }
    public boolean solveProblem(String problemName){
        for (Problem pro : problems){
            if (pro.getName().equals(problemName)){
                pro.markSolved();
                return true;
            }
        }
        return false;
    }
    public List<Problem> getUnsolvedProblems(){
       List<Problem>  unsolved = new ArrayList<>();
        for (Problem pro : problems){
            if (!pro. isSolved()){
                unsolved.add(pro);
            }
        }
        return unsolved;
    }

    public void recountUnsolvedProblems(){
        List<Problem> unsolved = getUnsolvedProblems();
        if (unsolved.isEmpty()){
            System.out.println(" Yay, No unsolved Problems");
            return;
        }
        for (Problem pro: unsolved){
            System.out.println(pro);
        }
    }
}
