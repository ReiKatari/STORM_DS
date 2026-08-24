package defpackage;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gu1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ gu1(EmulatorActivity emulatorActivity, int i) {
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
                emulatorActivity.L0();
                return;
            case 1:
                int i3 = EmulatorActivity.Z1;
                emulatorActivity.A0();
                return;
            case 2:
                int i4 = EmulatorActivity.Z1;
                emulatorActivity.t0();
                return;
            case 3:
                int i5 = EmulatorActivity.Z1;
                emulatorActivity.s0();
                return;
            case 4:
                int i6 = EmulatorActivity.Z1;
                emulatorActivity.y0();
                return;
            case 5:
                int i7 = EmulatorActivity.Z1;
                emulatorActivity.w0();
                return;
            case 6:
                int i8 = EmulatorActivity.Z1;
                emulatorActivity.B0();
                return;
            case 7:
                int i9 = EmulatorActivity.Z1;
                emulatorActivity.G0();
                return;
            case 8:
                int i10 = EmulatorActivity.Z1;
                emulatorActivity.f0();
                return;
            case 9:
                int i11 = EmulatorActivity.Z1;
                emulatorActivity.f0();
                return;
            case 10:
                int i12 = EmulatorActivity.Z1;
                final EmulatorActivity emulatorActivity2 = this.B;
                final nj5 d0 = emulatorActivity2.d0();
                vr4 P = emulatorActivity2.P();
                LinearLayout linearLayout = (LinearLayout) P.A;
                emulatorActivity2.G(linearLayout, "OBJ transform and storage type");
                emulatorActivity2.E(linearLayout, d0, 256, "OBJ regular transform", "Nintendo DS non-affine OBJ. Code: `DrawSprite_Normal`; OAM Attribute 0 affine flag bit 8 is clear.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i13) {
                            case 0:
                                int i14 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i15 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i16 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i17 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i18 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i19 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, d0, 512, "OBJ affine / rotscale transform", "Nintendo DS affine OBJ. Code: `DrawSprite_Rotscale`; OAM Attribute 0 affine flag bit 8 is set.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i13) {
                            case 0:
                                int i14 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i15 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i16 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i17 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i18 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i19 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, d0, 1024, "OBJ tiled - 16 colors", "Nintendo DS tiled OBJ using 4bpp/16-color data. Code path in `DrawSprite_*` when Attribute 0 color mode bit 13 is clear.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i13) {
                            case 0:
                                int i14 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i15 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i16 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i17 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i18 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i19 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, d0, 2048, "OBJ tiled - 256 colors", "Nintendo DS tiled OBJ using 8bpp/256-color data. Code path in `DrawSprite_*` when Attribute 0 color mode bit 13 is set.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i13) {
                            case 0:
                                int i14 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i15 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i16 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i17 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i18 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i19 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity2.E(linearLayout, d0, 4096, "OBJ bitmap", "Nintendo DS bitmap OBJ. Code path in `DrawSprite_*` when OAM Attribute 0 object mode bits 10-11 equal 3.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d0;
                        EmulatorActivity emulatorActivity3 = emulatorActivity2;
                        switch (i13) {
                            case 0:
                                int i14 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i15 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i16 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i17 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i18 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i19 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity3.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity2.M0("OBJ transform and storage type", (ScrollView) P.B, new wu1(emulatorActivity2, 18));
                return;
            case 11:
                int i13 = EmulatorActivity.Z1;
                emulatorActivity.z0(true);
                return;
            case 12:
                int i14 = EmulatorActivity.Z1;
                emulatorActivity.v0(false);
                return;
            case 13:
                int i15 = EmulatorActivity.Z1;
                emulatorActivity.z0(false);
                return;
            case 14:
                int i16 = EmulatorActivity.Z1;
                emulatorActivity.v0(true);
                return;
            case 15:
                int i17 = EmulatorActivity.Z1;
                final EmulatorActivity emulatorActivity3 = this.B;
                final nj5 d02 = emulatorActivity3.d0();
                vr4 P2 = emulatorActivity3.P();
                LinearLayout linearLayout2 = (LinearLayout) P2.A;
                emulatorActivity3.G(linearLayout2, "Special background types");
                emulatorActivity3.E(linearLayout2, d02, 64, "3D background", "Nintendo DS 3D background layer. Code: `DrawBG_3D`; Engine A BG0 placeholder/output used to composite GPU3D with the 2D BG/OBJ stack.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d02;
                        EmulatorActivity emulatorActivity32 = emulatorActivity3;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i18 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i19 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity3.M0("Special background types", (ScrollView) P2.B, new ou1(emulatorActivity3, 28));
                return;
            case 16:
                int i18 = EmulatorActivity.Z1;
                emulatorActivity.x0(false);
                return;
            case 17:
                int i19 = EmulatorActivity.Z1;
                final EmulatorActivity emulatorActivity4 = this.B;
                final nj5 d03 = emulatorActivity4.d0();
                vr4 P3 = emulatorActivity4.P();
                LinearLayout linearLayout3 = (LinearLayout) P3.A;
                emulatorActivity4.G(linearLayout3, "Tile background types");
                emulatorActivity4.E(linearLayout3, d03, 1, "Static background", "Nintendo DS static BG. Code: `DrawBG_Text`; used by BG0/BG1 and by BG2/BG3 when the active mode selects text/static layers.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d03;
                        EmulatorActivity emulatorActivity32 = emulatorActivity4;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity4.E(linearLayout3, d03, 2, "Affine background", "Nintendo DS affine BG. Code: `DrawBG_Affine`; used for BG2/BG3 in modes that select affine transform layers.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d03;
                        EmulatorActivity emulatorActivity32 = emulatorActivity4;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity4.E(linearLayout3, d03, 4, "Affine Extended background - tiled", "Nintendo DS affine extended tiled BG. Code: `DrawBG_Extended` with BGCNT bitmap bit clear; keeps the tile path with H/V flip support.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d03;
                        EmulatorActivity emulatorActivity32 = emulatorActivity4;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i20 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i21 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity4.M0("Tile background types", (ScrollView) P3.B, new wu1(emulatorActivity4, 7));
                return;
            case 18:
                int i20 = EmulatorActivity.Z1;
                emulatorActivity.x0(true);
                return;
            case 19:
                int i21 = EmulatorActivity.Z1;
                final EmulatorActivity emulatorActivity5 = this.B;
                final nj5 d04 = emulatorActivity5.d0();
                vr4 P4 = emulatorActivity5.P();
                LinearLayout linearLayout4 = (LinearLayout) P4.A;
                emulatorActivity5.G(linearLayout4, "OBJ vertical bands");
                emulatorActivity5.E(linearLayout4, d04, 65536, "OBJ upper band - Y 0..63", "Nintendo DS OBJ pixels and OBJ Window mask for the upper third of the current LCD. Code gate: `DrawSprites(line)` returns after clearing `OBJLine`/`OBJWindow` when `line < 64`.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d04;
                        EmulatorActivity emulatorActivity32 = emulatorActivity5;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity5.E(linearLayout4, d04, 131072, "OBJ middle band - Y 64..127", "Nintendo DS OBJ pixels and OBJ Window mask for the middle third of the current LCD. Code gate: `DrawSprites(line)` line range 64..127.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d04;
                        EmulatorActivity emulatorActivity32 = emulatorActivity5;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity5.E(linearLayout4, d04, 262144, "OBJ lower band - Y 128..191", "Nintendo DS OBJ pixels and OBJ Window mask for the lower third of the current LCD. Code gate: `DrawSprites(line)` line range 128..191.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d04;
                        EmulatorActivity emulatorActivity32 = emulatorActivity5;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i22 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i23 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity5.M0("OBJ vertical bands", (ScrollView) P4.B, new wu1(emulatorActivity5, 5));
                return;
            case 20:
                int i22 = EmulatorActivity.Z1;
                emulatorActivity.u0(true);
                return;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                int i23 = EmulatorActivity.Z1;
                final EmulatorActivity emulatorActivity6 = this.B;
                final nj5 d05 = emulatorActivity6.d0();
                vr4 P5 = emulatorActivity6.P();
                LinearLayout linearLayout5 = (LinearLayout) P5.A;
                emulatorActivity6.G(linearLayout5, "Bitmap background types");
                emulatorActivity6.E(linearLayout5, d05, 8, "Affine Extended background - 256 colors bitmap", "Nintendo DS affine extended 256-color bitmap BG. Code: `DrawBG_Extended` bitmap path without direct-color bit; VRAM is treated as a paletted framebuffer.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d05;
                        EmulatorActivity emulatorActivity32 = emulatorActivity6;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i222 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i232 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity6.E(linearLayout5, d05, 16, "Affine Extended background - direct color bitmap", "Nintendo DS affine extended direct-color bitmap BG. Code: `DrawBG_Extended` bitmap path with BGCNT direct-color bit; VRAM is treated as 15-bit direct color.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d05;
                        EmulatorActivity emulatorActivity32 = emulatorActivity6;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i222 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i232 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity6.E(linearLayout5, d05, 32, "Large screen background", "Nintendo DS large screen BG. Code: `DrawBG_Large`; mode 6 BG2 large framebuffer path, available only on Engine A (Main).", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d05;
                        EmulatorActivity emulatorActivity32 = emulatorActivity6;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i222 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i232 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i24 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity6.M0("Bitmap background types", (ScrollView) P5.B, new wu1(emulatorActivity6, 13));
                return;
            case 22:
                int i24 = EmulatorActivity.Z1;
                final EmulatorActivity emulatorActivity7 = this.B;
                final nj5 d06 = emulatorActivity7.d0();
                vr4 P6 = emulatorActivity7.P();
                LinearLayout linearLayout6 = (LinearLayout) P6.A;
                emulatorActivity7.G(linearLayout6, "OBJ master");
                emulatorActivity7.E(linearLayout6, d06, 128, "OBJ (Objects / Sprites)", "Nintendo DS sprites from OAM. Code: `DrawSprites`, `DrawSprite_Normal`, `DrawSprite_Rotscale` and `InterleaveSprites`; covers tiled and bitmap OBJ pixels.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d06;
                        EmulatorActivity emulatorActivity32 = emulatorActivity7;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i222 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i232 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i242 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i25 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i26 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i27 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i28 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i29 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity7.M0("OBJ master", (ScrollView) P6.B, new wu1(emulatorActivity7, 24));
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                int i25 = EmulatorActivity.Z1;
                emulatorActivity.u0(false);
                return;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                int i26 = EmulatorActivity.Z1;
                emulatorActivity.H0();
                return;
            case 25:
                int i27 = EmulatorActivity.Z1;
                emulatorActivity.C0();
                return;
            case SubAllocator.N4 /* 26 */:
                int i28 = EmulatorActivity.Z1;
                emulatorActivity.I0();
                return;
            case 27:
                int i29 = EmulatorActivity.Z1;
                final EmulatorActivity emulatorActivity8 = this.B;
                final nj5 d07 = emulatorActivity8.d0();
                vr4 P7 = emulatorActivity8.P();
                LinearLayout linearLayout7 = (LinearLayout) P7.A;
                emulatorActivity8.G(linearLayout7, "OBJ effects and masks");
                emulatorActivity8.E(linearLayout7, d07, 8192, "OBJ semi-transparent", "Nintendo DS semi-transparent OBJ. Code path in `DrawSprite_*` when OAM Attribute 0 object mode bits 10-11 equal 1.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d07;
                        EmulatorActivity emulatorActivity32 = emulatorActivity8;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i222 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i232 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i242 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i252 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i262 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i272 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i282 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i292 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity8.E(linearLayout7, d07, 16384, "OBJ Window", "Nintendo DS OBJ Window mask. Code: `DrawSprite_*<true>` fills `OBJWindow`; affects window clipping rather than visible color directly.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d07;
                        EmulatorActivity emulatorActivity32 = emulatorActivity8;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i222 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i232 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i242 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i252 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i262 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i272 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i282 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i292 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity8.E(linearLayout7, d07, 32768, "OBJ mosaic", "Nintendo DS OBJ using mosaic. Code: Attribute 0 mosaic bit 12 and `ApplySpriteMosaicX`.", new on2() { // from class: vu1
                    @Override // defpackage.on2
                    public final Object c() {
                        int i132 = r3;
                        jg7 jg7Var = jg7.a;
                        nj5 nj5Var = d07;
                        EmulatorActivity emulatorActivity32 = emulatorActivity8;
                        switch (i132) {
                            case 0:
                                int i142 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 1:
                                int i152 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 2:
                                int i162 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 3:
                                int i172 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 4:
                                int i182 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 5:
                                int i192 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 6:
                                int i202 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 7:
                                int i212 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 8:
                                int i222 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 9:
                                int i232 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 10:
                                int i242 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 11:
                                int i252 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 12:
                                int i262 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 13:
                                int i272 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 14:
                                int i282 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 15:
                                int i292 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 16:
                                int i30 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            case 17:
                                int i31 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                            default:
                                int i32 = EmulatorActivity.Z1;
                                emulatorActivity32.L(nj5Var);
                                return jg7Var;
                        }
                    }
                });
                emulatorActivity8.M0("OBJ effects and masks", (ScrollView) P7.B, new wu1(emulatorActivity8, 22));
                return;
            case 28:
                int i30 = EmulatorActivity.Z1;
                emulatorActivity.J0();
                return;
            default:
                int i31 = EmulatorActivity.Z1;
                emulatorActivity.E0();
                return;
        }
    }
}
