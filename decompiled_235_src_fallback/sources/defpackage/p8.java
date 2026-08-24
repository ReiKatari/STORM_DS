package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p8  reason: default package */
/* loaded from: classes.dex */
public final class p8 extends defpackage.zg6 {
    public defpackage.cf6 a;
    public final defpackage.vs4 b;

    public p8(defpackage.cf6 r1, defpackage.of5 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            vs4 r1 = defpackage.np2.Y(r2)
            r0.b = r1
            return
    }

    @Override // defpackage.zg6
    public final defpackage.zg6 a(defpackage.gf6 r10, defpackage.cf6 r11, long r12, long r14, long r16) {
            r9 = this;
            eb r0 = new eb
            long r3 = defpackage.jk4.e(r14, r16)
            r1 = r12
            r5 = r16
            r0.<init>(r1, r3, r5)
            of5 r3 = r9.c()
            if (r3 != 0) goto L4a
            cf6 r9 = r9.a
            if (r9 != 0) goto L40
            java.util.List r9 = r10.b()
            int r3 = r9.size()
            r4 = 0
        L1f:
            r5 = 0
            if (r4 >= r3) goto L37
            java.lang.Object r6 = r9.get(r4)
            r7 = r6
            if6 r7 = (defpackage.if6) r7
            java.util.List r8 = r10.c()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L34
            goto L38
        L34:
            int r4 = r4 + 1
            goto L1f
        L37:
            r6 = r5
        L38:
            if6 r6 = (defpackage.if6) r6
            if (r6 == 0) goto L3f
            cf6 r9 = r6.h0
            goto L40
        L3f:
            r9 = r5
        L40:
            of5 r3 = defpackage.kn2.o(r10, r9)
            if (r3 != 0) goto L4a
            of5 r3 = defpackage.kj2.b(r14, r12)
        L4a:
            r9 = r3
            r7 = 1
            r1 = r12
            r3 = r14
            r5 = r16
            defpackage.kn2.q(r0, r1, r3, r5, r7)
            o8 r10 = new o8
            r10.<init>(r0, r11, r9)
            return r10
    }

    @Override // defpackage.zg6
    public final boolean b() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.zg6
    public final defpackage.of5 c() {
            r0 = this;
            vs4 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            of5 r0 = (defpackage.of5) r0
            return r0
    }

    @Override // defpackage.zg6
    public final defpackage.eb e() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.zg6
    public final defpackage.of5 f(defpackage.gf6 r8) {
            r7 = this;
            of5 r0 = r7.c()
            if (r0 == 0) goto L7
            return r0
        L7:
            of5 r0 = r7.c()
            if (r0 != 0) goto L46
            cf6 r0 = r7.a
            if (r0 != 0) goto L3b
            java.util.List r0 = r8.b()
            int r1 = r0.size()
            r2 = 0
        L1a:
            r3 = 0
            if (r2 >= r1) goto L32
            java.lang.Object r4 = r0.get(r2)
            r5 = r4
            if6 r5 = (defpackage.if6) r5
            java.util.List r6 = r8.c()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L2f
            goto L33
        L2f:
            int r2 = r2 + 1
            goto L1a
        L32:
            r4 = r3
        L33:
            if6 r4 = (defpackage.if6) r4
            if (r4 == 0) goto L3a
            cf6 r0 = r4.h0
            goto L3b
        L3a:
            r0 = r3
        L3b:
            of5 r8 = defpackage.kn2.o(r8, r0)
            if (r8 == 0) goto L46
            vs4 r0 = r7.b
            r0.setValue(r8)
        L46:
            of5 r7 = r7.c()
            return r7
    }

    @Override // defpackage.zg6
    public final defpackage.zg6 g(defpackage.cf6 r2) {
            r1 = this;
            cf6 r0 = r1.a
            if (r0 != 0) goto L6
            r1.a = r2
        L6:
            return r1
    }

    @Override // defpackage.zg6
    public final defpackage.zg6 h() {
            r0 = this;
            rf4 r0 = defpackage.rf4.a
            return r0
    }

    @Override // defpackage.zg6
    public final void i(defpackage.of5 r1) {
            r0 = this;
            vs4 r0 = r0.b
            r0.setValue(r1)
            return
    }
}
