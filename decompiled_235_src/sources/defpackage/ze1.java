package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze1  reason: default package */
/* loaded from: classes.dex */
public final class ze1 implements f92 {
    public final n55 a;
    public final n55 b;
    public final i66 c;
    public final n55 d;
    public final n55 e;

    public ze1(n55 n55Var, n55 n55Var2, i66 i66Var, n55 n55Var3, n55 n55Var4) {
        this.a = n55Var;
        this.b = n55Var2;
        this.c = i66Var;
        this.d = n55Var3;
        this.e = n55Var4;
    }

    @Override // defpackage.n55
    public final Object get() {
        return new ye1((Executor) this.a.get(), (m54) this.b.get(), (bt) this.c.get(), (i36) this.d.get(), (i36) this.e.get());
    }
}
