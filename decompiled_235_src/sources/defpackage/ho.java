package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ho  reason: default package */
/* loaded from: classes.dex */
public final class ho extends aj3 implements eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ a74 R;
    public final /* synthetic */ o52 X;
    public final /* synthetic */ z72 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ zv0 d0;
    public final /* synthetic */ int e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho(Object obj, boolean z, a74 a74Var, o52 o52Var, z72 z72Var, String str, zv0 zv0Var, int i, int i2) {
        super(2);
        this.B = i2;
        this.f0 = obj;
        this.L = z;
        this.R = a74Var;
        this.X = o52Var;
        this.Y = z72Var;
        this.Z = str;
        this.d0 = zv0Var;
        this.e0 = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.B;
        jg7 jg7Var = jg7.a;
        int i2 = this.e0;
        Object obj3 = this.f0;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int a0 = ii2.a0(i2 | 1);
                g04.e((m26) obj3, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a0);
                return jg7Var;
            default:
                ((Number) obj2).intValue();
                int a02 = ii2.a0(i2 | 1);
                g04.c((zt0) obj3, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a02);
                return jg7Var;
        }
    }
}
