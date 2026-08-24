package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b0 {
    public defpackage.ao6 a;
    public defpackage.xn6 b;
    public final androidx.fragment.app.o c;
    public final java.util.ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final java.util.ArrayList j;
    public final java.util.ArrayList k;
    public final androidx.fragment.app.x l;

    public b0(defpackage.ao6 r2, defpackage.xn6 r3, androidx.fragment.app.x r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            androidx.fragment.app.o r0 = r4.c
            r0.getClass()
            r2.getClass()
            r3.getClass()
            r0.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            r2 = 1
            r1.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.j = r2
            r1.k = r2
            r1.l = r4
            return
    }

    public final void a(android.view.ViewGroup r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
            r3.h = r0
            boolean r0 = r3.e
            if (r0 == 0) goto Lb
            goto L3d
        Lb:
            r0 = 1
            r3.e = r0
            java.util.ArrayList r1 = r3.j
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            r3.b()
            return
        L1a:
            java.util.ArrayList r3 = r3.k
            java.util.List r3 = defpackage.gt0.k1(r3)
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            wn6 r1 = (defpackage.wn6) r1
            r1.getClass()
            boolean r2 = r1.b
            if (r2 != 0) goto L3a
            r1.b(r4)
        L3a:
            r1.b = r0
            goto L24
        L3d:
            return
    }

    public final void b() {
            r5 = this;
            r0 = 0
            r5.h = r0
            boolean r1 = r5.f
            if (r1 == 0) goto L8
            goto L3f
        L8:
            r1 = 2
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SpecialEffectsController: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " has called complete."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L27:
            r1 = 1
            r5.f = r1
            java.util.ArrayList r1 = r5.d
            int r2 = r1.size()
            r3 = r0
        L31:
            if (r3 >= r2) goto L3f
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L31
        L3f:
            androidx.fragment.app.o r1 = r5.c
            r1.mTransitioning = r0
            androidx.fragment.app.x r5 = r5.l
            r5.k()
            return
    }

    public final void c(defpackage.wn6 r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = r1.j
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto L14
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L14
            r1.b()
        L14:
            return
    }

    public final void d(defpackage.ao6 r7, defpackage.xn6 r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            int[] r0 = defpackage.bo6.a
            int r8 = r8.ordinal()
            r8 = r0[r8]
            androidx.fragment.app.o r0 = r6.c
            java.lang.String r1 = "SpecialEffectsController: For fragment "
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            r4 = 1
            if (r8 == r4) goto L8b
            java.lang.String r5 = " mFinalState = "
            if (r8 == r3) goto L54
            r4 = 3
            if (r8 == r4) goto L21
            goto Lbf
        L21:
            ao6 r8 = r6.a
            ao6 r4 = defpackage.ao6.REMOVED
            if (r8 == r4) goto Lbf
            boolean r8 = androidx.fragment.app.u.K(r3)
            if (r8 == 0) goto L51
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            r8.append(r0)
            r8.append(r5)
            ao6 r0 = r6.a
            r8.append(r0)
            java.lang.String r0 = " -> "
            r8.append(r0)
            r8.append(r7)
            r0 = 46
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r2, r8)
        L51:
            r6.a = r7
            return
        L54:
            boolean r7 = androidx.fragment.app.u.K(r3)
            if (r7 == 0) goto L80
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r0)
            r7.append(r5)
            ao6 r8 = r6.a
            r7.append(r8)
            java.lang.String r8 = " -> REMOVED. mLifecycleImpact  = "
            r7.append(r8)
            xn6 r8 = r6.b
            r7.append(r8)
            java.lang.String r8 = " to REMOVING."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r2, r7)
        L80:
            ao6 r7 = defpackage.ao6.REMOVED
            r6.a = r7
            xn6 r7 = defpackage.xn6.REMOVING
            r6.b = r7
            r6.i = r4
            return
        L8b:
            ao6 r7 = r6.a
            ao6 r8 = defpackage.ao6.REMOVED
            if (r7 != r8) goto Lbf
            boolean r7 = androidx.fragment.app.u.K(r3)
            if (r7 == 0) goto Lb5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r0)
            java.lang.String r8 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
            r7.append(r8)
            xn6 r8 = r6.b
            r7.append(r8)
            java.lang.String r8 = " to ADDING."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r2, r7)
        Lb5:
            ao6 r7 = defpackage.ao6.VISIBLE
            r6.a = r7
            xn6 r7 = defpackage.xn6.ADDING
            r6.b = r7
            r6.i = r4
        Lbf:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = "Operation {"
            java.lang.String r2 = "} {finalState = "
            java.lang.StringBuilder r0 = defpackage.i61.t(r1, r0, r2)
            ao6 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = " lifecycleImpact = "
            r0.append(r1)
            xn6 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = " fragment = "
            r0.append(r1)
            androidx.fragment.app.o r3 = r3.c
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
