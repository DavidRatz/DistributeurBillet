package Controller;

import Model.Distributeur;
import Model.StateController;

public class DistributeurController implements StateController {
    private StateController state;
    private Distributeur model;
    
    public DistributeurController(Distributeur model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("DistributeurController.start()");
        state = new InactifController();
        state.start();
    }

    @Override
    public void newInput(String input) {
        System.out.println(input);
        if("q".equals(input)){
            state.stop();
            state = null;
        }
    }

    @Override
    public void stop() {
        System.out.println("DistributeurController.stop()");
        if(state != null){
            state.stop();
            state = null;
        }
        
    }

    public boolean isFinish(){
        return state==null;
    }
    
}
