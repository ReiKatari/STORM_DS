package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i01  reason: default package */
/* loaded from: classes.dex */
public final class i01 implements defpackage.sm6 {
    public static final defpackage.g01 a = null;
    public static final boolean b = false;

    static {
            g01 r0 = new g01
            r0.<init>()
            defpackage.i01.a = r0
            r0 = 0
            java.lang.String r1 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class<h01> r2 = defpackage.h01.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L20
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Throwable -> L20
            boolean r1 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            boolean r1 = defpackage.h01.a()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            r0 = 1
        L20:
            defpackage.i01.b = r0
            return
    }

    @Override // defpackage.sm6
    public final boolean a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r1)
            return r0
    }

    @Override // defpackage.sm6
    public final boolean b() {
            r0 = this;
            boolean r0 = defpackage.i01.b
            return r0
    }

    @Override // defpackage.sm6
    public final java.lang.String c(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = org.conscrypt.Conscrypt.getApplicationProtocol(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.sm6
    public final void d(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L1f
            r0 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r0)
            kx4 r0 = defpackage.kx4.a
            java.util.ArrayList r0 = defpackage.q61.j(r3)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r0)
        L1f:
            return
    }
}
