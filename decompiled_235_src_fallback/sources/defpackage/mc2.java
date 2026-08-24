package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc2  reason: default package */
/* loaded from: classes.dex */
public final class mc2 extends defpackage.z64 implements defpackage.jm3 {
    public defpackage.wj1 k0;
    public float l0;

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r6, defpackage.x24 r7, long r8) {
            r5 = this;
            boolean r0 = defpackage.q21.d(r8)
            if (r0 == 0) goto L29
            wj1 r0 = r5.k0
            wj1 r1 = defpackage.wj1.Vertical
            if (r0 == r1) goto L29
            int r0 = defpackage.q21.h(r8)
            float r0 = (float) r0
            float r1 = r5.l0
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r1 = defpackage.q21.j(r8)
            int r2 = defpackage.q21.h(r8)
            if (r0 >= r1) goto L23
            r0 = r1
        L23:
            if (r0 <= r2) goto L26
            goto L27
        L26:
            r2 = r0
        L27:
            r0 = r2
            goto L31
        L29:
            int r2 = defpackage.q21.j(r8)
            int r0 = defpackage.q21.h(r8)
        L31:
            boolean r1 = defpackage.q21.c(r8)
            if (r1 == 0) goto L5a
            wj1 r1 = r5.k0
            wj1 r3 = defpackage.wj1.Horizontal
            if (r1 == r3) goto L5a
            int r1 = defpackage.q21.g(r8)
            float r1 = (float) r1
            float r5 = r5.l0
            float r1 = r1 * r5
            int r5 = java.lang.Math.round(r1)
            int r1 = defpackage.q21.i(r8)
            int r8 = defpackage.q21.g(r8)
            if (r5 >= r1) goto L54
            r5 = r1
        L54:
            if (r5 <= r8) goto L57
            goto L58
        L57:
            r8 = r5
        L58:
            r5 = r8
            goto L65
        L5a:
            int r5 = defpackage.q21.i(r8)
            int r8 = defpackage.q21.g(r8)
            r4 = r8
            r8 = r5
            r5 = r4
        L65:
            long r8 = defpackage.s21.a(r2, r0, r8, r5)
            dx4 r5 = r7.y(r8)
            int r7 = r5.A
            int r8 = r5.B
            jv r9 = new jv
            r0 = 3
            r9.<init>(r5, r0)
            zt1 r5 = defpackage.zt1.A
            f34 r5 = r6.K(r7, r8, r5, r9)
            return r5
    }
}
