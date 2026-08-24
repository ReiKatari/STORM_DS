package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vx7  reason: default package */
/* loaded from: classes.dex */
public final class vx7 extends defpackage.z64 implements defpackage.jm3 {
    public defpackage.wj1 k0;
    public defpackage.eo2 l0;

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r9, defpackage.x24 r10, long r11) {
            r8 = this;
            wj1 r0 = r8.k0
            wj1 r1 = defpackage.wj1.Vertical
            r2 = 0
            if (r0 == r1) goto L9
            r0 = r2
            goto Ld
        L9:
            int r0 = defpackage.q21.j(r11)
        Ld:
            wj1 r1 = r8.k0
            wj1 r3 = defpackage.wj1.Horizontal
            if (r1 == r3) goto L14
            goto L18
        L14:
            int r2 = defpackage.q21.i(r11)
        L18:
            int r1 = defpackage.q21.h(r11)
            int r3 = defpackage.q21.g(r11)
            long r0 = defpackage.s21.a(r0, r1, r2, r3)
            dx4 r5 = r10.y(r0)
            int r10 = r5.A
            int r0 = defpackage.q21.j(r11)
            int r1 = defpackage.q21.h(r11)
            int r4 = defpackage.gi2.q(r10, r0, r1)
            int r10 = r5.B
            int r0 = defpackage.q21.i(r11)
            int r11 = defpackage.q21.g(r11)
            int r6 = defpackage.gi2.q(r10, r0, r11)
            ux7 r2 = new ux7
            r3 = r8
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            zt1 r8 = defpackage.zt1.A
            f34 r8 = r7.K(r4, r6, r8, r2)
            return r8
    }
}
