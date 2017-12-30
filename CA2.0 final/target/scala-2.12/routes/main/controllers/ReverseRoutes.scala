
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/CA2.0 final/conf/routes
// @DATE:Wed Dec 20 22:08:21 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:24
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def addOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:28
    def removeItem(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeItem/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:29
    def emptyCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyCart")
    }
  
    // @LINE:24
    def showCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showCart")
    }
  
    // @LINE:31
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:30
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:25
    def addToCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToCart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:27
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
  }

  // @LINE:39
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:45
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/delProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:42
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:43
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:7
    def allTvs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "allTvs")
    }
  
    // @LINE:13
    def contactUs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactUs")
    }
  
    // @LINE:15
    def contactUsSuccess(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactUsSuccess")
    }
  
    // @LINE:9
    def allPhones(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "allPhones")
    }
  
    // @LINE:16
    def product(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def computing(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "computing")
    }
  
    // @LINE:12
    def tablets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tablets")
    }
  
    // @LINE:8
    def tvAcc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tvAcc")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def contactUsSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contactUsSubmit")
    }
  
    // @LINE:10
    def phoneAcc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "phoneAcc")
    }
  
  }

  // @LINE:48
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
