package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jd5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ ao2 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    public /* synthetic */ jd5(String str, String str2, boolean z, boolean z2, on2 on2Var, int i, int i2) {
        this.A = 1;
        this.Z = str;
        this.d0 = str2;
        this.B = z;
        this.L = z2;
        this.R = on2Var;
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.X;
        Object obj3 = this.d0;
        Object obj4 = this.Z;
        ao2 ao2Var = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(i2 | 1);
                kd5.a(this.B, (on2) ao2Var, (a74) obj4, this.L, (ve1) obj3, (px0) obj, a0, this.Y);
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(i2 | 1);
                lt5.a((String) obj4, (String) obj3, this.B, this.L, (on2) ao2Var, (px0) obj, a02, this.Y);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a03 = ii2.a0(i2 | 1);
                bx6.a(this.B, (qn2) ao2Var, (a74) obj4, this.L, (rf1) obj3, (px0) obj, a03, this.Y);
                return jg7Var;
        }
    }

    public /* synthetic */ jd5(boolean z, ao2 ao2Var, a74 a74Var, boolean z2, Object obj, int i, int i2, int i3) {
        this.A = i3;
        this.B = z;
        this.R = ao2Var;
        this.Z = a74Var;
        this.L = z2;
        this.d0 = obj;
        this.X = i;
        this.Y = i2;
    }
}
