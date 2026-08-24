package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gu1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ gu1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r14 = this;
            int r0 = r14.A
            r1 = 5
            r2 = 13
            r3 = 7
            r4 = 18
            r5 = 1
            r6 = 0
            me.magnum.melonds.ui.emulator.EmulatorActivity r7 = r14.B
            switch(r0) {
                case 0: goto L2ac;
                case 1: goto L2a6;
                case 2: goto L2a0;
                case 3: goto L29a;
                case 4: goto L294;
                case 5: goto L28e;
                case 6: goto L288;
                case 7: goto L282;
                case 8: goto L27c;
                case 9: goto L276;
                case 10: goto L205;
                case 11: goto L1ff;
                case 12: goto L1f9;
                case 13: goto L1f3;
                case 14: goto L1ed;
                case 15: goto L1ba;
                case 16: goto L1b4;
                case 17: goto L168;
                case 18: goto L162;
                case 19: goto L113;
                case 20: goto L10d;
                case 21: goto Lbc;
                case 22: goto L89;
                case 23: goto L83;
                case 24: goto L7d;
                case 25: goto L77;
                case 26: goto L71;
                case 27: goto L1b;
                case 28: goto L15;
                default: goto Lf;
            }
        Lf:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.E0()
            return
        L15:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.J0()
            return
        L1b:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = r14.B
            nj5 r3 = r1.d0()
            vr4 r14 = r1.P()
            java.lang.Object r0 = r14.A
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.Object r14 = r14.B
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            java.lang.String r0 = "OBJ effects and masks"
            r1.G(r2, r0)
            vu1 r7 = new vu1
            r4 = 15
            r7.<init>(r1, r3, r4)
            r4 = 8192(0x2000, float:1.148E-41)
            java.lang.String r5 = "OBJ semi-transparent"
            java.lang.String r6 = "Nintendo DS semi-transparent OBJ. Code path in `DrawSprite_*` when OAM Attribute 0 object mode bits 10-11 equal 1."
            r1.E(r2, r3, r4, r5, r6, r7)
            vu1 r7 = new vu1
            r4 = 16
            r7.<init>(r1, r3, r4)
            r4 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r5 = "OBJ Window"
            java.lang.String r6 = "Nintendo DS OBJ Window mask. Code: `DrawSprite_*<true>` fills `OBJWindow`; affects window clipping rather than visible color directly."
            r1.E(r2, r3, r4, r5, r6, r7)
            vu1 r7 = new vu1
            r4 = 17
            r7.<init>(r1, r3, r4)
            r4 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r5 = "OBJ mosaic"
            java.lang.String r6 = "Nintendo DS OBJ using mosaic. Code: Attribute 0 mosaic bit 12 and `ApplySpriteMosaicX`."
            r1.E(r2, r3, r4, r5, r6, r7)
            wu1 r2 = new wu1
            r3 = 22
            r2.<init>(r1, r3)
            r1.M0(r0, r14, r2)
            return
        L71:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.I0()
            return
        L77:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.C0()
            return
        L7d:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.H0()
            return
        L83:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.u0(r6)
            return
        L89:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r14.B
            nj5 r7 = r5.d0()
            vr4 r14 = r5.P()
            java.lang.Object r0 = r14.A
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            java.lang.Object r14 = r14.B
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            java.lang.String r0 = "OBJ master"
            r5.G(r6, r0)
            vu1 r11 = new vu1
            r11.<init>(r5, r7, r4)
            r8 = 128(0x80, float:1.8E-43)
            java.lang.String r9 = "OBJ (Objects / Sprites)"
            java.lang.String r10 = "Nintendo DS sprites from OAM. Code: `DrawSprites`, `DrawSprite_Normal`, `DrawSprite_Rotscale` and `InterleaveSprites`; covers tiled and bitmap OBJ pixels."
            r5.E(r6, r7, r8, r9, r10, r11)
            wu1 r1 = new wu1
            r2 = 24
            r1.<init>(r5, r2)
            r5.M0(r0, r14, r1)
            return
        Lbc:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r4 = r14.B
            nj5 r6 = r4.d0()
            vr4 r14 = r4.P()
            java.lang.Object r0 = r14.A
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            java.lang.Object r14 = r14.B
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            java.lang.String r0 = "Bitmap background types"
            r4.G(r5, r0)
            vu1 r10 = new vu1
            r10.<init>(r4, r6, r3)
            r7 = 8
            java.lang.String r8 = "Affine Extended background - 256 colors bitmap"
            java.lang.String r9 = "Nintendo DS affine extended 256-color bitmap BG. Code: `DrawBG_Extended` bitmap path without direct-color bit; VRAM is treated as a paletted framebuffer."
            r4.E(r5, r6, r7, r8, r9, r10)
            vu1 r10 = new vu1
            r1 = 8
            r10.<init>(r4, r6, r1)
            r7 = 16
            java.lang.String r8 = "Affine Extended background - direct color bitmap"
            java.lang.String r9 = "Nintendo DS affine extended direct-color bitmap BG. Code: `DrawBG_Extended` bitmap path with BGCNT direct-color bit; VRAM is treated as 15-bit direct color."
            r4.E(r5, r6, r7, r8, r9, r10)
            vu1 r10 = new vu1
            r1 = 9
            r10.<init>(r4, r6, r1)
            r7 = 32
            java.lang.String r8 = "Large screen background"
            java.lang.String r9 = "Nintendo DS large screen BG. Code: `DrawBG_Large`; mode 6 BG2 large framebuffer path, available only on Engine A (Main)."
            r4.E(r5, r6, r7, r8, r9, r10)
            wu1 r1 = new wu1
            r1.<init>(r4, r2)
            r4.M0(r0, r14, r1)
            return
        L10d:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.u0(r5)
            return
        L113:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = r14.B
            nj5 r8 = r6.d0()
            vr4 r14 = r6.P()
            java.lang.Object r0 = r14.A
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            java.lang.Object r14 = r14.B
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            java.lang.String r0 = "OBJ vertical bands"
            r6.G(r7, r0)
            vu1 r12 = new vu1
            r12.<init>(r6, r8, r5)
            r9 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r10 = "OBJ upper band - Y 0..63"
            java.lang.String r11 = "Nintendo DS OBJ pixels and OBJ Window mask for the upper third of the current LCD. Code gate: `DrawSprites(line)` returns after clearing `OBJLine`/`OBJWindow` when `line < 64`."
            r6.E(r7, r8, r9, r10, r11, r12)
            vu1 r12 = new vu1
            r2 = 2
            r12.<init>(r6, r8, r2)
            r9 = 131072(0x20000, float:1.83671E-40)
            java.lang.String r10 = "OBJ middle band - Y 64..127"
            java.lang.String r11 = "Nintendo DS OBJ pixels and OBJ Window mask for the middle third of the current LCD. Code gate: `DrawSprites(line)` line range 64..127."
            r6.E(r7, r8, r9, r10, r11, r12)
            vu1 r12 = new vu1
            r2 = 3
            r12.<init>(r6, r8, r2)
            r9 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r10 = "OBJ lower band - Y 128..191"
            java.lang.String r11 = "Nintendo DS OBJ pixels and OBJ Window mask for the lower third of the current LCD. Code gate: `DrawSprites(line)` line range 128..191."
            r6.E(r7, r8, r9, r10, r11, r12)
            wu1 r2 = new wu1
            r2.<init>(r6, r1)
            r6.M0(r0, r14, r2)
            return
        L162:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.x0(r5)
            return
        L168:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r4 = r14.B
            nj5 r6 = r4.d0()
            vr4 r14 = r4.P()
            java.lang.Object r0 = r14.A
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            java.lang.Object r14 = r14.B
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            java.lang.String r0 = "Tile background types"
            r4.G(r5, r0)
            vu1 r10 = new vu1
            r2 = 4
            r10.<init>(r4, r6, r2)
            r7 = 1
            java.lang.String r8 = "Static background"
            java.lang.String r9 = "Nintendo DS static BG. Code: `DrawBG_Text`; used by BG0/BG1 and by BG2/BG3 when the active mode selects text/static layers."
            r4.E(r5, r6, r7, r8, r9, r10)
            vu1 r10 = new vu1
            r10.<init>(r4, r6, r1)
            r7 = 2
            java.lang.String r8 = "Affine background"
            java.lang.String r9 = "Nintendo DS affine BG. Code: `DrawBG_Affine`; used for BG2/BG3 in modes that select affine transform layers."
            r4.E(r5, r6, r7, r8, r9, r10)
            vu1 r10 = new vu1
            r1 = 6
            r10.<init>(r4, r6, r1)
            r7 = 4
            java.lang.String r8 = "Affine Extended background - tiled"
            java.lang.String r9 = "Nintendo DS affine extended tiled BG. Code: `DrawBG_Extended` with BGCNT bitmap bit clear; keeps the tile path with H/V flip support."
            r4.E(r5, r6, r7, r8, r9, r10)
            wu1 r1 = new wu1
            r1.<init>(r4, r3)
            r4.M0(r0, r14, r1)
            return
        L1b4:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.x0(r6)
            return
        L1ba:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r7 = r14.B
            nj5 r9 = r7.d0()
            vr4 r14 = r7.P()
            java.lang.Object r0 = r14.A
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            java.lang.Object r14 = r14.B
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            java.lang.String r0 = "Special background types"
            r7.G(r8, r0)
            vu1 r13 = new vu1
            r13.<init>(r7, r9, r6)
            r10 = 64
            java.lang.String r11 = "3D background"
            java.lang.String r12 = "Nintendo DS 3D background layer. Code: `DrawBG_3D`; Engine A BG0 placeholder/output used to composite GPU3D with the 2D BG/OBJ stack."
            r7.E(r8, r9, r10, r11, r12, r13)
            ou1 r1 = new ou1
            r2 = 28
            r1.<init>(r7, r2)
            r7.M0(r0, r14, r1)
            return
        L1ed:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.v0(r5)
            return
        L1f3:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.z0(r6)
            return
        L1f9:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.v0(r6)
            return
        L1ff:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.z0(r5)
            return
        L205:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r14.B
            nj5 r7 = r5.d0()
            vr4 r14 = r5.P()
            java.lang.Object r0 = r14.A
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            java.lang.Object r14 = r14.B
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            java.lang.String r0 = "OBJ transform and storage type"
            r5.G(r6, r0)
            vu1 r11 = new vu1
            r1 = 10
            r11.<init>(r5, r7, r1)
            r8 = 256(0x100, float:3.59E-43)
            java.lang.String r9 = "OBJ regular transform"
            java.lang.String r10 = "Nintendo DS non-affine OBJ. Code: `DrawSprite_Normal`; OAM Attribute 0 affine flag bit 8 is clear."
            r5.E(r6, r7, r8, r9, r10, r11)
            vu1 r11 = new vu1
            r1 = 11
            r11.<init>(r5, r7, r1)
            r8 = 512(0x200, float:7.17E-43)
            java.lang.String r9 = "OBJ affine / rotscale transform"
            java.lang.String r10 = "Nintendo DS affine OBJ. Code: `DrawSprite_Rotscale`; OAM Attribute 0 affine flag bit 8 is set."
            r5.E(r6, r7, r8, r9, r10, r11)
            vu1 r11 = new vu1
            r1 = 12
            r11.<init>(r5, r7, r1)
            r8 = 1024(0x400, float:1.435E-42)
            java.lang.String r9 = "OBJ tiled - 16 colors"
            java.lang.String r10 = "Nintendo DS tiled OBJ using 4bpp/16-color data. Code path in `DrawSprite_*` when Attribute 0 color mode bit 13 is clear."
            r5.E(r6, r7, r8, r9, r10, r11)
            vu1 r11 = new vu1
            r11.<init>(r5, r7, r2)
            r8 = 2048(0x800, float:2.87E-42)
            java.lang.String r9 = "OBJ tiled - 256 colors"
            java.lang.String r10 = "Nintendo DS tiled OBJ using 8bpp/256-color data. Code path in `DrawSprite_*` when Attribute 0 color mode bit 13 is set."
            r5.E(r6, r7, r8, r9, r10, r11)
            vu1 r11 = new vu1
            r1 = 14
            r11.<init>(r5, r7, r1)
            r8 = 4096(0x1000, float:5.74E-42)
            java.lang.String r9 = "OBJ bitmap"
            java.lang.String r10 = "Nintendo DS bitmap OBJ. Code path in `DrawSprite_*` when OAM Attribute 0 object mode bits 10-11 equal 3."
            r5.E(r6, r7, r8, r9, r10, r11)
            wu1 r1 = new wu1
            r1.<init>(r5, r4)
            r5.M0(r0, r14, r1)
            return
        L276:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.f0()
            return
        L27c:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.f0()
            return
        L282:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.G0()
            return
        L288:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.B0()
            return
        L28e:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.w0()
            return
        L294:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.y0()
            return
        L29a:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.s0()
            return
        L2a0:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.t0()
            return
        L2a6:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.A0()
            return
        L2ac:
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.L0()
            return
    }
}
