package com.sofkau.tasks;
import com.sofkau.interactions.OurGet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
public class DoGet implements Task{
    private String numero;
    private String resource;
    public DoGet withTheResource(String resource){
        this.resource=resource;
        return this;
    }
    public DoGet andWithTheNumber(String numero){
        this.numero=numero;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(resource+numero);
        String url=resource+numero;
        actor.attemptsTo(
                OurGet.conElRecurso(url)
        );
    }
    public static DoGet doGet(){
        return new DoGet();
    }
}