package defpackage;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wp1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ wp1(EmulatorActivity emulatorActivity, int i) {
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
                emulatorActivity.u0();
                return;
            case 1:
                int i3 = EmulatorActivity.P1;
                emulatorActivity.s0();
                return;
            case 2:
                int i4 = EmulatorActivity.P1;
                emulatorActivity.x0();
                return;
            case 3:
                int i5 = EmulatorActivity.P1;
                emulatorActivity.C0();
                return;
            case 4:
                int i6 = EmulatorActivity.P1;
                emulatorActivity.d0();
                return;
            case 5:
                int i7 = EmulatorActivity.P1;
                emulatorActivity.d0();
                return;
            case ig7.b /* 6 */:
                int i8 = EmulatorActivity.P1;
                final EmulatorActivity emulatorActivity2 = this.B;
                final v95 b0 = emulatorActivity2.b0();
                ti4 P = emulatorActivity2.P();
                LinearLayout linearLayout = (LinearLayout) P.A;
                emulatorActivity2.G(linearLayout, "OBJ transform and storage type");
                emulatorActivity2.E(linearLayout, b0, 256, "OBJ regular transform", "Nintendo DS non-affine OBJ. Code: `DrawSprite_Normal`; OAM Attribute 0 affine flag bit 8 is clear.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i9 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i9) {
                            case 0:
                                int i10 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 1:
                                int i11 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 2:
                                int i12 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 3:
                                int i13 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 4:
                                int i14 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 5:
                                int i15 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, b0, 512, "OBJ affine / rotscale transform", "Nintendo DS affine OBJ. Code: `DrawSprite_Rotscale`; OAM Attribute 0 affine flag bit 8 is set.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i9 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i9) {
                            case 0:
                                int i10 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 1:
                                int i11 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 2:
                                int i12 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 3:
                                int i13 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 4:
                                int i14 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 5:
                                int i15 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, b0, 1024, "OBJ tiled - 16 colors", "Nintendo DS tiled OBJ using 4bpp/16-color data. Code path in `DrawSprite_*` when Attribute 0 color mode bit 13 is clear.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i9 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i9) {
                            case 0:
                                int i10 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 1:
                                int i11 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 2:
                                int i12 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 3:
                                int i13 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 4:
                                int i14 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 5:
                                int i15 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, b0, 2048, "OBJ tiled - 256 colors", "Nintendo DS tiled OBJ using 8bpp/256-color data. Code path in `DrawSprite_*` when Attribute 0 color mode bit 13 is set.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i9 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i9) {
                            case 0:
                                int i10 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 1:
                                int i11 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 2:
                                int i12 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 3:
                                int i13 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 4:
                                int i14 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 5:
                                int i15 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, b0, 4096, "OBJ bitmap", "Nintendo DS bitmap OBJ. Code path in `DrawSprite_*` when OAM Attribute 0 object mode bits 10-11 equal 3.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i9 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i9) {
                            case 0:
                                int i10 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 1:
                                int i11 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 2:
                                int i12 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 3:
                                int i13 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 4:
                                int i14 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 5:
                                int i15 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity3.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity2.I0("OBJ transform and storage type", (ScrollView) P.B, new iq1(emulatorActivity2, 18));
                return;
            case 7:
                int i9 = EmulatorActivity.P1;
                emulatorActivity.v0(true);
                return;
            case 8:
                int i10 = EmulatorActivity.P1;
                emulatorActivity.r0(false);
                return;
            case 9:
                int i11 = EmulatorActivity.P1;
                emulatorActivity.v0(false);
                return;
            case 10:
                int i12 = EmulatorActivity.P1;
                emulatorActivity.r0(true);
                return;
            case 11:
                int i13 = EmulatorActivity.P1;
                final EmulatorActivity emulatorActivity3 = this.B;
                final v95 b02 = emulatorActivity3.b0();
                ti4 P2 = emulatorActivity3.P();
                LinearLayout linearLayout2 = (LinearLayout) P2.A;
                emulatorActivity3.G(linearLayout2, "Special background types");
                emulatorActivity3.E(linearLayout2, b02, 64, "3D background", "Nintendo DS 3D background layer. Code: `DrawBG_3D`; Engine A BG0 placeholder/output used to composite GPU3D with the 2D BG/OBJ stack.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b02;
                        EmulatorActivity emulatorActivity32 = emulatorActivity3;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i14 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i15 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity3.I0("Special background types", (ScrollView) P2.B, new bq1(emulatorActivity3, 28));
                return;
            case mj2.L /* 12 */:
                int i14 = EmulatorActivity.P1;
                emulatorActivity.t0(false);
                return;
            case 13:
                int i15 = EmulatorActivity.P1;
                final EmulatorActivity emulatorActivity4 = this.B;
                final v95 b03 = emulatorActivity4.b0();
                ti4 P3 = emulatorActivity4.P();
                LinearLayout linearLayout3 = (LinearLayout) P3.A;
                emulatorActivity4.G(linearLayout3, "Tile background types");
                emulatorActivity4.E(linearLayout3, b03, 1, "Static background", "Nintendo DS static BG. Code: `DrawBG_Text`; used by BG0/BG1 and by BG2/BG3 when the active mode selects text/static layers.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b03;
                        EmulatorActivity emulatorActivity32 = emulatorActivity4;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity4.E(linearLayout3, b03, 2, "Affine background", "Nintendo DS affine BG. Code: `DrawBG_Affine`; used for BG2/BG3 in modes that select affine transform layers.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b03;
                        EmulatorActivity emulatorActivity32 = emulatorActivity4;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity4.E(linearLayout3, b03, 4, "Affine Extended background - tiled", "Nintendo DS affine extended tiled BG. Code: `DrawBG_Extended` with BGCNT bitmap bit clear; keeps the tile path with H/V flip support.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b03;
                        EmulatorActivity emulatorActivity32 = emulatorActivity4;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i16 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i17 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity4.I0("Tile background types", (ScrollView) P3.B, new iq1(emulatorActivity4, 7));
                return;
            case 14:
                int i16 = EmulatorActivity.P1;
                emulatorActivity.t0(true);
                return;
            case ig7.e /* 15 */:
                int i17 = EmulatorActivity.P1;
                final EmulatorActivity emulatorActivity5 = this.B;
                final v95 b04 = emulatorActivity5.b0();
                ti4 P4 = emulatorActivity5.P();
                LinearLayout linearLayout4 = (LinearLayout) P4.A;
                emulatorActivity5.G(linearLayout4, "OBJ vertical bands");
                emulatorActivity5.E(linearLayout4, b04, 65536, "OBJ upper band - Y 0..63", "Nintendo DS OBJ pixels and OBJ Window mask for the upper third of the current LCD. Code gate: `DrawSprites(line)` returns after clearing `OBJLine`/`OBJWindow` when `line < 64`.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b04;
                        EmulatorActivity emulatorActivity32 = emulatorActivity5;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity5.E(linearLayout4, b04, 131072, "OBJ middle band - Y 64..127", "Nintendo DS OBJ pixels and OBJ Window mask for the middle third of the current LCD. Code gate: `DrawSprites(line)` line range 64..127.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b04;
                        EmulatorActivity emulatorActivity32 = emulatorActivity5;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity5.E(linearLayout4, b04, 262144, "OBJ lower band - Y 128..191", "Nintendo DS OBJ pixels and OBJ Window mask for the lower third of the current LCD. Code gate: `DrawSprites(line)` line range 128..191.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b04;
                        EmulatorActivity emulatorActivity32 = emulatorActivity5;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i18 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i19 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity5.I0("OBJ vertical bands", (ScrollView) P4.B, new iq1(emulatorActivity5, 5));
                return;
            case 16:
                int i18 = EmulatorActivity.P1;
                emulatorActivity.q0(true);
                return;
            case 17:
                int i19 = EmulatorActivity.P1;
                final EmulatorActivity emulatorActivity6 = this.B;
                final v95 b05 = emulatorActivity6.b0();
                ti4 P5 = emulatorActivity6.P();
                LinearLayout linearLayout5 = (LinearLayout) P5.A;
                emulatorActivity6.G(linearLayout5, "Bitmap background types");
                emulatorActivity6.E(linearLayout5, b05, 8, "Affine Extended background - 256 colors bitmap", "Nintendo DS affine extended 256-color bitmap BG. Code: `DrawBG_Extended` bitmap path without direct-color bit; VRAM is treated as a paletted framebuffer.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b05;
                        EmulatorActivity emulatorActivity32 = emulatorActivity6;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i182 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i192 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity6.E(linearLayout5, b05, 16, "Affine Extended background - direct color bitmap", "Nintendo DS affine extended direct-color bitmap BG. Code: `DrawBG_Extended` bitmap path with BGCNT direct-color bit; VRAM is treated as 15-bit direct color.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b05;
                        EmulatorActivity emulatorActivity32 = emulatorActivity6;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i182 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i192 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity6.E(linearLayout5, b05, 32, "Large screen background", "Nintendo DS large screen BG. Code: `DrawBG_Large`; mode 6 BG2 large framebuffer path, available only on Engine A (Main).", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b05;
                        EmulatorActivity emulatorActivity32 = emulatorActivity6;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i182 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i192 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i20 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity6.I0("Bitmap background types", (ScrollView) P5.B, new iq1(emulatorActivity6, 12));
                return;
            case 18:
                int i20 = EmulatorActivity.P1;
                final EmulatorActivity emulatorActivity7 = this.B;
                final v95 b06 = emulatorActivity7.b0();
                ti4 P6 = emulatorActivity7.P();
                LinearLayout linearLayout6 = (LinearLayout) P6.A;
                emulatorActivity7.G(linearLayout6, "OBJ master");
                emulatorActivity7.E(linearLayout6, b06, 128, "OBJ (Objects / Sprites)", "Nintendo DS sprites from OAM. Code: `DrawSprites`, `DrawSprite_Normal`, `DrawSprite_Rotscale` and `InterleaveSprites`; covers tiled and bitmap OBJ pixels.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b06;
                        EmulatorActivity emulatorActivity32 = emulatorActivity7;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i182 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i192 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i202 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i21 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i22 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i23 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i24 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i25 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity7.I0("OBJ master", (ScrollView) P6.B, new iq1(emulatorActivity7, 24));
                return;
            case 19:
                int i21 = EmulatorActivity.P1;
                emulatorActivity.q0(false);
                return;
            case 20:
                int i22 = EmulatorActivity.P1;
                emulatorActivity.D0();
                return;
            case 21:
                int i23 = EmulatorActivity.P1;
                emulatorActivity.y0();
                return;
            case 22:
                int i24 = EmulatorActivity.P1;
                emulatorActivity.E0();
                return;
            case 23:
                int i25 = EmulatorActivity.P1;
                final EmulatorActivity emulatorActivity8 = this.B;
                final v95 b07 = emulatorActivity8.b0();
                ti4 P7 = emulatorActivity8.P();
                LinearLayout linearLayout7 = (LinearLayout) P7.A;
                emulatorActivity8.G(linearLayout7, "OBJ effects and masks");
                emulatorActivity8.E(linearLayout7, b07, 8192, "OBJ semi-transparent", "Nintendo DS semi-transparent OBJ. Code path in `DrawSprite_*` when OAM Attribute 0 object mode bits 10-11 equal 1.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b07;
                        EmulatorActivity emulatorActivity32 = emulatorActivity8;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i182 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i192 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i202 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i212 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i222 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i232 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i242 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i252 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity8.E(linearLayout7, b07, 16384, "OBJ Window", "Nintendo DS OBJ Window mask. Code: `DrawSprite_*<true>` fills `OBJWindow`; affects window clipping rather than visible color directly.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b07;
                        EmulatorActivity emulatorActivity32 = emulatorActivity8;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i182 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i192 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i202 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i212 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i222 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i232 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i242 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i252 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity8.E(linearLayout7, b07, 32768, "OBJ mosaic", "Nintendo DS OBJ using mosaic. Code: Attribute 0 mosaic bit 12 and `ApplySpriteMosaicX`.", new ki2() { // from class: hq1
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i92 = r3;
                        o27 o27Var = o27.a;
                        v95 v95Var = b07;
                        EmulatorActivity emulatorActivity32 = emulatorActivity8;
                        switch (i92) {
                            case 0:
                                int i102 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 1:
                                int i112 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 2:
                                int i122 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 3:
                                int i132 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 4:
                                int i142 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 5:
                                int i152 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.b /* 6 */:
                                int i162 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 7:
                                int i172 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 8:
                                int i182 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 9:
                                int i192 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 10:
                                int i202 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 11:
                                int i212 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case mj2.L /* 12 */:
                                int i222 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 13:
                                int i232 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 14:
                                int i242 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case ig7.e /* 15 */:
                                int i252 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 16:
                                int i26 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            case 17:
                                int i27 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                            default:
                                int i28 = EmulatorActivity.P1;
                                emulatorActivity32.L(v95Var);
                                return o27Var;
                        }
                    }
                });
                emulatorActivity8.I0("OBJ effects and masks", (ScrollView) P7.B, new iq1(emulatorActivity8, 22));
                return;
            case 24:
                int i26 = EmulatorActivity.P1;
                emulatorActivity.F0();
                return;
            case 25:
                int i27 = EmulatorActivity.P1;
                emulatorActivity.A0();
                return;
            case 26:
                int i28 = EmulatorActivity.P1;
                emulatorActivity.N0();
                return;
            case 27:
                int i29 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity9 = this.B;
                z95 c0 = emulatorActivity9.c0();
                ti4 P8 = emulatorActivity9.P();
                LinearLayout linearLayout8 = (LinearLayout) P8.A;
                emulatorActivity9.G(linearLayout8, "Texture state");
                emulatorActivity9.J(linearLayout8, c0, 128, "Textured polygons", "GPU3D polygons with texture mapping enabled and non-zero texture format. Code gate: `RenderDispCnt` texture bit plus `TexParam >> 26`.");
                emulatorActivity9.J(linearLayout8, c0, 256, "Untextured polygons", "GPU3D polygons without active texture sampling. Code path uses fallback/untextured material data in Vulkan raster shaders.");
                emulatorActivity9.I0("Texture state", (ScrollView) P8.B, new iq1(emulatorActivity9, 25));
                return;
            case 28:
                int i30 = EmulatorActivity.P1;
                emulatorActivity.z0(true);
                return;
            default:
                int i31 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity10 = this.B;
                z95 c02 = emulatorActivity10.c0();
                ti4 P9 = emulatorActivity10.P();
                LinearLayout linearLayout9 = (LinearLayout) P9.A;
                emulatorActivity10.G(linearLayout9, "Primitive buckets");
                emulatorActivity10.J(linearLayout9, c02, 2, "Triangle polygons", "Nintendo DS 3D polygon primitives. Code gate: `AcceleratedPrimitiveType::Triangles` or `polygon->Type != 1`.");
                emulatorActivity10.J(linearLayout9, c02, 4, "Line polygons", "Nintendo DS 3D line primitives expanded into quads for Vulkan. Code gate: `AcceleratedPrimitiveType::Lines` or `polygon->Type == 1`.");
                emulatorActivity10.I0("Primitive buckets", (ScrollView) P9.B, new nq1(emulatorActivity10, 0));
                return;
        }
    }
}
