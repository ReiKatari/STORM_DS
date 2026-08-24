package defpackage;

import android.view.MenuItem;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my5  reason: default package */
/* loaded from: classes.dex */
public final class my5 implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ RomListActivity a;

    public my5(RomListActivity romListActivity) {
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
