package l2;

import a1.q;
import a4.o0;
import a4.t;
import b4.x;
import fj.e0;
import java.io.IOException;
import p1.a0;
import rd.k;
import v3.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8677a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8678b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8679c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8680d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8681e;

    public void a() {
        synchronized (((pi.f) this.f8681e)) {
            if (this.f8677a) {
                return;
            }
            this.f8677a = true;
            qi.e.b((e0) this.f8679c);
            try {
                ((e9.a) this.f8678b).a();
            } catch (IOException unused) {
            }
        }
    }

    public int b(a0 a0Var, x xVar, boolean z10) {
        boolean z11;
        int i2;
        int i10;
        v3.d dVar = (v3.d) this.f8679c;
        t tVar = (t) this.f8681e;
        if (this.f8677a) {
            return 0;
        }
        try {
            this.f8677a = true;
            a0 r5 = ((k) this.f8680d).r(a0Var, xVar);
            q qVar = (q) r5.B;
            int j2 = qVar.j();
            for (int i11 = 0; i11 < j2; i11++) {
                v3.t tVar2 = (v3.t) qVar.k(i11);
                if (!tVar2.f13694d && !tVar2.f13698h) {
                }
                z11 = false;
                break;
            }
            z11 = true;
            int j10 = qVar.j();
            for (int i12 = 0; i12 < j10; i12++) {
                v3.t tVar3 = (v3.t) qVar.k(i12);
                if (z11 || s.b(tVar3)) {
                    ((o0) this.f8678b).A(tVar3.f13693c, (t) this.f8681e, tVar3.f13699i, true);
                    if (!tVar.A.h()) {
                        dVar.a(tVar3.f13691a, tVar, s.b(tVar3));
                        tVar.clear();
                    }
                }
            }
            boolean b10 = dVar.b(r5, z10);
            int j11 = qVar.j();
            int i13 = 0;
            while (true) {
                if (i13 < j11) {
                    v3.t tVar4 = (v3.t) qVar.k(i13);
                    if (!h3.b.b(s.h(tVar4, true), 0L) && tVar4.b()) {
                        i2 = 1;
                        break;
                    }
                    i13++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            int j12 = qVar.j();
            int i14 = 0;
            while (true) {
                if (i14 < j12) {
                    if (((v3.t) qVar.k(i14)).b()) {
                        i10 = 1;
                        break;
                    }
                    i14++;
                } else {
                    i10 = 0;
                    break;
                }
            }
            int i15 = b10 | (i2 << 1) | (i10 << 2);
            this.f8677a = false;
            return i15;
        } catch (Throwable th2) {
            this.f8677a = false;
            throw th2;
        }
    }
}
