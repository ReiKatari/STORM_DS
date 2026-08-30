package p8;

import android.app.Notification;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f11497a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11498b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f11499c;

    public m(int i2, Notification notification, int i10) {
        this.f11497a = i2;
        this.f11499c = notification;
        this.f11498b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f11497a != mVar.f11497a || this.f11498b != mVar.f11498b) {
            return false;
        }
        return this.f11499c.equals(mVar.f11499c);
    }

    public final int hashCode() {
        return this.f11499c.hashCode() + (((this.f11497a * 31) + this.f11498b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f11497a + ", mForegroundServiceType=" + this.f11498b + ", mNotification=" + this.f11499c + '}';
    }
}
