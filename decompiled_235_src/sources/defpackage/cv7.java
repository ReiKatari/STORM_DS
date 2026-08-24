package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv7  reason: default package */
/* loaded from: classes.dex */
public final class cv7 {
    public final bv7 a;

    public cv7(Window window, View view) {
        s35 s35Var = new s35(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new zu7(window, s35Var);
        } else if (i >= 30) {
            this.a = new zu7(window, s35Var);
        } else if (i >= 26) {
            this.a = new wu7(window, s35Var);
        } else {
            this.a = new wu7(window, s35Var);
        }
    }

    public final void a(boolean z) {
        this.a.d(z);
    }
}
