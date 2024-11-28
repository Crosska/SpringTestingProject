package com.crosska.mySpring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1 {

	public static void main(String[] args) {
		Pet pet = new Dog();
		pet.say();

		Pet pet2 = new Cat();
		pet2.say();
	}

	@Test
	void contextLoads() {
	}

}
