
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

object product extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.96*/("""
"""),_display_(/*2.2*/main("Product",user)/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<!-- //BEGIN CLEO AND GLEN -->
<main>
                """),_display_(/*5.18*/for(p <- products) yield /*5.36*/ {_display_(Seq[Any](format.raw/*5.38*/("""
                    """),_display_(/*6.22*/if(p.getId() == id)/*6.41*/{_display_(Seq[Any](format.raw/*6.42*/("""
    """),format.raw/*7.5*/("""<div class="row">

            <div class="col-sm-6">
                    """),_display_(/*10.22*/if(env.resource("public/images/" + p.getId + ".jpg").isDefined)/*10.85*/{_display_(Seq[Any](format.raw/*10.86*/("""
                        """),format.raw/*11.25*/("""<img src="/assets/images/"""),_display_(/*11.51*/(p.getId)),format.raw/*11.60*/(""".jpg" class="img-fluid" style="width:75%">
                      """)))}/*12.25*/else/*12.30*/{_display_(Seq[Any](format.raw/*12.31*/("""
                        """),format.raw/*13.25*/("""<img src="/assets/images/placeholder.jpg" class="img-fluid" style="width:75%">
                      """)))}),format.raw/*14.24*/("""
            """),format.raw/*15.13*/("""</div>

            <div class="col-sm-6">
                <div id="productJumbotron" class="jumbotron">
                <h2>"""),_display_(/*19.22*/p/*19.23*/.getName),format.raw/*19.31*/("""</h2>
                <ul>
                    """),_display_(/*21.22*/if(p.getOnSale == 0)/*21.42*/ {_display_(Seq[Any](format.raw/*21.44*/("""
                        """),format.raw/*22.25*/("""<h5>Price: &euro; """),_display_(/*22.44*/("%.2f".format(p.getPrice))),format.raw/*22.71*/("""</h5>
                    """)))}/*23.23*/else/*23.28*/{_display_(Seq[Any](format.raw/*23.29*/("""
                    """),format.raw/*24.21*/("""<h5>Price:
                        <span class="salePrice">&euro; """),_display_(/*25.57*/("%.2f".format(p.getPrice))),format.raw/*25.84*/("""</span> &euro; """),_display_(/*25.100*/("%.2f".format(p.getSalePrice))),format.raw/*25.131*/("""
                    """),format.raw/*26.21*/("""</h5>
                """)))}),format.raw/*27.18*/("""

                    """),format.raw/*29.21*/("""<div class="form-group">
                            <label for="sel1">Quantity:</label>
                            <input type="number" value="1" min="1" max=""""),_display_(/*31.74*/p/*31.75*/.getStock),format.raw/*31.84*/("""">
                          </div>
                          """),_display_(/*33.28*/if(user != null)/*33.44*/{_display_(Seq[Any](format.raw/*33.45*/("""
                              """),_display_(/*34.32*/if("admin".equals(user.getRole()))/*34.66*/{_display_(Seq[Any](format.raw/*34.67*/("""
                                """),format.raw/*35.33*/("""<a href=""""),_display_(/*35.43*/routes/*35.49*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*35.89*/("""" class="btn btn-success">
                                        Update
                                    </a>
            
            
                                    <a href=""""),_display_(/*40.47*/routes/*40.53*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*40.93*/("""" class="btn btn-danger" onclick="return confirmDel();">
                                        Delete
                                    </a>
                              """)))}),format.raw/*43.32*/(""" 
                              """),_display_(/*44.32*/if("customer".equals(user.getRole()))/*44.69*/{_display_(Seq[Any](format.raw/*44.70*/("""
                         """),format.raw/*45.26*/("""<a id="addToCartBtn" href=""""),_display_(/*45.54*/controllers/*45.65*/.routes.ShoppingCtrl.addToCart(p.getId)),format.raw/*45.104*/("""" class="btn btn-default">Add To Cart</a> 
                              """)))}),format.raw/*46.32*/("""
                          """)))}/*47.29*/else/*47.34*/{_display_(Seq[Any](format.raw/*47.35*/("""
                            """),format.raw/*48.29*/("""<a id="addToCartBtn" href=""""),_display_(/*48.57*/routes/*48.63*/.HomeController.cart()),format.raw/*48.85*/("""" class="btn btn-default">Add To Cart</a>
                          """)))}),format.raw/*49.28*/("""
                    """),format.raw/*50.21*/("""</ul>
                        </div>
            </div>

    </div>

    <div class="row">
        <div class="col-sm-12">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="tab" href="#description">Description</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#specifications">Specifications</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#deliveryAndReturns">Delivery & Returns</a>
                </li>
            </ul>

            <div class="tab-content">
                <div class="tab-pane active container" id="description">"""),_display_(/*71.74*/p/*71.75*/.getDescriptionL),format.raw/*71.91*/("""</div>
                <div class="tab-pane container" id="specifications">
                    <li>"""),_display_(/*73.26*/p/*73.27*/.getSpec1),format.raw/*73.36*/("""</li>
                    <li>"""),_display_(/*74.26*/p/*74.27*/.getSpec2),format.raw/*74.36*/("""</li>
                    <li>"""),_display_(/*75.26*/p/*75.27*/.getSpec3),format.raw/*75.36*/("""</li>
                </div>
                <div class="tab-pane container" id="deliveryAndReturns">
                    <div class="wysiwyg-content"><h6> Delivery</h6>
<div>
<span style="line-height: 1.5;">We offer a comprehensive nationwide delivery service; we aim to deliver all orders as quickly as possible.</span>
</div>
<ul>
<li> 1 to 3 days on stocked items, non stock product up to 10 days.</li>
</ul>
<p>
Note:
</p>
<ul>
<li> If delivery is urgent check with the local store, we are here to assist.</li>
<li> Locations within 30 km of a store are covered daily.</li>
<li> Delivery times for rural areas may vary depending on routes and availability.</li>
</ul>
<h6> Free Pick Up In Store</h6>
<p>
Can’t wait for delivery or don’t want to pay additional charges? It’s incredibly simple to pick up your online order in store and get your hands on your product quickly and easily. Simply select the free pick up in store option and head to your nearest store to pick up your order.
</p>
<ol>
<li> After your order is placed, you will receive an “order confirmation email” with your “order confirmation number” (this is usually sent out within 2 hours).</li>
<li> Once the store has confirmed your order and reserved the stock, you will receive an email “Ready for collection”.</li>
<li> Bring your "order confirmation number" to the store you selected for pick up, along with photo ID and the credit card you used to make the order.</li>
<li> Speak to one of our staff and your order should be processed in minutes.</li>
</ol>
<h6> Easy returns</h6>
<p>
If you feel your product has failed a Consumer Guarantee (as defined by Irish Consumer Law) then don't worry you can easily return it to your local store. We'll even pay for the postage if you live in an area where there is no store. Our returns policy covers any purchased item (<a href="/customer-services/returns-policy.html">conditions apply</a>).
</p></div>

</div></div>
            </div>

        </div>
    </div>
""")))}),format.raw/*113.2*/("""
            """)))}),format.raw/*114.14*/("""

"""),format.raw/*116.1*/("""</main>

<script>
        function confirmDel() """),format.raw/*119.31*/("""{"""),format.raw/*119.32*/("""
            """),format.raw/*120.13*/("""return confirm('Are you sure?');
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/("""
    """),format.raw/*122.5*/("""</script>
    
<!-- //END CLEO AND GLEN -->
""")))}))
      }
    }
  }

  def render(id:Long,products:List[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(id,products,user,env)

  def f:((Long,List[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (id,products,user,env) => apply(id,products,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:18:08 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/product.scala.html
                  HASH: c75e5837abed2f4886679c53317500da5f47aa7f
                  MATRIX: 1008->1|1197->95|1225->98|1253->118|1292->120|1320->122|1403->179|1436->197|1475->199|1524->222|1551->241|1589->242|1621->248|1726->326|1798->389|1837->390|1891->416|1944->442|1974->451|2060->519|2073->524|2112->525|2166->551|2300->654|2342->668|2499->798|2509->799|2538->807|2615->857|2644->877|2684->879|2738->905|2784->924|2832->951|2879->980|2892->985|2931->986|2981->1008|3076->1076|3124->1103|3168->1119|3221->1150|3271->1172|3326->1196|3378->1220|3569->1384|3579->1385|3609->1394|3701->1459|3726->1475|3765->1476|3825->1509|3868->1543|3907->1544|3969->1578|4006->1588|4021->1594|4082->1634|4301->1826|4316->1832|4377->1872|4587->2051|4648->2085|4694->2122|4733->2123|4788->2150|4843->2178|4863->2189|4924->2228|5030->2303|5078->2333|5091->2338|5130->2339|5188->2369|5243->2397|5258->2403|5301->2425|5402->2495|5452->2517|6280->3318|6290->3319|6327->3335|6457->3438|6467->3439|6497->3448|6556->3480|6566->3481|6596->3490|6655->3522|6665->3523|6695->3532|8751->5557|8798->5572|8830->5576|8910->5627|8940->5628|8983->5642|9053->5684|9083->5685|9117->5691
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|38->6|38->6|38->6|39->7|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|46->14|47->15|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|57->25|57->25|57->25|57->25|58->26|59->27|61->29|63->31|63->31|63->31|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|67->35|72->40|72->40|72->40|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|80->48|80->48|81->49|82->50|103->71|103->71|103->71|105->73|105->73|105->73|106->74|106->74|106->74|107->75|107->75|107->75|145->113|146->114|148->116|151->119|151->119|152->120|153->121|153->121|154->122
                  -- GENERATED --
              */
          