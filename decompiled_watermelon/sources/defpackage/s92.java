package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s92  reason: default package */
/* loaded from: classes.dex */
public final class s92 extends ActionMode.Callback2 implements ActionMode.Callback {
    public final tl a;

    public s92(tl tlVar) {
        this.a = tlVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.a(menu);
        if (menu.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        y55 y55Var = (y55) this.a.c.c();
        rect.set(Math.round(y55Var.a), Math.round(y55Var.b), Math.round(y55Var.c), Math.round(y55Var.d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.a(menu);
    }
}
