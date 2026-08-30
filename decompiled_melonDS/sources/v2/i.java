package v2;

import a1.m0;
import a1.n0;
import a1.v0;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import n2.x1;
import n2.y1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Set f13614a;

    /* renamed from: b  reason: collision with root package name */
    public a3.f f13615b;

    /* renamed from: c  reason: collision with root package name */
    public final p2.b f13616c;

    /* renamed from: d  reason: collision with root package name */
    public n0 f13617d;

    /* renamed from: e  reason: collision with root package name */
    public p2.b f13618e;

    /* renamed from: f  reason: collision with root package name */
    public final p2.b f13619f;

    /* renamed from: g  reason: collision with root package name */
    public final p2.b f13620g;

    /* renamed from: h  reason: collision with root package name */
    public n0 f13621h;

    /* renamed from: i  reason: collision with root package name */
    public m0 f13622i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f13623j;

    /* renamed from: k  reason: collision with root package name */
    public n0 f13624k;

    public i() {
        p2.b bVar = new p2.b(new y1[16]);
        this.f13616c = bVar;
        n0 n0Var = v0.f110a;
        this.f13617d = new n0();
        this.f13618e = bVar;
        this.f13619f = new p2.b(new Object[16]);
        this.f13620g = new p2.b(new mc.a[16]);
    }

    public static final boolean f(y1 y1Var, p2.b bVar) {
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        for (int i10 = 0; i10 < i2; i10++) {
            x1 x1Var = ((y1) objArr[i10]).f10083a;
            if (x1Var instanceof e) {
                p2.b bVar2 = ((e) x1Var).B;
                if (bVar2.j(y1Var) || f(y1Var, bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f13614a = null;
        this.f13615b = null;
        p2.b bVar = this.f13616c;
        bVar.g();
        this.f13617d.b();
        this.f13618e = bVar;
        this.f13619f.g();
        this.f13620g.g();
        this.f13621h = null;
        this.f13622i = null;
        this.f13623j = null;
    }

    public final void b() {
        Set set = this.f13614a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((x1) it.next()).b();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void c() {
        Set set = this.f13614a;
        if (set != null) {
            this.f13624k = null;
            p2.b bVar = this.f13619f;
            if (bVar.L != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    n0 n0Var = this.f13621h;
                    int i2 = bVar.L;
                    while (true) {
                        i2--;
                        if (-1 >= i2) {
                            break;
                        }
                        Object obj = bVar.A[i2];
                        if (obj instanceof y1) {
                            x1 x1Var = ((y1) obj).f10083a;
                            set.remove(x1Var);
                            x1Var.c();
                        }
                        if (obj instanceof n2.h) {
                            if (n0Var != null && n0Var.c(obj)) {
                                ((n2.h) obj).a();
                            } else {
                                ((n2.h) obj).b();
                            }
                        }
                    }
                } finally {
                }
            }
            p2.b bVar2 = this.f13616c;
            if (bVar2.L != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = this.f13614a;
                    if (set2 != null) {
                        Object[] objArr = bVar2.A;
                        int i10 = bVar2.L;
                        for (int i11 = 0; i11 < i10; i11++) {
                            x1 x1Var2 = ((y1) objArr[i11]).f10083a;
                            set2.remove(x1Var2);
                            x1Var2.a();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void d() {
        p2.b bVar = this.f13620g;
        if (bVar.L != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = bVar.A;
                int i2 = bVar.L;
                for (int i10 = 0; i10 < i2; i10++) {
                    ((mc.a) objArr[i10]).b();
                }
                bVar.g();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final void e(y1 y1Var) {
        if (this.f13617d.c(y1Var)) {
            this.f13617d.l(y1Var);
            if (!this.f13618e.j(y1Var)) {
                p2.b bVar = this.f13616c;
                if (!bVar.j(y1Var)) {
                    f(y1Var, bVar);
                }
            }
            Set set = this.f13614a;
            if (set != null) {
                set.add(y1Var.f10083a);
                return;
            }
            return;
        }
        n0 n0Var = this.f13624k;
        if (n0Var != null && n0Var.c(y1Var)) {
            return;
        }
        this.f13619f.b(y1Var);
    }

    public final void g(Set set, a3.f fVar) {
        a();
        this.f13614a = set;
        this.f13615b = fVar;
    }
}
