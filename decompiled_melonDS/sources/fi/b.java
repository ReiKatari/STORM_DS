package fi;

import oe.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4966a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.UNSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4966a = iArr;
    }
}
