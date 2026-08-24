package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaap extends com.google.android.gms.common.api.internal.zaav {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.ArrayList zac;

    public zaap(com.google.android.gms.common.api.internal.zaaw r2, java.util.ArrayList r3) {
            r1 = this;
            r1.zaa = r2
            r0 = 0
            r1.<init>(r2, r0)
            r1.zac = r3
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
            r6 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r6.zaa
            com.google.android.gms.common.api.internal.zabi r1 = com.google.android.gms.common.api.internal.zaaw.zak(r0)
            com.google.android.gms.common.api.internal.zabe r1 = r1.zag
            java.util.Set r0 = com.google.android.gms.common.api.internal.zaaw.zao(r0)
            r1.zad = r0
            java.util.ArrayList r0 = r6.zac
            int r1 = r0.size()
            r2 = 0
        L15:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            com.google.android.gms.common.api.internal.zaaw r4 = r6.zaa
            com.google.android.gms.common.internal.IAccountAccessor r5 = com.google.android.gms.common.api.internal.zaaw.zam(r4)
            com.google.android.gms.common.api.internal.zabi r4 = com.google.android.gms.common.api.internal.zaaw.zak(r4)
            com.google.android.gms.common.api.internal.zabe r4 = r4.zag
            java.util.Set r4 = r4.zad
            r3.getRemoteService(r5, r4)
            int r2 = r2 + 1
            goto L15
        L31:
            return
    }
}
