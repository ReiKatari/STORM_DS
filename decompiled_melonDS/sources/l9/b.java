package l9;

import android.graphics.Bitmap;
import fj.a0;
import fj.z;
import j0.o1;
import p7.j;
import p7.n;
import pi.d0;
import pi.g;
import pi.q;
import pi.t;
import yb.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8985a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8986b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8987c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8988d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8989e;

    /* renamed from: f  reason: collision with root package name */
    public final q f8990f;

    public b(a0 a0Var) {
        h hVar = h.NONE;
        this.f8985a = p7.a.s(hVar, new mc.a(this) { // from class: l9.a
            public final /* synthetic */ b B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                int i2 = r2;
                b bVar = this.B;
                switch (i2) {
                    case 0:
                        g gVar = g.f11711n;
                        return j.B(bVar.f8990f);
                    default:
                        String a10 = bVar.f8990f.a("Content-Type");
                        if (a10 == null) {
                            return null;
                        }
                        vc.f fVar = t.f11790d;
                        try {
                            return n.i(a10);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f8986b = p7.a.s(hVar, new mc.a(this) { // from class: l9.a
            public final /* synthetic */ b B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                int i2 = r2;
                b bVar = this.B;
                switch (i2) {
                    case 0:
                        g gVar = g.f11711n;
                        return j.B(bVar.f8990f);
                    default:
                        String a10 = bVar.f8990f.a("Content-Type");
                        if (a10 == null) {
                            return null;
                        }
                        vc.f fVar = t.f11790d;
                        try {
                            return n.i(a10);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f8987c = Long.parseLong(a0Var.D(Long.MAX_VALUE));
        this.f8988d = Long.parseLong(a0Var.D(Long.MAX_VALUE));
        this.f8989e = Integer.parseInt(a0Var.D(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(a0Var.D(Long.MAX_VALUE));
        o1 o1Var = new o1(3, false);
        for (int i2 = 0; i2 < parseInt; i2++) {
            String D = a0Var.D(Long.MAX_VALUE);
            Bitmap.Config[] configArr = q9.g.f12393a;
            int g02 = vc.h.g0(':', 0, 6, D);
            if (g02 != -1) {
                o1Var.e(vc.h.C0(D.substring(0, g02)).toString(), D.substring(g02 + 1));
            } else {
                a0.j.e("Unexpected header: ".concat(D));
                throw null;
            }
        }
        this.f8990f = o1Var.f();
    }

    public final void a(z zVar) {
        long j2;
        zVar.Q(this.f8987c);
        zVar.writeByte(10);
        zVar.Q(this.f8988d);
        zVar.writeByte(10);
        if (this.f8989e) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        zVar.Q(j2);
        zVar.writeByte(10);
        q qVar = this.f8990f;
        zVar.Q(qVar.size());
        zVar.writeByte(10);
        int size = qVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            zVar.P(qVar.b(i2));
            zVar.P(": ");
            zVar.P(qVar.d(i2));
            zVar.writeByte(10);
        }
    }

    public b(d0 d0Var) {
        h hVar = h.NONE;
        this.f8985a = p7.a.s(hVar, new mc.a(this) { // from class: l9.a
            public final /* synthetic */ b B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                int i2 = r2;
                b bVar = this.B;
                switch (i2) {
                    case 0:
                        g gVar = g.f11711n;
                        return j.B(bVar.f8990f);
                    default:
                        String a10 = bVar.f8990f.a("Content-Type");
                        if (a10 == null) {
                            return null;
                        }
                        vc.f fVar = t.f11790d;
                        try {
                            return n.i(a10);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f8986b = p7.a.s(hVar, new mc.a(this) { // from class: l9.a
            public final /* synthetic */ b B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                int i2 = r2;
                b bVar = this.B;
                switch (i2) {
                    case 0:
                        g gVar = g.f11711n;
                        return j.B(bVar.f8990f);
                    default:
                        String a10 = bVar.f8990f.a("Content-Type");
                        if (a10 == null) {
                            return null;
                        }
                        vc.f fVar = t.f11790d;
                        try {
                            return n.i(a10);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f8987c = d0Var.f11705f0;
        this.f8988d = d0Var.f11706g0;
        this.f8989e = d0Var.X != null;
        this.f8990f = d0Var.Y;
    }
}
