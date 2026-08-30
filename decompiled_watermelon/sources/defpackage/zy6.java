package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zy6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class zy6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[bd2.values().length];
        try {
            iArr[bd2.ActiveParent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bd2.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bd2.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bd2.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
