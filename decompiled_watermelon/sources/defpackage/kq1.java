package defpackage;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kq1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ kq1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.P1;
                emulatorActivity.B0(true);
                return;
            case 1:
                int i3 = EmulatorActivity.P1;
                emulatorActivity.z0(false);
                return;
            case 2:
                int i4 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity2 = this.B;
                z95 c0 = emulatorActivity2.c0();
                ti4 P = emulatorActivity2.P();
                LinearLayout linearLayout = (LinearLayout) P.A;
                emulatorActivity2.G(linearLayout, "Screen bands");
                emulatorActivity2.D(linearLayout, "Filters whole 3D polygons by their Y range in the active render target. This is a coarse isolation tool: polygons spanning an enabled band remain whole.");
                emulatorActivity2.J(linearLayout, c0, 65536, "3D upper band - Y 0..63", "GPU3D polygons touching the upper third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution.");
                emulatorActivity2.J(linearLayout, c0, 131072, "3D middle band - Y 64..127", "GPU3D polygons touching the middle third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution.");
                emulatorActivity2.J(linearLayout, c0, 262144, "3D lower band - Y 128..191", "GPU3D polygons touching the lower third of the LCD. Code gate uses packed polygon Y bounds scaled to the current internal resolution.");
                emulatorActivity2.I0("Screen bands", (ScrollView) P.B, new iq1(emulatorActivity2, 29));
                return;
            case 3:
                int i5 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity3 = this.B;
                z95 c02 = emulatorActivity3.c0();
                ti4 P2 = emulatorActivity3.P();
                LinearLayout linearLayout2 = (LinearLayout) P2.A;
                emulatorActivity3.G(linearLayout2, "Depth mode");
                emulatorActivity3.J(linearLayout2, c02, 4096, "W-buffer polygons", "Nintendo DS W-buffer polygons. Code gate: `AcceleratedPolygonFlagWBuffer`; Vulkan uses perspective W depth interpolation.");
                emulatorActivity3.J(linearLayout2, c02, 8192, "Z-buffer polygons", "Nintendo DS Z-buffer polygons. Code gate: absence of `AcceleratedPolygonFlagWBuffer`; Vulkan uses screen-space linear Z depth.");
                emulatorActivity3.J(linearLayout2, c02, 16384, "Depth write polygons", "GPU3D polygons that update depth. Code gate: `PolyAttr` bit 11; disabling this removes depth-writing polygons from the draw queues.");
                emulatorActivity3.J(linearLayout2, c02, 32768, "Fog write polygons", "GPU3D polygons that write fog attributes. Code gate: `AcceleratedPolygonFlagFogWrite`; final fog pass consumes the attribute target.");
                emulatorActivity3.I0("Depth and fog mode", (ScrollView) P2.B, new nq1(emulatorActivity3, 1));
                return;
            case 4:
                int i6 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity4 = this.B;
                z95 c03 = emulatorActivity4.c0();
                ti4 P3 = emulatorActivity4.P();
                LinearLayout linearLayout3 = (LinearLayout) P3.A;
                emulatorActivity4.G(linearLayout3, "Polygon mode");
                emulatorActivity4.J(linearLayout3, c03, 512, "Modulation polygons", "Nintendo DS polygon mode 0 or untextured fallback. Code gate: `PolyAttr` blend mode not decal/toon-highlight.");
                emulatorActivity4.J(linearLayout3, c03, 1024, "Decal polygons", "Nintendo DS decal-style textured polygons. Code gate: textured polygon with `PolyAttr` blend mode bit 0 set.");
                emulatorActivity4.J(linearLayout3, c03, 2048, "Toon / highlight polygons", "Nintendo DS toon/highlight polygon mode. Code gate: `PolyAttr` blend mode 2; Vulkan chooses toon or highlight from `RenderDispCnt`.");
                emulatorActivity4.I0("Polygon mode", (ScrollView) P3.B, new iq1(emulatorActivity4, 27));
                return;
            case 5:
                int i7 = EmulatorActivity.P1;
                emulatorActivity.B0(false);
                return;
            case ig7.b /* 6 */:
                int i8 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity5 = this.B;
                z95 c04 = emulatorActivity5.c0();
                ti4 P4 = emulatorActivity5.P();
                LinearLayout linearLayout4 = (LinearLayout) P4.A;
                emulatorActivity5.G(linearLayout4, "Blend buckets");
                emulatorActivity5.J(linearLayout4, c04, 8, "Opaque polygons", "Opaque GPU3D polygons. Code bucket: `GraphicsOpaqueDrawIndices`; alpha is 31 and the accelerated translucent flag is clear.");
                emulatorActivity5.J(linearLayout4, c04, 16, "Translucent polygons", "Translucent GPU3D polygons. Code bucket: `GraphicsAlphaDrawIndices`; includes accelerated translucent pass or polygon alpha below 31.");
                emulatorActivity5.J(linearLayout4, c04, 32, "Shadow mask polygons", "Nintendo DS shadow mask polygons. Code bucket: `GraphicsShadowMaskDrawIndices` and `AcceleratedPolygonFlagShadowMask`.");
                emulatorActivity5.J(linearLayout4, c04, 64, "Shadow polygons", "Nintendo DS shadow blend polygons. Code bucket: `GraphicsShadowDrawIndices` and `AcceleratedPolygonFlagShadow`.");
                emulatorActivity5.I0("Blend buckets", (ScrollView) P4.B, new iq1(emulatorActivity5, 28));
                return;
            case 7:
                int i9 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity6 = this.B;
                z95 c05 = emulatorActivity6.c0();
                ti4 P5 = emulatorActivity6.P();
                LinearLayout linearLayout5 = (LinearLayout) P5.A;
                emulatorActivity6.G(linearLayout5, "3D renderer output");
                emulatorActivity6.J(linearLayout5, c05, 1, "3D renderer output", "Master GPU3D output gate. Code: Vulkan `buildGraphicsTriangleList` / `buildTriangleList`; disables all 3D polygons before raster queues are populated.");
                emulatorActivity6.I0("3D renderer output", (ScrollView) P5.B, new iq1(emulatorActivity6, 26));
                return;
            case 8:
                int i10 = EmulatorActivity.P1;
                emulatorActivity.K((cm1) emulatorActivity.U().Y0.A.getValue());
                emulatorActivity.Q0();
                k42 k42Var = emulatorActivity.J0;
                if (k42Var != null) {
                    k42Var.b();
                }
                emulatorActivity.m0();
                return;
            case 9:
                int i11 = EmulatorActivity.P1;
                emulatorActivity.H0();
                return;
            case 10:
                int i12 = EmulatorActivity.P1;
                emulatorActivity.w0();
                return;
            case 11:
                int i13 = EmulatorActivity.P1;
                emulatorActivity.p0();
                return;
            case mj2.L /* 12 */:
                int i14 = EmulatorActivity.P1;
                emulatorActivity.o0();
                return;
            case 13:
                int i15 = EmulatorActivity.P1;
                emulatorActivity.N0();
                return;
            default:
                int i16 = EmulatorActivity.P1;
                emulatorActivity.N0();
                return;
        }
    }
}
