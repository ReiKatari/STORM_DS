package defpackage;

import android.view.ActionMode;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z3  reason: default package */
/* loaded from: classes.dex */
public final class z3 implements fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fl1
    public final void dispose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((on2) ((bt) obj).B).c();
                return;
            case 1:
                i9 i9Var = ((e9) obj).a;
                if (i9Var != null) {
                    i9Var.b();
                    return;
                } else {
                    i.m("Launcher has not been initialized");
                    return;
                }
            case 2:
                mj1 mj1Var = (mj1) obj;
                mj1Var.dismiss();
                mj1Var.d0.e();
                return;
            case 3:
                c05 c05Var = (c05) obj;
                c05Var.e();
                c05Var.setTag(R.id.view_tree_lifecycle_owner, null);
                c05Var.o0.removeViewImmediate(c05Var);
                return;
            case 4:
                hm hmVar = (hm) obj;
                qm6 qm6Var = hmVar.e;
                h61 h61Var = qm6Var.h;
                if (h61Var != null) {
                    h61Var.d();
                }
                qm6Var.a();
                ActionMode actionMode = hmVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                hmVar.h = null;
                return;
            case 5:
                ((cv7) obj).a.f(519);
                return;
            case 6:
                g30 g30Var = (g30) ((h30) obj).c.getValue();
                if (g30Var != null) {
                    g30Var.close();
                    return;
                }
                return;
            case 7:
                ((jl1) obj).B.c();
                return;
            case 8:
                ((p27) obj).o();
                return;
            case 9:
                mn2 mn2Var = (mn2) obj;
                mn2Var.e();
                mn2Var.i0.removeView(mn2Var);
                return;
            case 10:
                ((aq3) obj).d = null;
                return;
            case 11:
                pq3 pq3Var = (pq3) obj;
                bk1 bk1Var = pq3Var.c;
                if (bk1Var != null) {
                    bk1Var.A = false;
                }
                pq3Var.c = null;
                return;
            case 12:
                ((lq3) obj).f = true;
                return;
            case 13:
                ((qn2) obj).g(null);
                return;
            default:
                ((n96) ((gx0) obj)).y(null);
                return;
        }
    }
}
