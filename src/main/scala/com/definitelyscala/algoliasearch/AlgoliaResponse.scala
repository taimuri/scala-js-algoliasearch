package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait AlgoliaResponse extends js.Object {
  /**
         * Contains all the hits matching the query
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var hits: js.Array[js.Any] = js.native
  /**
         * Current page
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var page: Double = js.native
  /**
         * Number of total hits matching the query
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var nbHits: Double = js.native
  /**
         * Number of pages
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var nbPage: Double = js.native
  /**
         * Number of hits per pages
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var hitsPerPage: Double = js.native
  /**
         * Engine processing time (excluding network transfer)
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var processingTimeMS: Double = js.native
  /**
         * Query used to perform the search
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var query: String = js.native
  /**
         * GET parameters used to perform the search
         * https://github.com/algolia/algoliasearch-client-js#response-format
         */
  var params: String = js.native
}