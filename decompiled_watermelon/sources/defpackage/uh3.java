package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uh3  reason: default package */
/* loaded from: classes.dex */
public final class uh3 extends ku0 {
    public final rh3 b;
    public final gj3 c;
    public final int d;
    public final /* synthetic */ gj3 e;
    public final /* synthetic */ ki3 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh3(rh3 rh3Var, gj3 gj3Var, int i, ki3 ki3Var, int i2, int i3, long j) {
        super(1);
        this.e = gj3Var;
        this.f = ki3Var;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = rh3Var;
        this.c = gj3Var;
        this.d = i;
    }

    public final zh3 o(int i, long j, int i2, int i3, int i4) {
        int i5;
        rh3 rh3Var = this.b;
        Object c = rh3Var.c(i);
        Object s = rh3Var.b.s(i);
        List g = g(this.c, i, j);
        if (lz0.f(j)) {
            i5 = lz0.j(j);
        } else {
            if (!lz0.e(j)) {
                pz2.a("does not have fixed height");
            }
            i5 = lz0.i(j);
        }
        sd3 layoutDirection = this.e.B.getLayoutDirection();
        bj3 bj3Var = this.f.m;
        return new zh3(i, c, i5, i4, layoutDirection, this.g, this.h, g, this.i, s, bj3Var, j, i2, i3);
    }
}
