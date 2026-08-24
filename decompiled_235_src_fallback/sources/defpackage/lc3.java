package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc3  reason: default package */
/* loaded from: classes.dex */
public final class lc3 extends defpackage.yc7 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final defpackage.yc7 c;
    public final java.lang.Object d;

    public lc3(defpackage.ft0 r1, defpackage.lc3 r2, defpackage.lc3 r3, defpackage.ph4 r4) {
            r0 = this;
            r1 = 1
            r0.a = r1
            r0.<init>()
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public /* synthetic */ lc3(java.lang.Object r1, defpackage.yc7 r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r10) {
            r9 = this;
            int r0 = r9.a
            r1 = 0
            switch(r0) {
                case 0: goto L107;
                case 1: goto Ld;
                default: goto L6;
            }
        L6:
            yc7 r9 = r9.c
            java.lang.Object r9 = r9.b(r10)
            return r9
        Ld:
            jf3 r0 = r10.n0()
            jf3 r2 = defpackage.jf3.NULL
            if (r0 != r2) goto L1a
            r10.j0()
            goto L106
        L1a:
            java.lang.Object r1 = r9.d
            ph4 r1 = (defpackage.ph4) r1
            java.lang.Object r1 = r1.e()
            java.util.Map r1 = (java.util.Map) r1
            jf3 r2 = defpackage.jf3.BEGIN_ARRAY
            java.lang.String r3 = "duplicate key: "
            if (r0 != r2) goto L6e
            r10.e()
        L2d:
            boolean r0 = r10.F()
            if (r0 == 0) goto L69
            r10.e()
            java.lang.Object r0 = r9.b
            lc3 r0 = (defpackage.lc3) r0
            yc7 r0 = r0.c
            java.lang.Object r0 = r0.b(r10)
            yc7 r2 = r9.c
            lc3 r2 = (defpackage.lc3) r2
            yc7 r2 = r2.c
            java.lang.Object r2 = r2.b(r10)
            boolean r4 = r1.containsKey(r0)
            if (r4 != 0) goto L57
            r1.put(r0, r2)
            r10.r()
            goto L2d
        L57:
            ne3 r9 = new ne3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r3)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L69:
            r10.r()
            goto L106
        L6e:
            r10.h()
        L71:
            boolean r0 = r10.F()
            if (r0 == 0) goto L103
            x31 r0 = defpackage.x31.B
            r0.getClass()
            boolean r0 = r10 instanceof defpackage.rf3
            if (r0 == 0) goto Laa
            r0 = r10
            rf3 r0 = (defpackage.rf3) r0
            jf3 r2 = defpackage.jf3.NAME
            r0.y0(r2)
            java.lang.Object r2 = r0.C0()
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            r0.E0(r4)
            ef3 r4 = new ef3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r4.<init>(r2)
            r0.E0(r4)
            goto Lcc
        Laa:
            int r0 = r10.e0
            if (r0 != 0) goto Lb2
            int r0 = r10.n()
        Lb2:
            r2 = 13
            if (r0 != r2) goto Lbb
            r0 = 9
            r10.e0 = r0
            goto Lcc
        Lbb:
            r2 = 12
            if (r0 != r2) goto Lc4
            r0 = 8
            r10.e0 = r0
            goto Lcc
        Lc4:
            r2 = 14
            if (r0 != r2) goto Lfc
            r0 = 10
            r10.e0 = r0
        Lcc:
            java.lang.Object r0 = r9.b
            lc3 r0 = (defpackage.lc3) r0
            yc7 r0 = r0.c
            java.lang.Object r0 = r0.b(r10)
            yc7 r2 = r9.c
            lc3 r2 = (defpackage.lc3) r2
            yc7 r2 = r2.c
            java.lang.Object r2 = r2.b(r10)
            boolean r4 = r1.containsKey(r0)
            if (r4 != 0) goto Lea
            r1.put(r0, r2)
            goto L71
        Lea:
            ne3 r9 = new ne3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r3)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lfc:
            java.lang.String r9 = "a name"
            java.lang.IllegalStateException r9 = r10.w0(r9)
            throw r9
        L103:
            r10.u()
        L106:
            return r1
        L107:
            r10.h()
            r0 = r1
            r2 = r0
        L10c:
            jf3 r3 = r10.n0()
            jf3 r4 = defpackage.jf3.END_OBJECT
            java.lang.String r5 = "dateTime"
            java.lang.String r6 = "zone"
            java.lang.String r7 = "offset"
            if (r3 == r4) goto L170
            java.lang.String r3 = r10.c0()
            r3.getClass()
            int r4 = r3.hashCode()
            r8 = -1
            switch(r4) {
                case -1019779949: goto L13c;
                case 3744684: goto L133;
                case 1792749467: goto L12a;
                default: goto L129;
            }
        L129:
            goto L144
        L12a:
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L131
            goto L144
        L131:
            r8 = 2
            goto L144
        L133:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L13a
            goto L144
        L13a:
            r8 = 1
            goto L144
        L13c:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L143
            goto L144
        L143:
            r8 = 0
        L144:
            switch(r8) {
                case 0: goto L165;
                case 1: goto L158;
                case 2: goto L14b;
                default: goto L147;
            }
        L147:
            r10.u0()
            goto L10c
        L14b:
            java.lang.Object r1 = r9.b
            xc7 r1 = (defpackage.xc7) r1
            java.lang.Object r1 = r1.b(r10)
            java.time.LocalDateTime r1 = defpackage.jc3.e(r1)
            goto L10c
        L158:
            java.lang.Object r2 = r9.d
            yc7 r2 = (defpackage.yc7) r2
            java.lang.Object r2 = r2.b(r10)
            java.time.ZoneId r2 = defpackage.jc3.i(r2)
            goto L10c
        L165:
            yc7 r0 = r9.c
            java.lang.Object r0 = r0.b(r10)
            java.time.ZoneOffset r0 = defpackage.jc3.m(r0)
            goto L10c
        L170:
            r10.u()
            defpackage.kc3.a(r1, r5, r10)
            java.time.LocalDateTime r9 = defpackage.jc3.t(r1)
            defpackage.kc3.a(r0, r7, r10)
            java.time.ZoneOffset r0 = defpackage.jc3.v(r0)
            defpackage.kc3.a(r2, r6, r10)
            java.time.ZoneId r10 = defpackage.jc3.u(r2)
            java.time.ZonedDateTime r9 = defpackage.jc3.p(r9, r0, r10)
            return r9
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.a
            java.lang.Object r1 = r3.b
            java.lang.Object r2 = r3.d
            yc7 r3 = r3.c
            switch(r0) {
                case 0: goto L83;
                case 1: goto L4a;
                default: goto Lb;
            }
        Lb:
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r5 == 0) goto L1c
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 != 0) goto L17
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L1c
        L17:
            java.lang.Class r0 = r5.getClass()
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == r2) goto L46
            su2 r1 = (defpackage.su2) r1
            ie7 r2 = new ie7
            r2.<init>(r0)
            yc7 r0 = r1.d(r2)
            boolean r1 = r0 instanceof defpackage.rh5
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r3
        L30:
            boolean r2 = r1 instanceof defpackage.ec6
            if (r2 == 0) goto L40
            r2 = r1
            ec6 r2 = (defpackage.ec6) r2
            yc7 r2 = r2.d()
            if (r2 != r1) goto L3e
            goto L40
        L3e:
            r1 = r2
            goto L30
        L40:
            boolean r1 = r1 instanceof defpackage.rh5
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r0
        L46:
            r3.c(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L52
            r4.A()
            goto L82
        L52:
            r4.k()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.v(r1)
            r1 = r3
            lc3 r1 = (defpackage.lc3) r1
            java.lang.Object r0 = r0.getValue()
            r1.c(r4, r0)
            goto L5d
        L7f:
            r4.u()
        L82:
            return
        L83:
            java.time.ZonedDateTime r5 = defpackage.jc3.o(r5)
            if (r5 != 0) goto L8d
            r4.A()
            goto Lbb
        L8d:
            r4.k()
            java.lang.String r0 = "dateTime"
            r4.v(r0)
            xc7 r1 = (defpackage.xc7) r1
            java.time.LocalDateTime r0 = defpackage.jc3.f(r5)
            r1.c(r4, r0)
            java.lang.String r0 = "offset"
            r4.v(r0)
            java.time.ZoneOffset r0 = defpackage.jc3.n(r5)
            r3.c(r4, r0)
            java.lang.String r3 = "zone"
            r4.v(r3)
            yc7 r2 = (defpackage.yc7) r2
            java.time.ZoneId r3 = defpackage.jc3.k(r5)
            r2.c(r4, r3)
            r4.u()
        Lbb:
            return
    }
}
