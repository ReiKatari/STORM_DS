package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hi7  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class hi7 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ih7.values().length];
        try {
            iArr[ih7.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ih7.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ih7.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ih7.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ih7.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ih7.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[f00.values().length];
        try {
            iArr2[f00.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f00.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[v64.values().length];
        try {
            iArr3[v64.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[v64.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[v64.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[v64.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[v64.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
        int[] iArr4 = new int[mf4.values().length];
        try {
            iArr4[mf4.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[mf4.DROP_WORK_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
