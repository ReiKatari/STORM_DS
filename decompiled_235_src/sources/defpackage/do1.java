package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: do1  reason: default package */
/* loaded from: classes.dex */
public final class do1 extends hw6 implements fo2 {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do1(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                w61 w61Var = (w61) obj;
                long j = ((jk4) obj2).a;
                new do1(3, (r41) obj3, 0).s(jg7Var);
                return jg7Var;
            case 1:
                w61 w61Var2 = (w61) obj;
                ((Number) obj2).floatValue();
                new do1(3, (r41) obj3, 1).s(jg7Var);
                return jg7Var;
            default:
                j25 j25Var = (j25) obj;
                long j2 = ((jk4) obj2).a;
                new do1(3, (r41) obj3, 2).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return jg7Var;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return jg7Var;
        }
    }
}
