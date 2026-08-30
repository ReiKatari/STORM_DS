package vi;

import a0.j;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import pi.q;
import pi.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends a {
    public long X;
    public final /* synthetic */ g Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, r rVar, long j2) {
        super(gVar, rVar);
        rVar.getClass();
        this.Y = gVar;
        this.X = j2;
        if (j2 == 0) {
            d(q.B);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        if (this.L) {
            return;
        }
        if (this.X != 0) {
            TimeZone timeZone = qi.g.f12552a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z10 = qi.g.f(this, 100);
            } catch (IOException unused) {
                z10 = false;
            }
            if (!z10) {
                this.Y.f13839b.h();
                d(g.f13837f);
            }
        }
        this.L = true;
    }

    @Override // vi.a, fj.g0
    public final long k(fj.e eVar, long j2) {
        eVar.getClass();
        if (j2 >= 0) {
            if (!this.L) {
                long j10 = this.X;
                if (j10 == 0) {
                    return -1L;
                }
                long k10 = super.k(eVar, Math.min(j10, j2));
                if (k10 != -1) {
                    long j11 = this.X - k10;
                    this.X = j11;
                    if (j11 == 0) {
                        d(q.B);
                    }
                    return k10;
                }
                this.Y.f13839b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d(g.f13837f);
                throw protocolException;
            }
            j.p("closed");
            return 0L;
        }
        j.e(kc.a.e(j2, "byteCount < 0: "));
        return 0L;
    }
}
