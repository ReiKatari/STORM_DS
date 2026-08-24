package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[g3.values().length];
        try {
            iArr[g3.PendingSubmissions.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g3.ActiveChallenges.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g3.RecentlyUnlocked.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g3.Unsynced.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g3.AlmostThere.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g3.Locked.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[g3.Unsupported.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[g3.Unofficial.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[g3.Unlocked.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
