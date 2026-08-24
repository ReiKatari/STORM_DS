package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if5  reason: default package */
/* loaded from: classes.dex */
public final class if5 extends defpackage.zx0 {
    public static final java.util.concurrent.atomic.AtomicReference A = null;
    public static final defpackage.tp6 z = null;
    public final defpackage.um a;
    public final defpackage.m44 b;
    public final java.lang.Object c;
    public defpackage.rc3 d;
    public java.lang.Throwable e;
    public final java.util.ArrayList f;
    public java.util.List g;
    public defpackage.ka4 h;
    public final defpackage.ua4 i;
    public final java.util.ArrayList j;
    public final java.util.ArrayList k;
    public final defpackage.ja4 l;
    public final defpackage.ap3 m;
    public final defpackage.ja4 n;
    public final defpackage.ja4 o;
    public java.util.ArrayList p;
    public defpackage.ka4 q;
    public defpackage.rj0 r;
    public final defpackage.tp6 s;
    public boolean t;
    public final defpackage.tp6 u;
    public final defpackage.m44 v;
    public final defpackage.tc3 w;
    public final defpackage.l61 x;
    public final defpackage.q61 y;

    static {
            hw4 r0 = defpackage.hw4.R
            tp6 r0 = defpackage.up6.a(r0)
            defpackage.if5.z = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1)
            defpackage.if5.A = r0
            return
    }

    public if5(defpackage.l61 r6) {
            r5 = this;
            r5.<init>()
            um r0 = new um
            df5 r1 = new df5
            r2 = 0
            r1.<init>(r5, r2)
            r0.<init>(r1)
            r5.a = r0
            m44 r1 = new m44
            df5 r3 = new df5
            r4 = 1
            r3.<init>(r5, r4)
            r1.<init>(r3)
            r5.b = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r5.c = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f = r1
            ka4 r1 = new ka4
            r1.<init>()
            r5.h = r1
            ua4 r1 = new ua4
            r3 = 16
            ey0[] r3 = new defpackage.ey0[r3]
            r1.<init>(r3)
            r5.i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.j = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.k = r1
            ja4 r1 = new ja4
            r1.<init>()
            r5.l = r1
            ap3 r1 = new ap3
            r3 = 7
            r1.<init>(r3)
            r5.m = r1
            ja4 r1 = new ja4
            r1.<init>()
            r5.n = r1
            ja4 r1 = new ja4
            r1.<init>()
            r5.o = r1
            r1 = 0
            tp6 r1 = defpackage.up6.a(r1)
            r5.s = r1
            ff5 r1 = defpackage.ff5.Inactive
            tp6 r1 = defpackage.up6.a(r1)
            r5.u = r1
            m44 r1 = new m44
            r3 = 19
            r1.<init>(r3, r2)
            r5.v = r1
            vs0 r1 = defpackage.vs0.h0
            j61 r1 = r6.Z(r1)
            rc3 r1 = (defpackage.rc3) r1
            tc3 r2 = new tc3
            r2.<init>(r1)
            bg2 r1 = new bg2
            r3 = 26
            r1.<init>(r5, r3)
            r2.a0(r1)
            r5.w = r2
            l61 r6 = r6.N(r0)
            l61 r6 = r6.N(r2)
            r5.x = r6
            q61 r6 = new q61
            r6.<init>()
            r5.y = r6
            return
    }

    public static final void G(java.util.ArrayList r0, defpackage.if5 r1, defpackage.ey0 r2) {
            r0.clear()
            java.lang.Object r0 = r1.c
            monitor-enter(r0)
            java.util.ArrayList r1 = r1.k     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L14
            monitor-exit(r0)
            return
        L14:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1f
            o84 r1 = (defpackage.o84) r1     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L1f
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static void w(defpackage.oa4 r2) {
            qo2 r0 = r2.w()     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0 instanceof defpackage.wl6     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lc
            r2.c()
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            r2.c()
            throw r0
    }

    public final boolean A() {
            r1 = this;
            ua4 r0 = r1.i
            int r0 = r0.L
            if (r0 == 0) goto L7
            goto L1e
        L7:
            boolean r0 = r1.z()
            if (r0 != 0) goto L1e
            boolean r0 = r1.B()
            if (r0 != 0) goto L1e
            ja4 r1 = r1.l
            boolean r1 = r1.j()
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r1 = 0
            return r1
        L1e:
            r1 = 1
            return r1
    }

    public final boolean B() {
            r1 = this;
            boolean r0 = r1.t
            if (r0 != 0) goto L1a
            m44 r1 = r1.b
            java.lang.Object r1 = r1.L
            s9 r1 = (defpackage.s9) r1
            java.lang.Object r1 = r1.c
            vw r1 = (defpackage.vw) r1
            int r1 = r1.get()
            r0 = 134217727(0x7ffffff, float:3.8518597E-34)
            r1 = r1 & r0
            if (r1 <= 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public final boolean C() {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            ka4 r1 = r2.h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            ua4 r1 = r2.i     // Catch: java.lang.Throwable -> L21
            int r1 = r1.L     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.z()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r2 = r2.B()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            r2 = 0
            goto L24
        L21:
            r2 = move-exception
            goto L26
        L23:
            r2 = 1
        L24:
            monitor-exit(r0)
            return r2
        L26:
            monitor-exit(r0)
            throw r2
    }

    public final java.util.List D() {
            r2 = this;
            java.util.List r0 = r2.g
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = r2.f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            yt1 r0 = defpackage.yt1.A
            goto L16
        L10:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r0 = r1
        L16:
            r2.g = r0
            return r0
    }

    public final void E() {
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            qj0 r1 = r4.y()     // Catch: java.lang.Throwable -> L2f
            tp6 r2 = r4.u     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L2f
            ff5 r2 = (defpackage.ff5) r2     // Catch: java.lang.Throwable -> L2f
            ff5 r3 = defpackage.ff5.ShuttingDown     // Catch: java.lang.Throwable -> L2f
            int r2 = r2.compareTo(r3)     // Catch: java.lang.Throwable -> L2f
            if (r2 <= 0) goto L22
            monitor-exit(r0)
            if (r1 == 0) goto L21
            jg7 r4 = defpackage.jg7.a
            rj0 r1 = (defpackage.rj0) r1
            r1.i(r4)
        L21:
            return
        L22:
            java.lang.String r1 = "Recomposer shutdown; frame clock awaiter will never resume"
            java.lang.Throwable r4 = r4.e     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            r2.initCause(r4)     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2f
        L2f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public final void F(defpackage.ey0 r2) {
            r1 = this;
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            java.util.ArrayList r1 = r1.k     // Catch: java.lang.Throwable -> L19
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L19
            if (r0 > 0) goto Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L19
            o84 r1 = (defpackage.o84) r1     // Catch: java.lang.Throwable -> L19
            r1.getClass()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L19
        L19:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
    }

    public final java.util.List H(java.util.List r19, defpackage.ka4 r20) {
            r18 = this;
            r0 = r18
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r19.size()
            r1.<init>(r2)
            int r2 = r19.size()
            r4 = 0
        L10:
            r5 = 0
            if (r4 >= r2) goto L35
            r6 = r19
            java.lang.Object r7 = r6.get(r4)
            r8 = r7
            o84 r8 = (defpackage.o84) r8
            r8.getClass()
            java.lang.Object r8 = r1.get(r5)
            if (r8 != 0) goto L2d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.put(r5, r8)
        L2d:
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r7)
            int r4 = r4 + 1
            goto L10
        L35:
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1be
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            ey0 r6 = (defpackage.ey0) r6
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            xq2 r7 = r6.r0
            boolean r7 = r7.F
            if (r7 == 0) goto L60
            java.lang.String r7 = "Check failed"
            defpackage.tx0.a(r7)
        L60:
            bg2 r7 = new bg2
            r8 = 25
            r7.<init>(r6, r8)
            qk4 r8 = new qk4
            r9 = 8
            r10 = r20
            r8.<init>(r9, r6, r10)
            vl6 r9 = defpackage.bm6.j()
            boolean r11 = r9 instanceof defpackage.oa4
            if (r11 == 0) goto L7b
            oa4 r9 = (defpackage.oa4) r9
            goto L7c
        L7b:
            r9 = r5
        L7c:
            if (r9 == 0) goto L1b8
            oa4 r7 = r9.C(r7, r8)
            if (r7 == 0) goto L1b8
            vl6 r8 = r7.j()     // Catch: java.lang.Throwable -> L1ac
            java.lang.Object r9 = r0.c     // Catch: java.lang.Throwable -> L16d
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L16d
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9
            int r12 = r4.size()     // Catch: java.lang.Throwable -> Lb9
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb9
            int r12 = r4.size()     // Catch: java.lang.Throwable -> Lb9
            r13 = 0
        L99:
            if (r13 >= r12) goto Lbc
            java.lang.Object r14 = r4.get(r13)     // Catch: java.lang.Throwable -> Lb9
            o84 r14 = (defpackage.o84) r14     // Catch: java.lang.Throwable -> Lb9
            ja4 r15 = r0.l     // Catch: java.lang.Throwable -> Lb9
            r14.getClass()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r15 = defpackage.g94.a(r15)     // Catch: java.lang.Throwable -> Lb9
            r16 = r15
            o84 r16 = (defpackage.o84) r16     // Catch: java.lang.Throwable -> Lb9
            vr4 r3 = new vr4     // Catch: java.lang.Throwable -> Lb9
            r3.<init>(r14, r15)     // Catch: java.lang.Throwable -> Lb9
            r11.add(r3)     // Catch: java.lang.Throwable -> Lb9
            int r13 = r13 + 1
            goto L99
        Lb9:
            r0 = move-exception
            goto L1ae
        Lbc:
            int r3 = r11.size()     // Catch: java.lang.Throwable -> Lb9
            r4 = 0
        Lc1:
            if (r4 >= r3) goto L125
            java.lang.Object r12 = r11.get(r4)     // Catch: java.lang.Throwable -> Lb9
            vr4 r12 = (defpackage.vr4) r12     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r13 = r12.B     // Catch: java.lang.Throwable -> Lb9
            if (r13 != 0) goto L122
            ap3 r13 = r0.m     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r12 = r12.A     // Catch: java.lang.Throwable -> Lb9
            o84 r12 = (defpackage.o84) r12     // Catch: java.lang.Throwable -> Lb9
            r12.getClass()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r12 = r13.B     // Catch: java.lang.Throwable -> Lb9
            ja4 r12 = (defpackage.ja4) r12     // Catch: java.lang.Throwable -> Lb9
            boolean r12 = r12.b(r5)     // Catch: java.lang.Throwable -> Lb9
            if (r12 == 0) goto L122
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9
            int r4 = r11.size()     // Catch: java.lang.Throwable -> Lb9
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb9
            int r4 = r11.size()     // Catch: java.lang.Throwable -> Lb9
            r12 = 0
        Lee:
            if (r12 >= r4) goto L120
            java.lang.Object r13 = r11.get(r12)     // Catch: java.lang.Throwable -> Lb9
            vr4 r13 = (defpackage.vr4) r13     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r14 = r13.B     // Catch: java.lang.Throwable -> Lb9
            if (r14 != 0) goto L11a
            ap3 r14 = r0.m     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r15 = r13.A     // Catch: java.lang.Throwable -> Lb9
            o84 r15 = (defpackage.o84) r15     // Catch: java.lang.Throwable -> Lb9
            r15.getClass()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r15 = r14.B     // Catch: java.lang.Throwable -> Lb9
            ja4 r15 = (defpackage.ja4) r15     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r17 = defpackage.g94.a(r15)     // Catch: java.lang.Throwable -> Lb9
            wd4 r17 = (defpackage.wd4) r17     // Catch: java.lang.Throwable -> Lb9
            boolean r15 = r15.i()     // Catch: java.lang.Throwable -> Lb9
            if (r15 == 0) goto L11a
            java.lang.Object r14 = r14.L     // Catch: java.lang.Throwable -> Lb9
            ja4 r14 = (defpackage.ja4) r14     // Catch: java.lang.Throwable -> Lb9
            r14.a()     // Catch: java.lang.Throwable -> Lb9
        L11a:
            r3.add(r13)     // Catch: java.lang.Throwable -> Lb9
            int r12 = r12 + 1
            goto Lee
        L120:
            r11 = r3
            goto L125
        L122:
            int r4 = r4 + 1
            goto Lc1
        L125:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L16d
            int r3 = r11.size()     // Catch: java.lang.Throwable -> L16d
            r4 = 0
        L12b:
            if (r4 >= r3) goto L1a1
            java.lang.Object r9 = r11.get(r4)     // Catch: java.lang.Throwable -> L16d
            vr4 r9 = (defpackage.vr4) r9     // Catch: java.lang.Throwable -> L16d
            java.lang.Object r9 = r9.B     // Catch: java.lang.Throwable -> L16d
            if (r9 != 0) goto L13a
            int r4 = r4 + 1
            goto L12b
        L13a:
            int r3 = r11.size()     // Catch: java.lang.Throwable -> L16d
            r4 = 0
        L13f:
            if (r4 >= r3) goto L1a1
            java.lang.Object r9 = r11.get(r4)     // Catch: java.lang.Throwable -> L16d
            vr4 r9 = (defpackage.vr4) r9     // Catch: java.lang.Throwable -> L16d
            java.lang.Object r9 = r9.B     // Catch: java.lang.Throwable -> L16d
            if (r9 == 0) goto L14e
            int r4 = r4 + 1
            goto L13f
        L14e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16d
            int r4 = r11.size()     // Catch: java.lang.Throwable -> L16d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L16d
            int r4 = r11.size()     // Catch: java.lang.Throwable -> L16d
            r9 = 0
        L15c:
            if (r9 >= r4) goto L172
            java.lang.Object r12 = r11.get(r9)     // Catch: java.lang.Throwable -> L16d
            vr4 r12 = (defpackage.vr4) r12     // Catch: java.lang.Throwable -> L16d
            java.lang.Object r13 = r12.B     // Catch: java.lang.Throwable -> L16d
            if (r13 != 0) goto L16f
            java.lang.Object r12 = r12.A     // Catch: java.lang.Throwable -> L16d
            o84 r12 = (defpackage.o84) r12     // Catch: java.lang.Throwable -> L16d
            goto L16f
        L16d:
            r0 = move-exception
            goto L1b0
        L16f:
            int r9 = r9 + 1
            goto L15c
        L172:
            java.lang.Object r4 = r0.c     // Catch: java.lang.Throwable -> L16d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L16d
            java.util.ArrayList r9 = r0.k     // Catch: java.lang.Throwable -> L19e
            defpackage.gt0.A0(r9, r3)     // Catch: java.lang.Throwable -> L19e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16d
            int r4 = r11.size()     // Catch: java.lang.Throwable -> L16d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L16d
            int r4 = r11.size()     // Catch: java.lang.Throwable -> L16d
            r9 = 0
        L189:
            if (r9 >= r4) goto L19c
            java.lang.Object r12 = r11.get(r9)     // Catch: java.lang.Throwable -> L16d
            r13 = r12
            vr4 r13 = (defpackage.vr4) r13     // Catch: java.lang.Throwable -> L16d
            java.lang.Object r13 = r13.B     // Catch: java.lang.Throwable -> L16d
            if (r13 == 0) goto L199
            r3.add(r12)     // Catch: java.lang.Throwable -> L16d
        L199:
            int r9 = r9 + 1
            goto L189
        L19c:
            r11 = r3
            goto L1a1
        L19e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16d
            throw r0     // Catch: java.lang.Throwable -> L16d
        L1a1:
            r6.r(r11)     // Catch: java.lang.Throwable -> L16d
            defpackage.vl6.q(r8)     // Catch: java.lang.Throwable -> L1ac
            w(r7)
            goto L3d
        L1ac:
            r0 = move-exception
            goto L1b4
        L1ae:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L16d
            throw r0     // Catch: java.lang.Throwable -> L16d
        L1b0:
            defpackage.vl6.q(r8)     // Catch: java.lang.Throwable -> L1ac
            throw r0     // Catch: java.lang.Throwable -> L1ac
        L1b4:
            w(r7)
            throw r0
        L1b8:
            java.lang.String r0 = "Cannot create a mutable snapshot of an read-only snapshot"
            defpackage.i.m(r0)
            return r5
        L1be:
            java.util.Set r0 = r1.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = defpackage.gt0.k1(r0)
            return r0
    }

    public final defpackage.ey0 I(defpackage.ey0 r6, defpackage.ka4 r7) {
            r5 = this;
            xq2 r0 = r6.r0
            boolean r0 = r0.F
            r1 = 0
            if (r0 != 0) goto L84
            int r0 = r6.s0
            r2 = 3
            if (r0 != r2) goto Ld
            return r1
        Ld:
            ka4 r5 = r5.q
            r0 = 1
            if (r5 == 0) goto L19
            boolean r5 = r5.c(r6)
            if (r5 != r0) goto L19
            goto L84
        L19:
            bg2 r5 = new bg2
            r2 = 25
            r5.<init>(r6, r2)
            qk4 r2 = new qk4
            r3 = 8
            r2.<init>(r3, r6, r7)
            vl6 r3 = defpackage.bm6.j()
            boolean r4 = r3 instanceof defpackage.oa4
            if (r4 == 0) goto L32
            oa4 r3 = (defpackage.oa4) r3
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L7f
            oa4 r5 = r3.C(r5, r2)
            if (r5 == 0) goto L7f
            vl6 r2 = r5.j()     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L68
            boolean r3 = r7.h()     // Catch: java.lang.Throwable -> L66
            if (r3 != r0) goto L68
            ci2 r3 = new ci2     // Catch: java.lang.Throwable -> L66
            r4 = 19
            r3.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L66
            xq2 r7 = r6.r0     // Catch: java.lang.Throwable -> L66
            boolean r4 = r7.F     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L59
            java.lang.String r4 = "Preparing a composition while composing is not supported"
            defpackage.tx0.a(r4)     // Catch: java.lang.Throwable -> L66
        L59:
            r7.F = r0     // Catch: java.lang.Throwable -> L66
            r0 = 0
            r3.c()     // Catch: java.lang.Throwable -> L62
            r7.F = r0     // Catch: java.lang.Throwable -> L66
            goto L68
        L62:
            r6 = move-exception
            r7.F = r0     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L66
        L66:
            r6 = move-exception
            goto L77
        L68:
            boolean r7 = r6.w()     // Catch: java.lang.Throwable -> L66
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> L75
            w(r5)
            if (r7 == 0) goto L84
            return r6
        L75:
            r6 = move-exception
            goto L7b
        L77:
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> L75
            throw r6     // Catch: java.lang.Throwable -> L75
        L7b:
            w(r5)
            throw r6
        L7f:
            java.lang.String r5 = "Cannot create a mutable snapshot of an read-only snapshot"
            defpackage.i.m(r5)
        L84:
            return r1
    }

    public final void J(java.lang.Throwable r5, defpackage.ey0 r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.if5.A
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L61
            boolean r0 = r5 instanceof defpackage.bx0
            if (r0 != 0) goto L61
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.lang.String r2 = "Error was captured in composition while live edit was enabled."
            java.lang.String r3 = "ComposeInternal"
            android.util.Log.e(r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r2 = r4.j     // Catch: java.lang.Throwable -> L50
            r2.clear()     // Catch: java.lang.Throwable -> L50
            ua4 r2 = r4.i     // Catch: java.lang.Throwable -> L50
            r2.g()     // Catch: java.lang.Throwable -> L50
            ka4 r2 = new ka4     // Catch: java.lang.Throwable -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L50
            r4.h = r2     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r2 = r4.k     // Catch: java.lang.Throwable -> L50
            r2.clear()     // Catch: java.lang.Throwable -> L50
            ja4 r2 = r4.l     // Catch: java.lang.Throwable -> L50
            r2.a()     // Catch: java.lang.Throwable -> L50
            ja4 r2 = r4.n     // Catch: java.lang.Throwable -> L50
            r2.a()     // Catch: java.lang.Throwable -> L50
            tp6 r2 = r4.s     // Catch: java.lang.Throwable -> L50
            ef5 r3 = new ef5     // Catch: java.lang.Throwable -> L50
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L50
            r2.getClass()     // Catch: java.lang.Throwable -> L50
            r2.m(r1, r3)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L52
            r4.L(r6)     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r4 = move-exception
            goto L5f
        L52:
            qj0 r4 = r4.y()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L5d
            java.lang.String r4 = "expected to go to inactive state due to composition error"
            defpackage.tx0.a(r4)     // Catch: java.lang.Throwable -> L50
        L5d:
            monitor-exit(r0)
            return
        L5f:
            monitor-exit(r0)
            throw r4
        L61:
            java.lang.Object r6 = r4.c
            monitor-enter(r6)
            java.lang.String r0 = "Error was captured in composition."
            java.lang.String r2 = "ComposeInternal"
            android.util.Log.e(r2, r0, r5)     // Catch: java.lang.Throwable -> L84
            tp6 r0 = r4.s     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L84
            ef5 r0 = (defpackage.ef5) r0     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L86
            tp6 r4 = r4.s     // Catch: java.lang.Throwable -> L84
            ef5 r0 = new ef5     // Catch: java.lang.Throwable -> L84
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L84
            r4.getClass()     // Catch: java.lang.Throwable -> L84
            r4.m(r1, r0)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r6)
            throw r5
        L84:
            r4 = move-exception
            goto L89
        L86:
            java.lang.Throwable r4 = r0.a     // Catch: java.lang.Throwable -> L84
            throw r4     // Catch: java.lang.Throwable -> L84
        L89:
            monitor-exit(r6)
            throw r4
    }

    public final boolean K() {
            r6 = this;
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            ka4 r1 = r6.h     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L14
            boolean r6 = r6.A()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r6
        L11:
            r6 = move-exception
            goto L86
        L14:
            java.util.List r1 = r6.D()     // Catch: java.lang.Throwable -> L11
            ka4 r2 = r6.h     // Catch: java.lang.Throwable -> L11
            d66 r3 = new d66     // Catch: java.lang.Throwable -> L11
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L11
            ka4 r2 = new ka4     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            r6.h = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L4a
            r2 = 0
        L2c:
            if (r2 >= r0) goto L4c
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> L4a
            ey0 r4 = (defpackage.ey0) r4     // Catch: java.lang.Throwable -> L4a
            r4.x(r3)     // Catch: java.lang.Throwable -> L4a
            tp6 r4 = r6.u     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L4a
            ff5 r4 = (defpackage.ff5) r4     // Catch: java.lang.Throwable -> L4a
            ff5 r5 = defpackage.ff5.ShuttingDown     // Catch: java.lang.Throwable -> L4a
            int r4 = r4.compareTo(r5)     // Catch: java.lang.Throwable -> L4a
            if (r4 <= 0) goto L4c
            int r2 = r2 + 1
            goto L2c
        L4a:
            r0 = move-exception
            goto L67
        L4c:
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            qj0 r1 = r6.y()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L5d
            boolean r6 = r6.A()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            return r6
        L5b:
            r6 = move-exception
            goto L65
        L5d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "called outside of runRecomposeAndApplyChanges"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L5b
            throw r6     // Catch: java.lang.Throwable -> L5b
        L65:
            monitor-exit(r0)
            throw r6
        L67:
            java.lang.Object r1 = r6.c
            monitor-enter(r1)
            ka4 r6 = r6.h     // Catch: java.lang.Throwable -> L83
            r6.getClass()     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L83
        L73:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L83
            r6.k(r3)     // Catch: java.lang.Throwable -> L83
            goto L73
        L81:
            monitor-exit(r1)
            throw r0
        L83:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L86:
            monitor-exit(r0)
            throw r6
    }

    public final void L(defpackage.ey0 r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.p
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.p = r0
        Lb:
            boolean r1 = r0.contains(r3)
            if (r1 != 0) goto L14
            r0.add(r3)
        L14:
            java.util.ArrayList r0 = r2.f
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L1f
            r3 = 0
            r2.g = r3
        L1f:
            return
    }

    @Override // defpackage.zx0
    public final void a(defpackage.ey0 r9, defpackage.eo2 r10) {
            r8 = this;
            xq2 r0 = r9.r0
            boolean r0 = r0.F
            java.lang.Object r1 = r8.c
            monitor-enter(r1)
            tp6 r2 = r8.u     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L22
            ff5 r2 = (defpackage.ff5) r2     // Catch: java.lang.Throwable -> L22
            ff5 r3 = defpackage.ff5.ShuttingDown     // Catch: java.lang.Throwable -> L22
            int r2 = r2.compareTo(r3)     // Catch: java.lang.Throwable -> L22
            r4 = 1
            if (r2 <= 0) goto L25
            java.util.List r2 = r8.D()     // Catch: java.lang.Throwable -> L22
            boolean r2 = r2.contains(r9)     // Catch: java.lang.Throwable -> L22
            r4 = r4 ^ r2
            goto L25
        L22:
            r8 = move-exception
            goto Lc3
        L25:
            monitor-exit(r1)
            bg2 r1 = new bg2     // Catch: java.lang.Throwable -> La4
            r2 = 25
            r1.<init>(r9, r2)     // Catch: java.lang.Throwable -> La4
            qk4 r2 = new qk4     // Catch: java.lang.Throwable -> La4
            r5 = 8
            r6 = 0
            r2.<init>(r5, r9, r6)     // Catch: java.lang.Throwable -> La4
            vl6 r5 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> La4
            boolean r7 = r5 instanceof defpackage.oa4     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L40
            oa4 r5 = (defpackage.oa4) r5     // Catch: java.lang.Throwable -> La4
            goto L41
        L40:
            r5 = r6
        L41:
            if (r5 == 0) goto Lb1
            oa4 r1 = r5.C(r1, r2)     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto Lb1
            vl6 r2 = r1.j()     // Catch: java.lang.Throwable -> La6
            r9.j(r10)     // Catch: java.lang.Throwable -> La8
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> La6
            w(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r10 = r8.c
            monitor-enter(r10)
            tp6 r1 = r8.u     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L79
            ff5 r1 = (defpackage.ff5) r1     // Catch: java.lang.Throwable -> L79
            int r1 = r1.compareTo(r3)     // Catch: java.lang.Throwable -> L79
            if (r1 <= 0) goto L7b
            java.util.List r1 = r8.D()     // Catch: java.lang.Throwable -> L79
            boolean r1 = r1.contains(r9)     // Catch: java.lang.Throwable -> L79
            if (r1 != 0) goto L7b
            java.util.ArrayList r1 = r8.f     // Catch: java.lang.Throwable -> L79
            r1.add(r9)     // Catch: java.lang.Throwable -> L79
            r8.g = r6     // Catch: java.lang.Throwable -> L79
            goto L7b
        L79:
            r8 = move-exception
            goto La2
        L7b:
            monitor-exit(r10)
            if (r0 != 0) goto L85
            vl6 r10 = defpackage.bm6.j()
            r10.m()
        L85:
            r8.F(r9)     // Catch: java.lang.Throwable -> L9d
            r9.d()     // Catch: java.lang.Throwable -> L98
            r9.f()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L97
            vl6 r8 = defpackage.bm6.j()
            r8.m()
        L97:
            return
        L98:
            r9 = move-exception
            r8.J(r9, r6)
            return
        L9d:
            r10 = move-exception
            r8.J(r10, r9)
            return
        La2:
            monitor-exit(r10)
            throw r8
        La4:
            r10 = move-exception
            goto Lb9
        La6:
            r10 = move-exception
            goto Lad
        La8:
            r10 = move-exception
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> La6
            throw r10     // Catch: java.lang.Throwable -> La6
        Lad:
            w(r1)     // Catch: java.lang.Throwable -> La4
            throw r10     // Catch: java.lang.Throwable -> La4
        Lb1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "Cannot create a mutable snapshot of an read-only snapshot"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> La4
            throw r10     // Catch: java.lang.Throwable -> La4
        Lb9:
            if (r4 == 0) goto Lbf
            java.lang.Object r0 = r8.c
            monitor-enter(r0)
            monitor-exit(r0)
        Lbf:
            r8.J(r10, r9)
            return
        Lc3:
            monitor-exit(r1)
            throw r8
    }

    @Override // defpackage.zx0
    public final defpackage.ka4 b(defpackage.ey0 r4, defpackage.kh6 r5, defpackage.eo2 r6) {
            r3 = this;
            m44 r0 = r3.v
            r1 = 0
            kh6 r2 = r4.l0     // Catch: java.lang.Throwable -> L1e
            r4.l0 = r5     // Catch: java.lang.Throwable -> L1e
            r3.a(r4, r6)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r0.f()     // Catch: java.lang.Throwable -> L20
            ka4 r3 = (defpackage.ka4) r3     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L13
            goto L18
        L13:
            ka4 r3 = defpackage.c66.a     // Catch: java.lang.Throwable -> L20
            r3.getClass()     // Catch: java.lang.Throwable -> L20
        L18:
            r4.l0 = r2     // Catch: java.lang.Throwable -> L1e
            r0.F(r1)
            return r3
        L1e:
            r3 = move-exception
            goto L24
        L20:
            r3 = move-exception
            r4.l0 = r2     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L24:
            r0.F(r1)
            throw r3
    }

    @Override // defpackage.zx0
    public final boolean d() {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.if5.A
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // defpackage.zx0
    public final boolean e() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.zx0
    public final boolean f() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.zx0
    public final long g() {
            r2 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            return r0
    }

    @Override // defpackage.zx0
    public final defpackage.yx0 h() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.zx0
    public final defpackage.l61 j() {
            r0 = this;
            l61 r0 = r0.x
            return r0
    }

    @Override // defpackage.zx0
    public final boolean k() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.zx0
    public final void l(defpackage.ey0 r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            ua4 r1 = r2.i     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.h(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            ua4 r1 = r2.i     // Catch: java.lang.Throwable -> L15
            r1.b(r3)     // Catch: java.lang.Throwable -> L15
            qj0 r2 = r2.y()     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r2 = move-exception
            goto L23
        L17:
            r2 = 0
        L18:
            monitor-exit(r0)
            if (r2 == 0) goto L22
            jg7 r3 = defpackage.jg7.a
            rj0 r2 = (defpackage.rj0) r2
            r2.i(r3)
        L22:
            return
        L23:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.zx0
    public final defpackage.n84 m(defpackage.o84 r2) {
            r1 = this;
            java.lang.Object r0 = r1.c
            monitor-enter(r0)
            ja4 r1 = r1.n     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = r1.k(r2)     // Catch: java.lang.Throwable -> Ld
            n84 r1 = (defpackage.n84) r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.zx0
    public final defpackage.ka4 n(defpackage.ey0 r4, defpackage.kh6 r5, defpackage.ka4 r6) {
            r3 = this;
            m44 r0 = r3.v
            r1 = 0
            r3.K()     // Catch: java.lang.Throwable -> L38
            d66 r2 = new d66     // Catch: java.lang.Throwable -> L38
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L38
            r4.x(r2)     // Catch: java.lang.Throwable -> L38
            kh6 r6 = r4.l0     // Catch: java.lang.Throwable -> L38
            r4.l0 = r5     // Catch: java.lang.Throwable -> L38
            ey0 r5 = r3.I(r4, r1)     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L24
            r3.F(r4)     // Catch: java.lang.Throwable -> L22
            r5.d()     // Catch: java.lang.Throwable -> L22
            r5.f()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r3 = move-exception
            goto L3a
        L24:
            java.lang.Object r3 = r0.f()     // Catch: java.lang.Throwable -> L22
            ka4 r3 = (defpackage.ka4) r3     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L2d
            goto L32
        L2d:
            ka4 r3 = defpackage.c66.a     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L22
        L32:
            r4.l0 = r6     // Catch: java.lang.Throwable -> L38
            r0.F(r1)
            return r3
        L38:
            r3 = move-exception
            goto L3d
        L3a:
            r4.l0 = r6     // Catch: java.lang.Throwable -> L38
            throw r3     // Catch: java.lang.Throwable -> L38
        L3d:
            r0.F(r1)
            throw r3
    }

    @Override // defpackage.zx0
    public final void o(java.util.Set r1) {
            r0 = this;
            return
    }

    @Override // defpackage.zx0
    public final void q(defpackage.cf5 r2) {
            r1 = this;
            m44 r1 = r1.v
            java.lang.Object r0 = r1.f()
            ka4 r0 = (defpackage.ka4) r0
            if (r0 != 0) goto L14
            ka4 r0 = defpackage.c66.a
            ka4 r0 = new ka4
            r0.<init>()
            r1.F(r0)
        L14:
            r0.a(r2)
            return
    }

    @Override // defpackage.zx0
    public final void r(defpackage.ey0 r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            ka4 r1 = r2.q     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            ka4 r1 = defpackage.c66.a     // Catch: java.lang.Throwable -> L11
            ka4 r1 = new ka4     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            r2.q = r1     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L18
        L13:
            r1.a(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L18:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.zx0
    public final defpackage.tj0 s(defpackage.pj r3) {
            r2 = this;
            m44 r2 = r2.b
            java.lang.Object r0 = r2.L
            s9 r0 = (defpackage.s9) r0
            of4 r1 = new of4
            r1.<init>()
            r1.a = r3
            java.lang.Object r2 = r2.R
            ci2 r2 = (defpackage.ci2) r2
            tj0 r2 = r0.i(r1, r2)
            return r2
    }

    @Override // defpackage.zx0
    public final void v(defpackage.ey0 r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.f     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.remove(r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Le
            r1 = 0
            r2.g = r1     // Catch: java.lang.Throwable -> L1a
        Le:
            ua4 r1 = r2.i     // Catch: java.lang.Throwable -> L1a
            r1.j(r3)     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r2 = r2.j     // Catch: java.lang.Throwable -> L1a
            r2.remove(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L1a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final void x() {
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            tp6 r1 = r3.u     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1b
            ff5 r1 = (defpackage.ff5) r1     // Catch: java.lang.Throwable -> L1b
            ff5 r2 = defpackage.ff5.Idle     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.compareTo(r2)     // Catch: java.lang.Throwable -> L1b
            if (r1 < 0) goto L1d
            tp6 r1 = r3.u     // Catch: java.lang.Throwable -> L1b
            ff5 r2 = defpackage.ff5.ShuttingDown     // Catch: java.lang.Throwable -> L1b
            r1.l(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L25
        L1d:
            monitor-exit(r0)
            tc3 r3 = r3.w
            r0 = 0
            r3.h(r0)
            return
        L25:
            monitor-exit(r0)
            throw r3
    }

    public final defpackage.qj0 y() {
            r9 = this;
            tp6 r0 = r9.u
            java.lang.Object r1 = r0.getValue()
            ff5 r1 = (defpackage.ff5) r1
            ff5 r2 = defpackage.ff5.ShuttingDown
            int r1 = r1.compareTo(r2)
            tp6 r2 = r9.s
            java.util.ArrayList r3 = r9.k
            java.util.ArrayList r4 = r9.j
            ua4 r5 = r9.i
            r6 = 0
            if (r1 > 0) goto L55
            java.util.List r0 = r9.D()
            int r1 = r0.size()
            r7 = 0
        L22:
            if (r7 >= r1) goto L2d
            java.lang.Object r8 = r0.get(r7)
            ey0 r8 = (defpackage.ey0) r8
            int r7 = r7 + 1
            goto L22
        L2d:
            java.util.ArrayList r0 = r9.f
            r0.clear()
            yt1 r0 = defpackage.yt1.A
            r9.g = r0
            ka4 r0 = new ka4
            r0.<init>()
            r9.h = r0
            r5.g()
            r4.clear()
            r3.clear()
            r9.p = r6
            rj0 r0 = r9.r
            if (r0 == 0) goto L4f
            r0.w(r6)
        L4f:
            r9.r = r6
            r2.l(r6)
            return r6
        L55:
            java.lang.Object r1 = r2.getValue()
            if (r1 == 0) goto L5e
            ff5 r1 = defpackage.ff5.Inactive
            goto Lb2
        L5e:
            rc3 r1 = r9.d
            if (r1 != 0) goto L7f
            ka4 r1 = new ka4
            r1.<init>()
            r9.h = r1
            r5.g()
            boolean r1 = r9.z()
            if (r1 != 0) goto L7c
            boolean r1 = r9.B()
            if (r1 == 0) goto L79
            goto L7c
        L79:
            ff5 r1 = defpackage.ff5.Inactive
            goto Lb2
        L7c:
            ff5 r1 = defpackage.ff5.InactivePendingWork
            goto Lb2
        L7f:
            int r1 = r5.L
            if (r1 == 0) goto L84
            goto Lb0
        L84:
            ka4 r1 = r9.h
            boolean r1 = r1.h()
            if (r1 != 0) goto Lb0
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lb0
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lb0
            boolean r1 = r9.z()
            if (r1 != 0) goto Lb0
            boolean r1 = r9.B()
            if (r1 != 0) goto Lb0
            ja4 r1 = r9.l
            boolean r1 = r1.j()
            if (r1 == 0) goto Lad
            goto Lb0
        Lad:
            ff5 r1 = defpackage.ff5.Idle
            goto Lb2
        Lb0:
            ff5 r1 = defpackage.ff5.PendingWork
        Lb2:
            r0.l(r1)
            ff5 r0 = defpackage.ff5.PendingWork
            if (r1 != r0) goto Lbe
            rj0 r0 = r9.r
            r9.r = r6
            return r0
        Lbe:
            return r6
    }

    public final boolean z() {
            r1 = this;
            boolean r0 = r1.t
            if (r0 != 0) goto L1a
            um r1 = r1.a
            java.lang.Object r1 = r1.L
            s9 r1 = (defpackage.s9) r1
            java.lang.Object r1 = r1.c
            vw r1 = (defpackage.vw) r1
            int r1 = r1.get()
            r0 = 134217727(0x7ffffff, float:3.8518597E-34)
            r1 = r1 & r0
            if (r1 <= 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }
}
