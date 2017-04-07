package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait AlgoliaSynonym extends js.Object {
  /**
         * ObjectID of the synonym
         * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
         */
  var objectID: String = js.native
  /**
         * Type of synonym
         * values: synonym,oneWaySynonym
         * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
         */
  var `type`: String = js.native
  /**
         * Values used for the synonym
         * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
         */
  var synonyms: js.Array[String] = js.native
}