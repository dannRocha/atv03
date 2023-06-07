package com.github.dannrocha.q2;

public class Main {
    public static void main(String[] args) {
        MedidorCelsiusIF medidorCelsiusIFObject = new AdaptadorFarenheitParaCelsiusObjectAdapter();
        MedidorCelsiusIF medidorCelsiusIFClass = new AdaptadorFarenheitParaCelsiusClassAdapter();

        System.out.println("Object(Fº -> Cº): %s\nClass (Fº -> Cº): %s"
                .formatted(
                        medidorCelsiusIFObject.medirTemperatura(),
                        medidorCelsiusIFObject.medirTemperatura()
                )
            );
    }
}
