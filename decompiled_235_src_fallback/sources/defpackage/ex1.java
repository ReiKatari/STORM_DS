package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex1  reason: default package */
/* loaded from: classes.dex */
public enum ex1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ex1[] $VALUES = null;
    public static final defpackage.ex1 ACHIEVEMENTS_DIALOG = null;
    public static final defpackage.ex1 FIRMWARE_LOAD_ERROR_DIALOG = null;
    public static final defpackage.ex1 PAUSE_MENU = null;
    public static final defpackage.ex1 PENDING_SUBMISSION_CONFIRM_EXIT = null;
    public static final defpackage.ex1 PRESETS_DIALOG = null;
    public static final defpackage.ex1 RA_PENDING_EXIT = null;
    public static final defpackage.ex1 RA_PENDING_SYNC = null;
    public static final defpackage.ex1 REWIND_WINDOW = null;
    public static final defpackage.ex1 ROM_LOAD_ERROR_DIALOG = null;
    public static final defpackage.ex1 ROM_NOT_FOUND_DIALOG = null;
    public static final defpackage.ex1 SAVE_STATES_DIALOG = null;
    public static final defpackage.ex1 SWITCH_NEW_ROM_DIALOG = null;

    private static final /* synthetic */ defpackage.ex1[] $values() {
            ex1 r0 = defpackage.ex1.PAUSE_MENU
            ex1 r1 = defpackage.ex1.REWIND_WINDOW
            ex1 r2 = defpackage.ex1.SAVE_STATES_DIALOG
            ex1 r3 = defpackage.ex1.ROM_LOAD_ERROR_DIALOG
            ex1 r4 = defpackage.ex1.FIRMWARE_LOAD_ERROR_DIALOG
            ex1 r5 = defpackage.ex1.ROM_NOT_FOUND_DIALOG
            ex1 r6 = defpackage.ex1.SWITCH_NEW_ROM_DIALOG
            ex1 r7 = defpackage.ex1.ACHIEVEMENTS_DIALOG
            ex1 r8 = defpackage.ex1.PENDING_SUBMISSION_CONFIRM_EXIT
            ex1 r9 = defpackage.ex1.RA_PENDING_EXIT
            ex1 r10 = defpackage.ex1.RA_PENDING_SYNC
            ex1 r11 = defpackage.ex1.PRESETS_DIALOG
            ex1[] r0 = new defpackage.ex1[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            return r0
    }

    static {
            ex1 r0 = new ex1
            java.lang.String r1 = "PAUSE_MENU"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ex1.PAUSE_MENU = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "REWIND_WINDOW"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ex1.REWIND_WINDOW = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "SAVE_STATES_DIALOG"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ex1.SAVE_STATES_DIALOG = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "ROM_LOAD_ERROR_DIALOG"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ex1.ROM_LOAD_ERROR_DIALOG = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "FIRMWARE_LOAD_ERROR_DIALOG"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ex1.FIRMWARE_LOAD_ERROR_DIALOG = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "ROM_NOT_FOUND_DIALOG"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.ex1.ROM_NOT_FOUND_DIALOG = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "SWITCH_NEW_ROM_DIALOG"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.ex1.SWITCH_NEW_ROM_DIALOG = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "ACHIEVEMENTS_DIALOG"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.ex1.ACHIEVEMENTS_DIALOG = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "PENDING_SUBMISSION_CONFIRM_EXIT"
            r2 = 8
            r0.<init>(r1, r2)
            defpackage.ex1.PENDING_SUBMISSION_CONFIRM_EXIT = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "RA_PENDING_EXIT"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.ex1.RA_PENDING_EXIT = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "RA_PENDING_SYNC"
            r2 = 10
            r0.<init>(r1, r2)
            defpackage.ex1.RA_PENDING_SYNC = r0
            ex1 r0 = new ex1
            java.lang.String r1 = "PRESETS_DIALOG"
            r2 = 11
            r0.<init>(r1, r2)
            defpackage.ex1.PRESETS_DIALOG = r0
            ex1[] r0 = $values()
            defpackage.ex1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ex1.$ENTRIES = r0
            return
    }

    ex1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ex1.$ENTRIES
            return r0
    }

    public static defpackage.ex1 valueOf(java.lang.String r1) {
            java.lang.Class<ex1> r0 = defpackage.ex1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ex1 r1 = (defpackage.ex1) r1
            return r1
    }

    public static defpackage.ex1[] values() {
            ex1[] r0 = defpackage.ex1.$VALUES
            java.lang.Object r0 = r0.clone()
            ex1[] r0 = (defpackage.ex1[]) r0
            return r0
    }
}
