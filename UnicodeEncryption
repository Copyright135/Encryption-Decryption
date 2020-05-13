package encryptdecrypt;

public class UnicodeEncryption extends Encryption {


    @Override
    String encrypt(String data, int key) {
        String encryptedData = "";

        //loops for every character in the String and changes the char
        for(int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            //if char is within this range, it will be encrypted
            if(ch >= ' ' && ch <= '~') {
                ch = (char)(((ch - ' ' + key) % 95) + ' ');
                encryptedData += ch;
            } else {
                //if the char is outside of the range, it will not be encrypted
                encryptedData += ch;
            }
        }
        return encryptedData;
    }

    @Override
    String decrypt(String data, int key) {
        String decryptedData = "";

        //loops for each char and decrypts each one
        for(int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            //if char is within this range, the letter will be decrypted
            if(ch >= ' ' && ch <= '~') {
                //if char is within this range, it will be decrypted
                ch = (char) (((ch - ' ' - key) % 95) + ' ');
                decryptedData += ch;
            } else {
                //if char is outside of the range, it will not be decrypted
                decryptedData += ch;
            }
        }
        return decryptedData;
    }
}
