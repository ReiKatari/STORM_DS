package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: un  reason: default package */
/* loaded from: classes.dex */
public final class un extends ic3 implements aj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ zy3 R;
    public final /* synthetic */ z02 X;
    public final /* synthetic */ h32 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ et0 c0;
    public final /* synthetic */ int d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un(Object obj, boolean z, zy3 zy3Var, z02 z02Var, h32 h32Var, String str, et0 et0Var, int i, int i2) {
        super(2);
        this.B = i2;
        this.e0 = obj;
        this.L = z;
        this.R = zy3Var;
        this.X = z02Var;
        this.Y = h32Var;
        this.Z = str;
        this.c0 = et0Var;
        this.d0 = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.B;
        o27 o27Var = o27.a;
        int i2 = this.d0;
        Object obj3 = this.e0;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int I = ep2.I(i2 | 1);
                ct3.l((tr5) obj3, this.L, this.R, this.X, this.Y, this.Z, this.c0, (tu0) obj, I);
                return o27Var;
            default:
                ((Number) obj2).intValue();
                int I2 = ep2.I(i2 | 1);
                ct3.g((mr0) obj3, this.L, this.R, this.X, this.Y, this.Z, this.c0, (tu0) obj, I2);
                return o27Var;
        }
    }
}
