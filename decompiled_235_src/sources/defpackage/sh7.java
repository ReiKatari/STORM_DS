package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh7  reason: default package */
/* loaded from: classes.dex */
public final class sh7 implements f92 {
    public final n55 a;
    public final n55 b;
    public final n55 c;
    public final i66 d;
    public final n55 e;
    public final n55 f;

    public sh7(n55 n55Var, n55 n55Var2, n55 n55Var3, i66 i66Var, n55 n55Var4, n55 n55Var5) {
        this.a = n55Var;
        this.b = n55Var2;
        this.c = n55Var3;
        this.d = i66Var;
        this.e = n55Var4;
        this.f = n55Var5;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, p87] */
    @Override // defpackage.n55
    public final Object get() {
        Object obj = new Object();
        ?? obj2 = new Object();
        obj2.a = (Context) this.a.get();
        obj2.b = (m54) this.b.get();
        obj2.c = (i36) this.c.get();
        obj2.d = (bt) this.d.get();
        obj2.e = (Executor) this.e.get();
        obj2.f = (i36) this.f.get();
        obj2.g = obj;
        return obj2;
    }
}
