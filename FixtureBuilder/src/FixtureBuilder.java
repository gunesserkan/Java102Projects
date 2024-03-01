import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixtureBuilder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] teams = {"Galatasaray", "Bursaspor", "Fenerbahçe", "Başakşehir", "Trabzonspor", "Beşiktaş","Eskişehirspor"};
        ArrayList<String> teamList = new ArrayList<>();
        System.out.println("Turnuvada kaç takım olacak?");
        int teamCount=input.nextInt();
        for (int i=0;i<teamCount;i++){
//            System.out.print("Takım adı girin: ");
//            teamList.add(input.nextLine());
            teamList.add(teams[i]);
        }
        if (teamList.size() % 2 != 0) {
            teamList.add("Bay");
        }

        int rounds = (teamList.size() - 1) * 2;
        int matchesPerRound = teamList.size() / 2;

        for (int round = 1; round <= rounds; round++) {
            System.out.println("Round " + round + "\n");
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (teamList.size() - 1);
                int away = (teamList.size() - 1 - match + round) % (teamList.size() - 1);

                if (match == 0) {
                    away = teamList.size() - 1;
                }
                System.out.println(teamList.get(home) + " vs " + teamList.get(away) + "\n");
            }
        }
    }
}

