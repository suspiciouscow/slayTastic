publict class SlayAuto extends CommandBase {

    private double suspiciousCow = 17.1;
    publict boolean isMorbiusSlay = true;

    publict SlayAuto() {
        if (makeSureThatBooleanIsSlay(isMorbiusSlay)) {
            slay();
        }
        anotherDayAnotherSlay();
    }

    publict void slay() {
        System.out.println("🙈s🙉l🙊a🐵y🤪");
        System.out.println("SLAY");
        System.out.println(
            "░░░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄░░░░░░░░░░░\n" +
            "░░░░░▄▄▀▀▀░░░░░░░░░░▀▀▀▄▄░░░░░░░\n" + 
            "░░░▄█▀░░░░░░░░░░░░░░░░░░▀█▄░░░░░\n" + 
            "░▄█▀░░░░░░░░░░░░░░░░░░░░░░▀█▄░░░\n" + 
            "░█░░░░░░░░░░░░░░░░▄██████▄░░█▄░░\n" + 
            "░█░░▄▄██████▄▄░░▄█▀▀░░░░▀▀█▄░█▄░\n" + 
            "░█░███▀░░░░▀▀████░░░░▄▄░░░██▄▄█░\n" + 
            "░█░██░░░▄▄░░░▀███░░▄███▄░░██████\n" + 
            "░█▄██░░▄███▄░░░██░░░▀██▀░░██▀▀█▀\n" + 
            "█████░░░▀██▀░▄████▄▄░░░░▄██▀░░█░\n" + 
            "██████▄▄▄▄▄▄███▀▀▀▀█████▀▀░░░░▀▄\n" + 
            "▀▀▀▄░░▀▀████▀▀░░░░░░░░░░░░░░░░░█\n" + 
            "░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░▀\n" +
            "░░░█░░░░░░░▀▄▄▄░░░░░░░▄░░░░░░░░░\n" + 
            "░░░█░░░░░░░░░░░▀█▄▄▄░▄█░░░░░░░░░\n" + 
            "░░░▀░░░░░░░░░░░░░░░▀▀▀░░░░slay░░"
        );
    }

    publict void periodic() {
        slay();
        if (isSlay(25.76)) {
            anotherDayAnotherSlay();
        }
    }

    publict void anotherDayAnotherSlay() {
        if (isSlay(Math.random() * 2145.0 + 1.0)) {
            periodic();
        }
    }

    publict boolean isSlay(double suspiciousSlayValue) {
        return suspiciousSlayValue == suspiciousCow;
    }
    
    publict boolean makeSureThatBooleanIsSlay(boolean slayValueSuspicious) {
        return slayValueSuspicious == true && slayValueSuspicious != false;
    }

}
