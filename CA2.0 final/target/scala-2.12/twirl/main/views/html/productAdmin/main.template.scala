
package views.html.productAdmin

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
  
  <nav class="navbar navbar-expand-sm navbar-dark bg-dark sticky-top">

      <button class="navbar-toggler" type="button" data-toggle="collapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

      <ul class="navbar-nav mr-auto">

        <li """),_display_(/*40.14*/if(pageID == "Home")/*40.34*/{_display_(Seq[Any](format.raw/*40.35*/("""class="active"""")))}),format.raw/*40.50*/("""class="nav-item" >
          <a class="nav-link" href=""""),_display_(/*41.38*/routes/*41.44*/.HomeController.index()),format.raw/*41.67*/("""">
            <span class="fa fa-home" aria-hidden="true"></span>
          </a>
        </li>

        <li """),_display_(/*46.14*/if(pageID=="TV")/*46.30*/{_display_(Seq[Any](format.raw/*46.31*/("""class="active"""")))}),format.raw/*46.46*/(""" """),format.raw/*46.47*/("""class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-toggle="dropdown"><span class="fa fa-television" aria-hidden="true"></span>TV
          </a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href=""""),_display_(/*50.45*/routes/*50.51*/.HomeController.allTvs()),format.raw/*50.75*/("""">All TVs</a>
            <a class="dropdown-item" href=""""),_display_(/*51.45*/routes/*51.51*/.HomeController.tvAcc()),format.raw/*51.74*/("""">TV Accessories</a>
          </div>
        </li>

        <li """),_display_(/*55.14*/if(pageID=="Computing")/*55.37*/{_display_(Seq[Any](format.raw/*55.38*/("""class="active"""")))}),format.raw/*55.53*/(""" """),format.raw/*55.54*/("""class="nav-item">
          <a class="nav-link" href=""""),_display_(/*56.38*/routes/*56.44*/.HomeController.computing()),format.raw/*56.71*/(""""><span class="fa fa-desktop" aria-hidden="true"></span>Computing 
          </a>
        </li>

        <li """),_display_(/*60.14*/if(pageID=="Phones")/*60.34*/{_display_(Seq[Any](format.raw/*60.35*/("""class="active"""")))}),format.raw/*60.50*/(""" """),format.raw/*60.51*/("""class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-toggle="dropdown"><span class="fa fa-mobile" aria-hidden="true"></span>Phones

          </a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href=""""),_display_(/*65.45*/routes/*65.51*/.HomeController.allPhones()),format.raw/*65.78*/("""">All Phones</a>
            <a class="dropdown-item" href=""""),_display_(/*66.45*/routes/*66.51*/.HomeController.phoneAcc()),format.raw/*66.77*/("""">Phone Accessories</a>
          </div>
        </li>

        <li """),_display_(/*70.14*/if(pageID=="Tablets")/*70.35*/{_display_(Seq[Any](format.raw/*70.36*/("""class="active"""")))}),format.raw/*70.51*/(""" """),format.raw/*70.52*/("""class="nav-item">
          <a class="nav-link" href=""""),_display_(/*71.38*/routes/*71.44*/.HomeController.tablets()),format.raw/*71.69*/(""""><span class="fa fa-tablet" aria-hidden="true"></span>Tablets
            
          </a>
        </li>


      </ul>

      <ul class="nav navbar-nav navbar-right">

        <li """),_display_(/*81.14*/if(pageID=="ContactUs")/*81.37*/{_display_(Seq[Any](format.raw/*81.38*/("""class="active"""")))}),format.raw/*81.53*/(""" """),format.raw/*81.54*/("""class="nav-item">
          <a class="nav-link" href=""""),_display_(/*82.38*/routes/*82.44*/.HomeController.contactUs()),format.raw/*82.71*/("""">Contact
              <span class="fa fa-envelope" aria-hidden="true"></span>
          </a>
        </li>
        <li """),_display_(/*86.14*/if(pageID=="LogIn")/*86.33*/{_display_(Seq[Any](format.raw/*86.34*/("""class="active"""")))}),format.raw/*86.49*/(""" """),format.raw/*86.50*/("""class="nav-item">
          """),_display_(/*87.12*/if(user != null)/*87.28*/ {_display_(Seq[Any](format.raw/*87.30*/("""
          """),format.raw/*88.11*/("""<a class="nav-link" href=""""),_display_(/*88.38*/controllers/*88.49*/.security.routes.LoginCtrl.logout()),format.raw/*88.84*/("""">Log out """),_display_(/*88.95*/user/*88.99*/.getFirstName()),format.raw/*88.114*/("""
            """),format.raw/*89.13*/("""<span class="fa fa-sign-in" aria-hidden="true"></span>
          </a>
        """)))}/*91.11*/else/*91.16*/{_display_(Seq[Any](format.raw/*91.17*/("""
          """),format.raw/*92.11*/("""<a class="nav-link" href="@controllers.security.routes.LoginCtrl.login()">Log In
            <span class="fa fa-sign-out" aria-hidden="true"></span>
          </a>
        """)))}),format.raw/*95.10*/("""
        """),format.raw/*96.9*/("""</li>

        <li """),_display_(/*98.14*/if(pageID=="ShoppingCart")/*98.40*/{_display_(Seq[Any](format.raw/*98.41*/("""class="active"""")))}),format.raw/*98.56*/(""" """),format.raw/*98.57*/("""class="nav-item">
          <a class="nav-link" href=""""),_display_(/*99.38*/controllers/*99.49*/.routes.ShoppingCtrl.showCart()),format.raw/*99.80*/("""">
            <span class="fa fa-shopping-cart" aria-hidden="true"></span>
          </a>
        </li>       
      </ul>
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
        <img class="d-block img-fluid" src=""""),_display_(/*119.46*/routes/*119.52*/.Assets.versioned("images/christmasDeals.jpg")),format.raw/*119.98*/("""" alt="Christmas Deals">
        <div class="carousel-caption">
          <h3>Great Deals For The Holiday</h3>
          <p>Up To 50% Off</p>
        </div>
      </div>

      <div class="carousel-item">
        <img class="d-block img-fluid" src=""""),_display_(/*127.46*/routes/*127.52*/.Assets.versioned("images/LG.jpg")),format.raw/*127.86*/("""" alt="LG TV">
        <div class="carousel-caption">
          <h3>NEW LG W7 OLED</h3>
          <p>Simplicity.Perfection</p>
        </div>
      </div>

      <div class="carousel-item">
        <img class="d-block img-fluid" src=""""),_display_(/*135.46*/routes/*135.52*/.Assets.versioned("images/iPhoneX.png")),format.raw/*135.91*/("""" alt="iPhone X">
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
  """),_display_(/*151.4*/content),format.raw/*151.11*/("""
  """),format.raw/*152.3*/("""<footer>
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

  <script src=""""),_display_(/*168.17*/routes/*168.23*/.Assets.versioned("javascripts/main.js")),format.raw/*168.63*/("""" type="text/javascript"></script>
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
                  DATE: Wed Dec 20 22:08:26 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/productAdmin/main.scala.html
                  HASH: 03238f603cec7bdd9a5e6d45abb4b395778b629c
                  MATRIX: 983->2|1134->58|1162->60|1424->295|1451->301|1964->838|1995->842|2030->850|2057->856|2140->912|2155->918|2217->959|2299->1014|2314->1020|2374->1059|2748->1406|2777->1426|2816->1427|2862->1442|2945->1498|2960->1504|3004->1527|3141->1637|3166->1653|3205->1654|3251->1669|3280->1670|3560->1923|3575->1929|3620->1953|3705->2011|3720->2017|3764->2040|3857->2106|3889->2129|3928->2130|3974->2145|4003->2146|4085->2201|4100->2207|4148->2234|4285->2344|4314->2364|4353->2365|4399->2380|4428->2381|4709->2635|4724->2641|4772->2668|4860->2729|4875->2735|4922->2761|5018->2830|5048->2851|5087->2852|5133->2867|5162->2868|5244->2923|5259->2929|5305->2954|5513->3135|5545->3158|5584->3159|5630->3174|5659->3175|5741->3230|5756->3236|5804->3263|5953->3385|5981->3404|6020->3405|6066->3420|6095->3421|6151->3450|6176->3466|6216->3468|6255->3479|6309->3506|6329->3517|6385->3552|6423->3563|6436->3567|6473->3582|6514->3595|6612->3675|6625->3680|6664->3681|6703->3692|6907->3866|6943->3875|6990->3895|7025->3921|7064->3922|7110->3937|7139->3938|7221->3993|7241->4004|7293->4035|8142->4856|8158->4862|8226->4908|8504->5158|8520->5164|8576->5198|8839->5433|8855->5439|8916->5478|9428->5963|9457->5970|9488->5973|10353->6810|10369->6816|10431->6856
                  LINES: 28->1|33->1|35->3|43->11|43->11|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|72->40|72->40|72->40|72->40|73->41|73->41|73->41|78->46|78->46|78->46|78->46|78->46|82->50|82->50|82->50|83->51|83->51|83->51|87->55|87->55|87->55|87->55|87->55|88->56|88->56|88->56|92->60|92->60|92->60|92->60|92->60|97->65|97->65|97->65|98->66|98->66|98->66|102->70|102->70|102->70|102->70|102->70|103->71|103->71|103->71|113->81|113->81|113->81|113->81|113->81|114->82|114->82|114->82|118->86|118->86|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|120->88|120->88|120->88|120->88|121->89|123->91|123->91|123->91|124->92|127->95|128->96|130->98|130->98|130->98|130->98|130->98|131->99|131->99|131->99|151->119|151->119|151->119|159->127|159->127|159->127|167->135|167->135|167->135|183->151|183->151|184->152|200->168|200->168|200->168
                  -- GENERATED --
              */
          