
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

object contactUsSuccess extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("cart",user)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""<main>
        <div class="container">
            <div class="jumbotron">   
              <h1>Thank you for your feedback</h1>
                <div class="row">
                  
                    <div class="col-md-12">
                      """),_display_(/*10.24*/if(flash.containsKey("success"))/*10.56*/ {_display_(Seq[Any](format.raw/*10.58*/("""
                          """),format.raw/*11.27*/("""<div class="alert alert-success">
                              """),_display_(/*12.32*/flash/*12.37*/.get("success")),format.raw/*12.52*/("""
                          """),format.raw/*13.27*/("""</div>
                      """)))}),format.raw/*14.24*/(""" 
                  
                            
                            """),format.raw/*17.29*/("""<div style="padding:1em 1em 1em  0em;"><h3>Thank you for getting in contact with us. A member of staff will be in contact with you within the next 24 Hours</h3></div>
                            <a href=""""),_display_(/*18.39*/routes/*18.45*/.HomeController.index()),format.raw/*18.68*/(""""style="width:25%;" class="btn btn-danger btn-block ">Return To Home Page</a>
                                
                              
                    </div> 
                </div>
            </div>            
        </div>  
    </main>                       

""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:24 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/contactUsSuccess.scala.html
                  HASH: 9ed51915a9e21ae811e3abab39587a87c0846f40
                  MATRIX: 970->1|1090->26|1118->29|1143->46|1181->47|1213->53|1496->309|1537->341|1577->343|1633->371|1726->437|1740->442|1776->457|1832->485|1894->516|2003->597|2236->803|2251->809|2295->832
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|49->17|50->18|50->18|50->18
                  -- GENERATED --
              */
          