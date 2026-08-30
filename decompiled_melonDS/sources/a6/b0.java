package a6;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ View B;

    public /* synthetic */ b0(View view, int i2) {
        this.A = i2;
        this.B = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                View view = this.B;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                View view2 = this.B;
                ((InputMethodManager) view2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view2, 1);
                return;
        }
    }
}
