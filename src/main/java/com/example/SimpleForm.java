package com.example;




import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import lombok.Data;
@Data
public class SimpleForm {
	@Email
	  private String femail;

	  @NotNull
	  @Size(min = 6, max = 12)
	  private String fpass;
	  
	  @Pattern(regexp = "A|B|C|D|E")
	  private String fselect;
	  
	  //@NotNull
	  private String[] fmselect;
	  
	  
	  private String fcheck;
	  
	  @NotNull
	  private String fradio;
}
