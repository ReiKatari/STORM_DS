package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dq implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ a74 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ float X;
    public final /* synthetic */ zv0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    public /* synthetic */ dq(long j, long j2, float f, lq4 lq4Var, tt7 tt7Var, a74 a74Var, zv0 zv0Var, int i) {
        this.L = j;
        this.R = j2;
        this.X = f;
        this.d0 = lq4Var;
        this.e0 = tt7Var;
        this.B = a74Var;
        this.Y = zv0Var;
        this.Z = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.Z;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(i2 | 1);
                gq.a(this.L, this.R, this.X, (lq4) obj4, (tt7) obj3, this.B, this.Y, (px0) obj, a0);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(i2 | 1);
                bl2.i(this.B, (eo2) obj4, (ke6) obj3, this.L, this.R, this.X, this.Y, (px0) obj, a02);
                return jg7Var;
        }
    }

    public /* synthetic */ dq(a74 a74Var, eo2 eo2Var, ke6 ke6Var, long j, long j2, float f, zv0 zv0Var, int i) {
        this.B = a74Var;
        this.d0 = eo2Var;
        this.e0 = ke6Var;
        this.L = j;
        this.R = j2;
        this.X = f;
        this.Y = zv0Var;
        this.Z = i;
    }
}
