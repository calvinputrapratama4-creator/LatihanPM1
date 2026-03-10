public class LinuxBatocera {

    // State
    String namaOS;
    String versi;
    String emulatorPS;
    String gamePS;
    boolean statusBoot;

    // Behavior
    void booting() {
        statusBoot = true;
        System.out.println("Batocera Linux sedang booting...");
    }

    void loadEmulator() {
        System.out.println("Memuat emulator: " + emulatorPS);
    }

    void jalankanGame() {
        System.out.println("Menjalankan game PS: " + gamePS);
    }

    void keluarGame() {
        System.out.println("Keluar dari game: " + gamePS);
    }

    void shutdown() {
        statusBoot = false;
        System.out.println("Batocera Linux dimatikan");
    }

    // Main program
    public static void main(String[] args) {

        LinuxBatocera batocera = new LinuxBatocera();

        batocera.namaOS = "Batocera Linux";
        batocera.versi = "v39";
        batocera.emulatorPS = "PCSX-ReARMed";
        batocera.gamePS = "Tekken 3";

        batocera.booting();
        batocera.loadEmulator();
        batocera.jalankanGame();
        batocera.keluarGame();
        batocera.shutdown();
    }
}