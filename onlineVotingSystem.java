import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class onlineVotingSystem{
    private static Map<String,Integer>candidates = new HashMap<>();
    private static Map<String ,Boolean> voters = new HashMap<>();
    
    public static void main(String args[]){
        initializeCandidates();

        Scanner sc = new Scanner (System.in);

        while (true){
            System.out.println("Welcome To Online Voting System:");
            System.out.println("1. View Candidates");
            System.out.println("2. Vote for a Candidate");
            System.out.println("3.Exit");
            System.out.println("Enter Your Choice(1-3):");

            int choice = sc.nextInt();
            sc.nextLine();  //consume new line 

            switch (choice){
                case 1:
                    displayCandidates();
                    break;
                case 2:
                    voteForCandidate(sc);
                    break;
                case 3:
                    System.out.println("Thank you for using Online Voting System.");
                    System.exit(0);
                    sc.close();
                default :
                System.out.println("Invalid Choice.Please select a valid option.");


            }

        }
    }

    private static void initializeCandidates(){
        candidates.put("Candidate 1",0);
        candidates.put("Candidate 2",0);
        candidates.put("Candidate 3",0);
        candidates.put("Candidate 4",0);
        //add more candidates as you need.

    }

    private static void displayCandidates(){
    System.out.println("List of Candidates:");
    for(String candidate :candidates.keySet()){
        System.out.println(candidate);
    
    }
    }

    private static void voteForCandidate(Scanner sc){
        System.out.println("Enter the name of candidat for voting :");
        String candidateName = sc.nextLine();

        if(!candidates.containsKey(candidateName)){
            System.out.println("Invalid candidate name.");
        }else if (voters.containsKey(candidateName)){
            System.out.println("You have already voted for this candidate.");
        }else{
            candidates.put(candidateName,candidates.get(candidateName) + 1);
            voters.put(candidateName,true);
            System.out.println("Thank you for Voting!.");
        }
    }
}