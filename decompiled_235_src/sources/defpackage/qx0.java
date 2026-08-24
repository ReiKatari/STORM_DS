package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx0  reason: default package */
/* loaded from: classes.dex */
public final class qx0 {
    public final xq2 a;
    public rl0 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final r93 d = new r93();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public qx0(xq2 xq2Var, rl0 rl0Var) {
        this.a = xq2Var;
        this.b = rl0Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.g++;
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            co4 co4Var = this.b.m;
            co4Var.h0(yn4.d);
            co4Var.e[co4Var.f - co4Var.c[co4Var.d - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            rl0 rl0Var = this.b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            rl0Var.getClass();
            if (size != 0) {
                co4 co4Var2 = rl0Var.m;
                co4Var2.h0(zm4.d);
                bl2.P(co4Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                co4 co4Var = this.b.m;
                co4Var.h0(on4.d);
                int i3 = co4Var.f - co4Var.c[co4Var.d - 1].b;
                int[] iArr = co4Var.e;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                co4 co4Var2 = this.b.m;
                co4Var2.h0(kn4.d);
                int i6 = co4Var2.f - co4Var2.c[co4Var2.d - 1].b;
                int[] iArr2 = co4Var2.e;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        int i;
        lk6 lk6Var = this.a.G;
        if (z) {
            i = lk6Var.i;
        } else {
            i = lk6Var.g;
        }
        int i2 = i - this.f;
        if (i2 < 0) {
            tx0.a("Tried to seek backward");
        }
        if (i2 > 0) {
            co4 co4Var = this.b.m;
            co4Var.h0(sm4.d);
            co4Var.e[co4Var.f - co4Var.c[co4Var.d - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                tx0.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
