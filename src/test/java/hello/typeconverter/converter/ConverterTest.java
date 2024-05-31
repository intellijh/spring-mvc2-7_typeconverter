package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    void stringToInteger() {
        //given
        //when
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");

        //then
        assertThat(result).isEqualTo(10);
    }

    @Test
    void integerToString() {
        //given
        //when
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);

        //then
        assertThat(result).isEqualTo("10");
    }

    @Test
    void ipPortToString() {
        //given
        IpPort source = new IpPort("127.0.0.1", 8080);

        //when
        IpPortToStringConverter converter = new IpPortToStringConverter();
        String result = converter.convert(source);

        //then
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }

    @Test
    void StringToIpPort() {
        //given
        String source = "127.0.0.1:8080";

        //when
        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort result = converter.convert(source);

        //then
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }
}
