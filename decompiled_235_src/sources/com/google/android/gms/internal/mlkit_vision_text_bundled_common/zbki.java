package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbki<T> implements Serializable {
    public static zbki zbd() {
        return zbjy.zba;
    }

    public static zbki zbe(Object obj) {
        obj.getClass();
        return new zbkk(obj);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract Object zba();

    public abstract Object zbb(Object obj);

    public abstract boolean zbc();
}
