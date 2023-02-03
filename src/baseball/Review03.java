package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 野球チーム
        BaseBallTeam Yakult  = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam DeNA = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam Tigers  = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam Giants = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam Carp = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam Dragons = new BaseBallTeam("中日ドラゴンズ",66,75,2);

        Yakult.report();
        DeNA.report();
        Tigers.report();
        Giants.report();
        Carp.report();
        Dragons.report();

    }

}
