package grimes.besteventdate.scheduling

trait ScheduledApp {
  def init(): Boolean = ???

  def execute(): Boolean
}