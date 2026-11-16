class LC1603_DesignParkingSystem_Easy {
    private final int[] availableSpaces;

    public LC1603_DesignParkingSystem_Easy(int big, int medium, int small) {
        availableSpaces = new int[] {0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (availableSpaces[carType] == 0) {
            return false;
        }
        availableSpaces[carType]--;
        return true;
    }
}
