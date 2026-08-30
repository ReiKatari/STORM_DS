package p;

import android.view.MenuItem;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f11160a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f11161b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11161b = sVar;
        this.f11160a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11160a.onMenuItemActionCollapse(this.f11161b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11160a.onMenuItemActionExpand(this.f11161b.g(menuItem));
    }
}
