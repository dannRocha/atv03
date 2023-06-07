package com.github.dannrocha.q2;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorCelsiusIF {

    private final MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
    @Override
    public Double medirTemperatura() {
        return (medidorFarenheit.getTemperaturaFarenheit() - 32D)/1.8D;
    }
}
