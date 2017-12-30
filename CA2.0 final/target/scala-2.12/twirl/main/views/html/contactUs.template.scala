
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

object contactUs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Contact],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contactUsForm: Form[models.Contact], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("ContactUs", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
  """),format.raw/*6.3*/("""<!-- //BEGIN CLEO AND GLEN -->
<main>
  <h2 class="text-center">Get in touch</h2>
  <div class="row">
    <div class="col-sm-5">
      <p>Contact us and we'll get back to you within 24 hours.</p>
      <p>
        <span class="fa fa-map-marker"></span> Dublin, Ireland</p>
      <p>
        <span class="fa fa-phone"></span> +00 1515151515</p>
      <p>
        <span class="fa fa-envelope"></span> contactUs@gmail.com</p>

      <div id="googleMap"></div>

    </div>

    <div class="col-sm-7">
        """),_display_(/*24.10*/form(action = routes.HomeController.contactUsSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*24.145*/ {_display_(Seq[Any](format.raw/*24.147*/("""
					"""),_display_(/*25.7*/CSRF/*25.11*/.formField),format.raw/*25.21*/("""
      """),format.raw/*26.7*/("""<form>
        <div class="row">
          <div class="col-sm-6 form-group">
            <label for="validationDefault01"></label>
            <input class="form-control" id="firstName" name="firstName" placeholder="First Name" type="text" value=""""),_display_(/*30.118*/contactUsForm("firstName")/*30.144*/.value),format.raw/*30.150*/("""" required>
            <div class="invalid-feedback">
              Please provide a valid first name.
            </div>
          </div>
          <div class="col-sm-6 form-group">
            <label for="validationDefault02"></label>
            <input class="form-control" id="lastName" name="LastName" placeholder="Last Name" type="text" value=""""),_display_(/*37.115*/contactUsForm("lastName")/*37.140*/.value),format.raw/*37.146*/("""" required>
            <div class="invalid-feedback">
              Please provide a valid last name.
            </div>
          </div>
          <div class="col-sm-12 form-group">
            <label for="validationDefault03"></label>
            <input class="form-control" id="email" name="email" placeholder="Email" type="email" value=""""),_display_(/*44.106*/contactUsForm("email")/*44.128*/.value),format.raw/*44.134*/("""" required>
            <div class="invalid-feedback">
              Please provide a valid email.
            </div>
          </div>
          <div class="col-sm-12 form-group">
            <label for="validationDefault04"></label>
            <input class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Phone Number" type="text" value=""""),_display_(/*51.124*/contactUsForm("phoneNumber")/*51.152*/.value),format.raw/*51.158*/("""" required>
            <div class="invalid-feedback">
              Please provide a valid phone number.
            </div>
          </div>
          <div class="col-sm-12 form-group">
            <label for="validationDefault05"></label>
            <input class="form-control" id="subject" name="subject" placeholder="Subject" type="text" value=""""),_display_(/*58.111*/contactUsForm("subject")/*58.135*/.value),format.raw/*58.141*/("""" required>
            <div class="invalid-feedback">
              Please provide a valid subject.
            </div>
          </div>
          <div class="col-sm-12 form-group">
              <label for="validationDefault06"></label>
              <textarea class="form-control" id="comment" name="comment" placeholder="Comment" rows="8" required>"""),_display_(/*65.115*/contactUsForm("comment")/*65.139*/.value),format.raw/*65.145*/("""</textarea>
          <div class="invalid-feedback">
              Please fill out a comment.
          </div>
        </div>

        </div>
  
        <br>
        <div class="row">
          <div class="col-sm-12 form-group">
            <button class="btn btn-default pull-right" type="submit">Submit</button>
          </div>
        </div>
      </form>
    """)))}),format.raw/*80.6*/("""
    """),format.raw/*81.5*/("""</div>
  </div>
</main>
<!-- //BEGIN CLEO AND GLEN -->
""")))}))
      }
    }
  }

  def render(contactUsForm:Form[models.Contact],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(contactUsForm,user)

  def f:((Form[models.Contact],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (contactUsForm,user) => apply(contactUsForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:24 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/contactUs.scala.html
                  HASH: 331876bb137bb779d4e9a99d57ec1372fdb27cbc
                  MATRIX: 984->1|1119->68|1164->63|1194->85|1222->88|1253->111|1292->113|1322->117|1873->642|2018->777|2059->779|2093->787|2106->791|2137->801|2172->809|2452->1061|2488->1087|2516->1093|2903->1452|2938->1477|2966->1483|3344->1833|3376->1855|3404->1861|3796->2225|3834->2253|3862->2259|4248->2617|4282->2641|4310->2647|4697->3006|4731->3030|4759->3036|5169->3416|5202->3422
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|56->24|56->24|56->24|57->25|57->25|57->25|58->26|62->30|62->30|62->30|69->37|69->37|69->37|76->44|76->44|76->44|83->51|83->51|83->51|90->58|90->58|90->58|97->65|97->65|97->65|112->80|113->81
                  -- GENERATED --
              */
          