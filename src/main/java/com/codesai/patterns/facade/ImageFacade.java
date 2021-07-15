package com.codesai.patterns.facade;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImageFacade {
    private final String fileName;

    public ImageFacade(String fileName) {
        this.fileName = fileName;
    }

    public File createThumbnail() throws IOException {
        final URL resource = getClass().getResource(fileName);
        final BufferedImage image = ImageIO.read(resource);
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        img.createGraphics().drawImage(image.getScaledInstance(100, 100, Image.SCALE_SMOOTH),0,0,null);
        final File thumbnailFile = new File("test_thumb.jpg");
        ImageIO.write(img, "jpg", thumbnailFile);
        return thumbnailFile;
    }
}
