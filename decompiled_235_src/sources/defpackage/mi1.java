package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi1  reason: default package */
/* loaded from: classes.dex */
public final class mi1 implements fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi1 b;

    public /* synthetic */ mi1(oi1 oi1Var, int i) {
        this.a = i;
        this.b = oi1Var;
    }

    @Override // defpackage.fl1
    public final void dispose() {
        int i = this.a;
        oi1 oi1Var = this.b;
        switch (i) {
            case 0:
                oi1Var.e();
                oi1Var.setTag(R.id.view_tree_lifecycle_owner, null);
                oi1Var.setTag(R.id.view_tree_view_model_store_owner, null);
                oi1Var.setTag(R.id.view_tree_saved_state_registry_owner, null);
                oi1Var.j0.removeView(oi1Var);
                return;
            default:
                oi1Var.e();
                oi1Var.setTag(R.id.view_tree_lifecycle_owner, null);
                oi1Var.setTag(R.id.view_tree_view_model_store_owner, null);
                oi1Var.setTag(R.id.view_tree_saved_state_registry_owner, null);
                oi1Var.j0.removeView(oi1Var);
                return;
        }
    }
}
