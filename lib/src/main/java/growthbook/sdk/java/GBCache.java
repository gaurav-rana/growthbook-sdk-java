package growthbook.sdk.java;

import java.util.concurrent.ConcurrentHashMap;

public class GBCache {
    private ConcurrentHashMap<String, Feature<?>> featureCache;

    public GBCache() {
        this.featureCache = new ConcurrentHashMap<>();
    }

    public <ValueType> void setFeature(String key, Feature<ValueType> feature) {
        this.featureCache.put(key, feature);
    }

    public <ValueType> Feature<ValueType> getFeature(String key, Class<ValueType> ValueType) {
        Feature<?> feature = this.featureCache.get(key);
        if (feature != null && ValueType.isInstance(feature.getDefaultValue())) {
            return (Feature<ValueType>) feature;
        }
        return null;
    }

    public void clear() {
        this.featureCache.clear();
    }
}