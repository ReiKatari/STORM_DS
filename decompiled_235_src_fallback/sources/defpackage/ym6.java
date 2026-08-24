package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ym6 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.view.View B;

    public /* synthetic */ ym6(android.view.View r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            android.view.View r2 = r2.B
            switch(r0) {
                case 0: goto L18;
                default: goto L7;
            }
        L7:
            android.content.Context r0 = r2.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r1 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 1
            r0.showSoftInput(r2, r1)
            return
        L18:
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 0
            r0.showSoftInput(r2, r1)
            return
    }
}
