package defpackage;

import android.os.SystemClock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud  reason: default package */
/* loaded from: classes.dex */
public final class ud {
    public final ds0 a;
    public final long b;
    public final df0 c;
    public final Throwable d;

    public ud(ds0 ds0Var, df0 df0Var, Exception exc, int i) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        df0Var = (i & 4) != 0 ? null : df0Var;
        exc = (i & 8) != 0 ? null : exc;
        ds0Var.getClass();
        this.a = ds0Var;
        this.b = elapsedRealtimeNanos;
        this.c = df0Var;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        if (this.a == udVar.a && this.b == udVar.b && nb3.k(this.c, udVar.c) && nb3.k(this.d, udVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = i61.c(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        df0 df0Var = this.c;
        if (df0Var == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(df0Var.a);
        }
        int i2 = (c + hashCode) * 31;
        Throwable th = this.d;
        if (th != null) {
            i = th.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ClosingInfo(reason=" + this.a + ", closingTimestamp=" + ((Object) g67.a(this.b)) + ", errorCode=" + this.c + ", exception=" + this.d + ')';
    }
}
