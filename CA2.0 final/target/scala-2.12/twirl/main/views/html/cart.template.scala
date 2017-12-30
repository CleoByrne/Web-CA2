
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

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("cart",user)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""<main>
        <div class="container">
            <div class="jumbotron">   
              <h1>My Cart</h1>
                <div class="row">
                  
                    <div class="col-md-12">
                      """),_display_(/*10.24*/if(flash.containsKey("success"))/*10.56*/ {_display_(Seq[Any](format.raw/*10.58*/("""
                          """),format.raw/*11.27*/("""<div class="alert alert-success">
                              """),_display_(/*12.32*/flash/*12.37*/.get("success")),format.raw/*12.52*/("""
                          """),format.raw/*13.27*/("""</div>
                      """)))}),format.raw/*14.24*/(""" 
                  
                            
                            """),format.raw/*17.29*/("""<div style="padding:1em 1em 1em  0em;"><h3>Please login to view your cart or Create an Account to get Started Today!!!</h3></div>
                            <a href=""""),_display_(/*18.39*/controllers/*18.50*/.security.routes.LoginCtrl.login()),format.raw/*18.84*/(""""style="width:25%;" class="btn btn-danger btn-block ">Click here to Login or Sign up</a>
                                
                              
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
                  DATE: Wed Dec 20 22:08:23 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/cart.scala.html
                  HASH: d1e0fa527358beea4df7ecbfa6ffd325843fabc3
                  MATRIX: 958->1|1078->26|1106->29|1131->46|1169->47|1201->53|1464->289|1505->321|1545->323|1601->351|1694->417|1708->422|1744->437|1800->465|1862->496|1971->577|2167->746|2187->757|2242->791
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|49->17|50->18|50->18|50->18
                  -- GENERATED --
              */
          