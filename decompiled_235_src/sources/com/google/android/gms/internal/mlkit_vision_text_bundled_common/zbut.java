package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbut implements Map.Entry {
    private final Map.Entry zba;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zba.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zbuv) this.zba.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zbvm) {
            return ((zbuv) this.zba.getValue()).zbc((zbvm) obj);
        }
        i.h("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }

    public final zbuv zba() {
        return (zbuv) this.zba.getValue();
    }
}
