package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vx0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vx0 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ ki2 X;
    public final /* synthetic */ wc2 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int c0;
    public final /* synthetic */ Object d0;

    public /* synthetic */ vx0(String str, ax2 ax2Var, boolean z, boolean z2, ki2 ki2Var, wc2 wc2Var, int i, int i2) {
        this.B = str;
        this.d0 = ax2Var;
        this.L = z;
        this.R = z2;
        this.X = ki2Var;
        this.Y = wc2Var;
        this.Z = i;
        this.c0 = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.Z;
        Object obj3 = this.d0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                yx0.b(this.B, this.L, this.Y, this.R, this.X, (aj2) obj3, (tu0) obj, I, this.c0);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                ol4.d(this.B, (ax2) obj3, this.L, this.R, this.X, this.Y, (tu0) obj, I2, this.c0);
                return o27Var;
        }
    }

    public /* synthetic */ vx0(String str, boolean z, wc2 wc2Var, boolean z2, ki2 ki2Var, aj2 aj2Var, int i, int i2) {
        this.B = str;
        this.L = z;
        this.Y = wc2Var;
        this.R = z2;
        this.X = ki2Var;
        this.d0 = aj2Var;
        this.Z = i;
        this.c0 = i2;
    }
}
