public class TestObject {
    private String memberID = "";
    private int Timer =0;
    private int XP =0;
    public TestObject(){

    }

    public String getMemberID() {
        return memberID;
    }

    public int getXP() {
        return XP;
    }

    public int getTimer() {
        return Timer;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setTimer(int timer) {
        this.Timer = timer;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }
}
