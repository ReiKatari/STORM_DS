package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo6  reason: default package */
/* loaded from: classes.dex */
public final class fo6 {
    public static final defpackage.wq1 p = null;
    public static final defpackage.wq1 q = null;
    public static final defpackage.wq1 r = null;
    public static final defpackage.wq1 s = null;
    public static final defpackage.wq1 t = null;
    public static final defpackage.wq1 u = null;
    public float a;
    public float b;
    public boolean c;
    public final defpackage.xe6 d;
    public final defpackage.jw2 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;
    public defpackage.go6 m;
    public float n;
    public boolean o;

    static {
            wq1 r0 = new wq1
            r1 = 1
            r0.<init>(r1)
            defpackage.fo6.p = r0
            wq1 r0 = new wq1
            r1 = 2
            r0.<init>(r1)
            defpackage.fo6.q = r0
            wq1 r0 = new wq1
            r1 = 3
            r0.<init>(r1)
            defpackage.fo6.r = r0
            wq1 r0 = new wq1
            r1 = 4
            r0.<init>(r1)
            defpackage.fo6.s = r0
            wq1 r0 = new wq1
            r1 = 5
            r0.<init>(r1)
            defpackage.fo6.t = r0
            wq1 r0 = new wq1
            r1 = 0
            r0.<init>(r1)
            defpackage.fo6.u = r0
            return
    }

    public fo6(defpackage.fe2 r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4.b = r0
            r1 = 0
            r4.c = r1
            r4.f = r1
            r4.g = r0
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4.h = r2
            r2 = 0
            r4.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.l = r2
            r2 = 0
            r4.d = r2
            xq1 r3 = new xq1
            r3.<init>(r5)
            r4.e = r3
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.j = r5
            r4.m = r2
            r4.n = r0
            r4.o = r1
            return
    }

    public fo6(defpackage.xe6 r5, defpackage.jw2 r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4.b = r0
            r1 = 0
            r4.c = r1
            r4.f = r1
            r4.g = r0
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4.h = r2
            r2 = 0
            r4.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.l = r2
            r4.d = r5
            r4.e = r6
            wq1 r5 = defpackage.fo6.r
            if (r6 == r5) goto L57
            wq1 r5 = defpackage.fo6.s
            if (r6 == r5) goto L57
            wq1 r5 = defpackage.fo6.t
            if (r6 != r5) goto L3a
            goto L57
        L3a:
            wq1 r5 = defpackage.fo6.u
            if (r6 != r5) goto L43
            r5 = 998244352(0x3b800000, float:0.00390625)
            r4.j = r5
            goto L5c
        L43:
            wq1 r5 = defpackage.fo6.p
            if (r6 == r5) goto L51
            wq1 r5 = defpackage.fo6.q
            if (r6 != r5) goto L4c
            goto L51
        L4c:
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.j = r5
            goto L5c
        L51:
            r5 = 990057071(0x3b03126f, float:0.002)
            r4.j = r5
            goto L5c
        L57:
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r4.j = r5
        L5c:
            r5 = 0
            r4.m = r5
            r4.n = r0
            r4.o = r1
            return
    }

    public static defpackage.po b() {
            java.lang.ThreadLocal r0 = defpackage.po.i
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L16
            po r1 = new po
            u63 r2 = new u63
            r3 = 7
            r2.<init>(r3)
            r1.<init>(r2)
            r0.set(r1)
        L16:
            java.lang.Object r0 = r0.get()
            po r0 = (defpackage.po) r0
            return r0
    }

    public final void a(float r6) {
            r5 = this;
            boolean r0 = r5.f
            if (r0 == 0) goto L7
            r5.n = r6
            return
        L7:
            go6 r0 = r5.m
            if (r0 != 0) goto L12
            go6 r0 = new go6
            r0.<init>(r6)
            r5.m = r0
        L12:
            go6 r0 = r5.m
            double r1 = (double) r6
            r0.i = r1
            float r6 = (float) r1
            double r1 = (double) r6
            float r6 = r5.g
            double r3 = (double) r6
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto Ldc
            float r6 = r5.h
            double r3 = (double) r6
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto Ld6
            float r6 = r5.j
            r1 = 1061158912(0x3f400000, float:0.75)
            float r6 = r6 * r1
            double r1 = (double) r6
            double r1 = java.lang.Math.abs(r1)
            r0.d = r1
            r3 = 4633992910331707392(0x404f400000000000, double:62.5)
            double r1 = r1 * r3
            r0.e = r1
            po r6 = b()
            u63 r6 = r6.e
            r6.getClass()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Object r6 = r6.L
            android.os.Looper r6 = (android.os.Looper) r6
            java.lang.Thread r6 = r6.getThread()
            if (r0 != r6) goto Lce
            boolean r6 = r5.f
            if (r6 != 0) goto Lcd
            if (r6 != 0) goto Lcd
            r6 = 1
            r5.f = r6
            boolean r6 = r5.c
            if (r6 != 0) goto L69
            jw2 r6 = r5.e
            xe6 r0 = r5.d
            float r6 = r6.t(r0)
            r5.b = r6
        L69:
            float r6 = r5.b
            float r0 = r5.g
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto Lc8
            float r0 = r5.h
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto Lc8
            po r6 = b()
            java.util.ArrayList r0 = r6.b
            int r1 = r0.size()
            if (r1 != 0) goto Lbe
            u63 r1 = r6.e
            n0 r2 = r6.d
            java.lang.Object r1 = r1.B
            android.view.Choreographer r1 = (android.view.Choreographer) r1
            oo r3 = new oo
            r4 = 0
            r3.<init>(r2, r4)
            r1.postFrameCallback(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto Lbe
            float r1 = defpackage.o2.a()
            r6.g = r1
            u63 r1 = r6.h
            if (r1 != 0) goto Lac
            u63 r1 = new u63
            r2 = 6
            r1.<init>(r6, r2)
            r6.h = r1
        Lac:
            u63 r6 = r6.h
            java.lang.Object r1 = r6.B
            no r1 = (defpackage.no) r1
            if (r1 != 0) goto Lbe
            no r1 = new no
            r1.<init>(r6)
            r6.B = r1
            defpackage.o2.D(r1)
        Lbe:
            boolean r6 = r0.contains(r5)
            if (r6 != 0) goto Lcd
            r0.add(r5)
            return
        Lc8:
            java.lang.String r5 = "Starting value need to be in between min value and max value"
            defpackage.i.h(r5)
        Lcd:
            return
        Lce:
            android.util.AndroidRuntimeException r5 = new android.util.AndroidRuntimeException
            java.lang.String r6 = "Animations may only be started on the same thread as the animation handler"
            r5.<init>(r6)
            throw r5
        Ld6:
            java.lang.String r5 = "Final position of the spring cannot be less than the min value."
            defpackage.fa6.h(r5)
            return
        Ldc:
            java.lang.String r5 = "Final position of the spring cannot be greater than the max value."
            defpackage.fa6.h(r5)
            return
    }

    public final void c(float r8) {
            r7 = this;
            jw2 r0 = r7.e
            xe6 r1 = r7.d
            r0.F(r1, r8)
            r8 = 0
        L8:
            java.util.ArrayList r0 = r7.l
            int r1 = r0.size()
            if (r8 >= r1) goto L3e
            java.lang.Object r1 = r0.get(r8)
            if (r1 == 0) goto L3b
            java.lang.Object r0 = r0.get(r8)
            z97 r0 = (defpackage.z97) r0
            float r1 = r7.b
            qa7 r2 = r0.h
            long r3 = r2.t0
            r5 = 1
            long r3 = r3 + r5
            double r5 = (double) r1
            long r5 = java.lang.Math.round(r5)
            long r3 = java.lang.Math.min(r3, r5)
            r5 = -1
            long r3 = java.lang.Math.max(r5, r3)
            long r5 = r0.a
            r2.H(r3, r5)
            r0.a = r3
        L3b:
            int r8 = r8 + 1
            goto L8
        L3e:
            int r7 = r0.size()
            int r7 = r7 + (-1)
        L44:
            if (r7 < 0) goto L52
            java.lang.Object r8 = r0.get(r7)
            if (r8 != 0) goto L4f
            r0.remove(r7)
        L4f:
            int r7 = r7 + (-1)
            goto L44
        L52:
            return
    }

    public final void d() {
            r4 = this;
            go6 r0 = r4.m
            double r0 = r0.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L31
            po r0 = b()
            u63 r0 = r0.e
            r0.getClass()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Object r0 = r0.L
            android.os.Looper r0 = (android.os.Looper) r0
            java.lang.Thread r0 = r0.getThread()
            if (r1 != r0) goto L29
            boolean r0 = r4.f
            if (r0 == 0) goto L28
            r0 = 1
            r4.o = r0
        L28:
            return
        L29:
            android.util.AndroidRuntimeException r4 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Animations may only be started on the same thread as the animation handler"
            r4.<init>(r0)
            throw r4
        L31:
            java.lang.String r4 = "Spring animations can only come to an end when there is damping"
            defpackage.fa6.h(r4)
            return
    }
}
