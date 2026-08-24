package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el0  reason: default package */
/* loaded from: classes.dex */
public final class el0 implements Runnable {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public el0(os0 os0Var, fl0 fl0Var, o44 o44Var, i44 i44Var) {
        this.X = os0Var;
        this.B = fl0Var;
        this.L = o44Var;
        this.R = i44Var;
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
                gl0 gl0Var = (gl0) ((os0) obj).B;
                o44 o44Var = (o44) obj3;
                fl0 fl0Var = (fl0) obj4;
                if (fl0Var != null) {
                    gl0Var.v0 = true;
                    fl0Var.b.c(false);
                    gl0Var.v0 = false;
                }
                if (o44Var.isEnabled() && o44Var.hasSubMenu()) {
                    ((i44) obj2).q(o44Var, null, 4);
                    return;
                }
                return;
            default:
                wt7.i((View) obj4, (au7) obj3, (rr6) obj2);
                ((ValueAnimator) obj).start();
                return;
        }
    }

    public el0(View view, au7 au7Var, rr6 rr6Var, ValueAnimator valueAnimator) {
        this.B = view;
        this.L = au7Var;
        this.R = rr6Var;
        this.X = valueAnimator;
    }
}
