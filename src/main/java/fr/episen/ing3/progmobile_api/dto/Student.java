package fr.episen.ing3.progmobile_api.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.springframework.lang.NonNull;

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
	
    public void registerToContext(HashMap<Integer,Student> context) {
    	Set<Integer> keys = context.keySet();
    	if(keys.isEmpty())
    		registerToContext(context,0);   
    	else {
    		ArrayList<Integer> keysList = new ArrayList<Integer>(keys);
    		registerToContext(context,keysList.get(keysList.size()-1)+1);
    	}
    }

    public void registerToContext(HashMap<Integer,Student> context, Integer id){
        this.id= id;
        context.put(id,this);
    }

}

