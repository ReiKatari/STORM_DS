package e;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.s0;
import me.magnum.melonds.R;
import p7.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f4136a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(l.i iVar, v2.c cVar) {
        ComposeView composeView;
        View childAt = ((ViewGroup) iVar.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(cVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(iVar, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(cVar);
        View decorView = iVar.getWindow().getDecorView();
        if (s0.d(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, iVar);
        }
        if (s0.e(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, iVar);
        }
        if (o.j(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, iVar);
        }
        iVar.setContentView(composeView2, f4136a);
    }
}
