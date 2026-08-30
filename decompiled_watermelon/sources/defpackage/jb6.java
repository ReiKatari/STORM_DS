package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jb6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jb6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ View B;

    public /* synthetic */ jb6(View view, int i) {
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
