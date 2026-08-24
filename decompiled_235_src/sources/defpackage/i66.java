package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i66  reason: default package */
/* loaded from: classes.dex */
public final class i66 implements f92 {
    public final /* synthetic */ int a;
    public final n55 b;
    public final n55 c;
    public final f92 d;

    public /* synthetic */ i66(n55 n55Var, n55 n55Var2, f92 f92Var, int i) {
        this.a = i;
        this.b = n55Var;
        this.c = n55Var2;
        this.d = f92Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [wr0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [wr0, java.lang.Object] */
    @Override // defpackage.n55
    public final Object get() {
        int i = this.a;
        f92 f92Var = this.d;
        n55 n55Var = this.c;
        n55 n55Var2 = this.b;
        switch (i) {
            case 0:
                return new bt(27, (Context) n55Var2.get(), (i36) n55Var.get(), (uy) ((c72) f92Var).get(), false);
            default:
                return new sb7(new Object(), new Object(), (ye1) ((ze1) n55Var2).get(), (p87) ((sh7) n55Var).get(), (eb) ((kw7) f92Var).get());
        }
    }
}
