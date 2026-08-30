package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: et2  reason: default package */
/* loaded from: classes.dex */
public final class et2 extends bt2 {
    public long X;
    public final /* synthetic */ ht2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et2(ht2 ht2Var, hu2 hu2Var, long j) {
        super(ht2Var, hu2Var);
        hu2Var.getClass();
        this.Y = ht2Var;
        this.X = j;
        if (j == 0) {
            d(xq2.B);
        }
    }

    @Override // defpackage.bt2, defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        if (j >= 0) {
            if (!this.L) {
                long j2 = this.X;
                if (j2 == 0) {
                    return -1L;
                }
                long L = super.L(f60Var, Math.min(j2, j));
                if (L != -1) {
                    long j3 = this.X - L;
                    this.X = j3;
                    if (j3 == 0) {
                        d(xq2.B);
                    }
                    return L;
                }
                this.Y.b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d(ht2.f);
                throw protocolException;
            }
            i.n("closed");
            return 0L;
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.L) {
            return;
        }
        if (this.X != 0) {
            TimeZone timeZone = ik7.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = ik7.f(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.Y.b.h();
                d(ht2.f);
            }
        }
        this.L = true;
    }
}
