package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbto {
    private final Object zba;
    private final int zbb;

    public zbto(Object obj, int i) {
        this.zba = obj;
        this.zbb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbto)) {
            return false;
        }
        zbto zbtoVar = (zbto) obj;
        if (this.zba != zbtoVar.zba || this.zbb != zbtoVar.zbb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zba) * 65535) + this.zbb;
    }
}
