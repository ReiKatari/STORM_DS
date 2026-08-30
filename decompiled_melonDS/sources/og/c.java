package og;

import me.magnum.melonds.R;
import n2.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f10989b;

    public /* synthetic */ c(e eVar, int i2) {
        this.f10988a = i2;
        this.f10989b = eVar;
    }

    @Override // n2.g0
    public final void dispose() {
        switch (this.f10988a) {
            case 0:
                e eVar = this.f10989b;
                eVar.c();
                eVar.setTag(R.id.view_tree_lifecycle_owner, null);
                eVar.setTag(R.id.view_tree_view_model_store_owner, null);
                eVar.setTag(R.id.view_tree_saved_state_registry_owner, null);
                eVar.f10992g0.removeView(eVar);
                return;
            default:
                e eVar2 = this.f10989b;
                eVar2.c();
                eVar2.setTag(R.id.view_tree_lifecycle_owner, null);
                eVar2.setTag(R.id.view_tree_view_model_store_owner, null);
                eVar2.setTag(R.id.view_tree_saved_state_registry_owner, null);
                eVar2.f10992g0.removeView(eVar2);
                return;
        }
    }
}
