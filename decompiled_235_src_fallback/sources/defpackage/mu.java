package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu  reason: default package */
/* loaded from: classes.dex */
public class mu {
    public static volatile defpackage.mu a;

    static {
            mu r0 = new mu
            r0.<init>()
            java.lang.String r1 = "org.tukaani.xz.ArrayCache"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "Dummy"
            if (r1 != 0) goto L10
            r1 = r2
        L10:
            java.lang.String r3 = "Basic"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L2f
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L21
            defpackage.mu.a = r0
            return
        L21:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r2 = "Unsupported value '"
            java.lang.String r3 = "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"
            java.lang.String r1 = defpackage.lb1.A(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L2f:
            c30 r0 = defpackage.b30.a
            defpackage.mu.a = r0
            return
    }

    public byte[] a(int r1) {
            r0 = this;
            byte[] r0 = new byte[r1]
            return r0
    }

    public void b(byte[] r1) {
            r0 = this;
            return
    }
}
