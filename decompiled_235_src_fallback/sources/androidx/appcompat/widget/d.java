package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class d implements java.lang.Runnable {
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete A;

    public d(androidx.appcompat.widget.SearchView.SearchAutoComplete r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r2.A
            boolean r0 = r2.f0
            if (r0 == 0) goto L18
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 0
            r0.showSoftInput(r2, r1)
            r2.f0 = r1
        L18:
            return
    }
}
