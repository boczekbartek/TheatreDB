/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.greglturnquist.payroll;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductionsRepository productionsRepository;

	@Autowired
	public DatabaseLoader(ProductionsRepository productionsRepository) {
		this.productionsRepository = productionsRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
//		this.productionsRepository.save(new Production("Mamma mia", "None", "Musical"));

		System.out.println("\n1.All productions()...");
		for (Production production : productionsRepository.findAll()) {
			System.out.println(production);
		}
	}
}
// end::code[]