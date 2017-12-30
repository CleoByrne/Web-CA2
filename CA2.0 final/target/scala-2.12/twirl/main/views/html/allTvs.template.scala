
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

object allTvs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),_display_(/*2.2*/main("allTvs", user)/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<!-- //BEGIN GLEN -->
<main>
    <div class="jumbotron">
        <h1 id="productGroupLabel">TV</h1>
    </div>
    <div class="container">
        <div class="row">
            """),_display_(/*10.14*/for(p <- products) yield /*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/(""" 
                """),_display_(/*11.18*/if(p.getCategory == "TV")/*11.43*/{_display_(Seq[Any](format.raw/*11.44*/("""
                """),format.raw/*12.17*/("""<div class="col-sm-4">

                <div class="card" id="productCard">

                    """),_display_(/*16.22*/if(env.resource("public/images/" + p.getId + ".jpg").isDefined)/*16.85*/{_display_(Seq[Any](format.raw/*16.86*/("""
                        """),format.raw/*17.25*/("""<a href=""""),_display_(/*17.35*/routes/*17.41*/.HomeController.product(p.getId)),format.raw/*17.73*/("""">    
                        <img class="card-img-top" id="cardProductImages" src="/assets/images/"""),_display_(/*18.95*/(p.getId)),format.raw/*18.104*/(""".jpg"></a> """)))}/*18.117*/else/*18.122*/{_display_(Seq[Any](format.raw/*18.123*/("""
                        """),format.raw/*19.25*/("""<a href=""""),_display_(/*19.35*/routes/*19.41*/.HomeController.product(p.getId)),format.raw/*19.73*/(""""> 
                        <img class="card-img-top" id="cardProductImages" src="/assets/images/placeholder.jpg"></a>""")))}),format.raw/*20.116*/("""

                    """),format.raw/*22.21*/("""<div class="card-block" id="productCardText">
                        <h4 class="card-title">"""),_display_(/*23.49*/p/*23.50*/.getName),format.raw/*23.58*/("""</h4>
                        <p class="card-text">"""),_display_(/*24.47*/p/*24.48*/.getDescriptionS),format.raw/*24.64*/("""</p>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">"""),_display_(/*26.58*/p/*26.59*/.getSpec1),format.raw/*26.68*/("""</li>
                            <li class="list-group-item">"""),_display_(/*27.58*/p/*27.59*/.getSpec2),format.raw/*27.68*/("""</li>
                            <li class="list-group-item">"""),_display_(/*28.58*/p/*28.59*/.getSpec3),format.raw/*28.68*/("""</li>
                        </ul>
                    </div>
                    """),_display_(/*31.22*/if(user != null)/*31.38*/{_display_(Seq[Any](format.raw/*31.39*/("""
                        """),_display_(/*32.26*/if("admin".equals(user.getRole()))/*32.60*/ {_display_(Seq[Any](format.raw/*32.62*/("""
                            
                                """),format.raw/*34.33*/("""<div class="btn-group" style='width:100%;'>
                                    <a href=""""),_display_(/*35.47*/routes/*35.53*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*35.93*/("""" style='width:50%;' class="btn btn-success btn-block mt-auto">
                                      Update
                                    </a>
                                  
                                  
                                    <a href=""""),_display_(/*40.47*/routes/*40.53*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*40.93*/("""" style='width:50%;' class="btn btn-danger btn-block mt-auto" onclick="return confirmDel();">
                                      Delete
                                    </a>
                            </div>   
                    
                            """)))}/*45.30*/else/*45.34*/{_display_(Seq[Any](format.raw/*45.35*/("""
                                """),format.raw/*46.33*/("""<a href=""""),_display_(/*46.43*/routes/*46.49*/.HomeController.product(p.getId)),format.raw/*46.81*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>

                            """)))}),format.raw/*48.30*/("""
                        """)))}/*49.26*/else/*49.30*/{_display_(Seq[Any](format.raw/*49.31*/("""
                            """),format.raw/*50.29*/("""<a href=""""),_display_(/*50.39*/routes/*50.45*/.HomeController.product(p.getId)),format.raw/*50.77*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>
                            
                        """)))}),format.raw/*52.26*/("""
                """),format.raw/*53.17*/("""</div>

        </div>
            """)))}),format.raw/*56.14*/("""
        """)))}),format.raw/*57.10*/("""
    """),format.raw/*58.5*/("""</div>
    </div>
</main>
<script>
        function confirmDel() """),format.raw/*62.31*/("""{"""),format.raw/*62.32*/("""
            """),format.raw/*63.13*/("""return confirm('Are you sure?');
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/("""
    """),format.raw/*65.5*/("""</script>
<!-- //END GLEN -->
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
                  DATE: Wed Dec 20 22:08:23 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/allTvs.scala.html
                  HASH: a2221080f6c42692e844480bf839898e5c0da70a
                  MATRIX: 1002->1|1181->85|1209->88|1237->108|1276->110|1304->112|1516->297|1550->315|1590->317|1637->337|1671->362|1710->363|1756->381|1885->483|1957->546|1996->547|2050->573|2087->583|2102->589|2155->621|2284->723|2315->732|2347->745|2361->750|2401->751|2455->777|2492->787|2507->793|2560->825|2712->945|2764->969|2886->1064|2896->1065|2925->1073|3005->1126|3015->1127|3052->1143|3208->1272|3218->1273|3248->1282|3339->1346|3349->1347|3379->1356|3470->1420|3480->1421|3510->1430|3624->1517|3649->1533|3688->1534|3742->1561|3785->1595|3825->1597|3917->1661|4035->1752|4050->1758|4111->1798|4409->2069|4424->2075|4485->2115|4777->2388|4790->2392|4829->2393|4891->2427|4928->2437|4943->2443|4996->2475|5112->2560|5158->2587|5171->2591|5210->2592|5268->2622|5305->2632|5320->2638|5373->2670|5513->2779|5559->2797|5629->2836|5671->2847|5704->2853|5801->2922|5830->2923|5872->2937|5941->2979|5970->2980|6003->2986
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10|42->10|42->10|43->11|43->11|43->11|44->12|48->16|48->16|48->16|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|52->20|54->22|55->23|55->23|55->23|56->24|56->24|56->24|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|64->32|64->32|66->34|67->35|67->35|67->35|72->40|72->40|72->40|77->45|77->45|77->45|78->46|78->46|78->46|78->46|80->48|81->49|81->49|81->49|82->50|82->50|82->50|82->50|84->52|85->53|88->56|89->57|90->58|94->62|94->62|95->63|96->64|96->64|97->65
                  -- GENERATED --
              */
          