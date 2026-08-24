package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xt7  reason: default package */
/* loaded from: classes.dex */
public final class xt7 extends android.view.WindowInsetsAnimation$Callback {
    public final defpackage.f55 a;
    public java.util.List b;
    public java.util.ArrayList c;
    public final java.util.HashMap d;

    public xt7(defpackage.f55 r2) {
            r1 = this;
            int r0 = r2.A
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            r1.a = r2
            return
    }

    public final defpackage.au7 a(android.view.WindowInsetsAnimation r6) {
            r5 = this;
            java.util.HashMap r5 = r5.d
            java.lang.Object r0 = r5.get(r6)
            au7 r0 = (defpackage.au7) r0
            if (r0 != 0) goto L1d
            au7 r0 = new au7
            r1 = 0
            r2 = 0
            r4 = 0
            r0.<init>(r4, r1, r2)
            yt7 r1 = new yt7
            r1.<init>(r6)
            r0.a = r1
            r5.put(r6, r0)
        L1d:
            return r0
    }

    public final void onEnd(android.view.WindowInsetsAnimation r3) {
            r2 = this;
            f55 r0 = r2.a
            au7 r1 = r2.a(r3)
            r0.i0(r1)
            java.util.HashMap r2 = r2.d
            r2.remove(r3)
            return
    }

    public final void onPrepare(android.view.WindowInsetsAnimation r2) {
            r1 = this;
            f55 r0 = r1.a
            au7 r1 = r1.a(r2)
            r0.j0(r1)
            return
    }

    public final android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.c
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r4.c = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r4.b = r0
            goto L19
        L16:
            r0.clear()
        L19:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L1f:
            if (r0 < 0) goto L3e
            java.lang.Object r1 = r6.get(r0)
            android.view.WindowInsetsAnimation r1 = defpackage.zm6.j(r1)
            au7 r2 = r4.a(r1)
            float r1 = defpackage.zm6.y(r1)
            zt7 r3 = r2.a
            r3.e(r1)
            java.util.ArrayList r1 = r4.c
            r1.add(r2)
            int r0 = r0 + (-1)
            goto L1f
        L3e:
            r6 = 0
            vu7 r5 = defpackage.vu7.g(r6, r5)
            java.util.List r6 = r4.b
            f55 r4 = r4.a
            vu7 r4 = r4.k0(r5, r6)
            android.view.WindowInsets r4 = r4.f()
            return r4
    }

    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r2, android.view.WindowInsetsAnimation.Bounds r3) {
            r1 = this;
            au7 r2 = r1.a(r2)
            rr6 r0 = new rr6
            r0.<init>(r3)
            f55 r1 = r1.a
            rr6 r1 = r1.l0(r2, r0)
            r1.getClass()
            defpackage.zm6.l()
            java.lang.Object r2 = r1.B
            e83 r2 = (defpackage.e83) r2
            android.graphics.Insets r2 = r2.e()
            java.lang.Object r1 = r1.L
            e83 r1 = (defpackage.e83) r1
            android.graphics.Insets r1 = r1.e()
            android.view.WindowInsetsAnimation$Bounds r1 = defpackage.zm6.h(r2, r1)
            return r1
    }
}
