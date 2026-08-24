package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vm5  reason: default package */
/* loaded from: classes.dex */
public abstract class vm5 {
    public static java.lang.Object F(defpackage.vm5 r7, defpackage.ea5 r8, java.util.ArrayList r9, java.util.ArrayList r10, java.util.ArrayList r11, defpackage.s41 r12) {
            boolean r0 = r12 instanceof defpackage.sm5
            if (r0 == 0) goto L13
            r0 = r12
            sm5 r0 = (defpackage.sm5) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            sm5 r0 = new sm5
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.e0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.g0
            r3 = 0
            switch(r2) {
                case 0: goto L79;
                case 1: goto L6b;
                case 2: goto L5d;
                case 3: goto L4e;
                case 4: goto L41;
                case 5: goto L36;
                case 6: goto L2d;
                case 7: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r3
        L28:
            defpackage.oi2.Y(r12)
            goto L11c
        L2d:
            ea5 r7 = r0.X
            vm5 r8 = r0.R
            defpackage.oi2.Y(r12)
            goto L108
        L36:
            java.util.List r7 = r0.d0
            ea5 r8 = r0.X
            vm5 r9 = r0.R
            defpackage.oi2.Y(r12)
            goto Lf2
        L41:
            java.util.List r7 = r0.d0
            java.util.List r8 = r0.Z
            ea5 r9 = r0.X
            vm5 r10 = r0.R
            defpackage.oi2.Y(r12)
            goto Ldc
        L4e:
            java.util.List r7 = r0.d0
            java.util.List r8 = r0.Z
            java.util.List r9 = r0.Y
            ea5 r10 = r0.X
            vm5 r11 = r0.R
            defpackage.oi2.Y(r12)
            goto Lc6
        L5d:
            java.util.List r7 = r0.d0
            java.util.List r8 = r0.Z
            java.util.List r9 = r0.Y
            ea5 r10 = r0.X
            vm5 r11 = r0.R
            defpackage.oi2.Y(r12)
            goto Lb0
        L6b:
            java.util.List r11 = r0.d0
            java.util.List r10 = r0.Z
            java.util.List r9 = r0.Y
            ea5 r8 = r0.X
            vm5 r7 = r0.R
            defpackage.oi2.Y(r12)
            goto L93
        L79:
            defpackage.oi2.Y(r12)
            long r4 = r8.a
            r0.R = r7
            r0.X = r8
            r0.Y = r9
            r0.Z = r10
            r0.d0 = r11
            r12 = 1
            r0.g0 = r12
            java.lang.Object r12 = r7.h(r4, r0)
            if (r12 != r1) goto L93
            goto L11b
        L93:
            long r4 = r8.a
            r0.R = r7
            r0.X = r8
            r0.Y = r9
            r0.Z = r10
            r0.d0 = r11
            r12 = 2
            r0.g0 = r12
            java.lang.Object r12 = r7.j(r4, r0)
            if (r12 != r1) goto Laa
            goto L11b
        Laa:
            r6 = r11
            r11 = r7
            r7 = r6
            r6 = r10
            r10 = r8
            r8 = r6
        Lb0:
            long r4 = r10.a
            r0.R = r11
            r0.X = r10
            r0.Y = r9
            r0.Z = r8
            r0.d0 = r7
            r12 = 3
            r0.g0 = r12
            java.lang.Object r12 = r11.k(r4, r0)
            if (r12 != r1) goto Lc6
            goto L11b
        Lc6:
            r0.R = r11
            r0.X = r10
            r0.Y = r3
            r0.Z = r8
            r0.d0 = r7
            r12 = 4
            r0.g0 = r12
            java.lang.Object r9 = r11.y(r9, r0)
            if (r9 != r1) goto Lda
            goto L11b
        Lda:
            r9 = r10
            r10 = r11
        Ldc:
            r0.R = r10
            r0.X = r9
            r0.Y = r3
            r0.Z = r3
            r0.d0 = r7
            r11 = 5
            r0.g0 = r11
            java.lang.Object r8 = r10.v(r8, r0)
            if (r8 != r1) goto Lf0
            goto L11b
        Lf0:
            r8 = r9
            r9 = r10
        Lf2:
            r0.R = r9
            r0.X = r8
            r0.Y = r3
            r0.Z = r3
            r0.d0 = r3
            r10 = 6
            r0.g0 = r10
            java.lang.Object r7 = r9.x(r7, r0)
            if (r7 != r1) goto L106
            goto L11b
        L106:
            r7 = r8
            r8 = r9
        L108:
            r0.R = r3
            r0.X = r3
            r0.Y = r3
            r0.Z = r3
            r0.d0 = r3
            r9 = 7
            r0.g0 = r9
            java.lang.Object r7 = r8.D(r7, r0)
            if (r7 != r1) goto L11c
        L11b:
            return r1
        L11c:
            jg7 r7 = defpackage.jg7.a
            return r7
    }

    public static java.lang.Object H(defpackage.vm5 r6, java.util.ArrayList r7, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.tm5
            if (r0 == 0) goto L13
            r0 = r8
            tm5 r0 = (defpackage.tm5) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            tm5 r0 = new tm5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.oi2.Y(r8)
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L31:
            java.util.ArrayList r7 = r0.X
            vm5 r6 = r0.R
            defpackage.oi2.Y(r8)
            goto L49
        L39:
            defpackage.oi2.Y(r8)
            r0.R = r6
            r0.X = r7
            r0.d0 = r5
            java.lang.Object r8 = r6.i(r0)
            if (r8 != r1) goto L49
            goto L55
        L49:
            r0.R = r3
            r0.X = r3
            r0.d0 = r4
            java.lang.Object r6 = r6.w(r7, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public static java.lang.Object J(defpackage.vm5 r6, long r7, java.util.ArrayList r9, defpackage.s41 r10) {
            boolean r0 = r10 instanceof defpackage.um5
            if (r0 == 0) goto L13
            r0 = r10
            um5 r0 = (defpackage.um5) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            um5 r0 = new um5
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.oi2.Y(r10)
            goto L5c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L31:
            long r7 = r0.Y
            java.util.ArrayList r9 = r0.X
            vm5 r6 = r0.R
            defpackage.oi2.Y(r10)
            goto L4d
        L3b:
            defpackage.oi2.Y(r10)
            r0.R = r6
            r0.X = r9
            r0.Y = r7
            r0.e0 = r5
            java.lang.Object r10 = r6.l(r7, r0)
            if (r10 != r1) goto L4d
            goto L5b
        L4d:
            r0.R = r3
            r0.X = r3
            r0.Y = r7
            r0.e0 = r4
            java.lang.Object r6 = r6.z(r9, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public static java.lang.Object e(defpackage.vm5 r7, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.rm5
            if (r0 == 0) goto L13
            r0 = r8
            rm5 r0 = (defpackage.rm5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            rm5 r0 = new rm5
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.oi2.Y(r8)
            goto L64
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r3
        L34:
            vm5 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L59
        L3a:
            vm5 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L4e
        L40:
            defpackage.oi2.Y(r8)
            r0.R = r7
            r0.Z = r6
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L4e
            goto L63
        L4e:
            r0.R = r7
            r0.Z = r5
            java.lang.Object r8 = r7.g(r0)
            if (r8 != r1) goto L59
            goto L63
        L59:
            r0.R = r3
            r0.Z = r4
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            jg7 r7 = defpackage.jg7.a
            return r7
    }

    public abstract defpackage.le2 A();

    public abstract defpackage.le2 B();

    public abstract java.lang.Object C(defpackage.ab5 r1, defpackage.ol r2);

    public abstract java.lang.Object D(defpackage.ea5 r1, defpackage.sm5 r2);

    public abstract java.lang.Object E(defpackage.ea5 r1, java.util.ArrayList r2, java.util.ArrayList r3, java.util.ArrayList r4, defpackage.pk r5);

    public abstract java.lang.Object G(java.util.ArrayList r1, defpackage.uk r2);

    public abstract java.lang.Object I(long r1, java.util.ArrayList r3, defpackage.qk r4);

    public abstract java.lang.Object a(defpackage.ab5 r1, defpackage.ll r2);

    public abstract java.lang.Object b(defpackage.fb5 r1, defpackage.s41 r2);

    public abstract java.lang.Object c(defpackage.rm5 r1);

    public abstract java.lang.Object d(defpackage.s41 r1);

    public abstract java.lang.Object f(defpackage.rm5 r1);

    public abstract java.lang.Object g(defpackage.rm5 r1);

    public abstract java.lang.Object h(long r1, defpackage.sm5 r3);

    public abstract java.lang.Object i(defpackage.tm5 r1);

    public abstract java.lang.Object j(long r1, defpackage.sm5 r3);

    public abstract java.lang.Object k(long r1, defpackage.sm5 r3);

    public abstract java.lang.Object l(long r1, defpackage.um5 r3);

    public abstract java.lang.Object m(long r1, defpackage.rk r3);

    public abstract java.lang.Object n(long r1, defpackage.sk r3);

    public abstract java.lang.Object o(long r1, defpackage.s41 r3);

    public abstract java.lang.Object p(long r1, defpackage.wk r3);

    public abstract java.lang.Object q(java.lang.String r1, defpackage.s41 r2);

    public abstract java.lang.Object r(long r1, boolean r3, defpackage.s41 r4);

    public abstract java.lang.Object s(long r1, defpackage.s41 r3);

    public abstract java.lang.Object t(long r1, defpackage.s41 r3);

    public abstract java.lang.Object u(defpackage.ol r1);

    public abstract java.lang.Object v(java.util.List r1, defpackage.sm5 r2);

    public abstract java.lang.Object w(java.util.List r1, defpackage.tm5 r2);

    public abstract java.lang.Object x(java.util.List r1, defpackage.sm5 r2);

    public abstract java.lang.Object y(java.util.List r1, defpackage.sm5 r2);

    public abstract java.lang.Object z(java.util.List r1, defpackage.um5 r2);
}
