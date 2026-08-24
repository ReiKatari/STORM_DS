package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d32  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d32 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[iw1.values().length];
        try {
            iArr[iw1.GBAModeNotSupported.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iw1.BadExceptionRegion.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[iw1.PowerOff.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
