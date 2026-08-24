package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q86  reason: default package */
/* loaded from: classes.dex */
public final class q86 implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView a;

    public q86(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            androidx.appcompat.widget.SearchView r0 = r0.a
            android.view.View$OnFocusChangeListener r1 = r0.K0
            if (r1 == 0) goto L9
            r1.onFocusChange(r0, r2)
        L9:
            return
    }
}
