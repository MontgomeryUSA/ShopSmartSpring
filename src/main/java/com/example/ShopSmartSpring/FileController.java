package com.example.ShopSmartSpring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class FileController {

    @GetMapping("/file-content")
    public List<String> getFileContent() {
        try {
            Path filePath = Paths.get("src/main/resources/data.txt");  // Path to your text file
            return Files.readAllLines(filePath); // Reads each line as a separate element in a list
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("Error reading file");
        }
    }
}
