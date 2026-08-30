package com.google.android.material.datepicker;

import a6.i2;
import android.view.View;
import l4.i0;
import l4.q0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements a6.v {
    public final /* synthetic */ int A = 0;
    public int B;
    public int L;
    public int R;
    public int X;
    public final Object Y;

    public n(l4.h hVar, long j2) {
        String str = hVar.B;
        dk.a aVar = new dk.a();
        aVar.f4113d = str;
        aVar.f4111b = -1;
        aVar.f4112c = -1;
        this.Y = aVar;
        this.B = q0.f(j2);
        this.L = q0.e(j2);
        this.R = -1;
        this.X = -1;
        int f8 = q0.f(j2);
        int e6 = q0.e(j2);
        if (f8 >= 0 && f8 <= str.length()) {
            if (e6 >= 0 && e6 <= str.length()) {
                if (f8 <= e6) {
                    return;
                }
                a0.j.h(kc.a.d(f8, e6, "Do not set reversed range: ", " > "));
                throw null;
            }
            a0.j.l(kc.a.i("end (", e6, ") offset is outside of text region "), str.length());
            throw null;
        }
        a0.j.l(kc.a.i("start (", f8, ") offset is outside of text region "), str.length());
        throw null;
    }

    public void a(int i2, int i10) {
        long b10 = i0.b(i2, i10);
        ((dk.a) this.Y).k(i2, i10, "");
        long p10 = p7.o.p(i0.b(this.B, this.L), b10);
        h(q0.f(p10));
        g(q0.e(p10));
        int i11 = this.R;
        if (i11 != -1) {
            long p11 = p7.o.p(i0.b(i11, this.X), b10);
            if (q0.c(p11)) {
                this.R = -1;
                this.X = -1;
                return;
            }
            this.R = q0.f(p11);
            this.X = q0.e(p11);
        }
    }

    public char b(int i2) {
        dk.a aVar = (dk.a) this.Y;
        f2.s sVar = (f2.s) aVar.f4114e;
        if (sVar == null) {
            return ((String) aVar.f4113d).charAt(i2);
        }
        if (i2 < aVar.f4111b) {
            return ((String) aVar.f4113d).charAt(i2);
        }
        int d4 = sVar.f4789b - sVar.d();
        int i10 = aVar.f4111b;
        if (i2 < d4 + i10) {
            int i11 = i2 - i10;
            int i12 = sVar.f4790c;
            char[] cArr = (char[]) sVar.f4792e;
            if (i11 < i12) {
                return cArr[i11];
            }
            return cArr[(i11 - i12) + sVar.f4791d];
        }
        return ((String) aVar.f4113d).charAt(i2 - ((d4 - aVar.f4112c) + i10));
    }

    public q0 c() {
        int i2 = this.R;
        if (i2 != -1) {
            return new q0(i0.b(i2, this.X));
        }
        return null;
    }

    public void d(int i2, int i10, String str) {
        dk.a aVar = (dk.a) this.Y;
        if (i2 >= 0 && i2 <= aVar.b()) {
            if (i10 >= 0 && i10 <= aVar.b()) {
                if (i2 <= i10) {
                    aVar.k(i2, i10, str);
                    h(str.length() + i2);
                    g(str.length() + i2);
                    this.R = -1;
                    this.X = -1;
                    return;
                }
                a0.j.h(kc.a.d(i2, i10, "Do not set reversed range: ", " > "));
                return;
            }
            a0.j.l(kc.a.i("end (", i10, ") offset is outside of text region "), aVar.b());
            return;
        }
        a0.j.l(kc.a.i("start (", i2, ") offset is outside of text region "), aVar.b());
    }

    public void e(int i2, int i10) {
        dk.a aVar = (dk.a) this.Y;
        if (i2 >= 0 && i2 <= aVar.b()) {
            if (i10 >= 0 && i10 <= aVar.b()) {
                if (i2 < i10) {
                    this.R = i2;
                    this.X = i10;
                    return;
                }
                a0.j.h(kc.a.d(i2, i10, "Do not set reversed or empty range: ", " > "));
                return;
            }
            a0.j.l(kc.a.i("end (", i10, ") offset is outside of text region "), aVar.b());
            return;
        }
        a0.j.l(kc.a.i("start (", i2, ") offset is outside of text region "), aVar.b());
    }

    public void f(int i2, int i10) {
        dk.a aVar = (dk.a) this.Y;
        if (i2 >= 0 && i2 <= aVar.b()) {
            if (i10 >= 0 && i10 <= aVar.b()) {
                if (i2 <= i10) {
                    h(i2);
                    g(i10);
                    return;
                }
                a0.j.h(kc.a.d(i2, i10, "Do not set reversed range: ", " > "));
                return;
            }
            a0.j.l(kc.a.i("end (", i10, ") offset is outside of text region "), aVar.b());
            return;
        }
        a0.j.l(kc.a.i("start (", i2, ") offset is outside of text region "), aVar.b());
    }

    public void g(int i2) {
        boolean z10;
        if (i2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            r4.a.a("Cannot set selectionEnd to a negative value: " + i2);
        }
        this.L = i2;
    }

    public void h(int i2) {
        boolean z10;
        if (i2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            r4.a.a("Cannot set selectionStart to a negative value: " + i2);
        }
        this.B = i2;
    }

    @Override // a6.v
    public i2 s(View view, i2 i2Var) {
        View view2 = (View) this.Y;
        q5.b f8 = i2Var.f479a.f(519);
        int i2 = this.B;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + f8.f12284b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.L + f8.f12283a, this.R + f8.f12284b, this.X + f8.f12285c, view2.getPaddingBottom());
        return i2Var;
    }

    public String toString() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((dk.a) this.Y).toString();
            default:
                return super.toString();
        }
    }

    public n(View view, int i2, int i10, int i11, int i12) {
        this.B = i2;
        this.Y = view;
        this.L = i10;
        this.R = i11;
        this.X = i12;
    }
}
