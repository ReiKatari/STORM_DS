package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return Collections.singletonList(tArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map zza = zza(6, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        zza.put(k4, v4);
        zza.put(k5, v5);
        zza.put(k6, v6);
        return Collections.unmodifiableMap(zza);
    }

    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map zza = zza(length, false);
                    for (int i = 0; i < kArr.length; i++) {
                        zza.put(kArr[i], vArr[i]);
                    }
                    return Collections.unmodifiableMap(zza);
                }
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            return Collections.EMPTY_MAP;
        }
        i.h(lb1.j("Key and values array lengths not equal: ", length, length2, " != "));
        return null;
    }

    public static <T> Set<T> mutableSetOfWithSize(int i) {
        if (i == 0) {
            return new zu(0);
        }
        return zzb(i, true);
    }

    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            Set zzb = zzb(length, false);
                            Collections.addAll(zzb, tArr);
                            return Collections.unmodifiableSet(zzb);
                        }
                        T t = tArr[0];
                        T t2 = tArr[1];
                        T t3 = tArr[2];
                        T t4 = tArr[3];
                        Set zzb2 = zzb(4, false);
                        zzb2.add(t);
                        zzb2.add(t2);
                        zzb2.add(t3);
                        zzb2.add(t4);
                        return Collections.unmodifiableSet(zzb2);
                    }
                    return setOf(tArr[0], tArr[1], tArr[2]);
                }
                T t5 = tArr[0];
                T t6 = tArr[1];
                Set zzb3 = zzb(2, false);
                zzb3.add(t5);
                zzb3.add(t6);
                return Collections.unmodifiableSet(zzb3);
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.EMPTY_SET;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ci6, java.util.Map] */
    private static Map zza(int i, boolean z) {
        if (i <= 256) {
            return new ci6(i);
        }
        return new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z) {
        int i2;
        float f;
        if (true != z) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        if (i <= i2) {
            return new zu(i);
        }
        if (true != z) {
            f = 1.0f;
        } else {
            f = 0.75f;
        }
        return new HashSet(i, f);
    }

    @Deprecated
    public static <T> List<T> listOf(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3) {
        Map zza = zza(3, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        return Collections.unmodifiableMap(zza);
    }

    @Deprecated
    public static <T> Set<T> setOf(T t, T t2, T t3) {
        Set zzb = zzb(3, false);
        zzb.add(t);
        zzb.add(t2);
        zzb.add(t3);
        return Collections.unmodifiableSet(zzb);
    }
}
