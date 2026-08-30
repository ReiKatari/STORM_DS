package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9703a;

    static {
        int[] iArr = new int[zh.a.values().length];
        try {
            iArr[zh.a.PendingSubmissions.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zh.a.ActiveChallenges.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zh.a.RecentlyUnlocked.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zh.a.AlmostThere.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zh.a.Locked.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[zh.a.Unlocked.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f9703a = iArr;
    }
}
