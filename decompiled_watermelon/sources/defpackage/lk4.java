package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lk4  reason: default package */
/* loaded from: classes.dex */
public final class lk4 extends j67 {
    public b60 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public b60 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public hh6 q;
    public final vi r;
    public vi s;
    public vi t;
    public final gh3 u;

    public lk4() {
        int i = f77.a;
        this.d = pp1.A;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        vi a = zi.a();
        this.r = a;
        this.s = a;
        this.u = yf2.H(wk3.NONE, mv0.j0);
    }

    @Override // defpackage.j67
    public final void a(hk1 hk1Var) {
        hh6 hh6Var;
        if (this.n) {
            hk2.T(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        b60 b60Var = this.b;
        if (b60Var != null) {
            hk1.x(hk1Var, this.s, b60Var, this.c, null, 56);
        }
        b60 b60Var2 = this.g;
        if (b60Var2 != null) {
            hh6 hh6Var2 = this.q;
            if (!this.o && hh6Var2 != null) {
                hh6Var = hh6Var2;
            } else {
                hh6 hh6Var3 = new hh6(this.f, this.j, this.h, this.i, null, 16);
                this.q = hh6Var3;
                this.o = false;
                hh6Var = hh6Var3;
            }
            hk1.x(hk1Var, this.s, b60Var2, this.e, hh6Var, 48);
        }
    }

    public final void e() {
        int i;
        Path path;
        int i2 = (this.k > RecyclerView.A1 ? 1 : (this.k == RecyclerView.A1 ? 0 : -1));
        vi viVar = this.r;
        if (i2 == 0 && this.l == 1.0f) {
            this.s = viVar;
            return;
        }
        if (b53.x(this.s, viVar)) {
            this.s = zi.a();
        } else {
            if (this.s.a.getFillType() == Path.FillType.EVEN_ODD) {
                i = 1;
            } else {
                i = 0;
            }
            this.s.a.rewind();
            this.s.h(i);
        }
        gh3 gh3Var = this.u;
        PathMeasure pathMeasure = ((xi) gh3Var.getValue()).a;
        if (viVar != null) {
            path = viVar.a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        float length = ((xi) gh3Var.getValue()).a.getLength();
        float f = this.k;
        float f2 = this.m;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.l + f2) % 1.0f) * length;
        if (f3 > f4) {
            vi viVar2 = this.t;
            if (viVar2 == null) {
                viVar2 = zi.a();
                this.t = viVar2;
            }
            viVar2.g();
            ((xi) gh3Var.getValue()).a(f3, length, viVar2);
            vi.a(this.s, viVar2);
            viVar2.g();
            ((xi) gh3Var.getValue()).a(RecyclerView.A1, f4, viVar2);
            vi.a(this.s, viVar2);
            return;
        }
        ((xi) gh3Var.getValue()).a(f3, f4, this.s);
    }

    public final String toString() {
        return this.r.toString();
    }
}
