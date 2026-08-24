package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w6  reason: default package */
/* loaded from: classes.dex */
public final class w6 {
    public final defpackage.mm6 a;
    public final java.util.LinkedHashSet b;
    public long c;

    public w6() {
            r1 = this;
            r1.<init>()
            mm6 r0 = new mm6
            r0.<init>()
            r1.a = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.b = r0
            return
    }

    public final void a(defpackage.o75 r10, defpackage.n3 r11) {
            r9 = this;
            s6 r0 = new s6
            r1 = 1
            r0.<init>(r10, r11, r1)
            mm6 r2 = r9.a
            defpackage.gt0.W0(r2, r0)
            bt r6 = new bt
            u6 r0 = new u6
            r0.<init>(r9, r10, r11, r1)
            r6.<init>(r0)
            m3 r3 = new m3
            long r7 = r9.f()
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7)
            r9 = 0
            r2.add(r9, r3)
            return
    }

    public final void b(defpackage.o3 r13, defpackage.n3 r14) {
            r12 = this;
            p6 r0 = new p6
            r1 = 0
            r0.<init>(r13, r14, r1)
            mm6 r2 = r12.a
            defpackage.gt0.W0(r2, r0)
            bt r9 = new bt
            u6 r0 = new u6
            r0.<init>(r12, r13, r14, r1)
            r9.<init>(r0)
            p3 r3 = new p3
            ls3 r4 = r13.a
            ta5 r5 = r13.b
            java.net.URL r6 = r13.c
            java.lang.String r7 = r13.d
            long r10 = r12.f()
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.add(r1, r3)
            return
    }

    public final void c(defpackage.o95 r9) {
            r8 = this;
            bt r5 = new bt
            q6 r0 = new q6
            r1 = 2
            r0.<init>(r1, r8, r9)
            r5.<init>(r0)
            l3 r0 = new l3
            o75 r1 = r9.a
            int r2 = r9.b
            int r3 = r9.c
            java.lang.String r4 = r9.d
            long r6 = r8.f()
            r0.<init>(r1, r2, r3, r4, r5, r6)
            mm6 r8 = r8.a
            r9 = 0
            r8.add(r9, r0)
            return
    }

    public final void d(int r8, defpackage.nb3 r9, boolean r10) {
            r7 = this;
            mm6 r7 = r7.a
            java.lang.Object r0 = r7.get(r8)
            r0.getClass()
            u3 r0 = (defpackage.u3) r0
            bt r4 = r0.c
            long r5 = r0.d
            u3 r1 = new u3
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5)
            java.lang.Object r9 = r4.L
            ta4 r9 = (defpackage.ta4) r9
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            vs4 r9 = r9.c
            r9.setValue(r10)
            r7.set(r8, r1)
            return
    }

    public final void e(int r11, defpackage.o95 r12) {
            r10 = this;
            mm6 r0 = r10.a
            java.lang.Object r1 = r0.get(r11)
            r1.getClass()
            l3 r1 = (defpackage.l3) r1
            bt r7 = r1.e
            o75 r2 = r1.a
            long r2 = r2.a
            r4 = r2
            o75 r3 = r12.a
            long r8 = r3.a
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            int r4 = r12.b
            if (r2 != 0) goto L2b
            int r5 = r12.c
            java.lang.String r6 = r12.d
            long r8 = r1.f
            l3 r2 = new l3
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.set(r11, r2)
            return
        L2b:
            float r11 = (float) r4
            int r0 = r12.c
            float r0 = (float) r0
            float r11 = r11 / r0
            int r0 = r1.b
            float r0 = (float) r0
            int r1 = r1.c
            float r1 = (float) r1
            float r0 = r0 / r1
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L41
            r7.E()
            r10.c(r12)
        L41:
            return
    }

    public final long f() {
            r4 = this;
            long r0 = r4.c
            r2 = 1
            long r2 = r2 + r0
            r4.c = r2
            return r0
    }
}
