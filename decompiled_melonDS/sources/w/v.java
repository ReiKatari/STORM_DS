package w;

import android.os.SystemClock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final long f14055a;

    /* renamed from: b  reason: collision with root package name */
    public long f14056b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f14057c;

    public v(w wVar, long j2) {
        this.f14057c = wVar;
        this.f14055a = j2;
    }

    public final int a() {
        if (!this.f14057c.c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f14056b == -1) {
            this.f14056b = uptimeMillis;
        }
        long j2 = uptimeMillis - this.f14056b;
        if (j2 <= 120000) {
            return 1000;
        }
        if (j2 <= 300000) {
            return 2000;
        }
        return 4000;
    }

    public final int b() {
        boolean c4 = this.f14057c.c();
        long j2 = this.f14055a;
        if (!c4) {
            if (j2 <= 0) {
                return 10000;
            }
            return Math.min((int) j2, 10000);
        } else if (j2 <= 0) {
            return 1800000;
        } else {
            return Math.min((int) j2, 1800000);
        }
    }
}
