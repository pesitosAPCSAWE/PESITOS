import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pesitos — educación financiera para jóvenes colombianos.
 *
 * This is the main class. It contains the main method, which runs the whole app.
 *
 
 */
public class Pesitos {

    // Scanner is shared across all methods in this class.
    // Making it a static field (one per class) is simpler than passing it everywhere.
    private static Scanner input = new Scanner(System.in);

    // List of all lessons in the app.
    private static ArrayList<Lesson> lessons = new ArrayList<Lesson>();

    // 2D array that tracks the user's progress.
   
    private static int[][] progress;

    public static void main(String[] args) {
        // STEP 1: Build all the lessons.
        buildLessons();

        // STEP 2: Initialize the progress 2D array.
        // Each row is a lesson. The columns are the questions in that lesson.
        progress = new int[lessons.size()][];
        for (int i = 0; i < lessons.size(); i++) {
            int numQuestions = lessons.get(i).getNumberOfQuestions();
            progress[i] = new int[numQuestions];
          
        }

        // STEP 3: Show the welcome message.
        printWelcome();

        // STEP 4: Main menu loop. Runs until the user chooses "salir" (exit).
        boolean running = true;
        while (running) {
            printMenu();
            String choice = input.nextLine().trim();

            if (choice.equals("1")) {
                runLesson(0);   // Impuestos
            } else if (choice.equals("2")) {
                runLesson(1);   // Facturas
            } else if (choice.equals("3")) {
                runLesson(2);   // Cuenta bancaria
            } else if (choice.equals("4")) {
                runLesson(3);   // Presupuesto
            } else if (choice.equals("5")) {
                runLesson(4);   // Intereses
            } else if (choice.equals("6")) {
                printProgress();
            } else if (choice.equalsIgnoreCase("salir") || choice.equals("0")) {
                running = false;
            } else {
                System.out.println("\nOpción no válida. Intenta de nuevo.\n");
            }
        }

        // STEP 5: Goodbye message.
        System.out.println("\n¡Gracias por usar Pesitos! Recuerda: de pesito en pesito.\n");
    }

   
    // buildLessons() — creates all the lessons and their questions.
    // Each lesson teaches one financial literacy topic in Spanish.
 
    public static void buildLessons() {

        // ----- LESSON 1: Impuestos (taxes) -----
        Lesson impuestos = new Lesson(
            "Impuestos",
            "Los impuestos son dinero que le pagas al gobierno. Vamos a aprender los conceptos básicos."
        );
        impuestos.addQuestion(new Question(
            "¿Qué es la declaración de renta en Colombia?",
            new String[] {
                "Un impuesto que pagan solo los ricos",
                "Un reporte anual que algunos colombianos deben hacer a la DIAN",
                "Un descuento que te hace el banco",
                "Un tipo de cuenta de ahorros"
            },
            1,
            "Correcto: es un reporte anual a la DIAN. No todos los colombianos están obligados — depende de cuánto ganas, cuánto tienes, y otros factores."
        ));
        impuestos.addQuestion(new Question(
            "¿A partir de qué edad puedes estar obligado a declarar renta en Colombia?",
            new String[] {
                "Desde los 15 años",
                "Desde los 18 años, si cumples ciertos topes de ingresos o patrimonio",
                "Solo cuando eres pensionado",
                "Nunca, si eres estudiante"
            },
            1,
            "Desde los 18 años puedes estar obligado, pero solo si tus ingresos, patrimonio, o consumos superan los topes que publica la DIAN cada año."
        ));
        impuestos.addQuestion(new Question(
            "¿Qué pasa si no declaras renta estando obligado a hacerlo?",
            new String[] {
                "Nada, no hay consecuencias",
                "Te pueden cobrar multas e intereses de mora",
                "Te quitan tu cédula",
                "Te suben los impuestos del próximo año a propósito"
            },
            1,
            "La DIAN puede imponerte multas e intereses. Entre más tarde lo hagas, más caro te sale. Por eso es importante saber si estás obligado."
        ));
        lessons.add(impuestos);

        // ----- LESSON 2: Facturas (bills) -----
        Lesson facturas = new Lesson(
            "Facturas",
            "Pagar facturas bien (y a tiempo) es una de las habilidades más importantes para un adulto joven."
        );
        facturas.addQuestion(new Question(
            "¿Qué información NO debe faltar en una factura?",
            new String[] {
                "La fecha de vencimiento",
                "El nombre del primo del dueño",
                "El color favorito del cliente",
                "La temperatura del día"
            },
            0,
            "La fecha de vencimiento es clave. Si no la revisas, puedes terminar pagando tarde e incurriendo en intereses."
        ));
        facturas.addQuestion(new Question(
            "Si pagas una factura después de la fecha de vencimiento, ¿qué es lo más común que pase?",
            new String[] {
                "Nada, es igual a pagar a tiempo",
                "Te cobran intereses de mora",
                "Te regalan un descuento",
                "Te cambian de proveedor automáticamente"
            },
            1,
            "Casi siempre te cobran intereses de mora. En servicios como luz o agua, pagar tarde varias veces puede costar más de lo que crees."
        ));
        facturas.addQuestion(new Question(
            "¿Cuál es una buena costumbre para no olvidar pagar facturas?",
            new String[] {
                "Pagar solo cuando te llamen a cobrar",
                "Programar pagos automáticos o recordatorios en el celular",
                "Ignorarlas hasta que te corten el servicio",
                "Esperar a fin de año y pagar todo junto"
            },
            1,
            "Los pagos automáticos o recordatorios en el celular son la manera más fácil de no olvidar. La mayoría de bancos colombianos lo permiten gratis."
        ));
        lessons.add(facturas);

        // ----- LESSON 3: Cuenta bancaria (bank account) -----
        Lesson cuenta = new Lesson(
            "Cuenta Bancaria",
            "Abrir y manejar una cuenta bancaria es el primer paso para tener control de tu plata."
        );
        cuenta.addQuestion(new Question(
            "¿Cuál es la diferencia principal entre una cuenta de ahorros y una corriente?",
            new String[] {
                "No hay ninguna diferencia",
                "La de ahorros genera intereses; la corriente generalmente no",
                "La corriente es solo para adultos mayores",
                "La de ahorros es ilegal antes de los 30"
            },
            1,
            "La cuenta de ahorros te paga un pequeño interés por tener tu plata ahí. La corriente se usa más para transacciones frecuentes."
        ));
        cuenta.addQuestion(new Question(
            "En Colombia, apps como Nequi y Daviplata son:",
            new String[] {
                "Juegos de celular",
                "Billeteras digitales donde puedes guardar y enviar plata",
                "Servicios de televisión",
                "Redes sociales"
            },
            1,
            "Son billeteras digitales. Te dan un número de cuenta, puedes recibir plata, enviar, y pagar en muchas tiendas sin tener una cuenta bancaria tradicional."
        ));
        cuenta.addQuestion(new Question(
            "¿Qué es una tarjeta débito?",
            new String[] {
                "Una tarjeta que usa plata que SÍ tienes en tu cuenta",
                "Una tarjeta que te presta plata del banco",
                "Una tarjeta solo para viajes",
                "Una tarjeta sin ningún uso real"
            },
            0,
            "La tarjeta débito usa tu propia plata. Es diferente a la tarjeta de crédito, que te presta plata que luego debes devolver."
        ));
        lessons.add(cuenta);

        // ----- LESSON 4: Presupuesto (budget) -----
        Lesson presupuesto = new Lesson(
            "Presupuesto",
            "Un presupuesto es un plan para tu plata. Te ayuda a decidir ANTES de gastar, no después."
        );
        presupuesto.addQuestion(new Question(
            "Si ganas $1.000.000 al mes, ¿cuánto deberías intentar ahorrar como mínimo según la regla 50/30/20?",
            new String[] {
                "$0",
                "$50.000",
                "$200.000 (el 20%)",
                "$900.000"
            },
            2,
            "La regla 50/30/20 dice: 50% necesidades, 30% gustos, 20% ahorro. Sobre $1.000.000, eso es $200.000 de ahorro."
        ));
        presupuesto.addQuestion(new Question(
            "¿Cuál de estos es un GASTO FIJO?",
            new String[] {
                "Un helado ocasional",
                "El arriendo mensual",
                "Un regalo sorpresa",
                "Una multa"
            },
            1,
            "El arriendo es fijo: se repite cada mes, por el mismo valor. Los gastos fijos son los primeros que debes identificar en un presupuesto."
        ));
        presupuesto.addQuestion(new Question(
            "¿Qué es más importante al empezar a presupuestar?",
            new String[] {
                "Escribir todo lo que gastas durante al menos una semana",
                "Esperar a ganar más plata",
                "Ponerte una meta imposible",
                "Comparar tu sueldo con el de tus amigos"
            },
            0,
            "Antes de planear, hay que observar. Si no sabes a dónde se va tu plata, no puedes manejarla. Una semana de registro ya te enseña muchísimo."
        ));
        lessons.add(presupuesto);

        // ----- LESSON 5: Intereses (interest) -----
        Lesson intereses = new Lesson(
            "Intereses",
            "El interés es el costo (o ganancia) por usar plata. Entenderlo te puede salvar de deudas trampa."
        );
        intereses.addQuestion(new Question(
            "Si sacas un préstamo al 30% anual y no pagas nada, ¿aproximadamente en cuántos años se duplica lo que debes?",
            new String[] {
                "En 30 años",
                "En 10 años",
                "Aproximadamente en 2.5 años",
                "Nunca"
            },
            2,
            "Regla del 72: divide 72 entre la tasa de interés. 72 / 30 ≈ 2.4 años. Por eso las deudas al 30% son tan peligrosas."
        ));
        intereses.addQuestion(new Question(
            "El interés COMPUESTO es mejor para ti cuando:",
            new String[] {
                "Estás endeudado",
                "Estás ahorrando o invirtiendo",
                "Pagas impuestos",
                "Compras ropa"
            },
            1,
            "Cuando ahorras, el interés compuesto es tu amigo: generas interés sobre el interés. Cuando debes, es tu enemigo: la deuda crece sobre la deuda."
        ));
        intereses.addQuestion(new Question(
            "Una compra a \"cero interés\" en 12 cuotas, ¿siempre es realmente gratis?",
            new String[] {
                "Sí, siempre",
                "No necesariamente — a veces hay cuotas de manejo u otros cargos",
                "Solo si pagas en efectivo",
                "Solo si compras en diciembre"
            },
            1,
            "Muchas veces el \"sin interés\" viene con cuotas de manejo, seguros obligatorios, o precios inflados. Siempre pregunta cuál es el COSTO TOTAL al final."
        ));
        lessons.add(intereses);
    }

   
    // printWelcome() — shows the splash screen.
 
    public static void printWelcome() {
        System.out.println();
        System.out.println("===========================================");
        System.out.println("            P E S I T O S                  ");
        System.out.println("   Educación financiera, un pesito         ");
        System.out.println("   a la vez.                                ");
        System.out.println("===========================================");
        System.out.println();
    }

  
    // printMenu() — shows the main menu with lessons + progress option.
  
    public static void printMenu() {
        System.out.println("---- MENÚ PRINCIPAL ----");
        for (int i = 0; i < lessons.size(); i++) {
            // Number from 1, not 0, because that's friendlier for users
            System.out.println((i + 1) + ". " + lessons.get(i).getTitle());
        }
        System.out.println((lessons.size() + 1) + ". Ver mi progreso");
        System.out.println("0. Salir");
        System.out.print("\nEscoge una opción: ");
    }

   
    // runLesson(int) — runs a single lesson quiz from start to finish.
    // Takes the lesson index as a parameter.
   
    public static void runLesson(int lessonIndex) {
        // Safety check: make sure the index is valid.
        if (lessonIndex < 0 || lessonIndex >= lessons.size()) {
            System.out.println("Lección no encontrada.");
            return;
        }

        Lesson lesson = lessons.get(lessonIndex);

        System.out.println();
        System.out.println("====== " + lesson.getTitle().toUpperCase() + " ======");
        System.out.println(lesson.getIntro());
        System.out.println();

        int correctCount = 0;
        int totalQuestions = lesson.getNumberOfQuestions();

        // Loop through every question in this lesson.
        for (int q = 0; q < totalQuestions; q++) {
            Question question = lesson.getQuestion(q);

            System.out.println("Pregunta " + (q + 1) + " de " + totalQuestions + ":");
            System.out.println(question.getQuestionText());

            // Show the 4 options labeled A, B, C, D.
            String[] opts = question.getOptions();
            String[] letters = {"A", "B", "C", "D"};
            for (int i = 0; i < opts.length; i++) {
                System.out.println("  " + letters[i] + ") " + opts[i]);
            }

            // Get the user's answer. Keep asking until it's valid.
            int userAnswer = askForAnswer();

            // Update the 2D progress array.
            if (question.isCorrect(userAnswer)) {
                progress[lessonIndex][q] = 1;
                correctCount++;
                System.out.println("\n¡Correcto! ✓");
            } else {
                progress[lessonIndex][q] = -1;
                System.out.println("\nIncorrecto. ✗");
                System.out.println("La respuesta correcta era: "
                    + letters[question.getCorrectIndex()] + ") "
                    + opts[question.getCorrectIndex()]);
            }

            // Explanation always shown — right or wrong, there's something to learn.
            System.out.println("\nExplicación: " + question.getExplanation());
            System.out.println();
        }

        // End-of-lesson summary.
        System.out.println("------ RESULTADO ------");
        System.out.println("Acertaste " + correctCount + " de " + totalQuestions + " preguntas.");

        double percentage = (double) correctCount / totalQuestions * 100.0;
        System.out.println("Porcentaje: " + Math.round(percentage) + "%");

        // A little encouragement based on score.
        if (percentage >= 80) {
            System.out.println("¡Excelente! Dominas este tema.");
        } else if (percentage >= 50) {
            System.out.println("Vas bien. Repasa la lección y vuelve a intentarlo.");
        } else {
            System.out.println("No te preocupes. Aprender toma tiempo. Revisa las explicaciones.");
        }
        System.out.println();
    }

   
    // askForAnswer() — reads the user's answer (A/B/C/D or 1-4)
    // and returns it as an int from 0 to 3. Keeps asking until valid.
    
    public static int askForAnswer() {
        while (true) {
            System.out.print("Tu respuesta (A/B/C/D): ");
            String answer = input.nextLine().trim().toLowerCase();

            if (answer.equals("a") || answer.equals("1")) return 0;
            if (answer.equals("b") || answer.equals("2")) return 1;
            if (answer.equals("c") || answer.equals("3")) return 2;
            if (answer.equals("d") || answer.equals("4")) return 3;

            System.out.println("Respuesta no válida. Escribe A, B, C, o D.");
        }
    }

   
    // printProgress() — shows the user their progress across all lessons.
    // Uses the 2D progress array.
   
    public static void printProgress() {
        System.out.println();
        System.out.println("====== TU PROGRESO ======");

        int totalAnswered = 0;
        int totalCorrect = 0;

        // Loop through each lesson (row of the 2D array).
        for (int i = 0; i < progress.length; i++) {
            String title = lessons.get(i).getTitle();

            int correctInLesson = 0;
            int answeredInLesson = 0;

            // Loop through each question in that lesson (column).
            for (int j = 0; j < progress[i].length; j++) {
                if (progress[i][j] == 1) {
                    correctInLesson++;
                    answeredInLesson++;
                } else if (progress[i][j] == -1) {
                    answeredInLesson++;
                }
            }

            totalCorrect += correctInLesson;
            totalAnswered += answeredInLesson;

            // Display per-lesson progress.
            if (answeredInLesson == 0) {
                System.out.println(title + ": (sin empezar)");
            } else {
                System.out.println(title + ": "
                    + correctInLesson + "/" + progress[i].length
                    + " correctas  [" + buildProgressBar(correctInLesson, progress[i].length) + "]");
            }
        }

        // Overall score.
        System.out.println("-----------------------------");
        if (totalAnswered == 0) {
            System.out.println("Aún no has contestado ninguna pregunta. ¡Anímate a empezar!");
        } else {
            double overall = (double) totalCorrect / totalAnswered * 100.0;
            System.out.println("Total: " + totalCorrect + " de " + totalAnswered
                + " (" + Math.round(overall) + "%)");
        }
        System.out.println();
    }

    
    // buildProgressBar(correct, total) — helper that returns a
    // simple text progress bar like "[###...]" based on the score.
 
    public static String buildProgressBar(int correct, int total) {
        String bar = "";
        for (int i = 0; i < total; i++) {
            if (i < correct) {
                bar += "#";
            } else {
                bar += ".";
            }
        }
        return bar;
    }
}
