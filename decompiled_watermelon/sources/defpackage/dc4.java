package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dc4  reason: default package */
/* loaded from: classes.dex */
public final class dc4 implements OnBackAnimationCallback {
    public final /* synthetic */ cc4 a;

    public dc4(cc4 cc4Var) {
        this.a = cc4Var;
    }

    public final void onBackCancelled() {
        cc4 cc4Var = this.a;
        q9 q9Var = cc4Var.a;
        if (q9Var != null) {
            if (!cc4Var.b) {
                q9Var.v(cc4Var, null);
            }
            g54 g54Var = (g54) q9Var.L;
            g54Var.getClass();
            if (cc4Var.equals(g54Var.h) && -1 == g54Var.g) {
                d54 d54Var = g54Var.f;
                if (d54Var == null) {
                    d54Var = g54Var.c(-1);
                }
                g54Var.f = null;
                g54Var.g = 0;
                g54Var.h = null;
                if (d54Var != null) {
                    d54Var.a();
                }
                ee6 ee6Var = g54Var.a;
                ee6Var.getClass();
                ee6Var.l(null, h54.e);
            }
            cc4Var.b = false;
            return;
        }
        i.n("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        b54 f = cg2.f(backEvent);
        cc4 cc4Var = this.a;
        q9 q9Var = cc4Var.a;
        if (q9Var != null) {
            if (cc4Var.b) {
                g54 g54Var = (g54) q9Var.L;
                g54Var.getClass();
                if (cc4Var.equals(g54Var.h) && -1 == g54Var.g) {
                    d54 d54Var = g54Var.f;
                    if (d54Var == null) {
                        d54Var = g54Var.c(-1);
                    }
                    if (d54Var != null) {
                        d54Var.c(f);
                    }
                    ee6 ee6Var = g54Var.a;
                    i54 i54Var = new i54(f);
                    ee6Var.getClass();
                    ee6Var.l(null, i54Var);
                    return;
                }
                return;
            }
            return;
        }
        i.n("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        b54 f = cg2.f(backEvent);
        cc4 cc4Var = this.a;
        q9 q9Var = cc4Var.a;
        if (q9Var != null) {
            if (!cc4Var.b) {
                q9Var.v(cc4Var, f);
                cc4Var.b = true;
                return;
            }
            return;
        }
        i.n("This input is not added to any dispatcher.");
    }
}
