package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: je2  reason: default package */
/* loaded from: classes.dex */
public final class je2 extends android.view.ActionMode.Callback2 implements android.view.ActionMode.Callback {
    public final defpackage.fm a;

    public je2(defpackage.fm r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode r1, android.view.MenuItem r2) {
            r0 = this;
            fm r0 = r0.a
            r0.getClass()
            r0 = 0
            return r0
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode r1, android.view.Menu r2) {
            r0 = this;
            fm r0 = r0.a
            r0.a(r2)
            int r0 = r2.size()
            if (r0 <= 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode r1) {
            r0 = this;
            fm r0 = r0.a
            gm r0 = r0.a
            r0.close()
            return
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(android.view.ActionMode r2, android.view.View r3, android.graphics.Rect r4) {
            r1 = this;
            fm r1 = r1.a
            dm r1 = r1.c
            java.lang.Object r1 = r1.c()
            of5 r1 = (defpackage.of5) r1
            float r2 = r1.a
            int r2 = java.lang.Math.round(r2)
            float r3 = r1.b
            int r3 = java.lang.Math.round(r3)
            float r0 = r1.c
            int r0 = java.lang.Math.round(r0)
            float r1 = r1.d
            int r1 = java.lang.Math.round(r1)
            r4.set(r2, r3, r0, r1)
            return
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode r1, android.view.Menu r2) {
            r0 = this;
            fm r0 = r0.a
            boolean r0 = r0.a(r2)
            return r0
    }
}
