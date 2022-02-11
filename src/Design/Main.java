package Design;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Taking snake input
        int totalSnakes = sc.nextInt();
        for(int i=0;i<totalSnakes;i++){
            int headPoint = sc.nextInt();
            int tailPoint = sc.nextInt();
            Board.board.put(headPoint,tailPoint);
        }

//        Taking ladders input
        int totalLadders = sc.nextInt();
        for(int i=0;i<totalLadders;i++){
            int startPoint = sc.nextInt();
            int endPoint = sc.nextInt();
            Board.board.put(startPoint,endPoint);
        }
//        Taking number of players
        int players = sc.nextInt();
        User[] users = new User[players];
        for(int i=0;i<players;i++) {
            String name = sc.next();
            User user = new User(name, 0);
            users[i] = user;
        }

        Board.play(users,players);

    }
}
