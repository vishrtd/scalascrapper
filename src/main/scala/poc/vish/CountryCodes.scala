package poc.vish

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

import scala.collection.mutable.ListBuffer

case class CountryCodes(
                         country: String,
                         countryCode: String,
                         isoCode:String,
                         population:String,
                         area:String,
                         gdpUsd:String)

object CountryCodes {

  def main(args: Array[String]): Unit = {
    val doc: Document = Jsoup.connect("website here").get()
    print(doc.title())

    val codes: ListBuffer[CountryCodes] = new ListBuffer[CountryCodes]
    val table:Elements = doc.body().children().select("tr")
//    table.forEach(print)



    table.forEach{ data =>
      codes += CountryCodes(
        data.select("td").eq(0).text(),
        data.select("td").eq(1).text(),
        data.select("td").eq(2).text(),
        data.select("td").eq(3).text(),
        data.select("td").eq(4).text(),
        data.select("td").eq(5).text()
      )
    }

    val finalList: List[CountryCodes] = codes.toList.drop(1)
    println(finalList.length)
    println(finalList)
  }

}
