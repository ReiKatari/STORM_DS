package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hk3  reason: default package */
/* loaded from: classes.dex */
public final class hk3 extends ku0 {
    public final fk3 b;
    public final gj3 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gj3 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ h20 i;
    public final /* synthetic */ i20 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ pk3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk3(long j, boolean z, fk3 fk3Var, gj3 gj3Var, int i, int i2, h20 h20Var, i20 i20Var, int i3, int i4, long j2, pk3 pk3Var) {
        super(1);
        int i5;
        this.e = z;
        this.f = gj3Var;
        this.g = i;
        this.h = i2;
        this.i = h20Var;
        this.j = i20Var;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = pk3Var;
        this.b = fk3Var;
        this.c = gj3Var;
        int i6 = Preference.DEFAULT_ORDER;
        if (z) {
            i5 = lz0.h(j);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        this.d = nz0.b(0, i5, 0, z ? i6 : lz0.g(j), 5);
    }

    public final kk3 o(int i, long j) {
        int i2;
        fk3 fk3Var = this.b;
        Object c = fk3Var.c(i);
        Object s = fk3Var.b.s(i);
        List g = g(this.c, i, j);
        if (i == this.g - 1) {
            i2 = 0;
        } else {
            i2 = this.h;
        }
        int i3 = i2;
        return new kk3(i, g, this.e, this.i, this.j, this.f.B.getLayoutDirection(), this.k, this.l, i3, this.m, c, s, this.n.o, j);
    }
}
