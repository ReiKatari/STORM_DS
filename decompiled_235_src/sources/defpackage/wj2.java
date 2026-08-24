package defpackage;

import android.app.Notification;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj2  reason: default package */
/* loaded from: classes.dex */
public final class wj2 {
    public final int a;
    public final int b;
    public final Notification c;

    public wj2(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wj2.class != obj.getClass()) {
            return false;
        }
        wj2 wj2Var = (wj2) obj;
        if (this.a != wj2Var.a || this.b != wj2Var.b) {
            return false;
        }
        return this.c.equals(wj2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
