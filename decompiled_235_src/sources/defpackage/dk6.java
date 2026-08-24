package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk6  reason: default package */
/* loaded from: classes.dex */
public final class dk6 extends hw6 implements fo2 {
    public /* synthetic */ float X;
    public final /* synthetic */ qa4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(qa4 qa4Var, r41 r41Var) {
        super(3, r41Var);
        this.Y = qa4Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        w61 w61Var = (w61) obj;
        float floatValue = ((Number) obj2).floatValue();
        dk6 dk6Var = new dk6(this.Y, (r41) obj3);
        dk6Var.X = floatValue;
        jg7 jg7Var = jg7.a;
        dk6Var.s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        ((qn2) this.Y.getValue()).g(new Float(this.X));
        return jg7.a;
    }
}
