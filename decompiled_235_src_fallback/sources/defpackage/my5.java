package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my5  reason: default package */
/* loaded from: classes.dex */
public final class my5 implements android.view.MenuItem.OnActionExpandListener {
    public final /* synthetic */ me.magnum.melonds.ui.romlist.RomListActivity a;

    public my5(me.magnum.melonds.ui.romlist.RomListActivity r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem r1) {
            r0 = this;
            r1.getClass()
            me.magnum.melonds.ui.romlist.RomListActivity r0 = r0.a
            r0.invalidateOptionsMenu()
            r0 = 1
            return r0
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem r1) {
            r0 = this;
            r1.getClass()
            r0 = 1
            return r0
    }
}
