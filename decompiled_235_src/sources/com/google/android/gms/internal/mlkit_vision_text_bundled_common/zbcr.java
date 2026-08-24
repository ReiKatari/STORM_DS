package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbcr {
    private final int zba;
    private final int zbb;

    public zbcr(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 32767 && i >= 0) {
            z = true;
        } else {
            z = false;
        }
        zbkj.zbc(z);
        zbkj.zbc((i2 >= 32767 || i2 < 0) ? false : z2);
        this.zba = i;
        this.zbb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zbcr) {
            zbcr zbcrVar = (zbcr) obj;
            if (this.zba == zbcrVar.zba && this.zbb == zbcrVar.zbb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zbb | (this.zba << 16);
    }

    public final String toString() {
        return this.zba + "x" + this.zbb;
    }

    public final int zba() {
        return this.zbb;
    }

    public final int zbb() {
        return this.zba;
    }
}
