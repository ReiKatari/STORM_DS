package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbjy extends zbki {
    static final zbjy zba = new zbjy();

    private zbjy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final Object zba() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final Object zbb(Object obj) {
        return "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final boolean zbc() {
        return false;
    }
}
