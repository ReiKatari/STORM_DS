package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w36  reason: default package */
/* loaded from: classes.dex */
public final class w36 implements l95 {
    public final tj4 A = me2.G(Boolean.FALSE);
    public final pj4 B = new pj4(RecyclerView.A1);
    public final tj4 L;
    public final tj4 R;
    public final tj4 X;
    public final tj4 Y;
    public final tj4 Z;
    public final tj4 c0;
    public final tj4 d0;
    public vi e0;
    public w36 f0;
    public q36 g0;
    public final tj4 h0;

    public w36(u36 u36Var, u40 u40Var, h56 h56Var, f56 f56Var) {
        Boolean bool = Boolean.TRUE;
        this.L = me2.G(bool);
        this.R = me2.G(u36Var);
        this.X = me2.G(u40Var);
        this.Y = me2.G(d56.b);
        this.Z = me2.G(bool);
        this.c0 = me2.G(h56Var);
        this.d0 = me2.G(f56Var);
        this.h0 = me2.G(null);
    }

    @Override // defpackage.l95
    public final void a() {
        g56 g56Var = e().b;
        g56Var.getClass();
        u36 e = e();
        e.d.setValue(tq0.Y0(e.b(), this));
        e.e();
        g56Var.f();
        xa6 xa6Var = g56Var.Z;
        ListIterator listIterator = xa6Var.listIterator();
        int i = 0;
        while (true) {
            wr2 wr2Var = (wr2) listIterator;
            if (wr2Var.hasNext()) {
                w36 w36Var = (w36) wr2Var.next();
                u36 u36Var = null;
                if (w36Var == null) {
                    w36Var = null;
                }
                if (w36Var != null) {
                    u36Var = w36Var.e();
                }
                if (b53.x(u36Var, e())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != xa6Var.size() - 1 && i != -1) {
            xa6Var.add(i + 1, this);
        } else {
            xa6Var.add(this);
        }
        e().c.f();
    }

    @Override // defpackage.l95
    public final void c() {
        g56 g56Var = e().b;
        g56Var.getClass();
        u36 e = e();
        e.d.setValue(tq0.W0(e.b(), this));
        e.e.setValue(tq0.W0(e.c(), this));
        e.e();
        g56Var.f();
        g56Var.Z.remove(this);
        if (e.b().isEmpty()) {
            tq5.w(e.b.B, null, null, new zr5(e, this, (j11) null, 1), 3);
        }
        e().c.f();
    }

    public final u40 d() {
        return (u40) this.X.getValue();
    }

    public final u36 e() {
        return (u36) this.R.getValue();
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
        if (f() && e().c.d().d() && h() && ((Boolean) this.L.getValue()).booleanValue() && e().b.b()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        f56 f56Var = (f56) this.d0.getValue();
        if (((Boolean) this.A.getValue()).booleanValue()) {
            ((c56) f56Var.b.getValue()).getClass();
            return true;
        }
        return false;
    }

    @Override // defpackage.l95
    public final void b() {
    }
}
