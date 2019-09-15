package kubeila.employee.exception;


import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {
    /**
     * 全局捕获AuthorizationException异常，并进行相应处理
     */
    @ExceptionHandler({AuthorizationException.class})
    public String handleException(Exception e){
        System.out.println("AuthorizationException--------------");
        return "/login.html";
    }

}
