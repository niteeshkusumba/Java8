package com.nit.java8lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadaFile {

	public static void main(String[] args) {
		String FileName="d://hello.txt";
		try(Stream<String> stream= Files.lines(Paths.get(FileName))){
			stream.forEach(System.out::println);
		}catch(IOException e) {
			System.out.println(e);
			}
	}
}