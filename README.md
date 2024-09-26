# Picture Lab

### Project Summary

In this lab, students will modify digital pictures using various image manipulation techniques. The lab focuses on teaching how to traverse a two-dimensional array of pixels, work with nested loops, and apply concepts such as inheritance, interfaces, and binary numbers in the context of image processing. The goal is for students to explore and manipulate images programmatically by implementing methods in Java.

### Included Files

This project includes a number of classes that you'll work with and modify:

- **`ColorChooser.java`**: A class for selecting colors using a GUI.
- **`DigitalPicture.java`**: An interface that is implemented by the `SimplePicture` class.
- **`FileChooser.java`**: Provides methods for selecting files and directories.
- **`ImageDisplay.java`**: Displays an image in a window.
- **`IntArrayWorker.java`**: A class that demonstrates operations with two-dimensional arrays.
- **`IntArrayWorkerTester.java`**: A test class for `IntArrayWorker`.
- **`Picture.java`**: The main class where most of the image manipulation methods will be written.
- **`PictureExplorer.java`**: Allows you to explore an image by zooming in and viewing the individual pixel values.
- **`PictureFrame.java`**: Displays the picture in a graphical user interface.
- **`PictureTester.java`**: Contains JUnit tests for verifying that your image manipulation methods work correctly.
- **`Pixel.java`**: A class representing a pixel, with methods to manipulate individual pixel colors.
- **`SimplePicture.java`**: Implements the `DigitalPicture` interface and handles basic image operations.

---

### Activities Overview

This lab consists of nine activities, each focusing on a different image manipulation technique. Below is a brief summary of each activity:

#### **Activity 1: Introduction to Digital Pictures and Color**
- **Summary**: Learn about how digital pictures are represented using pixels, and explore the RGB color model.
- **Key Concept**: Understand how a pixel’s color is stored using red, green, and blue components.

#### **Activity 2: Picking a Color**
- **Summary**: Use the `ColorChooser` class to select different colors and explore how colors are represented and manipulated.
- **Key Concept**: Use sliders to pick colors and see their RGB values.

#### **Activity 3: Exploring a Picture**
- **Summary**: Use the `PictureExplorer` class to explore the pixel values in an image.
- **Key Concept**: Understand how images are stored as a grid of pixels, and how pixel values can be accessed programmatically.

#### **Activity 4: Two-Dimensional Arrays in Java**
- **Summary**: Work with 2D arrays to manipulate pixels, learning how rows and columns represent an image.
- **Key Concept**: Use nested loops to iterate through a 2D array to manipulate images.

#### **Activity 5: Modifying a Picture**
- **Summary**: Implement methods such as `zeroBlue()` and `negate()` to change the colors of pixels.
- **Key Concept**: Change specific color components (e.g., setting the blue component to 0) to create image effects.

#### **Activity 6: Mirroring Pictures**
- **Summary**: Implement methods to mirror an image, including mirroring vertically, horizontally, and diagonally.
- **Key Concept**: Learn how to swap pixel values to create mirrored images.

#### **Activity 7: Mirroring Part of a Picture**
- **Summary**: Mirror specific parts of an image (such as the arms of a snowman or a seagull).
- **Key Concept**: Use loops and pixel manipulation to mirror specific regions of an image.

#### **Activity 8: Creating a Collage**
- **Summary**: Use image manipulation techniques to create a collage by copying and altering several images.
- **Key Concept**: Combine multiple images and apply effects such as mirroring or color changes to create a single collage image.

#### **Activity 9: Simple Edge Detection**
- **Summary**: Implement the `edgeDetection()` method to highlight the edges in an image by comparing pixel values.
- **Key Concept**: Detect edges in an image by analyzing the difference in color values between neighboring pixels.

---

### JUnit Tests and Points Breakdown

The following table lists the JUnit tests you will be graded on. Each test ensures that a particular method works correctly in the Picture Lab, and the total points for these tests add up to 100.

| **JUnit Test**                   | **Description**                                               | **Points** |
|-----------------------------------|---------------------------------------------------------------|------------|
| `testKeepOnlyBlue()`              | Tests the `keepOnlyBlue()` method, ensuring that only the blue color component remains, while red and green components are set to zero. | 10         |
| `testNegate()`                    | Tests the `negate()` method, which negates the colors in an image by subtracting the RGB values from 255. | 10         |
| `testGrayscale()`                 | Tests the `grayscale()` method, which converts the image into shades of gray by averaging the red, green, and blue values for each pixel. | 10         |
| `testMirrorVerticalRightToLeft()` | Verifies that the image is mirrored correctly from right to left by comparing mirrored pixel colors exactly. | 10         |
| `testMirrorArms()`                | Verifies that the arms of the snowman are mirrored correctly in the `mirrorArms()` method. This test ensures that at least 30 pixels have been mirrored exactly. | 10         |
| `testMirrorGull()`                | Verifies that the gull is mirrored correctly in the `mirrorGull()` method. This test ensures that at least 30 pixels have been mirrored exactly. | 10         |
| `testEdgeDetection2()`            | Tests the `edgeDetection2()` method by comparing pixel colors to ensure that edges are correctly detected based on a pixel color threshold. | 20         |

---

### How to Run the Tests in Eclipse

To run the JUnit tests in Eclipse, follow these steps:

1. **Set Up Your Project in Eclipse**:
   - Open Eclipse and import your project.
   - Ensure that the `JUnit` library is added to your project’s build path:
     1. Right-click on your project in the **Project Explorer**.
     2. Select **Build Path** > **Configure Build Path**.
     3. In the **Libraries** tab, click **Add Library**.
     4. Select **JUnit** and click **Next**.
     5. Choose **JUnit 5** and click **Finish**.

2. **Run the JUnit Tests**:
   - Navigate to the `PictureTester.java` file in your project.
   - Right-click anywhere in the file.
   - Select **Run As** > **JUnit Test**.
   
3. **Check the Test Results**:
   - After running the tests, the **JUnit** tab in Eclipse will show the test results:
     - **Green bar**: All tests passed.
     - **Red bar**: Some tests failed, and the output will indicate which tests failed along with detailed error messages.
   - You can also expand the test results in the **JUnit** tab to see which individual test cases passed or failed.

4. **Fixing Failed Tests**:
   - If any of the tests fail, open the corresponding method in `Picture.java` and debug the code.
   - After making the necessary fixes, right-click on the `PictureTester.java` file again and select **Run As** > **JUnit Test** to rerun the tests.

---

## Support

If you encounter any issues or have questions about the assignment, please reach out during office hours or post in the course discussion forum.

For additional assistance, contact: **Kevin** at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).
