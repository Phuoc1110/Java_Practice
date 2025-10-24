package bai_3;

public class Owner {
    private String cmnd;
    private String fullName;
    private String email;

    public Owner(String cmnd, String fullName, String email) {
        if (!cmnd.matches("\\d{12}"))
            throw new IllegalArgumentException("CMND must have exactly 12 digits.");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))
            throw new IllegalArgumentException("Invalid email format.");
        this.cmnd = cmnd;
        this.fullName = fullName;
        this.email = email;
    }

    public String getCmnd() { return cmnd; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("Owner[CMND=%s, Name=%s, Email=%s]", cmnd, fullName, email);
    }
}
