package com.apdex;
import org.junit.Assert;
import org.junit.Test;

public class ApdexTest {
    @Test
    public void validarApdexRazoavel(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(770,60,1000);

        //asset
        Assert.assertEquals(0.8, score, 0.001);
    }
    @Test
    public void validarApdexExcelente(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(770,60,1000);

        //asset
        Assert.assertEquals(0.8, score, 0.001);
    }
    @Test
    public void validarApdexBom(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(770,60,1000);

        //asset
        Assert.assertEquals(0.8, score, 0.001);
    }
    @Test
    public void validarApdexRuim(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(770,60,1000);

        //asset
        Assert.assertEquals(0.8, score, 0.001);
    }
    @Test
    public void validarApdexInaceitavel(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(770,60,1000);

        //asset
        Assert.assertEquals(0.8, score, 0.001);
    }


}
