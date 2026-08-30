package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uu0  reason: default package */
/* loaded from: classes.dex */
public final class uu0 {
    public final sk2 a;
    public ij0 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final j33 d = new j33();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public uu0(sk2 sk2Var, ij0 ij0Var) {
        this.a = sk2Var;
        this.b = ij0Var;
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
            bf4 bf4Var = this.b.q0;
            bf4Var.h0(xe4.d);
            bf4Var.e0[bf4Var.f0 - bf4Var.c0[bf4Var.d0 - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            ij0 ij0Var = this.b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            ij0Var.getClass();
            if (size != 0) {
                bf4 bf4Var2 = ij0Var.q0;
                bf4Var2.h0(yd4.d);
                hi2.V(bf4Var2, 0, objArr);
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
                bf4 bf4Var = this.b.q0;
                bf4Var.h0(ne4.d);
                int i3 = bf4Var.f0 - bf4Var.c0[bf4Var.d0 - 1].b;
                int[] iArr = bf4Var.e0;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                bf4 bf4Var2 = this.b.q0;
                bf4Var2.h0(je4.d);
                int i6 = bf4Var2.f0 - bf4Var2.c0[bf4Var2.d0 - 1].b;
                int[] iArr2 = bf4Var2.e0;
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
        v86 v86Var = this.a.G;
        if (z) {
            i = v86Var.i;
        } else {
            i = v86Var.g;
        }
        int i2 = i - this.f;
        if (i2 < 0) {
            xu0.a("Tried to seek backward");
        }
        if (i2 > 0) {
            bf4 bf4Var = this.b.q0;
            bf4Var.h0(rd4.d);
            bf4Var.e0[bf4Var.f0 - bf4Var.c0[bf4Var.d0 - 1].b] = i2;
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
                xu0.a("Invalid remove index " + i);
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
