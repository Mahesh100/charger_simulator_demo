package micronaut.example.javatechie;

import io.micronaut.http.annotation.*;

@Controller("/hello")
class HelloController {

//    @Get(uri="/", produces="text/plain")
//    public String index() {
//
//        return "Example Response";


        @Get(uri="/message", produces="text/plain")
         public String message(){
            return  "Welcome";

        }

    }
