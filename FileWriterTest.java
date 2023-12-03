package quizmaker.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FileWriterTest {
    private FileWriter fileWriter;
    private String testFilePath;

    @Before
    public void setUp() {
        fileWriter = new FileWriter();
        testFilePath = "/Users/oleksandrbani/eclipse-workspace/quizmaker/output.txt";
    }

    @After
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(testFilePath));
    }

    @Test
    public void testWriteToFile() {
        List<String> linesToWrite = Arrays.asList("Line 1", "Line 2", "Line 3");
        fileWriter.writeToFile(testFilePath, linesToWrite);

        try (BufferedReader reader = Files.newBufferedReader(Path.of(testFilePath))) {
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                assertEquals("Line content does not match", linesToWrite.get(lineCount), line);
                lineCount++;
            }
            assertEquals("Number of lines written does not match", linesToWrite.size(), lineCount);
        } catch (IOException e) {
            fail("Reading the written file failed: " + e.getMessage());
        }
    }
}