
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

object phoneAcc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),_display_(/*2.2*/main("phoneAcc", user)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<!-- //BEGIN CLEO -->
    <main>
            <div class="jumbotron">    
                    <h1 id="productGroupLabel">Phone Accessories</h1>
                    </div>
                    <div class="container">
                        <div class="row">
                            """),_display_(/*10.30*/for(p<- products) yield /*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/(""" 
                                """),_display_(/*11.34*/if(p.getCategory=="Phone-Accessories" )/*11.73*/{_display_(Seq[Any](format.raw/*11.74*/(""" 
                                
                                """),format.raw/*13.33*/("""<div class="col-sm-4">
                
                                <div class="card" id="productCard">
                
                                    """),_display_(/*17.38*/if(env.resource("public/images/" + p.getId + ".jpg").isDefined)/*17.101*/{_display_(Seq[Any](format.raw/*17.102*/("""
                                        """),format.raw/*18.41*/("""<a href=""""),_display_(/*18.51*/routes/*18.57*/.HomeController.product(p.getId)),format.raw/*18.89*/("""">    
                                        <img class="card-img-top" id="cardProductImages" src="/assets/images/"""),_display_(/*19.111*/(p.getId)),format.raw/*19.120*/(""".jpg"></a> """)))}/*19.133*/else/*19.138*/{_display_(Seq[Any](format.raw/*19.139*/("""
                                        """),format.raw/*20.41*/("""<a href=""""),_display_(/*20.51*/routes/*20.57*/.HomeController.product(p.getId)),format.raw/*20.89*/(""""> 
                                        <img class="card-img-top" id="cardProductImages" src="/assets/images/placeholder.jpg"></a>""")))}),format.raw/*21.132*/("""
                                        
                                    """),format.raw/*23.37*/("""<div class="card-block" id="productCardText">
                                        <h4 class="card-title">"""),_display_(/*24.65*/p/*24.66*/.getName),format.raw/*24.74*/("""</h4>
                                        <p class="card-text">"""),_display_(/*25.63*/p/*25.64*/.getDescriptionS),format.raw/*25.80*/("""</p>
                                        <ul class="list-group list-group-flush">
                                            <li class="list-group-item">"""),_display_(/*27.74*/p/*27.75*/.getSpec1),format.raw/*27.84*/("""</li>
                                            <li class="list-group-item">"""),_display_(/*28.74*/p/*28.75*/.getSpec2),format.raw/*28.84*/("""</li>
                                            <li class="list-group-item">"""),_display_(/*29.74*/p/*29.75*/.getSpec3),format.raw/*29.84*/("""</li>
                                        </ul>
                                    </div>
                                    """),_display_(/*32.38*/if(user != null)/*32.54*/{_display_(Seq[Any](format.raw/*32.55*/("""
                                        """),_display_(/*33.42*/if("admin".equals(user.getRole()))/*33.76*/ {_display_(Seq[Any](format.raw/*33.78*/("""
                                            
                                                """),format.raw/*35.49*/("""<div class="btn-group" style='width:100%;'>
                                                    <a href=""""),_display_(/*36.63*/routes/*36.69*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*36.109*/("""" style='width:50.5%;float:left;' class="btn btn-success btn-block mt-auto">
                                                      Update
                                                    </a>
                                                  
                                                  
                                                    <a href=""""),_display_(/*41.63*/routes/*41.69*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*41.109*/("""" style='width:50.5%;float:right;' class="btn btn-danger btn-block mt-auto" onclick="return confirmDel();">
                                                      Delete
                                                    </a>
                                            </div>   
                                    
                                            """)))}/*46.46*/else/*46.50*/{_display_(Seq[Any](format.raw/*46.51*/("""
                                                """),format.raw/*47.49*/("""<a href=""""),_display_(/*47.59*/routes/*47.65*/.HomeController.product(p.getId)),format.raw/*47.97*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>
            
                                            """)))}),format.raw/*49.46*/("""
                                        """)))}/*50.42*/else/*50.46*/{_display_(Seq[Any](format.raw/*50.47*/("""
                                            """),format.raw/*51.45*/("""<a href=""""),_display_(/*51.55*/routes/*51.61*/.HomeController.product(p.getId)),format.raw/*51.93*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>
                                            
                                        """)))}),format.raw/*53.42*/("""
                                """),format.raw/*54.33*/("""</div>
                
                        </div>
                        """)))}),format.raw/*57.26*/(""" 
                    """)))}),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""</div>
                    </div> 
            </main>

            <script>
                    function confirmDel() """),format.raw/*64.43*/("""{"""),format.raw/*64.44*/("""
                        """),format.raw/*65.25*/("""return confirm('Are you sure?');
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/("""
                """),format.raw/*67.17*/("""</script>
                
    <!-- //END CLEO      -->
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
                  DATE: Wed Dec 20 22:08:25 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/phoneAcc.scala.html
                  HASH: 360aa36a3d7218e104e0fa91eaef4efcdf24248b
                  MATRIX: 1004->1|1183->85|1211->88|1241->110|1280->112|1312->118|1631->410|1664->427|1704->429|1767->465|1815->504|1854->505|1951->574|2144->740|2217->803|2257->804|2327->846|2364->856|2379->862|2432->894|2578->1012|2609->1021|2641->1034|2655->1039|2695->1040|2765->1082|2802->1092|2817->1098|2870->1130|3038->1266|3146->1346|3284->1457|3294->1458|3323->1466|3419->1535|3429->1536|3466->1552|3654->1713|3664->1714|3694->1723|3801->1803|3811->1804|3841->1813|3948->1893|3958->1894|3988->1903|4150->2038|4175->2054|4214->2055|4284->2098|4327->2132|4367->2134|4491->2230|4625->2337|4640->2343|4702->2383|5093->2747|5108->2753|5170->2793|5556->3160|5569->3164|5608->3165|5686->3215|5723->3225|5738->3231|5791->3263|5935->3376|5997->3419|6010->3423|6049->3424|6123->3470|6160->3480|6175->3486|6228->3518|6400->3659|6462->3693|6576->3776|6631->3800|6681->3822|6833->3946|6862->3947|6916->3973|6998->4027|7027->4028|7073->4046
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10|42->10|42->10|43->11|43->11|43->11|45->13|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|55->23|56->24|56->24|56->24|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|65->33|65->33|65->33|67->35|68->36|68->36|68->36|73->41|73->41|73->41|78->46|78->46|78->46|79->47|79->47|79->47|79->47|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|85->53|86->54|89->57|90->58|91->59|96->64|96->64|97->65|98->66|98->66|99->67
                  -- GENERATED --
              */
          