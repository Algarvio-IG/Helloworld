package pt.iade.Helloworld.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/java/tester")
public class JavaTesterController{
    @GetMapping(path = "/author", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAuthor()
    {
        String nome="Gonçalo Felicino";
        double altura=1.74;
        int numero=20190884;
        boolean is_Fan=true;
        String clube="Benfica";
        if(is_Fan){
            return("Done by"+nome+"whit number"+numero+".\n"+"I am"+altura+"tall and I am a fan of football."+".\n"+"My favourite club is"+clube+".");
        }
        else if(!is_Fan){
            return("Done by"+nome+"whit number"+numero+".\n"+"I am"+altura+"tall and I am a fan of football.");
        }
        return clube;
    }




    
}
