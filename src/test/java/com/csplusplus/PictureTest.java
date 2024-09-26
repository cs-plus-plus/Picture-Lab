package com.csplusplus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color; // Importing Color from java.awt
import java.io.File;

public class PictureTest {

    // Test for Activity 5: Modifying a Picture (keepOnlyBlue)
    @Test
    public void testKeepOnlyBlue() {
        Picture pix = new Picture("./images/beach.jpg");
        
        // Apply the keepOnlyBlue method
        pix.keepOnlyBlue();
        
        // Get the 2D array of pixels
        Pixel[][] pixels = pix.getPixels2D();
        
        // Check that red and green values are set to 0 while blue remains unchanged
        for (Pixel[] row : pixels) {
            for (Pixel pixel : row) {
                assertEquals(0, pixel.getRed());
                assertEquals(0, pixel.getGreen());
                assertTrue(pixel.getBlue() >= 0);  // Blue value should remain unaffected
            }
        }
    }

    // Test for Activity 5: Modifying a Picture (negate)
    @Test
    public void testNegate() {
        Picture pix = new Picture("./images/beach.jpg");
        
        // Store the original RGB values before negation
        Pixel[][] pixels = pix.getPixels2D();
        int[][] originalRed = new int[pixels.length][pixels[0].length];
        int[][] originalGreen = new int[pixels.length][pixels[0].length];
        int[][] originalBlue = new int[pixels.length][pixels[0].length];

        // Copy the original values into arrays for comparison after negation
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                originalRed[row][col] = pixels[row][col].getRed();
                originalGreen[row][col] = pixels[row][col].getGreen();
                originalBlue[row][col] = pixels[row][col].getBlue();
            }
        }

        // Apply the negate method
        pix.negate();

        // Check that the negated values are correct
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                assertEquals(255 - originalRed[row][col], pixels[row][col].getRed());
                assertEquals(255 - originalGreen[row][col], pixels[row][col].getGreen());
                assertEquals(255 - originalBlue[row][col], pixels[row][col].getBlue());
            }
        }
    }

    // Test for Activity 6: Mirroring Pictures (mirrorVerticalRightToLeft)
    @Test
    public void testMirrorVerticalRightToLeft() {
        Picture pix = new Picture("./images/beach.jpg");
        
        // Apply the mirrorVerticalRightToLeft method
        pix.mirrorVerticalRightToLeft();
        
        // Get the 2D array of pixels
        Pixel[][] pixels = pix.getPixels2D();
        
        // Check that the left side mirrors the right side (right-to-left)
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < width / 2; col++) {
                Pixel leftPixel = pixels[row][col];
                Pixel rightPixel = pixels[row][width - 1 - col];
                assertEquals(leftPixel.getColor(), rightPixel.getColor());
            }
        }
    }

 // Test for Activity 7: Mirroring Part of a Picture (mirrorArms)
    @Test
    public void testMirrorArms() {
        Picture pix = new Picture("./images/snowman.jpg");
        
        // Apply the mirrorArms method
        pix.mirrorArms();
        
        Pixel[][] pixels = pix.getPixels2D();
        int height = pixels.length;
        int width = pixels[0].length;

        int mirroredCount = 0; // Count of mirrored pixels

        // Iterate over the entire image and count mirrored pixels
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width / 2; col++) {
                Pixel leftPixel = pixels[row][col];
                Pixel rightPixel = pixels[row][width - 1 - col];

                // If the colors match exactly, count it as mirrored
                if (leftPixel.getColor().equals(rightPixel.getColor())) {
                    mirroredCount++;
                }
            }
        }

        // Ensure that at least 30 pixels have been mirrored
        assertTrue(mirroredCount >= 30, "Less than 30 pixels were mirrored in the image.");
    }

 // Test for Activity 7: Mirroring Part of a Picture (mirrorGull)
    @Test
    public void testMirrorGull() {
        Picture pix = new Picture("./images/seagull.jpg");
        
        // Apply the mirrorGull method
        pix.mirrorGull();
        
        Pixel[][] pixels = pix.getPixels2D();
        int height = pixels.length;
        int width = pixels[0].length;

        int mirroredCount = 0; // Count of mirrored pixels

        // Iterate over the entire image and count mirrored pixels
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width / 2; col++) {
                Pixel leftPixel = pixels[row][col];
                Pixel rightPixel = pixels[row][width - 1 - col];

                // If the colors match exactly, count it as mirrored
                if (leftPixel.getColor().equals(rightPixel.getColor())) {
                    mirroredCount++;
                }
            }
        }

        // Ensure that at least 30 pixels have been mirrored
        assertTrue(mirroredCount >= 30, "Less than 30 pixels were mirrored in the image.");
    }


    
    // Test for Activity 9: Simple Edge Detection (edgeDetection2)
    @Test
    public void testEdgeDetection2() {
        Picture pix = new Picture("./images/beach.jpg");
        
        // Apply the edgeDetection2 method with a threshold value
        pix.edgeDetection2(10);
        
        // Get the 2D array of pixels
        Pixel[][] pixels = pix.getPixels2D();
        
        // Ensure edges are detected by checking pixel color changes
        boolean edgeDetected = false;
        for (Pixel[] row : pixels) {
            for (Pixel pixel : row) {
                if (pixel.getColor().equals(Color.BLACK)) {
                    edgeDetected = true;
                    break;
                }
            }
            if (edgeDetected) break;
        }

        // Ensure at least one edge has been detected
        assertTrue(edgeDetected, "No edges were detected with edgeDetection2().");
    }

    // Test for IntArrayWorker Methods (Total, Count, Largest, ColTotal)
    @Test
    public void testIntArrayWorker() {
        IntArrayWorker intArrayWorker = new IntArrayWorker();
        
        // Set matrix
        int[][] testMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        intArrayWorker.setMatrix(testMatrix);
        
        // Test total calculation
        assertEquals(45, intArrayWorker.getTotal());

        // Test counting a specific value
        assertEquals(1, intArrayWorker.getCount(5));

        // Test getting the largest value
        assertEquals(9, intArrayWorker.getLargest());

        // Test getting the total of a specific column
        assertEquals(18, intArrayWorker.getColTotal(2)); // Sum of column 2 (3+6+9)
    }
}
