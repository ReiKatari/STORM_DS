package com.google.mlkit.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MlKitInitProvider extends android.content.ContentProvider {
    public MlKitInitProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context r3, android.content.pm.ProviderInfo r4) {
            r2 = this;
            java.lang.String r0 = r4.authority
            java.lang.String r1 = "com.google.mlkit.common.mlkitinitprovider"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            java.lang.String r1 = "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            super.attachInfo(r3, r4)
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r2 = this;
            android.content.Context r2 = r2.getContext()
            r0 = 0
            if (r2 != 0) goto Lf
            java.lang.String r2 = "MlKitInitProvider"
            java.lang.String r1 = "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional."
            android.util.Log.i(r2, r1)
            return r0
        Lf:
            com.google.mlkit.common.sdkinternal.MlKitContext.zza(r2)
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0 = 0
            return r0
    }
}
