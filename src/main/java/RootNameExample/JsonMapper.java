package RootNameExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JsonMapper {
    private ByteArrayOutputStream baos = new ByteArrayOutputStream();

    private ObjectMapper mapper = new ObjectMapper();

    public JsonMapper(Object obj) throws IOException {
        mapper.writerWithDefaultPrettyPrinter().with(SerializationFeature.WRAP_ROOT_VALUE).writeValue(baos, obj);
    }

    public int size() {
        return baos.size();
    }

    public String toString() {
        byte[] bytes = baos.toByteArray();
        return new String(bytes);
    }
}