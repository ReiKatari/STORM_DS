package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s62  reason: default package */
/* loaded from: classes.dex */
public final class s62 extends jk2 {
    public final long B;
    public final boolean L;
    public boolean R;
    public long X;
    public boolean Y;
    public boolean Z;
    public final /* synthetic */ bk1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s62(bk1 bk1Var, ui6 ui6Var, long j, boolean z) {
        super(ui6Var);
        ui6Var.getClass();
        this.d0 = bk1Var;
        this.B = j;
        this.L = z;
        this.Y = z;
    }

    @Override // defpackage.jk2, defpackage.ui6
    public final void O(k80 k80Var, long j) {
        if (!this.Z) {
            long j2 = this.B;
            if (j2 != -1 && this.X + j > j2) {
                StringBuilder s = xg6.s(j2, "expected ", " bytes but received ");
                s.append(this.X + j);
                throw new ProtocolException(s.toString());
            }
            try {
                if (this.Y) {
                    this.Y = false;
                }
                this.A.O(k80Var, j);
                this.X += j;
                return;
            } catch (IOException e) {
                IOException e2 = e(e);
                e2.getClass();
                throw e2;
            }
        }
        i.m("closed");
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
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
            e(null);
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }

    public final IOException e(IOException iOException) {
        if (this.R) {
            return iOException;
        }
        this.R = true;
        return bk1.b(this.d0, this.L, iOException, 4);
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }
}
