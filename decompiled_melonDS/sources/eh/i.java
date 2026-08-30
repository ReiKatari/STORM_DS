package eh;

import oe.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4491a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.FAST_FORWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.MICROPHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.TOGGLE_SOFT_INPUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s.RESET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s.SWAP_SCREENS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s.QUICK_SAVE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[s.QUICK_LOAD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[s.REWIND.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f4491a = iArr;
    }
}
