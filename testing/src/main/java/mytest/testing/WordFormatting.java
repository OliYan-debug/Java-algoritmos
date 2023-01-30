package mytest.testing;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WordFormatting {
    @GetMapping("")
    public String commands(){
        return """
               <ul>
                <li><a href="/api/v1/upper/yan">Uppercase</a></li>
                <li><a href="/api/v1/lower/YAN">Lowercase</a></li>
                <li><a href="/api/v1/compare?name_1=a&name_2=a">Compare</a></li>
                <li><a href="/api/v1/compare/sensitive?name_1=a&name_2=a&case=true">Compare with case</a></li>
               </ul>
                """;
    }
    @GetMapping("/upper/{word}")
    public String nameToUpperCase(@PathVariable("word") String word){
        return word.toUpperCase();
    }

    @GetMapping("/lower/{word}")
    public String nameToLowerCase(@PathVariable("word") String word){
        return word.toLowerCase();
    }

    @GetMapping("/len/{word}")
    public int nameLength(@PathVariable("word") String word){
        return word.length();
    }

    @GetMapping("/compare")
    public boolean compareName(
            @RequestParam("name_1") String name_1,
            @RequestParam("name_2") String name_2){
        return name_1.equals(name_2);
    }
    @GetMapping("/compare/sensitive")
    public boolean compareName(
            @RequestParam("name_1") String name_1,
            @RequestParam("name_2") String name_2, @RequestParam("case") boolean sensitive){
        if(sensitive){
            return name_1.equals(name_2);
        }else{
            return name_1.equalsIgnoreCase(name_2);
        }
    }
}
