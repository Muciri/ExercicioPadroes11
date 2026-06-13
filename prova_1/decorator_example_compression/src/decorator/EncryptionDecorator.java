package decorator;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{
    private String KEY;
    
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
        KEY = "1234";
    }

    public EncryptionDecorator(DataSource dataSource, String chave) {
        super(dataSource);
        KEY = chave;
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encode(data);
        dataSource.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String encryptedData = dataSource.readData();
        return decode(encryptedData);
    }

    private String encode(String data) {
        char[] key = KEY.toCharArray();
        char[] input = data.toCharArray();
        char[] output = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            output[i] = (char) (input[i] ^ key[i % key.length]);
        }

        // transforma em Base64
        return Base64.getEncoder()
                .encodeToString(new String(output).getBytes());
    }

    private String decode(String data) {

        // decodifica Base64
        byte[] decodedBytes = Base64.getDecoder()
                .decode(data);

        char[] key = KEY.toCharArray();
        char[] input = new String(decodedBytes).toCharArray();
        char[] output = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            output[i] = (char) (input[i] ^ key[i % key.length]);
        }

        return new String(output);
    }
}
