
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),_display_(/*2.2*/main("Home", user)/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<!-- // BEGIN CLEO AND GLEN -->
  <main>
  <div class="container">
    
    <div class="row">
      """),_display_(/*8.8*/for(p <- products) yield /*8.26*/{_display_(Seq[Any](format.raw/*8.27*/("""
        """),_display_(/*9.10*/if(p.getOnSale == 1)/*9.30*/{_display_(Seq[Any](format.raw/*9.31*/("""
      """),format.raw/*10.7*/("""<div class="col-sm-4">
        <div class="card" id="indexSaleCard">
          <div class="card-header">CHRISTMAS DEAL</div>
          <div class="card-body">
            """),_display_(/*14.14*/if(env.resource("public/images/" + p.getId + ".jpg").isDefined)/*14.77*/{_display_(Seq[Any](format.raw/*14.78*/("""
              """),format.raw/*15.15*/("""<a href=""""),_display_(/*15.25*/routes/*15.31*/.HomeController.product(p.getId)),format.raw/*15.63*/("""">
                <img src="/assets/images/"""),_display_(/*16.43*/(p.getId)),format.raw/*16.52*/(""".jpg" class="img-fluid" style="height:10em; width:20em; text-align:centre;" alt="Image">
                </a>
          """)))}/*18.13*/else/*18.18*/{_display_(Seq[Any](format.raw/*18.19*/("""
            """),format.raw/*19.13*/("""<a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.product(p.getId)),format.raw/*19.61*/("""">
            <img src="/assets/images/placeholder.jpg" class="img-fluid" style="height:10em; width:10em; text-align:centre;" alt="Image">
            </a>
          """)))}),format.raw/*22.12*/("""
            """),format.raw/*23.13*/("""<div id="priceMore">
              <ul>
                <li>
                  <strong>Price :</strong> Was
                  <span class="salePrice">&euro; """),_display_(/*27.51*/("%.2f".format(p.getPrice))),format.raw/*27.78*/("""</span>, Now
                  <span>&euro; """),_display_(/*28.33*/("%.2f".format(p.getSalePrice))),format.raw/*28.64*/("""</span>
                </li>
                <li>
                  <a href=""""),_display_(/*31.29*/routes/*31.35*/.HomeController.product(p.getId)),format.raw/*31.67*/("""" class="moreInfoBtn">Click for more info</a>
                </li>
              </ul>
            </div>
          </div>
          <div class="card-footer">On Sale Now! Limited Time Only!</div>
        </div>
      </div>
    """)))}),format.raw/*39.6*/("""
    """)))}),format.raw/*40.6*/("""
  """),format.raw/*41.3*/("""</div>
</div>
  <br>
  <br>
</main>
<!-- // END CLEO AND GLEN -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,user,env)

  def f:((List[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,user,env) => apply(products,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:24 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/index.scala.html
                  HASH: 0a053c51e785e482ad4366849fafa388ee04e21e
                  MATRIX: 1001->1|1180->85|1207->87|1233->105|1272->107|1299->108|1425->209|1458->227|1496->228|1532->238|1560->258|1598->259|1632->266|1831->438|1903->501|1942->502|1985->517|2022->527|2037->533|2090->565|2162->610|2192->619|2332->741|2345->746|2384->747|2425->760|2462->770|2477->776|2530->808|2729->976|2770->989|2955->1147|3003->1174|3075->1219|3127->1250|3233->1329|3248->1335|3301->1367|3561->1597|3597->1603|3627->1606
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|40->8|40->8|40->8|41->9|41->9|41->9|42->10|46->14|46->14|46->14|47->15|47->15|47->15|47->15|48->16|48->16|50->18|50->18|50->18|51->19|51->19|51->19|51->19|54->22|55->23|59->27|59->27|60->28|60->28|63->31|63->31|63->31|71->39|72->40|73->41
                  -- GENERATED --
              */
          