package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ro5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ro5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[tp5.values().length];
        try {
            iArr[tp5.GRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tp5.LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[bm5.values().length];
        try {
            iArr2[bm5.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bm5.FAVORITES.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[bm5.DS_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[bm5.DSIWARE_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[bm5.WITH_RETRO_ACHIEVEMENTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[qb6.values().length];
        try {
            iArr3[qb6.ALPHABETICALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[qb6.RECENTLY_PLAYED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[qb6.MOST_PLAYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
