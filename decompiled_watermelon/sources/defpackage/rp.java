package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rp implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ zy3 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ float X;
    public final /* synthetic */ et0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;

    public /* synthetic */ rp(long j, long j2, float f, ih4 ih4Var, re7 re7Var, zy3 zy3Var, et0 et0Var, int i) {
        this.L = j;
        this.R = j2;
        this.X = f;
        this.c0 = ih4Var;
        this.d0 = re7Var;
        this.B = zy3Var;
        this.Y = et0Var;
        this.Z = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.Z;
        Object obj3 = this.d0;
        Object obj4 = this.c0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                up.a(this.L, this.R, this.X, (ih4) obj4, (re7) obj3, this.B, this.Y, (tu0) obj, I);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                ln2.m(this.B, (aj2) obj4, (y26) obj3, this.L, this.R, this.X, this.Y, (tu0) obj, I2);
                return o27Var;
        }
    }

    public /* synthetic */ rp(zy3 zy3Var, aj2 aj2Var, y26 y26Var, long j, long j2, float f, et0 et0Var, int i) {
        this.B = zy3Var;
        this.c0 = aj2Var;
        this.d0 = y26Var;
        this.L = j;
        this.R = j2;
        this.X = f;
        this.Y = et0Var;
        this.Z = i;
    }
}
