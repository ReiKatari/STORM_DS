package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if6  reason: default package */
/* loaded from: classes.dex */
public final class if6 implements bj5 {
    public final vs4 A = np2.Y(Boolean.FALSE);
    public final rs4 B = new rs4(RecyclerView.B1);
    public final vs4 L;
    public final vs4 R;
    public final vs4 X;
    public final vs4 Y;
    public final vs4 Z;
    public final vs4 d0;
    public final vs4 e0;
    public hj f0;
    public if6 g0;
    public cf6 h0;
    public final vs4 i0;

    public if6(gf6 gf6Var, x60 x60Var, tg6 tg6Var, rg6 rg6Var) {
        Boolean bool = Boolean.TRUE;
        this.L = np2.Y(bool);
        this.R = np2.Y(gf6Var);
        this.X = np2.Y(x60Var);
        this.Y = np2.Y(pg6.b);
        this.Z = np2.Y(bool);
        this.d0 = np2.Y(tg6Var);
        this.e0 = np2.Y(rg6Var);
        this.i0 = np2.Y(null);
    }

    @Override // defpackage.bj5
    public final void b() {
        sg6 sg6Var = e().b;
        sg6Var.getClass();
        gf6 e = e();
        e.d.setValue(gt0.T0(e.b(), this));
        e.e.setValue(gt0.T0(e.c(), this));
        e.e();
        sg6Var.f();
        sg6Var.Z.remove(this);
        if (e.b().isEmpty()) {
            hv.L(e.b.B, null, null, new xy5(e, this, (r41) null, 2), 3);
        }
        e().c.f();
    }

    @Override // defpackage.bj5
    public final void c() {
        sg6 sg6Var = e().b;
        sg6Var.getClass();
        gf6 e = e();
        e.d.setValue(gt0.U0(this, e.b()));
        e.e();
        sg6Var.f();
        mm6 mm6Var = sg6Var.Z;
        ListIterator listIterator = mm6Var.listIterator();
        int i = 0;
        while (true) {
            xx2 xx2Var = (xx2) listIterator;
            if (xx2Var.hasNext()) {
                if6 if6Var = (if6) xx2Var.next();
                gf6 gf6Var = null;
                if (if6Var == null) {
                    if6Var = null;
                }
                if (if6Var != null) {
                    gf6Var = if6Var.e();
                }
                if (nb3.k(gf6Var, e())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != mm6Var.size() - 1 && i != -1) {
            mm6Var.add(i + 1, this);
        } else {
            mm6Var.add(this);
        }
        e().c.f();
    }

    public final x60 d() {
        return (x60) this.X.getValue();
    }

    public final gf6 e() {
        return (gf6) this.R.getValue();
    }

    public final boolean f() {
        if (!d().b()) {
            if ((!e().c.d().d() || e().c.d().b()) && ((Boolean) this.Z.getValue()).booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean g() {
        if (f() && e().c.d().d() && h() && ((Boolean) this.L.getValue()).booleanValue() && e().b.a()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        rg6 rg6Var = (rg6) this.e0.getValue();
        if (((Boolean) this.A.getValue()).booleanValue()) {
            ((og6) rg6Var.b.getValue()).getClass();
            return true;
        }
        return false;
    }

    @Override // defpackage.bj5
    public final void a() {
    }
}
