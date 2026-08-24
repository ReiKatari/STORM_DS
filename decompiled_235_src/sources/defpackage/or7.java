package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or7  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class or7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[gp1.values().length];
        try {
            iArr[gp1.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gp1.INSTALLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gp1.NOT_INSTALLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
