package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u02  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class u02 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[k02.values().length];
        try {
            iArr[k02.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k02.PreEnter.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k02.PostExit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
