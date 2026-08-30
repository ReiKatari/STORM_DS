package defpackage;

import android.view.ActionMode;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y3  reason: default package */
/* loaded from: classes.dex */
public final class y3 implements bh1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bh1
    public final void dispose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ki2) ((os) obj).B).c();
                return;
            case 1:
                h9 h9Var = ((d9) obj).a;
                if (h9Var != null) {
                    h9Var.b();
                    return;
                } else {
                    i.n("Launcher has not been initialized");
                    return;
                }
            case 2:
                if1 if1Var = (if1) obj;
                if1Var.dismiss();
                if1Var.c0.e();
                return;
            case 3:
                yq4 yq4Var = (yq4) obj;
                yq4Var.e();
                yq4Var.setTag(R.id.view_tree_lifecycle_owner, null);
                yq4Var.n0.removeViewImmediate(yq4Var);
                return;
            case 4:
                vl vlVar = (vl) obj;
                bb6 bb6Var = vlVar.e;
                a31 a31Var = bb6Var.h;
                if (a31Var != null) {
                    a31Var.g();
                }
                bb6Var.a();
                ActionMode actionMode = vlVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                vlVar.h = null;
                return;
            case 5:
                ((cg7) obj).a.g(519);
                return;
            case ig7.b /* 6 */:
                m10 m10Var = (m10) ((n10) obj).c.getValue();
                if (m10Var != null) {
                    m10Var.close();
                    return;
                }
                return;
            case 7:
                ((fh1) obj).B.c();
                return;
            case 8:
                ((bq6) obj).o();
                return;
            case 9:
                ii2 ii2Var = (ii2) obj;
                ii2Var.e();
                ii2Var.h0.removeView(ii2Var);
                return;
            case 10:
                ((cj3) obj).d = null;
                return;
            case 11:
                qj3 qj3Var = (qj3) obj;
                xf1 xf1Var = qj3Var.c;
                if (xf1Var != null) {
                    xf1Var.A = false;
                }
                qj3Var.c = null;
                return;
            case mj2.L /* 12 */:
                ((mj3) obj).f = true;
                return;
            case 13:
                ((mi2) obj).n(null);
                return;
            default:
                ((by5) ((ku0) obj)).y(null);
                return;
        }
    }
}
