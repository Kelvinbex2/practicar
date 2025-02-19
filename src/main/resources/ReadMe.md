
Se tiene un servidor de impresión. Al inicializarlo se muestran sus parámetros de inicio:

* Numero de hojas que permite imprimir

Se creará un cliente que solicite imprimir hojas en el servidor (se le pasará el número de hojas a imprimir).

Cuando se imprime un documento en el servidor, se debe reducir el número de hojas disponibles para su impresión, y al cliente se le envía OK. Si el número de hojas disponible para imprimir es menor que cero, se deberá enviar al cliente KO.
