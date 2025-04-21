public class BackupManager {
	private String sourcePath;
	private String destinationPath;
	private Schedule schedule;
	private Logger logger;
	private NotificationService notifier;

	public void startBackup() {
		// backup activity...
	}
}

public class SyncManager {
	private String localPath;
	private String remotePath;
	private String syncType;
	private Logger logger;

	public void startSync() {
		// sync...
	}
}

public class Schedule {
	private String cronExpression;

	public Date getNextExecution() {
		// date...
		return new Date();
	}
}

public class Logger {
	public void logSuccess(String message) {
		System.out.println("SUCCESS: " + message);
	}

	public void logError(String message) {
		System.err.println("ERROR: " + message);
	}
}

public class NotificationService {
	public void sendNotification(String message) {
		// notifying...
	}
}
