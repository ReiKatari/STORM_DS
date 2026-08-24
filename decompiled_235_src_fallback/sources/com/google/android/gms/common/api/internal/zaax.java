package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaax implements com.google.android.gms.common.api.internal.zabf {
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.internal.zabi zaa;

    public zaax(com.google.android.gms.common.api.internal.zabi r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r0.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.util.Queue r0 = r0.zaa
            r0.add(r1)
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GoogleApiClient is not connected yet."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
            r2 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            java.util.Map r0 = r0.zaa
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Api$Client r1 = (com.google.android.gms.common.api.Api.Client) r1
            r1.disconnect()
            goto Lc
        L1c:
            com.google.android.gms.common.api.internal.zabi r2 = r2.zaa
            com.google.android.gms.common.api.internal.zabe r2 = r2.zag
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            r2.zad = r0
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
            r0 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r0.zaa
            r0.zaj()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(com.google.android.gms.common.ConnectionResult r1, com.google.android.gms.common.api.Api r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
            r0 = this;
            r0 = 1
            return r0
    }
}
