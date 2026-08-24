package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev3  reason: default package */
/* loaded from: classes.dex */
public final class ev3 {
    public ts1 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public ev3() {
        c();
    }

    public final void a() {
        int m;
        boolean z = this.d;
        ts1 ts1Var = this.a;
        if (z) {
            m = ts1Var.i();
        } else {
            m = ts1Var.m();
        }
        this.c = m;
    }

    public final void b(View view, int i) {
        int n;
        ts1 ts1Var = this.a;
        int i2 = 0;
        if (Integer.MIN_VALUE == ts1Var.a) {
            n = 0;
        } else {
            n = ts1Var.n() - ts1Var.a;
        }
        if (n >= 0) {
            boolean z = this.d;
            ts1 ts1Var2 = this.a;
            if (z) {
                int d = ts1Var2.d(view);
                ts1 ts1Var3 = this.a;
                if (Integer.MIN_VALUE != ts1Var3.a) {
                    i2 = ts1Var3.n() - ts1Var3.a;
                }
                this.c = i2 + d;
            } else {
                this.c = ts1Var2.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        ts1 ts1Var4 = this.a;
        if (z2) {
            int i3 = (ts1Var4.i() - n) - this.a.d(view);
            this.c = this.a.i() - i3;
            if (i3 > 0) {
                int e = this.c - this.a.e(view);
                int m = this.a.m();
                int min = e - (Math.min(this.a.g(view) - m, 0) + m);
                if (min < 0) {
                    this.c = Math.min(i3, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int g = ts1Var4.g(view);
        int m2 = g - this.a.m();
        this.c = g;
        if (m2 > 0) {
            int i4 = (this.a.i() - Math.min(0, (this.a.i() - n) - this.a.d(view))) - (this.a.e(view) + g);
            if (i4 < 0) {
                this.c -= Math.min(m2, -i4);
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.d);
        sb.append(", mValid=");
        return xg6.r(sb, this.e, '}');
    }
}
