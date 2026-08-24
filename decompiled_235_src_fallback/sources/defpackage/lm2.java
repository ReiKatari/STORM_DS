package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm2  reason: default package */
/* loaded from: classes.dex */
public final class lm2 implements java.lang.AutoCloseable, defpackage.jk5 {
    public final defpackage.jr6 A;
    public final defpackage.km2 B;
    public final defpackage.fp4 L;
    public final java.util.LinkedHashMap R;
    public final java.util.Set X;
    public final defpackage.e41 Y;

    public lm2(defpackage.jr6 r5, defpackage.km2 r6) {
            r4 = this;
            r4.<init>()
            r4.A = r5
            r4.B = r6
            fp4 r6 = new fp4
            ip4 r0 = defpackage.ip4.b
            r6.<init>(r0)
            r4.L = r6
            p04 r6 = r5.X
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r6.e0
            int r1 = defpackage.c14.k0(r1)
            r0.<init>(r1)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            r2 = 0
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L57
            java.lang.Object r4 = r6.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r4.getKey()
            java.lang.Object r6 = r4.getKey()
            kr6 r6 = (defpackage.kr6) r6
            int r6 = r6.a
            java.lang.Object r4 = r4.getValue()
            t23 r4 = (defpackage.t23) r4
            ki0 r4 = r5.e(r6)
            if (r4 != 0) goto L4f
            defpackage.i.m(r3)
            throw r2
        L4f:
            ji0 r4 = r5.h(r6)
            r4.getClass()
            throw r2
        L57:
            r4.R = r0
            java.util.Set r5 = r0.keySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L6e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r5.next()
            kr6 r0 = (defpackage.kr6) r0
            int r0 = r0.a
            jr6 r1 = r4.A
            ki0 r0 = r1.e(r0)
            if (r0 == 0) goto L88
            r6.add(r0)
            goto L6e
        L88:
            defpackage.i.m(r3)
            throw r2
        L8c:
            java.util.Set r5 = defpackage.gt0.p1(r6)
            r4.X = r5
            e41 r5 = new e41
            r5.<init>()
            r4.Y = r5
            return
    }

    @Override // defpackage.jk5
    public final void F(defpackage.yk5 r3, long r4, defpackage.wk5 r6) {
            r2 = this;
            mp4 r0 = new mp4
            r1 = 10
            r0.<init>(r1)
            fp4 r1 = r2.L
            r1.h(r4, r0)
            boolean r6 = r6.r()
            if (r6 != 0) goto L54
            java.util.Map r3 = r3.x()
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r3.next()
            kr6 r6 = (defpackage.kr6) r6
            int r6 = r6.a
            kr6 r0 = new kr6
            r0.<init>(r6)
            java.util.LinkedHashMap r6 = r2.R
            java.lang.Object r6 = r6.get(r0)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L3c
            goto L1e
        L3c:
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L44:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r6.next()
            fp4 r0 = (defpackage.fp4) r0
            r0.e(r4)
            goto L44
        L54:
            return
    }

    @Override // defpackage.jk5
    public final void J(defpackage.yk5 r1, long r2, defpackage.th r4) {
            r0 = this;
            fp4 r0 = r0.L
            r0.h(r2, r4)
            return
    }

    @Override // defpackage.jk5
    public final void N(defpackage.kk5 r1) {
            r0 = this;
            r1.getClass()
            km2 r0 = r0.B
            r0.e(r1)
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            km2 r0 = r2.B
            r0.close()
            fp4 r0 = r2.L
            r0.close()
            java.util.LinkedHashMap r2 = r2.R
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r2.next()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            fp4 r1 = (defpackage.fp4) r1
            r1.close()
            goto L28
        L38:
            return
    }

    @Override // defpackage.jk5
    public final void e(defpackage.yk5 r2, long r3, int r5, int r6) {
            r1 = this;
            kr6 r2 = new kr6
            r2.<init>(r5)
            java.util.LinkedHashMap r0 = r1.R
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L10
            goto L3b
        L10:
            jr6 r1 = r1.A
            ji0 r1 = r1.h(r5)
            if (r1 == 0) goto L42
            gp4 r1 = new gp4
            r1.<init>(r6)
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L3c
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            fp4 r2 = (defpackage.fp4) r2
            r2.e(r3)
            goto L2b
        L3b:
            return
        L3c:
            java.lang.String r1 = "Check failed."
            defpackage.i.m(r1)
            return
        L42:
            java.lang.String r1 = "Required value was null."
            defpackage.i.m(r1)
            return
    }

    @Override // defpackage.jk5
    public final void u(defpackage.yk5 r11, long r12, long r14) {
            r10 = this;
            r11.getClass()
            tm2 r0 = new tm2
            java.util.Set r6 = r10.X
            r1 = r11
            r2 = r12
            r4 = r14
            r0.<init>(r1, r2, r4, r6)
            r5 = r4
            r3 = r2
            fp4 r2 = r10.L
            pm2 r9 = r0.d
            r7 = r3
            r2.k(r3, r5, r7, r9)
            kw3 r11 = r0.e
            int r12 = r11.a()
            r13 = 0
        L1e:
            if (r13 >= r12) goto L73
            java.lang.Object r14 = r11.get(r13)
            r9 = r14
            qm2 r9 = (defpackage.qm2) r9
            int r14 = r9.c
            kr6 r15 = new kr6
            r15.<init>(r14)
            java.util.LinkedHashMap r14 = r10.R
            java.lang.Object r14 = r14.get(r15)
            java.lang.String r15 = "Required value was null."
            if (r14 == 0) goto L6f
            java.util.Map r14 = (java.util.Map) r14
            int r2 = r9.d
            gp4 r7 = new gp4
            r7.<init>(r2)
            java.lang.Object r14 = r14.get(r7)
            if (r14 == 0) goto L6b
            r2 = r14
            fp4 r2 = (defpackage.fp4) r2
            r7 = r5
            r2.k(r3, r5, r7, r9)
            java.util.Map r14 = r1.x()
            java.util.Set r14 = r14.keySet()
            int r15 = r9.c
            kr6 r7 = new kr6
            r7.<init>(r15)
            boolean r14 = r14.contains(r7)
            if (r14 != 0) goto L68
            long r14 = r0.a
            r2.e(r14)
        L68:
            int r13 = r13 + 1
            goto L1e
        L6b:
            defpackage.i.m(r15)
            return
        L6f:
            defpackage.i.m(r15)
            return
        L73:
            mm2 r11 = new mm2
            r11.<init>(r0)
            e41 r12 = r10.Y
            r12.getClass()
            boolean r12 = r1.J()
            if (r12 != 0) goto L8c
            km2 r10 = r10.B
            kk5 r12 = r1.c0()
            r10.e(r12)
        L8c:
            r11.e()
            return
    }
}
