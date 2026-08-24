package defpackage;

import defpackage.sz1;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wz1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;
    public static final /* synthetic */ int[] j;
    public static final /* synthetic */ int[] k;
    public static final /* synthetic */ int[] l;

    static {
        int[] iArr = new int[mi4.values().length];
        try {
            iArr[mi4.CONTINUE_OFFLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mi4.SYNC_NOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[yk6.values().length];
        try {
            iArr2[yk6.MISSING_FROM_CURRENT_SET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[yk6.DEFINITION_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yk6.NOT_IN_PREFETCH_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yk6.SERVER_REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[yv2.values().length];
        try {
            iArr3[yv2.SYNC_AND_EXIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[yv2.CONTINUE_PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[yv2.DISCARD_AND_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[xz5.values().length];
        try {
            iArr4[xz5.SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[xz5.ROM_SETTINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[xz5.SAVE_STATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[xz5.LOAD_STATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[xz5.REWIND.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[xz5.CHEATS.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[xz5.VIEW_ACHIEVEMENTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[xz5.SYNC_RETRO_ACHIEVEMENTS.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[xz5.PRESETS.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[xz5.RENDERER_DEBUG.ordinal()] = 10;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[xz5.RESET.ordinal()] = 11;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[xz5.EXIT.ordinal()] = 12;
        } catch (NoSuchFieldError unused21) {
        }
        d = iArr4;
        int[] iArr5 = new int[cd2.values().length];
        try {
            iArr5[cd2.SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[cd2.RESET.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[cd2.EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        e = iArr5;
        int[] iArr6 = new int[p66.values().length];
        try {
            iArr6[p66.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[p66.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[p66.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        f = iArr6;
        int[] iArr7 = new int[ic5.values().length];
        try {
            iArr7[ic5.ACHIEVEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr7[ic5.LEADERBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        g = iArr7;
        int[] iArr8 = new int[bd5.values().length];
        try {
            iArr8[bd5.ACHIEVEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr8[bd5.LEADERBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused31) {
        }
        h = iArr8;
        int[] iArr9 = new int[gc5.values().length];
        try {
            iArr9[gc5.ACCEPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr9[gc5.ALREADY_ACCEPTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr9[gc5.PERMANENT_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr9[gc5.RETRYABLE_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused35) {
        }
        i = iArr9;
        int[] iArr10 = new int[sz1.c.values().length];
        try {
            iArr10[sz1.c.RC_CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr10[sz1.c.RC_CLIENT_OFFLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr10[sz1.c.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr10[sz1.c.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused39) {
        }
        j = iArr10;
        int[] iArr11 = new int[ed5.values().length];
        try {
            iArr11[ed5.REOPEN_PAUSE_MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr11[ed5.RESUME_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr11[ed5.REOPEN_TERMINAL_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused42) {
        }
        k = iArr11;
        int[] iArr12 = new int[jq1.values().length];
        try {
            iArr12[jq1.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr12[jq1.INTERNAL_TOP_EXTERNAL_BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr12[jq1.INTERNAL_BOTTOM_EXTERNAL_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused45) {
        }
        l = iArr12;
    }
}
