package xeanutsp.io.sonar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import xeanutsp.io.sonar.repo.UsersRepository;
import xeanutsp.io.sonar.service.UsersService;

@SpringBootTest
class SonarApplicationTests {

	@Mock
	private UsersRepository usersRepository;

	@InjectMocks
	private UsersService usersService;

	@BeforeEach
	void setup(){
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testGetUser() {

	}

}
