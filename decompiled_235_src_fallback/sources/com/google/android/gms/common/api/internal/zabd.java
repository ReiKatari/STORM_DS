package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabd extends com.google.android.gms.common.api.internal.zabw {
    private final java.lang.ref.WeakReference zaa;

    public zabd(com.google.android.gms.common.api.internal.zabe r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zabe r0 = (com.google.android.gms.common.api.internal.zabe) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.gms.common.api.internal.zabe.zai(r0)
            return
    }
}
