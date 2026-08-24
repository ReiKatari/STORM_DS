package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt4  reason: default package */
/* loaded from: classes.dex */
public final class nt4 extends gk7 {
    public f80 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public f80 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ys6 q;
    public final hj r;
    public hj s;
    public hj t;
    public final go3 u;

    public nt4() {
        int i = el7.a;
        this.d = yt1.A;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        hj a = lj.a();
        this.r = a;
        this.s = a;
        this.u = kj2.M(xr3.NONE, iy0.k0);
    }

    @Override // defpackage.gk7
    public final void a(no1 no1Var) {
        ys6 ys6Var;
        if (this.n) {
            ln2.e0(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        f80 f80Var = this.b;
        if (f80Var != null) {
            no1.b0(no1Var, this.s, f80Var, this.c, null, 56);
        }
        f80 f80Var2 = this.g;
        if (f80Var2 != null) {
            ys6 ys6Var2 = this.q;
            if (!this.o && ys6Var2 != null) {
                ys6Var = ys6Var2;
            } else {
                ys6 ys6Var3 = new ys6(this.f, this.j, this.h, this.i, null, 16);
                this.q = ys6Var3;
                this.o = false;
                ys6Var = ys6Var3;
            }
            no1.b0(no1Var, this.s, f80Var2, this.e, ys6Var, 48);
        }
    }

    public final void e() {
        int i;
        Path path;
        int i2 = (this.k > RecyclerView.B1 ? 1 : (this.k == RecyclerView.B1 ? 0 : -1));
        hj hjVar = this.r;
        if (i2 == 0 && this.l == 1.0f) {
            this.s = hjVar;
            return;
        }
        if (nb3.k(this.s, hjVar)) {
            this.s = lj.a();
        } else {
            if (this.s.a.getFillType() == Path.FillType.EVEN_ODD) {
                i = 1;
            } else {
                i = 0;
            }
            this.s.a.rewind();
            this.s.h(i);
        }
        go3 go3Var = this.u;
        PathMeasure pathMeasure = ((jj) go3Var.getValue()).a;
        if (hjVar != null) {
            path = hjVar.a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        float length = ((jj) go3Var.getValue()).a.getLength();
        float f = this.k;
        float f2 = this.m;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.l + f2) % 1.0f) * length;
        if (f3 > f4) {
            hj hjVar2 = this.t;
            if (hjVar2 == null) {
                hjVar2 = lj.a();
                this.t = hjVar2;
            }
            hjVar2.g();
            ((jj) go3Var.getValue()).a(f3, length, hjVar2);
            hj.a(this.s, hjVar2);
            hjVar2.g();
            ((jj) go3Var.getValue()).a(RecyclerView.B1, f4, hjVar2);
            hj.a(this.s, hjVar2);
            return;
        }
        ((jj) go3Var.getValue()).a(f3, f4, this.s);
    }

    public final String toString() {
        return this.r.toString();
    }
}
