package Session01.bt;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AgeValueException extends Exception {
    public AgeValueException(String message) {
        super(message);
    }
}

class Account {
    private String accountName;
    private int accountAge;

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountAge(int accountAge) throws AgeValueException {
        if (accountAge < 0) {
            throw new AgeValueException("Tuổi không thể âm!");
        }
        this.accountAge = accountAge;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountAge() {
        return accountAge;
    }
}

class StorageService {
    public static void writeAccountToFile(Account accountData) throws IOException {
        throw new IOException("Không thể ghi dữ liệu người dùng vào file");
    }
}

class ErrorLogger {
    public static void logError(String errorMessage) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[ERROR] " + time + " - " + errorMessage);
    }
}

public class b6{
    public static void main(String[] args) {
        Account accountData = new Account();

        try {
            accountData.setAccountName("Dung");
            accountData.setAccountAge(-2);
        } catch (AgeValueException exceptionInfo) {
            ErrorLogger.logError(exceptionInfo.getMessage());
        }

        if (accountData.getAccountName() != null) {
            System.out.println("Tên người dùng: " + accountData.getAccountName());
        }

        int totalMemberCount = 10;
        int teamCount = 0;

        if (teamCount != 0) {
            int memberPerTeam = totalMemberCount / teamCount;
            System.out.println("Mỗi nhóm có: " + memberPerTeam + " người");
        } else {
            ErrorLogger.logError("Không thể chia cho 0");
        }

        try {
            StorageService.writeAccountToFile(accountData);
        } catch (IOException ioError) {
            ErrorLogger.logError(ioError.getMessage());
        }

        System.out.println("Chương trình kết thúc an toàn.");
    }
}