package floodmonitoringsystem.test;

import floodmonitoringsystem.management.ManagementFlood;
import floodmonitoringsystem.models.EmergencyTeam;
import floodmonitoringsystem.models.EvacuationZone;
import floodmonitoringsystem.models.Flood;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TestFloodMonitoring {


    public static void main(String[] args) {


        EvacuationZone evacuationZoneHigh = new EvacuationZone("Zona alta", 3, "Noelia");
        evacuationZoneHigh.addPerson("Marina");
        evacuationZoneHigh.addPerson("Julio");

        EvacuationZone evacuationZoneMedium = new EvacuationZone("Zona Media", 5, "Noelia");
        evacuationZoneMedium.addPerson("Marina");
        evacuationZoneMedium.addPerson("Julio");

        EvacuationZone evacuationZoneLow = new EvacuationZone("Zona Baja", 10, "Noelia");
        evacuationZoneLow.addPerson("Marina");
        evacuationZoneLow.addPerson("Julio");

        EvacuationZone evacuationZone2 = new EvacuationZone("Zona 2", 50, "Noelia");
        evacuationZone2.addPerson("Pachel");
        evacuationZone2.addPerson("Oliver");

        ArrayList<EvacuationZone> evacuationZones = new ArrayList<>();
        evacuationZones.add(evacuationZoneHigh);
        evacuationZones.add(evacuationZoneMedium);
        evacuationZones.add(evacuationZoneLow);


        ArrayList<EvacuationZone> evacuationZones2 = new ArrayList<>();
        evacuationZones2.add(evacuationZone2);


        ArrayList<EmergencyTeam> emergencyTeams = new ArrayList<>();
        emergencyTeams.add(new EmergencyTeam("teamRescue", "rescue"));
        emergencyTeams.add(new EmergencyTeam("teamAssistance", "assistance"));

        ArrayList<Flood> floods = new ArrayList<>();
        floods.add(new Flood(15, LocalDate.of(2024, 12, 1), evacuationZones, emergencyTeams));
        floods.add(new Flood(30, LocalDate.of(2024, 11, 1), evacuationZones2, emergencyTeams));


        ManagementFlood managementFlood = new ManagementFlood(floods, evacuationZones, emergencyTeams);

        boolean running = true;
        Scanner input = new Scanner(System.in);


        while (running) {
            System.out.println("""
                    =======================Menu Flood Monitoring============================
                    1. Alerts to Evacuation Zones
                    2. Show Zones Total Flood
                    3. Send Team Emergency
                    =======================================================================
                    """);
            System.out.print("Enter your number: ");
            int numberInput = input.nextInt();
            switch (numberInput) {
                case 1:
                    input.nextLine();
                    System.out.println("=============Alerts Evacuation Zones===========");
                    System.out.print("Enter your level Min Water Deep for Alerts: ");
                    var inputLevelMin = input.nextDouble();
                    for (EvacuationZone evacuationZoneAlert : managementFlood.giveAlertsInEvacuationZone(inputLevelMin)) {
                        System.out.println("Alert: " + evacuationZoneAlert.getNameZone() + " is Dangerous");
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("=============Zones Total Flood===========");
                    System.out.print("Enter your level Max Water Deep (if this Zones is low than level Max is Flood): ");
                    var inputLevelMax = input.nextDouble();
                    for (EvacuationZone evacuationZone : managementFlood.showEvacuationZonesFlood(inputLevelMax)) {
                        System.out.println("This zone : " + evacuationZone.getNameZone() + " is Flood");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("=============Send Team Rescue to Flood Zones===========");
                    System.out.print("Enter your level Max Water Deep (if this Zones is low than level Max is Flood): ");
                    var inputLevelMaxFlood = input.nextDouble();
                    managementFlood.showTeamEmergencySendZones(inputLevelMaxFlood);
                    break;
                case 4:
                    System.out.println("Leave...");
                    running = false;
                    break;

            }

        }
    }

}
