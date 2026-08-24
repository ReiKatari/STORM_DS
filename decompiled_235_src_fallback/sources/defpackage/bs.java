package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs  reason: default package */
/* loaded from: classes.dex */
public final class bs implements android.widget.PopupWindow.OnDismissListener {
    public final /* synthetic */ defpackage.wr A;
    public final /* synthetic */ defpackage.cs B;

    public bs(defpackage.cs r1, defpackage.wr r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r1 = this;
            cs r0 = r1.B
            fs r0 = r0.C0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto Lf
            wr r1 = r1.A
            r0.removeGlobalOnLayoutListener(r1)
        Lf:
            return
    }
}
