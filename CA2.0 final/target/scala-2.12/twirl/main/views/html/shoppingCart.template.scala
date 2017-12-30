
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

object shoppingCart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.Product


Seq[Any](format.raw/*1.62*/("""


"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("ShoppingCart", customer)/*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""
  """),format.raw/*9.3*/("""<!-- //BEGIN CLEO AND GLEN -->
    <main>
        <div class="container">
          <h1>My Cart</h1>
          <div class="row">

          <div class="col-md-12">
            """),_display_(/*16.14*/if(flash.containsKey("success"))/*16.46*/ {_display_(Seq[Any](format.raw/*16.48*/("""
                """),format.raw/*17.17*/("""<div class="alert alert-success">
                    """),_display_(/*18.22*/flash/*18.27*/.get("success")),format.raw/*18.42*/("""
                """),format.raw/*19.17*/("""</div>
            """)))}),format.raw/*20.14*/(""" 
            """),format.raw/*21.13*/("""<table id="cart" class="table table-hover table-condensed">
                      <thead>
                      <tr>
                        <th style="width:50%">Product</th>
                        <th style="width:10%">Price</th>
                        <th style="width:8%">Quantity</th>
                        <th style ="width:20%"></th>
                        <th style="width:12%" class="text-center">Subtotal</th>
                        <th style="width:10%"></th>
                      </tr>
                    </thead>

                    
                    <tbody>
                      """),_display_(/*35.24*/if(customer.getCart() != null)/*35.54*/ {_display_(Seq[Any](format.raw/*35.56*/(""" 
                        """),_display_(/*36.26*/if(customer.getCart().getCartItems().isEmpty())/*36.73*/{_display_(Seq[Any](format.raw/*36.74*/("""
                          """),format.raw/*37.27*/("""<td data-th="Price">
                            <h2>Your Shopping Cart Is Empty</h2>
                          </td>
                          <tfoot>
                            <tr>
                              <td><a href=""""),_display_(/*42.45*/routes/*42.51*/.HomeController.index()),format.raw/*42.74*/("""" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
                              </tr>
                              </tfoot>
                        """)))}/*45.27*/else/*45.32*/{_display_(Seq[Any](format.raw/*45.33*/("""
                          """),_display_(/*46.28*/for(i <- customer.getCart().getCartItems()) yield /*46.71*/ {_display_(Seq[Any](format.raw/*46.73*/("""
                          """),format.raw/*47.27*/("""<tr>
                              <td data-th="Product">
                                <div class="row">
                                  <div class="col-sm-2 hidden-xs">
                                      """),_display_(/*51.40*/if(env.resource("public/images/" + i.getProduct.getId + ".jpg").isDefined)/*51.114*/{_display_(Seq[Any](format.raw/*51.115*/("""
                                        """),format.raw/*52.41*/("""<img src="/assets/images/"""),_display_(/*52.67*/(i.getProduct.getId)),format.raw/*52.87*/(""".jpg" class="img-fluid" style="width:100%" alt="Image">
                                      """)))}/*53.41*/else/*53.46*/{_display_(Seq[Any](format.raw/*53.47*/("""
                                        """),format.raw/*54.41*/("""<img src="/assets/images/placeholder.jpg" class="img-fluid" style="width:100%" alt="Image">
                                      """)))}),format.raw/*55.40*/("""
                                  """),format.raw/*56.35*/("""</div>
                                  <div class="col-sm-10">
                                    <h4 class="nomargin">"""),_display_(/*58.59*/i/*58.60*/.getProduct.getName),format.raw/*58.79*/("""</h4>
                                    <p>"""),_display_(/*59.41*/i/*59.42*/.getProduct.getDescriptionS()),format.raw/*59.71*/("""</p>
                                  </div>
                                </div>
                              </td>
                                """),_display_(/*63.34*/if(i.getOnSale == 1)/*63.54*/{_display_(Seq[Any](format.raw/*63.55*/("""
                                  """),format.raw/*64.35*/("""<td data-th="Price" class="text-center">&euro; """),_display_(/*64.83*/("%.2f".format(i.getSalePrice))),format.raw/*64.114*/("""</td>
                                """)))}/*65.34*/else/*65.38*/{_display_(Seq[Any](format.raw/*65.39*/("""
                                """),format.raw/*66.33*/("""<td data-th="Price" class="text-center">&euro; """),_display_(/*66.81*/("%.2f".format(i.getPrice))),format.raw/*66.108*/("""</td>
                                """)))}),format.raw/*67.34*/("""

                                  """),format.raw/*69.35*/("""<td data-th="Quantity" class="text-center" style="text-align:centre;">
                                    """),_display_(/*70.38*/i/*70.39*/.getQuantity()),format.raw/*70.53*/("""
                                  """),format.raw/*71.35*/("""</td>
                                  

                                   <td><a href=""""),_display_(/*74.50*/routes/*74.56*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*74.88*/(""""><button class="btn btn-danger btn-sm"><span class="fa fa-minus"></span></button></a>
                                    <a href=""""),_display_(/*75.47*/routes/*75.53*/.ShoppingCtrl.addOne(i.getId)),format.raw/*75.82*/(""""><button class="btn btn-info btn-sm" ><span class="fa fa-plus"></span></button></a>
                                    </td> 
                                  
                                <td data-th="Subtotal" class="text-center">&euro; """),_display_(/*78.84*/("%.2f".format(i.getItemTotal))),format.raw/*78.115*/("""</td>
                                <td class="actions" data-th="">
                                    <a href=""""),_display_(/*80.47*/routes/*80.53*/.ShoppingCtrl.showCart()),format.raw/*80.77*/(""""><button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button></a>
                                    <a href=""""),_display_(/*81.47*/routes/*81.53*/.ShoppingCtrl.removeItem(i.getId)),format.raw/*81.86*/("""" onclick="return confirmDel();"><button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button></a>								
                                  </td>
                            </tr>
                     """)))}),format.raw/*84.23*/("""
                
           
              """),format.raw/*87.15*/("""</tbody>
            

              <tfoot>
                <tr>
                  <td><a href=""""),_display_(/*92.33*/routes/*92.39*/.HomeController.index()),format.raw/*92.62*/("""" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
                  <td colspan="2" class="hidden-xs"></td>
                  <td><a href=""""),_display_(/*94.33*/routes/*94.39*/.ShoppingCtrl.emptyCart()),format.raw/*94.64*/("""" class="btn btn-danger" onclick="return confirmDel();">Empty Cart</a></td>
                  
                  <td class="hidden-xs text-center"><strong>Total: &euro; """),_display_(/*96.76*/("%.2f".format(customer.getCart.getCartTotal))),format.raw/*96.122*/("""</strong></td>
                  <td><a href=""""),_display_(/*97.33*/routes/*97.39*/.ShoppingCtrl.placeOrder()),format.raw/*97.65*/("""" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
                </tr>
              </tfoot>
            """)))}),format.raw/*100.14*/("""
            """)))}/*101.14*/else/*101.19*/{_display_(Seq[Any](format.raw/*101.20*/("""
              """),format.raw/*102.15*/("""<td data-th="Price">
                <h2>Your Shopping Cart Is Empty</h2>
              </td>
              <tfoot>
                <tr>
                  <td><a href=""""),_display_(/*107.33*/routes/*107.39*/.HomeController.index()),format.raw/*107.62*/("""" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
                  </tr>
                  </tfoot>""")))}),format.raw/*109.28*/("""

                    
                  """),format.raw/*112.19*/("""</table>
          </div>
        </div>
          
          </main>
          
          <script>
            function confirmDel() """),format.raw/*119.35*/("""{"""),format.raw/*119.36*/("""
              """),format.raw/*120.15*/("""return confirm('Are you sure?');
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/("""
          """),format.raw/*122.11*/("""</script>
          <!-- //END CLEO AND GLEN -->
    """)))}))
      }
    }
  }

  def render(customer:models.users.Customer,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(customer,env)

  def f:((models.users.Customer,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (customer,env) => apply(customer,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 30 22:19:28 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/shoppingCart.scala.html
                  HASH: 450870b3a1b21e7e454d51574661e444e1540274
                  MATRIX: 991->1|1124->68|1160->99|1192->126|1243->61|1275->149|1303->152|1341->182|1380->184|1410->188|1621->372|1662->404|1702->406|1748->424|1831->480|1845->485|1881->500|1927->518|1979->539|2022->554|2670->1175|2709->1205|2749->1207|2804->1235|2860->1282|2899->1283|2955->1311|3216->1545|3231->1551|3275->1574|3483->1764|3496->1769|3535->1770|3591->1799|3650->1842|3690->1844|3746->1872|3991->2090|4075->2164|4115->2165|4185->2207|4238->2233|4279->2253|4394->2350|4407->2355|4446->2356|4516->2398|4679->2530|4743->2566|4895->2691|4905->2692|4945->2711|5019->2758|5029->2759|5079->2788|5264->2946|5293->2966|5332->2967|5396->3003|5471->3051|5524->3082|5583->3122|5596->3126|5635->3127|5697->3161|5772->3209|5821->3236|5892->3276|5958->3314|6094->3423|6104->3424|6139->3438|6203->3474|6324->3568|6339->3574|6392->3606|6553->3740|6568->3746|6618->3775|6894->4024|6947->4055|7092->4173|7107->4179|7152->4203|7307->4331|7322->4337|7376->4370|7628->4591|7703->4638|7833->4741|7848->4747|7892->4770|8097->4948|8112->4954|8158->4979|8357->5151|8425->5197|8500->5245|8515->5251|8562->5277|8743->5426|8778->5441|8792->5446|8832->5447|8877->5463|9079->5637|9095->5643|9140->5666|9311->5805|9384->5849|9554->5990|9584->5991|9629->6007|9704->6053|9734->6054|9775->6066
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|40->8|40->8|41->9|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|67->35|67->35|67->35|68->36|68->36|68->36|69->37|74->42|74->42|74->42|77->45|77->45|77->45|78->46|78->46|78->46|79->47|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|87->55|88->56|90->58|90->58|90->58|91->59|91->59|91->59|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|101->69|102->70|102->70|102->70|103->71|106->74|106->74|106->74|107->75|107->75|107->75|110->78|110->78|112->80|112->80|112->80|113->81|113->81|113->81|116->84|119->87|124->92|124->92|124->92|126->94|126->94|126->94|128->96|128->96|129->97|129->97|129->97|132->100|133->101|133->101|133->101|134->102|139->107|139->107|139->107|141->109|144->112|151->119|151->119|152->120|153->121|153->121|154->122
                  -- GENERATED --
              */
          