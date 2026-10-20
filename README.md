Este programa está diseñado para modelar y gestionar el almacenamiento y el control de nivel de un **tanque de agua** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `TanqueAgua`:** Modela un depósito de almacenamiento conteniendo sus atributos principales: la capacidad máxima permitida expresada en litros (`capacidadMaximaLitros`) y el volumen actual de agua almacenado (`nivelActualLitros`).
* **Valida los límites a través del constructor:** Asegura la consistencia física del sistema al comprobar y ajustar que el nivel actual de agua inicial nunca supere la capacidad máxima establecida.
* **Controla el llenado (`llenar`):** Implementa un método que recibe una cantidad de litros a incorporar, limitando o deteniendo la carga de forma automática al alcanzar el tope de la capacidad máxima para evitar desbordes.
* **Gestiona el consumo (`consumir`):** Verifica que exista el volumen de agua suficiente en el depósito antes de autorizar la extracción, asegurando que el nivel actual no arroje valores negativos.
* **Ejecuta la prueba (`main`):** Instancia un objeto de tipo `TanqueAgua`, simula diversas operaciones de carga y consumo de agua, y calcula e imprime el estado porcentual de llenado actualizado por consola.
