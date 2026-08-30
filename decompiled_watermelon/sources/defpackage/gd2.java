package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gd2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gd2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[sd3.values().length];
        try {
            iArr[sd3.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sd3.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[bd2.values().length];
        try {
            iArr2[bd2.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bd2.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[bd2.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[bd2.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
