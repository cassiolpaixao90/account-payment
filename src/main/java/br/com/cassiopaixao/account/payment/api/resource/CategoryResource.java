package br.com.cassiopaixao.account.payment.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.cassiopaixao.account.payment.api.model.Category;
import br.com.cassiopaixao.account.payment.api.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public List<Category> getCategories(){
		return categoryRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Category> createCategory(@RequestBody Category category, HttpServletResponse response) {
		Category categRet = categoryRepository.save(category);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequestUri()
					.path("/{code}")
					.buildAndExpand(categRet.getCode())
					.toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(categRet);
	}
	
	@GetMapping("/{code}")
	public Category getCategoryById(@PathVariable Long code) {
		return categoryRepository.findOne(code);
	}
	
	
}
