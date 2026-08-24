package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d84  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d84 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[c84.values().length];
        try {
            iArr[c84.TOUCH_AIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c84.DPAD_STEER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c84.SLOT2_ANALOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c84.OFF.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
