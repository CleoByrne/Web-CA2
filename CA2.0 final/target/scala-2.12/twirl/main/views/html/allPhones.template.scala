
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

object allPhones extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/(""" """),_display_(/*1.88*/main("allPhones", user)/*1.111*/ {_display_(Seq[Any](format.raw/*1.113*/("""
"""),format.raw/*2.1*/("""<!-- //BEGIN GLEN -->
<main>
    <div class="jumbotron">
        <h1 id="productGroupLabel">Phones</h1>
    </div>
    <div class="container">
        <div class="row">
            """),_display_(/*9.14*/for(p <- products) yield /*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/(""" """),_display_(/*9.36*/if(p.getCategory=="Phone" )/*9.63*/{_display_(Seq[Any](format.raw/*9.64*/(""" """),format.raw/*9.65*/("""<div class="col-sm-4">

                <div class="card" id="productCard">

                    """),_display_(/*13.22*/if(env.resource("public/images/" + p.getId + ".jpg").isDefined)/*13.85*/{_display_(Seq[Any](format.raw/*13.86*/("""
                    """),format.raw/*14.21*/("""<a href=""""),_display_(/*14.31*/routes/*14.37*/.HomeController.product(p.getId)),format.raw/*14.69*/("""">    
                    <img class="card-img-top" id="cardProductImages" src="/assets/images/"""),_display_(/*15.91*/(p.getId)),format.raw/*15.100*/(""".jpg"></a> """)))}/*15.113*/else/*15.118*/{_display_(Seq[Any](format.raw/*15.119*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.HomeController.product(p.getId)),format.raw/*16.69*/(""""> 
                    <img class="card-img-top" id="cardProductImages" src="/assets/images/placeholder.jpg"></a>""")))}),format.raw/*17.112*/("""

                    """),format.raw/*19.21*/("""<div class="card-block" id="productCardText">
                        <h4 class="card-title">"""),_display_(/*20.49*/p/*20.50*/.getName),format.raw/*20.58*/("""</h4>
                        <p class="card-text">"""),_display_(/*21.47*/p/*21.48*/.getDescriptionS),format.raw/*21.64*/("""</p>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">"""),_display_(/*23.58*/p/*23.59*/.getSpec1),format.raw/*23.68*/("""</li>
                            <li class="list-group-item">"""),_display_(/*24.58*/p/*24.59*/.getSpec2),format.raw/*24.68*/("""</li>
                            <li class="list-group-item">"""),_display_(/*25.58*/p/*25.59*/.getSpec3),format.raw/*25.68*/("""</li>
                        </ul>
                    </div>
                    """),_display_(/*28.22*/if(user != null)/*28.38*/{_display_(Seq[Any](format.raw/*28.39*/(""" """),_display_(/*28.41*/if("admin".equals(user.getRole()))/*28.75*/ {_display_(Seq[Any](format.raw/*28.77*/("""

                    """),format.raw/*30.21*/("""<div class="btn-group" style='width:100%;'>
                        <a href=""""),_display_(/*31.35*/routes/*31.41*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*31.81*/("""" style='width:50.5%;' class="btn btn-success btn-block mt-auto">
                            Update
                        </a>


                        <a href=""""),_display_(/*36.35*/routes/*36.41*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*36.81*/("""" style='width:50.5%;' class="btn btn-danger btn-block mt-auto" onclick="return confirmDel();">
                            Delete
                        </a>
                    </div>

                    """)))}/*41.22*/else/*41.26*/{_display_(Seq[Any](format.raw/*41.27*/("""
                    """),format.raw/*42.21*/("""<a href=""""),_display_(/*42.31*/routes/*42.37*/.HomeController.product(p.getId)),format.raw/*42.69*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>

                    """)))}),format.raw/*44.22*/(""" """)))}/*44.24*/else/*44.28*/{_display_(Seq[Any](format.raw/*44.29*/("""
                    """),format.raw/*45.21*/("""<a href=""""),_display_(/*45.31*/routes/*45.37*/.HomeController.product(p.getId)),format.raw/*45.69*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>

                    """)))}),format.raw/*47.22*/("""
                """),format.raw/*48.17*/("""</div>

        </div>
        """)))}),format.raw/*51.10*/(""" """)))}),format.raw/*51.12*/("""
    """),format.raw/*52.5*/("""</div>
    </div>
</main>
<script>
        function confirmDel() """),format.raw/*56.31*/("""{"""),format.raw/*56.32*/("""
            """),format.raw/*57.13*/("""return confirm('Are you sure?');
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""
    """),format.raw/*59.5*/("""</script>
    
<!-- //END CLEO    -->
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
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/allPhones.scala.html
                  HASH: aa009243cca3369f8fc4bfd9da903137043527c2
                  MATRIX: 1005->1|1184->85|1212->87|1244->110|1284->112|1312->114|1527->303|1560->321|1599->323|1627->325|1662->352|1700->353|1728->354|1857->456|1929->519|1968->520|2018->542|2055->552|2070->558|2123->590|2248->688|2279->697|2311->710|2325->715|2365->716|2415->738|2452->748|2467->754|2520->786|2668->902|2720->926|2842->1021|2852->1022|2881->1030|2961->1083|2971->1084|3008->1100|3164->1229|3174->1230|3204->1239|3295->1303|3305->1304|3335->1313|3426->1377|3436->1378|3466->1387|3580->1474|3605->1490|3644->1491|3673->1493|3716->1527|3756->1529|3808->1553|3914->1632|3929->1638|3990->1678|4188->1849|4203->1855|4264->1895|4497->2109|4510->2113|4549->2114|4599->2136|4636->2146|4651->2152|4704->2184|4812->2261|4833->2263|4846->2267|4885->2268|4935->2290|4972->2300|4987->2306|5040->2338|5148->2415|5194->2433|5260->2468|5293->2470|5326->2476|5423->2545|5452->2546|5494->2560|5563->2602|5592->2603|5625->2609
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|41->9|41->9|41->9|41->9|41->9|41->9|41->9|45->13|45->13|45->13|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|48->16|48->16|48->16|48->16|49->17|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|60->28|60->28|60->28|60->28|60->28|60->28|62->30|63->31|63->31|63->31|68->36|68->36|68->36|73->41|73->41|73->41|74->42|74->42|74->42|74->42|76->44|76->44|76->44|76->44|77->45|77->45|77->45|77->45|79->47|80->48|83->51|83->51|84->52|88->56|88->56|89->57|90->58|90->58|91->59
                  -- GENERATED --
              */
          