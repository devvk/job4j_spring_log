# Настройка логирования в Spring Boot

Примеры настройки логирования в Spring Boot приложении.

## Описание

- Каталог logging: Logback + Lombok. Вывод логов в консоль.
- Каталог logginglogbackxml: Logback + Lombok. Вывод логов в файл.
- Каталог logginglogbackxmldb: Logback + Lombok. Вывод логов в БД

- Каталог logginglog4j:  
- Каталог logginglog4jpropperties: 
- Каталог logginglog4jpropertiesdb:  
- Каталог logginglog4jxml: 
- Каталог logginglogbackproperties:
- Каталог logginglogbackxmldbmy: 

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
