package ti;

import fj.g0;
import java.io.IOException;
import java.net.ProtocolException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends fj.n {
    public final long B;
    public final boolean L;
    public long R;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ e9.a f13212b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e9.a aVar, g0 g0Var, long j2, boolean z10) {
        super(g0Var);
        g0Var.getClass();
        this.f13212b0 = aVar;
        this.B = j2;
        this.L = z10;
        this.X = true;
        if (j2 == 0) {
            d(null);
        }
    }

    @Override // fj.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        try {
            super.close();
            d(null);
        } catch (IOException e6) {
            IOException d4 = d(e6);
            d4.getClass();
            throw d4;
        }
    }

    public final IOException d(IOException iOException) {
        if (this.Y) {
            return iOException;
        }
        this.Y = true;
        if (iOException == null && this.X) {
            this.X = false;
        }
        return e9.a.b(this.f13212b0, this.L, iOException, 8);
    }

    @Override // fj.n, fj.g0
    public final long k(fj.e eVar, long j2) {
        e9.a aVar = this.f13212b0;
        eVar.getClass();
        if (!this.Z) {
            try {
                long k10 = this.A.k(eVar, j2);
                if (this.X) {
                    this.X = false;
                }
                if (k10 == -1) {
                    d(null);
                    return -1L;
                }
                long j10 = this.R + k10;
                long j11 = this.B;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
                }
                this.R = j10;
                if (((ui.e) aVar.f4417d).e()) {
                    d(null);
                }
                return k10;
            } catch (IOException e6) {
                IOException d4 = d(e6);
                d4.getClass();
                throw d4;
            }
        }
        a0.j.p("closed");
        return 0L;
    }
}
