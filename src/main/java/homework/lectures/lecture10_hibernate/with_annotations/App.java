package homework.lectures.lecture10_hibernate.with_annotations;

import homework.lectures.lecture10_hibernate.with_annotations.entity.Type;
import homework.lectures.lecture10_hibernate.with_annotations.service.DriverServiceImpl;
import homework.lectures.lecture10_hibernate.with_annotations.service.HelmetServiceImpl;
import homework.lectures.lecture10_hibernate.with_annotations.service.SportBikeServiceImpl;
import homework.lectures.lecture10_hibernate.with_annotations.service.StreetBikeServiceImpl;

public class App {
    public static void main(String[] args) {

        var helmetService = new HelmetServiceImpl();
        var driverService = new DriverServiceImpl();
        var sportBikeServices = new SportBikeServiceImpl();
        var streetBikeService = new StreetBikeServiceImpl();

        var helmetMTSizeS = helmetService.createHelmet("MT", "S");
        var helmetAGVSizeXL = helmetService.createHelmet("AGV", "XL");

        var driver = driverService.createDriver(helmetAGVSizeXL, "Max", "Bychynski", 32, "MAA 324789");
        var driver1 = driverService.createDriver(helmetMTSizeS, "Olga", "Olgova", 27, "MAA 999999");

        sportBikeServices.createSportBike("HONDA", "CBR 600 f4i", 2002, 600, 135, Type.MOTORBIKE, driver, true, true);
        sportBikeServices.createSportBike("YAMAHA", "R1", 2007, 1000, 202, Type.MOTORBIKE, driver1, true, false);
        streetBikeService.createStreetBike("M1NSK", "D125", 2018, 49, 9, Type.MOPED, driver1, true);
        streetBikeService.createStreetBike("HONDA", "CB 600 Hornet", 2005, 600, 123, Type.MOTORBIKE, driver, true);

        System.out.println(sportBikeServices.findAllSportBikes());
        sportBikeServices.updateSportBike(2L, 2015);
        System.out.println(sportBikeServices.findSportBikeById(2L));
        sportBikeServices.deleteSportBike(1L);
        System.out.println(sportBikeServices.findAllSportBikes());
    }
}
