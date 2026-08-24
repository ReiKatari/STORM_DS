package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dw1  reason: default package */
/* loaded from: classes.dex */
public abstract class dw1 {
    public static final java.util.List a = null;
    public static final java.util.List b = null;
    public static final java.util.List c = null;
    public static final java.util.List d = null;

    static {
            mj5 r0 = new mj5
            r1 = -1
            java.lang.String r2 = "Native compMode - keep packed control plane"
            r0.<init>(r1, r2)
            mj5 r1 = new mj5
            java.lang.String r2 = "compMode 0 - sample 3D path, normal composite branch"
            r9 = 0
            r1.<init>(r9, r2)
            mj5 r2 = new mj5
            java.lang.String r3 = "compMode 1 - 3D-aware branch with direct 2D/3D selection"
            r10 = 1
            r2.<init>(r10, r3)
            mj5 r3 = new mj5
            java.lang.String r4 = "compMode 2 - 3D-aware blend branch"
            r11 = 2
            r3.<init>(r11, r4)
            mj5 r4 = new mj5
            java.lang.String r5 = "compMode 3 - 3D-aware alternate blend branch"
            r12 = 3
            r4.<init>(r12, r5)
            mj5 r5 = new mj5
            r6 = 4
            java.lang.String r7 = "compMode 4 - capture-backed 3D placeholder branch"
            r5.<init>(r6, r7)
            mj5 r6 = new mj5
            r7 = 5
            java.lang.String r8 = "compMode 5 - reserved/debug passthrough branch"
            r6.<init>(r7, r8)
            mj5 r7 = new mj5
            r8 = 6
            java.lang.String r13 = "compMode 6 - reserved/debug passthrough branch"
            r7.<init>(r8, r13)
            mj5 r8 = new mj5
            r13 = 7
            java.lang.String r14 = "compMode 7 - no live 3D sample unless temporal fallback is marked"
            r8.<init>(r13, r14)
            mj5[] r0 = new defpackage.mj5[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.dw1.a = r0
            lj5 r0 = new lj5
            java.lang.String r1 = "BG0 - first static or 3D background layer"
            java.lang.String r2 = "Nintendo DS BG0. Code gate: DISPCNT bit 8; DrawBG_Text, or DrawBG_3D on Engine A when DISPCNT bit 3 selects the 3D background."
            r0.<init>(r1, r9, r2)
            lj5 r1 = new lj5
            java.lang.String r2 = "BG1 - static background layer"
            java.lang.String r3 = "Nintendo DS BG1. Code gate: DISPCNT bit 9; currently routes through DrawBG_Text in the software 2D compositor."
            r1.<init>(r2, r10, r3)
            lj5 r2 = new lj5
            java.lang.String r3 = "BG2 - static, affine, affine extended or large screen background"
            java.lang.String r4 = "Nintendo DS BG2. Code gate: DISPCNT bit 10; routes through DrawBG_Text, DrawBG_Affine, DrawBG_Extended or DrawBG_Large depending on BG mode and BGCNT."
            r2.<init>(r3, r11, r4)
            lj5 r3 = new lj5
            java.lang.String r4 = "BG3 - static, affine or affine extended background"
            java.lang.String r5 = "Nintendo DS BG3. Code gate: DISPCNT bit 11; routes through DrawBG_Text, DrawBG_Affine or DrawBG_Extended depending on BG mode and BGCNT."
            r3.<init>(r4, r12, r5)
            lj5[] r0 = new defpackage.lj5[]{r0, r1, r2, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.dw1.b = r0
            qj5 r0 = new qj5
            java.lang.String r1 = "Priority 0 - frontmost"
            java.lang.String r2 = "Highest Nintendo DS priority; this layer is drawn closest to the viewer."
            r0.<init>(r1, r9, r2)
            qj5 r1 = new qj5
            java.lang.String r2 = "Priority 1"
            java.lang.String r3 = "Second-highest Nintendo DS priority."
            r1.<init>(r2, r10, r3)
            qj5 r2 = new qj5
            java.lang.String r3 = "Priority 2"
            java.lang.String r4 = "Second-lowest Nintendo DS priority."
            r2.<init>(r3, r11, r4)
            qj5 r3 = new qj5
            java.lang.String r4 = "Priority 3 - backmost"
            java.lang.String r5 = "Lowest Nintendo DS priority; this layer is drawn furthest back."
            r3.<init>(r4, r12, r5)
            qj5[] r0 = new defpackage.qj5[]{r0, r1, r2, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.dw1.c = r0
            pj5 r0 = new pj5
            java.lang.String r1 = "OBJ OAM index 0..31 - frontmost order bucket"
            java.lang.String r2 = "OAM entries 0-31. Code gate: `sprnum / 32` in `DrawSprites`; lower OBJ indices are drawn later for equal priority and usually appear in front."
            r0.<init>(r1, r9, r2)
            pj5 r1 = new pj5
            java.lang.String r2 = "OBJ OAM index 32..63"
            java.lang.String r3 = "OAM entries 32-63. Code gate: `sprnum / 32` in `DrawSprites`; useful for separating grouped composite sprites with the same OBJ priority."
            r1.<init>(r2, r10, r3)
            pj5 r2 = new pj5
            java.lang.String r3 = "OBJ OAM index 64..95"
            java.lang.String r4 = "OAM entries 64-95. Code gate: `sprnum / 32` in `DrawSprites`; later than 96-127 but behind lower OAM index buckets at equal priority."
            r2.<init>(r3, r11, r4)
            pj5 r3 = new pj5
            java.lang.String r4 = "OBJ OAM index 96..127 - backmost order bucket"
            java.lang.String r5 = "OAM entries 96-127. Code gate: `sprnum / 32` in `DrawSprites`; highest OBJ indices are drawn first for equal priority and usually sit furthest back."
            r3.<init>(r4, r12, r5)
            pj5[] r0 = new defpackage.pj5[]{r0, r1, r2, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.dw1.d = r0
            return
    }
}
