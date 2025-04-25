# README

Репозиторий с UML диаграммами раскрывающими функциональность продукта для ВКР

---

## 1. Use Case Diagram

```plantuml
@startuml
actor User

rectangle "Backup & Sync App" {
  User --> (Настройка резервного копирования)
  User --> (Настройка синхронизации)
  User --> (Выбор целевого хранилища)
  User --> (Планирование задач)
  User --> (Просмотр логов)
  User --> (Получение уведомлений)
}
@enduml

```

![Use Case Diagram](generated/UseCase.png)

---

## 2. Class Diagram

```plantuml
@startuml
class BackupManager {
  -sourcePath: String
  -destinationPath: String
  -schedule: Schedule
  +startBackup(): void
}

class SyncManager {
  -localPath: String
  -remotePath: String
  -syncType: String
  +startSync(): void
}

class Schedule {
  -cronExpression: String
  +getNextExecution(): Date
}

class Logger {
  +info(String): void
  +error(String): void
}

class NotificationService {
  +sendNotification(String): void
}

User --> BackupManager
User --> SyncManager
BackupManager --> Schedule
SyncManager --> Logger
BackupManager --> Logger
BackupManager --> NotificationService
@enduml

```

![Class Diagram](generated/Class.png)

---

## 3. Sequence Diagram

```plantuml
@startuml
actor User

User -> BackupManager: startBackup()
BackupManager -> Schedule: getNextExecution()
BackupManager -> Logger: logSuccess("Backup started")
BackupManager -> NotificationService: sendNotification("Backup started")
@enduml

```

![Sequence Diagram](generated/Sequence.png)

---

## 4. State Diagram

```plantuml
@startuml
[*] --> Ожидание

Ожидание --> Выполняется : наступило время
Выполняется --> Успешно : завершено без ошибок
Выполняется --> Ошибка : ошибка копирования
Успешно --> [*]
Ошибка --> [*]
@enduml
```

![State Diagram](generated/State.png)

---

## 5. Activity Diagram

```plantuml
@startuml
start
:Загрузить настройки;
:Проверить наличие источника и цели;
if (Доступны?) then (Да)
  :Начать копирование;
  if (Успешно?) then (Да)
    :Записать лог успеха;
  else (Нет)
    :Записать ошибку;
  endif
else (Нет)
  :Завершить с ошибкой;
endif
stop
@enduml
```

![Activity Diagram](generated/Activity.png)

---

# 🎥 Скринкаст
[Перейти к скринкасту](https://drive.google.com/file/d/1w4OBa3zazzeo4e07IvCDJM6Ja9Oc6dq9/view?usp=share_link)
