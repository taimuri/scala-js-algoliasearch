package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait SearchSynonymOptions extends js.Object {
  /**
         * The actual search query to find synonyms
         * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
         */
  var query: String = js.native
  /**
         * The page to fetch when browsing through several pages of results
         * default: 100
         * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
         */
  var page: Double = js.native
  /**
         * Restrict the search to a specific type of synonym
         * Use an empty string to search all types (default behavior)
         * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
         */
  var `type`: String = js.native
  /**
         * Number of hits per page
         * default: 100
         * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
         */
  var hitsPerPage: Double = js.native
}