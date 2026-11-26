# 🔐 Java File Encryption and Decryption System

**A Java-Based File Security Application Using XOR Encryption**

## 📌 1. Project Overview

The Java File Encryption and Decryption System is a Java-based application developed to demonstrate the fundamental concepts of cryptography and file security.

The application converts readable file contents into an unreadable form using the XOR (Exclusive OR) operation. It uses a password-based repeating key to process file data at the byte level.

The same password is required during decryption to recover the original file contents.

This project provides practical knowledge of Java programming, file handling, password-based key processing, byte-level operations, and basic cryptographic techniques.

## 🎯 2. Project Objectives

The major objectives of this project are:

- To understand the basic principles of cryptography.
- To implement file encryption and decryption using Java.
- To understand the XOR encryption technique.
- To implement password-based key processing.
- To perform encryption and decryption at the byte level.
- To understand Java file handling and input/output streams.
- To learn how the same key can be used for encryption and decryption.
- To gain practical experience in developing a Java application.

## 📖 3. Abstract

Data security is an important aspect of modern computing. Files often contain personal information, academic documents, business records, and other important data that should be protected from unauthorized access.

This project introduces a basic file encryption and decryption mechanism using Java.

The application implements XOR encryption, which operates on individual bytes of file data using a key obtained from the user's password. During encryption, the original file contents are converted into an encrypted form. During decryption, the same key is applied again to recover the original data.

The project demonstrates the practical implementation of cryptographic operations and file handling in Java. It also helps students understand how encryption techniques can be integrated into software applications.

## 🛠️ 4. Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| Java JDK 17 | Compilation and execution |
| Maven | Project management and build configuration |
| File Handling | Reading and writing files |
| XOR Operation | Encryption and decryption |
| Byte Processing | Processing file contents |
| Password-Based Key | Creating the repeating XOR key |
| Object-Oriented Programming | Organizing application components |

## 🔑 5. Encryption Algorithm

This project uses the XOR (Exclusive OR) encryption technique.

XOR is a logical operation that compares two binary values and produces an output based on whether the corresponding bits are different.

### XOR Truth Table

| Input A | Input B | Output |
|---|---|---|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |

### Mathematical Principle

The XOR operation has an important property: applying the same key twice restores the original value.

**Encryption:**

`Encrypted Data = Original Data XOR Key`

**Decryption:**

`Original Data = Encrypted Data XOR Key`

### Example

Suppose:

- Original Data = `1010`
- Key = `1100`

Encryption:

```text
  1010
XOR 1100
--------
  0110
```

Decryption:

```text
  0110
XOR 1100
--------
  1010
```

The original data is recovered by applying the same key again.

### Password-Based Key Processing

The application converts the entered password into a byte array. It then repeatedly uses those password bytes while processing the file bytes.

The XOR operation is performed as follows:

`outputByte = inputByte XOR key[i % key.length]`

This allows the application to process files of different sizes.

## ⚙️ 6. Working Principle

The application follows a sequence of operations to encrypt and decrypt files.

### Encryption Process

1. The user selects the file that needs to be encrypted.
2. The user provides a password.
3. The application converts the password into a byte-based key.
4. The selected file is opened and its contents are read as bytes.
5. The XOR operation is applied to the file bytes using the repeating key.
6. The processed bytes are written into a new encrypted output file.
7. The encrypted file is generated.

### Decryption Process

1. The user selects the previously encrypted file.
2. The user enters the same password used during encryption.
3. The application generates the corresponding key.
4. The encrypted file contents are read as bytes.
5. The XOR operation is applied again using the same key.
6. The original file contents are recovered.
7. The decrypted data is saved into an output file.

## 🔄 7. Encryption and Decryption Workflow

```text
             START
               |
               v
          Select File
               |
               v
         Enter Password
               |
               v
      Convert Password to Key
               |
               v
         Read File Bytes
               |
               v
       Apply XOR Operation
               |
               v
       Generate Output File
               |
               v
      Encryption Completed
               |
               v
       Select Decryption
               |
               v
       Enter Same Password
               |
               v
      Read Encrypted File
               |
               v
       Apply XOR Operation
               |
               v
      Recover Original Data
               |
               v
       Save Decrypted File
               |
               v
              END
```

## ✨ 8. Key Features

- **File Encryption:** Converts original file contents into an encrypted form.
- **File Decryption:** Recovers original file contents using the correct password.
- **Password-Based Key Processing:** Uses password bytes as the XOR key.
- **XOR-Based Processing:** Performs encryption and decryption using the XOR operation.
- **Byte-Level Processing:** Processes file contents in byte format.
- **File Input and Output:** Reads input files and generates encrypted or decrypted output files.
- **Command-Line Support:** Supports command-line arguments for encryption and decryption.
- **Menu-Based Interface:** Provides an interactive menu for user operations.

## 💻 9. System Requirements

### Hardware Requirements

- Computer or Laptop
- Minimum 4 GB RAM recommended
- Sufficient storage space for input and output files

### Software Requirements

- Operating System: Windows / Linux / macOS
- Java Development Kit (JDK 17 or later)
- Apache Maven
- Terminal or command prompt

## 🚀 10. Installation and Execution

Follow these steps to run the Java application.

### Step 1: Install Java

Download and install the Java Development Kit (JDK).

Check whether Java is installed:

```bash
java -version
```

Check the Java compiler:

```bash
javac -version
```

### Step 2: Install Maven

Check whether Maven is installed:

```bash
mvn -version
```

### Step 3: Clone the Repository

```bash
git clone https://github.com/cybernd001/Java-File-Encryption-Project.git
```

### Step 4: Navigate to the Project Directory

```bash
cd Java-File-Encryption-Project
```

### Step 5: Build the Project

Compile and package the application using Maven:

```bash
mvn clean package
```

### Step 6: Execute the Application

Run the application:

```bash
java -cp target/classes FileCryptoTool
```

### Command-Line Execution

The application also supports command-line operations.

**Encryption:**

```bash
java -cp target/classes FileCryptoTool encrypt input.txt output.enc mypassword
```

**Decryption:**

```bash
java -cp target/classes FileCryptoTool decrypt output.enc restored.txt mypassword
```

Replace the filenames and password with your own values.

## 📂 11. Project Structure

The project follows the standard Maven directory structure.

```text
Java-File-Encryption-Project/
│
├── src/
│   └── main/
│       └── java/
│           └── FileCryptoTool.java
│
├── .gitignore
├── pom.xml
├── README.md
└── LICENSE
```

### Directory Explanation

| File / Directory | Description |
|---|---|
| `src/main/java/` | Contains Java source code |
| `FileCryptoTool.java` | Main application and supporting classes |
| `.gitignore` | Excludes unnecessary files from Git |
| `pom.xml` | Maven project configuration |
| `README.md` | Project documentation |
| `LICENSE` | Apache License 2.0 |

## 👨‍💻 12. Team Members and Contributions

This project was developed as a collaborative academic project.

### Member 1: Nagul Dev N P

**Responsibilities: Project
