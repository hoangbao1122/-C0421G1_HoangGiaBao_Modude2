package _08_clear_code.baitap;

public class TennisGame {

    public static void getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int initialPoint = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
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

    }
    public static String getScoreWhenIsByPoint(int player1Score) {
        String score;
        switch (player1Score)
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
        return score;
    }
    public static int getMinusResult(int player1Score, int player2Score){
        return player1Score - player2Score;
    }
    public static void getScoreWhenMoreThan4(int player1Score, int player2Score) {
        String score;
        int minusResult = getMinusResult(player1Score, player2Score);
//        if (minusResult==1) score ="Advantage player1";
//        else if (minusResult ==-1) {
//            score ="Advantage player2";
//        }
//        else if (minusResult>=2) {
//            score = "Win for player1";
//        }
//        else {
//            score ="Win for player2";
//        }
//        return score;
        if (minusResult >=2){
            score = "Win for player 1";
        }
        switch (minusResult){
            case 1:{
                score =  "Advantage player2";
            }
            case 2:{
                score = "Advantage player2";
            }
            default:{
                score ="Win for player2";
            }
        }
    }

}