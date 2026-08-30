package defpackage;

import android.app.Presentation;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.window.OnBackInvokedDispatcher;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h42  reason: default package */
/* loaded from: classes.dex */
public final class h42 extends Presentation {
    public final b A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(nn4 nn4Var, LayoutEditorActivity layoutEditorActivity, Display display, oe3 oe3Var, hv5 hv5Var) {
        super(layoutEditorActivity, display);
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        oe3Var.getClass();
        ug3 ug3Var = ug3.SECONDARY_SCREEN;
        Context context = getContext();
        context.getClass();
        b bVar = new b(ug3Var, nn4Var, hv5Var, new g42(layoutEditorActivity, context));
        this.A = bVar;
        setCancelable(false);
        bVar.setTag(R.id.view_tree_lifecycle_owner, layoutEditorActivity);
        bVar.setTag(R.id.view_tree_view_model_store_owner, layoutEditorActivity);
        bVar.setTag(R.id.view_tree_saved_state_registry_owner, layoutEditorActivity);
        bVar.setListener(oe3Var);
        bVar.setBackgroundColor(-16777216);
        bVar.getLayoutEditorView().setLayoutComponentViewBuilderFactory(new e81(1, (byte) 0));
        setContentView(bVar);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new jp(2, this));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.A.s();
    }
}
