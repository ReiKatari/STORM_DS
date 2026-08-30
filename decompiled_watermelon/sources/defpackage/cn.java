package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cn  reason: default package */
/* loaded from: classes.dex */
public final class cn extends ic3 implements aj2 {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ kx6 L;
    public final /* synthetic */ mi2 R;
    public final /* synthetic */ zy3 X;
    public final /* synthetic */ et0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(kx6 kx6Var, mi2 mi2Var, zy3 zy3Var, z02 z02Var, h32 h32Var, et0 et0Var, int i) {
        super(2);
        this.L = kx6Var;
        this.R = mi2Var;
        this.X = zy3Var;
        this.c0 = z02Var;
        this.d0 = h32Var;
        this.Y = et0Var;
        this.Z = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.B;
        o27 o27Var = o27.a;
        int i2 = this.Z;
        Object obj3 = this.d0;
        Object obj4 = this.c0;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int I = ep2.I(i2 | 1);
                kx6 kx6Var = this.L;
                zy3 zy3Var = this.X;
                mi2 mi2Var = this.R;
                b53.b(kx6Var, zy3Var, mi2Var, (ub) obj3, (mi2) obj4, this.Y, (tu0) obj, I);
                return o27Var;
            default:
                ((Number) obj2).intValue();
                int I2 = ep2.I(i2 | 1);
                kx6 kx6Var2 = this.L;
                mi2 mi2Var2 = this.R;
                zy3 zy3Var2 = this.X;
                ct3.o(kx6Var2, mi2Var2, zy3Var2, (z02) obj4, (h32) obj3, this.Y, (tu0) obj, I2);
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(kx6 kx6Var, zy3 zy3Var, mi2 mi2Var, ub ubVar, mi2 mi2Var2, et0 et0Var, int i) {
        super(2);
        this.L = kx6Var;
        this.X = zy3Var;
        this.R = mi2Var;
        this.d0 = ubVar;
        this.c0 = mi2Var2;
        this.Y = et0Var;
        this.Z = i;
    }
}
