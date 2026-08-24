package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class t implements defpackage.jl2 {
    public final /* synthetic */ androidx.fragment.app.u a;

    public t(androidx.fragment.app.u r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.jl2
    public final boolean a(java.util.ArrayList r8, java.util.ArrayList r9) {
            r7 = this;
            androidx.fragment.app.u r7 = r7.a
            java.util.ArrayList r0 = r7.n
            r1 = 2
            boolean r1 = androidx.fragment.app.u.K(r1)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "FragmentManager has the following pending actions inside of prepareBackStackState: "
            r1.<init>(r3)
            java.util.ArrayList r3 = r7.a
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L20:
            java.util.ArrayList r1 = r7.d
            boolean r1 = r1.isEmpty()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            java.lang.String r7 = "Ignoring call to start back stack pop because the back stack is empty."
            android.util.Log.i(r2, r7)
            r7 = r3
            goto L5d
        L31:
            java.util.ArrayList r1 = r7.d
            int r2 = r1.size()
            int r2 = r2 - r4
            java.lang.Object r1 = r1.get(r2)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            r7.h = r1
            java.util.ArrayList r1 = r1.c
            int r2 = r1.size()
            r5 = r3
        L47:
            if (r5 >= r2) goto L58
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            ul2 r6 = (defpackage.ul2) r6
            androidx.fragment.app.o r6 = r6.b
            if (r6 == 0) goto L47
            r6.mTransitioning = r4
            goto L47
        L58:
            r1 = -1
            boolean r7 = r7.S(r1, r3, r8, r9)
        L5d:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lb5
            int r1 = r8.size()
            if (r1 <= 0) goto Lb5
            int r1 = r8.size()
            int r1 = r1 - r4
            java.lang.Object r9 = r9.get(r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.getClass()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            int r1 = r8.size()
            r2 = r3
        L81:
            if (r2 >= r1) goto L93
            java.lang.Object r4 = r8.get(r2)
            int r2 = r2 + 1
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            java.util.HashSet r4 = androidx.fragment.app.u.F(r4)
            r9.addAll(r4)
            goto L81
        L93:
            int r8 = r0.size()
        L97:
            if (r3 >= r8) goto Lb5
            java.lang.Object r1 = r0.get(r3)
            int r3 = r3 + 1
            gd6 r1 = (defpackage.gd6) r1
            java.util.Iterator r2 = r9.iterator()
        La5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r2.next()
            androidx.fragment.app.o r4 = (androidx.fragment.app.o) r4
            r1.getClass()
            goto La5
        Lb5:
            return r7
    }
}
