package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zab extends com.google.android.gms.common.data.DataHolder.Builder {
    public zab(java.lang.String[] r1, java.lang.String r2) {
            r0 = this;
            r2 = 0
            r0.<init>(r1, r2, r2)
            return
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Cannot add data to empty builder"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Cannot add data to empty builder"
            r0.<init>(r1)
            throw r0
    }
}
