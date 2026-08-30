package defpackage;

import android.os.SystemClock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gd  reason: default package */
/* loaded from: classes.dex */
public final class gd {
    public final qp0 a;
    public final long b;
    public final uc0 c;
    public final Throwable d;

    public gd(qp0 qp0Var, uc0 uc0Var, Exception exc, int i) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        uc0Var = (i & 4) != 0 ? null : uc0Var;
        exc = (i & 8) != 0 ? null : exc;
        qp0Var.getClass();
        this.a = qp0Var;
        this.b = elapsedRealtimeNanos;
        this.c = uc0Var;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        if (this.a == gdVar.a && this.b == gdVar.b && b53.x(this.c, gdVar.c) && b53.x(this.d, gdVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = b31.c(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        uc0 uc0Var = this.c;
        if (uc0Var == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(uc0Var.a);
        }
        int i2 = (c + hashCode) * 31;
        Throwable th = this.d;
        if (th != null) {
            i = th.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ClosingInfo(reason=" + this.a + ", closingTimestamp=" + ((Object) pt6.a(this.b)) + ", errorCode=" + this.c + ", exception=" + this.d + ')';
    }
}
