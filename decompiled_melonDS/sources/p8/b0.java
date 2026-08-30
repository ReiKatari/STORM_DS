package p8;

import android.os.Trace;
import l4.i0;
import l4.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ String B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ b0(r0 r0Var, x4.m mVar, String str, x4.c cVar, p4.d dVar) {
        this.L = r0Var;
        this.R = mVar;
        this.B = str;
        this.X = cVar;
        this.Y = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z2.b bVar;
        z2.b C;
        switch (this.A) {
            case 0:
                String str = this.B;
                mc.a aVar = (mc.a) this.R;
                androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) this.X;
                b5.i iVar = (b5.i) this.Y;
                ((x) this.L).getClass();
                boolean N = aj.g.N();
                if (N) {
                    try {
                        Trace.beginSection(aj.g.v0(str));
                    } finally {
                        if (N) {
                        }
                    }
                }
                aVar.b();
                a0 a0Var = x.f11511b;
                f0Var.i(a0Var);
                iVar.b(a0Var);
                if (N) {
                    return;
                }
                return;
            default:
                r0 r0Var = (r0) this.L;
                x4.m mVar = (x4.m) this.R;
                String str2 = this.B;
                x4.c cVar = (x4.c) this.X;
                p4.d dVar = (p4.d) this.Y;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    z2.f j2 = z2.l.j();
                    if (j2 instanceof z2.b) {
                        bVar = (z2.b) j2;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null && (C = bVar.C(null, null)) != null) {
                        z2.f j10 = C.j();
                        try {
                            r0 h2 = i0.h(r0Var, mVar);
                            zb.q qVar = zb.q.A;
                            new t4.c(str2, h2, qVar, qVar, dVar, cVar).c();
                            C.w().d();
                            C.c();
                            return;
                        } finally {
                            z2.f.q(j10);
                        }
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } finally {
                    Trace.endSection();
                }
        }
    }

    public /* synthetic */ b0(x xVar, String str, mc.a aVar, androidx.lifecycle.f0 f0Var, b5.i iVar) {
        this.L = xVar;
        this.B = str;
        this.R = aVar;
        this.X = f0Var;
        this.Y = iVar;
    }
}
