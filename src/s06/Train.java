package s06;

class Train {
    private Wagon[] wagons;

    Train(Wagon[] wagons) {
        this.wagons = wagons;
    }

    private Wagon[] getWagons() {
        return wagons;
    }

    double tonnage() {
        double sum = 0;
        for (Wagon wagon : getWagons()) {
            sum += wagon.getWeight();
        }
        return sum;
    }

    double middleTonnage() {
        return tonnage() / wagons.length;

    }
}