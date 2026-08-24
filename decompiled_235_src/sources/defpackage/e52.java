package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e52  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e52 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[z42.values().length];
        try {
            iArr[z42.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z42.PreEnter.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z42.PostExit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
