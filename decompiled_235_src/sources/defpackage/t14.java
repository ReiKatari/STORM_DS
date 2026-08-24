package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t14  reason: default package */
/* loaded from: classes.dex */
public final class t14 implements OnBackAnimationCallback {
    public final /* synthetic */ r14 a;
    public final /* synthetic */ u14 b;

    public t14(u14 u14Var, r14 r14Var) {
        this.b = u14Var;
        this.a = r14Var;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new b00(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new b00(backEvent));
        }
    }
}
