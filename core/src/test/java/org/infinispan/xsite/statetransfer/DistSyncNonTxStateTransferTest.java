package org.infinispan.xsite.statetransfer;

import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.testng.annotations.Test;

/**
 * Tests the cross-site replication with concurrent operations checking for consistency using a distributed synchronous
 * non-transactional cache
 *
 * @author Pedro Ruivo
 * @since 7.0
 */
@Test(groups = "xsite", testName = "xsite.statetransfer.DistSyncNonTxStateTransferTest")
public class DistSyncNonTxStateTransferTest extends BaseStateTransferTest {

   public DistSyncNonTxStateTransferTest() {
      super();
      implicitBackupCache = true;
      transactional = false;
   }

   @Override
   protected ConfigurationBuilder getNycActiveConfig() {
      return getDefaultClusteredCacheConfig(cacheMode, transactional);
   }

   @Override
   protected ConfigurationBuilder getLonActiveConfig() {
      return getDefaultClusteredCacheConfig(cacheMode, transactional);
   }
}
