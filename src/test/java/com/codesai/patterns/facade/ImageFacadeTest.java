package com.codesai.patterns.facade;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ImageFacadeTest {

    @Test
    public void create_a_thumbnail() throws IOException {
        ImageFacade imageFacade = new ImageFacade("/facade-design-pattern.png");

        File createdThumbnail = imageFacade.createThumbnail();

        final BufferedImage thumbnail = ImageIO.read(createdThumbnail);
        assertThat(thumbnail.getWidth()).isEqualTo(100);
        assertThat(thumbnail.getHeight()).isEqualTo(100);
    }
}
