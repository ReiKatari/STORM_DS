package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s14  reason: default package */
/* loaded from: classes.dex */
public class s14 {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(r14 r14Var) {
        Objects.requireNonNull(r14Var);
        return new vp(r14Var, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(r14 r14Var, View view, boolean z) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        int i;
        if (this.a != null || findOnBackInvokedDispatcher == null) {
            return;
        }
        OnBackInvokedCallback a = a(r14Var);
        this.a = a;
        if (z) {
            i = 1000000;
        } else {
            i = 0;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(i, a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r2 = r2.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a != null && findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }
    }
}
