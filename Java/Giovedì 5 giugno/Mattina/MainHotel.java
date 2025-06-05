public class MainHotel {
    public static void main(String[] args) {
        // Istanza di hotel
        Hotel hotel = new Hotel("Hotel Eufemia");

        // Istanze di camere
        Camera camera1 = new Camera(1, 79.99f);
        Camera camera2 = new Camera(2, 89.99f);

        // Istanze di suite
        Suite suite1 = new Suite(3, 139.99f, "Idromassaggio");
        Suite suite2 = new Suite(4, 159.99f, "Water riscaldato");

        // Aggiunta camere e suite all'hotel
        hotel.addCamera(camera1);
        hotel.addCamera(camera2);
        hotel.addCamera(suite1);
        hotel.addCamera(suite2);

        System.out.println("Dettagli camere dell'hotel");
        for (Camera camera : hotel.getCamere()) {
            camera.dettagli();
            camera.dettagli(false);
        }

        System.out.println("\nNell'hotel ci sono " + Hotel.contaSuite(hotel.getCamere()) + " suite.");
    }
}
