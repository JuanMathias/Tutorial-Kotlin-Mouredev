package com.mathiapps.mouredev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes() //Tengo que quitar "//" para que se ejecute lo que está en variblesYConstantes()
        tiposDeDatos()
        sentenciaIf()
        sentenciaIf2()
    }
                   /* Lección 1 | Variables "var" y Constantes "val" */

                               /* Variables "var" */

// Primero se debe asignar en el archivo Kotlin MainActivity lo siguiente: variablesYConstantes(), Esto es para que ejecute lo que está dentro de la
// Programación de variablesYConstantes() {, Siempre primero debe ser minúscula luego mayúscula, ej: laVariable, tuVariable;---
// ---A esto se le llama nomenclatura "Camelcase", También se aplica a las constantes "val", bueno prácticamente a todo XD

    private fun variablesYConstantes() {   // "private fun" es para asignar un llamado a una nueva función de programación

        var myFirstVariable = "Hola Esta es la primera variable" // aquí le asignamos a la variable el dato "Hola Amigos"

        println(myFirstVariable)           // "println" Es para imprimir en pantalla, especificamente en el apartado de Run de android studio (¡no se muestra en la app en sí!)

        myFirstVariable = "Esta es la primera varible pero con dato variado"  // Aquí le asignamos un nuevo dato a la variable "myFirstVariable" pero sin la aclaración "var", por que anteriormente ya le asignamos a "myFirstVariable" que es una "var", si le pusiéramos nuevamente "var" nos tomaría como si fuera que estamos añadiendo una nueva variable

        println(myFirstVariable)

        var mySecondVariable = "Esta es la segunda variable"  // Aquí creamos una variable nueva pero que toma el valor de una variable anterior

        println(mySecondVariable)

        mySecondVariable = myFirstVariable + ", " + mySecondVariable //Concatenar: Sumar uno con otro con el simbolo $

        println(mySecondVariable)


                               /* Constante "val" */

        val myFirstConstant = "Esta es la primera constante"

        println(myFirstConstant)

        //myFirstConstant = "Me sirvió de mucha ayuda uwu" // Aquí si dejo de comentar da error ya que la constante no puede variar de dato, tendríamos que añadir una nueva constante "val"

        //println(myFirstConstant)

        val mysecondconstat = mySecondVariable // Aquí hice una prueba personal sin el camelcase y al parecer funciona de igual forma, pero me subraya que está mal escrito

        println(mysecondconstat)
    }



                      /* Lección 2 | Tipos de Datos: Texto "String", Enteros, */

    private fun tiposDeDatos() {

        val myString: String = "¡Aquí comienza la lección 2: Tipo de Datos!" /* Si nos situamos encima de "String" nos dice que ya es redundante que le digamos que el dato que vamos a poner es de tipo String ya que al poner "" ya sabe que es un texto es decir "String  */
        val myString2 = "Tipo de Dato de texto String!"
        val myString3 = "$myString, prueba $myString2" //Aquí se concatenó los datos con "$" se hace eso para hacer referencia de que tome todos los datos que se va a imprimir en uno solo, es decir sin tener que poner myString + " " + myString2, al poner $ lo que está adentro lo toma como texto, Ej: $myString hola $myString2, "$" solo se pone a las funciones que ya tiene asignado un dato, por ej al texto "hola" ya no se pone $hola, ya que no es una función con dato asginado ya sea (string, var, val, etc)
        println(myString3)

                                /* Enteros: (Byte, Short, Int, Long) */
        //Byte: Números entre -127 y 128 (positivo +)
        //Short: Números entre -32.768 y 32.767 (positivo +) y Así Sucesivamente entre los demás enteros
        //Se recomienda utilizar solamente algunos de estos enteros dependiendo de la cantidad de datos que vamos a representar, para así bajar el tamaño (peso) y el consumo de la ram de la app, de todas formas para usos de numeros enteros se usa mas (Int) y para numeros muy grandes (Long)

        val myInt  = 15
        val myInt2 = 20
        val myInt3 = myInt + myInt2 //Se puede hacer operaciones matemáticas (+.-.*./) ya que estamos usando numeros
        println(myInt3)

                                 /*Decimales (Float, Double)*/
        //Float: Representa Numeros decimal de hasta 32 bits
        //Double: Representa Numeros decimal de 1 a 64 bits
        //¡Casi siempre se trabaja con Double!

        val myFloat   = 1.5f
        val myDouble  = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 //Aquí al Double se puso un numero entero de tipo (Int), sin embargo kotlin ya lo reconoce como un Int aunque le hayamos dicho que es un double, Por ejemplo: si le pongo "1.0" me toma como "Double" y si pongo "1" me toma como "Int"
        val myDouble4 = myDouble + myDouble2 + myDouble3 + myFloat
        println(myDouble4)

                                      /*Boolean (Bool)*/
        //Bool: Con este solo se puede describir las condiciones verdaderas "true" o falsas "false"

        val myBool = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2 //Aquí da error ya que no se pueden hacer operaciones matemáticas con los "Bool", ya que es un tipo de dato lógico no de números o operaciones
        println(myBool == myBool2) //Aquí se compara si los datos son iguales Ej: True es igual a False ? R: Falso, ya que no son iguales
        println(myBool && myBool2) //Aquí usamos el operador lógico Incondicional "&" ampersan, aqui estamos comprobando si la suma lógica de los (Bool) son "True" o "False", R: son falso ya que para que sean verdaderos todas deben ser verdaderas
    }


                                    /*Lección 3: Sentencia If*/
    //Operadores condicionales:
    /*
       >  Mayor que
       <  Menor que
       >= Mayor o igual que
       <= Menor o igual que
       == Igualdad
       != Desigualdad

     */
     private fun sentenciaIf() {

         val myNumber = 10
         if (myNumber < 10) {
             println("$myNumber es menor que 10")
         }

         else {
               println("$myNumber es mayor que 10")
         }

         if (myNumber == 10) {
             println("$myNumber es igual que 10")
         }
     }

                            /*Lección 3 Parte 2: Sentencia Else If*/
    //Operadores Lógicos:
    /*
       && Operador "y"
       || Operador "o"
       !  Operador "no"
    */

    private fun sentenciaIf2() {

        val myNumber = 15
        if (!(myNumber < 10 && myNumber >= 5 || myNumber == 53)) {  //Al poner (!("datos")) se va a contradecir todo es decir si era: myNumber < 10, ahora sería: myNumber > 10
            println("$myNumber es menor que 10 y mayor o igual que 5 o es igual a 53")
        }

        else if (myNumber == 60) {
            println("$myNumber es igual a 60")
        }

        else if (myNumber != 70) {
            println("$myNumber no es igual a 70")
        }

        else {
            println("$myNumber es mayor que 10 o menor que 5 y no es igual a 53")
        }

        if (myNumber == 10) {
            println("$myNumber es igual que 10")
        }


    }

}

