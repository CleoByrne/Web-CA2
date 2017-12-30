
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/CA2.0 final/conf/routes
// @DATE:Wed Dec 20 22:08:21 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:19
  LoginCtrl_3: controllers.security.LoginCtrl,
  // @LINE:24
  ShoppingCtrl_1: controllers.ShoppingCtrl,
  // @LINE:39
  AdminProductCtrl_2: controllers.AdminProductCtrl,
  // @LINE:48
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:19
    LoginCtrl_3: controllers.security.LoginCtrl,
    // @LINE:24
    ShoppingCtrl_1: controllers.ShoppingCtrl,
    // @LINE:39
    AdminProductCtrl_2: controllers.AdminProductCtrl,
    // @LINE:48
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allTvs""", """controllers.HomeController.allTvs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tvAcc""", """controllers.HomeController.tvAcc"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allPhones""", """controllers.HomeController.allPhones"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """phoneAcc""", """controllers.HomeController.phoneAcc"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computing""", """controllers.HomeController.computing"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tablets""", """controllers.HomeController.tablets"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactUs""", """controllers.HomeController.contactUs"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactUsSubmit""", """controllers.HomeController.contactUsSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactUsSuccess""", """controllers.HomeController.contactUsSuccess"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""" + "$" + """id<[^/]+>""", """controllers.HomeController.product(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.security.LoginCtrl.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginCtrl.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showCart""", """controllers.ShoppingCtrl.showCart()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToCart/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeItem/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeItem(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyCart""", """controllers.ShoppingCtrl.emptyCart()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomerSubmit""", """controllers.security.LoginCtrl.addCustomerSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUser/""" + "$" + """email<[^/]+>""", """controllers.security.LoginCtrl.updateUser(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserSubmit/""" + "$" + """email<[^/]+>""", """controllers.security.LoginCtrl.updateUserSubmit(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_allTvs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allTvs")))
  )
  private[this] lazy val controllers_HomeController_allTvs1_invoker = createInvoker(
    HomeController_0.allTvs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "allTvs",
      Nil,
      "GET",
      this.prefix + """allTvs""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_tvAcc2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tvAcc")))
  )
  private[this] lazy val controllers_HomeController_tvAcc2_invoker = createInvoker(
    HomeController_0.tvAcc,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tvAcc",
      Nil,
      "GET",
      this.prefix + """tvAcc""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_allPhones3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allPhones")))
  )
  private[this] lazy val controllers_HomeController_allPhones3_invoker = createInvoker(
    HomeController_0.allPhones,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "allPhones",
      Nil,
      "GET",
      this.prefix + """allPhones""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_phoneAcc4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("phoneAcc")))
  )
  private[this] lazy val controllers_HomeController_phoneAcc4_invoker = createInvoker(
    HomeController_0.phoneAcc,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "phoneAcc",
      Nil,
      "GET",
      this.prefix + """phoneAcc""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_computing5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computing")))
  )
  private[this] lazy val controllers_HomeController_computing5_invoker = createInvoker(
    HomeController_0.computing,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "computing",
      Nil,
      "GET",
      this.prefix + """computing""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_tablets6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tablets")))
  )
  private[this] lazy val controllers_HomeController_tablets6_invoker = createInvoker(
    HomeController_0.tablets,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tablets",
      Nil,
      "GET",
      this.prefix + """tablets""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_contactUs7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactUs")))
  )
  private[this] lazy val controllers_HomeController_contactUs7_invoker = createInvoker(
    HomeController_0.contactUs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactUs",
      Nil,
      "GET",
      this.prefix + """contactUs""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_contactUsSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactUsSubmit")))
  )
  private[this] lazy val controllers_HomeController_contactUsSubmit8_invoker = createInvoker(
    HomeController_0.contactUsSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactUsSubmit",
      Nil,
      "POST",
      this.prefix + """contactUsSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_contactUsSuccess9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactUsSuccess")))
  )
  private[this] lazy val controllers_HomeController_contactUsSuccess9_invoker = createInvoker(
    HomeController_0.contactUsSuccess,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactUsSuccess",
      Nil,
      "GET",
      this.prefix + """contactUsSuccess""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_product10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_product10_invoker = createInvoker(
    HomeController_0.product(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "product",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_security_LoginCtrl_login11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login11_invoker = createInvoker(
    LoginCtrl_3.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """ Login form""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit12_invoker = createInvoker(
    LoginCtrl_3.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_security_LoginCtrl_logout13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout13_invoker = createInvoker(
    LoginCtrl_3.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ShoppingCtrl_showCart14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showCart")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showCart14_invoker = createInvoker(
    ShoppingCtrl_1.showCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showCart",
      Nil,
      "GET",
      this.prefix + """showCart""",
      """ Shopping""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ShoppingCtrl_addToCart15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToCart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToCart15_invoker = createInvoker(
    ShoppingCtrl_1.addToCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToCart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ShoppingCtrl_addOne16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne16_invoker = createInvoker(
    ShoppingCtrl_1.addOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ShoppingCtrl_removeOne17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne17_invoker = createInvoker(
    ShoppingCtrl_1.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ShoppingCtrl_removeItem18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeItem/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeItem18_invoker = createInvoker(
    ShoppingCtrl_1.removeItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeItem/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ShoppingCtrl_emptyCart19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyCart")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyCart19_invoker = createInvoker(
    ShoppingCtrl_1.emptyCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyCart",
      Nil,
      "GET",
      this.prefix + """emptyCart""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ShoppingCtrl_placeOrder20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder20_invoker = createInvoker(
    ShoppingCtrl_1.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_viewOrder21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder21_invoker = createInvoker(
    ShoppingCtrl_1.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_cart22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart22_invoker = createInvoker(
    HomeController_0.cart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_security_LoginCtrl_addCustomerSubmit23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomerSubmit")))
  )
  private[this] lazy val controllers_security_LoginCtrl_addCustomerSubmit23_invoker = createInvoker(
    LoginCtrl_3.addCustomerSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "addCustomerSubmit",
      Nil,
      "POST",
      this.prefix + """addCustomerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_security_LoginCtrl_updateUser24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUser/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_security_LoginCtrl_updateUser24_invoker = createInvoker(
    LoginCtrl_3.updateUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "updateUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateUser/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_security_LoginCtrl_updateUserSubmit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserSubmit/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_security_LoginCtrl_updateUserSubmit25_invoker = createInvoker(
    LoginCtrl_3.updateUserSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "updateUserSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """updateUserSubmit/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_AdminProductCtrl_addProduct26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct26_invoker = createInvoker(
    AdminProductCtrl_2.addProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """Admin/addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit27_invoker = createInvoker(
    AdminProductCtrl_2.addProductSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """Admin/addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_AdminProductCtrl_updateProduct28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct28_invoker = createInvoker(
    AdminProductCtrl_2.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit29_invoker = createInvoker(
    AdminProductCtrl_2.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct30_invoker = createInvoker(
    AdminProductCtrl_2.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/delProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_versioned31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned31_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_allTvs1_route(params@_) =>
      call { 
        controllers_HomeController_allTvs1_invoker.call(HomeController_0.allTvs)
      }
  
    // @LINE:8
    case controllers_HomeController_tvAcc2_route(params@_) =>
      call { 
        controllers_HomeController_tvAcc2_invoker.call(HomeController_0.tvAcc)
      }
  
    // @LINE:9
    case controllers_HomeController_allPhones3_route(params@_) =>
      call { 
        controllers_HomeController_allPhones3_invoker.call(HomeController_0.allPhones)
      }
  
    // @LINE:10
    case controllers_HomeController_phoneAcc4_route(params@_) =>
      call { 
        controllers_HomeController_phoneAcc4_invoker.call(HomeController_0.phoneAcc)
      }
  
    // @LINE:11
    case controllers_HomeController_computing5_route(params@_) =>
      call { 
        controllers_HomeController_computing5_invoker.call(HomeController_0.computing)
      }
  
    // @LINE:12
    case controllers_HomeController_tablets6_route(params@_) =>
      call { 
        controllers_HomeController_tablets6_invoker.call(HomeController_0.tablets)
      }
  
    // @LINE:13
    case controllers_HomeController_contactUs7_route(params@_) =>
      call { 
        controllers_HomeController_contactUs7_invoker.call(HomeController_0.contactUs)
      }
  
    // @LINE:14
    case controllers_HomeController_contactUsSubmit8_route(params@_) =>
      call { 
        controllers_HomeController_contactUsSubmit8_invoker.call(HomeController_0.contactUsSubmit)
      }
  
    // @LINE:15
    case controllers_HomeController_contactUsSuccess9_route(params@_) =>
      call { 
        controllers_HomeController_contactUsSuccess9_invoker.call(HomeController_0.contactUsSuccess)
      }
  
    // @LINE:16
    case controllers_HomeController_product10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_product10_invoker.call(HomeController_0.product(id))
      }
  
    // @LINE:19
    case controllers_security_LoginCtrl_login11_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_login11_invoker.call(LoginCtrl_3.login)
      }
  
    // @LINE:20
    case controllers_security_LoginCtrl_loginSubmit12_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit12_invoker.call(LoginCtrl_3.loginSubmit)
      }
  
    // @LINE:21
    case controllers_security_LoginCtrl_logout13_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_logout13_invoker.call(LoginCtrl_3.logout)
      }
  
    // @LINE:24
    case controllers_ShoppingCtrl_showCart14_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showCart14_invoker.call(ShoppingCtrl_1.showCart())
      }
  
    // @LINE:25
    case controllers_ShoppingCtrl_addToCart15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToCart15_invoker.call(ShoppingCtrl_1.addToCart(id))
      }
  
    // @LINE:26
    case controllers_ShoppingCtrl_addOne16_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne16_invoker.call(ShoppingCtrl_1.addOne(itemId))
      }
  
    // @LINE:27
    case controllers_ShoppingCtrl_removeOne17_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne17_invoker.call(ShoppingCtrl_1.removeOne(itemId))
      }
  
    // @LINE:28
    case controllers_ShoppingCtrl_removeItem18_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeItem18_invoker.call(ShoppingCtrl_1.removeItem(itemId))
      }
  
    // @LINE:29
    case controllers_ShoppingCtrl_emptyCart19_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyCart19_invoker.call(ShoppingCtrl_1.emptyCart())
      }
  
    // @LINE:30
    case controllers_ShoppingCtrl_placeOrder20_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder20_invoker.call(ShoppingCtrl_1.placeOrder())
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_viewOrder21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder21_invoker.call(ShoppingCtrl_1.viewOrder(id))
      }
  
    // @LINE:32
    case controllers_HomeController_cart22_route(params@_) =>
      call { 
        controllers_HomeController_cart22_invoker.call(HomeController_0.cart)
      }
  
    // @LINE:34
    case controllers_security_LoginCtrl_addCustomerSubmit23_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_addCustomerSubmit23_invoker.call(LoginCtrl_3.addCustomerSubmit())
      }
  
    // @LINE:36
    case controllers_security_LoginCtrl_updateUser24_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_security_LoginCtrl_updateUser24_invoker.call(LoginCtrl_3.updateUser(email))
      }
  
    // @LINE:37
    case controllers_security_LoginCtrl_updateUserSubmit25_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_security_LoginCtrl_updateUserSubmit25_invoker.call(LoginCtrl_3.updateUserSubmit(email))
      }
  
    // @LINE:39
    case controllers_AdminProductCtrl_addProduct26_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct26_invoker.call(AdminProductCtrl_2.addProduct())
      }
  
    // @LINE:40
    case controllers_AdminProductCtrl_addProductSubmit27_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit27_invoker.call(AdminProductCtrl_2.addProductSubmit())
      }
  
    // @LINE:42
    case controllers_AdminProductCtrl_updateProduct28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct28_invoker.call(AdminProductCtrl_2.updateProduct(id))
      }
  
    // @LINE:43
    case controllers_AdminProductCtrl_updateProductSubmit29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit29_invoker.call(AdminProductCtrl_2.updateProductSubmit(id))
      }
  
    // @LINE:45
    case controllers_AdminProductCtrl_deleteProduct30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct30_invoker.call(AdminProductCtrl_2.deleteProduct(id))
      }
  
    // @LINE:48
    case controllers_Assets_versioned31_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned31_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
