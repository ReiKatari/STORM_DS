package defpackage;

import android.view.DragEvent;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public final class ag implements View.OnDragListener, qi1 {
    public final si1 a;
    public final hu b;
    public final zf c;

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, si1] */
    public ag() {
        ?? yy3Var = new yy3();
        yy3Var.l0 = 0L;
        this.a = yy3Var;
        this.b = new hu(0);
        this.c = new zf(this);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [j75, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        t71 t71Var = new t71(10, dragEvent);
        int action = dragEvent.getAction();
        hu huVar = this.b;
        si1 si1Var = this.a;
        switch (action) {
            case 1:
                ?? obj = new Object();
                ri1 ri1Var = new ri1(t71Var, si1Var, obj);
                if (ri1Var.n(si1Var) == yx6.ContinueTraversal) {
                    ve2.Z(si1Var, ri1Var);
                }
                boolean z = obj.A;
                huVar.getClass();
                au auVar = new au(huVar);
                while (auVar.hasNext()) {
                    ((si1) auVar.next()).V0();
                }
                return z;
            case 2:
                si1Var.U0(t71Var);
                return false;
            case 3:
                return si1Var.R0();
            case 4:
                yb ybVar = new yb(14, t71Var);
                if (ybVar.n(si1Var) == yx6.ContinueTraversal) {
                    ve2.Z(si1Var, ybVar);
                }
                huVar.clear();
                return false;
            case 5:
                si1Var.S0();
                return false;
            case ig7.b /* 6 */:
                si1Var.T0();
                return false;
            default:
                return false;
        }
    }
}
