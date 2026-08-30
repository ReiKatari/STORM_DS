package p;

import android.view.MenuItem;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A;
    public final /* synthetic */ s B;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = sVar;
        this.A = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.A.onMenuItemClick(this.B.g(menuItem));
    }
}
