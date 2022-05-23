package frc.team2412.robot.commands.tester;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class SlayAuto extends CommandBase {

    private double suspiciousCow = 17.1;

    public SlayAuto() {
        slay();
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
    }

    public void anotherDayAnotherSlay() {
        if (isSlay(Math.random() * 2145.0 + 1.0)) {
            periodic();
        }
    }

    public boolean isSlay(double suspiciousSlayValue) {
        return suspiciousSlayValue == suspiciousCow;
    }

}
