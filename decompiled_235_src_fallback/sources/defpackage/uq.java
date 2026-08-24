package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq  reason: default package */
/* loaded from: classes.dex */
public final class uq implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.fr B;

    public /* synthetic */ uq(defpackage.fr r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.A
            fr r1 = r5.B
            r2 = 0
            switch(r0) {
                case 0: goto L4d;
                default: goto L8;
            }
        L8:
            android.widget.PopupWindow r0 = r1.r0
            androidx.appcompat.widget.ActionBarContextView r3 = r1.q0
            r4 = 55
            r0.showAtLocation(r3, r4, r2, r2)
            ip7 r0 = r1.t0
            if (r0 == 0) goto L18
            r0.b()
        L18:
            boolean r0 = r1.u0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L42
            android.view.ViewGroup r0 = r1.v0
            if (r0 == 0) goto L42
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto L42
            androidx.appcompat.widget.ActionBarContextView r0 = r1.q0
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.q0
            ip7 r0 = defpackage.ao7.b(r0)
            r0.a(r3)
            r1.t0 = r0
            wq r1 = new wq
            r1.<init>(r5, r2)
            r0.d(r1)
            goto L4c
        L42:
            androidx.appcompat.widget.ActionBarContextView r5 = r1.q0
            r5.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r5 = r1.q0
            r5.setVisibility(r2)
        L4c:
            return
        L4d:
            int r5 = r1.U0
            r5 = r5 & 1
            if (r5 == 0) goto L56
            r1.y(r2)
        L56:
            int r5 = r1.U0
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L61
            r5 = 108(0x6c, float:1.51E-43)
            r1.y(r5)
        L61:
            r1.T0 = r2
            r1.U0 = r2
            return
    }
}
