package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: do6  reason: default package */
/* loaded from: classes.dex */
public final class do6 extends defpackage.hy5 {
    public final defpackage.g51 B;

    public do6(me.magnum.melonds.ui.romlist.RomListActivity r2) {
            r1 = this;
            r1.<init>(r2)
            g51 r0 = new g51
            r0.<init>(r1, r2)
            r1.B = r0
            return
    }

    @Override // defpackage.hy5
    public final void a() {
            r5 = this;
            me.magnum.melonds.ui.romlist.RomListActivity r0 = r5.A
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r1.getClass()
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 2130969655(0x7f040437, float:1.7547998E38)
            r4 = 1
            boolean r1 = r1.resolveAttribute(r3, r2, r4)
            if (r1 == 0) goto L1f
            int r1 = r2.resourceId
            if (r1 == 0) goto L1f
            r0.setTheme(r1)
        L1f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L37
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            g51 r5 = r5.B
            r0.setOnHierarchyChangeListener(r5)
        L37:
            return
    }
}
