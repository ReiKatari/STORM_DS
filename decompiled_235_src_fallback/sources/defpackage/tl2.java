package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tl2  reason: default package */
/* loaded from: classes.dex */
public abstract class tl2 {
    public static final defpackage.sl2 a = null;

    static {
            sl2 r0 = defpackage.sl2.a
            defpackage.tl2.a = r0
            return
    }

    public static defpackage.sl2 a(androidx.fragment.app.o r1) {
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto Lf
            androidx.fragment.app.u r0 = r1.getParentFragmentManager()
            r0.getClass()
        Lf:
            androidx.fragment.app.o r1 = r1.getParentFragment()
            goto L0
        L14:
            sl2 r1 = defpackage.tl2.a
            return r1
    }

    public static void b(defpackage.jq7 r2) {
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L1c
            androidx.fragment.app.o r0 = r2.A
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "StrictMode violation in "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0, r2)
        L1c:
            return
    }

    public static final void c(androidx.fragment.app.o r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            pl2 r0 = new pl2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to reuse fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " with previous ID "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r3, r4)
            b(r0)
            sl2 r3 = a(r3)
            r3.getClass()
            rl2 r3 = defpackage.rl2.PENALTY_LOG
            return
    }
}
