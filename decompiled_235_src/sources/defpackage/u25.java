package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u25  reason: default package */
/* loaded from: classes.dex */
public abstract class u25 extends ct0 {
    public final t25 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u25(gg3 gg3Var) {
        super(gg3Var);
        gg3Var.getClass();
        this.b = new t25(gg3Var.e());
    }

    @Override // defpackage.m0, defpackage.gg3
    public final Object c(sc1 sc1Var) {
        return j(sc1Var, null);
    }

    @Override // defpackage.ct0, defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        int i = i(obj);
        t25 t25Var = this.b;
        vx0 g0 = x32Var.g0(t25Var, i);
        p(g0, obj, i);
        g0.a(t25Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return this.b;
    }

    @Override // defpackage.m0
    public final Object f() {
        return (s25) l(o());
    }

    @Override // defpackage.m0
    public final int g(Object obj) {
        s25 s25Var = (s25) obj;
        s25Var.getClass();
        return s25Var.d();
    }

    @Override // defpackage.m0
    public final Iterator h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.m0
    public final Object m(Object obj) {
        s25 s25Var = (s25) obj;
        s25Var.getClass();
        return s25Var.a();
    }

    @Override // defpackage.ct0
    public final void n(int i, Object obj, Object obj2) {
        ((s25) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object o();

    public abstract void p(vx0 vx0Var, Object obj, int i);
}
