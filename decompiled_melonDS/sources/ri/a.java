package ri;

import fj.g0;
import fj.i0;
import fj.z;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements g0 {
    public boolean A;
    public final /* synthetic */ fj.g B;
    public final /* synthetic */ l2.g L;
    public final /* synthetic */ z R;

    public a(fj.g gVar, l2.g gVar2, z zVar) {
        this.B = gVar;
        this.L = gVar2;
        this.R = zVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        if (!this.A) {
            TimeZone timeZone = qi.g.f12552a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z10 = qi.g.f(this, 100);
            } catch (IOException unused) {
                z10 = false;
            }
            if (!z10) {
                this.A = true;
                this.L.a();
            }
        }
        this.B.close();
    }

    @Override // fj.g0
    public final i0 f() {
        return this.B.f();
    }

    @Override // fj.g0
    public final long k(fj.e eVar, long j2) {
        eVar.getClass();
        try {
            long k10 = this.B.k(eVar, j2);
            int i2 = (k10 > (-1L) ? 1 : (k10 == (-1L) ? 0 : -1));
            z zVar = this.R;
            if (i2 == 0) {
                if (!this.A) {
                    this.A = true;
                    zVar.close();
                }
                return -1L;
            }
            eVar.w(zVar.B, eVar.B - k10, k10);
            zVar.d();
            return k10;
        } catch (IOException e6) {
            if (!this.A) {
                this.A = true;
                this.L.a();
            }
            throw e6;
        }
    }
}
