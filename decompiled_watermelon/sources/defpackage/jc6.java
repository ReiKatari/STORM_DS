package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jc6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jc6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[kc6.values().length];
        try {
            iArr[kc6.REMOVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kc6.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kc6.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kc6.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
