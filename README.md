# Настройка логирования в Spring Boot

Примеры настройки логирования в Spring Boot приложении.

## Logback + Lombok

- Каталог logging: вывод логов в консоль.
- Каталог logginglogbackxml: конфигурация в xml, вывод логов в файл.
- Каталог logginglogbackxmldb: конфигурация в xml, вывод логов в БД.
- Каталог logginglogbackxmldbmy: конфигурация в xml, вывод логов в БД + своя таблица.
- Каталог logginglogbackproperties: конфигурация в .properties, вывод логов в файл.

## Log4j2

- Каталог logginglog4jxml: конфигурация в xml, вывод логов в файл.

- Каталог logginglog4j:  
- Каталог logginglog4jpropperties: 
- Каталог logginglog4jpropertiesdb:

## Пример контроллера

Аннотация @Slf4j из библиотеки lombok позволяет не выполнять явно в коде создание логгера. 
Без этой аннотации пришлось добавить строку ` private static final Logger log = LoggerFactory.getLogger(MyController.class);`

```java
@Slf4j
@Controller
public class MyController {

    @ResponseBody
    @RequestMapping("/Hello")
    public String hello() {
        log.error("Some error occured");
        log.warn("Some warn occured");
        log.info("Some info occured");
        log.debug("Some debug occured");
        log.trace("Some trace occured");
        return "Hello from Controller";
    }
}
´´´
