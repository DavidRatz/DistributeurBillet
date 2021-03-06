import java.util.Scanner;

import Controller.DistributeurController;
import Model.Distributeur;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DistributeurController ctrl = getDistributeurController();
        ctrl.start();
        while(!ctrl.isFinish()){
            ctrl.newInput(sc.nextLine());
        }
        ctrl.stop();
    }

    private static DistributeurController getDistributeurController() {
        Distributeur model = new Distributeur(null);
        DistributeurController distributeurController = new DistributeurController(model);
        return distributeurController;
    }
}
