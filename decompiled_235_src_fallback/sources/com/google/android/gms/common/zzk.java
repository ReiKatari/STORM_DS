package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzk extends com.google.android.gms.common.zzj {
    private final byte[] zza;

    public zzk(byte[] r3) {
            r2 = this;
            r0 = 0
            r1 = 25
            byte[] r0 = java.util.Arrays.copyOfRange(r3, r0, r1)
            r2.<init>(r0)
            r2.zza = r3
            return
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
            r0 = this;
            byte[] r0 = r0.zza
            return r0
    }
}
