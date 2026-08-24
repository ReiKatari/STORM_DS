package defpackage;

import android.os.SystemClock;
import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou  reason: default package */
/* loaded from: classes.dex */
public final class ou {
    public int a;
    public long b;
    public Object c;

    public ou(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof bj0) {
            this.a = 2;
            this.c = exc;
        } else if (exc instanceof i53) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.c = exc;
            if (exc instanceof pi0) {
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

    public ou(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
