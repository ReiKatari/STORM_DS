package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq  reason: default package */
/* loaded from: classes.dex */
public final class wq extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ java.lang.Object i;

    public /* synthetic */ wq(java.lang.Object r1, int r2) {
            r0 = this;
            r0.h = r2
            r0.i = r1
            r0.<init>()
            return
    }

    @Override // defpackage.uj2, defpackage.kp7
    public void b() {
            r2 = this;
            int r0 = r2.h
            r1 = 0
            java.lang.Object r2 = r2.i
            switch(r0) {
                case 0: goto L28;
                case 1: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            fr r2 = (defpackage.fr) r2
            androidx.appcompat.widget.ActionBarContextView r0 = r2.q0
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.q0
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L27
            androidx.appcompat.widget.ActionBarContextView r2 = r2.q0
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r2.requestApplyInsets()
        L27:
            return
        L28:
            uq r2 = (defpackage.uq) r2
            fr r2 = r2.B
            androidx.appcompat.widget.ActionBarContextView r2 = r2.q0
            r2.setVisibility(r1)
            return
    }

    @Override // defpackage.kp7
    public final void c() {
            r3 = this;
            int r0 = r3.h
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Object r3 = r3.i
            r2 = 0
            switch(r0) {
                case 0: goto L59;
                case 1: goto L4a;
                default: goto La;
            }
        La:
            u63 r3 = (defpackage.u63) r3
            java.lang.Object r3 = r3.L
            fr r3 = (defpackage.fr) r3
            androidx.appcompat.widget.ActionBarContextView r0 = r3.q0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.PopupWindow r0 = r3.r0
            if (r0 == 0) goto L1f
            r0.dismiss()
            goto L36
        L1f:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.q0
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L36
            androidx.appcompat.widget.ActionBarContextView r0 = r3.q0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.requestApplyInsets()
        L36:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.q0
            r0.e()
            ip7 r0 = r3.t0
            r0.d(r2)
            r3.t0 = r2
            android.view.ViewGroup r3 = r3.v0
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r3.requestApplyInsets()
            return
        L4a:
            fr r3 = (defpackage.fr) r3
            androidx.appcompat.widget.ActionBarContextView r0 = r3.q0
            r0.setAlpha(r1)
            ip7 r0 = r3.t0
            r0.d(r2)
            r3.t0 = r2
            return
        L59:
            uq r3 = (defpackage.uq) r3
            fr r3 = r3.B
            androidx.appcompat.widget.ActionBarContextView r0 = r3.q0
            r0.setAlpha(r1)
            ip7 r0 = r3.t0
            r0.d(r2)
            r3.t0 = r2
            return
    }
}
