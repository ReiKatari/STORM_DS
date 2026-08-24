package defpackage;

import android.view.DragEvent;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og  reason: default package */
/* loaded from: classes.dex */
public final class og implements View.OnDragListener, wm1 {
    public final ym1 a;
    public final zu b;
    public final ng c;

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, ym1] */
    public og() {
        ?? z64Var = new z64();
        z64Var.m0 = 0L;
        this.a = z64Var;
        this.b = new zu(0);
        this.c = new ng(this);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [zg5, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        d51 d51Var = new d51(dragEvent, 12);
        int action = dragEvent.getAction();
        zu zuVar = this.b;
        ym1 ym1Var = this.a;
        switch (action) {
            case 1:
                ?? obj = new Object();
                xm1 xm1Var = new xm1(d51Var, ym1Var, obj);
                if (xm1Var.g(ym1Var) == tb7.ContinueTraversal) {
                    ii2.Y(ym1Var, xm1Var);
                }
                boolean z = obj.A;
                zuVar.getClass();
                su suVar = new su(zuVar);
                while (suVar.hasNext()) {
                    ((ym1) suVar.next()).V0();
                }
                return z;
            case 2:
                ym1Var.U0(d51Var);
                return false;
            case 3:
                return ym1Var.R0();
            case 4:
                mc mcVar = new mc(d51Var, 13);
                if (mcVar.g(ym1Var) == tb7.ContinueTraversal) {
                    ii2.Y(ym1Var, mcVar);
                }
                zuVar.clear();
                return false;
            case 5:
                ym1Var.S0();
                return false;
            case 6:
                ym1Var.T0();
                return false;
            default:
                return false;
        }
    }
}
