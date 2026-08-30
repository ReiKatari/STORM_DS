package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c22  reason: default package */
/* loaded from: classes.dex */
public final class c22 extends lf2 {
    public final long B;
    public final boolean L;
    public long R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final /* synthetic */ xf1 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(xf1 xf1Var, sb6 sb6Var, long j, boolean z) {
        super(sb6Var);
        sb6Var.getClass();
        this.c0 = xf1Var;
        this.B = j;
        this.L = z;
        this.X = true;
        if (j == 0) {
            d(null);
        }
    }

    @Override // defpackage.lf2, defpackage.sb6
    public final long L(f60 f60Var, long j) {
        xf1 xf1Var = this.c0;
        f60Var.getClass();
        if (!this.Z) {
            try {
                long L = this.A.L(f60Var, j);
                if (this.X) {
                    this.X = false;
                }
                if (L == -1) {
                    d(null);
                    return -1L;
                }
                long j2 = this.R + L;
                long j3 = this.B;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
                }
                this.R = j2;
                if (((e22) xf1Var.R).c()) {
                    d(null);
                }
                return L;
            } catch (IOException e) {
                IOException d = d(e);
                d.getClass();
                throw d;
            }
        }
        i.n("closed");
        return 0L;
    }

    @Override // defpackage.lf2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z) {
            return;
        }
        this.Z = true;
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
        if (this.Y) {
            return iOException;
        }
        this.Y = true;
        if (iOException == null && this.X) {
            this.X = false;
        }
        return xf1.b(this.c0, this.L, iOException, 8);
    }
}
