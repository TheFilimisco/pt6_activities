package home.models;

public class LivingRoom {
    private int numberOfTvs;
    private String livingRoomType;


    public LivingRoom(){
        this.numberOfTvs = 0;
        this.livingRoomType = "unknown";
    }

    public LivingRoom(int numberOfTvs, String livingRoomType) {
        this.numberOfTvs = numberOfTvs;
        this.livingRoomType = livingRoomType;
    }

    public int getNumberOfTvs() {
        return numberOfTvs;
    }

    public void setNumberOfTvs(int numberOfTvs) {
        this.numberOfTvs = numberOfTvs;
    }

    public String getLivingRoomType() {
        return livingRoomType;
    }

    public void setLivingRoomType(String livingRoomType) {
        this.livingRoomType = livingRoomType;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "numberOfTvs=" + numberOfTvs +
                ", livingRoomType='" + livingRoomType + '\'' +
                '}';
    }
}
