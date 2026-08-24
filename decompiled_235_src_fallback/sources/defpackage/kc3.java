package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kc3  reason: default package */
/* loaded from: classes.dex */
public final class kc3 implements defpackage.ee7 {
    public static final defpackage.ic3 a = null;
    public static final defpackage.ic3 b = null;
    public static final defpackage.ic3 c = null;
    public static final defpackage.ic3 d = null;
    public static final defpackage.ic3 e = null;
    public static final defpackage.ic3 f = null;
    public static final defpackage.ic3 g = null;
    public static final defpackage.ic3 h = null;
    public static final defpackage.xc7 i = null;
    public static final defpackage.kc3.b j = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: kc3$a */
    /* loaded from: classes.dex */
    public class a extends defpackage.yc7 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // defpackage.yc7
        public final java.lang.Object b(defpackage.hf3 r4) {
                r3 = this;
                r4.h()
                r3 = 0
                r0 = r3
            L5:
                jf3 r1 = r4.n0()
                jf3 r2 = defpackage.jf3.END_OBJECT
                if (r1 == r2) goto L36
                java.lang.String r1 = r4.c0()
                r1.getClass()
                java.lang.String r2 = "totalSeconds"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L2d
                java.lang.String r2 = "id"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L28
                r4.u0()
                goto L5
            L28:
                java.lang.String r3 = r4.l0()
                goto L5
            L2d:
                int r0 = r4.Z()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L5
            L36:
                r4.u()
                if (r3 == 0) goto L40
                java.time.ZoneId r3 = defpackage.jc3.j(r3)
                return r3
            L40:
                if (r0 == 0) goto L4b
                int r3 = r0.intValue()
                java.time.ZoneOffset r3 = defpackage.jc3.l(r3)
                return r3
            L4b:
                ne3 r3 = new ne3
                java.lang.String r4 = r4.D()
                java.lang.String r0 = "Missing id or totalSeconds field; at path "
                java.lang.String r4 = r0.concat(r4)
                r3.<init>(r4)
                throw r3
        }

        @Override // defpackage.yc7
        public final void c(defpackage.vf3 r3, java.lang.Object r4) {
                r2 = this;
                java.time.ZoneId r2 = defpackage.jc3.i(r4)
                boolean r4 = defpackage.jc3.q(r2)
                if (r4 == 0) goto L22
                r3.k()
                java.lang.String r4 = "totalSeconds"
                r3.v(r4)
                java.time.ZoneOffset r2 = defpackage.jc3.m(r2)
                int r2 = defpackage.jc3.b(r2)
                long r0 = (long) r2
                r3.X(r0)
                r3.u()
                return
            L22:
                r3.k()
                java.lang.String r4 = "id"
                r3.v(r4)
                java.lang.String r2 = defpackage.jc3.d(r2)
                r3.c0(r2)
                r3.u()
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: kc3$b */
    /* loaded from: classes.dex */
    public class b implements defpackage.zc7 {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // defpackage.zc7
        public final defpackage.yc7 a(defpackage.su2 r3, defpackage.ie7 r4) {
                r2 = this;
                java.lang.Class r2 = r4.a
                java.lang.String r4 = r2.getName()
                java.lang.String r0 = "java.time."
                boolean r4 = r4.startsWith(r0)
                if (r4 != 0) goto L10
                goto Lf0
            L10:
                java.lang.Class r4 = defpackage.jc3.c()
                if (r2 != r4) goto L19
                ic3 r2 = defpackage.kc3.a
                return r2
            L19:
                java.lang.Class r4 = defpackage.jc3.x()
                if (r2 != r4) goto L22
                ic3 r2 = defpackage.kc3.b
                return r2
            L22:
                java.lang.Class r4 = defpackage.wa2.l()
                if (r2 != r4) goto L2b
                ic3 r2 = defpackage.kc3.c
                return r2
            L2b:
                java.lang.Class r4 = defpackage.wa2.A()
                if (r2 != r4) goto L34
                ic3 r2 = defpackage.kc3.d
                return r2
            L34:
                java.lang.Class r4 = defpackage.jc3.y()
                if (r2 != r4) goto L3f
                xc7 r2 = defpackage.kc3.b(r3)
                return r2
            L3f:
                java.lang.Class r4 = defpackage.jc3.z()
                if (r2 != r4) goto L48
                ic3 r2 = defpackage.kc3.e
                return r2
            L48:
                java.lang.Class r4 = defpackage.jc3.A()
                r0 = 1
                if (r2 != r4) goto L6a
                xc7 r2 = defpackage.kc3.b(r3)
                java.lang.Class r4 = defpackage.wa2.C()
                ie7 r1 = new ie7
                r1.<init>(r4)
                yc7 r3 = r3.d(r1)
                et0 r4 = new et0
                r4.<init>(r0, r2, r3)
                xc7 r2 = r4.a()
                return r2
            L6a:
                java.lang.Class r4 = defpackage.jc3.B()
                if (r2 != r4) goto L99
                ic3 r2 = defpackage.kc3.a
                java.lang.Class r2 = defpackage.wa2.A()
                r3.getClass()
                ie7 r4 = new ie7
                r4.<init>(r2)
                yc7 r2 = r3.d(r4)
                java.lang.Class r4 = defpackage.wa2.C()
                ie7 r1 = new ie7
                r1.<init>(r4)
                yc7 r3 = r3.d(r1)
                nc3 r4 = new nc3
                r4.<init>(r2, r3, r0)
                xc7 r2 = r4.a()
                return r2
            L99:
                java.lang.Class r4 = defpackage.jc3.C()
                if (r2 != r4) goto La2
                ic3 r2 = defpackage.kc3.f
                return r2
            La2:
                java.lang.Class r4 = defpackage.jc3.D()
                if (r2 != r4) goto Lab
                ic3 r2 = defpackage.kc3.g
                return r2
            Lab:
                java.lang.Class r4 = defpackage.jc3.s()
                if (r2 != r4) goto Lb4
                ic3 r2 = defpackage.kc3.h
                return r2
            Lb4:
                java.lang.Class r4 = defpackage.wa2.D()
                if (r2 == r4) goto Lf2
                java.lang.Class r4 = defpackage.wa2.C()
                if (r2 != r4) goto Lc1
                goto Lf2
            Lc1:
                java.lang.Class r4 = defpackage.jc3.w()
                if (r2 != r4) goto Lf0
                xc7 r2 = defpackage.kc3.b(r3)
                java.lang.Class r4 = defpackage.wa2.C()
                ie7 r0 = new ie7
                r0.<init>(r4)
                yc7 r4 = r3.d(r0)
                java.lang.Class r0 = defpackage.wa2.D()
                ie7 r1 = new ie7
                r1.<init>(r0)
                yc7 r3 = r3.d(r1)
                lc3 r0 = new lc3
                r1 = 0
                r0.<init>(r2, r4, r3, r1)
                xc7 r2 = r0.a()
                return r2
            Lf0:
                r2 = 0
                return r2
            Lf2:
                xc7 r2 = defpackage.kc3.i
                return r2
        }
    }

    static {
            ic3 r0 = new ic3
            java.lang.String r1 = "seconds"
            java.lang.String r2 = "nanos"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2}
            r4 = 2
            r0.<init>(r3, r4)
            defpackage.kc3.a = r0
            ic3 r0 = new ic3
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.kc3.b = r0
            ic3 r0 = new ic3
            java.lang.String r1 = "year"
            java.lang.String r2 = "month"
            java.lang.String r3 = "day"
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r3}
            r5 = 4
            r0.<init>(r4, r5)
            defpackage.kc3.c = r0
            ic3 r0 = new ic3
            java.lang.String r4 = "second"
            java.lang.String r5 = "nano"
            java.lang.String r6 = "hour"
            java.lang.String r7 = "minute"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r4, r5}
            r5 = 5
            r0.<init>(r4, r5)
            defpackage.kc3.d = r0
            ic3 r0 = new ic3
            java.lang.String[] r3 = new java.lang.String[]{r2, r3}
            r4 = 6
            r0.<init>(r3, r4)
            defpackage.kc3.e = r0
            ic3 r0 = new ic3
            java.lang.String r3 = "months"
            java.lang.String r4 = "days"
            java.lang.String r5 = "years"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            r4 = 7
            r0.<init>(r3, r4)
            defpackage.kc3.f = r0
            ic3 r0 = new ic3
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r4 = 0
            r0.<init>(r3, r4)
            defpackage.kc3.g = r0
            ic3 r0 = new ic3
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.kc3.h = r0
            kc3$a r0 = new kc3$a
            r0.<init>()
            xc7 r0 = r0.a()
            defpackage.kc3.i = r0
            kc3$b r0 = new kc3$b
            r0.<init>()
            defpackage.kc3.j = r0
            return
    }

    public kc3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.io.Serializable r2, java.lang.String r3, defpackage.hf3 r4) {
            if (r2 == 0) goto L3
            return
        L3:
            ne3 r2 = new ne3
            java.lang.String r0 = "Missing "
            java.lang.String r1 = " field; at path "
            java.lang.StringBuilder r3 = defpackage.i61.t(r0, r3, r1)
            java.lang.String r4 = r4.D()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static defpackage.xc7 b(defpackage.su2 r3) {
            java.lang.Class r0 = defpackage.wa2.l()
            r3.getClass()
            ie7 r1 = new ie7
            r1.<init>(r0)
            yc7 r0 = r3.d(r1)
            java.lang.Class r1 = defpackage.wa2.A()
            ie7 r2 = new ie7
            r2.<init>(r1)
            yc7 r3 = r3.d(r2)
            nc3 r1 = new nc3
            r2 = 0
            r1.<init>(r0, r3, r2)
            xc7 r3 = r1.a()
            return r3
    }
}
