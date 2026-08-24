package defpackage;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yu1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ yu1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity2 = this.B;
                rj5 e0 = emulatorActivity2.e0();
                vr4 P = emulatorActivity2.P();
                LinearLayout linearLayout = (LinearLayout) P.A;
                emulatorActivity2.G(linearLayout, "Texture state");
                emulatorActivity2.J(linearLayout, e0, 128, "Textured polygons", "GPU3D polygons with texture mapping enabled and non-zero texture format. Code gate: `RenderDispCnt` texture bit plus `TexParam >> 26`.");
                emulatorActivity2.J(linearLayout, e0, 256, "Untextured polygons", "GPU3D polygons without active texture sampling. Code path uses fallback/untextured material data in Vulkan raster shaders.");
                emulatorActivity2.M0("Texture state", (ScrollView) P.B, new wu1(emulatorActivity2, 25));
                return;
            case 1:
                int i3 = EmulatorActivity.Z1;
                emulatorActivity.D0(true);
                return;
            case 2:
                int i4 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity3 = this.B;
                rj5 e02 = emulatorActivity3.e0();
                vr4 P2 = emulatorActivity3.P();
                LinearLayout linearLayout2 = (LinearLayout) P2.A;
                emulatorActivity3.G(linearLayout2, "Primitive buckets");
                emulatorActivity3.J(linearLayout2, e02, 2, "Triangle polygons", "Nintendo DS 3D polygon primitives. Code gate: `AcceleratedPrimitiveType::Triangles` or `polygon->Type != 1`.");
                emulatorActivity3.J(linearLayout2, e02, 4, "Line polygons", "Nintendo DS 3D line primitives expanded into quads for Vulkan. Code gate: `AcceleratedPrimitiveType::Lines` or `polygon->Type == 1`.");
                emulatorActivity3.M0("Primitive buckets", (ScrollView) P2.B, new bv1(emulatorActivity3, 0));
                return;
            case 3:
                int i5 = EmulatorActivity.Z1;
                emulatorActivity.F0(true);
                return;
            case 4:
                int i6 = EmulatorActivity.Z1;
                emulatorActivity.D0(false);
                return;
            case 5:
                int i7 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity4 = this.B;
                rj5 e03 = emulatorActivity4.e0();
                vr4 P3 = emulatorActivity4.P();
                LinearLayout linearLayout3 = (LinearLayout) P3.A;
                emulatorActivity4.G(linearLayout3, "Screen bands");
                emulatorActivity4.D(linearLayout3, "Filters whole 3D polygons by their Y range in the active render target. This is a coarse isolation tool: polygons spanning an enabled band remain whole.");
                emulatorActivity4.J(linearLayout3, e03, 65536, "3D upper band - Y 0..63", "GPU3D polygons touching the upper third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution.");
                emulatorActivity4.J(linearLayout3, e03, 131072, "3D middle band - Y 64..127", "GPU3D polygons touching the middle third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution.");
                emulatorActivity4.J(linearLayout3, e03, 262144, "3D lower band - Y 128..191", "GPU3D polygons touching the lower third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution.");
                emulatorActivity4.M0("Screen bands", (ScrollView) P3.B, new wu1(emulatorActivity4, 29));
                return;
            case 6:
                int i8 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity5 = this.B;
                rj5 e04 = emulatorActivity5.e0();
                vr4 P4 = emulatorActivity5.P();
                LinearLayout linearLayout4 = (LinearLayout) P4.A;
                emulatorActivity5.G(linearLayout4, "Depth mode");
                emulatorActivity5.J(linearLayout4, e04, 4096, "W-buffer polygons", "Nintendo DS W-buffer polygons. Code gate: `AcceleratedPolygonFlagWBuffer`; Vulkan uses perspective W depth interpolation.");
                emulatorActivity5.J(linearLayout4, e04, 8192, "Z-buffer polygons", "Nintendo DS Z-buffer polygons. Code gate: absence of `AcceleratedPolygonFlagWBuffer`; Vulkan uses screen-space linear Z depth.");
                emulatorActivity5.J(linearLayout4, e04, 16384, "Depth write polygons", "GPU3D polygons that update depth. Code gate: `PolyAttr` bit 11; disabling this removes depth-writing polygons from the draw queues.");
                emulatorActivity5.J(linearLayout4, e04, 32768, "Fog write polygons", "GPU3D polygons that write fog attributes. Code gate: `AcceleratedPolygonFlagFogWrite`; final fog pass consumes the attribute target.");
                emulatorActivity5.M0("Depth and fog mode", (ScrollView) P4.B, new bv1(emulatorActivity5, 1));
                return;
            case 7:
                int i9 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity6 = this.B;
                rj5 e05 = emulatorActivity6.e0();
                vr4 P5 = emulatorActivity6.P();
                LinearLayout linearLayout5 = (LinearLayout) P5.A;
                emulatorActivity6.G(linearLayout5, "Polygon mode");
                emulatorActivity6.J(linearLayout5, e05, 512, "Modulation polygons", "Nintendo DS polygon mode 0 or untextured fallback. Code gate: `PolyAttr` blend mode not decal/toon-highlight.");
                emulatorActivity6.J(linearLayout5, e05, 1024, "Decal polygons", "Nintendo DS decal-style textured polygons. Code gate: textured polygon with `PolyAttr` blend mode bit 0 set.");
                emulatorActivity6.J(linearLayout5, e05, 2048, "Toon / highlight polygons", "Nintendo DS toon/highlight polygon mode. Code gate: `PolyAttr` blend mode 2; Vulkan chooses toon or highlight from `RenderDispCnt`.");
                emulatorActivity6.M0("Polygon mode", (ScrollView) P5.B, new wu1(emulatorActivity6, 27));
                return;
            case 8:
                int i10 = EmulatorActivity.Z1;
                emulatorActivity.F0(false);
                return;
            case 9:
                int i11 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity7 = this.B;
                rj5 e06 = emulatorActivity7.e0();
                vr4 P6 = emulatorActivity7.P();
                LinearLayout linearLayout6 = (LinearLayout) P6.A;
                emulatorActivity7.G(linearLayout6, "Blend buckets");
                emulatorActivity7.J(linearLayout6, e06, 8, "Opaque polygons", "Opaque GPU3D polygons. Code bucket: `GraphicsOpaqueDrawIndices`; alpha is 31 and the accelerated translucent flag is clear.");
                emulatorActivity7.J(linearLayout6, e06, 16, "Translucent polygons", "Translucent GPU3D polygons. Code bucket: `GraphicsAlphaDrawIndices`; includes accelerated translucent pass or polygon alpha below 31.");
                emulatorActivity7.J(linearLayout6, e06, 32, "Shadow mask polygons", "Nintendo DS shadow mask polygons. Code bucket: `GraphicsShadowMaskDrawIndices` and `AcceleratedPolygonFlagShadowMask`.");
                emulatorActivity7.J(linearLayout6, e06, 64, "Shadow polygons", "Nintendo DS shadow blend polygons. Code bucket: `GraphicsShadowDrawIndices` and `AcceleratedPolygonFlagShadow`.");
                emulatorActivity7.M0("Blend buckets", (ScrollView) P6.B, new wu1(emulatorActivity7, 28));
                return;
            case 10:
                int i12 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity8 = this.B;
                rj5 e07 = emulatorActivity8.e0();
                vr4 P7 = emulatorActivity8.P();
                LinearLayout linearLayout7 = (LinearLayout) P7.A;
                emulatorActivity8.G(linearLayout7, "3D renderer output");
                emulatorActivity8.J(linearLayout7, e07, 1, "3D renderer output", "Master GPU3D output gate. Code: Vulkan `buildGraphicsTriangleList` / `buildTriangleList`; disables all 3D polygons before raster queues are populated.");
                emulatorActivity8.M0("3D renderer output", (ScrollView) P7.B, new wu1(emulatorActivity8, 26));
                return;
            case 11:
                int i13 = EmulatorActivity.Z1;
                emulatorActivity.R0();
                emulatorActivity.U0();
                c92 c92Var = emulatorActivity.K0;
                if (c92Var != null) {
                    c92Var.b();
                    return;
                }
                return;
            case 12:
                int i14 = EmulatorActivity.Z1;
                emulatorActivity.U0();
                c92 c92Var2 = emulatorActivity.K0;
                if (c92Var2 != null) {
                    c92Var2.b();
                    return;
                }
                return;
            case 13:
                int i15 = EmulatorActivity.Z1;
                emulatorActivity.R0();
                return;
            default:
                int i16 = EmulatorActivity.Z1;
                emulatorActivity.R0();
                return;
        }
    }
}
