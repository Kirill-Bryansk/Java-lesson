package ru.lesson.object;

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("Бум бум бум");
    }

    void playTopHat() {
        System.out.println("Динь-динь-динь");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit kit = new DrumKit();
        kit.playSnare();
        kit.snare = false;
        if (kit.snare == true) {
            kit.playSnare();
        }
        kit.playTopHat();
    }
}