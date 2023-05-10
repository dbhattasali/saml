package com.example.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.el.stream.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(DemoApplication.class, args);

//		ObjectMapper mapper = new ObjectMapper();
//
//		HttpClient httpClient = HttpClient.newBuilder()
//				.build();
//		System.out.println("start");
//		HttpRequest request = HttpRequest.newBuilder()
//				.GET()
//				.uri(URI.create("https://jsonmock.hackerrank.com/api/countries?name=India"))
//				.build();
//
//		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.body());
//
//		Root root = mapper.readValue(response.body(), Root.class);
//
//		String callingCode = root.data.stream().findFirst().get().callingCodes.stream().findFirst().toString();
//		System.out.println(callingCode);
//		Arrays.copyOfRange()

	}
}
