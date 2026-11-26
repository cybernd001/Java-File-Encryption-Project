# 🔐 Java File Encryption and Decryption System

<p align="center">

**A Java-Based File Security Application Using XOR Encryption**

</p>

---

## 📌 1. Project Overview

The **Java File Encryption and Decryption System** is a Java-based application developed to demonstrate the fundamental concepts of cryptography and file security.

The main purpose of this project is to protect file contents by converting readable data into an unreadable format through an encryption process. The application uses the **XOR (Exclusive OR) operation** to perform encryption and decryption on file data.

A password-based key is generated and used during the encryption and decryption process. The application reads the contents of a file in byte format, performs XOR operations using the generated key, and produces an encrypted output file.

The same password is required to decrypt the encrypted file and recover the original contents.

This project provides practical knowledge of Java programming, file handling, password-based key generation, byte-level data processing, and basic cryptographic techniques.

## 🎯 2. Project Objectives

The major objectives of this project are:

- To understand the basic principles of cryptography.
- To implement file encryption and decryption using Java.
- To understand the XOR (Exclusive OR) encryption technique.
- To implement password-based key generation.
- To perform encryption and decryption at the byte level.
- To understand Java file handling and input/output streams.
- To protect file contents by converting readable data into encrypted data.
- To gain practical experience in developing a real-world Java application.
- To understand how the same encryption key can be used for both encryption and decryption.

## 📖 3. Abstract

Data security is an important aspect of modern computing. Files often contain personal information, academic documents, business records, and other important data that should be protected from unauthorized access.

This project introduces a basic file encryption and decryption mechanism using the Java programming language.

The application implements the XOR encryption technique, which operates on individual bytes of file data using a password-derived key. During encryption, the original file contents are converted into an encrypted form. During decryption, the same key is applied again to recover the original data.

The project demonstrates the practical implementation of cryptographic operations and file handling in Java. It also helps students understand how encryption techniques can be integrated into software applications to provide basic data protection.

## 🛠️ 4. Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| Java JDK | Compilation and execution |
| File Handling | Reading and writing files |
| XOR Operation | Encryption and decryption |
| Byte Processing | Processing file contents |
| Password-Based Key | Generating the encryption key |
| Object-Oriented Programming | Organizing application components |

## 🔑 5. Encryption Algorithm

This project uses the **XOR (Exclusive OR) encryption technique**.

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

- Original Data = 1010
- Key = 1100

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

## ⚙️ 6. Working Principle

The application follows a sequence of operations to encrypt and decrypt files.

### Encryption Process

1. The user selects the file that needs to be encrypted.
2. The user provides a password.
3. The application generates an encryption key using the password.
4. The selected file is opened and its contents are read as bytes.
5. The XOR operation is applied to the file bytes using the generated key.
6. The processed bytes are written into a new encrypted output file.
7. The encrypted file is generated successfully.

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
     Generate Password Key
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

The application demonstrates the following features:

- **File Encryption:** Converts original file contents into encrypted data.
- **File Decryption:** Recovers the original file contents using the correct password.
- **Password-Based Key Generation:** Uses a password to generate the key required for encryption and decryption.
- **XOR-Based Processing:** Performs encryption and decryption using the XOR logical operation.
- **Byte-Level Processing:** Processes file contents in byte format.
- **File Input and Output:** Reads input files and generates encrypted or decrypted output files.
- **Data Recovery:** Allows the original file contents to be recovered through the reverse XOR operation.

## 💻 9. System Requirements

### Hardware Requirements

- Computer or Laptop
- Minimum 4 GB RAM recommended
- Sufficient storage space for input and output files

### Software Requirements

- Operating System: Windows / Linux / macOS
- Java Development Kit (JDK)
- Java-compatible IDE or terminal
- File system access

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

### Step 2: Clone the Repository

Clone the GitHub repository using:

```bash
git clone https://github.com/cybernd001/Java-File-Encryption-Project.git
```

### Step 3: Open the Project

Navigate to the downloaded project folder:

```bash
cd Java-File-Encryption-Project
```

### Step 4: Compile the Java Program

Compile the main Java source file:

```bash
javac FileCryptoTool.java
```

### Step 5: Execute the Program

Run the application:

```bash
java FileCryptoTool
```

**Note:** Adjust the compilation and execution commands according to the actual Java filenames and package structure in the repository.

## 📂 11. Project Structure

The repository can be organized in the following manner:

```text
Java-File-Encryption-Project/
│
├── FileCryptoTool.java
│
├── README.md
│
├── screenshots/
│   ├── encryption.png
│   └── decryption.png
│
└── sample-files/
    └── sample.txt
```

The actual project structure may vary depending on the implementation.

## 👨‍💻 12. Team Members and Contributions

This project was developed as a collaborative academic project.

### Member 1: Nagul Dev N P

**Responsibilities: Project Planning and Algorithm Design**

- Planned the overall project structure.
- Performed requirement analysis.
- Studied the fundamental XOR encryption principle.
- Prepared the encryption and decryption algorithm.
- Designed the project flowchart.
- Contributed to understanding the overall working process.

### Member 2: Tanish Prajapati

**Responsibilities: Encryption Logic and Key Generation**

- Developed and worked on the FileCipher class.
- Implemented password-based key creation.
- Worked on XOR-based byte processing.
- Contributed to the implementation of encryption and decryption logic.
- Studied the internal working of the encryption process.

### Member 3: Himanshu Dhoke

**Responsibilities: Project Development and Implementation**

- Contributed to the project implementation.
- Worked on integrating different project components.
- Assisted in developing the application workflow.
- Contributed to testing and understanding the program execution.
- Participated in the overall project development.

## 📚 13. Concepts Learned

Through this project, we gained practical knowledge of several Java programming concepts:

1. **Cryptography:** Understanding the basic concepts of encryption and decryption.
2. **XOR Operations:** Learning how XOR can be used for reversible data transformation.
3. **File Handling:** Reading data from files and writing processed data into output files.
4. **Byte Processing:** Understanding how files can be processed at the byte level.
5. **Password-Based Key Generation:** Understanding the relationship between passwords and encryption keys.
6. **Object-Oriented Programming:** Organizing code using Java classes and methods.
7. **Problem Solving:** Designing algorithms and implementing logical solutions.
8. **Team Collaboration:** Working together to develop and complete a software project.

## ⚠️ 14. Limitations

Although this project demonstrates the fundamentals of encryption, it has some limitations:

- XOR encryption alone is not considered secure for protecting sensitive information.
- The security of the encryption depends heavily on the key generation method.
- There is no guaranteed authentication or integrity verification.
- A weak or predictable password can reduce the effectiveness of the encryption.
- The application is primarily developed for educational and demonstration purposes.

**Security Note:** This project is intended for learning basic cryptographic concepts. XOR encryption should not be used as a replacement for modern, authenticated encryption algorithms such as AES-GCM.

## 🔮 15. Future Enhancements

The project can be improved in several ways:

- Implement advanced encryption algorithms such as AES.
- Add a graphical user interface (GUI).
- Support multiple file formats.
- Add drag-and-drop file selection.
- Improve password security using a secure key derivation function.
- Add file integrity verification.
- Provide better error handling and user feedback.
- Implement secure file deletion options.
- Add support for batch file encryption and decryption.

## 🎓 16. Conclusion

The Java File Encryption and Decryption System provides a practical introduction to the fundamentals of cryptography and data security.

By implementing XOR-based encryption and decryption, the project demonstrates how file contents can be transformed into encrypted data and recovered using the same key.

The development process provided valuable experience in Java programming, file handling, byte-level processing, password-based key generation, algorithm design, and teamwork.

Overall, this project helped us understand the basic working principles of encryption and how cryptographic concepts can be implemented in real software applications.

## 📄 17. Project Information

| Detail | Information |
|---|---|
| Project Name | Java File Encryption and Decryption |
| Domain | Cybersecurity |
| Programming Language | Java |
| Encryption Technique | XOR |
| Project Type | Academic Group Project |
| Repository | GitHub |

---

## ⭐ Support

If you find this project useful for learning Java programming and basic cryptography, consider giving this repository a ⭐ on GitHub.

**Developed with ❤️ by the Project Team.**
