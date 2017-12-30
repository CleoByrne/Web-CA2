
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/CA2.0 final/conf/routes
// @DATE:Wed Dec 20 22:08:21 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:24
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:28
    def removeItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeItem",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeItem/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:29
    def emptyCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyCart"})
        }
      """
    )
  
    // @LINE:24
    def showCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showCart"})
        }
      """
    )
  
    // @LINE:31
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:30
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:25
    def addToCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToCart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:27
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseAdminProductCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProductSubmit"})
        }
      """
    )
  
    // @LINE:45
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/delProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:42
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProduct"})
        }
      """
    )
  
    // @LINE:43
    def updateProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProductSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProductSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:7
    def allTvs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.allTvs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allTvs"})
        }
      """
    )
  
    // @LINE:13
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactUs"})
        }
      """
    )
  
    // @LINE:15
    def contactUsSuccess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactUsSuccess",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactUsSuccess"})
        }
      """
    )
  
    // @LINE:9
    def allPhones: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.allPhones",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allPhones"})
        }
      """
    )
  
    // @LINE:16
    def product: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.product",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def computing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.computing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computing"})
        }
      """
    )
  
    // @LINE:12
    def tablets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tablets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablets"})
        }
      """
    )
  
    // @LINE:8
    def tvAcc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tvAcc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tvAcc"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def contactUsSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactUsSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contactUsSubmit"})
        }
      """
    )
  
    // @LINE:10
    def phoneAcc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.phoneAcc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "phoneAcc"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
