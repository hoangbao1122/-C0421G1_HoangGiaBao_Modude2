package _08_clear_code.baitap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1, int player2) {
        String score = "";
        int initialPoint= 0;
        if (player1==player2)
        {
            switch (player1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;


            }
        }
        else if (player1>=4 || player2>=4)
        {
            int minusResult = player1-player2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1){
                    initialPoint = player1;
                }
                else {
                    score += "-";
                    initialPoint = player2;
                }
                switch(initialPoint)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}