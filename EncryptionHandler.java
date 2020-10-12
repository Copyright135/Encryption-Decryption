package encryptdecrypt;

abstract class EncryptionHandler {
    private String[] configs;
    private int key;

    public EncryptionHandler(String[] configs, int key) {
        this.configs = configs;
        this.key = key;
    }

    //Factory Creator for handling logic of which methods to run
    abstract Encryption encryptionSelect(String alg);

    String process(String data) {
        Encryption encryption = encryptionSelect(configs[0]);
        String processedData = "";

        switch(configs[1].toLowerCase()) {
            case "enc":
                processedData = encryption.encrypt(data, key);
                break;
            case "dec":
                processedData = encryption.decrypt(data, key);
                break;
        }
        return processedData;
    }
}
