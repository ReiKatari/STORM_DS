package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv7  reason: default package */
/* loaded from: classes.dex */
public final class dv7 {
    public static final java.util.WeakHashMap w = null;
    public final defpackage.bn a;
    public final defpackage.bn b;
    public final defpackage.bn c;
    public final defpackage.bn d;
    public final defpackage.bn e;
    public final defpackage.bn f;
    public final defpackage.bn g;
    public final defpackage.bn h;
    public final defpackage.bn i;
    public final defpackage.ok7 j;
    public final defpackage.vs4 k;
    public final defpackage.ig7 l;
    public final defpackage.ok7 m;
    public final defpackage.ok7 n;
    public final defpackage.ok7 o;
    public final defpackage.ok7 p;
    public final defpackage.ok7 q;
    public final defpackage.ok7 r;
    public final defpackage.ok7 s;
    public final boolean t;
    public int u;
    public final defpackage.k83 v;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            defpackage.dv7.w = r0
            return
    }

    public dv7(android.view.View r17) {
            r16 = this;
            r0 = r16
            r0.<init>()
            java.lang.String r1 = "captionBar"
            r2 = 4
            bn r1 = defpackage.th7.b(r2, r1)
            r0.a = r1
            java.lang.String r3 = "displayCutout"
            r4 = 128(0x80, float:1.8E-43)
            bn r3 = defpackage.th7.b(r4, r3)
            r0.b = r3
            java.lang.String r5 = "ime"
            r6 = 8
            bn r5 = defpackage.th7.b(r6, r5)
            r0.c = r5
            java.lang.String r7 = "mandatorySystemGestures"
            r8 = 32
            bn r7 = defpackage.th7.b(r8, r7)
            r0.d = r7
            java.lang.String r9 = "navigationBars"
            r10 = 2
            bn r9 = defpackage.th7.b(r10, r9)
            r0.e = r9
            java.lang.String r11 = "statusBars"
            r12 = 1
            bn r11 = defpackage.th7.b(r12, r11)
            r0.f = r11
            java.lang.String r13 = "systemBars"
            r14 = 519(0x207, float:7.27E-43)
            bn r13 = defpackage.th7.b(r14, r13)
            r0.g = r13
            java.lang.String r15 = "systemGestures"
            r8 = 16
            bn r15 = defpackage.th7.b(r8, r15)
            r0.h = r15
            java.lang.String r8 = "tappableElement"
            r6 = 64
            bn r8 = defpackage.th7.b(r6, r8)
            r0.i = r8
            ok7 r4 = new ok7
            p83 r6 = new p83
            r14 = 0
            r6.<init>(r14, r14, r14, r14)
            java.lang.String r14 = "waterfall"
            r4.<init>(r6, r14)
            r0.j = r4
            r6 = 0
            vs4 r14 = defpackage.np2.Y(r6)
            r0.k = r14
            ig7 r14 = new ig7
            r14.<init>(r13, r5)
            ig7 r6 = new ig7
            r6.<init>(r14, r3)
            r0.l = r6
            ig7 r14 = new ig7
            r14.<init>(r8, r7)
            ig7 r12 = new ig7
            r12.<init>(r14, r15)
            ig7 r14 = new ig7
            r14.<init>(r12, r4)
            ig7 r4 = new ig7
            r4.<init>(r6, r14)
            java.lang.String r4 = "captionBarIgnoringVisibility"
            ok7 r4 = defpackage.th7.c(r2, r4)
            r0.m = r4
            java.lang.String r4 = "navigationBarsIgnoringVisibility"
            ok7 r4 = defpackage.th7.c(r10, r4)
            r0.n = r4
            java.lang.String r4 = "statusBarsIgnoringVisibility"
            r6 = 1
            ok7 r4 = defpackage.th7.c(r6, r4)
            r0.o = r4
            java.lang.String r4 = "systemBarsIgnoringVisibility"
            r6 = 519(0x207, float:7.27E-43)
            ok7 r4 = defpackage.th7.c(r6, r4)
            r0.p = r4
            java.lang.String r4 = "tappableElementIgnoringVisibility"
            r6 = 64
            ok7 r4 = defpackage.th7.c(r6, r4)
            r0.q = r4
            ok7 r4 = new ok7
            p83 r6 = new p83
            r12 = 0
            r6.<init>(r12, r12, r12, r12)
            java.lang.String r14 = "imeAnimationTarget"
            r4.<init>(r6, r14)
            r0.r = r4
            ok7 r4 = new ok7
            p83 r6 = new p83
            r6.<init>(r12, r12, r12, r12)
            java.lang.String r14 = "imeAnimationSource"
            r4.<init>(r6, r14)
            r0.s = r4
            android.view.ViewParent r4 = r17.getParent()
            boolean r6 = r4 instanceof android.view.View
            if (r6 == 0) goto Le7
            android.view.View r4 = (android.view.View) r4
            goto Le8
        Le7:
            r4 = 0
        Le8:
            if (r4 == 0) goto Lf2
            r6 = 2131427511(0x7f0b00b7, float:1.847664E38)
            java.lang.Object r4 = r4.getTag(r6)
            goto Lf3
        Lf2:
            r4 = 0
        Lf3:
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto Lfb
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto Lfc
        Lfb:
            r6 = 0
        Lfc:
            if (r6 == 0) goto L103
            boolean r14 = r6.booleanValue()
            goto L104
        L103:
            r14 = r12
        L104:
            r0.t = r14
            k83 r4 = new k83
            r4.<init>(r0)
            r0.v = r4
            java.util.WeakHashMap r0 = defpackage.ao7.a
            vu7 r0 = defpackage.tn7.a(r17)
            if (r0 == 0) goto L163
            ru7 r0 = r0.a
            boolean r2 = r0.t(r2)
            r1.f(r2)
            r1 = 128(0x80, float:1.8E-43)
            boolean r1 = r0.t(r1)
            r3.f(r1)
            r1 = 8
            boolean r1 = r0.t(r1)
            r5.f(r1)
            r1 = 32
            boolean r1 = r0.t(r1)
            r7.f(r1)
            boolean r1 = r0.t(r10)
            r9.f(r1)
            r6 = 1
            boolean r1 = r0.t(r6)
            r11.f(r1)
            r6 = 519(0x207, float:7.27E-43)
            boolean r1 = r0.t(r6)
            r13.f(r1)
            r1 = 16
            boolean r1 = r0.t(r1)
            r15.f(r1)
            r6 = 64
            boolean r0 = r0.t(r6)
            r8.f(r0)
        L163:
            return
    }

    public static void b(defpackage.dv7 r5, defpackage.vu7 r6) {
            bn r0 = r5.a
            r1 = 0
            r0.g(r6, r1)
            bn r0 = r5.c
            r0.g(r6, r1)
            bn r0 = r5.b
            r0.g(r6, r1)
            bn r0 = r5.e
            r0.g(r6, r1)
            bn r0 = r5.f
            r0.g(r6, r1)
            bn r0 = r5.g
            r0.g(r6, r1)
            bn r0 = r5.h
            r0.g(r6, r1)
            bn r0 = r5.i
            r0.g(r6, r1)
            bn r0 = r5.d
            r0.g(r6, r1)
            ok7 r0 = r5.m
            r2 = 4
            ru7 r3 = r6.a
            e83 r2 = r3.i(r2)
            p83 r2 = defpackage.jv7.b(r2)
            r0.f(r2)
            ok7 r0 = r5.n
            ru7 r2 = r6.a
            r3 = 2
            e83 r2 = r2.i(r3)
            p83 r2 = defpackage.jv7.b(r2)
            r0.f(r2)
            ok7 r0 = r5.o
            ru7 r2 = r6.a
            r3 = 1
            e83 r2 = r2.i(r3)
            p83 r2 = defpackage.jv7.b(r2)
            r0.f(r2)
            ok7 r0 = r5.p
            r2 = 519(0x207, float:7.27E-43)
            ru7 r4 = r6.a
            e83 r2 = r4.i(r2)
            p83 r2 = defpackage.jv7.b(r2)
            r0.f(r2)
            ok7 r0 = r5.q
            r2 = 64
            ru7 r4 = r6.a
            e83 r2 = r4.i(r2)
            p83 r2 = defpackage.jv7.b(r2)
            r0.f(r2)
            ru7 r6 = r6.a
            yk1 r6 = r6.g()
            ok7 r0 = r5.j
            if (r6 == 0) goto L8f
            e83 r2 = r6.a()
            goto L91
        L8f:
            e83 r2 = defpackage.e83.e
        L91:
            p83 r2 = defpackage.jv7.b(r2)
            r0.f(r2)
            r0 = 0
            if (r6 == 0) goto Lb0
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r2 < r4) goto La8
            android.view.DisplayCutout r6 = r6.a
            android.graphics.Path r6 = defpackage.up.d(r6)
            goto La9
        La8:
            r6 = r0
        La9:
            if (r6 == 0) goto Lb0
            hj r0 = new hj
            r0.<init>(r6)
        Lb0:
            vs4 r5 = r5.k
            r5.setValue(r0)
            java.lang.Object r5 = defpackage.bm6.c
            monitor-enter(r5)
            os2 r6 = defpackage.bm6.j     // Catch: java.lang.Throwable -> Lcc
            ka4 r6 = r6.h     // Catch: java.lang.Throwable -> Lcc
            if (r6 == 0) goto Lc5
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> Lcc
            if (r6 != r3) goto Lc5
            r1 = r3
        Lc5:
            monitor-exit(r5)
            if (r1 == 0) goto Lcb
            defpackage.bm6.a()
        Lcb:
            return
        Lcc:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final void a(android.view.View r3) {
            r2 = this;
            int r0 = r2.u
            if (r0 != 0) goto L1a
            java.util.WeakHashMap r0 = defpackage.ao7.a
            k83 r0 = r2.v
            defpackage.sn7.c(r3, r0)
            boolean r1 = r3.isAttachedToWindow()
            if (r1 == 0) goto L14
            r3.requestApplyInsets()
        L14:
            r3.addOnAttachStateChangeListener(r0)
            defpackage.ao7.p(r3, r0)
        L1a:
            int r3 = r2.u
            int r3 = r3 + 1
            r2.u = r3
            return
    }
}
