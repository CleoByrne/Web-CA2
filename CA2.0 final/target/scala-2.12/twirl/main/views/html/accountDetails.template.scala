
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

object accountDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, updateUserForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.Product
/*5.2*/import helper._


Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Account Details", user)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
        """),format.raw/*8.9*/("""<main>
	<h3 style='text-align: center;'>Account Details</h3>
	"""),_display_(/*10.3*/if("admin".equals(user.getRole()))/*10.37*/{_display_(Seq[Any](format.raw/*10.38*/("""
        """),format.raw/*11.9*/("""<div class="col-sm-12">

                """),_display_(/*13.18*/form(action = controllers.security.routes.LoginCtrl.updateUserSubmit(email), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*13.175*/ {_display_(Seq[Any](format.raw/*13.177*/("""
                    """),_display_(/*14.22*/CSRF/*14.26*/.formField),format.raw/*14.36*/("""
                """),format.raw/*15.17*/("""<form>
                        
                    <div class="row">
                            <div "form-group">
                                    <label for="validationDefault04"></label>
                                    <input type="hidden" name="role" class="form-control input-xs" placeholder="Role" value="admin" value=""""),_display_(/*20.141*/updateUserForm("role")/*20.163*/.value),format.raw/*20.169*/(""" """),format.raw/*20.170*/("""">
                                    <div class="invalid-feedback">
                                        Please provide a valid role.
                                    </div>
                                </div>
                                <div class="col-sm-12 form-group">
                                        <label for="validationDefault03"></label>
                                        <input type="email" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*27.132*/updateUserForm("email")/*27.155*/.value),format.raw/*27.161*/("""">
                                        <div class="invalid-feedback">
                                            Please provide a valid email.
                                        </div>
                                    </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault01"></label>
                            <input type="text" name="firstName" class="form-control input-xs" placeholder="First Name" value=""""),_display_(/*34.128*/updateUserForm("firstName")/*34.155*/.value),format.raw/*34.161*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid first name.
                            </div>
                        </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault02"></label>
                            <input type="text" name="lastName" class="form-control input-xs" placeholder="Last Name" value=""""),_display_(/*41.126*/updateUserForm("lastName")/*41.152*/.value),format.raw/*41.158*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid last name.
                            </div>
                        </div>
                        
                        <div class="col-sm-12 form-group">
                                <label for="validationDefault05"></label>
                                <input type="password" name="password" class="form-control input-xs" placeholder="Password" value=""""),_display_(/*49.133*/updateUserForm("password")/*49.159*/.value),format.raw/*49.165*/("""">
                                <div class="invalid-feedback">
                                    Please provide a valid password.
                                </div>
                            </div>
                        
                        <div class="col-sm-12 form-group">
                                <div class="actions">
                                        <input type="submit" value="Save" class="btn btn-success pull-right">
                                        
                                              <a href=""""),_display_(/*59.57*/routes/*59.63*/.HomeController.index()),format.raw/*59.86*/("""">
                                                  <button class="btn btn-danger pull-left" role="button">Cancel</button>
                                              </a>
                                    </div>
                        </div>
                    </div>
                </form>
            """)))}),format.raw/*66.14*/("""
        """),format.raw/*67.9*/("""</div>
    """)))}),format.raw/*68.6*/("""

    """),_display_(/*70.6*/if("customer".equals(user.getRole()))/*70.43*/{_display_(Seq[Any](format.raw/*70.44*/("""
        """),format.raw/*71.9*/("""<div class="col-sm-12">

                """),_display_(/*73.18*/form(action = controllers.security.routes.LoginCtrl.updateUserSubmit(email), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*73.175*/ {_display_(Seq[Any](format.raw/*73.177*/("""
                    """),_display_(/*74.22*/CSRF/*74.26*/.formField),format.raw/*74.36*/("""
                """),format.raw/*75.17*/("""<form>
                        
                    <div class="row">
                            <div "form-group">
                                    <label for="validationDefault01"></label>
                                    <input type="hidden" name="role" class="form-control input-xs" placeholder="Role" value="customer" value=""""),_display_(/*80.144*/updateUserForm("role")/*80.166*/.value),format.raw/*80.172*/(""" """),format.raw/*80.173*/("""">
                                    <div class="invalid-feedback">
                                        Please provide a valid role.
                                    </div>
                                </div>
                                <div class="col-sm-12 form-group">
                                        <label for="validationDefault02"></label>
                                        <input type="email" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*87.132*/updateUserForm("email")/*87.155*/.value),format.raw/*87.161*/("""">
                                        <div class="invalid-feedback">
                                            Please provide a valid email.
                                        </div>
                                    </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault03"></label>
                            <input type="text" name="firstName" class="form-control input-xs" placeholder="First Name" value=""""),_display_(/*94.128*/updateUserForm("firstName")/*94.155*/.value),format.raw/*94.161*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid first name.
                            </div>
                        </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault04"></label>
                            <input type="text" name="lastName" class="form-control input-xs" placeholder="Last Name" value=""""),_display_(/*101.126*/updateUserForm("lastName")/*101.152*/.value),format.raw/*101.158*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid last name.
                            </div>
                        </div>
                        
                        <div class="col-sm-12 form-group">
                                <label for="validationDefault05"></label>
                                <input type="password" name="password" class="form-control input-xs" placeholder="Password" value=""""),_display_(/*109.133*/updateUserForm("password")/*109.159*/.value),format.raw/*109.165*/("""">
                                <div class="invalid-feedback">
                                    Please provide a valid password.
                                </div>
                            </div>
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault06"></label>
                            <input type="tel" name="phoneNumber" class="form-control input-xs" placeholder="Phone Number" value=""""),_display_(/*116.131*/updateUserForm("phoneNumber")/*116.160*/.value),format.raw/*116.166*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid phone number.
                            </div>
                        </div>
                        
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault07"></label>
                            <input type="text" name="street1" class="form-control input-xs" placeholder="Street Line 1" value=""""),_display_(/*124.129*/updateUserForm("street1")/*124.154*/.value),format.raw/*124.160*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid street address.
                            </div>
                        </div>
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault08"></label>
                            <input type="text" name="street2" class="form-control input-xs" placeholder="Street Line 2" value=""""),_display_(/*131.129*/updateUserForm("street2")/*131.154*/.value),format.raw/*131.160*/("""">
                            <div class="invalid-feedback">
                                Please provide a street address.
                            </div>
                        </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault09"></label>
                            <input type="text" name="town" class="form-control input-xs" placeholder="Town" value=""""),_display_(/*138.117*/updateUserForm("town")/*138.139*/.value),format.raw/*138.145*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid town.
                            </div>
                        </div>
                        <div class="col-sm-6 form-group">
                            <label for="validationDefault10"></label>
                            <input type="text" name="postCode" class="form-control input-xs" placeholder="Postcode" value=""""),_display_(/*145.125*/updateUserForm("postCode")/*145.151*/.value),format.raw/*145.157*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid postcode.
                            </div>
                        </div>
                        <div class="col-sm-12 form-group">
                            <label for="validationDefault11"></label>
                            <input type="number" name="creditCard" class="form-control input-xs" placeholder="Credit Card Number" value=""""),_display_(/*152.139*/updateUserForm("creditCard")/*152.167*/.value),format.raw/*152.173*/("""">
                            <div class="invalid-feedback">
                                Please provide a valid credit card number.
                            </div>
                        </div>
                        
                        <div class="col-sm-12 form-group">
                                <div class="actions">
                                        <input type="submit" value="Save" class="btn btn-success pull-right">
                                        
                                              <a href=""""),_display_(/*162.57*/routes/*162.63*/.HomeController.index()),format.raw/*162.86*/("""">
                                                  <button class="btn btn-danger pull-left" role="button">Cancel</button>
                                              </a>
                                    </div>
                        </div>
                    </div>
                </form>
            """)))}),format.raw/*169.14*/("""
        """),format.raw/*170.9*/("""</div>
""")))}),format.raw/*171.2*/("""
"""),format.raw/*172.1*/("""</div>
</div>
</main>
""")))}),format.raw/*175.2*/("""


"""))
      }
    }
  }

  def render(email:String,updateUserForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(email,updateUserForm,user)

  def f:((String,Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (email,updateUserForm,user) => apply(email,updateUserForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:22 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/accountDetails.scala.html
                  HASH: 05ca0c91fd8d87d53e35b5082fcb6a3ee2e678c9
                  MATRIX: 999->1|1153->87|1182->113|1227->82|1257->110|1285->130|1313->133|1350->162|1389->164|1425->174|1516->239|1559->273|1598->274|1635->284|1706->328|1873->485|1914->487|1964->510|1977->514|2008->524|2054->542|2422->882|2454->904|2482->910|2512->911|3048->1419|3081->1442|3109->1448|3637->1948|3674->1975|3702->1981|4185->2436|4221->2462|4249->2468|4769->2960|4805->2986|4833->2992|5424->3556|5439->3562|5483->3585|5834->3905|5871->3915|5914->3928|5949->3937|5995->3974|6034->3975|6071->3985|6142->4029|6309->4186|6350->4188|6400->4211|6413->4215|6444->4225|6490->4243|6861->4586|6893->4608|6921->4614|6951->4615|7487->5123|7520->5146|7548->5152|8076->5652|8113->5679|8141->5685|8625->6140|8662->6166|8691->6172|9212->6664|9249->6690|9278->6696|9782->7171|9822->7200|9851->7206|10367->7693|10403->7718|10432->7724|10924->8187|10960->8212|10989->8218|11462->8662|11495->8684|11524->8690|12001->9138|12038->9164|12067->9170|12563->9637|12602->9665|12631->9671|13217->10229|13233->10235|13278->10258|13630->10578|13668->10588|13708->10597|13738->10599|13795->10625
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|39->7|39->7|39->7|40->8|42->10|42->10|42->10|43->11|45->13|45->13|45->13|46->14|46->14|46->14|47->15|52->20|52->20|52->20|52->20|59->27|59->27|59->27|66->34|66->34|66->34|73->41|73->41|73->41|81->49|81->49|81->49|91->59|91->59|91->59|98->66|99->67|100->68|102->70|102->70|102->70|103->71|105->73|105->73|105->73|106->74|106->74|106->74|107->75|112->80|112->80|112->80|112->80|119->87|119->87|119->87|126->94|126->94|126->94|133->101|133->101|133->101|141->109|141->109|141->109|148->116|148->116|148->116|156->124|156->124|156->124|163->131|163->131|163->131|170->138|170->138|170->138|177->145|177->145|177->145|184->152|184->152|184->152|194->162|194->162|194->162|201->169|202->170|203->171|204->172|207->175
                  -- GENERATED --
              */
          