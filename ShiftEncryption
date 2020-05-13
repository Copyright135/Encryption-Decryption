package encryptdecrypt;

public class ShiftEncryption extends Encryption {


    @Override
    String encrypt(String data, int key) {
        String encryptedData = "";

        //shifts each char over by designated key, looping if the end of the alphabet is reached
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + key) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + key) % 26 + 'A');
            }

            encryptedData += ch;
        }

        return encryptedData;
    }

    @Override
    String decrypt(String data, int key) {
        String decryptedData = "";
        System.out.println(data);

        //shifts each char over by designated key, looping if the end of the alphabet is reached
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch -= key;
                if (ch < 'a') {
                    ch += 26;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                ch -= key;
                if(ch < 'A') {
                    ch += 26;
                }
            }

            decryptedData += ch;
        }

        return decryptedData;
    }
}
