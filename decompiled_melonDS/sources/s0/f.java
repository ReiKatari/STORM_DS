package s0;

import a7.v;
import android.os.Trace;
import j0.d0;
import java.util.List;
import java.util.Map;
import l4.h;
import l4.i0;
import l4.r0;
import r0.l;
import x4.m;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z2.b bVar;
        z2.b C;
        switch (this.A) {
            case 0:
                ((v) this.B).j((d0) this.L, (d0) this.R, (l) this.X, (l) this.Y, (Map.Entry) this.Z);
                return;
            default:
                r0 r0Var = (r0) this.B;
                m mVar = (m) this.L;
                List list = (List) this.R;
                h hVar = (h) this.X;
                x4.c cVar = (x4.c) this.Y;
                p4.d dVar = (p4.d) this.Z;
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
                            if (list == null) {
                                list = q.A;
                            }
                            new v(hVar, h2, list, cVar, dVar).c();
                            z2.f.q(j10);
                            C.w().d();
                            C.c();
                            return;
                        } catch (Throwable th2) {
                            z2.f.q(j10);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } finally {
                    Trace.endSection();
                }
        }
    }
}
