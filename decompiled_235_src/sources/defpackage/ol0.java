package defpackage;

import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ol0  reason: default package */
/* loaded from: classes.dex */
public final class ol0 extends la7 {
    public boolean a = false;
    public final ViewGroup b;

    public ol0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.la7, defpackage.da7
    public final void a(ea7 ea7Var) {
        if (!this.a) {
            ej2.W(this.b, false);
        }
        ea7Var.D(this);
    }

    @Override // defpackage.la7, defpackage.da7
    public final void b() {
        ej2.W(this.b, false);
    }

    @Override // defpackage.la7, defpackage.da7
    public final void e() {
        ej2.W(this.b, true);
    }

    @Override // defpackage.la7, defpackage.da7
    public final void f(ea7 ea7Var) {
        ej2.W(this.b, false);
        this.a = true;
    }
}
