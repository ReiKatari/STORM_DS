package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p42  reason: default package */
/* loaded from: classes.dex */
public final class p42 {
    public static final java.util.logging.Logger c = null;
    public static final java.util.ArrayList d = null;
    public static final defpackage.p42 e = null;
    public static final defpackage.p42 f = null;
    public final defpackage.x42 a;
    public final java.util.List b;

    static {
            java.lang.Class<p42> r0 = defpackage.p42.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.p42.c = r0
            java.lang.String r0 = "android.app.Application"
            r1 = 0
            r2 = 0
            java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "GmsCore_OpenSSL"
            java.lang.String r1 = "AndroidOpenSSL"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L20:
            r3 = 2
            if (r2 >= r3) goto L4a
            r3 = r0[r2]
            java.security.Provider r4 = java.security.Security.getProvider(r3)
            if (r4 == 0) goto L2f
            r1.add(r4)
            goto L47
        L2f:
            java.util.logging.Logger r4 = defpackage.p42.c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Provider "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " not available"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.info(r3)
        L47:
            int r2 = r2 + 1
            goto L20
        L4a:
            defpackage.p42.d = r1
            goto L54
        L4d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.p42.d = r0
        L54:
            p42 r0 = new p42
            q61 r1 = new q61
            r1.<init>()
            r0.<init>(r1)
            defpackage.p42.e = r0
            p42 r0 = new p42
            jd1 r1 = new jd1
            r2 = 3
            r1.<init>(r2)
            r0.<init>(r1)
            defpackage.p42.f = r0
            return
    }

    public p42(defpackage.x42 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.ArrayList r1 = defpackage.p42.d
            r0.b = r1
            return
    }

    public final java.lang.Object a(java.lang.String r6) {
            r5 = this;
            java.util.List r0 = r5.b
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            x42 r4 = r5.a
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.next()
            java.security.Provider r3 = (java.security.Provider) r3
            java.lang.Object r5 = r4.a(r6, r3)     // Catch: java.lang.Exception -> L1b
            return r5
        L1b:
            r3 = move-exception
            if (r2 != 0) goto L8
            r2 = r3
            goto L8
        L20:
            java.lang.Object r5 = r4.a(r6, r1)
            return r5
    }
}
