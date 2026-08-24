package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h  reason: default package */
/* loaded from: classes.dex */
public abstract class h {
    public static final defpackage.we1 a = null;

    static {
            we1 r0 = new we1
            xe1 r1 = defpackage.xk1.a
            jv2 r1 = defpackage.e04.a
            jv2 r1 = r1.Y
            de1 r2 = defpackage.de1.L
            n05 r6 = defpackage.n05.AUTOMATIC
            android.graphics.Bitmap$Config r7 = defpackage.k.b
            r9 = 0
            ra0 r13 = defpackage.ra0.ENABLED
            pg4 r5 = defpackage.x97.a
            r8 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r2
            r4 = r2
            r14 = r13
            r15 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            defpackage.h.a = r0
            return
    }

    public static final boolean a(defpackage.z23 r4) {
            n05 r0 = r4.g
            int[] r1 = defpackage.g.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L26
            r3 = 2
            if (r0 == r3) goto L25
            r3 = 3
            if (r0 != r3) goto L21
            rg1 r0 = r4.A
            fj6 r0 = r0.a
            if (r0 != 0) goto L26
            fj6 r4 = r4.x
            boolean r4 = r4 instanceof defpackage.dl1
            if (r4 == 0) goto L26
            goto L25
        L21:
            defpackage.i.d()
            return r1
        L25:
            return r2
        L26:
            return r1
    }
}
