
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/CA2.0 final/conf/routes
// @DATE:Wed Dec 20 22:08:21 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:19
package controllers.security {

  // @LINE:19
  class ReverseLoginCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def updateUser(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:34
    def addCustomerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addCustomerSubmit")
    }
  
    // @LINE:20
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:21
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:37
    def updateUserSubmit(email:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateUserSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:19
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
