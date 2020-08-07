package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoaderListener;

/**
 * @author H&Q
 * @date 2020-08-07 17:21:27
 * @description test
 */
@Controller
public class TestController {

	@RequestMapping("test")
	public ResponseEntity<String> test () {
		new ContextLoaderListener();
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}

}
