
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Customer],Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addCustomerForm: Form[models.users.Customer], loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.110*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("LogIn", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
"""),format.raw/*5.1*/("""<!-- //BEGIN CLEO AND GLEN -->
<main>
        """),_display_(/*7.10*/if(loginForm.hasGlobalErrors)/*7.39*/ {_display_(Seq[Any](format.raw/*7.41*/("""
            """),format.raw/*8.13*/("""<p class="alert alert-warning">
                """),_display_(/*9.18*/loginForm/*9.27*/.globalError.message),format.raw/*9.47*/("""
            """),format.raw/*10.13*/("""</p>
        """)))}),format.raw/*11.10*/("""
        """),_display_(/*12.10*/if(flash.containsKey("error"))/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
            """),format.raw/*13.13*/("""<p class="alert alert-warning">
                """),_display_(/*14.18*/flash/*14.23*/.get("loginRequired")),format.raw/*14.44*/("""
            """),format.raw/*15.13*/("""</p>
        """)))}),format.raw/*16.10*/("""
        
    """),format.raw/*18.5*/("""<div class="row">
        <div class="col-sm-6">
            <div class="jumbotron">
                <h3>Create Account</h3>
                """),_display_(/*22.18*/form(action = controllers.security.routes.LoginCtrl.addCustomerSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*22.171*/ {_display_(Seq[Any](format.raw/*22.173*/("""
                    """),_display_(/*23.22*/CSRF/*23.26*/.formField),format.raw/*23.36*/("""
                """),format.raw/*24.17*/("""<form>
                        
                    <div class="row">
                            <div "form-group">
                                    <label for="validationDefault04"></label>
                                    <input type="hidden" name="role" class="form-control input-xs" placeholder="Role" value="customer" value=""""),_display_(/*29.144*/addCustomerForm("role")/*29.167*/.value),format.raw/*29.173*/(""" """),format.raw/*29.174*/("""">
                                    <div class="invalid-feedback">
                                        Please provide a valid role.
                                    </div>
                                </div>
                                <div class="col-sm-12 form-group">
                                        <label for="validationDefault03"></label>
                                        <input type="email" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*36.132*/addCustomerForm("email")/*36.156*/.value),format.raw/*36.162*/("""">
                                        <div class="invalid-feedback">
                                            Please provide a valid email.
                                        </div>
                                    </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault01"></label>
                            <input type="text" name="firstName" class="form-control input-xs" placeholder="First Name" value=""""),_display_(/*43.128*/addCustomerForm("firstName")/*43.156*/.value),format.raw/*43.162*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid first name.
                            </div>
                        </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault02"></label>
                            <input type="text" name="lastName" class="form-control input-xs" placeholder="Last Name" value=""""),_display_(/*50.126*/addCustomerForm("lastName")/*50.153*/.value),format.raw/*50.159*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid last name.
                            </div>
                        </div>
                        
                        <div class="col-sm-12 form-group">
                                <label for="validationDefault05"></label>
                                <input type="password" name="password" class="form-control input-xs" placeholder="Password" value=""""),_display_(/*58.133*/addCustomerForm("password")/*58.160*/.value),format.raw/*58.166*/("""">
                                <div class="invalid-feedback">
                                    Please provide a valid password.
                                </div>
                            </div>
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault04"></label>
                            <input type="tel" name="phoneNumber" class="form-control input-xs" placeholder="Phone Number" value=""""),_display_(/*65.131*/addCustomerForm("phoneNumber")/*65.161*/.value),format.raw/*65.167*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid phone number.
                            </div>
                        </div>
                        
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault06"></label>
                            <input type="text" name="street1" class="form-control input-xs" placeholder="Street Line 1" value=""""),_display_(/*73.129*/addCustomerForm("street1")/*73.155*/.value),format.raw/*73.161*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid street address.
                            </div>
                        </div>
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault07"></label>
                            <input type="text" name="street2" class="form-control input-xs" placeholder="Street Line 2" value=""""),_display_(/*80.129*/addCustomerForm("street2")/*80.155*/.value),format.raw/*80.161*/("""">
                            <div class="invalid-feedback">
                                Please provide a street address.
                            </div>
                        </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault08"></label>
                            <input type="text" name="town" class="form-control input-xs" placeholder="Town" value=""""),_display_(/*87.117*/addCustomerForm("town")/*87.140*/.value),format.raw/*87.146*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid town.
                            </div>
                        </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault09"></label>
                            <input type="text" name="postCode" class="form-control input-xs" placeholder="Postcode" value=""""),_display_(/*94.125*/addCustomerForm("postCode")/*94.152*/.value),format.raw/*94.158*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid postcode.
                            </div>
                        </div>
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault10"></label>
                            <input type="number" name="creditCard" class="form-control input-xs" placeholder="Credit Card Number" value=""""),_display_(/*101.139*/addCustomerForm("creditCard")/*101.168*/.value),format.raw/*101.174*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid credit card number.
                            </div>
                        </div>
                        
                        <div class="col-sm-12 form-group">
                            <button class="btn btn-default pull-right" type="submit">Submit</button>
                        </div>
                    </div>
                </form>
            """)))}),format.raw/*112.14*/("""
            """),format.raw/*113.13*/("""</div>
        </div>

        <div class="col-sm-6">
            <div class="jumbotron">
                <h3>Sign In</h3>   
                 """),_display_(/*119.19*/form(action = controllers.security.routes.LoginCtrl.loginSubmit(), 'class -> "form-horizontal", 'role -> "form")/*119.131*/ {_display_(Seq[Any](format.raw/*119.133*/("""
                    """),_display_(/*120.22*/CSRF/*120.26*/.formField),format.raw/*120.36*/("""
                """),format.raw/*121.17*/("""<form>
                    
                    <div class="row">
                        
                        <div class="col-sm-12 form-group">
                                <label for="validationDefault01"></label>
                                <div class="input-group margin-bottom-sm">
                                <span class="input-group-addon"><i class="fa fa-envelope-o fa-fw"></i></span>
                                <input type="email" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*129.124*/loginForm("email")/*129.142*/.value),format.raw/*129.148*/("""">
                                </div>
                        </div>
                        <div class="col-sm-12 form-group">
                                <label for="validationDefault01"></label>
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                                    <input id="passwordInput" type="password" name="password" class="form-control input-xs" placeholder="Password" value=""""),_display_(/*136.156*/loginForm("password")/*136.177*/.value),format.raw/*136.183*/("""">
                                    </div>
                        </div>
                        <div class="col-sm-6 form-check">
                            <p>Show Password</p>       
                        <label class="switch">
                            
                                <input type="checkbox" onclick="showPassword()">   
                                                         
                                <span class="slider round"></span>
                              </label>                            
                            </div>
                            
                        <div class="col-sm-12 form-group">
                            <button class="btn btn-default pull-right" type="submit">Submit</button>
                        </div>
                        
                    </div>
                
                </form>
                """)))}),format.raw/*156.18*/("""
            """),format.raw/*157.13*/("""</div>
        </div>
        
    </div>
</main>
<!-- //END CLEO AND GLEN -->
""")))}))
      }
    }
  }

  def render(addCustomerForm:Form[models.users.Customer],loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addCustomerForm,loginForm,user)

  def f:((Form[models.users.Customer],Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addCustomerForm,loginForm,user) => apply(addCustomerForm,loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:26 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/signIn.scala.html
                  HASH: 6ea727e2f1607def0bb883285bf9de03375e7787
                  MATRIX: 1013->1|1194->112|1240->109|1268->129|1296->132|1323->151|1362->153|1390->155|1465->204|1502->233|1541->235|1582->249|1658->299|1675->308|1715->328|1757->342|1803->357|1841->368|1880->398|1920->400|1962->414|2039->464|2053->469|2095->490|2137->504|2183->519|2226->535|2399->681|2562->834|2603->836|2653->859|2666->863|2697->873|2743->891|3114->1234|3147->1257|3175->1263|3205->1264|3741->1772|3775->1796|3803->1802|4331->2302|4369->2330|4397->2336|4880->2791|4917->2818|4945->2824|5465->3316|5502->3343|5530->3349|6033->3824|6073->3854|6101->3860|6616->4347|6652->4373|6680->4379|7171->4842|7207->4868|7235->4874|7707->5318|7740->5341|7768->5347|8244->5795|8281->5822|8309->5828|8805->6295|8845->6324|8874->6330|9400->6824|9443->6838|9621->6988|9744->7100|9786->7102|9837->7125|9851->7129|9883->7139|9930->7157|10499->7697|10528->7715|10557->7721|11119->8254|11151->8275|11180->8281|12140->9209|12183->9223
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|50->18|54->22|54->22|54->22|55->23|55->23|55->23|56->24|61->29|61->29|61->29|61->29|68->36|68->36|68->36|75->43|75->43|75->43|82->50|82->50|82->50|90->58|90->58|90->58|97->65|97->65|97->65|105->73|105->73|105->73|112->80|112->80|112->80|119->87|119->87|119->87|126->94|126->94|126->94|133->101|133->101|133->101|144->112|145->113|151->119|151->119|151->119|152->120|152->120|152->120|153->121|161->129|161->129|161->129|168->136|168->136|168->136|188->156|189->157
                  -- GENERATED --
              */
          