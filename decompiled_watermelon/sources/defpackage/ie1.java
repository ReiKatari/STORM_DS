package defpackage;

import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ie1  reason: default package */
/* loaded from: classes.dex */
public final class ie1 implements bh1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke1 b;

    public /* synthetic */ ie1(ke1 ke1Var, int i) {
        this.a = i;
        this.b = ke1Var;
    }

    @Override // defpackage.bh1
    public final void dispose() {
        int i = this.a;
        ke1 ke1Var = this.b;
        switch (i) {
            case 0:
                ke1Var.e();
                ke1Var.setTag(R.id.view_tree_lifecycle_owner, null);
                ke1Var.setTag(R.id.view_tree_view_model_store_owner, null);
                ke1Var.setTag(R.id.view_tree_saved_state_registry_owner, null);
                ke1Var.i0.removeView(ke1Var);
                return;
            default:
                ke1Var.e();
                ke1Var.setTag(R.id.view_tree_lifecycle_owner, null);
                ke1Var.setTag(R.id.view_tree_view_model_store_owner, null);
                ke1Var.setTag(R.id.view_tree_saved_state_registry_owner, null);
                ke1Var.i0.removeView(ke1Var);
                return;
        }
    }
}
