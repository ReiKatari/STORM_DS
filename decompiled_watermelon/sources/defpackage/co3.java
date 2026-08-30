package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: co3  reason: default package */
/* loaded from: classes.dex */
public final class co3 {
    public io1 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public co3() {
        c();
    }

    public final void a() {
        int m;
        boolean z = this.d;
        io1 io1Var = this.a;
        if (z) {
            m = io1Var.i();
        } else {
            m = io1Var.m();
        }
        this.c = m;
    }

    public final void b(View view, int i) {
        int n;
        io1 io1Var = this.a;
        int i2 = 0;
        if (Integer.MIN_VALUE == io1Var.a) {
            n = 0;
        } else {
            n = io1Var.n() - io1Var.a;
        }
        if (n >= 0) {
            boolean z = this.d;
            io1 io1Var2 = this.a;
            if (z) {
                int d = io1Var2.d(view);
                io1 io1Var3 = this.a;
                if (Integer.MIN_VALUE != io1Var3.a) {
                    i2 = io1Var3.n() - io1Var3.a;
                }
                this.c = i2 + d;
            } else {
                this.c = io1Var2.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        io1 io1Var4 = this.a;
        if (z2) {
            int i3 = (io1Var4.i() - n) - this.a.d(view);
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
        int g = io1Var4.g(view);
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
        return ej6.h(sb, this.e, '}');
    }
}
