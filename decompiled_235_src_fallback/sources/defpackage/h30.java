package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h30  reason: default package */
/* loaded from: classes.dex */
public final class h30 implements defpackage.u07 {
    public final defpackage.zv0 a;
    public final defpackage.db4 b;
    public final defpackage.vs4 c;

    public h30(defpackage.zv0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            db4 r1 = new db4
            r1.<init>()
            r0.b = r1
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.c = r1
            return
    }

    @Override // defpackage.u07
    public final java.lang.Object a(defpackage.m07 r4, defpackage.hw6 r5) {
            r3 = this;
            g30 r0 = new g30
            r0.<init>(r4)
            yc r4 = new yc
            r1 = 0
            r2 = 2
            r4.<init>(r3, r0, r1, r2)
            db4 r3 = r3.b
            java.lang.Object r3 = defpackage.db4.b(r3, r4, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L17
            return r3
        L17:
            jg7 r3 = defpackage.jg7.a
            return r3
    }

    public final void b(defpackage.on2 r8, defpackage.px0 r9, int r10) {
            r7 = this;
            r4 = r9
            xq2 r4 = (defpackage.xq2) r4
            r9 = 723898654(0x2b25d11e, float:5.8909984E-13)
            r4.d0(r9)
            boolean r9 = r4.f(r7)
            if (r9 == 0) goto L12
            r9 = 32
            goto L14
        L12:
            r9 = 16
        L14:
            r9 = r9 | r10
            r0 = r9 & 19
            r1 = 18
            r2 = 0
            r6 = 1
            if (r0 == r1) goto L1f
            r0 = r6
            goto L20
        L1f:
            r0 = r2
        L20:
            r9 = r9 & r6
            boolean r9 = r4.S(r9, r0)
            if (r9 == 0) goto L4f
            vs4 r9 = r7.c
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            g30 r1 = (defpackage.g30) r1
            if (r1 != 0) goto L40
            cf5 r9 = r4.t()
            if (r9 == 0) goto L60
            f30 r0 = new f30
            r0.<init>(r7, r8, r10, r2)
            r9.d = r0
            return
        L40:
            m07 r2 = r1.a
            r9 = 384(0x180, float:5.38E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            zv0 r0 = r7.a
            r3 = r8
            r0.p(r1, r2, r3, r4, r5)
            goto L53
        L4f:
            r3 = r8
            r4.V()
        L53:
            cf5 r8 = r4.t()
            if (r8 == 0) goto L60
            f30 r9 = new f30
            r9.<init>(r7, r3, r10, r6)
            r8.d = r9
        L60:
            return
    }
}
