package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o17  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o17 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ long B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ o17(long j, s47 s47Var, eo2 eo2Var, int i, int i2) {
        this.B = j;
        this.X = s47Var;
        this.Y = eo2Var;
        this.L = i;
        this.R = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.L;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(i2 | 1);
                nj2.b(this.B, (s47) obj4, (eo2) obj3, (px0) obj, a0, this.R);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(i2 | 1);
                hf.i((String) obj4, (a74) obj3, this.B, (px0) obj, a02, this.R);
                return jg7Var;
        }
    }

    public /* synthetic */ o17(String str, a74 a74Var, long j, int i, int i2) {
        this.X = str;
        this.Y = a74Var;
        this.B = j;
        this.L = i;
        this.R = i2;
    }
}
