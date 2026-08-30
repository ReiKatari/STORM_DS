package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fw2  reason: default package */
/* loaded from: classes.dex */
public interface fw2 extends l45 {
    public static final uw l;
    public static final uw m;
    public static final uw n;

    static {
        Class cls = Integer.TYPE;
        l = new uw("camerax.core.imageInput.inputFormat", cls, null);
        m = new uw("camerax.core.imageInput.secondaryInputFormat", cls, null);
        n = new uw("camerax.core.imageInput.inputDynamicRange", sm1.class, null);
    }

    default int x() {
        return ((Integer) g(l)).intValue();
    }
}
