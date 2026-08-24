package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d17  reason: default package */
/* loaded from: classes.dex */
public final class d17 {
    public final fp a;
    public final s47 b;
    public final boolean e;
    public final qh1 g;
    public final ki2 h;
    public s9 j;
    public kk3 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = yt1.A;

    public d17(fp fpVar, s47 s47Var, boolean z, qh1 qh1Var, ki2 ki2Var, int i) {
        this.a = fpVar;
        this.b = s47Var;
        this.e = z;
        this.g = qh1Var;
        this.h = ki2Var;
    }

    public final void a(kk3 kk3Var) {
        s9 s9Var = this.j;
        if (s9Var == null || kk3Var != this.k || s9Var.a()) {
            this.k = kk3Var;
            s9Var = new s9(this.a, gi2.N(this.b, kk3Var), this.i, this.g, this.h);
        }
        this.j = s9Var;
    }
}
