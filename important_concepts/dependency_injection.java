@Component
class HitachiHD implements HardDrive {
    ...
}

//HitachiHD is a concrete implementation 
// of the HardDrive interface. The @Component annotation indicates 
// that this class is a Spring-managed component, allowing it to be 
// automatically detected and registered as a bean in the Spring application 
// context. This enables dependency injection, where other components can depend 
// on the HardDrive interface and receive an instance of HitachiHD without needing 
// to know the specific implementation details.

class Laptop{
    @Autowired
    HardDrive obj;
}

//Purpose of Dependency Injection:
//loose couplling 
//testing 
