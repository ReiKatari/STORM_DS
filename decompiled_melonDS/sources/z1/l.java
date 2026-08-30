package z1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends ActionMode.Callback2 implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final d f14880a;

    public l(d dVar) {
        this.f14880a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f14880a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f14880a.a(menu);
        if (menu.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f14880a.f14862a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h3.c cVar = (h3.c) this.f14880a.f14864c.b();
        rect.set(Math.round(cVar.f6052a), Math.round(cVar.f6053b), Math.round(cVar.f6054c), Math.round(cVar.f6055d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f14880a.a(menu);
    }
}
