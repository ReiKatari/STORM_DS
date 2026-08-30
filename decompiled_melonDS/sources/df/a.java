package df;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4052a;

    static {
        int[] iArr = new int[ConsoleType.values().length];
        try {
            iArr[ConsoleType.DS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleType.DSi.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4052a = iArr;
    }
}
