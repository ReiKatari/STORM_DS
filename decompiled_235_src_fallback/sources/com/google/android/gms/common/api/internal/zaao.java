package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaao extends com.google.android.gms.common.api.internal.zaav {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.Map zac;

    public zaao(com.google.android.gms.common.api.internal.zaaw r2, java.util.Map r3) {
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
            com.google.android.gms.common.internal.zal r1 = new com.google.android.gms.common.internal.zal
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.api.internal.zaaw.zaf(r0)
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r3 = r6.zac
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.next()
            com.google.android.gms.common.api.Api$Client r4 = (com.google.android.gms.common.api.Api.Client) r4
            boolean r5 = r4.requiresGooglePlayServices()
            if (r5 == 0) goto L43
            java.util.Map r5 = r6.zac
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.common.api.internal.zaal r5 = (com.google.android.gms.common.api.internal.zaal) r5
            boolean r5 = com.google.android.gms.common.api.internal.zaal.zaa(r5)
            if (r5 != 0) goto L43
            r0.add(r4)
            goto L1f
        L43:
            r2.add(r4)
            goto L1f
        L47:
            boolean r3 = r0.isEmpty()
            r4 = 0
            r5 = -1
            if (r3 == 0) goto L6a
            int r0 = r2.size()
        L53:
            if (r4 >= r0) goto L84
            java.lang.Object r3 = r2.get(r4)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            com.google.android.gms.common.api.internal.zaaw r5 = r6.zaa
            android.content.Context r5 = com.google.android.gms.common.api.internal.zaaw.zac(r5)
            int r5 = r1.zab(r5, r3)
            int r4 = r4 + 1
            if (r5 != 0) goto L53
            goto L84
        L6a:
            int r2 = r0.size()
        L6e:
            if (r4 >= r2) goto L84
            java.lang.Object r3 = r0.get(r4)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            com.google.android.gms.common.api.internal.zaaw r5 = r6.zaa
            android.content.Context r5 = com.google.android.gms.common.api.internal.zaaw.zac(r5)
            int r5 = r1.zab(r5, r3)
            int r4 = r4 + 1
            if (r5 == 0) goto L6e
        L84:
            if (r5 == 0) goto L9b
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r0.<init>(r5, r1)
            com.google.android.gms.common.api.internal.zaaw r1 = r6.zaa
            com.google.android.gms.common.api.internal.zabi r2 = com.google.android.gms.common.api.internal.zaaw.zak(r1)
            com.google.android.gms.common.api.internal.zaam r3 = new com.google.android.gms.common.api.internal.zaam
            r3.<init>(r6, r1, r0)
            r2.zal(r3)
            return
        L9b:
            com.google.android.gms.common.api.internal.zaaw r0 = r6.zaa
            boolean r2 = com.google.android.gms.common.api.internal.zaaw.zav(r0)
            if (r2 == 0) goto Lb0
            oz7 r2 = com.google.android.gms.common.api.internal.zaaw.zan(r0)
            if (r2 == 0) goto Lb0
            oz7 r0 = com.google.android.gms.common.api.internal.zaaw.zan(r0)
            r0.zab()
        Lb0:
            java.util.Map r0 = r6.zac
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            java.util.Map r3 = r6.zac
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r3 = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) r3
            boolean r4 = r2.requiresGooglePlayServices()
            if (r4 == 0) goto Lef
            com.google.android.gms.common.api.internal.zaaw r4 = r6.zaa
            android.content.Context r4 = com.google.android.gms.common.api.internal.zaaw.zac(r4)
            int r4 = r1.zab(r4, r2)
            if (r4 == 0) goto Lef
            com.google.android.gms.common.api.internal.zaaw r2 = r6.zaa
            com.google.android.gms.common.api.internal.zabi r4 = com.google.android.gms.common.api.internal.zaaw.zak(r2)
            com.google.android.gms.common.api.internal.zaan r5 = new com.google.android.gms.common.api.internal.zaan
            r5.<init>(r6, r2, r3)
            r4.zal(r5)
            goto Lba
        Lef:
            r2.connect(r3)
            goto Lba
        Lf3:
            return
    }
}
