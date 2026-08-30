package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p  reason: default package */
/* loaded from: classes.dex */
public final class p implements jb7 {
    public int a;
    public boolean b;
    public final Object c;

    public p() {
        this.c = new byte[65536];
    }

    @Override // defpackage.jb7
    public void a() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.d0 = null;
        super/*android.view.View*/.setVisibility(this.a);
    }

    @Override // defpackage.jb7
    public void b() {
        this.b = true;
    }

    @Override // defpackage.jb7
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    public p(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.b = false;
    }
}
