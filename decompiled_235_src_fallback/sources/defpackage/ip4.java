package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip4  reason: default package */
/* loaded from: classes.dex */
public final class ip4 {
    public static final defpackage.ip4 b = null;
    public final defpackage.xw a;

    static {
            ip4 r0 = new ip4
            r0.<init>()
            defpackage.ip4.b = r0
            return
    }

    public ip4() {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            xw r0 = defpackage.g04.u(r0)
            r2.a = r0
            return
    }

    public final boolean a(long r3, long r5) {
            r2 = this;
            xw r2 = r2.a
            java.lang.Object r2 = r2.a
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            long r3 = r3 - r5
            long r3 = r3 + r0
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }
}
