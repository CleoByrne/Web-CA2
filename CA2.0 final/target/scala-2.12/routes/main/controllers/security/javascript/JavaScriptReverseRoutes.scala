
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/CA2.0 final/conf/routes
// @DATE:Wed Dec 20 22:08:21 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:19
package controllers.security.javascript {

  // @LINE:19
  class ReverseLoginCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.updateUser",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0))})
        }
      """
    )
  
    // @LINE:34
    def addCustomerSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.addCustomerSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addCustomerSubmit"})
        }
      """
    )
  
    // @LINE:20
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:21
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:37
    def updateUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.updateUserSubmit",
      """
        function(email0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUserSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0))})
        }
      """
    )
  
    // @LINE:19
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
