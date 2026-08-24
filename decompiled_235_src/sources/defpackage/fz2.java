package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz2  reason: default package */
/* loaded from: classes.dex */
public final class fz2 extends cz2 {
    public long X;
    public final /* synthetic */ hz2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz2(hz2 hz2Var, i03 i03Var, long j) {
        super(hz2Var, i03Var);
        i03Var.getClass();
        this.Y = hz2Var;
        this.X = j;
        if (j == 0) {
            e(yw2.B);
        }
    }

    @Override // defpackage.cz2, defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        if (j >= 0) {
            if (!this.L) {
                long j2 = this.X;
                if (j2 == 0) {
                    return -1L;
                }
                long b0 = super.b0(k80Var, Math.min(j2, j));
                if (b0 != -1) {
                    long j3 = this.X - b0;
                    this.X = j3;
                    if (j3 == 0) {
                        e(yw2.B);
                    }
                    return b0;
                }
                this.Y.b.e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e(hz2.f);
                throw protocolException;
            }
            i.m("closed");
            return 0L;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.L) {
            return;
        }
        if (this.X != 0) {
            TimeZone timeZone = az7.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = az7.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.Y.b.e();
                e(hz2.f);
            }
        }
        this.L = true;
    }
}
