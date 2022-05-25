public class SlayAuto extends CommandBase {

    private double suspiciousCow = 17.1;
    public boolean isMobiusSlay = true;

    public SlayAuto() {
        if (makeSureThatBooleanIsSlay(isMorbiusSlay)) {
            slay();
        }
        anotherDayAnotherSlay();
    }

    public void slay() {
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

    public void periodic() {
        slay();
        if (isSlay(25.76)) {
            anotherDayAnotherSlay();
        }
    }

    public void anotherDayAnotherSlay() {
        if (isSlay(Math.random() * 2145.0 + 1.0)) {
            periodic();
        }
    }

    public boolean isSlay(double suspiciousSlayValue) {
        return suspiciousSlayValue == suspiciousCow;
    }
    
    public boolean makeSureThatBooleanIsSlay(boolean slayValueSuspicious) {
        return slayValueSuspicious == true && slayValueSuspicious != false;
    }

}
