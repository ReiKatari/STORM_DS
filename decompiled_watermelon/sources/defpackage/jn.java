package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jn  reason: default package */
/* loaded from: classes.dex */
public final class jn extends ic3 implements mi2 {
    public final /* synthetic */ ln B;
    public final /* synthetic */ yn4 L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(ln lnVar, yn4 yn4Var, long j) {
        super(1);
        this.B = lnVar;
        this.L = yn4Var;
        this.R = j;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ub ubVar = this.B.m0.b;
        yn4 yn4Var = this.L;
        int i = yn4Var.A;
        xn4.l((xn4) obj, yn4Var, ubVar.a((yn4Var.B & 4294967295L) | (i << 32), this.R, sd3.Ltr));
        return o27.a;
    }
}
