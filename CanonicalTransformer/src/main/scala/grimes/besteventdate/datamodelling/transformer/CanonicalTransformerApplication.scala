package grimes.besteventdate.datamodelling.transformer

import java.io.File
import java.io.File._

import grimes.besteventdate.datamodelling.transformer.services.{CanonicalTransformerService, MeetupTransformerService}
import grimes.besteventdate.scheduling.ScheduledApp
import org.apache.spark.sql.SparkSession

object CanonicalTransformerApplication {
  def main(args: Array[String]): Unit = new CanonicalTransformerApplication().init()
}

class CanonicalTransformerApplication extends ScheduledApp {
  override def execute(): Boolean = {
    val eventsJson: String = downloadEvents()

    ingestEvents(eventsJson, new MeetupTransformerService, null)
  }

  private def downloadEvents(): String = ???

  private def ingestEvents(eventsJson: String, transformerService: CanonicalTransformerService, sparkSession: SparkSession): Boolean = {
    val eventsJsonFile: File = createTempFile("events", ".json")

    //sparkSession.read

    ???
  }
}