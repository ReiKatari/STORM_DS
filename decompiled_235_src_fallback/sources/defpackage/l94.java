package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l94  reason: default package */
/* loaded from: classes.dex */
public final class l94 extends defpackage.mk5 {
    public static final defpackage.n34 f = null;
    public static final defpackage.n34 g = null;
    public static final byte[] h = null;
    public static final byte[] i = null;
    public static final byte[] j = null;
    public final defpackage.da0 b;
    public final java.util.List c;
    public final defpackage.n34 d;
    public long e;

    static {
            xh5 r0 = defpackage.n34.d
            java.lang.String r0 = "multipart/mixed"
            n34 r0 = defpackage.xk2.k(r0)
            defpackage.l94.f = r0
            java.lang.String r0 = "multipart/alternative"
            defpackage.xk2.k(r0)
            java.lang.String r0 = "multipart/digest"
            defpackage.xk2.k(r0)
            java.lang.String r0 = "multipart/parallel"
            defpackage.xk2.k(r0)
            java.lang.String r0 = "multipart/form-data"
            n34 r0 = defpackage.xk2.k(r0)
            defpackage.l94.g = r0
            r0 = 2
            byte[] r1 = new byte[r0]
            r1 = {x0038: FILL_ARRAY_DATA  , data: [58, 32} // fill-array
            defpackage.l94.h = r1
            byte[] r1 = new byte[r0]
            r1 = {x003e: FILL_ARRAY_DATA  , data: [13, 10} // fill-array
            defpackage.l94.i = r1
            byte[] r0 = new byte[r0]
            r0 = {x0044: FILL_ARRAY_DATA  , data: [45, 45} // fill-array
            defpackage.l94.j = r0
            return
    }

    public l94(defpackage.da0 r1, defpackage.n34 r2, java.util.List r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.b = r1
            r0.c = r3
            xh5 r3 = defpackage.n34.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "; boundary="
            r3.append(r2)
            java.lang.String r1 = r1.s()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            n34 r1 = defpackage.xk2.k(r1)
            r0.d = r1
            r1 = -1
            r0.e = r1
            return
    }

    @Override // defpackage.mk5
    public final long a() {
            r4 = this;
            long r0 = r4.e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L10
            r0 = 0
            r1 = 1
            long r0 = r4.e(r0, r1)
            r4.e = r0
        L10:
            return r0
    }

    @Override // defpackage.mk5
    public final defpackage.n34 b() {
            r0 = this;
            n34 r0 = r0.d
            return r0
    }

    @Override // defpackage.mk5
    public final boolean c() {
            r1 = this;
            java.util.List r1 = r1.c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L23
        L9:
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            k94 r0 = (defpackage.k94) r0
            mk5 r0 = r0.b
            boolean r0 = r0.c()
            if (r0 == 0) goto Ld
            r1 = 1
            return r1
        L23:
            r1 = 0
            return r1
    }

    @Override // defpackage.mk5
    public final void d(defpackage.y80 r2) {
            r1 = this;
            r0 = 0
            r1.e(r2, r0)
            return
    }

    public final long e(defpackage.y80 r17, boolean r18) {
            r16 = this;
            r0 = r16
            if (r18 == 0) goto Lb
            k80 r1 = new k80
            r1.<init>()
            r2 = r1
            goto Lf
        Lb:
            r1 = 0
            r2 = r1
            r1 = r17
        Lf:
            java.util.List r3 = r0.c
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r8 = r5
        L19:
            da0 r9 = r0.b
            byte[] r10 = defpackage.l94.j
            byte[] r11 = defpackage.l94.i
            if (r8 >= r4) goto L92
            java.lang.Object r12 = r3.get(r8)
            k94 r12 = (defpackage.k94) r12
            yw2 r13 = r12.a
            mk5 r12 = r12.b
            r1.getClass()
            r1.write(r10)
            r1.P(r9)
            r1.write(r11)
            int r9 = r13.size()
            r10 = r5
        L3c:
            if (r10 >= r9) goto L5a
            java.lang.String r14 = r13.b(r10)
            y80 r14 = r1.H(r14)
            byte[] r15 = defpackage.l94.h
            y80 r14 = r14.write(r15)
            java.lang.String r15 = r13.d(r10)
            y80 r14 = r14.H(r15)
            r14.write(r11)
            int r10 = r10 + 1
            goto L3c
        L5a:
            n34 r9 = r12.b()
            if (r9 == 0) goto L6f
            java.lang.String r10 = "Content-Type: "
            y80 r10 = r1.H(r10)
            java.lang.String r9 = r9.a
            y80 r9 = r10.H(r9)
            r9.write(r11)
        L6f:
            long r9 = r12.a()
            r13 = -1
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 != 0) goto L82
            if (r18 == 0) goto L82
            r2.getClass()
            r2.e()
            return r13
        L82:
            r1.write(r11)
            if (r18 == 0) goto L89
            long r6 = r6 + r9
            goto L8c
        L89:
            r12.d(r1)
        L8c:
            r1.write(r11)
            int r8 = r8 + 1
            goto L19
        L92:
            r1.getClass()
            r1.write(r10)
            r1.P(r9)
            r1.write(r10)
            r1.write(r11)
            if (r18 == 0) goto Lac
            r2.getClass()
            long r0 = r2.B
            long r6 = r6 + r0
            r2.e()
        Lac:
            return r6
    }
}
