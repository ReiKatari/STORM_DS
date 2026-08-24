package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: so3  reason: default package */
/* loaded from: classes.dex */
public final class so3 extends gx0 {
    public final po3 b;
    public final fq3 c;
    public final int d;
    public final /* synthetic */ fq3 e;
    public final /* synthetic */ ip3 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so3(po3 po3Var, fq3 fq3Var, int i, ip3 ip3Var, int i2, int i3, long j) {
        super(1);
        this.e = fq3Var;
        this.f = ip3Var;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = po3Var;
        this.c = fq3Var;
        this.d = i;
    }

    public final xo3 o(int i, int i2, int i3, int i4, long j) {
        int i5;
        po3 po3Var = this.b;
        Object c = po3Var.c(i);
        Object H = po3Var.b.H(i);
        List g = g(this.c, i, j);
        if (q21.f(j)) {
            i5 = q21.j(j);
        } else {
            if (!q21.e(j)) {
                s53.a("does not have fixed height");
            }
            i5 = q21.i(j);
        }
        kk3 layoutDirection = this.e.B.getLayoutDirection();
        zp3 zp3Var = this.f.m;
        return new xo3(i, c, i5, i4, layoutDirection, this.g, this.h, g, this.i, H, zp3Var, j, i2, i3);
    }
}
