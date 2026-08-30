package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i80  reason: default package */
/* loaded from: classes.dex */
public final class i80 implements sb6 {
    public boolean A;
    public final /* synthetic */ u60 B;
    public final /* synthetic */ c80 L;
    public final /* synthetic */ r45 R;

    public i80(u60 u60Var, c80 c80Var, r45 r45Var) {
        this.B = u60Var;
        this.L = c80Var;
        this.R = r45Var;
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        try {
            long L = this.B.L(f60Var, j);
            int i = (L > (-1L) ? 1 : (L == (-1L) ? 0 : -1));
            r45 r45Var = this.R;
            if (i == 0) {
                if (!this.A) {
                    this.A = true;
                    r45Var.close();
                }
                return -1L;
            }
            f60Var.B(r45Var.B, f60Var.B - L, L);
            r45Var.d();
            return L;
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
            TimeZone timeZone = ik7.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = ik7.f(this, 100);
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

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.B.f();
    }
}
