package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q16  reason: default package */
/* loaded from: classes.dex */
public final class q16 extends defpackage.pm3 {
    public static final defpackage.q16 c = null;
    public final /* synthetic */ int b;

    static {
            q16 r0 = new q16
            java.lang.String r1 = "Undefined intrinsics block and it is required"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.q16.c = r0
            return
    }

    public /* synthetic */ q16(java.lang.String r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r8, java.util.List r9, long r10) {
            r7 = this;
            int r7 = r7.b
            switch(r7) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Undefined measure and it is required"
            r7.<init>(r8)
            throw r7
        Ld:
            int r7 = r9.size()
            zt1 r0 = defpackage.zt1.A
            if (r7 == 0) goto L7a
            r1 = 1
            r2 = 0
            if (r7 == r1) goto L59
            java.util.ArrayList r7 = new java.util.ArrayList
            int r1 = r9.size()
            r7.<init>(r1)
            int r1 = r9.size()
            r3 = r2
            r4 = r3
        L28:
            if (r2 >= r1) goto L46
            java.lang.Object r5 = r9.get(r2)
            x24 r5 = (defpackage.x24) r5
            dx4 r5 = r5.y(r10)
            int r6 = r5.A
            int r3 = java.lang.Math.max(r6, r3)
            int r6 = r5.B
            int r4 = java.lang.Math.max(r6, r4)
            r7.add(r5)
            int r2 = r2 + 1
            goto L28
        L46:
            int r9 = defpackage.s21.g(r3, r10)
            int r10 = defpackage.s21.f(r4, r10)
            kg r11 = new kg
            r1 = 3
            r11.<init>(r1, r7)
            f34 r7 = r8.K(r9, r10, r0, r11)
            goto L88
        L59:
            java.lang.Object r7 = r9.get(r2)
            x24 r7 = (defpackage.x24) r7
            dx4 r7 = r7.y(r10)
            int r9 = r7.A
            int r9 = defpackage.s21.g(r9, r10)
            int r1 = r7.B
            int r10 = defpackage.s21.f(r1, r10)
            he r11 = new he
            r1 = 6
            r11.<init>(r7, r1)
            f34 r7 = r8.K(r9, r10, r0, r11)
            goto L88
        L7a:
            int r7 = defpackage.q21.j(r10)
            int r9 = defpackage.q21.i(r10)
            hh2 r10 = defpackage.hh2.p0
            f34 r7 = r8.K(r7, r9, r0, r10)
        L88:
            return r7
    }
}
