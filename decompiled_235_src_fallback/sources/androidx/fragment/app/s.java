package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class s extends defpackage.dl4 {
    public final /* synthetic */ androidx.fragment.app.u d;

    public s(androidx.fragment.app.u r1) {
            r0 = this;
            r0.d = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.dl4
    public final void a() {
            r4 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.u.K(r0)
            androidx.fragment.app.u r4 = r4.d
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager "
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "cancelBackStackTransition for transition "
            r0.<init>(r1)
            androidx.fragment.app.a r1 = r4.h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L35:
            androidx.fragment.app.a r0 = r4.h
            if (r0 == 0) goto L6b
            r1 = 0
            r0.u = r1
            r0.g()
            androidx.fragment.app.a r0 = r4.h
            n0 r2 = new n0
            r3 = 27
            r2.<init>(r4, r3)
            java.util.ArrayList r3 = r0.s
            if (r3 != 0) goto L53
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.s = r3
        L53:
            java.util.ArrayList r0 = r0.s
            r0.add(r2)
            androidx.fragment.app.a r0 = r4.h
            r0.h()
            r0 = 1
            r4.i = r0
            r4.z(r0)
            r4.E()
            r4.i = r1
            r0 = 0
            r4.h = r0
        L6b:
            return
    }

    @Override // defpackage.dl4
    public final void b() {
            r12 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.u.K(r0)
            androidx.fragment.app.u r12 = r12.d
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager "
            r1.<init>(r3)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            androidx.fragment.app.s r1 = r12.j
            java.util.ArrayList r3 = r12.n
            r4 = 1
            r12.i = r4
            r12.z(r4)
            r5 = 0
            r12.i = r5
            androidx.fragment.app.a r6 = r12.h
            if (r6 == 0) goto Lfd
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L61
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            androidx.fragment.app.a r7 = r12.h
            java.util.HashSet r7 = androidx.fragment.app.u.F(r7)
            r6.<init>(r7)
            int r7 = r3.size()
            r8 = r5
        L43:
            if (r8 >= r7) goto L61
            java.lang.Object r9 = r3.get(r8)
            int r8 = r8 + 1
            gd6 r9 = (defpackage.gd6) r9
            java.util.Iterator r10 = r6.iterator()
        L51:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L43
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.o r11 = (androidx.fragment.app.o) r11
            r9.getClass()
            goto L51
        L61:
            androidx.fragment.app.a r3 = r12.h
            java.util.ArrayList r3 = r3.c
            int r6 = r3.size()
            r7 = r5
        L6a:
            if (r7 >= r6) goto L7b
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            ul2 r8 = (defpackage.ul2) r8
            androidx.fragment.app.o r8 = r8.b
            if (r8 == 0) goto L6a
            r8.mTransitioning = r5
            goto L6a
        L7b:
            java.util.ArrayList r3 = new java.util.ArrayList
            androidx.fragment.app.a r6 = r12.h
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r3.<init>(r6)
            java.util.HashSet r3 = r12.f(r3, r5, r4)
            java.util.Iterator r3 = r3.iterator()
        L8e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lae
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.h r4 = (androidx.fragment.app.h) r4
            java.util.ArrayList r6 = r4.c
            boolean r7 = androidx.fragment.app.u.K(r0)
            if (r7 == 0) goto La7
            java.lang.String r7 = "SpecialEffectsController: Completing Back "
            android.util.Log.d(r2, r7)
        La7:
            r4.m(r6)
            r4.c(r6)
            goto L8e
        Lae:
            androidx.fragment.app.a r3 = r12.h
            java.util.ArrayList r3 = r3.c
            int r4 = r3.size()
        Lb6:
            if (r5 >= r4) goto Ld0
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            ul2 r6 = (defpackage.ul2) r6
            androidx.fragment.app.o r6 = r6.b
            if (r6 == 0) goto Lb6
            android.view.ViewGroup r7 = r6.mContainer
            if (r7 != 0) goto Lb6
            androidx.fragment.app.x r6 = r12.g(r6)
            r6.k()
            goto Lb6
        Ld0:
            r3 = 0
            r12.h = r3
            r12.e0()
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto Lfc
            java.lang.String r0 = "Op is being set to null"
            android.util.Log.d(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "OnBackPressedCallback enabled="
            r0.<init>(r3)
            boolean r1 = r1.b
            r0.append(r1)
            java.lang.String r1 = " for  FragmentManager "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        Lfc:
            return
        Lfd:
            boolean r1 = r1.b
            if (r1 == 0) goto L110
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L10c
            java.lang.String r0 = "Calling popBackStackImmediate via onBackPressed callback"
            android.util.Log.d(r2, r0)
        L10c:
            r12.Q()
            return
        L110:
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L11b
            java.lang.String r0 = "Calling onBackPressed via onBackPressed callback"
            android.util.Log.d(r2, r0)
        L11b:
            il4 r12 = r12.g
            gl4 r12 = r12.c()
            r12.a()
            return
    }

    @Override // defpackage.dl4
    public final void c(defpackage.b00 r11) {
            r10 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.u.K(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.u r10 = r10.d
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager "
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1c:
            androidx.fragment.app.a r1 = r10.h
            if (r1 == 0) goto Lac
            java.util.ArrayList r1 = new java.util.ArrayList
            androidx.fragment.app.a r3 = r10.h
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r1.<init>(r3)
            r3 = 0
            r4 = 1
            java.util.HashSet r1 = r10.f(r1, r3, r4)
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L98
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.h r4 = (androidx.fragment.app.h) r4
            r4.getClass()
            boolean r5 = androidx.fragment.app.u.K(r0)
            if (r5 == 0) goto L5d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "SpecialEffectsController: Processing Progress "
            r5.<init>(r6)
            float r6 = r11.c
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L5d:
            java.util.ArrayList r5 = r4.c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r5.size()
            r8 = r3
        L69:
            if (r8 >= r7) goto L79
            java.lang.Object r9 = r5.get(r8)
            int r8 = r8 + 1
            androidx.fragment.app.b0 r9 = (androidx.fragment.app.b0) r9
            java.util.ArrayList r9 = r9.k
            defpackage.gt0.A0(r6, r9)
            goto L69
        L79:
            java.util.Set r5 = defpackage.gt0.p1(r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = defpackage.gt0.k1(r5)
            int r6 = r5.size()
            r7 = r3
        L88:
            if (r7 >= r6) goto L35
            java.lang.Object r8 = r5.get(r7)
            wn6 r8 = (defpackage.wn6) r8
            android.view.ViewGroup r9 = r4.a
            r8.d(r11, r9)
            int r7 = r7 + 1
            goto L88
        L98:
            java.util.ArrayList r10 = r10.n
            int r11 = r10.size()
        L9e:
            if (r3 >= r11) goto Lac
            java.lang.Object r0 = r10.get(r3)
            int r3 = r3 + 1
            gd6 r0 = (defpackage.gd6) r0
            r0.getClass()
            goto L9e
        Lac:
            return
    }

    @Override // defpackage.dl4
    public final void d(defpackage.b00 r2) {
            r1 = this;
            r2 = 3
            boolean r2 = androidx.fragment.app.u.K(r2)
            androidx.fragment.app.u r1 = r1.d
            if (r2 == 0) goto L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager "
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L1c:
            r1.w()
            androidx.fragment.app.t r2 = new androidx.fragment.app.t
            r2.<init>(r1)
            r0 = 0
            r1.x(r2, r0)
            return
    }
}
