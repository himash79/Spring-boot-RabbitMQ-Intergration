package lk.himash.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lk.himash.util.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_details")
public class User {

	@Id
	private String user_id;
	private String user_firstname;
	private String user_lastname;
	private Integer user_age;
	private MaritalStatus user_marital_status;
	
}
