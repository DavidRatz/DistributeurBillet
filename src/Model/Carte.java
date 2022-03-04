package Model;
public class Carte {
    private int montant;
    private int nbEssai;
    private String code;
    public Carte(int montant, int nbEssai, String code) {
        this.montant = montant;
        this.nbEssai = nbEssai;
        this.code = code;
    }

    public boolean isCodeValid(String code){
        boolean valid = this.code.equals(code);
        if(valid){
            nbEssai = 0;
        }
        else
            nbEssai++;
        return valid;
    }

    public int getNbEssai() {
        return nbEssai;
    }

    public boolean autorisation(int montant) {
        boolean aut = this.montant >= montant;
        if(aut){
            this.montant = montant;
        }
        return aut;
    }

    
}
