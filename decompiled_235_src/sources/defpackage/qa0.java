package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa0  reason: default package */
/* loaded from: classes.dex */
public final class qa0 implements in6 {
    public boolean A;
    public final /* synthetic */ z80 B;
    public final /* synthetic */ ka0 L;
    public final /* synthetic */ ee5 R;

    public qa0(z80 z80Var, ka0 ka0Var, ee5 ee5Var) {
        this.B = z80Var;
        this.L = ka0Var;
        this.R = ee5Var;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.B.b();
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        try {
            long b0 = this.B.b0(k80Var, j);
            int i = (b0 > (-1L) ? 1 : (b0 == (-1L) ? 0 : -1));
            ee5 ee5Var = this.R;
            if (i == 0) {
                if (!this.A) {
                    this.A = true;
                    ee5Var.close();
                }
                return -1L;
            }
            k80Var.n(ee5Var.B, k80Var.B - b0, b0);
            ee5Var.e();
            return b0;
        } catch (IOException e) {
            if (!this.A) {
                this.A = true;
                this.L.a();
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!this.A) {
            TimeZone timeZone = az7.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = az7.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.A = true;
                this.L.a();
            }
        }
        this.B.close();
    }
}
