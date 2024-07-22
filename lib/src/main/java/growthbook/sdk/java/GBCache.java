package growthbook.sdk.java;

import java.util.concurrent.ConcurrentHashMap;

public class GBCache {
    private ConcurrentHashMap<String, Feature<String>> stringFeatureCache;
    private ConcurrentHashMap<String, Feature<Boolean>> booleanFeatureCache;
    private ConcurrentHashMap<String, Feature<Integer>> integerFeatureCache;
    private ConcurrentHashMap<String, Feature<Double>> doubleFeatureCache;
    private ConcurrentHashMap<String, Feature<Float>> floatFeatureCache;
    private ConcurrentHashMap<String, Feature<Object>> objectFeatureCache;

    public GBCache() {
        this.booleanFeatureCache = new ConcurrentHashMap<>();
        this.integerFeatureCache = new ConcurrentHashMap<>();
        this.doubleFeatureCache = new ConcurrentHashMap<>();
        this.floatFeatureCache = new ConcurrentHashMap<>();
    }

    public <ValueType> void setFeature(String key, Feature<ValueType> feature, Class<ValueType> ValueType) {
        if (ValueType == String.class) {
            this.stringFeatureCache.put(key, (Feature<String>) feature);
        } else if (ValueType == Boolean.class) {
            this.booleanFeatureCache.put(key, (Feature<Boolean>) feature);
        } else if (ValueType == Integer.class) {
            this.integerFeatureCache.put(key, (Feature<Integer>) feature);
        } else if (ValueType == Double.class) {
            this.doubleFeatureCache.put(key, (Feature<Double>) feature);
        } else if (ValueType == Float.class) {
            this.floatFeatureCache.put(key, (Feature<Float>) feature);
        } else if (ValueType == Object.class) {
            this.objectFeatureCache.put(key, (Feature<Object>) feature);
        }
    }

    public <ValueType> Feature<ValueType> getFeature(String key, Class<ValueType> ValueType) {
        if (ValueType == String.class) {
            return (Feature<ValueType>) this.stringFeatureCache.get(key);
        } else if (ValueType == Boolean.class) {
            return (Feature<ValueType>) this.booleanFeatureCache.get(key);
        } else if (ValueType == Integer.class) {
            return (Feature<ValueType>) this.integerFeatureCache.get(key);
        } else if (ValueType == Double.class) {
            return (Feature<ValueType>) this.doubleFeatureCache.get(key);
        } else if (ValueType == Float.class) {
            return (Feature<ValueType>) this.floatFeatureCache.get(key);
        } else if (ValueType == Object.class) {
            return (Feature<ValueType>) this.objectFeatureCache.get(key);
        }
        return null;
    }
}
