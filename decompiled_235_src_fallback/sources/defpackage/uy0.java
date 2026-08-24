package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy0  reason: default package */
/* loaded from: classes.dex */
public abstract class uy0 {
    public static final defpackage.gr1 a = null;

    static {
            gr1 r0 = new gr1
            java.lang.String r1 = "CLOSED"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.uy0.a = r0
            return
    }

    public static final java.lang.Object a(defpackage.p96 r4, long r5, defpackage.eo2 r7) {
        L0:
            long r0 = r4.X
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto Le
            boolean r0 = r4.g()
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return r4
        Le:
            java.lang.Object r0 = r4.e()
            gr1 r1 = defpackage.uy0.a
            if (r0 != r1) goto L17
            return r1
        L17:
            vy0 r0 = (defpackage.vy0) r0
            p96 r0 = (defpackage.p96) r0
            if (r0 == 0) goto L1f
        L1d:
            r4 = r0
            goto L0
        L1f:
            long r0 = r4.X
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.o(r0, r4)
            p96 r0 = (defpackage.p96) r0
            boolean r1 = r4.j(r0)
            if (r1 == 0) goto L0
            boolean r1 = r4.g()
            if (r1 == 0) goto L1d
            r4.i()
            goto L1d
    }
}
