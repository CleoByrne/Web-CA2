
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

object tvAcc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),_display_(/*2.2*/main("tvAcc", user)/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
"""),format.raw/*3.1*/("""<!-- //BEGIN CLEO -->
<main>
    <div class="jumbotron">
        <h1 id="productGroupLabel">TV Accessories</h1>
    </div>
    <div class="container">
        <div class="row">
            """),_display_(/*10.14*/for(p<- products) yield /*10.31*/ {_display_(Seq[Any](format.raw/*10.33*/(""" 
                """),_display_(/*11.18*/if(p.getCategory=="TV Accessories" )/*11.54*/{_display_(Seq[Any](format.raw/*11.55*/(""" 
                
                """),format.raw/*13.17*/("""<div class="col-sm-4">

                <div class="card" id="productCard">

                    """),_display_(/*17.22*/if(env.resource("public/images/" + p.getId + ".jpg").isDefined)/*17.85*/{_display_(Seq[Any](format.raw/*17.86*/("""
                        """),format.raw/*18.25*/("""<a href=""""),_display_(/*18.35*/routes/*18.41*/.HomeController.product(p.getId)),format.raw/*18.73*/("""">    
                        <img class="card-img-top" id="cardProductImages" src="/assets/images/"""),_display_(/*19.95*/(p.getId)),format.raw/*19.104*/(""".jpg"></a> """)))}/*19.117*/else/*19.122*/{_display_(Seq[Any](format.raw/*19.123*/("""
                        """),format.raw/*20.25*/("""<a href=""""),_display_(/*20.35*/routes/*20.41*/.HomeController.product(p.getId)),format.raw/*20.73*/(""""> 
                        <img class="card-img-top" id="cardProductImages" src="/assets/images/placeholder.jpg"></a>""")))}),format.raw/*21.116*/("""

                    """),format.raw/*23.21*/("""<div class="card-block" id="productCardText">
                        <h4 class="card-title">"""),_display_(/*24.49*/p/*24.50*/.getName),format.raw/*24.58*/("""</h4>
                        <p class="card-text">"""),_display_(/*25.47*/p/*25.48*/.getDescriptionS),format.raw/*25.64*/("""</p>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">"""),_display_(/*27.58*/p/*27.59*/.getSpec1),format.raw/*27.68*/("""</li>
                            <li class="list-group-item">"""),_display_(/*28.58*/p/*28.59*/.getSpec2),format.raw/*28.68*/("""</li>
                            <li class="list-group-item">"""),_display_(/*29.58*/p/*29.59*/.getSpec3),format.raw/*29.68*/("""</li>
                        </ul>
                    </div>
                    """),_display_(/*32.22*/if(user != null)/*32.38*/{_display_(Seq[Any](format.raw/*32.39*/("""
                        """),_display_(/*33.26*/if("admin".equals(user.getRole()))/*33.60*/ {_display_(Seq[Any](format.raw/*33.62*/("""
                            
                                """),format.raw/*35.33*/("""<div class="btn-group" style='width:100%;'>
                                    <a href=""""),_display_(/*36.47*/routes/*36.53*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*36.93*/("""" style='width:50.5%;float:left;' class="btn btn-success btn-block mt-auto">
                                      Update
                                    </a>
                                  
                                  
                                    <a href=""""),_display_(/*41.47*/routes/*41.53*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*41.93*/("""" style='width:50.5%;float:right;' class="btn btn-danger btn-block mt-auto" onclick="return confirmDel();">
                                      Delete
                                    </a>
                            </div>   
                    
                            """)))}/*46.30*/else/*46.34*/{_display_(Seq[Any](format.raw/*46.35*/("""
                                """),format.raw/*47.33*/("""<a href=""""),_display_(/*47.43*/routes/*47.49*/.HomeController.product(p.getId)),format.raw/*47.81*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>

                            """)))}),format.raw/*49.30*/("""
                        """)))}/*50.26*/else/*50.30*/{_display_(Seq[Any](format.raw/*50.31*/("""
                            """),format.raw/*51.29*/("""<a href=""""),_display_(/*51.39*/routes/*51.45*/.HomeController.product(p.getId)),format.raw/*51.77*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>
                            
                        """)))}),format.raw/*53.26*/("""
                """),format.raw/*54.17*/("""</div>

        </div>
        """)))}),format.raw/*57.10*/(""" 
    """)))}),format.raw/*58.6*/("""
    """),format.raw/*59.5*/("""</div>
    </div>
</main>

<script>
        function confirmDel() """),format.raw/*64.31*/("""{"""),format.raw/*64.32*/("""
            """),format.raw/*65.13*/("""return confirm('Are you sure?');
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/("""
    """),format.raw/*67.5*/("""</script>
    
<!-- //END CLEO -->
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
                  DATE: Wed Dec 20 22:08:26 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/tvAcc.scala.html
                  HASH: 8ebb5be4f151e26915dcd18f9ff7d0c17e2f58e2
                  MATRIX: 1001->1|1180->85|1208->88|1235->107|1274->109|1302->111|1526->308|1559->325|1599->327|1646->347|1691->383|1730->384|1795->421|1924->523|1996->586|2035->587|2089->613|2126->623|2141->629|2194->661|2323->763|2354->772|2386->785|2400->790|2440->791|2494->817|2531->827|2546->833|2599->865|2751->985|2803->1009|2925->1104|2935->1105|2964->1113|3044->1166|3054->1167|3091->1183|3247->1312|3257->1313|3287->1322|3378->1386|3388->1387|3418->1396|3509->1460|3519->1461|3549->1470|3663->1557|3688->1573|3727->1574|3781->1601|3824->1635|3864->1637|3956->1701|4074->1792|4089->1798|4150->1838|4461->2122|4476->2128|4537->2168|4843->2455|4856->2459|4895->2460|4957->2494|4994->2504|5009->2510|5062->2542|5178->2627|5224->2654|5237->2658|5276->2659|5334->2689|5371->2699|5386->2705|5439->2737|5579->2846|5625->2864|5691->2899|5729->2907|5762->2913|5861->2984|5890->2985|5932->2999|6001->3041|6030->3042|6063->3048
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10|42->10|42->10|43->11|43->11|43->11|45->13|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|55->23|56->24|56->24|56->24|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|65->33|65->33|65->33|67->35|68->36|68->36|68->36|73->41|73->41|73->41|78->46|78->46|78->46|79->47|79->47|79->47|79->47|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|85->53|86->54|89->57|90->58|91->59|96->64|96->64|97->65|98->66|98->66|99->67
                  -- GENERATED --
              */
          