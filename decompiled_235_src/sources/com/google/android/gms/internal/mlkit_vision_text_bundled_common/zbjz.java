package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zbjz implements Iterator {
    private Object zba;
    private int zbb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zbb;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.zbb = 4;
                    this.zba = zba();
                    if (this.zbb != 3) {
                        this.zbb = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        e41.m();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.zbb = 2;
            Object obj = this.zba;
            this.zba = null;
            return obj;
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zba();

    public final Object zbb() {
        this.zbb = 3;
        return null;
    }
}
