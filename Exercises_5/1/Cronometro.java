public class Cronometro {
private int hora, minuto, segundo;

public Cronometro() {}

public Cronometro(int hora, int minuto) {
this.hora = hora;
this.minuto = minuto;
this.segundo = 1;
}

public Cronometro(int hora) {
this.hora = hora;
minuto = 1;
segundo = 1;
}

public Cronometro(int hora, int minuto, int segundo) {
this.hora = hora;
this.minuto = minuto;
this.segundo = segundo;
}

public String toString() {
return hora + "h:" + minuto + "m:" + segundo + "s";
}
}
