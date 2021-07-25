package LeetCode.easy;

public class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            big--;
            return big >= 0;
        }
        if (carType == 2) {
            medium--;
            return medium >= 0;
        }
        if (carType == 3) {
            small--;
            return small >= 0;
        }
        return false;
    }
}
