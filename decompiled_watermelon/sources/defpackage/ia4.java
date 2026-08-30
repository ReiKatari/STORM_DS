package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ia4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ia4 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ga4.values().length];
        try {
            iArr[ga4.SESSION_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ga4.SESSION_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[jb4.values().length];
        try {
            iArr2[jb4.SOFTCORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[jb4.HARDCORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[jb4.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[lb4.values().length];
        try {
            iArr3[lb4.OFFLINE_FROM_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[lb4.OFFLINE_AFTER_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[lb4.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
