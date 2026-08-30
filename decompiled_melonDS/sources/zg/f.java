package zg;

import oe.d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15091a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f15092b;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15091a = iArr;
        int[] iArr2 = new int[yg.a.values().length];
        try {
            iArr2[yg.a.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[yg.a.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yg.a.IMPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yg.a.EXPORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f15092b = iArr2;
    }
}
