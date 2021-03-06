package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait AlgoliaIndexSettings extends js.Object {
  /**
   * The list of attributes you want index
   * default: *
   * https://github.com/algolia/algoliasearch-client-js#attributestoindex
   */
  var attributesToIndex: js.Array[String] = js.native
  /**
   * The list of attributes you want to use for faceting
   * default: null
   * https://github.com/algolia/algoliasearch-client-js#attributesforfaceting
   */
  var attributesforFaceting: js.Array[String] = js.native
  /**
   * The list of attributes that cannot be retrieved at query time
   * default: null
   * https://github.com/algolia/algoliasearch-client-js#unretrievableattributes
   */
  var unretrievableAttributes: js.Array[String] = js.native
  /**
   * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer
   * default: *
   * https://github.com/algolia/algoliasearch-client-js#attributestoretrieve
   */
  var attributesToRetrieve: js.Array[String] = js.native
  /**
   * Controls the way results are sorted
   * default: ['typo', 'geo', 'words', 'filters', 'proximity', 'attribute', 'exact', 'custom']
   * https://github.com/algolia/algoliasearch-client-js#ranking
   */
  var ranking: js.Array[String] = js.native
  /**
   * Lets you specify part of the ranking
   * default: []
   * https://github.com/algolia/algoliasearch-client-js#customranking
   */
  var customRanking: js.Array[String] = js.native
  /**
   * The list of indices on which you want to replicate all write operations
   * default: []
   * https://github.com/algolia/algoliasearch-client-js#slaves
   */
  var slaves: js.Array[String] = js.native
  /**
   * Limit the number of facet values returned for each facet
   * default: ""
   * https://github.com/algolia/algoliasearch-client-js#maxvaluesperfacet
   */
  var maxValuesPerFacet: String = js.native
  /**
   * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
   * default: null
   * https://github.com/algolia/algoliasearch-client-js#attributestohighlight
   */
  var attributesToHighlight: js.Array[String] = js.native
  /**
   * Default list of attributes to snippet alongside the number of words to return
   * default: null
   * https://github.com/algolia/algoliasearch-client-js#attributestosnippet
   */
  var attributesToSnippet: js.Array[String] = js.native
  /**
   * Specify the string that is inserted before the highlighted parts in the query result
   * default: <em>
   * https://github.com/algolia/algoliasearch-client-js#highlightpretag
   */
  var highlightPreTag: String = js.native
  /**
   * Specify the string that is inserted after the highlighted parts in the query result
   * default: </em>
   * https://github.com/algolia/algoliasearch-client-js#highlightposttag
   */
  var highlightPostTag: String = js.native
  /**
   * String used as an ellipsis indicator when a snippet is truncated.
   * default: …
   * https://github.com/algolia/algoliasearch-client-js#snippetellipsistext
   */
  var snippetEllipsisText: String = js.native
  /**
   * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
   * default: false
   * https://github.com/algolia/algoliasearch-client-js#restricthighlightandsnippetarrays
   */
  var restrictHighlightAndSnippetArrays: Boolean = js.native
  /**
   * Pagination parameter used to select the number of hits per page
   * default: 20
   * https://github.com/algolia/algoliasearch-client-js#hitsperpage
   */
  var hitsPerPage: Double = js.native
  /**
   * The minimum number of characters needed to accept one typo
   * default: 4
   * https://github.com/algolia/algoliasearch-client-js#minwordsizefor1typo
   */
  var minWordSizefor1Typo: Double = js.native
  /**
   * The minimum number of characters needed to accept two typos.
   * default: 8
   * https://github.com/algolia/algoliasearch-client-js#highlightposttag
   */
  var minWordSizefor2Typos: Double = js.native
  /**
   * This option allows you to control the number of typos allowed in the result set
   * default: true
   * 'true' The typo tolerance is enabled and all matching hits are retrieved (default behavior).
   * 'false' The typo tolerance is disabled. All results with typos will be hidden.
   * 'min' Only keep results with the minimum number of typos. For example, if one result matches without typos, then all results with typos will be hidden.
   * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
   * https://github.com/algolia/algoliasearch-client-js#typotolerance
   */
  var typoTolerance: js.Any = js.native
  /**
   * If set to false, disables typo tolerance on numeric tokens (numbers).
   * default: true
   * https://github.com/algolia/algoliasearch-client-js#allowtyposonnumerictokens
   */
  var allowTyposOnNumericTokens: Boolean = js.native
  /**
   * If set to true, plural won't be considered as a typo
   * default: false
   * https://github.com/algolia/algoliasearch-client-js#ignoreplurals
   */
  var ignorePlurals: Boolean = js.native
  /**
   * List of attributes on which you want to disable typo tolerance
   * default: ""
   * https://github.com/algolia/algoliasearch-client-js#disabletypotoleranceonattributes
   */
  var disableTypoToleranceOnAttributes: String = js.native
  /**
   * Specify the separators (punctuation characters) to index.
   * default: ""
   * https://github.com/algolia/algoliasearch-client-js#separatorstoindex
   */
  var separatorsToIndex: String = js.native
  /**
   * Selects how the query words are interpreted
   * default: 'prefixLast'
   * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
   * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
   * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
   * https://github.com/algolia/algoliasearch-client-js#querytype
   */
  var queryType: js.Any = js.native
  /**
   * This option is used to select a strategy in order to avoid having an empty result page
   * default: 'none'
   * 'lastWords' When a query does not return any results, the last word will be added as optional
   * 'firstWords' When a query does not return any results, the first word will be added as optional
   * 'allOptional' When a query does not return any results, a second trial will be made with all words as optional
   * 'none' No specific processing is done when a query does not return any results
   * https://github.com/algolia/algoliasearch-client-js#removewordsifnoresults
   */
  var removeWordsIfNoResults: String = js.native
  /**
   * Enables the advanced query syntax
   * default: false
   * https://github.com/algolia/algoliasearch-client-js#advancedsyntax
   */
  var advancedSyntax: Boolean = js.native
  /**
   * A string that contains the comma separated list of words that should be considered as optional when found in the query
   * default: []
   * https://github.com/algolia/algoliasearch-client-js#optionalwords
   */
  var optionalWords: js.Array[String] = js.native
  /**
   * Remove stop words from the query before executing it
   * default: false
   * true|false: enable or disable stop words for all 41 supported languages; or
   * a list of language ISO codes (as a comma-separated string) for which stop words should be enable
   * https://github.com/algolia/algoliasearch-client-js#removestopwords
   */
  var removeStopWords: js.Array[String] = js.native
  /**
   * List of attributes on which you want to disable prefix matching
   * default: []
   * https://github.com/algolia/algoliasearch-client-js#disableprefixonattributes
   */
  var disablePrefixOnAttributes: js.Array[String] = js.native
  /**
   * List of attributes on which you want to disable the computation of exact criteria
   * default: []
   * https://github.com/algolia/algoliasearch-client-js#disableexactonattributes
   */
  var disableExactOnAttributes: js.Array[String] = js.native
  /**
   * This parameter control how the exact ranking criterion is computed when the query contains one word
   * default: attribute
   * 'none': no exact on single word query
   * 'word': exact set to 1 if the query word is found in the record
   * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
   * https://github.com/algolia/algoliasearch-client-js#exactonsinglewordquery
   */
  var exactOnSingleWordQuery: String = js.native
  /**
   * Specify the list of approximation that should be considered as an exact match in the ranking formula
   * default: ['ignorePlurals', 'singleWordSynonym']
   * 'ignorePlurals': alternative words added by the ignorePlurals feature
   * 'singleWordSynonym': single-word synonym (For example "NY" = "NYC")
   * 'multiWordsSynonym': multiple-words synonym
   * https://github.com/algolia/algoliasearch-client-js#alternativesasexact
   */
  var alternativesAsExact: js.Any = js.native
  /**
   * The name of the attribute used for the Distinct feature
   * default: null
   * https://github.com/algolia/algoliasearch-client-js#attributefordistinct
   */
  var attributeForDistinct: String = js.native
  /**
   * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
   * https://github.com/algolia/algoliasearch-client-js#distinct
   */
  var distinct: js.Any = js.native
  /**
   * All numerical attributes are automatically indexed as numerical filters
   * default ''
   * https://github.com/algolia/algoliasearch-client-js#numericattributestoindex
   */
  var numericAttributesToIndex: js.Array[String] = js.native
  /**
   * Allows compression of big integer arrays.
   * default: false
   * https://github.com/algolia/algoliasearch-client-js#allowcompressionofintegerarray
   */
  var allowCompressionOfIntegerArray: Boolean = js.native
  /**
   * Specify alternative corrections that you want to consider.
   * default: []
   * https://github.com/algolia/algoliasearch-client-js#altcorrections
   */
  var altCorrections: js.Any = js.native
  /**
   * Configure the precision of the proximity ranking criterion
   * default: 1
   * https://github.com/algolia/algoliasearch-client-js#minproximity
   */
  var minProximity: Double = js.native
  /**
   * This is an advanced use-case to define a token substitutable by a list of words without having the original token searchable
   * default: ''
   * https://github.com/algolia/algoliasearch-client-js#placeholders
   */
  var placeholders: js.Any = js.native
}