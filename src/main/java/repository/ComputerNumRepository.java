package repository;

public class ComputerNumRepository {
    // Singleton
    static ComputerNumRepository computerNumRepository;
    // ComputerNum
    private int[] computerNum;

    //-------------Singleton------------------
    private ComputerNumRepository() {}

    public static ComputerNumRepository getInstanceComputerRepository() {
        if(computerNumRepository==null){
            computerNumRepository = new ComputerNumRepository();
        }
        return computerNumRepository;
    }

    //------------Getter&Setter----------------

    public int[] getComputerNum() {
        return computerNum;
    }

    public void setComputerNum(int[] computerNum) {
        this.computerNum = computerNum;
    }

    //------------Reset Repository----------------
    public void clearComputerRepository() {
        computerNum = null;
    }
}
