package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t62  reason: default package */
/* loaded from: classes.dex */
public final class t62 extends kk2 {
    public final long B;
    public final boolean L;
    public long R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final /* synthetic */ bk1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t62(bk1 bk1Var, in6 in6Var, long j, boolean z) {
        super(in6Var);
        in6Var.getClass();
        this.d0 = bk1Var;
        this.B = j;
        this.L = z;
        this.X = true;
        if (j == 0) {
            e(null);
        }
    }

    @Override // defpackage.kk2, defpackage.in6
    public final long b0(k80 k80Var, long j) {
        bk1 bk1Var = this.d0;
        k80Var.getClass();
        if (!this.Z) {
            try {
                long b0 = this.A.b0(k80Var, j);
                if (this.X) {
                    this.X = false;
                }
                if (b0 == -1) {
                    e(null);
                    return -1L;
                }
                long j2 = this.R + b0;
                long j3 = this.B;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
                }
                this.R = j2;
                if (((v62) bk1Var.R).c()) {
                    e(null);
                }
                return b0;
            } catch (IOException e) {
                IOException e2 = e(e);
                e2.getClass();
                throw e2;
            }
        }
        i.m("closed");
        return 0L;
    }

    @Override // defpackage.kk2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        try {
            super.close();
            e(null);
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }

    public final IOException e(IOException iOException) {
        if (this.Y) {
            return iOException;
        }
        this.Y = true;
        if (iOException == null && this.X) {
            this.X = false;
        }
        return bk1.b(this.d0, this.L, iOException, 8);
    }
}
