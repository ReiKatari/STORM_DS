package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e04  reason: default package */
/* loaded from: classes.dex */
public abstract class e04 {
    public static final defpackage.jv2 a = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = defpackage.xx6.a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> La
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L10
            java.lang.Boolean.parseBoolean(r0)
        L10:
            mg r0 = new mg     // Catch: java.lang.Throwable -> L76
            r0.<init>()     // Catch: java.lang.Throwable -> L76
            mg[] r0 = new defpackage.mg[]{r0}     // Catch: java.lang.Throwable -> L76
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L76
            qb6 r0 = defpackage.sb6.Y(r0)
            java.util.List r0 = defpackage.sb6.c0(r0)
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L34
            goto L54
        L34:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L3f
            goto L54
        L3f:
            r2 = r1
            mg r2 = (defpackage.mg) r2
            r2.getClass()
        L45:
            java.lang.Object r2 = r0.next()
            mg r2 = (defpackage.mg) r2
            r2.getClass()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L45
        L54:
            mg r1 = (defpackage.mg) r1
            if (r1 == 0) goto L70
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r0 == 0) goto L6a
            jv2 r1 = new jv2
            android.os.Handler r0 = defpackage.lv2.b(r0)
            r1.<init>(r0)
            defpackage.e04.a = r1
            return
        L6a:
            java.lang.String r0 = "The main looper is not available"
            defpackage.i.m(r0)
            return
        L70:
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            defpackage.i.m(r0)
            return
        L76:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
