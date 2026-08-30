package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mf5  reason: default package */
/* loaded from: classes.dex */
public final class mf5 {
    public static final mf5 d = new mf5(false, 0, false);
    public static final mf5 e = new mf5(true, 500, false);
    public static final mf5 f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new mf5(true, 100L, false);
        f = new mf5(false, 0L, true);
    }

    public mf5(boolean z, long j, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            nl2.y("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
