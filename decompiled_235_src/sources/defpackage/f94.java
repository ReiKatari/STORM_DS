package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f94  reason: default package */
/* loaded from: classes.dex */
public final class f94 extends gx0 {
    public final ja4 b;
    public final ArrayList c;
    public final ka4 d;
    public final ja4 e;
    public final h61 f;

    public f94() {
        super(2);
        this.b = mp2.q();
        this.c = new ArrayList();
        ka4 ka4Var = c66.a;
        this.d = new ka4();
        this.e = new ja4();
        z5 z5Var = new z5(this, 19);
        bm6.e(bm6.a);
        synchronized (bm6.c) {
            bm6.h = gt0.U0(z5Var, bm6.h);
        }
        this.f = new h61(z5Var, 20);
    }

    @Override // defpackage.gx0
    public final void c(ob6 ob6Var) {
        this.c.add(new d94(ob6Var));
    }

    @Override // defpackage.gx0
    public final void d() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    e94 e94Var = (e94) arrayList.get(i);
                    if (e94Var instanceof c94) {
                        mp2.g(this.b, ((c94) e94Var).a, ((c94) e94Var).b);
                    } else if (e94Var instanceof d94) {
                        mp2.W(this.b, ((d94) e94Var).a);
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.gx0
    public final void e() {
        this.f.d();
        this.c.clear();
        this.e.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.gx0
    public final qn2 j(ob6 ob6Var) {
        ja4 ja4Var = this.e;
        qn2 qn2Var = (qn2) ja4Var.g(ob6Var);
        if (qn2Var == null) {
            qn2Var = new bi2(23, this, ob6Var);
            int f = ja4Var.f(ob6Var);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = ja4Var.c;
            Object obj = objArr[f];
            ja4Var.b[f] = ob6Var;
            objArr[f] = qn2Var;
        }
        return qn2Var;
    }

    @Override // defpackage.gx0
    public final void k(ul0 ul0Var) {
        this.e.k(ul0Var);
        c(ul0Var);
        d();
    }
}
