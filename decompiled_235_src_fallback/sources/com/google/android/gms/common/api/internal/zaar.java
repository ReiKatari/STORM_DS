package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaar extends defpackage.jz7 {
    private final java.lang.ref.WeakReference zaa;

    public zaar(com.google.android.gms.common.api.internal.zaaw r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            return
    }

    @Override // defpackage.mz7
    public final void zab(defpackage.xz7 r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zaaw r0 = (com.google.android.gms.common.api.internal.zaaw) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.gms.common.api.internal.zabi r1 = com.google.android.gms.common.api.internal.zaaw.zak(r0)
            com.google.android.gms.common.api.internal.zaaq r2 = new com.google.android.gms.common.api.internal.zaaq
            r2.<init>(r3, r0, r0, r4)
            r1.zal(r2)
            return
    }
}
