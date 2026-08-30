package j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface a1 extends p1 {

    /* renamed from: n  reason: collision with root package name */
    public static final g f7148n;

    /* renamed from: o  reason: collision with root package name */
    public static final g f7149o;

    /* renamed from: p  reason: collision with root package name */
    public static final g f7150p;

    static {
        Class cls = Integer.TYPE;
        f7148n = new g("camerax.core.imageInput.inputFormat", cls, null);
        f7149o = new g("camerax.core.imageInput.secondaryInputFormat", cls, null);
        f7150p = new g("camerax.core.imageInput.inputDynamicRange", d0.a0.class, null);
    }

    default int y() {
        return ((Integer) g(f7148n)).intValue();
    }
}
