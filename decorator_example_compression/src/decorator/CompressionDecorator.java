package decorator;

import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        dataSource.writeData(compressedData);
    }

    @Override
    public String readData() {
        String compressedData = dataSource.readData();
        return decompress(compressedData);
    }

    public static String compress(String data) {
        try {
            byte[] input = data.getBytes("UTF-8");
            Deflater deflater = new Deflater();

            deflater.setInput(input);
            deflater.finish();

            byte[] buffer = new byte[1024];

            ByteArrayOutputStream outputStream =
                    new ByteArrayOutputStream();

            while (!deflater.finished()) {
                int count = deflater.deflate(buffer);
                outputStream.write(buffer, 0, count);
            }

            outputStream.close();

            // transforma bytes comprimidos em String
            return Base64.getEncoder()
                    .encodeToString(outputStream.toByteArray());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String decompress(String data) {
        try {
            // converte Base64 para bytes
            byte[] compressedData =
                    Base64.getDecoder().decode(data);

            Inflater inflater = new Inflater();
            inflater.setInput(compressedData);

            byte[] buffer = new byte[1024];

            ByteArrayOutputStream outputStream =
                    new ByteArrayOutputStream();

            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            outputStream.close();

            return outputStream.toString("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
