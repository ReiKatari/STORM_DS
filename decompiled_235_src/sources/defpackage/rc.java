package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc  reason: default package */
/* loaded from: classes.dex */
public final class rc extends hw6 implements fo2 {
    public /* synthetic */ w61 X;
    public /* synthetic */ float Y;
    public final /* synthetic */ dd Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(dd ddVar, r41 r41Var) {
        super(3, r41Var);
        this.Z = ddVar;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        rc rcVar = new rc(this.Z, (r41) obj3);
        rcVar.X = (w61) obj;
        rcVar.Y = floatValue;
        jg7 jg7Var = jg7.a;
        rcVar.s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        hv.L(this.X, null, null, new qc(this.Z, this.Y, null, 0), 3);
        return jg7.a;
    }
}
