package fr.episen.ing3.progmobile_api.dto;

import org.springframework.lang.NonNull;

import fr.episen.ing3.progmobile_api.ProgmobileApiApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {

    private Integer id;
	@NonNull
    private String name;
	@NonNull
    private String firstname;
	@NonNull
    private String email;
	@NonNull
    private Sex sex;
	@NonNull
    private Integer age;
	@NonNull
    private Boolean rdbt;
	@NonNull
    private Level level;
	
    public void registerToContext() {
    	registerToContext(ProgmobileApiApplication.index++);
    }

    public void registerToContext(Integer id){
        this.id= id;
        ProgmobileApiApplication.studentsRepo.put(id,this);
    }

}

