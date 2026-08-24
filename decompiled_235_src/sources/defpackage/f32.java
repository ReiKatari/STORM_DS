package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f32  reason: default package */
/* loaded from: classes.dex */
public final class f32 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ fk3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f32(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        fk3 fk3Var = (fk3) obj;
        jg7 jg7Var2 = (jg7) obj2;
        r41 r41Var = (r41) obj3;
        switch (i) {
            case 0:
                f32 f32Var = new f32(3, r41Var, 0);
                f32Var.Y = fk3Var;
                return f32Var.s(jg7Var);
            default:
                f32 f32Var2 = new f32(3, r41Var, 1);
                f32Var2.Y = fk3Var;
                return f32Var2.s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        fk3 fk3Var = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return fk3Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return fk3Var;
        }
    }
}
