package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cc4  reason: default package */
/* loaded from: classes.dex */
public final class cc4 extends f54 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public cc4(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        OnBackInvokedCallback dc4Var;
        this.c = onBackInvokedDispatcher;
        this.d = i;
        if (Build.VERSION.SDK_INT == 33) {
            dc4Var = new jp(3, this);
        } else {
            dc4Var = new dc4(this);
        }
        this.e = dc4Var;
    }

    @Override // defpackage.f54
    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (z && !this.f) {
            q41.m(this.c, this.d, onBackInvokedCallback);
            this.f = true;
        } else if (!z && this.f) {
            q41.o(this.c, onBackInvokedCallback);
            this.f = false;
        }
    }
}
