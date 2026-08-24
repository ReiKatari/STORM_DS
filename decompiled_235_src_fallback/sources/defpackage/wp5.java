package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp5  reason: default package */
/* loaded from: classes.dex */
public final class wp5 extends defpackage.wf5 {
    public androidx.recyclerview.widget.RecyclerView d;

    @Override // defpackage.wf5
    public final int a() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.wf5
    public final void d(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // defpackage.wf5
    public final void e(defpackage.wg5 r1, int r2) {
            r0 = this;
            vp5 r1 = (defpackage.vp5) r1
            return
    }

    @Override // defpackage.wf5
    public final defpackage.wg5 f(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131624005(0x7f0e0045, float:1.8875177E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r3, r1)
            r0 = 2131427631(0x7f0b012f, float:1.8476884E38)
            android.view.View r1 = defpackage.gi2.B(r4, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L46
            r0 = 2131428002(0x7f0b02a2, float:1.8477636E38)
            android.view.View r1 = defpackage.gi2.B(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L46
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            vp5 r0 = new vp5
            android.content.Context r3 = r3.getContext()
            r3.getClass()
            r0.<init>(r4)
            b92 r3 = new b92
            r3.<init>(r2, r0)
            r4.setOnClickListener(r3)
            ir0 r3 = new ir0
            r1 = 2
            r3.<init>(r2, r1)
            r4.setOnFocusChangeListener(r3)
            return r0
        L46:
            android.content.res.Resources r2 = r4.getResources()
            java.lang.String r2 = r2.getResourceName(r0)
            java.lang.String r3 = "Missing required view with ID: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.u34.x(r2)
            r2 = 0
            return r2
    }
}
