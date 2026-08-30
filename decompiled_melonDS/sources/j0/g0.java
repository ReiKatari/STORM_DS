package j0;

import android.os.SystemClock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f7203a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7204b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f7205c;

    public g0(long j2, Exception exc) {
        this.f7204b = SystemClock.elapsedRealtime() - j2;
        if (exc instanceof n0) {
            this.f7203a = 2;
            this.f7205c = exc;
        } else if (exc instanceof d0.a1) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.f7205c = exc;
            if (exc instanceof d0.t) {
                this.f7203a = 2;
            } else if (exc instanceof IllegalArgumentException) {
                this.f7203a = 1;
            } else {
                this.f7203a = 0;
            }
        } else {
            this.f7203a = 0;
            this.f7205c = exc;
        }
    }
}
