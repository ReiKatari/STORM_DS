package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd5  reason: default package */
/* loaded from: classes.dex */
public abstract class nd5 {
    public static final defpackage.qm a = null;

    static {
            qm r0 = new qm
            r1 = 5
            r0.<init>(r1)
            defpackage.nd5.a = r0
            return
    }

    public static byte[] a(int r1) {
            byte[] r1 = new byte[r1]
            qm r0 = defpackage.nd5.a
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            r0.nextBytes(r1)
            return r1
    }
}
