package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul6  reason: default package */
/* loaded from: classes.dex */
public final class ul6 extends jg5 {
    public boolean a = false;
    public final /* synthetic */ hr4 b;

    public ul6(hr4 hr4Var) {
        this.b = hr4Var;
    }

    @Override // defpackage.jg5
    public final void a(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.jg5
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
