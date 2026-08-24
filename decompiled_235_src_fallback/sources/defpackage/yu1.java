package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yu1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ yu1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.A
            r1 = 1
            r2 = 0
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = r9.B
            switch(r0) {
                case 0: goto L1c2;
                case 1: goto L1bc;
                case 2: goto L189;
                case 3: goto L183;
                case 4: goto L17d;
                case 5: goto L138;
                case 6: goto Lee;
                case 7: goto Lae;
                case 8: goto La8;
                case 9: goto L5f;
                case 10: goto L32;
                case 11: goto L22;
                case 12: goto L15;
                case 13: goto Lf;
                default: goto L9;
            }
        L9:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.R0()
            return
        Lf:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.R0()
            return
        L15:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.U0()
            c92 r9 = r3.K0
            if (r9 == 0) goto L21
            r9.b()
        L21:
            return
        L22:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.R0()
            r3.U0()
            c92 r9 = r3.K0
            if (r9 == 0) goto L31
            r9.b()
        L31:
            return
        L32:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = r9.B
            rj5 r3 = r1.e0()
            vr4 r9 = r1.P()
            java.lang.Object r0 = r9.A
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.Object r9 = r9.B
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            java.lang.String r0 = "3D renderer output"
            r1.G(r2, r0)
            java.lang.String r5 = "3D renderer output"
            java.lang.String r6 = "Master GPU3D output gate. Code: Vulkan `buildGraphicsTriangleList` / `buildTriangleList`; disables all 3D polygons before raster queues are populated."
            r4 = 1
            r1.J(r2, r3, r4, r5, r6)
            wu1 r2 = new wu1
            r3 = 26
            r2.<init>(r1, r3)
            r1.M0(r0, r9, r2)
            return
        L5f:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = r9.B
            rj5 r3 = r1.e0()
            vr4 r9 = r1.P()
            java.lang.Object r0 = r9.A
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.Object r9 = r9.B
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            java.lang.String r0 = "Blend buckets"
            r1.G(r2, r0)
            java.lang.String r5 = "Opaque polygons"
            java.lang.String r6 = "Opaque GPU3D polygons. Code bucket: `GraphicsOpaqueDrawIndices`; alpha is 31 and the accelerated translucent flag is clear."
            r4 = 8
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "Translucent polygons"
            java.lang.String r6 = "Translucent GPU3D polygons. Code bucket: `GraphicsAlphaDrawIndices`; includes accelerated translucent pass or polygon alpha below 31."
            r4 = 16
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "Shadow mask polygons"
            java.lang.String r6 = "Nintendo DS shadow mask polygons. Code bucket: `GraphicsShadowMaskDrawIndices` and `AcceleratedPolygonFlagShadowMask`."
            r4 = 32
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "Shadow polygons"
            java.lang.String r6 = "Nintendo DS shadow blend polygons. Code bucket: `GraphicsShadowDrawIndices` and `AcceleratedPolygonFlagShadow`."
            r4 = 64
            r1.J(r2, r3, r4, r5, r6)
            wu1 r2 = new wu1
            r3 = 28
            r2.<init>(r1, r3)
            r1.M0(r0, r9, r2)
            return
        La8:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.F0(r2)
            return
        Lae:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = r9.B
            rj5 r3 = r1.e0()
            vr4 r9 = r1.P()
            java.lang.Object r0 = r9.A
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.Object r9 = r9.B
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            java.lang.String r0 = "Polygon mode"
            r1.G(r2, r0)
            java.lang.String r5 = "Modulation polygons"
            java.lang.String r6 = "Nintendo DS polygon mode 0 or untextured fallback. Code gate: `PolyAttr` blend mode not decal/toon-highlight."
            r4 = 512(0x200, float:7.17E-43)
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "Decal polygons"
            java.lang.String r6 = "Nintendo DS decal-style textured polygons. Code gate: textured polygon with `PolyAttr` blend mode bit 0 set."
            r4 = 1024(0x400, float:1.435E-42)
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "Toon / highlight polygons"
            java.lang.String r6 = "Nintendo DS toon/highlight polygon mode. Code gate: `PolyAttr` blend mode 2; Vulkan chooses toon or highlight from `RenderDispCnt`."
            r4 = 2048(0x800, float:2.87E-42)
            r1.J(r2, r3, r4, r5, r6)
            wu1 r2 = new wu1
            r3 = 27
            r2.<init>(r1, r3)
            r1.M0(r0, r9, r2)
            return
        Lee:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r2 = r9.B
            rj5 r4 = r2.e0()
            vr4 r9 = r2.P()
            java.lang.Object r0 = r9.A
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.lang.Object r9 = r9.B
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            java.lang.String r0 = "Depth mode"
            r2.G(r3, r0)
            java.lang.String r6 = "W-buffer polygons"
            java.lang.String r7 = "Nintendo DS W-buffer polygons. Code gate: `AcceleratedPolygonFlagWBuffer`; Vulkan uses perspective W depth interpolation."
            r5 = 4096(0x1000, float:5.74E-42)
            r2.J(r3, r4, r5, r6, r7)
            java.lang.String r6 = "Z-buffer polygons"
            java.lang.String r7 = "Nintendo DS Z-buffer polygons. Code gate: absence of `AcceleratedPolygonFlagWBuffer`; Vulkan uses screen-space linear Z depth."
            r5 = 8192(0x2000, float:1.148E-41)
            r2.J(r3, r4, r5, r6, r7)
            java.lang.String r6 = "Depth write polygons"
            java.lang.String r7 = "GPU3D polygons that update depth. Code gate: `PolyAttr` bit 11; disabling this removes depth-writing polygons from the draw queues."
            r5 = 16384(0x4000, float:2.2959E-41)
            r2.J(r3, r4, r5, r6, r7)
            java.lang.String r6 = "Fog write polygons"
            java.lang.String r7 = "GPU3D polygons that write fog attributes. Code gate: `AcceleratedPolygonFlagFogWrite`; final fog pass consumes the attribute target."
            r5 = 32768(0x8000, float:4.5918E-41)
            r2.J(r3, r4, r5, r6, r7)
            bv1 r0 = new bv1
            r0.<init>(r2, r1)
            java.lang.String r1 = "Depth and fog mode"
            r2.M0(r1, r9, r0)
            return
        L138:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = r9.B
            rj5 r3 = r1.e0()
            vr4 r9 = r1.P()
            java.lang.Object r0 = r9.A
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.Object r9 = r9.B
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            java.lang.String r0 = "Screen bands"
            r1.G(r2, r0)
            java.lang.String r4 = "Filters whole 3D polygons by their Y range in the active render target. This is a coarse isolation tool: polygons spanning an enabled band remain whole."
            r1.D(r2, r4)
            java.lang.String r5 = "3D upper band - Y 0..63"
            java.lang.String r6 = "GPU3D polygons touching the upper third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution."
            r4 = 65536(0x10000, float:9.1835E-41)
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "3D middle band - Y 64..127"
            java.lang.String r6 = "GPU3D polygons touching the middle third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution."
            r4 = 131072(0x20000, float:1.83671E-40)
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "3D lower band - Y 128..191"
            java.lang.String r6 = "GPU3D polygons touching the lower third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution."
            r4 = 262144(0x40000, float:3.67342E-40)
            r1.J(r2, r3, r4, r5, r6)
            wu1 r2 = new wu1
            r3 = 29
            r2.<init>(r1, r3)
            r1.M0(r0, r9, r2)
            return
        L17d:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.D0(r2)
            return
        L183:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.F0(r1)
            return
        L189:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = r9.B
            rj5 r5 = r3.e0()
            vr4 r9 = r3.P()
            java.lang.Object r0 = r9.A
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r9 = r9.B
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            java.lang.String r0 = "Primitive buckets"
            r3.G(r4, r0)
            java.lang.String r7 = "Triangle polygons"
            java.lang.String r8 = "Nintendo DS 3D polygon primitives. Code gate: `AcceleratedPrimitiveType::Triangles` or `polygon->Type != 1`."
            r6 = 2
            r3.J(r4, r5, r6, r7, r8)
            java.lang.String r7 = "Line polygons"
            java.lang.String r8 = "Nintendo DS 3D line primitives expanded into quads for Vulkan. Code gate: `AcceleratedPrimitiveType::Lines` or `polygon->Type == 1`."
            r6 = 4
            r3.J(r4, r5, r6, r7, r8)
            bv1 r1 = new bv1
            r1.<init>(r3, r2)
            r3.M0(r0, r9, r1)
            return
        L1bc:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.D0(r1)
            return
        L1c2:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = r9.B
            rj5 r3 = r1.e0()
            vr4 r9 = r1.P()
            java.lang.Object r0 = r9.A
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.Object r9 = r9.B
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            java.lang.String r0 = "Texture state"
            r1.G(r2, r0)
            java.lang.String r5 = "Textured polygons"
            java.lang.String r6 = "GPU3D polygons with texture mapping enabled and non-zero texture format. Code gate: `RenderDispCnt` texture bit plus `TexParam >> 26`."
            r4 = 128(0x80, float:1.8E-43)
            r1.J(r2, r3, r4, r5, r6)
            java.lang.String r5 = "Untextured polygons"
            java.lang.String r6 = "GPU3D polygons without active texture sampling. Code path uses fallback/untextured material data in Vulkan raster shaders."
            r4 = 256(0x100, float:3.59E-43)
            r1.J(r2, r3, r4, r5, r6)
            wu1 r2 = new wu1
            r3 = 25
            r2.<init>(r1, r3)
            r1.M0(r0, r9, r2)
            return
    }
}
