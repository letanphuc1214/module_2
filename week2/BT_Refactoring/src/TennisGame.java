public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";

    public static String getScore(String player1Name, String player2Name, int ScorePlayer1, int scorePlayer2) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (ScorePlayer1 == scorePlayer2) {
            switch (ScorePlayer1) {
                case 0:
                    score = new StringBuilder(LOVE_ALL);
                    break;
                case 1:
                    score = new StringBuilder(FIFTEEN_ALL);
                    break;
                case 2:
                    score = new StringBuilder(THIRTY_ALL);
                    break;
                case 3:
                    score = new StringBuilder(FORTY_ALL);
                    break;
                default:
                    score = new StringBuilder(DEUCE);
                    break;

            }
        } else if (ScorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = ScorePlayer1 - scorePlayer2;
            if (minusResult == 1) score = new StringBuilder(ADVANTAGE_PLAYER_1);
            else if (minusResult == -1) score = new StringBuilder(ADVANTAGE_PLAYER_2);
            else if (minusResult >= 2) score = new StringBuilder(WIN_FOR_PLAYER_1);
            else score = new StringBuilder(WIN_FOR_PLAYER_2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = ScorePlayer1;
                else {
                    score.append("-");
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}