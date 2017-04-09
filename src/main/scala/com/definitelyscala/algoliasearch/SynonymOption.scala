package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait SynonymOption extends js.Object {
  /**
   * You can forward all settings updates to the slaves of an index
   * https://github.com/algolia/algoliasearch-client-js#slave-settings
   */
  var forwardToSlaves: Boolean = js.native
  /**
   * Replace all existing synonyms on the index with the content of the batch
   * https://github.com/algolia/algoliasearch-client-js#batch-synonyms---batchsynonyms
   */
  var replaceExistingSynonyms: Boolean = js.native
}