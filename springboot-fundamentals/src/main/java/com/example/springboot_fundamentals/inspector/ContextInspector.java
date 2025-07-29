package com.example.springboot_fundamentals.inspector;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

//1-Autowire ApplicationContext into a CommandLineRunner.
//2- In run(), retrieve all bean names, sort them, and print to console.
//3- Count how many beans start with “org.springframework”.
//4-write the output of console in docs/beans.txt

@Component
public class ContextInspector implements CommandLineRunner {
    private final ApplicationContext context;

    public ContextInspector(ApplicationContext context) {
        this.context = context;
    }


    @Override
    public void run(String... args)  throws Exception {
        String[] beansNames = context.getBeanDefinitionNames();
        Arrays.sort(beansNames);
        File docsDir = new File("docs");
        if (!docsDir.exists())
        {
            docsDir.mkdirs();
        }
        File file = new File(docsDir, "beans.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("All registered spring beans:\n");
            System.out.println("All registered spring beans: ");
            for (String beanName : beansNames) {
                writer.write(beanName + "\n");
                System.out.println(beanName);
        }
    long springBeansCount = Arrays.stream(beansNames)
                .filter(name -> name.startsWith("org.springframework")).count();

        writer.write("\nNumber of spring beans starting with 'org.springframework': " + springBeansCount + "\n");
        System.out.println("Number of spring beans starting with 'org.springframework': " + springBeansCount);
       }
        System.out.println("Output also saved to docs/beans.txt");
    }
}
