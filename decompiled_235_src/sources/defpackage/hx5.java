package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class hx5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[vv5.values().length];
        try {
            iArr[vv5.CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vv5.CHEATS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vv5.RETRO_ACHIEVEMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vv5.OFFLINE_ACHIEVEMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
