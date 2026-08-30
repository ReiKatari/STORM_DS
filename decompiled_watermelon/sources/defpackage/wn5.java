package defpackage;

import android.view.MenuItem;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wn5  reason: default package */
/* loaded from: classes.dex */
public final class wn5 implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ RomListActivity a;

    public wn5(RomListActivity romListActivity) {
        this.a = romListActivity;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        menuItem.getClass();
        this.a.invalidateOptionsMenu();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        menuItem.getClass();
        return true;
    }
}
