package zg;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15097a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f15098b;

    static {
        int[] iArr = new int[oe.h.values().length];
        try {
            iArr[oe.h.UNSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oe.h.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oe.h.VALID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15097a = iArr;
        int[] iArr2 = new int[re.b.values().length];
        try {
            iArr2[re.b.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[re.b.NAND_NOT_OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[re.b.ERROR_OPENING_FILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[re.b.NOT_DSIWARE_TITLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[re.b.TITLE_ALREADY_IMPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[re.b.INSATLL_FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[re.b.METADATA_FETCH_FAILED.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[re.b.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        f15098b = iArr2;
    }
}
