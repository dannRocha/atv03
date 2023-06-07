package com.github.dannrocha.q2;

public class AdaptadorFarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements MedidorCelsiusIF {

    @Override
    public Double medirTemperatura() {
        return (this.getTemperaturaFarenheit() - 32D) / 1.8D;
    }
}
