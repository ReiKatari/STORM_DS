package q9;

import android.widget.ImageView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f12392a;

    static {
        int[] iArr = new int[d9.f.values().length];
        try {
            iArr[d9.f.MEMORY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d9.f.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d9.f.DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d9.f.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        try {
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr3 = new int[n9.f.values().length];
        try {
            iArr3[n9.f.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[n9.f.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f12392a = iArr3;
    }
}
