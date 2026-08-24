package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zam {
    private final int zaa;
    private final com.google.android.gms.common.ConnectionResult zab;

    public zam(com.google.android.gms.common.ConnectionResult r1, int r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zab = r1
            r0.zaa = r2
            return
    }

    public final int zaa() {
            r0 = this;
            int r0 = r0.zaa
            return r0
    }

    public final com.google.android.gms.common.ConnectionResult zab() {
            r0 = this;
            com.google.android.gms.common.ConnectionResult r0 = r0.zab
            return r0
    }
}
