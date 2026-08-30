package defpackage;

import android.app.Notification;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xe2  reason: default package */
/* loaded from: classes.dex */
public final class xe2 {
    public final int a;
    public final int b;
    public final Notification c;

    public xe2(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xe2.class != obj.getClass()) {
            return false;
        }
        xe2 xe2Var = (xe2) obj;
        if (this.a != xe2Var.a || this.b != xe2Var.b) {
            return false;
        }
        return this.c.equals(xe2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
