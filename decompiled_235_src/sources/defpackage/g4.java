package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ g4(Object obj, int i, mq3 mq3Var, zv0 zv0Var, int i2) {
        this.A = 1;
        this.R = obj;
        this.B = i;
        this.X = mq3Var;
        this.Y = zv0Var;
        this.L = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        int i2 = this.B;
        Object obj3 = this.R;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                g04.r((String) obj3, (String) obj5, (eo2) obj4, (px0) obj, ii2.a0(i2 | 1), this.L);
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(this.L | 1);
                qo2.f(this.R, this.B, (mq3) obj5, (zv0) obj4, (px0) obj, a0);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                hf.k((String) obj3, (String) obj5, (a74) obj4, (px0) obj, ii2.a0(i2 | 1), this.L);
                return jg7Var;
        }
    }

    public /* synthetic */ g4(String str, String str2, Object obj, int i, int i2, int i3) {
        this.A = i3;
        this.R = str;
        this.X = str2;
        this.Y = obj;
        this.B = i;
        this.L = i2;
    }
}
