package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx3  reason: default package */
/* loaded from: classes.dex */
public abstract class qx3 {
    public static final java.lang.Object k = null;
    public final java.lang.Object a;
    public final defpackage.s36 b;
    public int c;
    public boolean d;
    public volatile java.lang.Object e;
    public volatile java.lang.Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final defpackage.g15 j;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.qx3.k = r0
            return
    }

    public qx3() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.a = r0
            s36 r0 = new s36
            r0.<init>()
            r3.b = r0
            r0 = 0
            r3.c = r0
            java.lang.Object r0 = defpackage.qx3.k
            r3.f = r0
            g15 r1 = new g15
            r2 = 15
            r1.<init>(r3, r2)
            r3.j = r1
            r3.e = r0
            r0 = -1
            r3.g = r0
            return
    }

    public qx3(java.lang.Object r4) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.a = r0
            s36 r0 = new s36
            r0.<init>()
            r3.b = r0
            r0 = 0
            r3.c = r0
            java.lang.Object r1 = defpackage.qx3.k
            r3.f = r1
            g15 r1 = new g15
            r2 = 15
            r1.<init>(r3, r2)
            r3.j = r1
            r3.e = r4
            r3.g = r0
            return
    }

    public static void a(java.lang.String r2) {
            zt r0 = defpackage.zt.l0()
            sf1 r0 = r0.e
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L18
            return
        L18:
            java.lang.String r0 = "Cannot invoke "
            java.lang.String r1 = " on a background thread"
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            defpackage.i.m(r2)
            return
    }

    public final void b(defpackage.px3 r6) {
            r5 = this;
            boolean r0 = r5.h
            r1 = 1
            if (r0 == 0) goto L8
            r5.i = r1
            return
        L8:
            r5.h = r1
        La:
            r0 = 0
            r5.i = r0
            if (r6 == 0) goto L26
            boolean r1 = r6.b
            if (r1 != 0) goto L14
            goto L24
        L14:
            int r1 = r6.c
            int r2 = r5.g
            if (r1 < r2) goto L1b
            goto L24
        L1b:
            r6.c = r2
            fi4 r6 = r6.a
            java.lang.Object r1 = r5.e
            r6.a(r1)
        L24:
            r6 = 0
            goto L62
        L26:
            s36 r1 = r5.b
            r1.getClass()
            q36 r2 = new q36
            r2.<init>(r1)
            java.util.WeakHashMap r1 = r1.L
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
        L37:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            px3 r1 = (defpackage.px3) r1
            boolean r3 = r1.b
            if (r3 != 0) goto L4e
            goto L5e
        L4e:
            int r3 = r1.c
            int r4 = r5.g
            if (r3 < r4) goto L55
            goto L5e
        L55:
            r1.c = r4
            fi4 r1 = r1.a
            java.lang.Object r3 = r5.e
            r1.a(r3)
        L5e:
            boolean r1 = r5.i
            if (r1 == 0) goto L37
        L62:
            boolean r1 = r5.i
            if (r1 != 0) goto La
            r5.h = r0
            return
    }

    public final java.lang.Object c() {
            r1 = this;
            java.lang.Object r1 = r1.e
            java.lang.Object r0 = defpackage.qx3.k
            if (r1 == r0) goto L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    public final void d(defpackage.fi4 r4) {
            r3 = this;
            java.lang.String r0 = "observeForever"
            a(r0)
            px3 r0 = new px3
            r0.<init>(r3, r4)
            s36 r3 = r3.b
            p36 r1 = r3.a(r4)
            r2 = 1
            if (r1 == 0) goto L16
            java.lang.Object r3 = r1.B
            goto L30
        L16:
            p36 r1 = new p36
            r1.<init>(r4, r0)
            int r4 = r3.R
            int r4 = r4 + r2
            r3.R = r4
            p36 r4 = r3.B
            if (r4 != 0) goto L29
            r3.A = r1
            r3.B = r1
            goto L2f
        L29:
            r4.L = r1
            r1.R = r4
            r3.B = r1
        L2f:
            r3 = 0
        L30:
            px3 r3 = (defpackage.px3) r3
            if (r3 == 0) goto L35
            return
        L35:
            r0.a(r2)
            return
    }

    public final void e(defpackage.fi4 r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            a(r0)
            s36 r1 = r1.b
            java.lang.Object r1 = r1.b(r2)
            px3 r1 = (defpackage.px3) r1
            if (r1 != 0) goto L10
            return
        L10:
            r2 = 0
            r1.a(r2)
            return
    }

    public abstract void f(java.lang.Object r1);
}
