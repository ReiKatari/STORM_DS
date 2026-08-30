package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wv3  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wv3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rf3.values().length];
        try {
            iArr[rf3.LookaheadMeasuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rf3.LookaheadLayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rf3.Measuring.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rf3.LayingOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[rf3.Idle.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
