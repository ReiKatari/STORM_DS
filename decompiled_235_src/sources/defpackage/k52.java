package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k52  reason: default package */
/* loaded from: classes.dex */
public final class k52 extends aj3 implements qn2 {
    public final /* synthetic */ dx4 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ ln X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k52(dx4 dx4Var, long j, long j2, ln lnVar) {
        super(1);
        this.B = dx4Var;
        this.L = j;
        this.R = j2;
        this.X = lnVar;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        cx4 cx4Var = (cx4) obj;
        long j = this.L;
        long j2 = this.R;
        cx4Var.getClass();
        dx4 dx4Var = this.B;
        cx4.b(cx4Var, dx4Var);
        dx4Var.h0(i93.c(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L), dx4Var.X), RecyclerView.B1, this.X);
        return jg7.a;
    }
}
