package encryptdecrypt;

public abstract class Encryption {
    //Abstract master class for designating what each Encryption method should do

    abstract String encrypt(String data, int key);

    abstract String decrypt(String data, int key);
}
