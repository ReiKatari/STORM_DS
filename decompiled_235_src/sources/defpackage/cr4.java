package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cr4  reason: default package */
/* loaded from: classes.dex */
public final class cr4 implements f34 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final lo4 e;
    public final int f;
    public final int g;
    public final int h;
    public final i34 i;
    public final i34 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final cs1 n;
    public final f34 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final w61 s;
    public final qh1 t;
    public final long u;

    public cr4(List list, int i, int i2, int i3, lo4 lo4Var, int i4, int i5, int i6, i34 i34Var, i34 i34Var2, float f, int i7, boolean z, cs1 cs1Var, f34 f34Var, boolean z2, List list2, List list3, w61 w61Var, qh1 qh1Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = lo4Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i34Var;
        this.j = i34Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = cs1Var;
        this.o = f34Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = w61Var;
        this.t = qh1Var;
        this.u = j;
    }

    @Override // defpackage.f34
    public final void a() {
        this.o.a();
    }

    @Override // defpackage.f34
    public final Map b() {
        return this.o.b();
    }

    @Override // defpackage.f34
    public final qn2 c() {
        return this.o.c();
    }

    public final cr4 d(int i) {
        int i2;
        float f;
        int i3 = this.b + this.c;
        if (!this.p) {
            List list = this.a;
            if (!list.isEmpty() && this.i != null && (i2 = this.l - i) >= 0 && i2 < i3) {
                if (i3 != 0) {
                    f = i / i3;
                } else {
                    f = RecyclerView.B1;
                }
                float f2 = this.k - f;
                if (this.j != null && f2 < 0.5f && f2 > -0.5f) {
                    i34 i34Var = (i34) gt0.H0(list);
                    i34 i34Var2 = (i34) gt0.Q0(list);
                    int i4 = this.g;
                    int i5 = this.f;
                    if (i < 0) {
                        if (Math.min((i34Var.j + i3) - i5, (i34Var2.j + i3) - i4) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(i5 - i34Var.j, i4 - i34Var2.j) <= i) {
                        return null;
                    }
                    int size = list.size();
                    boolean z = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        ((i34) list.get(i6)).a(i);
                    }
                    List list2 = this.q;
                    int size2 = list2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((i34) list2.get(i7)).a(i);
                    }
                    List list3 = this.r;
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        ((i34) list3.get(i8)).a(i);
                    }
                    return new cr4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f2, i2, (this.m || i > 0) ? true : true, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long e() {
        f34 f34Var = this.o;
        return (f34Var.getWidth() << 32) | (f34Var.getHeight() & 4294967295L);
    }

    @Override // defpackage.f34
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // defpackage.f34
    public final int getWidth() {
        return this.o.getWidth();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ cr4(int i, int i2, int i3, lo4 lo4Var, int i4, int i5, int i6, cs1 cs1Var, f34 f34Var, w61 w61Var, qh1 qh1Var, long j) {
        this(r1, i, i2, i3, lo4Var, i4, i5, i6, null, null, RecyclerView.B1, 0, false, cs1Var, f34Var, false, r1, r1, w61Var, qh1Var, j);
        yt1 yt1Var = yt1.A;
    }
}
