package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fa6  reason: default package */
/* loaded from: classes.dex */
public final class fa6 extends t65 {
    public boolean a = false;
    public final /* synthetic */ ei4 b;

    public fa6(ei4 ei4Var) {
        this.b = ei4Var;
    }

    @Override // defpackage.t65
    public final void a(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.t65
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
