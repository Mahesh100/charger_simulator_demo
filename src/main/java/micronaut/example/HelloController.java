package micronaut.example;

import io.micronaut.http.annotation.*;

@Controller("/hello")
class HelloController {

        @Get(uri="/message", produces="text/plain")
        public String message(){
            return  "Welcome"+" ";
        }

        @Get("/employee")
        public Employee getEmployee(){
            return new Employee( 101,"Mahesh" );

        }

    }
