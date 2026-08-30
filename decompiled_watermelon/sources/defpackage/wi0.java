package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wi0  reason: default package */
/* loaded from: classes.dex */
public final class wi0 implements Runnable {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public wi0(bq0 bq0Var, xi0 xi0Var, zw3 zw3Var, uw3 uw3Var) {
        this.X = bq0Var;
        this.B = xi0Var;
        this.L = zw3Var;
        this.R = uw3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        Object obj = this.X;
        Object obj2 = this.R;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                yi0 yi0Var = (yi0) ((bq0) obj).B;
                zw3 zw3Var = (zw3) obj3;
                xi0 xi0Var = (xi0) obj4;
                if (xi0Var != null) {
                    yi0Var.u0 = true;
                    xi0Var.b.c(false);
                    yi0Var.u0 = false;
                }
                if (zw3Var.isEnabled() && zw3Var.hasSubMenu()) {
                    ((uw3) obj2).q(zw3Var, null, 4);
                    return;
                }
                return;
            default:
                ue7.i((View) obj4, (ze7) obj3, (wv6) obj2);
                ((ValueAnimator) obj).start();
                return;
        }
    }

    public wi0(View view, ze7 ze7Var, wv6 wv6Var, ValueAnimator valueAnimator) {
        this.B = view;
        this.L = ze7Var;
        this.R = wv6Var;
        this.X = valueAnimator;
    }
}
