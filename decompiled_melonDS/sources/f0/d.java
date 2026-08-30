package f0;

import j0.n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4516a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f4517b;

    static {
        int[] iArr = new int[n2.values().length];
        try {
            iArr[n2.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n2.PREVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n2.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n2.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f4516a = iArr;
        int[] iArr2 = new int[g0.b.values().length];
        try {
            iArr2[g0.b.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g0.b.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[g0.b.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[g0.b.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f4517b = iArr2;
    }
}
