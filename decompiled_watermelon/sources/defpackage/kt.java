package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kt  reason: default package */
/* loaded from: classes.dex */
public final class kt extends ep2 {
    public static volatile kt i;
    public static final jt j = new jt(0);
    public final ub1 h;

    public kt() {
        super(24);
        this.h = new ub1();
    }

    public static kt L() {
        if (i != null) {
            return i;
        }
        synchronized (kt.class) {
            try {
                if (i == null) {
                    i = new kt();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
