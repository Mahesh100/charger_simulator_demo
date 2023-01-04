package charger.Simulator.demo;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;



@Controller("/chargeStation")
public class ChargeStationController {

    //EndPoint 1
    @Get(uri="/message", produces = MediaType.TEXT_HTML)
    public String index() {

        return " <!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Charging Stations</title>\n" +
                "    <style>\n" +
                "    body {background-color: powderblue;\n" +
                "          position:centre;}\n" +
                "    h1   {color: blue;\n" +
                "          text-align: center;}\n" +
                "    p    {color: red;}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<blink><h1 style=\"color:blue;\" >Welcome to Evoke Charging Station</h1></blink>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }


    //--------------------------------------------------------------------------------------------------
    //EndPoint 2

    @Get("/charger1")
    public Charger getCharger(){
        Charger chw = new Charger( 1772,"MkGold", "vizag", "Available");
        return chw;
    }

    //EndPoint 3
    @Get("/charger2")
    public Charger getCharger2(){
        Charger chw2 = new Charger( 1773,"MkSilver", "Pune", "Preparing");
        return chw2;
    }


    //Endpoint 4
    @Get("/charger3")
    public Charger getCharger3(){
        Charger chw3 = new Charger( 1774,"Mk-platinum", "Mumbai","NotAvailable");
        return chw3;
    }

    // EndPoint 5
    @Get("/charger4")
    public Charger getCharger4(){
        Charger chw4 = new Charger( 1775,"Mk-Diamond", "Chennai","Faulted");
        return chw4;
    }



}