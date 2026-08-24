package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy4  reason: default package */
/* loaded from: classes.dex */
public abstract class fy4 {
    public static final defpackage.nq6 a = null;

    static {
            iy0 r0 = defpackage.iy0.m0
            nq6 r1 = new nq6
            r1.<init>(r0)
            defpackage.fy4.a = r1
            return
    }

    public static final defpackage.x61 a(defpackage.et3 r5, defpackage.l5 r6, defpackage.s41 r7) {
            boolean r0 = r7 instanceof defpackage.dy4
            if (r0 == 0) goto L13
            r0 = r7
            dy4 r0 = (defpackage.dy4) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            dy4 r0 = new dy4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2a:
            defpackage.oi2.Y(r7)
            goto L57
        L2e:
            defpackage.oi2.Y(r7)
            z64 r7 = r5.A
            boolean r7 = r7.j0
            if (r7 == 0) goto L5f
            zp4 r7 = defpackage.nc1.g0(r5)
            sm3 r5 = defpackage.nc1.f0(r5)
            hy0 r5 = r5.x0
            xv4 r5 = (defpackage.xv4) r5
            r5.getClass()
            nq6 r2 = defpackage.fy4.a
            java.lang.Object r5 = defpackage.q60.U(r5, r2)
            if (r5 != 0) goto L5b
            r0.X = r4
            x61 r5 = b(r7, r6, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            defpackage.e41.c()
            return r3
        L5b:
            defpackage.u34.a()
            return r3
        L5f:
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            defpackage.i.h(r5)
            return r3
    }

    public static final defpackage.x61 b(defpackage.zp4 r5, defpackage.eo2 r6, defpackage.s41 r7) {
            boolean r0 = r7 instanceof defpackage.ey4
            if (r0 == 0) goto L13
            r0 = r7
            ey4 r0 = (defpackage.ey4) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ey4 r0 = new ey4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            r5 = 2
            if (r2 == r5) goto L2d
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2d:
            defpackage.oi2.Y(r7)
            defpackage.e41.c()
            return r3
        L34:
            defpackage.oi2.Y(r7)
            goto L46
        L38:
            defpackage.oi2.Y(r7)
            r0.X = r4
            te r5 = (defpackage.te) r5
            x61 r5 = r5.G(r6, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            defpackage.e41.c()
            return r3
    }
}
