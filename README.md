# Настройка логирования в Spring Boot

Примеры настройки логирования в Spring Boot приложении.

## Описание

- Logback + Lombok: проект находится в каталоге logging.
- 

## Пример контроллера

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
