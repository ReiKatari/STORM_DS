package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zh4  reason: default package */
/* loaded from: classes.dex */
public final class zh4 implements uv3 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final jf4 e;
    public final int f;
    public final int g;
    public final int h;
    public final xv3 i;
    public final xv3 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final sn1 n;
    public final uv3 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final o31 s;
    public final od1 t;
    public final long u;

    public zh4(List list, int i, int i2, int i3, jf4 jf4Var, int i4, int i5, int i6, xv3 xv3Var, xv3 xv3Var2, float f, int i7, boolean z, sn1 sn1Var, uv3 uv3Var, boolean z2, List list2, List list3, o31 o31Var, od1 od1Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = jf4Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = xv3Var;
        this.j = xv3Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = sn1Var;
        this.o = uv3Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = o31Var;
        this.t = od1Var;
        this.u = j;
    }

    @Override // defpackage.uv3
    public final int a() {
        return this.o.a();
    }

    @Override // defpackage.uv3
    public final void b() {
        this.o.b();
    }

    @Override // defpackage.uv3
    public final int c() {
        return this.o.c();
    }

    @Override // defpackage.uv3
    public final mi2 d() {
        return this.o.d();
    }

    @Override // defpackage.uv3
    public final Map e() {
        return this.o.e();
    }

    public final zh4 f(int i) {
        int i2;
        float f;
        int i3 = this.b + this.c;
        if (!this.p) {
            List list = this.a;
            if (!list.isEmpty() && this.i != null && (i2 = this.l - i) >= 0 && i2 < i3) {
                if (i3 != 0) {
                    f = i / i3;
                } else {
                    f = RecyclerView.A1;
                }
                float f2 = this.k - f;
                if (this.j != null && f2 < 0.5f && f2 > -0.5f) {
                    xv3 xv3Var = (xv3) tq0.K0(list);
                    xv3 xv3Var2 = (xv3) tq0.T0(list);
                    int i4 = this.g;
                    int i5 = this.f;
                    if (i < 0) {
                        if (Math.min((xv3Var.j + i3) - i5, (xv3Var2.j + i3) - i4) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(i5 - xv3Var.j, i4 - xv3Var2.j) <= i) {
                        return null;
                    }
                    int size = list.size();
                    boolean z = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        ((xv3) list.get(i6)).a(i);
                    }
                    List list2 = this.q;
                    int size2 = list2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((xv3) list2.get(i7)).a(i);
                    }
                    List list3 = this.r;
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        ((xv3) list3.get(i8)).a(i);
                    }
                    return new zh4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f2, i2, (this.m || i > 0) ? true : true, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long g() {
        uv3 uv3Var = this.o;
        return (uv3Var.c() << 32) | (uv3Var.a() & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zh4(int r24, int r25, int r26, defpackage.jf4 r27, int r28, int r29, int r30, defpackage.sn1 r31, defpackage.uv3 r32, defpackage.o31 r33, defpackage.od1 r34, long r35) {
        /*
            r23 = this;
            r13 = 0
            r16 = 0
            pp1 r1 = defpackage.pp1.A
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r14 = r31
            r15 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.<init>(int, int, int, jf4, int, int, int, sn1, uv3, o31, od1, long):void");
    }
}
