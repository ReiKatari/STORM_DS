package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m61  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m61 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[gw0.values().length];
        try {
            iArr[gw0.UNSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gw0.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gw0.VALID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[px2.values().length];
        try {
            iArr2[px2.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[px2.NAND_NOT_OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[px2.ERROR_OPENING_FILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[px2.NOT_DSIWARE_TITLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[px2.TITLE_ALREADY_IMPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[px2.TITLE_LIMIT_REACHED.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[px2.DSI_MEMORY_FULL.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[px2.INSATLL_FAILED.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[px2.METADATA_FETCH_FAILED.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[px2.UNKNOWN.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
    }
}
