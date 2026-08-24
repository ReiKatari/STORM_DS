package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js7  reason: default package */
/* loaded from: classes.dex */
public abstract class js7 {
    public static final void a(float r4, int r5, defpackage.px0 r6, defpackage.a74 r7) {
            xq2 r6 = (defpackage.xq2) r6
            r0 = 1333734539(0x4f7f2c8b, float:4.2811092E9)
            r6.d0(r0)
            r0 = r5 | 6
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = 0
        L14:
            r0 = r0 & r3
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L41
            r7 = 1099956224(0x41900000, float:18.0)
            float r7 = r7 * r4
            r0 = 1103101952(0x41c00000, float:24.0)
            float r7 = r7 / r0
            x64 r0 = defpackage.x64.a
            a74 r7 = defpackage.dj6.j(r0, r7, r4)
            java.lang.Object r1 = r6.P()
            vs0 r2 = defpackage.ox0.a
            if (r1 != r2) goto L38
            rk7 r1 = new rk7
            r2 = 5
            r1.<init>(r2)
            r6.l0(r1)
        L38:
            qn2 r1 = (defpackage.qn2) r1
            r2 = 48
            defpackage.ak7.j(r7, r1, r6, r2)
            r7 = r0
            goto L44
        L41:
            r6.V()
        L44:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L51
            fq1 r0 = new fq1
            r0.<init>(r7, r4, r5, r3)
            r6.d = r0
        L51:
            return
    }

    public static final defpackage.wb6 b(defpackage.wb6 r2, defpackage.jd1 r3) {
            r2.getClass()
            r3.getClass()
            np2 r0 = r2.e()
            ac6 r1 = defpackage.ac6.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L16
            defpackage.n16.x(r2)
            return r2
        L16:
            boolean r0 = r2.h()
            if (r0 == 0) goto L25
            r0 = 0
            wb6 r2 = r2.j(r0)
            wb6 r2 = b(r2, r3)
        L25:
            return r2
    }

    public static final defpackage.by7 c(defpackage.id3 r2, defpackage.wb6 r3) {
            r3.getClass()
            np2 r0 = r3.e()
            boolean r1 = r0 instanceof defpackage.dz4
            if (r1 == 0) goto Le
            by7 r2 = defpackage.by7.POLY_OBJ
            return r2
        Le:
            bt6 r1 = defpackage.bt6.f
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L19
            by7 r2 = defpackage.by7.LIST
            return r2
        L19:
            bt6 r1 = defpackage.bt6.g
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L45
            r0 = 0
            wb6 r3 = r3.j(r0)
            jd1 r2 = r2.b
            wb6 r2 = b(r3, r2)
            np2 r3 = r2.e()
            boolean r0 = r3 instanceof defpackage.v25
            if (r0 != 0) goto L42
            bc6 r0 = defpackage.bc6.e
            boolean r3 = defpackage.nb3.k(r3, r0)
            if (r3 == 0) goto L3d
            goto L42
        L3d:
            le3 r2 = defpackage.hi2.b(r2)
            throw r2
        L42:
            by7 r2 = defpackage.by7.MAP
            return r2
        L45:
            by7 r2 = defpackage.by7.OBJ
            return r2
    }
}
