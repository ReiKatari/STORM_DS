package ad;

import a7.l;
import android.os.Handler;
import android.os.Looper;
import ed.n;
import java.util.concurrent.CancellationException;
import nc.k;
import zc.a0;
import zc.g0;
import zc.i0;
import zc.j1;
import zc.q;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends q implements a0 {
    public final Handler L;
    public final String R;
    public final boolean X;
    public final e Y;

    public e(Handler handler, String str, boolean z10) {
        e eVar;
        this.L = handler;
        this.R = str;
        this.X = z10;
        if (z10) {
            eVar = this;
        } else {
            eVar = new e(handler, str, true);
        }
        this.Y = eVar;
    }

    @Override // zc.a0
    public final i0 J(long j2, final Runnable runnable, cc.g gVar) {
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.L.postDelayed(runnable, j2)) {
            return new i0() { // from class: ad.d
                @Override // zc.i0
                public final void dispose() {
                    e.this.L.removeCallbacks(runnable);
                }
            };
        }
        b0(gVar, runnable);
        return j1.A;
    }

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        if (!this.L.post(runnable)) {
            b0(gVar, runnable);
        }
    }

    @Override // zc.q
    public final boolean Z(cc.g gVar) {
        if (this.X && k.a(Looper.myLooper(), this.L.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // zc.q
    public final q a0(int i2) {
        ed.b.a(1);
        return this;
    }

    public final void b0(cc.g gVar, Runnable runnable) {
        x.e(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        gd.f fVar = g0.f15015a;
        gd.e.L.X(gVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.L == this.L && eVar.X == this.X) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int identityHashCode = System.identityHashCode(this.L);
        if (this.X) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return identityHashCode ^ i2;
    }

    @Override // zc.q
    public final String toString() {
        e eVar;
        String str;
        gd.f fVar = g0.f15015a;
        e eVar2 = n.f4465a;
        if (this == eVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar2.Y;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            if (this == eVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.R;
            if (str2 == null) {
                str2 = this.L.toString();
            }
            if (this.X) {
                return str2 + ".immediate";
            }
            return str2;
        }
        return str;
    }

    @Override // zc.a0
    public final void v(long j2, zc.h hVar) {
        c cVar = new c(0, hVar, this);
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.L.postDelayed(cVar, j2)) {
            hVar.x(new l(1, this, cVar));
        } else {
            b0(hVar.X, cVar);
        }
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
