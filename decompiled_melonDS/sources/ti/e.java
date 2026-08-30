package ti;

import fj.e0;
import java.io.IOException;
import java.net.ProtocolException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends fj.m {
    public final long B;
    public final boolean L;
    public boolean R;
    public long X;
    public boolean Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ e9.a f13211b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e9.a aVar, e0 e0Var, long j2, boolean z10) {
        super(e0Var);
        e0Var.getClass();
        this.f13211b0 = aVar;
        this.B = j2;
        this.L = z10;
        this.Y = z10;
    }

    @Override // fj.m, fj.e0
    public final void A(fj.e eVar, long j2) {
        if (!this.Z) {
            long j10 = this.B;
            if (j10 != -1 && this.X + j2 > j10) {
                throw new ProtocolException("expected " + j10 + " bytes but received " + (this.X + j2));
            }
            try {
                if (this.Y) {
                    this.Y = false;
                }
                this.A.A(eVar, j2);
                this.X += j2;
                return;
            } catch (IOException e6) {
                IOException d4 = d(e6);
                d4.getClass();
                throw d4;
            }
        }
        a0.j.p("closed");
    }

    @Override // fj.m, fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        long j2 = this.B;
        if (j2 != -1 && this.X != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
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
        if (this.R) {
            return iOException;
        }
        this.R = true;
        return e9.a.b(this.f13211b0, this.L, iOException, 4);
    }

    @Override // fj.m, fj.e0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e6) {
            IOException d4 = d(e6);
            d4.getClass();
            throw d4;
        }
    }
}
