package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip5  reason: default package */
/* loaded from: classes.dex */
public final class ip5 {
    public static final ip5 d = new ip5(false, 0, false);
    public static final ip5 e = new ip5(true, 500, false);
    public static final ip5 f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new ip5(true, 100L, false);
        f = new ip5(false, 0L, true);
    }

    public ip5(boolean z, long j, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            np2.s("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
