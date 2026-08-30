package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xf  reason: default package */
/* loaded from: classes.dex */
public final class xf extends ic3 implements aj2 {
    public final /* synthetic */ zy3 B;
    public final /* synthetic */ aj2 L;
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(zy3 zy3Var, aj2 aj2Var, int i) {
        super(2);
        this.B = zy3Var;
        this.L = aj2Var;
        this.R = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int I = ep2.I(this.R | 1);
        dt3.M(this.B, this.L, (tu0) obj, I);
        return o27.a;
    }
}
