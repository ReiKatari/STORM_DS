package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wl6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wl6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[v64.values().length];
        a = iArr;
        try {
            iArr[v64.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[v64.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[v64.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[v64.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[v64.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
