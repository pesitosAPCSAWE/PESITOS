# Contributing to Pesitos

Thanks for wanting to contribute! This is a small educational project, so the rules are simple.

## Ways to help

- **Add a question** to an existing lesson
- **Add a whole new lesson** (e.g., insurance, investing for beginners, taxes for freelancers)
- **Fix a bug** if you find one
- **Improve explanations** — clearer language, more accurate info, better examples
- **Translate or adapt** content for other besides Spanish-speaking countries! I made it for colombia first but lets turn it globalll

## How to submit a contribution

1. **Fork** this repository (button at the top right of the GitHub page)
2. **Clone** your fork to your computer:
   ```bash
   git clone https://github.com/YOUR_USERNAME/pesitos.git
   ```
3. **Make your changes** — keep them small and focused on one thing at a time
4. **Test** that the app still compiles and runs:
   ```bash
   javac *.java
   java Pesitos
   ```
5. **Commit** with a clear message:
   ```bash
   git add .
   git commit -m "Add new question to Impuestos lesson about IVA"
   ```
6. **Push** to your fork:
   ```bash
   git push origin main
   ```



## Style guide for new questions

When adding questions, please follow this format:

```java
miLeccion.addQuestion(new Question(
    "¿Pregunta clara y específica?",
    new String[] {
        "Opción A (incorrecta pero plausible)",
        "Opción B (la correcta)",
        "Opción C (incorrecta)",
        "Opción D (incorrecta o un poco absurda)"
    },
    1,  // index of the correct answer (0–3)
    "Explicación clara en una o dos frases. Importante: explica POR QUÉ, no solo qué."
));
```

**Good question principles:**
- The wrong answers should be plausible, not obviously silly
- The explanation should teach something, even to people who got it right


## Code of conduct

Be kind. This is a learning project — treat contributors and learners with respect.

## Questions?

Open an Issue on GitHub and we'll talk it through.

— *De pesito en pesito.* 
