package defpackage;

import defpackage.hv1;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bz1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bz1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[hv1.b.values().length];
        try {
            iArr[hv1.b.ONLINE_LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hv1.b.RECONCILING_RA_SUBMISSIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hv1.b.OFFLINE_ACCUMULATING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
