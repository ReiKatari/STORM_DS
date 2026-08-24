package me.magnum.melonds.ui.inputsetup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b extends defpackage.qo7 {
    public final defpackage.kd6 b;
    public final defpackage.p06 c;
    public defpackage.pq5 d;
    public final defpackage.tp6 e;
    public final defpackage.de5 f;
    public final defpackage.tp6 g;
    public final defpackage.de5 h;
    public final defpackage.tp6 i;
    public final defpackage.de5 j;
    public final defpackage.tp6 k;
    public final defpackage.de5 l;
    public final defpackage.of6 m;
    public final defpackage.be5 n;
    public boolean o;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.ui.inputsetup.b.a[] $VALUES = null;
        public static final me.magnum.melonds.ui.inputsetup.b.a X = null;
        public static final me.magnum.melonds.ui.inputsetup.b.a Y = null;

        private static final /* synthetic */ me.magnum.melonds.ui.inputsetup.b.a[] $values() {
                me.magnum.melonds.ui.inputsetup.b$a r0 = me.magnum.melonds.ui.inputsetup.b.a.X
                me.magnum.melonds.ui.inputsetup.b$a r1 = me.magnum.melonds.ui.inputsetup.b.a.Y
                me.magnum.melonds.ui.inputsetup.b$a[] r0 = new me.magnum.melonds.ui.inputsetup.b.a[]{r0, r1}
                return r0
        }

        static {
                me.magnum.melonds.ui.inputsetup.b$a r0 = new me.magnum.melonds.ui.inputsetup.b$a
                java.lang.String r1 = "X"
                r2 = 0
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.inputsetup.b.a.X = r0
                me.magnum.melonds.ui.inputsetup.b$a r0 = new me.magnum.melonds.ui.inputsetup.b$a
                java.lang.String r1 = "Y"
                r2 = 1
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.inputsetup.b.a.Y = r0
                me.magnum.melonds.ui.inputsetup.b$a[] r0 = $values()
                me.magnum.melonds.ui.inputsetup.b.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.ui.inputsetup.b.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.ui.inputsetup.b.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.ui.inputsetup.b.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.ui.inputsetup.b$a> r0 = me.magnum.melonds.ui.inputsetup.b.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.ui.inputsetup.b$a r1 = (me.magnum.melonds.ui.inputsetup.b.a) r1
                return r1
        }

        public static me.magnum.melonds.ui.inputsetup.b.a[] values() {
                me.magnum.melonds.ui.inputsetup.b$a[] r0 = me.magnum.melonds.ui.inputsetup.b.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.ui.inputsetup.b$a[] r0 = (me.magnum.melonds.ui.inputsetup.b.a[]) r0
                return r0
        }
    }

    public b(defpackage.kd6 r3, defpackage.p06 r4, defpackage.v46 r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r2.<init>()
            r2.b = r3
            r2.c = r4
            java.lang.String r4 = "rom"
            java.lang.Object r4 = r5.a(r4)
            wz5 r4 = (defpackage.wz5) r4
            r5 = 0
            if (r4 == 0) goto L1e
            pq5 r4 = r4.A
            goto L1f
        L1e:
            r4 = r5
        L1f:
            r2.d = r4
            if (r4 == 0) goto L2b
            jt5 r4 = r4.f
            if (r4 == 0) goto L2b
            u41 r4 = r4.h
            if (r4 != 0) goto L3c
        L2b:
            ng6 r3 = (defpackage.ng6) r3
            ex6 r3 = r3.g
            java.lang.Object r3 = r3.getValue()
            tp6 r3 = (defpackage.tp6) r3
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            u41 r4 = (defpackage.u41) r4
        L3c:
            u41 r3 = r4.a()
            java.util.ArrayList r3 = r3.b
            tp6 r3 = defpackage.up6.a(r3)
            r2.e = r3
            de5 r0 = new de5
            r0.<init>(r3)
            r2.f = r0
            kk6 r3 = r4.a
            tp6 r3 = defpackage.up6.a(r3)
            r2.g = r3
            de5 r4 = new de5
            r4.<init>(r3)
            r2.h = r4
            tp6 r3 = defpackage.up6.a(r5)
            r2.i = r3
            de5 r4 = new de5
            r4.<init>(r3)
            r2.j = r4
            tp6 r3 = defpackage.up6.a(r5)
            r2.k = r3
            de5 r4 = new de5
            r4.<init>(r3)
            r2.l = r4
            of6 r3 = defpackage.bl2.a()
            r2.m = r3
            be5 r4 = new be5
            r4.<init>(r3)
            r2.n = r4
            pq5 r3 = r2.d
            if (r3 == 0) goto L98
            as0 r4 = defpackage.to7.a(r2)
            xd1 r0 = new xd1
            r1 = 20
            r0.<init>(r2, r3, r5, r1)
            r2 = 3
            defpackage.hv.L(r4, r5, r5, r0, r2)
        L98:
            return
    }

    public final void e(defpackage.b63 r5) {
            r4 = this;
            tp6 r0 = r4.e
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Ld:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r1.next()
            i63 r3 = (defpackage.i63) r3
            b63 r3 = r3.a
            if (r3 != r5) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto Ld
        L21:
            r2 = -1
        L22:
            java.lang.Object r5 = r0.getValue()
            java.util.List r5 = (java.util.List) r5
            int r2 = r2 + 1
            java.lang.Object r5 = defpackage.gt0.K0(r2, r5)
            i63 r5 = (defpackage.i63) r5
            if (r5 == 0) goto L39
            of6 r4 = r4.m
            b63 r5 = r5.a
            r4.k(r5)
        L39:
            return
    }

    public final void f(java.util.List r24, defpackage.kk6 r25) {
            r23 = this;
            r0 = r23
            u41 r10 = new u41
            r1 = r24
            r2 = r25
            r10.<init>(r1, r2)
            r1 = 1
            r0.o = r1
            pq5 r1 = r0.d
            if (r1 == 0) goto L4b
            jt5 r2 = r1.f
            nx5 r9 = defpackage.nx5.CUSTOM
            r20 = 0
            r21 = 261951(0x3ff3f, float:3.67072E-40)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            jt5 r14 = defpackage.jt5.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            p06 r2 = r0.c
            xb2 r2 = (defpackage.xb2) r2
            r2.B(r1, r14)
            r21 = 0
            r22 = 8159(0x1fdf, float:1.1433E-41)
            r16 = 0
            r18 = 0
            r20 = 0
            r11 = r1
            pq5 r1 = defpackage.pq5.a(r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22)
            r0.d = r1
            return
        L4b:
            kd6 r0 = r0.b
            r1 = r0
            ng6 r1 = (defpackage.ng6) r1
            r1.getClass()
            ex6 r0 = r1.g
            java.lang.Object r0 = r0.getValue()
            tp6 r0 = (defpackage.tp6) r0
            r0.getClass()
            r2 = 0
            r0.m(r2, r10)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lb5
            android.content.Context r2 = r1.a     // Catch: java.lang.Exception -> Lb5
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r3 = "controller_config.json"
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> Lb5
            v41$b r2 = defpackage.v41.Companion     // Catch: java.lang.Exception -> Lb5
            r2.getClass()     // Catch: java.lang.Exception -> Lb5
            v41 r3 = defpackage.v41.b.a(r10)     // Catch: java.lang.Exception -> Lb5
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lb5
            r4.<init>(r0)     // Catch: java.lang.Exception -> Lb5
            id3 r0 = r1.c     // Catch: java.lang.Throwable -> Ld8
            gg3 r2 = r2.serializer()     // Catch: java.lang.Throwable -> Ld8
            gg3 r2 = (defpackage.gg3) r2     // Catch: java.lang.Throwable -> Ld8
            r2.getClass()     // Catch: java.lang.Throwable -> Ld8
            aj r5 = new aj     // Catch: java.lang.Throwable -> Ld8
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r6 = r5.R     // Catch: java.lang.Throwable -> Ld8
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> Ld8
            defpackage.oi2.v(r0, r5, r2, r3)     // Catch: java.lang.Throwable -> Lb7
            r5.b()     // Catch: java.lang.Throwable -> Ld8
            jm0 r0 = defpackage.jm0.c     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r2 = r5.X     // Catch: java.lang.Throwable -> Ld8
            char[] r2 = (char[]) r2     // Catch: java.lang.Throwable -> Ld8
            r0.getClass()     // Catch: java.lang.Throwable -> Ld8
            r2.getClass()     // Catch: java.lang.Throwable -> Ld8
            r0.b(r2)     // Catch: java.lang.Throwable -> Ld8
            v90 r0 = defpackage.v90.c     // Catch: java.lang.Throwable -> Ld8
            r0.getClass()     // Catch: java.lang.Throwable -> Ld8
            r6.getClass()     // Catch: java.lang.Throwable -> Ld8
            r0.a(r6)     // Catch: java.lang.Throwable -> Ld8
            r4.close()     // Catch: java.lang.Exception -> Lb5
            goto Le7
        Lb5:
            r0 = move-exception
            goto Le0
        Lb7:
            r0 = move-exception
            r5.b()     // Catch: java.lang.Throwable -> Ld8
            jm0 r2 = defpackage.jm0.c     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r3 = r5.X     // Catch: java.lang.Throwable -> Ld8
            char[] r3 = (char[]) r3     // Catch: java.lang.Throwable -> Ld8
            r2.getClass()     // Catch: java.lang.Throwable -> Ld8
            r3.getClass()     // Catch: java.lang.Throwable -> Ld8
            r2.b(r3)     // Catch: java.lang.Throwable -> Ld8
            v90 r2 = defpackage.v90.c     // Catch: java.lang.Throwable -> Ld8
            r2.getClass()     // Catch: java.lang.Throwable -> Ld8
            r6.getClass()     // Catch: java.lang.Throwable -> Ld8
            r2.a(r6)     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        Ld6:
            r2 = r0
            goto Lda
        Ld8:
            r0 = move-exception
            goto Ld6
        Lda:
            throw r2     // Catch: java.lang.Throwable -> Ldb
        Ldb:
            r0 = move-exception
            defpackage.ge7.t(r4, r2)     // Catch: java.lang.Exception -> Lb5
            throw r0     // Catch: java.lang.Exception -> Lb5
        Le0:
            java.lang.String r2 = "SPSettingsRepository"
            java.lang.String r3 = "Failed to save controller configuration"
            android.util.Log.w(r2, r3, r0)
        Le7:
            jd6 r0 = r1.e
            r0.i()
            return
    }

    public final void g(defpackage.b63 r9, defpackage.h63 r10) {
            r8 = this;
            tp6 r0 = r8.e
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Ld:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r1.next()
            i63 r3 = (defpackage.i63) r3
            b63 r3 = r3.a
            if (r3 != r9) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto Ld
        L21:
            r2 = -1
        L22:
            if (r2 < 0) goto L9c
        L24:
            java.lang.Object r9 = r0.getValue()
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = defpackage.gt0.m1(r1)
            java.lang.Object r3 = r1.get(r2)
            i63 r3 = (defpackage.i63) r3
            h63 r4 = r3.b
            h63 r5 = r3.c
            g63 r6 = defpackage.g63.a
            boolean r7 = r10.equals(r6)
            if (r7 == 0) goto L44
            r4 = r6
            r5 = r4
            goto L7e
        L44:
            boolean r7 = r10 instanceof defpackage.f63
            if (r7 == 0) goto L60
            boolean r7 = defpackage.nb3.k(r4, r6)
            if (r7 != 0) goto L7d
            boolean r7 = defpackage.nb3.k(r4, r10)
            if (r7 == 0) goto L55
            goto L7d
        L55:
            boolean r6 = defpackage.nb3.k(r5, r6)
            if (r6 != 0) goto L7b
            boolean r5 = defpackage.nb3.k(r5, r10)
            goto L7b
        L60:
            boolean r7 = r10 instanceof defpackage.e63
            if (r7 == 0) goto L98
            boolean r7 = defpackage.nb3.k(r4, r6)
            if (r7 != 0) goto L7d
            boolean r7 = defpackage.nb3.k(r4, r10)
            if (r7 == 0) goto L71
            goto L7d
        L71:
            boolean r6 = defpackage.nb3.k(r5, r6)
            if (r6 != 0) goto L7b
            boolean r5 = defpackage.nb3.k(r5, r10)
        L7b:
            r5 = r10
            goto L7e
        L7d:
            r4 = r10
        L7e:
            r6 = 1
            i63 r3 = defpackage.i63.a(r3, r4, r5, r6)
            r1.set(r2, r3)
            tp6 r3 = r8.g
            java.lang.Object r3 = r3.getValue()
            kk6 r3 = (defpackage.kk6) r3
            r8.f(r1, r3)
            boolean r9 = r0.j(r9, r1)
            if (r9 == 0) goto L24
            goto L9c
        L98:
            defpackage.i.d()
            return
        L9c:
            tp6 r8 = r8.i
            r9 = 0
            r8.l(r9)
            return
    }

    public final void h(defpackage.kk6 r3) {
            r2 = this;
            tp6 r0 = r2.g
            r0.getClass()
            r1 = 0
            r0.m(r1, r3)
            tp6 r0 = r2.e
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r2.f(r0, r3)
            return
    }
}
