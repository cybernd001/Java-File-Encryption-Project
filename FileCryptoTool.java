import java.io.*;

/**
 * File Encryption and Decryption Tool
 *
 * Uses a simple symmetric XOR cipher with a password key.
 * Encrypting and decrypting are the same operation: applying the
 * same key twice gives back the original file.
 *
 * Syllabus topics used: classes/objects, constructors, custom exception,
 * try-catch-finally, File class, FileInputStream/FileOutputStream,
 * BufferedReader, InputStreamReader, command line arguments.
 *
 * Usage:
 *   Menu mode : java FileCryptoTool
 *   CLI mode  : java FileCryptoTool encrypt input.txt output.enc mypassword
 *               java FileCryptoTool decrypt output.enc restored.txt mypassword
 */

// Custom exception
class CryptoException extends Exception {
    public CryptoException(String message) {
        super(message);
    }
}

// Class that does the actual work
class FileCipher {
    private final byte[] key;

    public FileCipher(String password) throws CryptoException {
        if (password == null || password.isEmpty()) {
            throw new CryptoException("Password cannot be empty.");
        }
        this.key = password.getBytes();
    }

    // Same method is used for both encryption and decryption (XOR)
    public void process(String inputPath, String outputPath) throws CryptoException {
        File inFile = new File(inputPath);

        if (!inFile.exists() || !inFile.isFile()) {
            throw new CryptoException("Input file not found: " + inputPath);
        }
        if (inFile.getAbsolutePath().equals(new File(outputPath).getAbsolutePath())) {
            throw new CryptoException("Output file must be different from input file.");
        }

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(inFile);
            fos = new FileOutputStream(outputPath);

            int data;
            int i = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data ^ key[i % key.length]);
                i++;
            }
        } catch (IOException e) {
            throw new CryptoException("I/O error: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}

public class FileCryptoTool {

    public static void main(String[] args) {
        try {
            if (args.length == 4) {
                runFromCommandLine(args);
            } else {
                runMenu();
            }
        } catch (CryptoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Input error: " + e.getMessage());
        }
    }

    // Command line argument mode
    private static void runFromCommandLine(String[] args) throws CryptoException {
        String mode = args[0];
        FileCipher cipher = new FileCipher(args[3]);

        if (mode.equalsIgnoreCase("encrypt")) {
            cipher.process(args[1], args[2]);
            System.out.println("File encrypted successfully -> " + args[2]);
        } else if (mode.equalsIgnoreCase("decrypt")) {
            cipher.process(args[1], args[2]);
            System.out.println("File decrypted successfully -> " + args[2]);
        } else {
            throw new CryptoException("Mode must be 'encrypt' or 'decrypt'.");
        }
    }

    // Menu mode
    private static void runMenu() throws IOException, CryptoException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\n===== File Encryption & Decryption Tool =====");
            System.out.println("1. Encrypt a file");
            System.out.println("2. Decrypt a file");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = br.readLine();

            if (choice == null || choice.equals("3")) {
                System.out.println("Exiting.........");
                break;
            }

            if (!choice.equals("1") && !choice.equals("2")) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter input file path: ");
            String in = br.readLine();
            System.out.print("Enter output file path: ");
            String out = br.readLine();
            System.out.print("Enter password: ");
            String pass = br.readLine();

            try {
                FileCipher cipher = new FileCipher(pass);
                cipher.process(in, out);
                if (choice.equals("1")) {
                    System.out.println("File encrypted successfully -> " + out);
                } else {
                    System.out.println("File decrypted successfully -> " + out);
                }
            } catch (CryptoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
