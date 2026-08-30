package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zs0  reason: default package */
/* loaded from: classes.dex */
public abstract class zs0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(xp xpVar, et0 et0Var) {
        ComposeView composeView;
        View childAt = ((ViewGroup) xpVar.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(et0Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(xpVar, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(et0Var);
        View decorView = xpVar.getWindow().getDecorView();
        if (jk2.u(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, xpVar);
        }
        if (nl2.L(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, xpVar);
        }
        if (nk2.y(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, xpVar);
        }
        xpVar.setContentView(composeView2, a);
    }
}
