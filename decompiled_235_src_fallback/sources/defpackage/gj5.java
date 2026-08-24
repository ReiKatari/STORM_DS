package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj5  reason: default package */
/* loaded from: classes.dex */
public abstract class gj5 {
    private final java.lang.String zza;
    private java.lang.Object zzb;

    public gj5() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "com.google.android.gms.common.ui.SignInButtonCreatorImpl"
            r1.zza = r0
            return
    }

    public abstract java.lang.Object getRemoteCreator(android.os.IBinder r1);

    public final java.lang.Object getRemoteCreatorInstance(android.content.Context r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            if (r0 != 0) goto L47
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.content.Context r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r2)
            if (r2 == 0) goto L3f
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.String r0 = r1.zza     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Object r2 = r1.getRemoteCreator(r2)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            r1.zzb = r2     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            goto L47
        L24:
            r1 = move-exception
            fj5 r2 = new fj5
            java.lang.String r0 = "Could not access creator."
            r2.<init>(r0, r1)
            throw r2
        L2d:
            r1 = move-exception
            fj5 r2 = new fj5
            java.lang.String r0 = "Could not instantiate creator."
            r2.<init>(r0, r1)
            throw r2
        L36:
            r1 = move-exception
            fj5 r2 = new fj5
            java.lang.String r0 = "Could not load creator class."
            r2.<init>(r0, r1)
            throw r2
        L3f:
            fj5 r1 = new fj5
            java.lang.String r2 = "Could not get remote context."
            r1.<init>(r2)
            throw r1
        L47:
            java.lang.Object r1 = r1.zzb
            return r1
    }
}
