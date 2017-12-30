
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

object computing extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),_display_(/*2.2*/main("Computing", user)/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),format.raw/*3.5*/("""<!-- //BEGIN GLEN -->
    <main>
            <div class="jumbotron">    
                    <h1 id="productGroupLabel">Computing</h1>
                    </div>
                    <div class="container">
                        <div class="row">
                            """),_display_(/*10.30*/for(p<- products) yield /*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/(""" 
                                """),_display_(/*11.34*/if(p.getCategory=="Computing")/*11.64*/{_display_(Seq[Any](format.raw/*11.65*/(""" 
                                
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
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/computing.scala.html
                  HASH: 3ac5fe8d0bcaed9574f8bdf464630a2f3d86344c
                  MATRIX: 1005->1|1184->85|1212->88|1243->111|1282->113|1314->119|1625->403|1658->420|1698->422|1761->458|1800->488|1839->489|1936->558|2129->724|2202->787|2242->788|2312->830|2349->840|2364->846|2417->878|2563->996|2594->1005|2626->1018|2640->1023|2680->1024|2750->1066|2787->1076|2802->1082|2855->1114|3023->1250|3107->1306|3245->1417|3255->1418|3284->1426|3380->1495|3390->1496|3427->1512|3615->1673|3625->1674|3655->1683|3762->1763|3772->1764|3802->1773|3909->1853|3919->1854|3949->1863|4111->1998|4136->2014|4175->2015|4245->2058|4288->2092|4328->2094|4452->2190|4586->2297|4601->2303|4663->2343|5054->2707|5069->2713|5131->2753|5517->3120|5530->3124|5569->3125|5647->3175|5684->3185|5699->3191|5752->3223|5896->3336|5958->3379|5971->3383|6010->3384|6084->3430|6121->3440|6136->3446|6189->3478|6361->3619|6423->3653|6537->3736|6592->3760|6642->3782|6793->3905|6822->3906|6876->3932|6958->3986|6987->3987|7033->4005
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10|42->10|42->10|43->11|43->11|43->11|45->13|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|55->23|56->24|56->24|56->24|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|65->33|65->33|65->33|67->35|68->36|68->36|68->36|73->41|73->41|73->41|78->46|78->46|78->46|79->47|79->47|79->47|79->47|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|85->53|86->54|89->57|90->58|91->59|96->64|96->64|97->65|98->66|98->66|99->67
                  -- GENERATED --
              */
          