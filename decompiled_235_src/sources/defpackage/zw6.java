package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw6  reason: default package */
/* loaded from: classes.dex */
public final class zw6 extends hw6 implements eo2 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ qa4 Y;
    public final /* synthetic */ qa4 Z;
    public final /* synthetic */ qa4 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw6(qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, r41 r41Var) {
        super(2, r41Var);
        this.Y = qa4Var;
        this.Z = qa4Var2;
        this.d0 = qa4Var3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jg7 jg7Var = jg7.a;
        ((zw6) q((r41) obj2, bool)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        zw6 zw6Var = new zw6(this.Y, this.Z, this.d0, r41Var);
        zw6Var.X = ((Boolean) obj).booleanValue();
        return zw6Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        boolean z = this.X;
        float f = bx6.a;
        if (((Boolean) this.Y.getValue()).booleanValue() != z) {
            qn2 qn2Var = (qn2) this.Z.getValue();
            if (qn2Var != null) {
                qn2Var.g(Boolean.valueOf(z));
            }
            qa4 qa4Var = this.d0;
            qa4Var.setValue(Boolean.valueOf(!((Boolean) qa4Var.getValue()).booleanValue()));
        }
        return jg7.a;
    }
}
