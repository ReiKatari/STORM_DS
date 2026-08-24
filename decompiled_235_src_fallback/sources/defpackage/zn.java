package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn  reason: default package */
/* loaded from: classes.dex */
public final class zn implements defpackage.e34 {
    public final defpackage.ko a;
    public boolean b;

    public zn(defpackage.ko r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e34
    public final int a(defpackage.eb3 r3, java.util.List r4, int r5) {
            r2 = this;
            boolean r2 = r4.isEmpty()
            r3 = 0
            if (r2 == 0) goto L8
            return r3
        L8:
            java.lang.Object r2 = r4.get(r3)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.u(r5)
            int r3 = r4.size()
            r0 = 1
            int r3 = r3 - r0
            if (r0 > r3) goto L2c
        L1a:
            java.lang.Object r1 = r4.get(r0)
            x24 r1 = (defpackage.x24) r1
            int r1 = r1.u(r5)
            if (r1 <= r2) goto L27
            r2 = r1
        L27:
            if (r0 == r3) goto L2c
            int r0 = r0 + 1
            goto L1a
        L2c:
            return r2
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r8, java.util.List r9, long r10) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            int r1 = r9.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L10:
            if (r2 >= r1) goto L2e
            java.lang.Object r5 = r9.get(r2)
            x24 r5 = (defpackage.x24) r5
            dx4 r5 = r5.y(r10)
            int r6 = r5.A
            int r3 = java.lang.Math.max(r3, r6)
            int r6 = r5.B
            int r4 = java.lang.Math.max(r4, r6)
            r0.add(r5)
            int r2 = r2 + 1
            goto L10
        L2e:
            boolean r9 = r8.a0()
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 32
            ko r2 = r7.a
            if (r9 == 0) goto L52
            r9 = 1
            r7.b = r9
            vs4 r7 = r2.b
            long r5 = (long) r3
            long r1 = r5 << r1
            long r5 = (long) r4
            long r9 = r5 & r10
            long r9 = r9 | r1
            q93 r11 = new q93
            r11.<init>(r9)
            r7.setValue(r11)
            goto L67
        L52:
            boolean r7 = r7.b
            if (r7 != 0) goto L67
            vs4 r7 = r2.b
            long r5 = (long) r3
            long r1 = r5 << r1
            long r5 = (long) r4
            long r9 = r5 & r10
            long r9 = r9 | r1
            q93 r11 = new q93
            r11.<init>(r9)
            r7.setValue(r11)
        L67:
            kg r7 = new kg
            r9 = 2
            r7.<init>(r9, r0)
            zt1 r9 = defpackage.zt1.A
            f34 r7 = r8.K(r3, r4, r9, r7)
            return r7
    }

    @Override // defpackage.e34
    public final int e(defpackage.eb3 r3, java.util.List r4, int r5) {
            r2 = this;
            boolean r2 = r4.isEmpty()
            r3 = 0
            if (r2 == 0) goto L8
            return r3
        L8:
            java.lang.Object r2 = r4.get(r3)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.n(r5)
            int r3 = r4.size()
            r0 = 1
            int r3 = r3 - r0
            if (r0 > r3) goto L2c
        L1a:
            java.lang.Object r1 = r4.get(r0)
            x24 r1 = (defpackage.x24) r1
            int r1 = r1.n(r5)
            if (r1 <= r2) goto L27
            r2 = r1
        L27:
            if (r0 == r3) goto L2c
            int r0 = r0 + 1
            goto L1a
        L2c:
            return r2
    }

    @Override // defpackage.e34
    public final int g(defpackage.eb3 r3, java.util.List r4, int r5) {
            r2 = this;
            boolean r2 = r4.isEmpty()
            r3 = 0
            if (r2 == 0) goto L8
            return r3
        L8:
            java.lang.Object r2 = r4.get(r3)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.c(r5)
            int r3 = r4.size()
            r0 = 1
            int r3 = r3 - r0
            if (r0 > r3) goto L2c
        L1a:
            java.lang.Object r1 = r4.get(r0)
            x24 r1 = (defpackage.x24) r1
            int r1 = r1.c(r5)
            if (r1 <= r2) goto L27
            r2 = r1
        L27:
            if (r0 == r3) goto L2c
            int r0 = r0 + 1
            goto L1a
        L2c:
            return r2
    }

    @Override // defpackage.e34
    public final int i(defpackage.eb3 r3, java.util.List r4, int r5) {
            r2 = this;
            boolean r2 = r4.isEmpty()
            r3 = 0
            if (r2 == 0) goto L8
            return r3
        L8:
            java.lang.Object r2 = r4.get(r3)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.V(r5)
            int r3 = r4.size()
            r0 = 1
            int r3 = r3 - r0
            if (r0 > r3) goto L2c
        L1a:
            java.lang.Object r1 = r4.get(r0)
            x24 r1 = (defpackage.x24) r1
            int r1 = r1.V(r5)
            if (r1 <= r2) goto L27
            r2 = r1
        L27:
            if (r0 == r3) goto L2c
            int r0 = r0 + 1
            goto L1a
        L2c:
            return r2
    }
}
