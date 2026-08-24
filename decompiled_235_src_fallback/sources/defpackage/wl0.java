package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl0  reason: default package */
/* loaded from: classes.dex */
public abstract class wl0 implements defpackage.ro2 {
    public final defpackage.l61 A;
    public final int B;
    public final defpackage.m80 L;

    public wl0(defpackage.l61 r1, int r2, defpackage.m80 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.le2
    public java.lang.Object b(defpackage.ne2 r4, defpackage.r41 r5) {
            r3 = this;
            b0 r0 = new b0
            r1 = 0
            r2 = 12
            r0.<init>(r4, r3, r1, r2)
            java.lang.Object r3 = defpackage.g04.C(r0, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L11
            return r3
        L11:
            jg7 r3 = defpackage.jg7.a
            return r3
    }

    @Override // defpackage.ro2
    public final defpackage.le2 c(defpackage.l61 r5, int r6, defpackage.m80 r7) {
            r4 = this;
            l61 r0 = r4.A
            l61 r5 = r5.N(r0)
            m80 r1 = defpackage.m80.SUSPEND
            m80 r2 = r4.L
            int r3 = r4.B
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            wl0 r4 = r4.f(r5, r6, r7)
            return r4
    }

    public java.lang.String d() {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract java.lang.Object e(defpackage.r35 r1, defpackage.r41 r2);

    public abstract defpackage.wl0 f(defpackage.l61 r1, int r2, defpackage.m80 r3);

    public defpackage.le2 g() {
            r0 = this;
            r0 = 0
            return r0
    }

    public defpackage.ul0 i(defpackage.w61 r7) {
            r6 = this;
            r0 = -3
            int r1 = r6.B
            if (r1 != r0) goto L6
            r1 = -2
        L6:
            a71 r0 = defpackage.a71.ATOMIC
            z r2 = new z
            r3 = 13
            r4 = 0
            r2.<init>(r6, r4, r3)
            r3 = 4
            m80 r5 = r6.L
            v80 r1 = defpackage.nb3.c(r1, r5, r4, r3)
            l61 r6 = r6.A
            l61 r6 = defpackage.mb3.M(r7, r6)
            r35 r7 = new r35
            r7.<init>(r6, r1)
            r0.invoke(r2, r7, r7)
            return r7
    }

    public java.lang.String toString() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = r7.d()
            if (r1 == 0) goto Lf
            r0.add(r1)
        Lf:
            vt1 r1 = defpackage.vt1.A
            l61 r2 = r7.A
            if (r2 == r1) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "context="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L26:
            r1 = -3
            int r2 = r7.B
            if (r2 == r1) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "capacity="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L3c:
            m80 r1 = defpackage.m80.SUSPEND
            m80 r2 = r7.L
            if (r2 == r1) goto L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "onBufferOverflow="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r6.append(r7)
            r7 = 91
            r6.append(r7)
            r4 = 0
            r5 = 62
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            java.lang.String r7 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            r0 = 93
            java.lang.String r7 = defpackage.lb1.q(r6, r7, r0)
            return r7
    }
}
