package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q66  reason: default package */
/* loaded from: classes.dex */
public final class q66 extends n52 {
    public final yz2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q66(qu2 qu2Var, yz2 yz2Var, boolean z, hw6 hw6Var) {
        super(qu2Var, z, hw6Var);
        qu2Var.getClass();
        yz2Var.getClass();
        hw6Var.getClass();
        this.L = yz2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        qu2 qu2Var = this.A;
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        yz2 yz2Var = this.L;
        if (action != 0) {
            if (action != 1) {
                return true;
            }
            qu2Var.b(yz2Var);
            a(view, l52.KEY_RELEASE);
            return true;
        }
        qu2Var.c(yz2Var);
        a(view, l52.KEY_PRESS);
        return true;
    }
}
