
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(pageID: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<!-- //BEGIN CLEO AND GLEN -->
<!DOCTYPE html>
<html lang="en" id="pageID">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <title>Cleo Byrne & Glen Byrne - """),_display_(/*11.37*/pageID),format.raw/*11.43*/("""</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

  <script src="https://use.fontawesome.com/d1e651d256.js"></script> """),format.raw/*21.122*/("""

  """),format.raw/*23.3*/("""<title>"""),_display_(/*23.11*/pageID),format.raw/*23.17*/("""</title>
  <link rel="stylesheet" media="screen" href=""""),_display_(/*24.48*/routes/*24.54*/.Assets.versioned("stylesheets/main.css")),format.raw/*24.95*/("""">
  <link rel="shortcut icon" type="image/png" href=""""),_display_(/*25.53*/routes/*25.59*/.Assets.versioned("images/favicon.png")),format.raw/*25.98*/("""">


</head>

<body>
  """),format.raw/*31.84*/("""
  
  """),format.raw/*33.3*/("""<nav class="navbar navbar-expand-sm navbar-dark bg-dark sticky-top">

      <button class="navbar-toggler" type="button" data-toggle="collapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

      <ul class="navbar-nav mr-auto">

        <li """),_display_(/*41.14*/if(pageID == "Home")/*41.34*/{_display_(Seq[Any](format.raw/*41.35*/("""class="active"""")))}),format.raw/*41.50*/("""class="nav-item" >
          <a class="nav-link" href=""""),_display_(/*42.38*/routes/*42.44*/.HomeController.index()),format.raw/*42.67*/("""">
            <span class="fa fa-home" aria-hidden="true"></span>
          </a>
        </li>

        <li """),_display_(/*47.14*/if(pageID=="TV")/*47.30*/{_display_(Seq[Any](format.raw/*47.31*/("""class="active"""")))}),format.raw/*47.46*/(""" """),format.raw/*47.47*/("""class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-toggle="dropdown"><span class="fa fa-television" aria-hidden="true"></span>TV
          </a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href=""""),_display_(/*51.45*/routes/*51.51*/.HomeController.allTvs()),format.raw/*51.75*/("""">All TVs</a>
            <a class="dropdown-item" href=""""),_display_(/*52.45*/routes/*52.51*/.HomeController.tvAcc()),format.raw/*52.74*/("""">TV Accessories</a>
          </div>
        </li>

        <li """),_display_(/*56.14*/if(pageID=="Computing")/*56.37*/{_display_(Seq[Any](format.raw/*56.38*/("""class="active"""")))}),format.raw/*56.53*/(""" """),format.raw/*56.54*/("""class="nav-item">
          <a class="nav-link" href=""""),_display_(/*57.38*/routes/*57.44*/.HomeController.computing()),format.raw/*57.71*/(""""><span class="fa fa-desktop" aria-hidden="true"></span>Computing 
          </a>
        </li>

        <li """),_display_(/*61.14*/if(pageID=="Phones")/*61.34*/{_display_(Seq[Any](format.raw/*61.35*/("""class="active"""")))}),format.raw/*61.50*/(""" """),format.raw/*61.51*/("""class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-toggle="dropdown"><span class="fa fa-mobile" aria-hidden="true"></span>Phones

          </a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href=""""),_display_(/*66.45*/routes/*66.51*/.HomeController.allPhones()),format.raw/*66.78*/("""">All Phones</a>
            <a class="dropdown-item" href=""""),_display_(/*67.45*/routes/*67.51*/.HomeController.phoneAcc()),format.raw/*67.77*/("""">Phone Accessories</a>
          </div>
        </li>

        <li """),_display_(/*71.14*/if(pageID=="Tablets")/*71.35*/{_display_(Seq[Any](format.raw/*71.36*/("""class="active"""")))}),format.raw/*71.51*/(""" """),format.raw/*71.52*/("""class="nav-item">
          <a class="nav-link" href=""""),_display_(/*72.38*/routes/*72.44*/.HomeController.tablets()),format.raw/*72.69*/(""""><span class="fa fa-tablet" aria-hidden="true"></span>Tablets
            
          </a>
        </li>


      </ul>

      <ul class="nav navbar-nav navbar-right">

        <li """),_display_(/*82.14*/if(pageID=="ContactUs")/*82.37*/{_display_(Seq[Any](format.raw/*82.38*/("""class="active"""")))}),format.raw/*82.53*/(""" """),format.raw/*82.54*/("""class="nav-item">
          <a class="nav-link" href=""""),_display_(/*83.38*/routes/*83.44*/.HomeController.contactUs()),format.raw/*83.71*/("""">
            <span class="fa fa-envelope" aria-hidden="true"></span>
            Contact
          </a>
        </li>
        <li """),_display_(/*88.14*/if(pageID=="LogIn")/*88.33*/{_display_(Seq[Any](format.raw/*88.34*/("""class="active"""")))}),format.raw/*88.49*/(""" """),format.raw/*88.50*/("""class="nav-item dropdown"> 
          
          """),_display_(/*90.12*/if(user != null)/*90.28*/ {_display_(Seq[Any](format.raw/*90.30*/("""
            """),format.raw/*91.13*/("""<a class="nav-link dropdown-toggle" data-toggle="dropdown"><span class="fa fa-user" aria-hidden="true"></span> """),_display_(/*91.125*/user/*91.129*/.getFirstName()),format.raw/*91.144*/(""" """),_display_(/*91.146*/user/*91.150*/.getLastName()),format.raw/*91.164*/("""
          """),format.raw/*92.11*/("""</a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href=""""),_display_(/*94.45*/controllers/*94.56*/.security.routes.LoginCtrl.updateUser(user.getEmail())),format.raw/*94.110*/(""""><span class="fa fa-pencil-square-o" aria-hidden="true"></span>Edit Details</a>
            <a class="dropdown-item" href=""""),_display_(/*95.45*/controllers/*95.56*/.security.routes.LoginCtrl.logout()),format.raw/*95.91*/(""""><span class="fa fa-sign-out" aria-hidden="true"></span>Logout """),_display_(/*95.156*/user/*95.160*/.getFirstName()),format.raw/*95.175*/("""</a>
          </div>

        """)))}/*98.11*/else/*98.16*/{_display_(Seq[Any](format.raw/*98.17*/("""
          """),format.raw/*99.11*/("""<a class="nav-link" href=""""),_display_(/*99.38*/controllers/*99.49*/.security.routes.LoginCtrl.login()),format.raw/*99.83*/("""">Login
              <span class="fa fa-sign-in" aria-hidden="true"></span>
            </a>
        """)))}),format.raw/*102.10*/("""
        """),format.raw/*103.9*/("""</li>

        """),_display_(/*105.10*/if(user != null)/*105.26*/{_display_(Seq[Any](format.raw/*105.27*/("""
          """),_display_(/*106.12*/if("admin".equals(user.getRole()))/*106.46*/{_display_(Seq[Any](format.raw/*106.47*/("""
            """),format.raw/*107.13*/("""<li """),format.raw/*107.17*/("""{"""),format.raw/*107.18*/("""class="active""""),format.raw/*107.32*/("""}"""),format.raw/*107.33*/(""" """),format.raw/*107.34*/("""class="nav-item">
                <a class="nav-link" href=""""),_display_(/*108.44*/controllers/*108.55*/.routes.AdminProductCtrl.addProduct()),format.raw/*108.92*/("""">
                  <span class="fa fa-pencil">Add Product</span>
                </a>
              </li>
          """)))}/*112.12*/else/*112.16*/{_display_(Seq[Any](format.raw/*112.17*/("""
            """),format.raw/*113.13*/("""<li """),_display_(/*113.18*/if(pageID=="ShoppingCart")/*113.44*/{_display_(Seq[Any](format.raw/*113.45*/("""class="active"""")))}),format.raw/*113.60*/(""" """),format.raw/*113.61*/("""class="nav-item">
                <a class="nav-link" href=""""),_display_(/*114.44*/controllers/*114.55*/.routes.ShoppingCtrl.showCart()),format.raw/*114.86*/("""">
                  <span class="fa fa-shopping-cart" aria-hidden="true"></span>
                </a>
              </li>
          """)))}),format.raw/*118.12*/("""
        """)))}/*119.10*/else/*119.14*/{_display_(Seq[Any](format.raw/*119.15*/("""
          """),format.raw/*120.11*/("""<li """),_display_(/*120.16*/if(pageID=="Cart")/*120.34*/{_display_(Seq[Any](format.raw/*120.35*/("""class="active"""")))}),format.raw/*120.50*/(""" """),format.raw/*120.51*/("""class="nav-item">
              <a class="nav-link" href=""""),_display_(/*121.42*/routes/*121.48*/.HomeController.cart()),format.raw/*121.70*/("""">
                <span class="fa fa-shopping-cart" aria-hidden="true"></span>
              </a>
            </li>
        """)))}),format.raw/*125.10*/("""
            
      """),format.raw/*127.7*/("""</ul>
      <form class="form-inline">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
        </form>
  </nav>

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <div class="carousel-inner" role="listbox">
      <div class="carousel-item active">
        <img class="d-block img-fluid" src=""""),_display_(/*143.46*/routes/*143.52*/.Assets.versioned("images/christmasDeals.jpg")),format.raw/*143.98*/("""" alt="Christmas Deals">
        <div class="carousel-caption">
          <h3>Great Deals For The Holiday</h3>
          <p>Up To 50% Off</p>
        </div>
      </div>

      <div class="carousel-item">
        <a href=""""),_display_(/*151.19*/routes/*151.25*/.HomeController.product(1)),format.raw/*151.51*/(""""><img class="d-block img-fluid" src=""""),_display_(/*151.90*/routes/*151.96*/.Assets.versioned("images/LG.jpg")),format.raw/*151.130*/("""" alt="LG TV"></a> 
        <div class="carousel-caption">
          <h3>NEW LG W7 OLED</h3>
          <p>Simplicity.Perfection</p>
        </div>
      </div>

      <div class="carousel-item">
          <a href=""""),_display_(/*159.21*/routes/*159.27*/.HomeController.product(21)),format.raw/*159.54*/(""""><img class="d-block img-fluid" src=""""),_display_(/*159.93*/routes/*159.99*/.Assets.versioned("images/iPhoneX.png")),format.raw/*159.138*/("""" alt="iPhone X"></a>
        <div class="carousel-caption">
          <h3>iPhone X</h3>
          <p>Available Now</p>
        </div>
      </div>
    </div>

    <a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    </a>

    <a class="carousel-control-next" href="#myCarousel" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
    </a>
  </div>
  """),_display_(/*175.4*/content),format.raw/*175.11*/("""
  """),format.raw/*176.3*/("""<footer>
    <div id=footerContent>
    
    <a class="fa fa-facebook-official" id="socialImages" aria-hidden="true" href="https://www.facebook.com/"></a>
    <a class="fa fa-twitter-square" id="socialImages" aria-hidden="true" href="https://twitter.com/"></a>
    <a class="fa fa-instagram" id="socialImages" aria-hidden="true" href="https://www.instagram.com/"></a>
    <a class="fa fa-google-plus-square" id="socialImages" aria-hidden="true" href="https://plus.google.com/discover"></a>
    <a class="fa fa-youtube-square" id="socialImages" aria-hidden="true" href="https://www.youtube.com/"></a>
    <a class="fa fa-linkedin-square" id="socialImages" aria-hidden="true" href="https://www.linkedin.com/"></a>
    </div>
    <p>
      <em>Copyright &copy; Cleo Byrne and Glen Byrne 2017</em>
    </p>
    
  </footer>

  <script src=""""),_display_(/*192.17*/routes/*192.23*/.Assets.versioned("javascripts/main.js")),format.raw/*192.63*/("""" type="text/javascript"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCafE-PLYsuJXV3PIO8l-meN5WqnmSMMTA&callback=myMap"></script>
  
</body>

</html>
<!-- //END CLEO AND GLEN -->"""))
      }
    }
  }

  def render(pageID:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID,user) => (content) => apply(pageID,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:24 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/main.scala.html
                  HASH: 0a474dfb251581b3a613c070cc4cd7544c08edef
                  MATRIX: 970->2|1121->58|1149->60|1411->295|1438->301|1951->838|1982->842|2017->850|2044->856|2127->912|2142->918|2204->959|2286->1014|2301->1020|2361->1059|2412->1163|2445->1169|2793->1490|2822->1510|2861->1511|2907->1526|2990->1582|3005->1588|3049->1611|3186->1721|3211->1737|3250->1738|3296->1753|3325->1754|3605->2007|3620->2013|3665->2037|3750->2095|3765->2101|3809->2124|3902->2190|3934->2213|3973->2214|4019->2229|4048->2230|4130->2285|4145->2291|4193->2318|4330->2428|4359->2448|4398->2449|4444->2464|4473->2465|4754->2719|4769->2725|4817->2752|4905->2813|4920->2819|4967->2845|5063->2914|5093->2935|5132->2936|5178->2951|5207->2952|5289->3007|5304->3013|5350->3038|5558->3219|5590->3242|5629->3243|5675->3258|5704->3259|5786->3314|5801->3320|5849->3347|6009->3480|6037->3499|6076->3500|6122->3515|6151->3516|6228->3566|6253->3582|6293->3584|6334->3597|6474->3709|6488->3713|6525->3728|6555->3730|6569->3734|6605->3748|6644->3759|6758->3846|6778->3857|6854->3911|7006->4036|7026->4047|7082->4082|7175->4147|7189->4151|7226->4166|7277->4199|7290->4204|7329->4205|7368->4216|7422->4243|7442->4254|7497->4288|7632->4391|7669->4400|7713->4416|7739->4432|7779->4433|7819->4445|7863->4479|7903->4480|7945->4493|7978->4497|8008->4498|8051->4512|8081->4513|8111->4514|8200->4575|8221->4586|8280->4623|8419->4742|8433->4746|8473->4747|8515->4760|8548->4765|8584->4791|8624->4792|8671->4807|8701->4808|8790->4869|8811->4880|8864->4911|9030->5045|9060->5055|9074->5059|9114->5060|9154->5071|9187->5076|9215->5094|9255->5095|9302->5110|9332->5111|9419->5170|9435->5176|9479->5198|9637->5324|9685->5344|10416->6047|10432->6053|10500->6099|10751->6322|10767->6328|10815->6354|10882->6393|10898->6399|10955->6433|11198->6648|11214->6654|11263->6681|11330->6720|11346->6726|11408->6765|11924->7254|11953->7261|11984->7264|12849->8101|12865->8107|12927->8147
                  LINES: 28->1|33->1|35->3|43->11|43->11|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|63->31|65->33|73->41|73->41|73->41|73->41|74->42|74->42|74->42|79->47|79->47|79->47|79->47|79->47|83->51|83->51|83->51|84->52|84->52|84->52|88->56|88->56|88->56|88->56|88->56|89->57|89->57|89->57|93->61|93->61|93->61|93->61|93->61|98->66|98->66|98->66|99->67|99->67|99->67|103->71|103->71|103->71|103->71|103->71|104->72|104->72|104->72|114->82|114->82|114->82|114->82|114->82|115->83|115->83|115->83|120->88|120->88|120->88|120->88|120->88|122->90|122->90|122->90|123->91|123->91|123->91|123->91|123->91|123->91|123->91|124->92|126->94|126->94|126->94|127->95|127->95|127->95|127->95|127->95|127->95|130->98|130->98|130->98|131->99|131->99|131->99|131->99|134->102|135->103|137->105|137->105|137->105|138->106|138->106|138->106|139->107|139->107|139->107|139->107|139->107|139->107|140->108|140->108|140->108|144->112|144->112|144->112|145->113|145->113|145->113|145->113|145->113|145->113|146->114|146->114|146->114|150->118|151->119|151->119|151->119|152->120|152->120|152->120|152->120|152->120|152->120|153->121|153->121|153->121|157->125|159->127|175->143|175->143|175->143|183->151|183->151|183->151|183->151|183->151|183->151|191->159|191->159|191->159|191->159|191->159|191->159|207->175|207->175|208->176|224->192|224->192|224->192
                  -- GENERATED --
              */
          