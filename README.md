# Pesitos

> **Educación financiera, un pesito a la vez.**
> A free, Spanish-language financial literacy app for young Colombians.

[![Made with Java](https://img.shields.io/badge/Made_with-Java-orange.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![AP with WE Service](https://img.shields.io/badge/AP_with_WE_Service-2025--2026-blue.svg)](https://apcentral.collegeboard.org/courses/ap-with-we-service)

---

## About

**Pesitos** is a console-based quiz app that teaches young Colombians the financial basics nobody taught them: taxes, bills, bank accounts, budgeting, and interest. It's modeled after Duolingo — short lessons, multiple-choice questions, and instant feedback in Spanish.

The app was built as the technical artifact of an **AP with WE Service** project at Los Nogales School (Bogotá, Colombia), in response to a survey of 48 young Colombians and 34 adults that revealed:

- **64%** of young Colombians don't understand how taxes work
- **67%** have never made a monthly budget
- **56%** of adults learned about money on their own
- **0%** learned anything about finance at school

The cycle repeats. This app is a small response.

---

## How to run

### Requirements
- Java JDK 11 or newer ([download](https://www.oracle.com/java/technologies/downloads/))


---

##  What's inside

The app teaches **5 lessons**, with 3 questions each:

| # | Lección | What it covers |
|---|---|---|
| 1 | **Impuestos** | What declaración de renta is, who has to file, what happens if you don't |
| 2 | **Facturas** | Reading bill due dates, late fees, automating payments |
| 3 | **Cuenta Bancaria** | Savings vs. checking, Nequi/Daviplata, debit vs. credit |
| 4 | **Presupuesto** | The 50/30/20 rule, fixed vs. variable expenses, getting started |
| 5 | **Intereses** | Compound interest, the rule of 72, "0% interest" traps |

After each question the app shows a one-sentence explanation — so the learning happens whether the user got it right or wrong. Progress across all 5 lessons is tracked in a 2D array and shown as a text progress bar.

---

##  Code structure


```
pesitos/
├── Pesitos.java     # Main class: menu loop, quiz logic, progress tracking
├── Lesson.java      # Holds a title + intro + ArrayList<Question>
├── Question.java    # Holds a question, 4 options, correct answer, explanation
├── LICENSE
├── README.md
└── CONTRIBUTING.md
```



## Contributing

This is an educational project and contributions are welcome — especially:
- **More lessons** (insurance, taxes for freelancers, investing basics)
- **More questions** in existing lessons
- **Translations** to other Spanish-speaking countries' contexts
- **Bug fixes**

See [CONTRIBUTING.md](CONTRIBUTING.md) for how to submit a pull request.

---

##  Project context

This app was built as part of an **AP with WE Service** project. The full project includes:
- A primary-research survey of 34 young Colombians and 25 adults
- A  advocacy campaign (tik tok and youtube )
- An English awareness video for global reach
- A written portfolio documenting the full process

If you're a student in another AP CSA class working on AP with WE Service, feel free to fork this repo and adapt it to your own community.

---

##  License

[MIT](LICENSE) — free to use, modify, share. Just keep the credit.

---

##  Credits

Built by Juanita Duran at Los Nogales School (Bogotá, Colombia) for AP Computer Science A, 2025–2026.

*De pesito en pesito.* 

#APWEServe
