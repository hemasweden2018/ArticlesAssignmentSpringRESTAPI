package se.novare.article.todo.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloController {

    @RequestMapping("/")
    public String hello()

    {
        return "Hello World";
    }

    @RequestMapping("/helloPerson/name")
    public String helloPerson(@PathVariable String name)
    {
        return "hello"+name;
    }
    @RequestMapping("hello-param-age")
public String helloPersonAge(@RequestParam String name,@RequestParam Integer age)
{
    return "hello"+name+"your name is"+age;
}

}
