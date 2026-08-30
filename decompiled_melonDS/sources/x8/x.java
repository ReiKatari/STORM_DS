package x8;

import p8.c0;
import p8.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f14450a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f14451b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f14452c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int[] f14453d;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e0.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e0.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e0.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e0.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f14450a = iArr;
        int[] iArr2 = new int[p8.a.values().length];
        try {
            iArr2[p8.a.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p8.a.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f14451b = iArr2;
        int[] iArr3 = new int[p8.w.values().length];
        try {
            iArr3[p8.w.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[p8.w.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[p8.w.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[p8.w.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[p8.w.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f14452c = iArr3;
        int[] iArr4 = new int[c0.values().length];
        try {
            iArr4[c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[c0.DROP_WORK_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f14453d = iArr4;
    }
}
