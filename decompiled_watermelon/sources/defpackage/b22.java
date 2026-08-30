package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b22  reason: default package */
/* loaded from: classes.dex */
public final class b22 extends kf2 {
    public final long B;
    public final boolean L;
    public boolean R;
    public long X;
    public boolean Y;
    public boolean Z;
    public final /* synthetic */ xf1 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b22(xf1 xf1Var, g76 g76Var, long j, boolean z) {
        super(g76Var);
        g76Var.getClass();
        this.c0 = xf1Var;
        this.B = j;
        this.L = z;
        this.Y = z;
    }

    @Override // defpackage.kf2, defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        long j = this.B;
        if (j != -1 && this.X != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            d(null);
        } catch (IOException e) {
            IOException d = d(e);
            d.getClass();
            throw d;
        }
    }

    public final IOException d(IOException iOException) {
        if (this.R) {
            return iOException;
        }
        this.R = true;
        return xf1.b(this.c0, this.L, iOException, 4);
    }

    @Override // defpackage.kf2, defpackage.g76, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            IOException d = d(e);
            d.getClass();
            throw d;
        }
    }

    @Override // defpackage.kf2, defpackage.g76
    public final void l(f60 f60Var, long j) {
        if (!this.Z) {
            long j2 = this.B;
            if (j2 != -1 && this.X + j > j2) {
                StringBuilder q = wh1.q(j2, "expected ", " bytes but received ");
                q.append(this.X + j);
                throw new ProtocolException(q.toString());
            }
            try {
                if (this.Y) {
                    this.Y = false;
                }
                this.A.l(f60Var, j);
                this.X += j;
                return;
            } catch (IOException e) {
                IOException d = d(e);
                d.getClass();
                throw d;
            }
        }
        i.n("closed");
    }
}
