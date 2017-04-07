package com.definitelyscala.algoliasearch

import scala.scalajs.js

  /**
         * Object
         * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
         */
@js.native
trait AlgoliaUserKeyOptions extends js.Object {
  /**
         * Add a validity period. The key will be valid for a specific period of time (in seconds).
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  var validity: Double = js.native
  /**
         * Specify the maximum number of API calls allowed from an IP address per hour
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  var maxQueriesPerIPPerHour: Double = js.native
  /**
         * Specify the maximum number of hits this API key can retrieve in one call
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  var maxHitsPerQuery: Boolean = js.native
  /**
         * Specify the list of targeted indices
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  var indexes: js.Array[String] = js.native
  /**
         * Specify the list of referers
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  var referers: js.Array[String] = js.native
  /**
         * Specify the list of query parameters
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  var queryParameters: AlgoliaQueryParameters = js.native
  /**
         * Specify a description to describe where the key is used.
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  var description: String = js.native
}