package theProblem;

public class Problem {
    private String name;
    private ProblemType type;
    private  boolean isSolved;

    public Problem(String name, ProblemType type){
        this. name = name;
        this.type = type;
        this.isSolved = false;
    }
    public  String getName(){
        return name;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void markSolved(){
        this.isSolved = true;
    }
    @Override
    public String toString(){
        String status = isSolved? "Solved" : "Unsolved";
        return name + "(" + type + ")" + status;
    }
}
