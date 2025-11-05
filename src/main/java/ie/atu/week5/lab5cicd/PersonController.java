package ie.atu.week5.lab5cicd;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController
{
    private final PersonService service;
    public PersonController(PersonService service)
    {
        this.service = service;
    }

    // CREATE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person)
    {
        return service.create(person);
    }

    // UPDATE
    @PutMapping("/api/persons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person update(@PathVariable String id, @RequestBody Person updated)
    {
        return service.update(updated);
    }




    @GetMapping
    public List<Person> all()
    {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person byEmployeeId(@PathVariable String id)
    {
        return service.findByEmployeeId(id);
    }
}
