package grimes.besteventdate.datamodelling.transformer.services

import grimes.besteventdate.hbase.models.User

trait CanonicalTransformerService {
  def transform(userId: String): User = ???
}