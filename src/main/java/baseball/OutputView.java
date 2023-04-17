package baseball;

public class OutputView {

    public static void gameStartMsg() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void requestInputMsg() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void endGameMsg() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printBallAndStrike(int ball, int strike) {
        System.out.println(ball + "볼 " + strike + "스트라이크");
    }

    public static void printNothingMsg() {
        System.out.println("낫싱");
    }

    public static void printBall(int ball) {
        System.out.println(ball + "볼");
    }

    public static void printStrike(int strike) {
        System.out.println(strike + "스트라이크");
    }
}