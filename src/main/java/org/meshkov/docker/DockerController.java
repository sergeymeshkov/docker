package org.meshkov.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

	@GetMapping
	public String sayHiToDocker() {
		return "Hello from another Docker!!!";
	}

}
