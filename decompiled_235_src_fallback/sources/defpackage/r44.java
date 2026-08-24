package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r44  reason: default package */
/* loaded from: classes.dex */
public final class r44 implements android.view.MenuItem.OnActionExpandListener {
    public final android.view.MenuItem.OnActionExpandListener a;
    public final /* synthetic */ defpackage.s44 b;

    public r44(defpackage.s44 r1, android.view.MenuItem.OnActionExpandListener r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem r2) {
            r1 = this;
            s44 r0 = r1.b
            android.view.MenuItem r2 = r0.h(r2)
            android.view.MenuItem$OnActionExpandListener r1 = r1.a
            boolean r1 = r1.onMenuItemActionCollapse(r2)
            return r1
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem r2) {
            r1 = this;
            s44 r0 = r1.b
            android.view.MenuItem r2 = r0.h(r2)
            android.view.MenuItem$OnActionExpandListener r1 = r1.a
            boolean r1 = r1.onMenuItemActionExpand(r2)
            return r1
    }
}
