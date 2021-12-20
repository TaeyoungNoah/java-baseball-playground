package repository;

public class UserNumRepository {
    // Singleton
    static UserNumRepository userNumRepository;
    // UserNum
    private int[] userNum;

    //-------------Singleton------------------
    public UserNumRepository() {}

    public static UserNumRepository getInstanceUserRepository() {
        if(userNumRepository==null){
            userNumRepository = new UserNumRepository();
        }
        return userNumRepository;
    }

    //------------Getter&Setter----------------
    public int[] getUserNum() {
        return userNum;
    }

    public void setUserNum(int[] userNum) {
        this.userNum = userNum;
    }

}
