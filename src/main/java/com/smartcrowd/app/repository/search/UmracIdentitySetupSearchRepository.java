package com.smartcrowd.app.repository.search;

import com.smartcrowd.app.domain.UmracIdentitySetup;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracIdentitySetup entity.
 */
public interface UmracIdentitySetupSearchRepository extends ElasticsearchRepository<UmracIdentitySetup, Long> {
}
