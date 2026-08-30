package ef;

import ve.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4480a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.FOLLOW_SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.PORTRAIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.LANDSCAPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4480a = iArr;
    }
}
