import Charger.Simulator.demo.Charger
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification


@MicronautTest
class Charger extends Specification {

    @Inject
    Charger.Simulator.demo.Charger charger

    void 'test it works'(){
        expect:
        application.running
    }

}