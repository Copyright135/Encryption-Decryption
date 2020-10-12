package encryptdecrypt;

public class EncryptionTool extends EncryptionHandler {

    public EncryptionTool(String[] configs, int key) {
        super(configs, key);
    }

    //Concrete factory providing logic for which encryption method(product) to create
    @Override
    Encryption encryptionSelect(String alg) {
        switch(alg.toLowerCase()) {
            case "shift":
                return new ShiftEncryption();
            case "unicode":
                return new UnicodeEncryption();
            default:
                return null;
        }
    }
}
