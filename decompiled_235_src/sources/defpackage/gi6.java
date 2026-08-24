package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi6  reason: default package */
/* loaded from: classes.dex */
public final class gi6 extends ga2 {
    public final b63 L;
    public boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi6(s03 s03Var, b63 b63Var, boolean z, u87 u87Var) {
        super(s03Var, z, u87Var);
        s03Var.getClass();
        b63Var.getClass();
        u87Var.getClass();
        this.L = b63Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s03 s03Var = this.A;
        view.getClass();
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        r03 r03Var = null;
        b63 b63Var = this.L;
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.R) {
                this.R = false;
                s03Var.b(b63Var);
                a(view, ea2.KEY_RELEASE);
                if (view instanceof r03) {
                    r03Var = (r03) view;
                }
                if (r03Var != null) {
                    r03Var.a(du1.A);
                    return true;
                }
            }
        } else if (!this.R) {
            this.R = true;
            s03Var.c(b63Var);
            a(view, ea2.KEY_PRESS);
            if (view instanceof r03) {
                r03Var = (r03) view;
            }
            if (r03Var != null) {
                r03Var.a(ii2.R(b63Var));
            }
        }
        return true;
    }
}
