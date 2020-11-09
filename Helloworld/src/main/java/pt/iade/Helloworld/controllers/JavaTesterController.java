package pt.iade.Helloworld.controllers;
/*import java.util.ArrayList;*/
/*import org.apache.catalina.valves.rewrite.RewriteCond;*/
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/*import org.springframework.web.bind.annotation.PostMapping;*/
/*import org.springframework.web.bind.annotation.RequestBody;*/
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
   /* private ArrayList<CurricularUnit> units= new ArrayList<CurricularUnit>();
    @PostMapping(path = "/units/",produces = MediaType.APPLICATION_JSON_VALUE);
    public CurricularUnit saveUnit(@RequestBody CurricularUnit unit){
        logger.info("Added unit"+ unit.getName());
        units.add(unit);
        return unit;
    }
    private double grade[]={10.5,12,14.5};
    private static String ucs[]={"FP","Poo","BD"};
    @GetMapping(path="/grademax",produces = MediaType.APPLICATION_JSON_VALUE);
    public double grademax(){
        double max = 0;
        for(int i=1;i<grade.size;i++){
            if(grade[i]>max){
                max=grade[i];
            }
        }
        return max;
    }
    public double average(){
        double notas_finais=0;
        for(int i=1 , i<grade.size;i++){
            notas_finais=notas_finais+ grade[];
        }
        double average=notas_finais/grade.size;
        return average;
    } Tenho duvidas nesta parte*/
    @GetMapping(path = "access/{student}/{covid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean getGreeting(@PathVariable("student") boolean isStudent, @PathVariable("covid") boolean hasCovid) {
        if(isStudent && (!hasCovid)){
            return true;
        }else{
            return false;
        }
    }
    @GetMapping(path ="/required/{student}/{temperature}/{classType}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean getRequired(@PathVariable("student") boolean isStudent, @PathVariable("temperature") double hasCovid, @PathVariable("classType") String type) {
        if (isStudent && type.equals("presential") && (hasCovid < 37.5 && hasCovid > 34.5)) {
            return true;
        } else {
            return false;
        }
    }
    @GetMapping(path ="/evacuation/{fire}/{numberOfCovids}/{powerShutdown}/{comeBackTime}/", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean getEvacuation(@PathVariable("fire") boolean fire, @PathVariable("numberOfCovids") int numberOfCovids, @PathVariable("powerShutdown") boolean powerShutdown, @PathVariable("comeBackTime") int comeBack) {
        if (fire) {
            return true;
        } else if (numberOfCovids > 5) {
            return true;
        } else if (powerShutdown && comeBack > 15) {
            return true;
        }
        return false;
    }













}
