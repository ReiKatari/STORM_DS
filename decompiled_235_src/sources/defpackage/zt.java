package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt  reason: default package */
/* loaded from: classes.dex */
public final class zt extends np2 {
    public static volatile zt f;
    public static final yt g = new yt(0);
    public final sf1 e;

    public zt() {
        super(24);
        this.e = new sf1();
    }

    public static zt l0() {
        if (f != null) {
            return f;
        }
        synchronized (zt.class) {
            try {
                if (f == null) {
                    f = new zt();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }
}
