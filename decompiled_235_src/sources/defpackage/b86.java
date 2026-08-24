package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b86  reason: default package */
/* loaded from: classes.dex */
public final class b86 extends hw6 implements eo2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b86(long j, r41 r41Var) {
        super(2, r41Var);
        this.Y = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((b86) q((r41) obj2, (k86) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        b86 b86Var = new b86(this.Y, r41Var);
        b86Var.X = obj;
        return b86Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        m86 m86Var = ((k86) this.X).a;
        m86Var.c(m86Var.k, this.Y, 1);
        return jg7.a;
    }
}
