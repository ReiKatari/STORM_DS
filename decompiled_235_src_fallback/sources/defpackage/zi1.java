package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi1  reason: default package */
/* loaded from: classes.dex */
public final class zi1 implements defpackage.fi4 {
    public final /* synthetic */ androidx.fragment.app.i a;

    public zi1(androidx.fragment.app.i r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.fi4
    public final void a(java.lang.Object r4) {
            r3 = this;
            hu3 r4 = (defpackage.hu3) r4
            if (r4 == 0) goto L4f
            androidx.fragment.app.i r4 = r3.a
            boolean r0 = androidx.fragment.app.i.access$200(r4)
            if (r0 == 0) goto L4f
            android.view.View r0 = r4.requireView()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L4a
            android.app.Dialog r1 = androidx.fragment.app.i.access$000(r4)
            if (r1 == 0) goto L4f
            r1 = 3
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DialogFragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " setting the content view on "
            r1.append(r3)
            android.app.Dialog r3 = androidx.fragment.app.i.access$000(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r3)
        L42:
            android.app.Dialog r3 = androidx.fragment.app.i.access$000(r4)
            r3.setContentView(r0)
            return
        L4a:
            java.lang.String r3 = "DialogFragment can not be attached to a container view"
            defpackage.i.m(r3)
        L4f:
            return
    }
}
