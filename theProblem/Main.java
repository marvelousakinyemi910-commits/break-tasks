package theProblem;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Sam");
        Problem problem1 = new Problem("No money", ProblemType.FINANCIAL);
        Problem problem2 = new Problem("SemiColon Stress",ProblemType.EDUCATION);

        person.addProblem(problem1);
        person.addProblem(problem2);

        person.solveProblem("No money");
        person.recountUnsolvedProblems();
    }
}
