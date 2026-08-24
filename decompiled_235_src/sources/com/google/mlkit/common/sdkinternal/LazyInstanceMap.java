package com.google.mlkit.common.sdkinternal;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class LazyInstanceMap<K, V> {
    private final Map zza = new HashMap();

    public abstract V create(K k);

    public V get(K k) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k)) {
                    return (V) this.zza.get(k);
                }
                V create = create(k);
                this.zza.put(k, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
