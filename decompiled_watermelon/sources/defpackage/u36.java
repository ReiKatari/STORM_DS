package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u36  reason: default package */
/* loaded from: classes.dex */
public final class u36 {
    public final String a;
    public final g56 b;
    public final w65 c = new w65(this);
    public final tj4 d;
    public final tj4 e;
    public final um f;
    public boolean g;
    public final t36 h;
    public final t36 i;

    public u36(String str, g56 g56Var) {
        this.a = str;
        this.b = g56Var;
        pp1 pp1Var = pp1.A;
        this.d = me2.G(pp1Var);
        this.e = me2.G(pp1Var);
        this.f = new um(new mb4(0L), dt3.l0, null, 12);
        this.h = new t36(this, 0);
        this.i = new t36(this, 1);
    }

    public final boolean a() {
        w65 w65Var = this.c;
        if (!w65Var.d().b() && !w65Var.d().d() && ((be6) w65Var.f) != be6.MatchFound) {
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
            kx6 kx6Var = ((w36) c.get(i)).d().b;
            while (true) {
                kx6 kx6Var2 = kx6Var.b;
                if (kx6Var2 == null) {
                    break;
                }
                kx6Var = kx6Var2;
            }
            if (!b53.x(kx6Var.a.f(), kx6Var.d.getValue())) {
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
            w36 w36Var = (w36) b.get(i);
            if (w36Var.h()) {
                arrayList.add(w36Var);
                if (w36Var.d().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        w65 w65Var = this.c;
        u36 u36Var = (u36) w65Var.c;
        qj4 qj4Var = (qj4) w65Var.e;
        if (u36Var.c().size() > 1 && z) {
            w65Var.f = be6.MatchFound;
            qj4Var.i(w65Var.a + 1);
        } else if (u36Var.b.b()) {
            if (!z) {
                w65Var.f = be6.VisibleContentAbsentDuringTransition;
                qj4Var.i(w65Var.a + 1);
            }
        } else {
            w65Var.f = be6.NoRequest;
            w65Var.a = qj4Var.h();
            ((tj4) w65Var.d).setValue(c74.a);
        }
        w65Var.f();
    }
}
