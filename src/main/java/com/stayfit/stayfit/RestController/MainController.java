package com.stayfit.stayfit.RestController;
import com.stayfit.commondto.Response.BaseResponse;
import com.stayfit.commondto.Response.ErrorCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.prefs.BackingStoreException;

@RestController
@RequestMapping("/stay_fit")
public class MainController {

    @GetMapping("/test_pass")
    public BaseResponse<String> test(){
       BaseResponse<String> response = null ;
        try{
            String result = "I am fit ,Are you ? " ;
            response = new BaseResponse<>(result) ;
        }
        catch (Exception e){
            response = new BaseResponse<>(ErrorCode.SOMETHING_WENT_WRONG);
        }
        return response;
    }
    @GetMapping("/test_fail")
    public BaseResponse<?> testFail(){
        BaseResponse<?> response = null ;
        try{
            String result = "I am fit ,Are you ? " ;
            response = new BaseResponse<>(result) ;
            throw new Exception("Test Exception");
        }
        catch (Exception e){
            response = new BaseResponse<>(ErrorCode.SOMETHING_WENT_WRONG);
        }
        return response;
    }
}
