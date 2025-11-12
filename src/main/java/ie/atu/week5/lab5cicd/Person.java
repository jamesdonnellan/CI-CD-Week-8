package ie.atu.week5.lab5cicd;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "persons")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Person
{
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  private String employeeId;
  private String position;
  private String department;

  // Unidirectional one to one FK lives on persons.address_id
  @OneToOne(cascade = CascadeType.ALL, optional = true)
  @JoinColumn(name = "address_id", foreignKey = @ForeignKey(name = "fk_person_address"))
  private Address address;

  public Person(String name, String email, String employeeId, String position, String department, Address address)
  {
    this.name = name;
    this.email = email;
    this.employeeId = employeeId;
    this.position = position;
    this.department = department;
    this.address = address;
  }

}
