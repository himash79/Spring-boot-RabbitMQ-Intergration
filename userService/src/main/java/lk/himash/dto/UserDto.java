package lk.himash.dto;

import lk.himash.entity.User;
import lk.himash.util.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
	
	private String user_id;
	private String user_firstname;
	private String user_lastname;
	private Integer user_age;
	private MaritalStatus user_marital_status;

}
