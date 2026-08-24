package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv1  reason: default package */
/* loaded from: classes.dex */
public final class uv1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ EmulatorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv1(EmulatorActivity emulatorActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = emulatorActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((uv1) q((r41) obj2, (w26) obj)).s(jg7Var);
                return jg7Var;
            case 1:
                ((uv1) q((r41) obj2, (t26) obj)).s(jg7Var);
                return jg7Var;
            case 2:
                ((uv1) q((r41) obj2, (t26) obj)).s(jg7Var);
                return jg7Var;
            case 3:
                ((uv1) q((r41) obj2, (b36) obj)).s(jg7Var);
                return jg7Var;
            case 4:
                ((uv1) q((r41) obj2, (Integer) obj)).s(jg7Var);
                return jg7Var;
            case 5:
                ((uv1) q((r41) obj2, (u82) obj)).s(jg7Var);
                return jg7Var;
            case 6:
                ((uv1) q((r41) obj2, (x77) obj)).s(jg7Var);
                return jg7Var;
            default:
                ((uv1) q((r41) obj2, (az1) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        EmulatorActivity emulatorActivity = this.Z;
        switch (i) {
            case 0:
                uv1 uv1Var = new uv1(emulatorActivity, r41Var, 0);
                uv1Var.Y = obj;
                return uv1Var;
            case 1:
                uv1 uv1Var2 = new uv1(emulatorActivity, r41Var, 1);
                uv1Var2.Y = obj;
                return uv1Var2;
            case 2:
                uv1 uv1Var3 = new uv1(emulatorActivity, r41Var, 2);
                uv1Var3.Y = obj;
                return uv1Var3;
            case 3:
                uv1 uv1Var4 = new uv1(emulatorActivity, r41Var, 3);
                uv1Var4.Y = obj;
                return uv1Var4;
            case 4:
                uv1 uv1Var5 = new uv1(emulatorActivity, r41Var, 4);
                uv1Var5.Y = obj;
                return uv1Var5;
            case 5:
                uv1 uv1Var6 = new uv1(emulatorActivity, r41Var, 5);
                uv1Var6.Y = obj;
                return uv1Var6;
            case 6:
                uv1 uv1Var7 = new uv1(emulatorActivity, r41Var, 6);
                uv1Var7.Y = obj;
                return uv1Var7;
            default:
                uv1 uv1Var8 = new uv1(emulatorActivity, r41Var, 7);
                uv1Var8.Y = obj;
                return uv1Var8;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        RuntimeLayoutView runtimeLayoutView;
        VideoRenderer e;
        EmulatorActivity.a aVar;
        oq0 pq0Var;
        vr4 vr4Var;
        String str;
        int i;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean z;
        int i2;
        switch (this.X) {
            case 0:
                w26 w26Var = (w26) this.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                final EmulatorActivity emulatorActivity = this.Z;
                rv1 rv1Var = emulatorActivity.m1;
                if (w26Var != null) {
                    ff7 ff7Var = w26Var.e;
                    emulatorActivity.L0 = null;
                    emulatorActivity.M0 = null;
                    vy7.r0(emulatorActivity, w26Var.d);
                    s8 s8Var = emulatorActivity.B0;
                    if (s8Var != null) {
                        RuntimeLayoutView runtimeLayoutView2 = s8Var.m;
                        sn3 sn3Var = sn3.MAIN_SCREEN;
                        sn3Var.getClass();
                        runtimeLayoutView2.f0 = w26Var;
                        runtimeLayoutView2.e(ff7Var, sn3Var);
                        runtimeLayoutView2.i();
                        runtimeLayoutView2.k();
                        nj3 nj3Var = nj3.BUTTON_TOGGLE_SOFT_INPUT;
                        runtimeLayoutView2.h(nj3Var, runtimeLayoutView2.i0);
                        nj3 nj3Var2 = nj3.BUTTON_FAST_FORWARD_TOGGLE;
                        runtimeLayoutView2.h(nj3Var2, rv1Var.A);
                        nj3 nj3Var3 = nj3.BUTTON_MICROPHONE_TOGGLE;
                        runtimeLayoutView2.h(nj3Var3, rv1Var.L);
                        c92 c92Var = emulatorActivity.K0;
                        if (c92Var != null) {
                            RuntimeLayoutView runtimeLayoutView3 = c92Var.L;
                            sn3 sn3Var2 = sn3.SECONDARY_SCREEN;
                            runtimeLayoutView3.getClass();
                            sn3Var2.getClass();
                            runtimeLayoutView3.f0 = w26Var;
                            runtimeLayoutView3.e(ff7Var, sn3Var2);
                            runtimeLayoutView3.i();
                            runtimeLayoutView3.k();
                            runtimeLayoutView3.h(nj3Var, runtimeLayoutView3.i0);
                            c92Var.b();
                            runtimeLayoutView3.h(nj3Var2, rv1Var.A);
                            runtimeLayoutView3.h(nj3Var3, rv1Var.L);
                        }
                        final boolean z2 = emulatorActivity.getSharedPreferences(v15.b(emulatorActivity), 0).getBoolean("video_console_skin_enabled", false);
                        final int i3 = (int) (emulatorActivity.getResources().getDisplayMetrics().density * 14.0f);
                        s8 s8Var2 = emulatorActivity.B0;
                        if (s8Var2 != null) {
                            s8Var2.m.g(i3, z2);
                            Handler handler = emulatorActivity.N0;
                            if (handler != null) {
                                handler.post(new Runnable() { // from class: gv1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i4 = EmulatorActivity.Z1;
                                        EmulatorActivity emulatorActivity2 = EmulatorActivity.this;
                                        emulatorActivity2.K((jq1) emulatorActivity2.W().Y0.A.getValue());
                                        emulatorActivity2.U0();
                                        c92 c92Var2 = emulatorActivity2.K0;
                                        if (c92Var2 != null) {
                                            c92Var2.b();
                                        }
                                        s8 s8Var3 = emulatorActivity2.B0;
                                        if (s8Var3 != null) {
                                            s8Var3.m.g(i3, z2);
                                            emulatorActivity2.o0();
                                            return;
                                        }
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                });
                            } else {
                                nb3.a0("handler");
                                throw null;
                            }
                        } else {
                            nb3.a0("binding");
                            throw null;
                        }
                    } else {
                        nb3.a0("binding");
                        throw null;
                    }
                } else {
                    s8 s8Var3 = emulatorActivity.B0;
                    if (s8Var3 != null) {
                        s8Var3.m.b();
                        c92 c92Var2 = emulatorActivity.K0;
                        if (c92Var2 != null && (runtimeLayoutView = c92Var2.L) != null) {
                            runtimeLayoutView.b();
                        }
                    } else {
                        nb3.a0("binding");
                        throw null;
                    }
                }
                return jg7.a;
            case 1:
                t26 t26Var = (t26) this.Y;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                EmulatorActivity emulatorActivity2 = this.Z;
                emulatorActivity2.d1 = t26Var;
                c91 c91Var = emulatorActivity2.U0;
                if (c91Var != null) {
                    t26Var.getClass();
                    synchronized (c91Var.o) {
                        c91Var.p = t26Var;
                        c91Var.q = true;
                        c91Var.e = true;
                        c91Var.f = false;
                    }
                    emulatorActivity2.U0();
                    return jg7.a;
                }
                nb3.a0("mainScreenRenderer");
                throw null;
            case 2:
                t26 t26Var2 = (t26) this.Y;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                c92 c92Var3 = this.Z.K0;
                if (c92Var3 != null) {
                    t26Var2.getClass();
                    c92Var3.d0 = t26Var2;
                    c91 c91Var2 = c92Var3.Y;
                    c91Var2.getClass();
                    synchronized (c91Var2.o) {
                        c91Var2.p = t26Var2;
                        c91Var2.q = true;
                        c91Var2.e = true;
                        c91Var2.f = false;
                    }
                    c92Var3.b();
                }
                return jg7.a;
            case 3:
                b36 b36Var = (b36) this.Y;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                EmulatorActivity emulatorActivity3 = this.Z;
                emulatorActivity3.X0 = b36Var;
                if (b36Var == null || (e = b36Var.a) == null) {
                    e = ((ng6) emulatorActivity3.W().c).e();
                }
                ku3 ku3Var = emulatorActivity3.A;
                if (!emulatorActivity3.i1) {
                    if (e == VideoRenderer.VULKAN) {
                        aVar = EmulatorActivity.a.VULKAN;
                    } else {
                        aVar = EmulatorActivity.a.OPEN_GL;
                    }
                    if (aVar != emulatorActivity3.e1) {
                        boolean isAtLeast = ku3Var.d.isAtLeast(tt3.RESUMED);
                        oq0 oq0Var = emulatorActivity3.T0;
                        if (oq0Var != null) {
                            oq0Var.a();
                            tt3 tt3Var = ku3Var.d;
                            tt3 tt3Var2 = tt3.STARTED;
                            if (tt3Var.isAtLeast(tt3Var2)) {
                                om2 om2Var = emulatorActivity3.S0;
                                if (om2Var != null) {
                                    s8 s8Var4 = emulatorActivity3.B0;
                                    if (s8Var4 != null) {
                                        om2Var.d(s8Var4.h);
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                } else {
                                    nb3.a0("frameRenderCoordinator");
                                    throw null;
                                }
                            }
                            c92 c92Var4 = emulatorActivity3.K0;
                            if (c92Var4 != null) {
                                c92Var4.dismiss();
                            }
                            emulatorActivity3.K0 = null;
                            om2 om2Var2 = emulatorActivity3.S0;
                            if (om2Var2 != null) {
                                om2Var2.stop();
                                emulatorActivity3.e1 = aVar;
                                om2 O = emulatorActivity3.O(aVar);
                                emulatorActivity3.S0 = O;
                                emulatorActivity3.Z0 = null;
                                emulatorActivity3.j1 = false;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    pq0Var = new qq0(O);
                                } else {
                                    pq0Var = new pq0(O);
                                }
                                emulatorActivity3.T0 = pq0Var;
                                if (ku3Var.d.isAtLeast(tt3Var2)) {
                                    om2 om2Var3 = emulatorActivity3.S0;
                                    if (om2Var3 != null) {
                                        s8 s8Var5 = emulatorActivity3.B0;
                                        if (s8Var5 != null) {
                                            om2Var3.c(s8Var5.h);
                                            emulatorActivity3.R0();
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("frameRenderCoordinator");
                                        throw null;
                                    }
                                }
                                emulatorActivity3.U0();
                                emulatorActivity3.o0();
                                if (isAtLeast) {
                                    oq0 oq0Var2 = emulatorActivity3.T0;
                                    if (oq0Var2 != null) {
                                        oq0Var2.b();
                                    } else {
                                        nb3.a0("choreographerFrameRenderer");
                                        throw null;
                                    }
                                }
                            } else {
                                nb3.a0("frameRenderCoordinator");
                                throw null;
                            }
                        } else {
                            nb3.a0("choreographerFrameRenderer");
                            throw null;
                        }
                    }
                }
                emulatorActivity3.S0(b36Var);
                c91 c91Var3 = emulatorActivity3.U0;
                if (c91Var3 != null) {
                    synchronized (c91Var3.b) {
                        c91Var3.c = b36Var;
                        c91Var3.d = true;
                    }
                    c92 c92Var5 = emulatorActivity3.K0;
                    if (c92Var5 != null) {
                        c92Var5.e0 = b36Var;
                        fx1 fx1Var = c92Var5.Z.f0;
                        if (fx1Var != null) {
                            c91 c91Var4 = (c91) fx1Var;
                            synchronized (c91Var4.b) {
                                c91Var4.c = b36Var;
                                c91Var4.d = true;
                            }
                        }
                        c92Var5.b();
                    }
                    emulatorActivity3.U0();
                    emulatorActivity3.o0();
                    return jg7.a;
                }
                nb3.a0("mainScreenRenderer");
                throw null;
            case 4:
                Integer num = (Integer) this.Y;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                EmulatorActivity emulatorActivity4 = this.Z;
                s8 s8Var6 = emulatorActivity4.B0;
                if (num == null) {
                    if (s8Var6 != null) {
                        s8Var6.i.setText((CharSequence) null);
                        s8 s8Var7 = emulatorActivity4.B0;
                        if (s8Var7 != null) {
                            s8Var7.l.setVisibility(8);
                        } else {
                            nb3.a0("binding");
                            throw null;
                        }
                    } else {
                        nb3.a0("binding");
                        throw null;
                    }
                } else if (s8Var6 != null) {
                    s8Var6.i.setText(emulatorActivity4.getString(R.string.info_fps, num));
                    emulatorActivity4.q0();
                } else {
                    nb3.a0("binding");
                    throw null;
                }
                return jg7.a;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                EmulatorActivity emulatorActivity5 = this.Z;
                emulatorActivity5.l1 = (u82) this.Y;
                emulatorActivity5.R0();
                return jg7.a;
            case 6:
                EmulatorActivity emulatorActivity6 = this.Z;
                x77 x77Var = (x77) this.Y;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (nb3.k(x77Var, u67.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.error_load_gba_rom), new Integer(0));
                } else if (nb3.k(x77Var, i77.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.saved), new Integer(0));
                } else if (nb3.k(x77Var, h77.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.loaded), new Integer(0));
                } else if (nb3.k(x77Var, t77.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.rewind_not_enabled), new Integer(0));
                } else if (nb3.k(x77Var, s77.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.rewind_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (nb3.k(x77Var, u77.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.failed_load_state), new Integer(0));
                } else if (nb3.k(x77Var, z67.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.invalid_auto_load_state), new Integer(1));
                } else if (nb3.k(x77Var, v77.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.failed_save_state), new Integer(0));
                } else if (nb3.k(x77Var, w77.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.cant_load_empty_slot), new Integer(0));
                } else if (nb3.k(x77Var, p67.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.load_states_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (nb3.k(x77Var, t67.a)) {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.cheats_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (!nb3.k(x77Var, q67.a) && !nb3.k(x77Var, r67.a)) {
                    if (nb3.k(x77Var, s67.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.retro_achievements_relaunch_to_apply_settings), new Integer(1));
                    } else if (nb3.k(x77Var, v67.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.emulator_stop_gba_mode_unsupported), new Integer(0));
                    } else if (nb3.k(x77Var, y67.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.emulator_stop_internal_error), new Integer(1));
                    } else if (nb3.k(x77Var, c77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.offline_ra_ledger_tampered_toast), new Integer(1));
                    } else if (nb3.k(x77Var, e77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.offline_ra_sync_failed_toast), new Integer(1));
                    } else if (nb3.k(x77Var, g77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.ra_pending_state_verification_failed), new Integer(1));
                    } else if (nb3.k(x77Var, n77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.retroachievements_account_changed_in_game), new Integer(1));
                    } else if (nb3.k(x77Var, o77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.retroachievements_logout_failed), new Integer(1));
                    } else if (nb3.k(x77Var, j77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.ra_offline_proxy_not_active), new Integer(1));
                    } else if (nb3.k(x77Var, r77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.ra_offline_proxy_restart_required), new Integer(1));
                    } else if (x77Var instanceof w67) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.offline_ra_hardcore_unsynced_warning_toast, new Integer(((w67) x77Var).a)), new Integer(1));
                    } else if (x77Var instanceof x67) {
                        x67 x67Var = (x67) x77Var;
                        int i4 = x67Var.a;
                        int i5 = x67Var.b;
                        if (i5 == 0) {
                            string4 = emulatorActivity6.getString(R.string.offline_ra_hardcore_sync_result_all, new Integer(i4));
                        } else if (i4 == 0) {
                            string4 = emulatorActivity6.getString(R.string.offline_ra_hardcore_sync_result_none, new Integer(i5));
                        } else {
                            string4 = emulatorActivity6.getString(R.string.offline_ra_hardcore_sync_result_partial, new Integer(i4), new Integer(i5));
                        }
                        string4.getClass();
                        vr4Var = new vr4(string4, new Integer(1));
                    } else if (x77Var instanceof p77) {
                        p77 p77Var = (p77) x77Var;
                        int i6 = vv1.a[p77Var.a.ordinal()];
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 == 3) {
                                    if (p77Var.c) {
                                        string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore_offline_hardcore_disabled);
                                    } else if (p77Var.b) {
                                        string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore_offline_no_internet_start);
                                    } else {
                                        string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore_offline);
                                    }
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                string3 = emulatorActivity6.getString(R.string.offline_ra_mode_hardcore);
                            }
                        } else {
                            string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore);
                        }
                        string3.getClass();
                        vr4Var = new vr4(string3, new Integer(1));
                    } else if (x77Var instanceof f77) {
                        f77 f77Var = (f77) x77Var;
                        Long l = f77Var.b;
                        int i7 = f77Var.a;
                        int i8 = EmulatorActivity.Z1;
                        String T = emulatorActivity6.T(l);
                        if (l != null && l.longValue() <= 0) {
                            string2 = emulatorActivity6.getString(R.string.offline_ra_pending_softcore_expired_notice, new Integer(i7));
                        } else if (T != null) {
                            string2 = emulatorActivity6.getString(R.string.offline_ra_pending_softcore_notice_with_expiration, new Integer(i7), T);
                        } else {
                            string2 = emulatorActivity6.getString(R.string.offline_ra_pending_softcore_notice, new Integer(i7));
                        }
                        string2.getClass();
                        vr4Var = new vr4(string2, new Integer(1));
                    } else if (x77Var instanceof a77) {
                        a77 a77Var = (a77) x77Var;
                        String str2 = a77Var.a;
                        b77 b77Var = a77Var.b;
                        int i9 = vv1.b[b77Var.ordinal()];
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 == 4) {
                                        i = R.string.offline_ra_sync_skipped_server_rejected_toast;
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    i = R.string.offline_ra_sync_skipped_cache_mismatch_toast;
                                }
                            } else {
                                i = R.string.offline_ra_sync_skipped_definition_changed_toast;
                            }
                        } else {
                            i = R.string.offline_ra_sync_skipped_missing_toast;
                        }
                        if (b77Var == b77.SERVER_REJECTED) {
                            String str3 = a77Var.c;
                            if (str3 == null) {
                                str3 = emulatorActivity6.getString(R.string.offline_ra_sync_skipped_server_rejected_unknown_reason);
                                str3.getClass();
                            }
                            string = emulatorActivity6.getString(i, str2, str3);
                        } else {
                            string = emulatorActivity6.getString(i, str2);
                        }
                        string.getClass();
                        vr4Var = new vr4(string, new Integer(1));
                    } else if (x77Var instanceof d77) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.offline_ra_sync_skipped_summary_toast, new Integer(((d77) x77Var).a)), new Integer(1));
                    } else if (x77Var instanceof m77) {
                        int i10 = vv1.c[((m77) x77Var).a.ordinal()];
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 == 4) {
                                        str = "Compute";
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    str = "Vulkan";
                                }
                            } else {
                                str = "OpenGL";
                            }
                        } else {
                            str = "Software";
                        }
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.renderer_init_failed_message, str), new Integer(1));
                    } else if (x77Var instanceof l77) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.renderer_debug_capture_logged, ((l77) x77Var).a), new Integer(1));
                    } else if (nb3.k(x77Var, k77.a)) {
                        vr4Var = new vr4(emulatorActivity6.getString(R.string.renderer_debug_capture_failed), new Integer(1));
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    vr4Var = new vr4(emulatorActivity6.getString(R.string.save_states_not_supported), new Integer(1));
                }
                Object obj2 = vr4Var.A;
                obj2.getClass();
                Toast.makeText(emulatorActivity6, (String) obj2, ((Number) vr4Var.B).intValue()).show();
                return jg7.a;
            default:
                final EmulatorActivity emulatorActivity7 = this.Z;
                bt btVar = emulatorActivity7.V1;
                az1 az1Var = (az1) this.Y;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (nb3.k(az1Var, jy1.a)) {
                    if (!emulatorActivity7.i1) {
                        emulatorActivity7.i1 = true;
                        emulatorActivity7.g0();
                        emulatorActivity7.finish();
                    }
                } else if (az1Var instanceof ly1) {
                    Intent intent = new Intent(emulatorActivity7, CheatsActivity.class);
                    lx5 lx5Var = ((ly1) az1Var).a;
                    intent.putExtra("key_rom_info", new mx5(lx5Var.a, lx5Var.b, lx5Var.c, lx5Var.d, lx5Var.e));
                    emulatorActivity7.t1.a(intent);
                } else if (az1Var instanceof my1) {
                    Intent intent2 = new Intent(emulatorActivity7, SettingsActivity.class);
                    intent2.putExtra("in_game", true);
                    my1 my1Var = (my1) az1Var;
                    a43 a43Var = my1Var.a;
                    intent2.putExtra("lock_input_mapping", a43Var.a);
                    intent2.putExtra("lock_input_layout", a43Var.b);
                    intent2.putExtra("lock_video_filtering", a43Var.c);
                    intent2.putExtra("ra_runtime_identity_locked", my1Var.b);
                    intent2.putExtra("ra_in_game_logout_supported", my1Var.c);
                    emulatorActivity7.q1.a(intent2);
                } else if (az1Var instanceof sy1) {
                    mu4 mu4Var = ((sy1) az1Var).a;
                    emulatorActivity7.T1 = mu4Var;
                    emulatorActivity7.j0(0);
                    btVar.z(ex1.PAUSE_MENU);
                    emulatorActivity7.F1.setValue(mu4Var);
                } else if (az1Var instanceof wy1) {
                    RewindWindow rewindWindow = ((wy1) az1Var).a;
                    btVar.z(ex1.REWIND_WINDOW);
                    emulatorActivity7.L1.setValue(rewindWindow);
                    emulatorActivity7.j0(0);
                } else if (az1Var instanceof yy1) {
                    yy1 yy1Var = (yy1) az1Var;
                    if (yy1Var.b == xy1.SAVING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    List list = yy1Var.a;
                    g00 g00Var = new g00(z, emulatorActivity7, 2);
                    btVar.z(ex1.SAVE_STATES_DIALOG);
                    emulatorActivity7.N1.setValue(new pv1(list, z, g00Var));
                    emulatorActivity7.j0(0);
                    if (z) {
                        i2 = R.string.save_state;
                    } else {
                        i2 = R.string.load_state;
                    }
                    String string6 = emulatorActivity7.getString(i2);
                    string6.getClass();
                    c92 c92Var6 = emulatorActivity7.K0;
                    if (c92Var6 != null) {
                        c92Var6.a(new zv0(-913739810, true, new x3(string6, list, emulatorActivity7, 14)));
                    }
                } else if (nb3.k(az1Var, oy1.a)) {
                    btVar.z(ex1.ACHIEVEMENTS_DIALOG);
                    emulatorActivity7.C1.setValue(Boolean.TRUE);
                } else if (nb3.k(az1Var, ty1.a)) {
                    btVar.z(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                    emulatorActivity7.D1.setValue(Boolean.TRUE);
                } else if (nb3.k(az1Var, py1.a)) {
                    btVar.z(ex1.PRESETS_DIALOG);
                    emulatorActivity7.E1.setValue(Boolean.TRUE);
                    emulatorActivity7.j0(0);
                } else if (nb3.k(az1Var, vy1.a)) {
                    int i11 = EmulatorActivity.Z1;
                    emulatorActivity7.L0();
                } else if (az1Var instanceof zy1) {
                    zy1 zy1Var = (zy1) az1Var;
                    final pq5 pq5Var = zy1Var.a;
                    VideoRenderer videoRenderer = zy1Var.b;
                    final z33 z33Var = zy1Var.c;
                    mm6 mm6Var = emulatorActivity7.P1;
                    kw3 I = hf.I();
                    String string7 = emulatorActivity7.getString(R.string.key_mapping);
                    string7.getClass();
                    I.add(new vr4(EmulatorActivity.n0(string7, z33Var.a), new on2() { // from class: iv1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v2, types: [wz5, android.os.Parcelable, java.lang.Object] */
                        @Override // defpackage.on2
                        public final Object c() {
                            String str4;
                            int i12 = r3;
                            jg7 jg7Var = jg7.a;
                            pq5 pq5Var2 = pq5Var;
                            EmulatorActivity emulatorActivity8 = emulatorActivity7;
                            switch (i12) {
                                case 0:
                                    i9 i9Var = emulatorActivity8.r1;
                                    pq5Var2.getClass();
                                    Intent intent3 = new Intent(emulatorActivity8, InputSetupActivity.class);
                                    ?? obj3 = new Object();
                                    obj3.A = pq5Var2;
                                    intent3.putExtra("rom", (Parcelable) obj3);
                                    i9Var.a(intent3);
                                    return jg7Var;
                                case 1:
                                    int i13 = EmulatorActivity.Z1;
                                    Intent intent4 = new Intent(emulatorActivity8, LayoutSelectorActivity.class);
                                    UUID uuid = pq5Var2.f.c;
                                    if (uuid != null) {
                                        str4 = uuid.toString();
                                    } else {
                                        str4 = null;
                                    }
                                    intent4.putExtra("selected_layout_id", str4);
                                    emulatorActivity8.s1.a(intent4);
                                    return jg7Var;
                                default:
                                    int i14 = EmulatorActivity.Z1;
                                    a36 a36Var = pq5Var2.f.b;
                                    String[] stringArray = emulatorActivity8.getResources().getStringArray(R.array.game_runtime_mic_source_options);
                                    stringArray.getClass();
                                    List<a36> k1 = gt0.k1(a36.getEntries());
                                    ArrayList arrayList = new ArrayList(ht0.v0(k1, 10));
                                    for (a36 a36Var2 : k1) {
                                        arrayList.add(stringArray[a36Var2.ordinal()]);
                                    }
                                    int i15 = 0;
                                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                    int indexOf = k1.indexOf(a36Var);
                                    if (indexOf >= 0) {
                                        i15 = indexOf;
                                    }
                                    String string8 = emulatorActivity8.getString(R.string.microphone_source);
                                    string8.getClass();
                                    emulatorActivity8.c0(new mv1(i15, new y(26, emulatorActivity8, k1), string8, fv.T0(strArr)));
                                    return jg7Var;
                            }
                        }
                    }));
                    String string8 = emulatorActivity7.getString(R.string.controller_layout);
                    string8.getClass();
                    I.add(new vr4(EmulatorActivity.n0(string8, z33Var.b), new on2() { // from class: iv1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v2, types: [wz5, android.os.Parcelable, java.lang.Object] */
                        @Override // defpackage.on2
                        public final Object c() {
                            String str4;
                            int i12 = r3;
                            jg7 jg7Var = jg7.a;
                            pq5 pq5Var2 = pq5Var;
                            EmulatorActivity emulatorActivity8 = emulatorActivity7;
                            switch (i12) {
                                case 0:
                                    i9 i9Var = emulatorActivity8.r1;
                                    pq5Var2.getClass();
                                    Intent intent3 = new Intent(emulatorActivity8, InputSetupActivity.class);
                                    ?? obj3 = new Object();
                                    obj3.A = pq5Var2;
                                    intent3.putExtra("rom", (Parcelable) obj3);
                                    i9Var.a(intent3);
                                    return jg7Var;
                                case 1:
                                    int i13 = EmulatorActivity.Z1;
                                    Intent intent4 = new Intent(emulatorActivity8, LayoutSelectorActivity.class);
                                    UUID uuid = pq5Var2.f.c;
                                    if (uuid != null) {
                                        str4 = uuid.toString();
                                    } else {
                                        str4 = null;
                                    }
                                    intent4.putExtra("selected_layout_id", str4);
                                    emulatorActivity8.s1.a(intent4);
                                    return jg7Var;
                                default:
                                    int i14 = EmulatorActivity.Z1;
                                    a36 a36Var = pq5Var2.f.b;
                                    String[] stringArray = emulatorActivity8.getResources().getStringArray(R.array.game_runtime_mic_source_options);
                                    stringArray.getClass();
                                    List<a36> k1 = gt0.k1(a36.getEntries());
                                    ArrayList arrayList = new ArrayList(ht0.v0(k1, 10));
                                    for (a36 a36Var2 : k1) {
                                        arrayList.add(stringArray[a36Var2.ordinal()]);
                                    }
                                    int i15 = 0;
                                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                    int indexOf = k1.indexOf(a36Var);
                                    if (indexOf >= 0) {
                                        i15 = indexOf;
                                    }
                                    String string82 = emulatorActivity8.getString(R.string.microphone_source);
                                    string82.getClass();
                                    emulatorActivity8.c0(new mv1(i15, new y(26, emulatorActivity8, k1), string82, fv.T0(strArr)));
                                    return jg7Var;
                            }
                        }
                    }));
                    String string9 = emulatorActivity7.getString(R.string.dual_screen_presets_settings_title);
                    string9.getClass();
                    I.add(new vr4(EmulatorActivity.n0(string9, z33Var.i), new bv1(emulatorActivity7, 19)));
                    String string10 = emulatorActivity7.getString(R.string.filter);
                    string10.getClass();
                    I.add(new vr4(EmulatorActivity.n0(string10, z33Var.c), new hf0(emulatorActivity7, videoRenderer, pq5Var, z33Var, 2)));
                    if (z33Var.d) {
                        String string11 = emulatorActivity7.getString(R.string.video_retroarch_shader_preset_title);
                        string11.getClass();
                        I.add(new vr4(EmulatorActivity.n0(string11, z33Var.e), new on2() { // from class: jv1
                            @Override // defpackage.on2
                            public final Object c() {
                                int i12 = r4;
                                jg7 jg7Var = jg7.a;
                                pq5 pq5Var2 = pq5Var;
                                z33 z33Var2 = z33Var;
                                EmulatorActivity emulatorActivity8 = emulatorActivity7;
                                switch (i12) {
                                    case 0:
                                        int i13 = EmulatorActivity.Z1;
                                        emulatorActivity8.N0(R.string.video_retroarch_shader_preset_title, z33Var2.g, pq5Var2.f.m, new a0(1, emulatorActivity8.W(), sz1.class, "onRunningRomRetroArchPresetPathSelected", "onRunningRomRetroArchPresetPathSelected(Ljava/lang/String;)V", 0, 0, 7));
                                        return jg7Var;
                                    default:
                                        int i14 = EmulatorActivity.Z1;
                                        emulatorActivity8.N0(R.string.video_retroarch_shader_parameters_title, z33Var2.g, pq5Var2.f.n, new a0(1, emulatorActivity8.W(), sz1.class, "onRunningRomRetroArchParametersSelected", "onRunningRomRetroArchParametersSelected(Ljava/lang/String;)V", 0, 0, 6));
                                        return jg7Var;
                                }
                            }
                        }));
                        String string12 = emulatorActivity7.getString(R.string.video_retroarch_shader_parameters_title);
                        string12.getClass();
                        I.add(new vr4(EmulatorActivity.n0(string12, z33Var.f), new on2() { // from class: jv1
                            @Override // defpackage.on2
                            public final Object c() {
                                int i12 = r4;
                                jg7 jg7Var = jg7.a;
                                pq5 pq5Var2 = pq5Var;
                                z33 z33Var2 = z33Var;
                                EmulatorActivity emulatorActivity8 = emulatorActivity7;
                                switch (i12) {
                                    case 0:
                                        int i13 = EmulatorActivity.Z1;
                                        emulatorActivity8.N0(R.string.video_retroarch_shader_preset_title, z33Var2.g, pq5Var2.f.m, new a0(1, emulatorActivity8.W(), sz1.class, "onRunningRomRetroArchPresetPathSelected", "onRunningRomRetroArchPresetPathSelected(Ljava/lang/String;)V", 0, 0, 7));
                                        return jg7Var;
                                    default:
                                        int i14 = EmulatorActivity.Z1;
                                        emulatorActivity8.N0(R.string.video_retroarch_shader_parameters_title, z33Var2.g, pq5Var2.f.n, new a0(1, emulatorActivity8.W(), sz1.class, "onRunningRomRetroArchParametersSelected", "onRunningRomRetroArchParametersSelected(Ljava/lang/String;)V", 0, 0, 6));
                                        return jg7Var;
                                }
                            }
                        }));
                    }
                    String string13 = emulatorActivity7.getString(R.string.microphone_source);
                    string13.getClass();
                    I.add(new vr4(EmulatorActivity.n0(string13, z33Var.h), new on2() { // from class: iv1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v2, types: [wz5, android.os.Parcelable, java.lang.Object] */
                        @Override // defpackage.on2
                        public final Object c() {
                            String str4;
                            int i12 = r3;
                            jg7 jg7Var = jg7.a;
                            pq5 pq5Var2 = pq5Var;
                            EmulatorActivity emulatorActivity8 = emulatorActivity7;
                            switch (i12) {
                                case 0:
                                    i9 i9Var = emulatorActivity8.r1;
                                    pq5Var2.getClass();
                                    Intent intent3 = new Intent(emulatorActivity8, InputSetupActivity.class);
                                    ?? obj3 = new Object();
                                    obj3.A = pq5Var2;
                                    intent3.putExtra("rom", (Parcelable) obj3);
                                    i9Var.a(intent3);
                                    return jg7Var;
                                case 1:
                                    int i13 = EmulatorActivity.Z1;
                                    Intent intent4 = new Intent(emulatorActivity8, LayoutSelectorActivity.class);
                                    UUID uuid = pq5Var2.f.c;
                                    if (uuid != null) {
                                        str4 = uuid.toString();
                                    } else {
                                        str4 = null;
                                    }
                                    intent4.putExtra("selected_layout_id", str4);
                                    emulatorActivity8.s1.a(intent4);
                                    return jg7Var;
                                default:
                                    int i14 = EmulatorActivity.Z1;
                                    a36 a36Var = pq5Var2.f.b;
                                    String[] stringArray = emulatorActivity8.getResources().getStringArray(R.array.game_runtime_mic_source_options);
                                    stringArray.getClass();
                                    List<a36> k1 = gt0.k1(a36.getEntries());
                                    ArrayList arrayList = new ArrayList(ht0.v0(k1, 10));
                                    for (a36 a36Var2 : k1) {
                                        arrayList.add(stringArray[a36Var2.ordinal()]);
                                    }
                                    int i15 = 0;
                                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                    int indexOf = k1.indexOf(a36Var);
                                    if (indexOf >= 0) {
                                        i15 = indexOf;
                                    }
                                    String string82 = emulatorActivity8.getString(R.string.microphone_source);
                                    string82.getClass();
                                    emulatorActivity8.c0(new mv1(i15, new y(26, emulatorActivity8, k1), string82, fv.T0(strArr)));
                                    return jg7Var;
                            }
                        }
                    }));
                    kw3 A = hf.A(I);
                    if (A.isEmpty()) {
                        emulatorActivity7.i0();
                    } else {
                        String string14 = emulatorActivity7.getString(R.string.rom_settings);
                        string14.getClass();
                        nv1 nv1Var = new nv1(string14, A);
                        ov1 ov1Var = (ov1) gt0.R0(mm6Var);
                        if ((ov1Var instanceof nv1) && ((nv1) ov1Var).a.equals(string14)) {
                            mm6Var.set(mm6Var.size() - 1, nv1Var);
                        } else {
                            emulatorActivity7.c0(nv1Var);
                        }
                    }
                } else if (nb3.k(az1Var, uy1.a)) {
                    int i12 = EmulatorActivity.Z1;
                    if (emulatorActivity7.Y()) {
                        emulatorActivity7.y0();
                    }
                } else if (az1Var instanceof qy1) {
                    qy1 qy1Var = (qy1) az1Var;
                    int i13 = qy1Var.a;
                    Long l2 = qy1Var.b;
                    int i14 = EmulatorActivity.Z1;
                    String T2 = emulatorActivity7.T(l2);
                    if (T2 != null) {
                        string5 = emulatorActivity7.getString(R.string.offline_ra_pending_message_with_expiration, Integer.valueOf(i13), T2);
                    } else {
                        string5 = emulatorActivity7.getString(R.string.offline_ra_pending_message, Integer.valueOf(i13));
                    }
                    string5.getClass();
                    ac acVar = emulatorActivity7.w1;
                    if (acVar != null) {
                        acVar.dismiss();
                    }
                    zb zbVar = new zb(emulatorActivity7);
                    String string15 = emulatorActivity7.getString(R.string.offline_ra_pending_title);
                    wb wbVar = (wb) zbVar.L;
                    wbVar.d = string15;
                    wbVar.f = string5;
                    wbVar.m = false;
                    zbVar.y(R.string.offline_ra_sync_now, new fu1(emulatorActivity7, 0));
                    zbVar.x(R.string.offline_ra_continue_offline, new fu1(emulatorActivity7, 1));
                    emulatorActivity7.w1 = zbVar.B();
                } else if (az1Var instanceof ry1) {
                    int i15 = ((ry1) az1Var).a;
                    ac acVar2 = emulatorActivity7.x1;
                    if (acVar2 != null) {
                        acVar2.dismiss();
                    }
                    zb zbVar2 = new zb(emulatorActivity7);
                    wb wbVar2 = (wb) zbVar2.L;
                    wbVar2.d = emulatorActivity7.getString(R.string.offline_ra_syncing_title);
                    wbVar2.f = emulatorActivity7.getString(R.string.offline_ra_syncing_message, Integer.valueOf(i15));
                    wbVar2.m = false;
                    ac l3 = zbVar2.l();
                    emulatorActivity7.x1 = l3;
                    l3.show();
                } else if (nb3.k(az1Var, ky1.a)) {
                    ac acVar3 = emulatorActivity7.x1;
                    if (acVar3 != null) {
                        acVar3.dismiss();
                    }
                    emulatorActivity7.x1 = null;
                } else {
                    i.d();
                    return null;
                }
                return jg7.a;
        }
    }
}
