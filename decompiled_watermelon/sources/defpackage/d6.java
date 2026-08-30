package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[e3.values().length];
        try {
            iArr[e3.PendingSubmissions.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e3.ActiveChallenges.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e3.RecentlyUnlocked.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e3.Unsynced.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e3.AlmostThere.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e3.Locked.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[e3.Unsupported.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[e3.Unofficial.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[e3.Unlocked.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
