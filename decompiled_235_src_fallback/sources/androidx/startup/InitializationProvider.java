package androidx.startup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    public InitializationProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L47
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L45
            bt r0 = defpackage.bt.J(r0)
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r1 = r0.R
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "Startup"
            java.lang.String r2 = defpackage.ln2.f0(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            android.os.Trace.beginSection(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            r2.<init>(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r3 = r3.getProviderInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            r0.D(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39 java.lang.Throwable -> L40
            android.os.Trace.endSection()
            goto L45
        L39:
            r3 = move-exception
            ug r0 = new ug     // Catch: java.lang.Throwable -> L40
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
        L45:
            r3 = 1
            return r3
        L47:
            ug r3 = new ug
            java.lang.String r0 = "Context cannot be null"
            r3.<init>(r0)
            throw r3
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }
}
