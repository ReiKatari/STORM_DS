package defpackage;

import android.app.Presentation;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.window.OnBackInvokedDispatcher;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z82  reason: default package */
/* loaded from: classes.dex */
public final class z82 extends Presentation {
    public final b A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z82(sw4 sw4Var, LayoutEditorActivity layoutEditorActivity, Display display, jl3 jl3Var, u66 u66Var) {
        super(layoutEditorActivity, display);
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        jl3Var.getClass();
        sn3 sn3Var = sn3.SECONDARY_SCREEN;
        Context context = getContext();
        context.getClass();
        b bVar = new b(sn3Var, sw4Var, u66Var, new y82(layoutEditorActivity, context));
        this.A = bVar;
        setCancelable(false);
        bVar.setTag(R.id.view_tree_lifecycle_owner, layoutEditorActivity);
        bVar.setTag(R.id.view_tree_view_model_store_owner, layoutEditorActivity);
        bVar.setTag(R.id.view_tree_saved_state_registry_owner, layoutEditorActivity);
        bVar.setListener(jl3Var);
        bVar.setBackgroundColor(-16777216);
        bVar.getLayoutEditorView().setLayoutComponentViewBuilderFactory(new wb1(1, (byte) 0));
        setContentView(bVar);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new vp(this, 2));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.A.s();
    }
}
