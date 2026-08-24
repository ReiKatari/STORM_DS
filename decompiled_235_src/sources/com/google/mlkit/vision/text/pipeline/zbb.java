package com.google.mlkit.vision.text.pipeline;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbb extends zbo {
    private final int zba;
    private final zbki zbb;

    public zbb(int i, zbki zbkiVar) {
        this.zba = i;
        this.zbb = zbkiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbo) {
            zbo zboVar = (zbo) obj;
            if (this.zba == zboVar.zba() && this.zbb.equals(zboVar.zbb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zba;
        return this.zbb.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.zbb.toString();
        return "VkpStatus{exceptionType=" + this.zba + ", remoteException=" + obj + "}";
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbo
    public final int zba() {
        return this.zba;
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbo
    public final zbki zbb() {
        return this.zbb;
    }
}
