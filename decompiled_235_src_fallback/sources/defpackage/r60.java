package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r60  reason: default package */
/* loaded from: classes.dex */
public final class r60 implements defpackage.sm6 {
    public static final defpackage.p60 a = null;
    public static final boolean b = false;

    static {
            p60 r0 = new p60
            r0.<init>()
            defpackage.r60.a = r0
            r0 = 0
            java.lang.String r1 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class<q60> r2 = defpackage.q60.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L14
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.ClassNotFoundException -> L14
            r0 = 1
        L14:
            defpackage.r60.b = r0
            return
    }

    @Override // defpackage.sm6
    public final boolean a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.sm6
    public final boolean b() {
            r0 = this;
            boolean r0 = defpackage.r60.b
            return r0
    }

    @Override // defpackage.sm6
    public final java.lang.String c(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            org.bouncycastle.jsse.BCSSLSocket r1 = (org.bouncycastle.jsse.BCSSLSocket) r1
            java.lang.String r0 = r1.getApplicationProtocol()
            if (r0 == 0) goto L12
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // defpackage.sm6
    public final void d(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L24
            org.bouncycastle.jsse.BCSSLSocket r1 = (org.bouncycastle.jsse.BCSSLSocket) r1
            org.bouncycastle.jsse.BCSSLParameters r0 = r1.getParameters()
            kx4 r2 = defpackage.kx4.a
            java.util.ArrayList r2 = defpackage.q61.j(r3)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.setApplicationProtocols(r2)
            r1.setParameters(r0)
        L24:
            return
    }
}
