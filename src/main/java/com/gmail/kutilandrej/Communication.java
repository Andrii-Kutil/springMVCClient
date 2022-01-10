package com.gmail.kutilandrej;

import java.util.List;
import com.gmail.kutilandrej.entity.Human;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Communication {

  private static final String URL = "http://localhost:8080/springMVC3/api/employees";

  @Autowired
  private RestTemplate restTemplate;


  public List<Human> getAllHumans() {
    ResponseEntity<List<Human>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET,
        null, new ParameterizedTypeReference<>() {
        });
    return responseEntity.getBody();
  }

  public Human getHuman(int id) {
    return restTemplate.getForObject(URL + "/" + id, Human.class);
  }

  public void saveHuman(Human human) {
    if (human.getId() == 0) {
      restTemplate.postForObject(URL, human, String.class);
    } else {
      restTemplate.put(URL, human, String.class);
    }
  }

  public void deleteHuman(int id) {
    restTemplate.delete(URL + "/" + id);
  }
}
