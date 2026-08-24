package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf6  reason: default package */
/* loaded from: classes.dex */
public final class gf6 {
    public final String a;
    public final sg6 b;
    public final mg5 c = new mg5(this);
    public final vs4 d;
    public final vs4 e;
    public final gn f;
    public boolean g;
    public final ff6 h;
    public final ff6 i;

    public gf6(String str, sg6 sg6Var) {
        this.a = str;
        this.b = sg6Var;
        yt1 yt1Var = yt1.A;
        this.d = np2.Y(yt1Var);
        this.e = np2.Y(yt1Var);
        this.f = new gn(new jk4(0L), nw7.j0, null, 12);
        this.h = new ff6(this, 0);
        this.i = new ff6(this, 1);
    }

    public final boolean a() {
        mg5 mg5Var = this.c;
        if (!mg5Var.d().b() && !mg5Var.d().d() && ((qp6) mg5Var.f) != qp6.MatchFound) {
            return false;
        }
        return true;
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final List c() {
        return (List) this.e.getValue();
    }

    public final boolean d() {
        List c = c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            ga7 ga7Var = ((if6) c.get(i)).d().b;
            while (true) {
                ga7 ga7Var2 = ga7Var.b;
                if (ga7Var2 == null) {
                    break;
                }
                ga7Var = ga7Var2;
            }
            if (!nb3.k(ga7Var.a.f(), ga7Var.d.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        this.b.getClass();
        List b = b();
        ArrayList arrayList = new ArrayList();
        int size = b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if6 if6Var = (if6) b.get(i);
            if (if6Var.h()) {
                arrayList.add(if6Var);
                if (if6Var.d().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        mg5 mg5Var = this.c;
        gf6 gf6Var = (gf6) mg5Var.c;
        ss4 ss4Var = (ss4) mg5Var.e;
        if (gf6Var.c().size() > 1 && z) {
            mg5Var.f = qp6.MatchFound;
            ss4Var.i(mg5Var.a + 1);
        } else if (gf6Var.b.a()) {
            if (!z) {
                mg5Var.f = qp6.VisibleContentAbsentDuringTransition;
                ss4Var.i(mg5Var.a + 1);
            }
        } else {
            mg5Var.f = qp6.NoRequest;
            mg5Var.a = ss4Var.h();
            ((vs4) mg5Var.d).setValue(rf4.a);
        }
        mg5Var.f();
    }
}
