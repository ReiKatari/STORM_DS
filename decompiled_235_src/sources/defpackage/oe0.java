package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe0  reason: default package */
/* loaded from: classes.dex */
public interface oe0 extends yd5 {
    public static final xx b = new xx("camerax.core.camera.useCaseConfigFactory", cj7.class, null);
    public static final xx c = new xx("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final xx d = new xx("camerax.core.camera.SessionProcessor", wc6.class, null);
    public static final xx e = new xx("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final xx f = new xx("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void z() {
        if (b(d, null) == null) {
            return;
        }
        u34.a();
    }
}
