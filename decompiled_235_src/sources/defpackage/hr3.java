package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr3  reason: default package */
/* loaded from: classes.dex */
public final class hr3 extends gx0 {
    public final fr3 b;
    public final fq3 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fq3 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ c40 i;
    public final /* synthetic */ d40 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ pr3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr3(long j, boolean z, fr3 fr3Var, fq3 fq3Var, int i, int i2, c40 c40Var, d40 d40Var, int i3, int i4, long j2, pr3 pr3Var) {
        super(1);
        int i5;
        this.e = z;
        this.f = fq3Var;
        this.g = i;
        this.h = i2;
        this.i = c40Var;
        this.j = d40Var;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = pr3Var;
        this.b = fr3Var;
        this.c = fq3Var;
        if (z) {
            i5 = q21.h(j);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        this.d = s21.b(0, i5, 0, z ? Integer.MAX_VALUE : q21.g(j), 5);
    }

    public final kr3 o(int i, long j) {
        int i2;
        fr3 fr3Var = this.b;
        Object c = fr3Var.c(i);
        Object H = fr3Var.b.H(i);
        List g = g(this.c, i, j);
        if (i == this.g - 1) {
            i2 = 0;
        } else {
            i2 = this.h;
        }
        int i3 = i2;
        return new kr3(i, g, this.e, this.i, this.j, this.f.B.getLayoutDirection(), this.k, this.l, i3, this.m, c, H, this.n.o, j);
    }
}
