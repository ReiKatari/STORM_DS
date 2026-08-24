package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b03  reason: default package */
/* loaded from: classes.dex */
public final class b03 extends defpackage.c03 {
    public final defpackage.ib0 d;
    public final boolean e;

    public b03(defpackage.vk5 r1, defpackage.xk4 r2, defpackage.b51 r3, defpackage.ib0 r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // defpackage.c03
    public final java.lang.Object a(defpackage.vk4 r2, java.lang.Object[] r3) {
            r1 = this;
            ib0 r0 = r1.d
            java.lang.Object r2 = r0.b(r2)
            gb0 r2 = (defpackage.gb0) r2
            int r0 = r3.length
            int r0 = r0 + (-1)
            r3 = r3[r0]
            r41 r3 = (defpackage.r41) r3
            boolean r1 = r1.e     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L2a
            if (r1 == 0) goto L1f
            r2.getClass()     // Catch: java.lang.ThreadDeath -> L1d java.lang.Throwable -> L24 java.lang.Throwable -> L2a
            java.lang.Object r1 = defpackage.np2.o(r2, r3)     // Catch: java.lang.ThreadDeath -> L1d java.lang.Throwable -> L24 java.lang.Throwable -> L2a
            return r1
        L1b:
            r1 = move-exception
            goto L2b
        L1d:
            r1 = move-exception
            goto L2b
        L1f:
            java.lang.Object r1 = defpackage.np2.n(r2, r3)     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L2a
            return r1
        L24:
            r1 = move-exception
            x61 r1 = defpackage.np2.h0(r1, r3)
            return r1
        L2a:
            r1 = move-exception
        L2b:
            throw r1
    }
}
