package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jp5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jp5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[q94.values().length];
        try {
            iArr[q94.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q94.DISABLED_NOT_LOGGED_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q94.DISABLED_NO_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[e3.values().length];
        try {
            iArr2[e3.PendingSubmissions.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e3.ActiveChallenges.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e3.RecentlyUnlocked.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[e3.Unsynced.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[e3.AlmostThere.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[e3.Locked.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[e3.Unsupported.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[e3.Unofficial.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[e3.Unlocked.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
