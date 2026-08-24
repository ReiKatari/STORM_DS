package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw7  reason: default package */
/* loaded from: classes.dex */
public final class kw7 implements f92 {
    public final n55 a;
    public final n55 b;
    public final i66 c;
    public final n55 d;

    public kw7(n55 n55Var, n55 n55Var2, i66 i66Var, n55 n55Var3) {
        this.a = n55Var;
        this.b = n55Var2;
        this.c = i66Var;
        this.d = n55Var3;
    }

    @Override // defpackage.n55
    public final Object get() {
        return new eb((Executor) this.a.get(), (i36) this.b.get(), (bt) this.c.get(), (i36) this.d.get(), 28);
    }
}
