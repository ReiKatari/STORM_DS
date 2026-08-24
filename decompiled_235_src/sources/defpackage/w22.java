package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w22  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w22 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[nc5.values().length];
        try {
            iArr[nc5.EXIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nc5.RESUME_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nc5.KEEP_SESSION_PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
