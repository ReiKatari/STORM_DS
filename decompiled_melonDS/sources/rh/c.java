package rh;

import ah.m1;
import android.app.Presentation;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.window.OnBackInvokedDispatcher;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends Presentation {
    public final me.magnum.melonds.ui.layouteditor.b A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.squareup.picasso.a0 a0Var, LayoutEditorActivity layoutEditorActivity, Display display, t tVar, sh.e eVar) {
        super(layoutEditorActivity, display);
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        tVar.getClass();
        sh.d dVar = sh.d.SECONDARY_SCREEN;
        Context context = getContext();
        context.getClass();
        me.magnum.melonds.ui.layouteditor.b bVar = new me.magnum.melonds.ui.layouteditor.b(dVar, a0Var, eVar, new b(layoutEditorActivity, context));
        this.A = bVar;
        setCancelable(false);
        bVar.setTag(R.id.view_tree_lifecycle_owner, layoutEditorActivity);
        bVar.setTag(R.id.view_tree_view_model_store_owner, layoutEditorActivity);
        bVar.setTag(R.id.view_tree_saved_state_registry_owner, layoutEditorActivity);
        bVar.setListener(tVar);
        bVar.setBackgroundColor(-16777216);
        bVar.getLayoutEditorView().setLayoutComponentViewBuilderFactory(new m1(7, (byte) 0));
        setContentView(bVar);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new a5.y(4, this));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        me.magnum.melonds.ui.layouteditor.b bVar = this.A;
        if (bVar.f9543d0) {
            bVar.q(true);
        } else {
            bVar.r();
        }
    }
}
