package defpackage;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import androidx.compose.ui.platform.ComposeView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f42  reason: default package */
/* loaded from: classes.dex */
public final class f42 extends Presentation {
    public final ys0 A;
    public final tj4 B;

    public f42(ys0 ys0Var, Display display) {
        super(ys0Var, display);
        this.A = ys0Var;
        this.B = me2.G(null);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6);
        ys0 ys0Var = this.A;
        composeView.setTag(R.id.view_tree_lifecycle_owner, ys0Var);
        composeView.setTag(R.id.view_tree_view_model_store_owner, ys0Var);
        composeView.setTag(R.id.view_tree_saved_state_registry_owner, ys0Var);
        composeView.setContent(new et0(1798755713, true, new e42(this, 1)));
        setContentView(composeView);
    }
}
