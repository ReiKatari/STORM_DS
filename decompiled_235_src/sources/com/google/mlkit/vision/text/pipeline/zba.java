package com.google.mlkit.vision.text.pipeline;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zba extends zbn {
    private final zbo zba;
    private final zbok zbb;
    private final zbkx zbc;
    private final boolean zbd;

    public zba(zbo zboVar, zbok zbokVar, zbkx zbkxVar, boolean z) {
        this.zba = zboVar;
        this.zbb = zbokVar;
        if (zbkxVar != null) {
            this.zbc = zbkxVar;
            this.zbd = z;
            return;
        }
        u34.x("Null lineBoxParcels");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbn) {
            zbn zbnVar = (zbn) obj;
            if (this.zba.equals(zbnVar.zbc()) && this.zbb.equals(zbnVar.zbb()) && this.zbc.equals(zbnVar.zba()) && this.zbd == zbnVar.zbd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.zba.hashCode() ^ 1000003) * 1000003) ^ this.zbb.hashCode()) * 1000003) ^ this.zbc.hashCode();
        if (true != this.zbd) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ (hashCode * 1000003);
    }

    public final String toString() {
        zbkx zbkxVar = this.zbc;
        zbok zbokVar = this.zbb;
        String obj = this.zba.toString();
        String obj2 = zbokVar.toString();
        String obj3 = zbkxVar.toString();
        StringBuilder u = i61.u("VkpResults{status=", obj, ", textParcel=", obj2, ", lineBoxParcels=");
        u.append(obj3);
        u.append(", fromColdCall=");
        return i61.o(u, this.zbd, "}");
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final zbkx zba() {
        return this.zbc;
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final zbok zbb() {
        return this.zbb;
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final zbo zbc() {
        return this.zba;
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final boolean zbd() {
        return this.zbd;
    }
}
