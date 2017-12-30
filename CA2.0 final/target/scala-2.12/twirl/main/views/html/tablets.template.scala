
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

object tablets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),_display_(/*2.2*/main("Tablets", user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<!-- //BEGIN GLEN -->
    <main>
            <div class="jumbotron">    
                    <h1 id="productGroupLabel">Tablets</h1>
                    </div>
                    <div class="container">
                        <div class="row">
                            """),_display_(/*10.30*/for(p<- products) yield /*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/(""" 
                                """),_display_(/*11.34*/if(p.getCategory=="Tablets")/*11.62*/{_display_(Seq[Any](format.raw/*11.63*/(""" 
                                
                                """),format.raw/*13.33*/("""<div class="col-sm-4">
                
                                <div class="card" id="productCard">
                
                                    """),_display_(/*17.38*/if(env.resource("public/images/" + p.getId + ".jpg").isDefined)/*17.101*/{_display_(Seq[Any](format.raw/*17.102*/("""
                                        """),format.raw/*18.41*/("""<a href=""""),_display_(/*18.51*/routes/*18.57*/.HomeController.product(p.getId)),format.raw/*18.89*/("""">    
                                        <img class="card-img-top" id="cardProductImages" src="/assets/images/"""),_display_(/*19.111*/(p.getId)),format.raw/*19.120*/(""".jpg"></a> """)))}/*19.133*/else/*19.138*/{_display_(Seq[Any](format.raw/*19.139*/("""
                                        """),format.raw/*20.41*/("""<a href=""""),_display_(/*20.51*/routes/*20.57*/.HomeController.product(p.getId)),format.raw/*20.89*/(""""> 
                                        <img class="card-img-top" id="cardProductImages" src="/assets/images/placeholder.jpg"></a>""")))}),format.raw/*21.132*/("""
                
                                    """),format.raw/*23.37*/("""<div class="card-block" id="productCardText">
                                        <h4 class="card-title">"""),_display_(/*24.65*/p/*24.66*/.getName),format.raw/*24.74*/("""</h4>
                                        <h5 class="card-text">&euro; """),_display_(/*25.71*/("%.2f".format(p.getPrice))),format.raw/*25.98*/("""</h5>
                                        <p class="card-text">"""),_display_(/*26.63*/p/*26.64*/.getDescriptionS),format.raw/*26.80*/("""</p>
                                        <ul class="list-group list-group-flush">
                                            <li class="list-group-item">"""),_display_(/*28.74*/p/*28.75*/.getSpec1),format.raw/*28.84*/("""</li>
                                            <li class="list-group-item">"""),_display_(/*29.74*/p/*29.75*/.getSpec2),format.raw/*29.84*/("""</li>
                                            <li class="list-group-item">"""),_display_(/*30.74*/p/*30.75*/.getSpec3),format.raw/*30.84*/("""</li>
                                        </ul>
                                    </div>
                                    """),_display_(/*33.38*/if(user != null)/*33.54*/{_display_(Seq[Any](format.raw/*33.55*/("""
                                        """),_display_(/*34.42*/if("admin".equals(user.getRole()))/*34.76*/ {_display_(Seq[Any](format.raw/*34.78*/("""
                                            
                                                """),format.raw/*36.49*/("""<div class="btn-group" style='width:100%;'>
                                                    <a href=""""),_display_(/*37.63*/routes/*37.69*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*37.109*/("""" style='width:50.5%;float:left;' class="btn btn-success btn-block mt-auto">
                                                      Update
                                                    </a>
                                                  
                                                  
                                                    <a href=""""),_display_(/*42.63*/routes/*42.69*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*42.109*/("""" style='width:50.5%;float:right;' class="btn btn-danger btn-block mt-auto" onclick="return confirmDel();">
                                                      Delete
                                                    </a>
                                            </div>   
                                    
                                            """)))}/*47.46*/else/*47.50*/{_display_(Seq[Any](format.raw/*47.51*/("""
                                                """),format.raw/*48.49*/("""<a href=""""),_display_(/*48.59*/routes/*48.65*/.HomeController.product(p.getId)),format.raw/*48.97*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>
            
                                            """)))}),format.raw/*50.46*/("""
                                        """)))}/*51.42*/else/*51.46*/{_display_(Seq[Any](format.raw/*51.47*/("""
                                            """),format.raw/*52.45*/("""<a href=""""),_display_(/*52.55*/routes/*52.61*/.HomeController.product(p.getId)),format.raw/*52.93*/("""" class="btn btn-info btn-block mt-auto">Buy Now</a>
                                            
                                        """)))}),format.raw/*54.42*/("""
                                """),format.raw/*55.33*/("""</div>
                
                        </div>
                        """)))}),format.raw/*58.26*/(""" 
                    """)))}),format.raw/*59.22*/("""
                    """),format.raw/*60.21*/("""</div>
                    </div> 
            </main>   

            <script>
                    function confirmDel() """),format.raw/*65.43*/("""{"""),format.raw/*65.44*/("""
                        """),format.raw/*66.25*/("""return confirm('Are you sure?');
                    """),format.raw/*67.21*/("""}"""),format.raw/*67.22*/("""
                """),format.raw/*68.17*/("""</script>
                
    <!-- //END GLEN  -->
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
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/tablets.scala.html
                  HASH: 0a193e9acf8e928cafc58020c398fdf5e8813928
                  MATRIX: 1003->1|1182->85|1210->88|1239->109|1278->111|1310->117|1619->399|1652->416|1692->418|1755->454|1792->482|1831->483|1928->552|2121->718|2194->781|2234->782|2304->824|2341->834|2356->840|2409->872|2555->990|2586->999|2618->1012|2632->1017|2672->1018|2742->1060|2779->1070|2794->1076|2847->1108|3015->1244|3099->1300|3237->1411|3247->1412|3276->1420|3380->1497|3428->1524|3524->1593|3534->1594|3571->1610|3759->1771|3769->1772|3799->1781|3906->1861|3916->1862|3946->1871|4053->1951|4063->1952|4093->1961|4255->2096|4280->2112|4319->2113|4389->2156|4432->2190|4472->2192|4596->2288|4730->2395|4745->2401|4807->2441|5198->2805|5213->2811|5275->2851|5661->3218|5674->3222|5713->3223|5791->3273|5828->3283|5843->3289|5896->3321|6040->3434|6102->3477|6115->3481|6154->3482|6228->3528|6265->3538|6280->3544|6333->3576|6505->3717|6567->3751|6681->3834|6736->3858|6786->3880|6941->4007|6970->4008|7024->4034|7106->4088|7135->4089|7181->4107
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10|42->10|42->10|43->11|43->11|43->11|45->13|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|55->23|56->24|56->24|56->24|57->25|57->25|58->26|58->26|58->26|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|65->33|65->33|65->33|66->34|66->34|66->34|68->36|69->37|69->37|69->37|74->42|74->42|74->42|79->47|79->47|79->47|80->48|80->48|80->48|80->48|82->50|83->51|83->51|83->51|84->52|84->52|84->52|84->52|86->54|87->55|90->58|91->59|92->60|97->65|97->65|98->66|99->67|99->67|100->68
                  -- GENERATED --
              */
          