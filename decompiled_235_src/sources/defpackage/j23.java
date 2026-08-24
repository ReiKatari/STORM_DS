package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j23  reason: default package */
/* loaded from: classes.dex */
public interface j23 extends yd5 {
    public static final xx l;
    public static final xx m;
    public static final xx n;

    static {
        Class cls = Integer.TYPE;
        l = new xx("camerax.core.imageInput.inputFormat", cls, null);
        m = new xx("camerax.core.imageInput.secondaryInputFormat", cls, null);
        n = new xx("camerax.core.imageInput.inputDynamicRange", yq1.class, null);
    }

    default int q() {
        return ((Integer) e(l)).intValue();
    }
}
