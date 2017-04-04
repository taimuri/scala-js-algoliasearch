package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait AlgoliaAction extends js.Object {
  /**
   * Type of the batch action
   * values: addObject, updateObject, partialUpdateObject, partialUpdateObjectNoCreate, deleteObject
   * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
   */
  var action: String = js.native
  /**
   * Name of the index where the bact will be performed
   * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
   */
  var indexName: String = js.native
}