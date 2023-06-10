import java.util.ArrayList;
import java.util.Scanner;

class Automobile {

    private String vehMake = null;
    private String vehModel = null;
    private String vehColor = null;
    private int vehYear = 0;
    private int vehMileage = 0;
    private int vehDesc = 0;

    Automobile(String vehMake, String vehModel, String vehColor, int vehYear, int vehMileage) {
        this.vehMake = vehMake;
        this.vehModel = vehModel;
        this.vehColor = vehColor;
        this.vehYear = vehYear;
        this.vehMileage = vehMileage;
    }

    public static void main(String[] args) {
        String vehMake[] = {"Ford", "Toyota"};
        String vehModel[] = {"EcoSport", "Edge", "Escape", "Yaris", "Corolla", "Prius", "Camry", "Avalon", "Mirai", "86", "GR Supra"};
        String vehColor[] = {"Red", "Yellow", "Green", "Black", "Blue"};
        int vehYear[] = {2015, 2016, 2017, 2018, 2019, 2020};
        int vehMileage[] = {60000, 10000, 20000, 5000, 15000};

        ArrayList<Automobile> carList = addValues(vehMake, vehModel, vehColor, vehYear, vehMileage);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle make: ");
        String input = sc.nextLine();
        System.out.println("Your vehicle make is: " + input);

        // Iterate over the carList and perform operations as needed
        for (Automobile car : carList) {
            // Perform operations on each car object
        }
    }

    private static ArrayList<Automobile> addValues(String[] vehMake, String[] vehModel, String[] vehColor,
                                                   int[] vehYear, int[] vehMileage) {
        ArrayList<Automobile> list = new ArrayList<>();

        for (int vehDesc = 0; vehDesc < 10; vehDesc++) {
            list.add(new Automobile(vehMake[vehDesc], vehModel[vehDesc], vehColor[vehDesc], vehYear[vehDesc], vehMileage[vehDesc]));
        }

        return list;
    }
}
