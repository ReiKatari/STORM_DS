package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cg7  reason: default package */
/* loaded from: classes.dex */
public final class cg7 {
    public final bg7 a;

    public cg7(Window window, View view) {
        dz4 dz4Var = new dz4(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new zf7(window, dz4Var);
        } else if (i >= 30) {
            this.a = new zf7(window, dz4Var);
        } else if (i >= 26) {
            this.a = new wf7(window, dz4Var);
        } else {
            this.a = new wf7(window, dz4Var);
        }
    }

    public final void a(boolean z) {
        this.a.e(z);
    }
}
