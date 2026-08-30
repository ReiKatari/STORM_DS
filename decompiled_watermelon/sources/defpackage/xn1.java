package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xn1  reason: default package */
/* loaded from: classes.dex */
public final class xn1 implements bc4 {
    public final /* synthetic */ int A = 1;
    public int B;
    public int L;
    public int R;
    public int X;
    public final Object Y;

    public xn1(to toVar, long j) {
        String str = toVar.B;
        xz1 xz1Var = new xz1();
        xz1Var.d = str;
        xz1Var.b = -1;
        xz1Var.c = -1;
        this.Y = xz1Var;
        this.B = vr6.f(j);
        this.L = vr6.e(j);
        this.R = -1;
        this.X = -1;
        int f = vr6.f(j);
        int e = vr6.e(j);
        if (f >= 0 && f <= str.length()) {
            if (e >= 0 && e <= str.length()) {
                if (f <= e) {
                    return;
                }
                i.i(wh1.f(f, e, "Do not set reversed range: ", " > "));
                throw null;
            }
            c44.p(wh1.s("end (", e, ") offset is outside of text region "), str.length());
            throw null;
        }
        c44.p(wh1.s("start (", f, ") offset is outside of text region "), str.length());
        throw null;
    }

    @Override // defpackage.bc4
    public vf7 G(View view, vf7 vf7Var) {
        View view2 = (View) this.Y;
        x13 h = vf7Var.a.h(519);
        int i = this.B;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.L + h.a, this.R + h.b, this.X + h.c, view2.getPaddingBottom());
        return vf7Var;
    }

    public void a(int i, int i2) {
        long g = ve2.g(i, i2);
        ((xz1) this.Y).k(i, i2, "");
        long F = tq5.F(ve2.g(this.B, this.L), g);
        h(vr6.f(F));
        g(vr6.e(F));
        int i3 = this.R;
        if (i3 != -1) {
            long F2 = tq5.F(ve2.g(i3, this.X), g);
            if (vr6.c(F2)) {
                this.R = -1;
                this.X = -1;
                return;
            }
            this.R = vr6.f(F2);
            this.X = vr6.e(F2);
        }
    }

    public char b(int i) {
        xz1 xz1Var = (xz1) this.Y;
        yp0 yp0Var = (yp0) xz1Var.e;
        if (yp0Var == null) {
            return ((String) xz1Var.d).charAt(i);
        }
        if (i < xz1Var.b) {
            return ((String) xz1Var.d).charAt(i);
        }
        int d = yp0Var.b - yp0Var.d();
        int i2 = xz1Var.b;
        if (i < d + i2) {
            int i3 = i - i2;
            int i4 = yp0Var.c;
            char[] cArr = (char[]) yp0Var.e;
            if (i3 < i4) {
                return cArr[i3];
            }
            return cArr[(i3 - i4) + yp0Var.d];
        }
        return ((String) xz1Var.d).charAt(i - ((d - xz1Var.c) + i2));
    }

    public vr6 c() {
        int i = this.R;
        if (i != -1) {
            return new vr6(ve2.g(i, this.X));
        }
        return null;
    }

    public void d(int i, int i2, String str) {
        xz1 xz1Var = (xz1) this.Y;
        if (i >= 0 && i <= xz1Var.b()) {
            if (i2 >= 0 && i2 <= xz1Var.b()) {
                if (i <= i2) {
                    xz1Var.k(i, i2, str);
                    h(str.length() + i);
                    g(str.length() + i);
                    this.R = -1;
                    this.X = -1;
                    return;
                }
                i.i(wh1.f(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            c44.p(wh1.s("end (", i2, ") offset is outside of text region "), xz1Var.b());
            return;
        }
        c44.p(wh1.s("start (", i, ") offset is outside of text region "), xz1Var.b());
    }

    public void e(int i, int i2) {
        xz1 xz1Var = (xz1) this.Y;
        if (i >= 0 && i <= xz1Var.b()) {
            if (i2 >= 0 && i2 <= xz1Var.b()) {
                if (i < i2) {
                    this.R = i;
                    this.X = i2;
                    return;
                }
                i.i(wh1.f(i, i2, "Do not set reversed or empty range: ", " > "));
                return;
            }
            c44.p(wh1.s("end (", i2, ") offset is outside of text region "), xz1Var.b());
            return;
        }
        c44.p(wh1.s("start (", i, ") offset is outside of text region "), xz1Var.b());
    }

    public void f(int i, int i2) {
        xz1 xz1Var = (xz1) this.Y;
        if (i >= 0 && i <= xz1Var.b()) {
            if (i2 >= 0 && i2 <= xz1Var.b()) {
                if (i <= i2) {
                    h(i);
                    g(i2);
                    return;
                }
                i.i(wh1.f(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            c44.p(wh1.s("end (", i2, ") offset is outside of text region "), xz1Var.b());
            return;
        }
        c44.p(wh1.s("start (", i, ") offset is outside of text region "), xz1Var.b());
    }

    public void g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            nz2.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.L = i;
    }

    public void h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            nz2.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.B = i;
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return ((xz1) this.Y).toString();
            default:
                return super.toString();
        }
    }

    public xn1(ie0 ie0Var) {
        ie0Var.getClass();
        this.Y = ie0Var;
        this.B = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
        this.L = 4;
        this.R = -3;
        this.X = -1;
    }

    public xn1(View view, int i, int i2, int i3, int i4) {
        this.B = i;
        this.Y = view;
        this.L = i2;
        this.R = i3;
        this.X = i4;
    }
}
