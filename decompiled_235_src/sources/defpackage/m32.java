package defpackage;

import defpackage.sz1;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m32  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m32 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[sz1.b.values().length];
        try {
            iArr[sz1.b.ONLINE_LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sz1.b.RECONCILING_RA_SUBMISSIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sz1.b.OFFLINE_ACCUMULATING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
