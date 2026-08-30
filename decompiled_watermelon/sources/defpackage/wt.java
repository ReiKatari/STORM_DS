package defpackage;

import android.os.SystemClock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wt  reason: default package */
/* loaded from: classes.dex */
public final class wt {
    public int a;
    public long b;
    public Object c;

    public wt(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof sg0) {
            this.a = 2;
            this.c = exc;
        } else if (exc instanceof fz2) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.c = exc;
            if (exc instanceof gg0) {
                this.a = 2;
            } else if (exc instanceof IllegalArgumentException) {
                this.a = 1;
            } else {
                this.a = 0;
            }
        } else {
            this.a = 0;
            this.c = exc;
        }
    }
}
