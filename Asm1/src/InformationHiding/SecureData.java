package InformationHiding;

public class SecureData {
    private final String sensitiveData;

    public SecureData(String sensitiveData) {
        this.sensitiveData = encrypt(sensitiveData);  // Data is stored securely
    }

    private String encrypt(String data) {
        // Simulate encryption
        return new StringBuilder(data).reverse().toString();
    }

    private String decrypt(String data) {
        // Simulate decryption
        return new StringBuilder(data).reverse().toString();
    }

    public String getData() {
        return decrypt(sensitiveData);  // Expose only decrypted data
    }
}


