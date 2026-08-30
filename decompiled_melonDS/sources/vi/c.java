package vi;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import pi.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a {
    public long X;
    public boolean Y;
    public final /* synthetic */ g Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, r rVar) {
        super(gVar, rVar);
        rVar.getClass();
        this.Z = gVar;
        this.X = -1L;
        this.Y = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        if (this.L) {
            return;
        }
        if (this.Y) {
            TimeZone timeZone = qi.g.f12552a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z10 = qi.g.f(this, 100);
            } catch (IOException unused) {
                z10 = false;
            }
            if (!z10) {
                this.Z.f13839b.h();
                d(g.f13837f);
            }
        }
        this.L = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r12 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        p7.k.f(16);
        r2 = java.lang.Integer.toString(r14, 16);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
        if (r16.Y == false) goto L70;
     */
    @Override // vi.a, fj.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(fj.e r17, long r18) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.c.k(fj.e, long):long");
    }
}
