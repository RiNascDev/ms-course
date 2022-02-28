package com.devsuperior.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.hrpayroll.entities.Worker;

@Component
@FeignClient(name = "hr-worker", path = "/workers")//com mais de uma stância rodando
//@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")//=> com só uma stância rodando
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);

}
