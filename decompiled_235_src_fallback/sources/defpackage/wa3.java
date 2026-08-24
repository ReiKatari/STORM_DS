package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wa3  reason: default package */
/* loaded from: classes.dex */
public final class wa3 {
    public static final java.lang.reflect.Type h = null;
    public final android.content.Context a;
    public final defpackage.su2 b;
    public final defpackage.jd6 c;
    public final defpackage.hb4 d;
    public boolean e;
    public final defpackage.tp6 f;
    public final defpackage.ex6 g;

    static {
            ka3 r0 = new ka3
            r0.<init>()
            java.lang.reflect.Type r0 = r0.b
            r0.getClass()
            defpackage.wa3.h = r0
            return
    }

    public wa3(android.content.Context r1, defpackage.su2 r2, defpackage.jd6 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            hb4 r1 = new hb4
            r1.<init>()
            r0.d = r1
            yt1 r1 = defpackage.yt1.A
            tp6 r1 = defpackage.up6.a(r1)
            r0.f = r1
            er2 r1 = new er2
            r2 = 5
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.g = r2
            return
    }

    public static final java.util.List a(defpackage.wa3 r3) {
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "layouts.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L14
            goto L4d
        L14:
            su2 r3 = r3.b     // Catch: java.lang.Exception -> L4d
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Exception -> L4d
            r1.<init>(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Type r0 = defpackage.wa3.h     // Catch: java.lang.Exception -> L4d
            java.lang.Object r3 = r3.b(r1, r0)     // Catch: java.lang.Exception -> L4d
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L4d
            if (r3 == 0) goto L48
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4d
            r1 = 10
            int r1 = defpackage.ht0.v0(r3, r1)     // Catch: java.lang.Exception -> L4d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L4d
        L34:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L49
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L4d
            gk3 r1 = (defpackage.gk3) r1     // Catch: java.lang.Exception -> L4d
            fk3 r1 = r1.a()     // Catch: java.lang.Exception -> L4d
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto L34
        L48:
            r0 = 0
        L49:
            if (r0 != 0) goto L4c
            goto L4d
        L4c:
            return r0
        L4d:
            yt1 r3 = defpackage.yt1.A
            return r3
    }

    public final java.lang.Object b(defpackage.fk3 r12, defpackage.s41 r13) {
            r11 = this;
            boolean r0 = r13 instanceof defpackage.la3
            if (r0 == 0) goto L13
            r0 = r13
            la3 r0 = (defpackage.la3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            la3 r0 = new la3
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            jg7 r3 = defpackage.jg7.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.oi2.Y(r13)
            return r3
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r6
        L33:
            fk3 r12 = r0.R
            defpackage.oi2.Y(r13)
            goto L47
        L39:
            defpackage.oi2.Y(r13)
            r0.R = r12
            r0.Z = r5
            java.lang.Object r13 = r11.c(r0)
            if (r13 != r1) goto L47
            goto Lb1
        L47:
            tp6 r13 = r11.f
            java.lang.Object r2 = r13.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L53:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r2.next()
            r8 = r7
            fh1 r8 = (defpackage.fh1) r8
            boolean r9 = r8.b
            if (r9 != 0) goto L53
            java.lang.Object r8 = r8.a
            fk3 r8 = (defpackage.fk3) r8
            java.util.UUID r8 = r8.a
            java.util.UUID r9 = r12.a
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L53
            goto L74
        L73:
            r7 = r6
        L74:
            fh1 r7 = (defpackage.fh1) r7
            if (r7 == 0) goto Lb2
        L78:
            java.lang.Object r12 = r13.getValue()
            r2 = r12
            java.util.List r2 = (java.util.List) r2
            int r8 = r2.indexOf(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            java.lang.Object r2 = r7.a
            fh1 r10 = new fh1
            r10.<init>(r5, r2)
            r9.set(r8, r10)
            boolean r12 = r13.j(r12, r9)
            if (r12 == 0) goto L78
            r0.R = r6
            r0.Z = r4
            xe1 r12 = defpackage.xk1.a
            de1 r12 = defpackage.de1.L
            va3 r13 = new va3
            r13.<init>(r11, r6)
            java.lang.Object r11 = defpackage.hv.d0(r12, r13, r0)
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            if (r11 != r12) goto Lae
            goto Laf
        Lae:
            r11 = r3
        Laf:
            if (r11 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r3
    }

    public final java.lang.Object c(defpackage.s41 r5) {
            r4 = this;
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            u12 r1 = new u12
            r2 = 0
            r3 = 14
            r1.<init>(r4, r2, r3)
            java.lang.Object r4 = defpackage.hv.d0(r0, r1, r5)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L15
            return r4
        L15:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    public final java.lang.Object d(java.util.UUID r6, defpackage.s41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ma3
            if (r0 == 0) goto L13
            r0 = r7
            ma3 r0 = (defpackage.ma3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ma3 r0 = new ma3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.util.UUID r6 = r0.R
            defpackage.oi2.Y(r7)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L30:
            defpackage.oi2.Y(r7)
            r0.R = r6
            r0.Z = r4
            java.lang.Object r7 = r5.c(r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            tp6 r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L68
            java.lang.Object r7 = r5.next()
            r0 = r7
            fh1 r0 = (defpackage.fh1) r0
            boolean r1 = r0.b
            if (r1 != 0) goto L4a
            java.lang.Object r0 = r0.a
            fk3 r0 = (defpackage.fk3) r0
            java.util.UUID r0 = r0.a
            boolean r0 = defpackage.nb3.k(r0, r6)
            if (r0 == 0) goto L4a
            goto L69
        L68:
            r7 = r3
        L69:
            fh1 r7 = (defpackage.fh1) r7
            if (r7 == 0) goto L72
            java.lang.Object r5 = r7.a
            fk3 r5 = (defpackage.fk3) r5
            return r5
        L72:
            return r3
    }

    public final defpackage.le2 e(java.util.UUID r6) {
            r5 = this;
            r6.getClass()
            ra3 r0 = new ra3
            r1 = 0
            r2 = 1
            r0.<init>(r5, r1, r2)
            cf2 r3 = new cf2
            tp6 r4 = r5.f
            r3.<init>(r0, r4)
            pa3 r0 = new pa3
            r0.<init>(r3, r5, r2)
            wp0 r5 = new wp0
            r2 = 7
            r5.<init>(r2, r0, r6)
            m8 r6 = new m8
            r0 = 2
            r2 = 3
            r6.<init>(r0, r1, r2)
            wp0 r0 = new wp0
            r0.<init>(r2, r5, r6)
            b7 r5 = new b7
            r6 = 10
            r5.<init>(r0, r6)
            le2 r5 = defpackage.f04.z(r5)
            return r5
    }

    public final java.lang.Object f(defpackage.fk3 r18, defpackage.s41 r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.ua3
            if (r2 == 0) goto L17
            r2 = r1
            ua3 r2 = (defpackage.ua3) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            ua3 r2 = new ua3
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Z
            jg7 r5 = defpackage.jg7.a
            r6 = 0
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L3f
            if (r4 == r8) goto L38
            if (r4 != r7) goto L32
            defpackage.oi2.Y(r1)
            goto Led
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r6
        L38:
            fk3 r4 = r2.R
            defpackage.oi2.Y(r1)
            r8 = r4
            goto L51
        L3f:
            defpackage.oi2.Y(r1)
            r1 = r18
            r2.R = r1
            r2.Z = r8
            java.lang.Object r4 = r0.c(r2)
            if (r4 != r3) goto L50
            goto Lec
        L50:
            r8 = r1
        L51:
            java.util.UUID r1 = r8.a
            tp6 r4 = r0.f
            r9 = 0
            if (r1 != 0) goto L83
            r1 = r9
            java.util.UUID r9 = java.util.UUID.randomUUID()
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            fk3 r8 = defpackage.fk3.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L69:
            java.lang.Object r9 = r4.getValue()
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r10 = defpackage.gt0.m1(r10)
            fh1 r11 = new fh1
            r11.<init>(r1, r8)
            r10.add(r11)
            boolean r9 = r4.j(r9, r10)
            if (r9 == 0) goto L69
            goto Ld3
        L83:
            r1 = r9
            r9 = r8
            java.lang.Object r8 = r4.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r10 = r1
        L90:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lae
            java.lang.Object r11 = r8.next()
            fh1 r11 = (defpackage.fh1) r11
            java.lang.Object r11 = r11.a
            fk3 r11 = (defpackage.fk3) r11
            java.util.UUID r11 = r11.a
            java.util.UUID r12 = r9.a
            boolean r11 = defpackage.nb3.k(r11, r12)
            if (r11 == 0) goto Lab
            goto Laf
        Lab:
            int r10 = r10 + 1
            goto L90
        Lae:
            r10 = -1
        Laf:
            java.lang.Object r8 = r4.getValue()
            r11 = r8
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r11 = defpackage.gt0.m1(r11)
            if (r10 < 0) goto Lc5
            fh1 r12 = new fh1
            r12.<init>(r1, r9)
            r11.set(r10, r12)
            goto Lcd
        Lc5:
            fh1 r12 = new fh1
            r12.<init>(r1, r9)
            r11.add(r12)
        Lcd:
            boolean r8 = r4.j(r8, r11)
            if (r8 == 0) goto Laf
        Ld3:
            r2.R = r6
            r2.Z = r7
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            va3 r4 = new va3
            r4.<init>(r0, r6)
            java.lang.Object r0 = defpackage.hv.d0(r1, r4, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Le9
            goto Lea
        Le9:
            r0 = r5
        Lea:
            if (r0 != r3) goto Led
        Lec:
            return r3
        Led:
            return r5
    }
}
