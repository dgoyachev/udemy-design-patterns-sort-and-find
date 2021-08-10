package com.calltouch.pattern.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {
    @Test
    public void compositeTest() {
        Folder folder1 = new Folder("Folder 1 information");
        Folder folder2 = new Folder("Folder 2 information");
        folder1.addChild(folder2);

        File file1 = new File("text.txt");
        File file2 = new File("picture.jpg");
        folder1.addChild(file1);
        folder2.addChild(file2);

        folder1.traverse();
    }
}