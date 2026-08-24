package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao6  reason: default package */
/* loaded from: classes.dex */
public enum ao6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ao6[] $VALUES = null;
    public static final defpackage.yn6 Companion = null;
    public static final defpackage.ao6 GONE = null;
    public static final defpackage.ao6 INVISIBLE = null;
    public static final defpackage.ao6 REMOVED = null;
    public static final defpackage.ao6 VISIBLE = null;

    private static final /* synthetic */ defpackage.ao6[] $values() {
            ao6 r0 = defpackage.ao6.REMOVED
            ao6 r1 = defpackage.ao6.VISIBLE
            ao6 r2 = defpackage.ao6.GONE
            ao6 r3 = defpackage.ao6.INVISIBLE
            ao6[] r0 = new defpackage.ao6[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ao6 r0 = new ao6
            java.lang.String r1 = "REMOVED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ao6.REMOVED = r0
            ao6 r0 = new ao6
            java.lang.String r1 = "VISIBLE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ao6.VISIBLE = r0
            ao6 r0 = new ao6
            java.lang.String r1 = "GONE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ao6.GONE = r0
            ao6 r0 = new ao6
            java.lang.String r1 = "INVISIBLE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ao6.INVISIBLE = r0
            ao6[] r0 = $values()
            defpackage.ao6.$VALUES = r0
            yn6 r0 = new yn6
            r0.<init>()
            defpackage.ao6.Companion = r0
            return
    }

    ao6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final defpackage.ao6 from(int r1) {
            yn6 r0 = defpackage.ao6.Companion
            r0.getClass()
            ao6 r1 = defpackage.yn6.b(r1)
            return r1
    }

    public static defpackage.ao6 valueOf(java.lang.String r1) {
            java.lang.Class<ao6> r0 = defpackage.ao6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ao6 r1 = (defpackage.ao6) r1
            return r1
    }

    public static defpackage.ao6[] values() {
            ao6[] r0 = defpackage.ao6.$VALUES
            java.lang.Object r0 = r0.clone()
            ao6[] r0 = (defpackage.ao6[]) r0
            return r0
    }

    public final void applyState(android.view.View r5, android.view.ViewGroup r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            r0 = 2
            boolean r1 = androidx.fragment.app.u.K(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L14
            java.lang.String r1 = "SpecialEffectsController: Calling apply state"
            android.util.Log.v(r2, r1)
        L14:
            int[] r1 = defpackage.zn6.a
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 1
            r3 = 0
            if (r4 == r1) goto Lb8
            java.lang.String r1 = "SpecialEffectsController: Setting view "
            if (r4 == r0) goto L6a
            r6 = 3
            if (r4 == r6) goto L4a
            r6 = 4
            if (r4 == r6) goto L2c
            goto Le7
        L2c:
            boolean r4 = androidx.fragment.app.u.K(r0)
            if (r4 == 0) goto L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r0 = " to INVISIBLE"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r2, r4)
        L46:
            r5.setVisibility(r6)
            return
        L4a:
            boolean r4 = androidx.fragment.app.u.K(r0)
            if (r4 == 0) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r6 = " to GONE"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r2, r4)
        L64:
            r4 = 8
            r5.setVisibility(r4)
            return
        L6a:
            boolean r4 = androidx.fragment.app.u.K(r0)
            if (r4 == 0) goto L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r1 = " to VISIBLE"
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r2, r4)
        L84:
            android.view.ViewParent r4 = r5.getParent()
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L8f
            r3 = r4
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L8f:
            if (r3 != 0) goto Lb3
            boolean r4 = androidx.fragment.app.u.K(r0)
            if (r4 == 0) goto Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "SpecialEffectsController: Adding view "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r0 = " to Container "
            r4.append(r0)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r2, r4)
        Lb0:
            r6.addView(r5)
        Lb3:
            r4 = 0
            r5.setVisibility(r4)
            return
        Lb8:
            android.view.ViewParent r4 = r5.getParent()
            boolean r6 = r4 instanceof android.view.ViewGroup
            if (r6 == 0) goto Lc3
            r3 = r4
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        Lc3:
            if (r3 == 0) goto Le7
            boolean r4 = androidx.fragment.app.u.K(r0)
            if (r4 == 0) goto Le4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "SpecialEffectsController: Removing view "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r6 = " from container "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r2, r4)
        Le4:
            r3.removeView(r5)
        Le7:
            return
    }
}
