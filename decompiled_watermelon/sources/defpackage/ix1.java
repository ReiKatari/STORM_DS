package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ix1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ix1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[g64.values().length];
        try {
            iArr[g64.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g64.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
