package s8;

import p8.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f12844a;

    static {
        int[] iArr = new int[w.values().length];
        f12844a = iArr;
        try {
            iArr[w.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12844a[w.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12844a[w.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12844a[w.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12844a[w.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
