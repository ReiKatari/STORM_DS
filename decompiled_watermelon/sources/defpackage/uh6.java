package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uh6  reason: default package */
/* loaded from: classes.dex */
public final class uh6 extends ic3 implements aj2 {
    public final /* synthetic */ yh6 B;
    public final /* synthetic */ zy3 L;
    public final /* synthetic */ aj2 R;
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh6(yh6 yh6Var, zy3 zy3Var, aj2 aj2Var, int i) {
        super(2);
        this.B = yh6Var;
        this.L = zy3Var;
        this.R = aj2Var;
        this.X = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int I = ep2.I(this.X | 1);
        vh6.b(this.B, this.L, this.R, (tu0) obj, I);
        return o27.a;
    }
}
