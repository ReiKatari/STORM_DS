package defpackage;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import androidx.compose.ui.platform.ComposeView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x82  reason: default package */
/* loaded from: classes.dex */
public final class x82 extends Presentation {
    public final mv0 A;
    public final vs4 B;

    public x82(mv0 mv0Var, Display display) {
        super(mv0Var, display);
        this.A = mv0Var;
        this.B = np2.Y(null);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6);
        mv0 mv0Var = this.A;
        composeView.setTag(R.id.view_tree_lifecycle_owner, mv0Var);
        composeView.setTag(R.id.view_tree_view_model_store_owner, mv0Var);
        composeView.setTag(R.id.view_tree_saved_state_registry_owner, mv0Var);
        composeView.setContent(new zv0(1798755713, true, new w82(this, 1)));
        setContentView(composeView);
    }
}
