package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v02  reason: default package */
/* loaded from: classes.dex */
public final class v02 extends ic3 implements mi2 {
    public final /* synthetic */ yn4 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ zm X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v02(yn4 yn4Var, long j, long j2, zm zmVar) {
        super(1);
        this.B = yn4Var;
        this.L = j;
        this.R = j2;
        this.X = zmVar;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        xn4 xn4Var = (xn4) obj;
        long j = this.L;
        long j2 = this.R;
        xn4Var.getClass();
        yn4 yn4Var = this.B;
        xn4.a(xn4Var, yn4Var);
        yn4Var.o0(a33.c(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L), yn4Var.X), RecyclerView.A1, this.X);
        return o27.a;
    }
}
