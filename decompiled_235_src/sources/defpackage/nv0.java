package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv0  reason: default package */
/* loaded from: classes.dex */
public abstract class nv0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(mv0 mv0Var, zv0 zv0Var) {
        ComposeView composeView;
        View childAt = ((ViewGroup) mv0Var.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(zv0Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(mv0Var, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(zv0Var);
        View decorView = mv0Var.getWindow().getDecorView();
        if (bl2.B(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, mv0Var);
        }
        if (ln2.r(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, mv0Var);
        }
        if (kn2.C(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, mv0Var);
        }
        mv0Var.setContentView(composeView2, a);
    }
}
