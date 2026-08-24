package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ym6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ View B;

    public /* synthetic */ ym6(View view, int i) {
        this.A = i;
        this.B = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        View view = this.B;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
