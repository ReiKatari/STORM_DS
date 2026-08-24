package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[g6.values().length];
        try {
            iArr[g6.All.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g6.Unlocked.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g6.Locked.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
