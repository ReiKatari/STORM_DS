package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk4  reason: default package */
/* loaded from: classes.dex */
public final class vk4 implements defpackage.gb0 {
    public final defpackage.vk5 A;
    public final java.lang.Object B;
    public final java.lang.Object[] L;
    public final defpackage.xk4 R;
    public final defpackage.b51 X;
    public volatile boolean Y;
    public defpackage.je5 Z;
    public java.lang.Throwable d0;
    public boolean e0;

    public vk4(defpackage.vk5 r1, java.lang.Object r2, java.lang.Object[] r3, defpackage.xk4 r4, defpackage.b51 r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    public final defpackage.je5 a() {
            r15 = this;
            vk5 r0 = r15.A
            uj2[] r1 = r0.j
            java.lang.Object[] r2 = r15.L
            int r3 = r2.length
            int r4 = r1.length
            r5 = 0
            if (r3 != r4) goto L11f
            ok5 r6 = new ok5
            java.lang.String r7 = r0.c
            i03 r8 = r0.b
            java.lang.String r9 = r0.d
            yw2 r10 = r0.e
            n34 r11 = r0.f
            boolean r12 = r0.g
            boolean r13 = r0.h
            boolean r14 = r0.i
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r4 = r0.k
            if (r4 == 0) goto L26
            int r3 = r3 + (-1)
        L26:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r7 = 0
            r8 = r7
        L2d:
            if (r8 >= r3) goto L3e
            r9 = r2[r8]
            r4.add(r9)
            r9 = r1[r8]
            r10 = r2[r8]
            r9.l(r6, r10)
            int r8 = r8 + 1
            goto L2d
        L3e:
            h03 r1 = r6.d
            if (r1 == 0) goto L47
            i03 r1 = r1.b()
            goto L65
        L47:
            java.lang.String r1 = r6.c
            i03 r2 = r6.b
            r2.getClass()
            r1.getClass()
            h03 r3 = new h03     // Catch: java.lang.IllegalArgumentException -> L5a
            r3.<init>(r7)     // Catch: java.lang.IllegalArgumentException -> L5a
            r3.e(r2, r1)     // Catch: java.lang.IllegalArgumentException -> L5a
            goto L5b
        L5a:
            r3 = r5
        L5b:
            if (r3 == 0) goto L62
            i03 r1 = r3.b()
            goto L63
        L62:
            r1 = r5
        L63:
            if (r1 == 0) goto L10d
        L65:
            mk5 r2 = r6.k
            if (r2 != 0) goto Lb8
            yc1 r3 = r6.j
            if (r3 == 0) goto L7b
            ak2 r2 = new ak2
            java.lang.Object r5 = r3.A
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r3 = r3.B
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2.<init>(r5, r3)
            goto Lb8
        L7b:
            m44 r3 = r6.i
            if (r3 == 0) goto La2
            java.lang.Object r2 = r3.R
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L9c
            l94 r5 = new l94
            java.lang.Object r8 = r3.B
            da0 r8 = (defpackage.da0) r8
            java.lang.Object r3 = r3.L
            n34 r3 = (defpackage.n34) r3
            java.util.List r2 = defpackage.az7.j(r2)
            r5.<init>(r8, r3, r2)
            r2 = r5
            goto Lb8
        L9c:
            java.lang.String r15 = "Multipart body must have at least one part."
            defpackage.i.m(r15)
            return r5
        La2:
            boolean r3 = r6.h
            if (r3 == 0) goto Lb8
            byte[] r2 = new byte[r7]
            int r3 = defpackage.mk5.a
            r8 = 0
            r10 = 0
            r12 = r8
            defpackage.yy7.a(r8, r10, r12)
            lk5 r3 = new lk5
            r3.<init>(r5, r7, r2)
            r2 = r3
        Lb8:
            n34 r3 = r6.g
            ww2 r5 = r6.f
            if (r3 == 0) goto Lce
            if (r2 == 0) goto Lc7
            nk5 r8 = new nk5
            r8.<init>(r2, r3)
            r2 = r8
            goto Lce
        Lc7:
            java.lang.String r8 = "Content-Type"
            java.lang.String r3 = r3.a
            r5.b(r8, r3)
        Lce:
            s9 r3 = r6.e
            r3.getClass()
            r3.a = r1
            yw2 r1 = r5.f()
            ww2 r1 = r1.c()
            r3.c = r1
            java.lang.String r1 = r6.a
            r3.D(r1, r2)
            ac3 r1 = new ac3
            java.lang.reflect.Method r0 = r0.a
            java.lang.Object r2 = r15.B
            r1.<init>(r2, r0, r4)
            java.lang.Class<ac3> r0 = defpackage.ac3.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r2 = r3.e
            qo2 r2 = (defpackage.qo2) r2
            qo2 r0 = r2.F(r0, r1)
            r3.e = r0
            pa r0 = new pa
            r0.<init>(r3)
            xk4 r15 = r15.R
            r15.getClass()
            je5 r1 = new je5
            r1.<init>(r15, r0, r7)
            return r1
        L10d:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Malformed URL. Base: "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r0 = ", Relative: "
            java.lang.String r1 = r6.c
            defpackage.fa6.g(r15, r0, r1)
            return r5
        L11f:
            java.lang.String r15 = "Argument count ("
            java.lang.String r0 = ") doesn't match expected count ("
            java.lang.StringBuilder r15 = defpackage.xg6.t(r15, r3, r0)
            int r0 = r1.length
            java.lang.String r1 = ")"
            java.lang.String r15 = defpackage.lb1.o(r15, r0, r1)
            defpackage.i.h(r15)
            return r5
    }

    public final defpackage.je5 b() {
            r1 = this;
            je5 r0 = r1.Z
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Throwable r0 = r1.d0
            if (r0 == 0) goto L1a
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L14
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L14:
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L17:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L1a:
            je5 r0 = r1.a()     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            r1.Z = r0     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            return r0
        L21:
            r0 = move-exception
            goto L26
        L23:
            r0 = move-exception
            goto L26
        L25:
            r0 = move-exception
        L26:
            defpackage.ak7.H0(r0)
            r1.d0 = r0
            throw r0
    }

    public final defpackage.vl5 c(defpackage.wl5 r7) {
            r6 = this;
            yl5 r0 = r7.Z
            ul5 r7 = r7.h()
            uk4 r1 = new uk4
            n34 r2 = r0.k()
            long r3 = r0.h()
            r1.<init>(r2, r3)
            r7.g = r1
            wl5 r7 = r7.a()
            boolean r1 = r7.m0
            int r2 = r7.R
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r2 < r3) goto L61
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L27
            goto L61
        L27:
            r3 = 204(0xcc, float:2.86E-43)
            java.lang.String r5 = "rawResponse must be successful response"
            if (r2 == r3) goto L52
            r3 = 205(0xcd, float:2.87E-43)
            if (r2 != r3) goto L32
            goto L52
        L32:
            tk4 r2 = new tk4
            r2.<init>(r0)
            b51 r6 = r6.X     // Catch: java.lang.RuntimeException -> L4b
            java.lang.Object r6 = r6.h(r2)     // Catch: java.lang.RuntimeException -> L4b
            if (r1 == 0) goto L45
            vl5 r0 = new vl5     // Catch: java.lang.RuntimeException -> L4b
            r0.<init>(r7, r6)     // Catch: java.lang.RuntimeException -> L4b
            return r0
        L45:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L4b
            r6.<init>(r5)     // Catch: java.lang.RuntimeException -> L4b
            throw r6     // Catch: java.lang.RuntimeException -> L4b
        L4b:
            r6 = move-exception
            java.io.IOException r7 = r2.R
            if (r7 != 0) goto L51
            throw r6
        L51:
            throw r7
        L52:
            r0.close()
            if (r1 == 0) goto L5d
            vl5 r6 = new vl5
            r6.<init>(r7, r4)
            return r6
        L5d:
            defpackage.i.h(r5)
            return r4
        L61:
            k80 r6 = new k80     // Catch: java.lang.Throwable -> L88
            r6.<init>()     // Catch: java.lang.Throwable -> L88
            z80 r2 = r0.n()     // Catch: java.lang.Throwable -> L88
            r2.C(r6)     // Catch: java.lang.Throwable -> L88
            r0.k()     // Catch: java.lang.Throwable -> L88
            r0.h()     // Catch: java.lang.Throwable -> L88
            xl5 r6 = new xl5     // Catch: java.lang.Throwable -> L88
            if (r1 != 0) goto L80
            vl5 r6 = new vl5     // Catch: java.lang.Throwable -> L88
            r6.<init>(r7, r4)     // Catch: java.lang.Throwable -> L88
            r0.close()
            return r6
        L80:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = "rawResponse should not be successful response"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L88
            throw r6     // Catch: java.lang.Throwable -> L88
        L88:
            r6 = move-exception
            r0.close()
            throw r6
    }

    @Override // defpackage.gb0
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.Y = r0
            monitor-enter(r1)
            je5 r0 = r1.Z     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.cancel()
        Lc:
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // defpackage.gb0
    public final defpackage.gb0 clone() {
            r6 = this;
            vk4 r0 = new vk4
            xk4 r4 = r6.R
            b51 r5 = r6.X
            vk5 r1 = r6.A
            java.lang.Object r2 = r6.B
            java.lang.Object[] r3 = r6.L
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final java.lang.Object m19clone() {
            r6 = this;
            vk4 r0 = new vk4
            xk4 r4 = r6.R
            b51 r5 = r6.X
            vk5 r1 = r6.A
            java.lang.Object r2 = r6.B
            java.lang.Object[] r3 = r6.L
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.gb0
    public final void h(defpackage.mb0 r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.e0     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L3b
            r0 = 1
            r4.e0 = r0     // Catch: java.lang.Throwable -> L1f
            je5 r0 = r4.Z     // Catch: java.lang.Throwable -> L1f
            java.lang.Throwable r1 = r4.d0     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            if (r1 != 0) goto L21
            je5 r2 = r4.a()     // Catch: java.lang.Throwable -> L18
            r4.Z = r2     // Catch: java.lang.Throwable -> L18
            r0 = r2
            goto L21
        L18:
            r1 = move-exception
            defpackage.ak7.H0(r1)     // Catch: java.lang.Throwable -> L1f
            r4.d0 = r1     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L43
        L21:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L28
            r5.f(r4, r1)
            return
        L28:
            boolean r1 = r4.Y
            if (r1 == 0) goto L2f
            r0.cancel()
        L2f:
            ap3 r1 = new ap3
            r2 = 9
            r3 = 0
            r1.<init>(r2, r4, r5, r3)
            r0.d(r1)
            return
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "Already executed."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5     // Catch: java.lang.Throwable -> L1f
        L43:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    @Override // defpackage.gb0
    public final boolean r() {
            r2 = this;
            boolean r0 = r2.Y
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            je5 r0 = r2.Z     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            boolean r0 = r0.m0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r1 = 0
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return r1
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // defpackage.gb0
    public final synchronized defpackage.pa x() {
            r3 = this;
            monitor-enter(r3)
            je5 r0 = r3.b()     // Catch: java.lang.Throwable -> L9 java.io.IOException -> Lb
            pa r0 = r0.B     // Catch: java.lang.Throwable -> L9 java.io.IOException -> Lb
            monitor-exit(r3)
            return r0
        L9:
            r0 = move-exception
            goto L14
        Lb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "Unable to create request."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        L14:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}
