package Controller;

import Model.StateController;

public class InactifController implements StateController {

    @Override
    public void start() {
        System.out.println("InactifController.start()");
    }

    @Override
    public void newInput(String input) {
       System.out.println("InactifController.newInput()");
    }

    @Override
    public void stop() {
        System.out.println("InactifController.stop()");
    }

}
