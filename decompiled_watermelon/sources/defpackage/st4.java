package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: st4  reason: default package */
/* loaded from: classes.dex */
public abstract class st4 extends pq0 {
    public final rt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st4(m93 m93Var) {
        super(m93Var);
        m93Var.getClass();
        this.b = new rt4(m93Var.e());
    }

    @Override // defpackage.l0, defpackage.m93
    public final Object b(b91 b91Var) {
        return j(b91Var, null);
    }

    @Override // defpackage.pq0, defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        int i = i(obj);
        rt4 rt4Var = this.b;
        zu0 f0 = mz1Var.f0(rt4Var, i);
        p(f0, obj, i);
        f0.a(rt4Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return this.b;
    }

    @Override // defpackage.l0
    public final Object f() {
        return (qt4) l(o());
    }

    @Override // defpackage.l0
    public final int g(Object obj) {
        qt4 qt4Var = (qt4) obj;
        qt4Var.getClass();
        return qt4Var.d();
    }

    @Override // defpackage.l0
    public final Iterator h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.l0
    public final Object m(Object obj) {
        qt4 qt4Var = (qt4) obj;
        qt4Var.getClass();
        return qt4Var.a();
    }

    @Override // defpackage.pq0
    public final void n(int i, Object obj, Object obj2) {
        ((qt4) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object o();

    public abstract void p(zu0 zu0Var, Object obj, int i);
}
