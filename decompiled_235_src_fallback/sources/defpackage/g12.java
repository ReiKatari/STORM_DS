package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g12  reason: default package */
/* loaded from: classes.dex */
public final class g12 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.sz1 Y;
    public final /* synthetic */ defpackage.pq5 Z;

    public /* synthetic */ g12(defpackage.sz1 r1, defpackage.pq5 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L20;
                case 1: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            g12 r2 = (defpackage.g12) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            g12 r2 = (defpackage.g12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L20:
            r41 r2 = r2.q(r4, r3)
            g12 r2 = (defpackage.g12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            pq5 r0 = r2.Z
            sz1 r2 = r2.Y
            switch(r4) {
                case 0: goto L17;
                case 1: goto L10;
                default: goto L9;
            }
        L9:
            g12 r4 = new g12
            r1 = 2
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            g12 r4 = new g12
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L17:
            g12 r4 = new g12
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            r1 = 1
            r2 = 0
            pq5 r3 = r10.Z
            sz1 r10 = r10.Y
            switch(r0) {
                case 0: goto L32;
                case 1: goto L26;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r11)
            zx1 r11 = new zx1
            r11.<init>(r2, r2)
            defpackage.sz1.T(r10, r11)
            o41 r11 = r10.z
            u12 r0 = new u12
            r0.<init>(r10, r3, r2, r1)
            r10 = 3
            defpackage.hv.L(r11, r2, r2, r0, r10)
            jg7 r10 = defpackage.jg7.a
            return r10
        L26:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r11)
            yb2 r10 = r10.s
            java.util.List r10 = r10.c(r3)
            return r10
        L32:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r11)
            yb2 r10 = r10.s
            r10.getClass()
            r3.getClass()
            zl1 r11 = r10.e(r3)
            if (r11 != 0) goto L47
        L45:
            r11 = r2
            goto L58
        L47:
            java.lang.String r0 = r10.a(r3)
            if (r0 != 0) goto L4e
            goto L45
        L4e:
            java.lang.String r4 = ".ml0"
            java.lang.String r0 = r0.concat(r4)
            zl1 r11 = r11.f(r0)
        L58:
            r0 = 0
            if (r11 == 0) goto L5d
            r6 = r1
            goto L5e
        L5d:
            r6 = r0
        L5e:
            if (r11 == 0) goto L69
            java.util.Date r2 = new java.util.Date
            long r4 = r11.m()
            r2.<init>(r4)
        L69:
            r7 = r2
            java.lang.String r8 = r10.d(r3, r0)
            c46 r4 = new c46
            r5 = 0
            r9 = 32
            r4.<init>(r5, r6, r7, r8, r9)
            b46 r10 = r10.c
            android.net.Uri r10 = r10.b(r3, r4)
            c46 r10 = defpackage.c46.a(r4, r10)
            return r10
    }
}
