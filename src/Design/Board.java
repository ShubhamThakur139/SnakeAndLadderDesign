package Design;

import java.util.HashMap;
import java.util.Map;

public class Board {
    static Map<Integer,Integer> board = new HashMap<>();

    public static void play(User[] users,int players){
        while(true){
            int count = 0; //ram sham raj pal
            for(User user:users){
                if(user.isWin()) {
                    count++;
                    if(count==players-1){
                        return;
                    }
                    continue;
                }
                int prev_pos = user.getCurrent_position();
                int move = DiceRoll.diceRoll();
                int updatedPos = prev_pos+move;
                if(updatedPos>100) continue;
                user.setCurrent_position(updatedPos);
                while(Board.board.containsKey(user.getCurrent_position())){
                    int endPoint = Board.board.get(updatedPos);
                    user.setCurrent_position(endPoint);
                }
                System.out.println(user.getName() + " rolled a " + move + " and moved from " + prev_pos + " to " + user.getCurrent_position());
                if(user.isWin()){
                    System.out.println(user.getName() + " wins the game");
                }
            }
        }
    }

}
