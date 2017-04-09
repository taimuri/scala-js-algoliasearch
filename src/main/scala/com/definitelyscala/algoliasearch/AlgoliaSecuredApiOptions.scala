package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait AlgoliaSecuredApiOptions extends js.Object {
  /**
   * Filter the query with numeric, facet or/and tag filters
   * default: ""
   * https://github.com/algolia/algoliasearch-client-js#filters-1
   */
  var filters: String = js.native
  /**
   * Defines the expiration date of the API key
   * https://github.com/algolia/algoliasearch-client-js#valid-until
   */
  var validUntil: Double = js.native
  /**
   * Restricts the key to a list of index names allowed for the secured API key
   * https://github.com/algolia/algoliasearch-client-js#index-restriction
   */
  var restrictIndices: String = js.native
  /**
   * Allows you to restrict a single user to performing a maximum of N API calls per hour
   * https://github.com/algolia/algoliasearch-client-js#user-rate-limiting
   */
  var userToken: String = js.native
}