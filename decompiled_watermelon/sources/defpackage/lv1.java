package defpackage;

import defpackage.hv1;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lv1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lv1 {
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

    static {
        int[] iArr = new int[p94.values().length];
        try {
            iArr[p94.CONTINUE_OFFLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p94.SYNC_NOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[j96.values().length];
        try {
            iArr2[j96.MISSING_FROM_CURRENT_SET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j96.DEFINITION_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j96.NOT_IN_PREFETCH_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j96.SERVER_REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[xp2.values().length];
        try {
            iArr3[xp2.SYNC_AND_EXIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[xp2.CONTINUE_PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[xp2.DISCARD_AND_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[cp5.values().length];
        try {
            iArr4[cp5.SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[cp5.ROM_SETTINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[cp5.SAVE_STATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[cp5.LOAD_STATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[cp5.REWIND.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[cp5.CHEATS.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[cp5.VIEW_ACHIEVEMENTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[cp5.SYNC_RETRO_ACHIEVEMENTS.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[cp5.PRESETS.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[cp5.RENDERER_DEBUG.ordinal()] = 10;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[cp5.RESET.ordinal()] = 11;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[cp5.EXIT.ordinal()] = 12;
        } catch (NoSuchFieldError unused21) {
        }
        d = iArr4;
        int[] iArr5 = new int[k82.values().length];
        try {
            iArr5[k82.SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[k82.RESET.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[k82.EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        e = iArr5;
        int[] iArr6 = new int[gv5.values().length];
        try {
            iArr6[gv5.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[gv5.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[gv5.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        f = iArr6;
        int[] iArr7 = new int[y25.values().length];
        try {
            iArr7[y25.ACHIEVEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr7[y25.LEADERBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        g = iArr7;
        int[] iArr8 = new int[r35.values().length];
        try {
            iArr8[r35.ACHIEVEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr8[r35.LEADERBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused31) {
        }
        h = iArr8;
        int[] iArr9 = new int[w25.values().length];
        try {
            iArr9[w25.ACCEPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr9[w25.ALREADY_ACCEPTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr9[w25.PERMANENT_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr9[w25.RETRYABLE_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused35) {
        }
        i = iArr9;
        int[] iArr10 = new int[hv1.c.values().length];
        try {
            iArr10[hv1.c.RC_CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr10[hv1.c.RC_CLIENT_OFFLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr10[hv1.c.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr10[hv1.c.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused39) {
        }
        j = iArr10;
        int[] iArr11 = new int[u35.values().length];
        try {
            iArr11[u35.REOPEN_PAUSE_MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr11[u35.RESUME_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr11[u35.REOPEN_TERMINAL_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused42) {
        }
        k = iArr11;
    }
}
