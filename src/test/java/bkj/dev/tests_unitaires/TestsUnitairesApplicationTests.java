package bkj.dev.tests_unitaires;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestsUnitairesApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void testCreateUser() {
        //Arranche (Préparation)
        //But : Préparer l’environnement de test.
        var user = Factories.createUser();

        //Act (Action)
        //But : Exécuter l’action qui doit être testée.
        userService.addUser(user);
        var userFound = userService.findByUsername(user.username());

        //Assert (Vérification)
        //But : Vérifier que le résultat est conforme aux attentes.
        /*
        With JUnit5
        //assertEquals(user, userFound);

        */
        //Without JUnit5 but using with AssertJ
        assertThat(userFound).isEqualTo(user);

    }

}
