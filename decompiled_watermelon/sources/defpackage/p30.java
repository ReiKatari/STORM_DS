package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p30  reason: default package */
/* loaded from: classes.dex */
public final class p30 extends ic3 implements mi2 {
    public final /* synthetic */ float B;
    public final /* synthetic */ float L;
    public final /* synthetic */ int R;
    public final /* synthetic */ boolean X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(float f, float f2, int i, boolean z) {
        super(1);
        this.B = f;
        this.L = f2;
        this.R = i;
        this.X = z;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        o30 o30Var;
        is2 is2Var = iq2.g;
        rf5 rf5Var = (rf5) obj;
        float b = rf5Var.j0.b() * this.B;
        float b2 = rf5Var.j0.b() * this.L;
        if (b > RecyclerView.A1 && b2 > RecyclerView.A1) {
            o30Var = new o30(b, b2, this.R);
        } else {
            o30Var = null;
        }
        rf5Var.h(o30Var);
        rf5Var.p(is2Var);
        rf5Var.f(this.X);
        return o27.a;
    }
}
