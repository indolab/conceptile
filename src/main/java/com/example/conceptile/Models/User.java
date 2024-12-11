import javax.annotation.processing.Generated;

@Entity
@Table(names="User")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
Integer id;

String name;

String passkey;

}
