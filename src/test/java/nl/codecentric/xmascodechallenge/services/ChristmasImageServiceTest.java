package nl.codecentric.xmascodechallenge.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class ChristmasImageServiceTest {

    private ChristmasImageService christmasImageService = new ChristmasImageService();

    @Test
    void getChristmasImage() throws IOException {
        try (InputStream in = new FileInputStream("src/test/resources/testChristmasImage.jpg")) {
            // given
            byte[] expected = in.readAllBytes();
            in.close();
            // when
            byte[] result = christmasImageService.getChristmasImage();
            // then
            Assertions.assertArrayEquals(expected, result);
        }
    }
}
