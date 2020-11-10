import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FiniteAutomata finiteAutomata = new FiniteAutomata("C:\\Users\\iulia\\Desktop\\Anul III\\FLCT\\Lab4\\FA.in");
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("1 - Show the set of states.\n2 - Show the alphabet.\n3 - Show the transitions.\n4 - Show the initial state.\n5 - Show the set of final states.\n6 - Check if a string is accepted.\n0 - Stop.");
            int s = in.nextInt();
            if(s==0)
                break;
            else if(s==1)
                System.out.println(finiteAutomata.getStates());
            else if(s==2)
                System.out.println(finiteAutomata.getAlphabet());
            else if(s==3)
                System.out.println(finiteAutomata.getTransitions());
            else if(s==4)
                System.out.println(finiteAutomata.getInitialState());
            else if(s==5)
                System.out.println(finiteAutomata.getFinalStates());
            else if(s==6)
            {
                System.out.println("Insert string: ");
                String string = in.next();
                if(finiteAutomata.isDFA()) {
                    System.out.println(finiteAutomata.isAccepted(string));
                }
                else System.out.println("This FA is not a DFA.");
                System.out.println("\n");
            }
            else System.out.println("Invalid command");
        }

    }
}
