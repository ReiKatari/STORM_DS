package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final long f7341a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f7342b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f7343c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f7344d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f7345e = 0;

    static {
        long j2 = 3;
        long j10 = j2 << 32;
        f7341a = (0 & 4294967295L) | j10;
        f7342b = (1 & 4294967295L) | j10;
        f7343c = j10 | (2 & 4294967295L);
        f7344d = (j2 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j2) {
        if (a(j2, f7341a)) {
            return "Rgb";
        }
        if (a(j2, f7342b)) {
            return "Xyz";
        }
        if (a(j2, f7343c)) {
            return "Lab";
        }
        if (a(j2, f7344d)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
