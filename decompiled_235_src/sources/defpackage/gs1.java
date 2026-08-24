package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs1  reason: default package */
/* loaded from: classes.dex */
public final class gs1 implements zk4 {
    public final /* synthetic */ int A = 1;
    public int B;
    public int L;
    public int R;
    public int X;
    public final Object Y;

    public gs1(fp fpVar, long j) {
        String str = fpVar.B;
        m42 m42Var = new m42();
        m42Var.d = str;
        m42Var.b = -1;
        m42Var.c = -1;
        this.Y = m42Var;
        this.B = k47.f(j);
        this.L = k47.e(j);
        this.R = -1;
        this.X = -1;
        int f = k47.f(j);
        int e = k47.e(j);
        if (f >= 0 && f <= str.length()) {
            if (e >= 0 && e <= str.length()) {
                if (f <= e) {
                    return;
                }
                i.h(lb1.j("Do not set reversed range: ", f, e, " > "));
                throw null;
            }
            u34.q(xg6.t("end (", e, ") offset is outside of text region "), str.length());
            throw null;
        }
        u34.q(xg6.t("start (", f, ") offset is outside of text region "), str.length());
        throw null;
    }

    @Override // defpackage.zk4
    public vu7 U(View view, vu7 vu7Var) {
        View view2 = (View) this.Y;
        e83 h = vu7Var.a.h(519);
        int i = this.B;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.L + h.a, this.R + h.b, this.X + h.c, view2.getPaddingBottom());
        return vu7Var;
    }

    public void a(int i, int i2) {
        long f = jx2.f(i, i2);
        ((m42) this.Y).k(i, i2, "");
        long u0 = hf.u0(jx2.f(this.B, this.L), f);
        h(k47.f(u0));
        g(k47.e(u0));
        int i3 = this.R;
        if (i3 != -1) {
            long u02 = hf.u0(jx2.f(i3, this.X), f);
            if (k47.c(u02)) {
                this.R = -1;
                this.X = -1;
                return;
            }
            this.R = k47.f(u02);
            this.X = k47.e(u02);
        }
    }

    public char b(int i) {
        m42 m42Var = (m42) this.Y;
        ls0 ls0Var = (ls0) m42Var.e;
        if (ls0Var == null) {
            return ((String) m42Var.d).charAt(i);
        }
        if (i < m42Var.b) {
            return ((String) m42Var.d).charAt(i);
        }
        int d = ls0Var.b - ls0Var.d();
        int i2 = m42Var.b;
        if (i < d + i2) {
            int i3 = i - i2;
            int i4 = ls0Var.c;
            char[] cArr = (char[]) ls0Var.e;
            if (i3 < i4) {
                return cArr[i3];
            }
            return cArr[(i3 - i4) + ls0Var.d];
        }
        return ((String) m42Var.d).charAt(i - ((d - m42Var.c) + i2));
    }

    public k47 c() {
        int i = this.R;
        if (i != -1) {
            return new k47(jx2.f(i, this.X));
        }
        return null;
    }

    public void d(int i, int i2, String str) {
        m42 m42Var = (m42) this.Y;
        if (i >= 0 && i <= m42Var.b()) {
            if (i2 >= 0 && i2 <= m42Var.b()) {
                if (i <= i2) {
                    m42Var.k(i, i2, str);
                    h(str.length() + i);
                    g(str.length() + i);
                    this.R = -1;
                    this.X = -1;
                    return;
                }
                i.h(lb1.j("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            u34.q(xg6.t("end (", i2, ") offset is outside of text region "), m42Var.b());
            return;
        }
        u34.q(xg6.t("start (", i, ") offset is outside of text region "), m42Var.b());
    }

    public void e(int i, int i2) {
        m42 m42Var = (m42) this.Y;
        if (i >= 0 && i <= m42Var.b()) {
            if (i2 >= 0 && i2 <= m42Var.b()) {
                if (i < i2) {
                    this.R = i;
                    this.X = i2;
                    return;
                }
                i.h(lb1.j("Do not set reversed or empty range: ", i, i2, " > "));
                return;
            }
            u34.q(xg6.t("end (", i2, ") offset is outside of text region "), m42Var.b());
            return;
        }
        u34.q(xg6.t("start (", i, ") offset is outside of text region "), m42Var.b());
    }

    public void f(int i, int i2) {
        m42 m42Var = (m42) this.Y;
        if (i >= 0 && i <= m42Var.b()) {
            if (i2 >= 0 && i2 <= m42Var.b()) {
                if (i <= i2) {
                    h(i);
                    g(i2);
                    return;
                }
                i.h(lb1.j("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            u34.q(xg6.t("end (", i2, ") offset is outside of text region "), m42Var.b());
            return;
        }
        u34.q(xg6.t("start (", i, ") offset is outside of text region "), m42Var.b());
    }

    public void g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            q53.a("Cannot set selectionEnd to a negative value: " + i);
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
            q53.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.B = i;
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return ((m42) this.Y).toString();
            default:
                return super.toString();
        }
    }

    public gs1(rg0 rg0Var) {
        rg0Var.getClass();
        this.Y = rg0Var;
        this.B = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
        this.L = 4;
        this.R = -3;
        this.X = -1;
    }

    public gs1(View view, int i, int i2, int i3, int i4) {
        this.B = i;
        this.Y = view;
        this.L = i2;
        this.R = i3;
        this.X = i4;
    }
}
