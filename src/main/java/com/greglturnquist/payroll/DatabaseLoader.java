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
	private final ProfessionsRepository professionsRepository;
	private final TheatreOfficesRepository theatreOfficesRepository;
	@Autowired
	public DatabaseLoader(ProductionsRepository productionsRepository,
						  ProfessionsRepository professionsRepository,
						  TheatreOfficesRepository theatreOfficesRepository) {
		this.productionsRepository = productionsRepository;
		this.professionsRepository = professionsRepository;
		this.theatreOfficesRepository = theatreOfficesRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
//		this.productionsRepository.save(new Production("Mamma mia", "None", "Musical"));
		this.professionsRepository.save(new Profession(("Scenażysta")));
		this.theatreOfficesRepository.save(new TheatreOffice("Marszalkowska","124e", "01-111", "Warszawa"));
		this.theatreOfficesRepository.save(new TheatreOffice("Towarowa","122d", "02-131", "Warszawa"));
		this.theatreOfficesRepository.save(new TheatreOffice("Teatralna","11e", "01-134", "Warszawa"));
		this.theatreOfficesRepository.save(new TheatreOffice("Marszalkowska","124e", "01-111", "Krakow"));
		System.out.println("\n1.All productions...");
		for (Production production : productionsRepository.findAll()) {
			System.out.println(production);
		}
		System.out.println("\n1.All professions...");
		for (Profession profession : professionsRepository.findAll()) {
			System.out.println(profession);
		}
		for(TheatreOffice office : theatreOfficesRepository.findAllByCity("Warszawa")) {
			System.out.println(office);
		}
	}
}
// end::code[]