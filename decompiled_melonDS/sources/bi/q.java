package bi;

import android.view.MenuItem;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RomListActivity f2308a;

    public q(RomListActivity romListActivity) {
        this.f2308a = romListActivity;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        menuItem.getClass();
        this.f2308a.invalidateOptionsMenu();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        menuItem.getClass();
        return true;
    }
}
