package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm5  reason: default package */
/* loaded from: classes.dex */
public abstract class cm5 extends d20 {
    public cm5(r41 r41Var) {
        super(r41Var);
        if (r41Var != null && r41Var.b() != vt1.A) {
            i.h("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // defpackage.r41
    public final l61 b() {
        return vt1.A;
    }
}
