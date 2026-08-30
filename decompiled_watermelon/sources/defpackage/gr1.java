package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gr1  reason: default package */
/* loaded from: classes.dex */
public final class gr1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ EmulatorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr1(EmulatorActivity emulatorActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = emulatorActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((gr1) t((j11) obj2, (es5) obj)).v(o27Var);
                return o27Var;
            case 1:
                ((gr1) t((j11) obj2, (bs5) obj)).v(o27Var);
                return o27Var;
            case 2:
                ((gr1) t((j11) obj2, (bs5) obj)).v(o27Var);
                return o27Var;
            case 3:
                ((gr1) t((j11) obj2, (js5) obj)).v(o27Var);
                return o27Var;
            case 4:
                ((gr1) t((j11) obj2, (Integer) obj)).v(o27Var);
                return o27Var;
            case 5:
                ((gr1) t((j11) obj2, (c42) obj)).v(o27Var);
                return o27Var;
            case ig7.b /* 6 */:
                ((gr1) t((j11) obj2, (gv6) obj)).v(o27Var);
                return o27Var;
            default:
                ((gr1) t((j11) obj2, (pu1) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        EmulatorActivity emulatorActivity = this.Z;
        switch (i) {
            case 0:
                gr1 gr1Var = new gr1(emulatorActivity, j11Var, 0);
                gr1Var.Y = obj;
                return gr1Var;
            case 1:
                gr1 gr1Var2 = new gr1(emulatorActivity, j11Var, 1);
                gr1Var2.Y = obj;
                return gr1Var2;
            case 2:
                gr1 gr1Var3 = new gr1(emulatorActivity, j11Var, 2);
                gr1Var3.Y = obj;
                return gr1Var3;
            case 3:
                gr1 gr1Var4 = new gr1(emulatorActivity, j11Var, 3);
                gr1Var4.Y = obj;
                return gr1Var4;
            case 4:
                gr1 gr1Var5 = new gr1(emulatorActivity, j11Var, 4);
                gr1Var5.Y = obj;
                return gr1Var5;
            case 5:
                gr1 gr1Var6 = new gr1(emulatorActivity, j11Var, 5);
                gr1Var6.Y = obj;
                return gr1Var6;
            case ig7.b /* 6 */:
                gr1 gr1Var7 = new gr1(emulatorActivity, j11Var, 6);
                gr1Var7.Y = obj;
                return gr1Var7;
            default:
                gr1 gr1Var8 = new gr1(emulatorActivity, j11Var, 7);
                gr1Var8.Y = obj;
                return gr1Var8;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        RuntimeLayoutView runtimeLayoutView;
        VideoRenderer e;
        EmulatorActivity.a aVar;
        eo0 fo0Var;
        ti4 ti4Var;
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
                es5 es5Var = (es5) this.Y;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                EmulatorActivity emulatorActivity = this.Z;
                fr1 fr1Var = emulatorActivity.j1;
                if (es5Var != null) {
                    k17 k17Var = es5Var.e;
                    f34.R(emulatorActivity, es5Var.d);
                    r8 r8Var = emulatorActivity.A0;
                    if (r8Var != null) {
                        RuntimeLayoutView runtimeLayoutView2 = (RuntimeLayoutView) r8Var.k;
                        ug3 ug3Var = ug3.MAIN_SCREEN;
                        ug3Var.getClass();
                        runtimeLayoutView2.e0 = es5Var;
                        runtimeLayoutView2.e(k17Var, ug3Var);
                        runtimeLayoutView2.h();
                        runtimeLayoutView2.j();
                        vc3 vc3Var = vc3.BUTTON_TOGGLE_SOFT_INPUT;
                        runtimeLayoutView2.g(vc3Var, runtimeLayoutView2.h0);
                        vc3 vc3Var2 = vc3.BUTTON_FAST_FORWARD_TOGGLE;
                        runtimeLayoutView2.g(vc3Var2, fr1Var.A);
                        vc3 vc3Var3 = vc3.BUTTON_MICROPHONE_TOGGLE;
                        runtimeLayoutView2.g(vc3Var3, fr1Var.L);
                        k42 k42Var = emulatorActivity.J0;
                        if (k42Var != null) {
                            RuntimeLayoutView runtimeLayoutView3 = k42Var.L;
                            ug3 ug3Var2 = ug3.SECONDARY_SCREEN;
                            runtimeLayoutView3.getClass();
                            ug3Var2.getClass();
                            runtimeLayoutView3.e0 = es5Var;
                            runtimeLayoutView3.e(k17Var, ug3Var2);
                            runtimeLayoutView3.h();
                            runtimeLayoutView3.j();
                            runtimeLayoutView3.g(vc3Var, runtimeLayoutView3.h0);
                            k42Var.b();
                            runtimeLayoutView3.g(vc3Var2, fr1Var.A);
                            runtimeLayoutView3.g(vc3Var3, fr1Var.L);
                        }
                        Handler handler = emulatorActivity.K0;
                        if (handler != null) {
                            handler.post(new kq1(emulatorActivity, 8));
                        } else {
                            b53.g0("handler");
                            throw null;
                        }
                    } else {
                        b53.g0("binding");
                        throw null;
                    }
                } else {
                    r8 r8Var2 = emulatorActivity.A0;
                    if (r8Var2 != null) {
                        ((RuntimeLayoutView) r8Var2.k).b();
                        k42 k42Var2 = emulatorActivity.J0;
                        if (k42Var2 != null && (runtimeLayoutView = k42Var2.L) != null) {
                            runtimeLayoutView.b();
                        }
                    } else {
                        b53.g0("binding");
                        throw null;
                    }
                }
                return o27.a;
            case 1:
                bs5 bs5Var = (bs5) this.Y;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                EmulatorActivity emulatorActivity2 = this.Z;
                emulatorActivity2.a1 = bs5Var;
                o51 o51Var = emulatorActivity2.R0;
                if (o51Var != null) {
                    bs5Var.getClass();
                    synchronized (o51Var.o) {
                        o51Var.p = bs5Var;
                        o51Var.q = true;
                        o51Var.e = true;
                        o51Var.f = false;
                    }
                    emulatorActivity2.Q0();
                    return o27.a;
                }
                b53.g0("mainScreenRenderer");
                throw null;
            case 2:
                bs5 bs5Var2 = (bs5) this.Y;
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                k42 k42Var3 = this.Z.J0;
                if (k42Var3 != null) {
                    bs5Var2.getClass();
                    k42Var3.c0 = bs5Var2;
                    o51 o51Var2 = k42Var3.Y;
                    o51Var2.getClass();
                    synchronized (o51Var2.o) {
                        o51Var2.p = bs5Var2;
                        o51Var2.q = true;
                        o51Var2.e = true;
                        o51Var2.f = false;
                    }
                    k42Var3.b();
                }
                return o27.a;
            case 3:
                js5 js5Var = (js5) this.Y;
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                EmulatorActivity emulatorActivity3 = this.Z;
                emulatorActivity3.U0 = js5Var;
                if (js5Var == null || (e = js5Var.a) == null) {
                    e = ((b56) emulatorActivity3.U().c).e();
                }
                in3 in3Var = emulatorActivity3.A;
                if (!emulatorActivity3.f1) {
                    if (e == VideoRenderer.VULKAN) {
                        aVar = EmulatorActivity.a.VULKAN;
                    } else {
                        aVar = EmulatorActivity.a.OPEN_GL;
                    }
                    if (aVar != emulatorActivity3.b1) {
                        boolean isAtLeast = in3Var.d.isAtLeast(qm3.RESUMED);
                        eo0 eo0Var = emulatorActivity3.Q0;
                        if (eo0Var != null) {
                            eo0Var.a();
                            qm3 qm3Var = in3Var.d;
                            qm3 qm3Var2 = qm3.STARTED;
                            if (qm3Var.isAtLeast(qm3Var2)) {
                                oh2 oh2Var = emulatorActivity3.P0;
                                if (oh2Var != null) {
                                    r8 r8Var3 = emulatorActivity3.A0;
                                    if (r8Var3 != null) {
                                        oh2Var.b((EmulatorSurfaceView) r8Var3.g);
                                    } else {
                                        b53.g0("binding");
                                        throw null;
                                    }
                                } else {
                                    b53.g0("frameRenderCoordinator");
                                    throw null;
                                }
                            }
                            k42 k42Var4 = emulatorActivity3.J0;
                            if (k42Var4 != null) {
                                k42Var4.dismiss();
                            }
                            emulatorActivity3.J0 = null;
                            oh2 oh2Var2 = emulatorActivity3.P0;
                            if (oh2Var2 != null) {
                                oh2Var2.stop();
                                emulatorActivity3.b1 = aVar;
                                oh2 O = emulatorActivity3.O(aVar);
                                emulatorActivity3.P0 = O;
                                emulatorActivity3.W0 = null;
                                emulatorActivity3.g1 = false;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    fo0Var = new go0(O);
                                } else {
                                    fo0Var = new fo0(O);
                                }
                                emulatorActivity3.Q0 = fo0Var;
                                if (in3Var.d.isAtLeast(qm3Var2)) {
                                    oh2 oh2Var3 = emulatorActivity3.P0;
                                    if (oh2Var3 != null) {
                                        r8 r8Var4 = emulatorActivity3.A0;
                                        if (r8Var4 != null) {
                                            oh2Var3.e((EmulatorSurfaceView) r8Var4.g);
                                            emulatorActivity3.N0();
                                        } else {
                                            b53.g0("binding");
                                            throw null;
                                        }
                                    } else {
                                        b53.g0("frameRenderCoordinator");
                                        throw null;
                                    }
                                }
                                emulatorActivity3.Q0();
                                emulatorActivity3.m0();
                                if (isAtLeast) {
                                    eo0 eo0Var2 = emulatorActivity3.Q0;
                                    if (eo0Var2 != null) {
                                        eo0Var2.b();
                                    } else {
                                        b53.g0("choreographerFrameRenderer");
                                        throw null;
                                    }
                                }
                            } else {
                                b53.g0("frameRenderCoordinator");
                                throw null;
                            }
                        } else {
                            b53.g0("choreographerFrameRenderer");
                            throw null;
                        }
                    }
                }
                emulatorActivity3.O0(js5Var);
                o51 o51Var3 = emulatorActivity3.R0;
                if (o51Var3 != null) {
                    synchronized (o51Var3.b) {
                        o51Var3.c = js5Var;
                        o51Var3.d = true;
                    }
                    k42 k42Var5 = emulatorActivity3.J0;
                    if (k42Var5 != null) {
                        k42Var5.d0 = js5Var;
                        us1 us1Var = k42Var5.Z.e0;
                        if (us1Var != null) {
                            o51 o51Var4 = (o51) us1Var;
                            synchronized (o51Var4.b) {
                                o51Var4.c = js5Var;
                                o51Var4.d = true;
                            }
                        }
                        k42Var5.b();
                    }
                    emulatorActivity3.Q0();
                    emulatorActivity3.m0();
                    return o27.a;
                }
                b53.g0("mainScreenRenderer");
                throw null;
            case 4:
                Integer num = (Integer) this.Y;
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                EmulatorActivity emulatorActivity4 = this.Z;
                r8 r8Var5 = emulatorActivity4.A0;
                if (num == null) {
                    if (r8Var5 != null) {
                        ((TextView) r8Var5.h).setText((CharSequence) null);
                    } else {
                        b53.g0("binding");
                        throw null;
                    }
                } else if (r8Var5 != null) {
                    ((TextView) r8Var5.h).setText(emulatorActivity4.getString(R.string.info_fps, num));
                } else {
                    b53.g0("binding");
                    throw null;
                }
                return o27.a;
            case 5:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                EmulatorActivity emulatorActivity5 = this.Z;
                emulatorActivity5.i1 = (c42) this.Y;
                emulatorActivity5.N0();
                return o27.a;
            case ig7.b /* 6 */:
                EmulatorActivity emulatorActivity6 = this.Z;
                gv6 gv6Var = (gv6) this.Y;
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (b53.x(gv6Var, du6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.error_load_gba_rom), new Integer(0));
                } else if (b53.x(gv6Var, ru6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.saved), new Integer(0));
                } else if (b53.x(gv6Var, qu6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.loaded), new Integer(0));
                } else if (b53.x(gv6Var, cv6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.rewind_not_enabled), new Integer(0));
                } else if (b53.x(gv6Var, bv6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.rewind_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (b53.x(gv6Var, dv6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.failed_load_state), new Integer(0));
                } else if (b53.x(gv6Var, iu6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.invalid_auto_load_state), new Integer(1));
                } else if (b53.x(gv6Var, ev6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.failed_save_state), new Integer(0));
                } else if (b53.x(gv6Var, fv6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.cant_load_empty_slot), new Integer(0));
                } else if (b53.x(gv6Var, yt6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.load_states_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (b53.x(gv6Var, cu6.a)) {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.cheats_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (!b53.x(gv6Var, zt6.a) && !b53.x(gv6Var, au6.a)) {
                    if (b53.x(gv6Var, bu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.retro_achievements_relaunch_to_apply_settings), new Integer(1));
                    } else if (b53.x(gv6Var, eu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.emulator_stop_gba_mode_unsupported), new Integer(0));
                    } else if (b53.x(gv6Var, hu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.emulator_stop_internal_error), new Integer(1));
                    } else if (b53.x(gv6Var, lu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.offline_ra_ledger_tampered_toast), new Integer(1));
                    } else if (b53.x(gv6Var, nu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.offline_ra_sync_failed_toast), new Integer(1));
                    } else if (b53.x(gv6Var, pu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.ra_pending_state_verification_failed), new Integer(1));
                    } else if (b53.x(gv6Var, wu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.retroachievements_account_changed_in_game), new Integer(1));
                    } else if (b53.x(gv6Var, xu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.retroachievements_logout_failed), new Integer(1));
                    } else if (b53.x(gv6Var, su6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.ra_offline_proxy_not_active), new Integer(1));
                    } else if (b53.x(gv6Var, av6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.ra_offline_proxy_restart_required), new Integer(1));
                    } else if (gv6Var instanceof fu6) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.offline_ra_hardcore_unsynced_warning_toast, new Integer(((fu6) gv6Var).a)), new Integer(1));
                    } else if (gv6Var instanceof gu6) {
                        gu6 gu6Var = (gu6) gv6Var;
                        int i3 = gu6Var.a;
                        int i4 = gu6Var.b;
                        if (i4 == 0) {
                            string4 = emulatorActivity6.getString(R.string.offline_ra_hardcore_sync_result_all, new Integer(i3));
                        } else if (i3 == 0) {
                            string4 = emulatorActivity6.getString(R.string.offline_ra_hardcore_sync_result_none, new Integer(i4));
                        } else {
                            string4 = emulatorActivity6.getString(R.string.offline_ra_hardcore_sync_result_partial, new Integer(i3), new Integer(i4));
                        }
                        string4.getClass();
                        ti4Var = new ti4(string4, new Integer(1));
                    } else if (gv6Var instanceof yu6) {
                        yu6 yu6Var = (yu6) gv6Var;
                        int i5 = jr1.a[yu6Var.a.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    if (yu6Var.c) {
                                        string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore_offline_hardcore_disabled);
                                    } else if (yu6Var.b) {
                                        string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore_offline_no_internet_start);
                                    } else {
                                        string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore_offline);
                                    }
                                } else {
                                    i.c();
                                    return null;
                                }
                            } else {
                                string3 = emulatorActivity6.getString(R.string.offline_ra_mode_hardcore);
                            }
                        } else {
                            string3 = emulatorActivity6.getString(R.string.offline_ra_mode_softcore);
                        }
                        string3.getClass();
                        ti4Var = new ti4(string3, new Integer(1));
                    } else if (gv6Var instanceof ou6) {
                        ou6 ou6Var = (ou6) gv6Var;
                        Long l = ou6Var.b;
                        int i6 = ou6Var.a;
                        int i7 = EmulatorActivity.P1;
                        String T = emulatorActivity6.T(l);
                        if (l != null && l.longValue() <= 0) {
                            string2 = emulatorActivity6.getString(R.string.offline_ra_pending_softcore_expired_notice, new Integer(i6));
                        } else if (T != null) {
                            string2 = emulatorActivity6.getString(R.string.offline_ra_pending_softcore_notice_with_expiration, new Integer(i6), T);
                        } else {
                            string2 = emulatorActivity6.getString(R.string.offline_ra_pending_softcore_notice, new Integer(i6));
                        }
                        string2.getClass();
                        ti4Var = new ti4(string2, new Integer(1));
                    } else if (gv6Var instanceof ju6) {
                        ju6 ju6Var = (ju6) gv6Var;
                        String str2 = ju6Var.a;
                        ku6 ku6Var = ju6Var.b;
                        int i8 = jr1.b[ku6Var.ordinal()];
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    if (i8 == 4) {
                                        i = R.string.offline_ra_sync_skipped_server_rejected_toast;
                                    } else {
                                        i.c();
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
                        if (ku6Var == ku6.SERVER_REJECTED) {
                            String str3 = ju6Var.c;
                            if (str3 == null) {
                                str3 = emulatorActivity6.getString(R.string.offline_ra_sync_skipped_server_rejected_unknown_reason);
                                str3.getClass();
                            }
                            string = emulatorActivity6.getString(i, str2, str3);
                        } else {
                            string = emulatorActivity6.getString(i, str2);
                        }
                        string.getClass();
                        ti4Var = new ti4(string, new Integer(1));
                    } else if (gv6Var instanceof mu6) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.offline_ra_sync_skipped_summary_toast, new Integer(((mu6) gv6Var).a)), new Integer(1));
                    } else if (gv6Var instanceof vu6) {
                        int i9 = jr1.c[((vu6) gv6Var).a.ordinal()];
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 == 4) {
                                        str = "Compute";
                                    } else {
                                        i.c();
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
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.renderer_init_failed_message, str), new Integer(1));
                    } else if (gv6Var instanceof uu6) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.renderer_debug_capture_logged, ((uu6) gv6Var).a), new Integer(1));
                    } else if (b53.x(gv6Var, tu6.a)) {
                        ti4Var = new ti4(emulatorActivity6.getString(R.string.renderer_debug_capture_failed), new Integer(1));
                    } else {
                        i.c();
                        return null;
                    }
                } else {
                    ti4Var = new ti4(emulatorActivity6.getString(R.string.save_states_not_supported), new Integer(1));
                }
                Object obj2 = ti4Var.A;
                obj2.getClass();
                Toast.makeText(emulatorActivity6, (String) obj2, ((Number) ti4Var.B).intValue()).show();
                return o27.a;
            default:
                final EmulatorActivity emulatorActivity7 = this.Z;
                os osVar = emulatorActivity7.O1;
                pu1 pu1Var = (pu1) this.Y;
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (b53.x(pu1Var, yt1.a)) {
                    if (!emulatorActivity7.f1) {
                        emulatorActivity7.f1 = true;
                        emulatorActivity7.e0();
                        emulatorActivity7.finish();
                    }
                } else if (pu1Var instanceof au1) {
                    Intent intent = new Intent(emulatorActivity7, CheatsActivity.class);
                    wm5 wm5Var = ((au1) pu1Var).a;
                    intent.putExtra("key_rom_info", new xm5(wm5Var.b, wm5Var.a, wm5Var.c, wm5Var.d));
                    emulatorActivity7.n1.a(intent);
                } else if (pu1Var instanceof bu1) {
                    Intent intent2 = new Intent(emulatorActivity7, SettingsActivity.class);
                    intent2.putExtra("in_game", true);
                    bu1 bu1Var = (bu1) pu1Var;
                    wx2 wx2Var = bu1Var.a;
                    intent2.putExtra("lock_input_mapping", wx2Var.a);
                    intent2.putExtra("lock_input_layout", wx2Var.b);
                    intent2.putExtra("lock_video_filtering", wx2Var.c);
                    intent2.putExtra("ra_runtime_identity_locked", bu1Var.b);
                    intent2.putExtra("ra_in_game_logout_supported", bu1Var.c);
                    emulatorActivity7.k1.a(intent2);
                } else if (pu1Var instanceof hu1) {
                    kl4 kl4Var = ((hu1) pu1Var).a;
                    emulatorActivity7.M1 = kl4Var;
                    emulatorActivity7.h0(0);
                    osVar.l(ts1.PAUSE_MENU);
                    emulatorActivity7.z1.setValue(kl4Var);
                } else if (pu1Var instanceof lu1) {
                    RewindWindow rewindWindow = ((lu1) pu1Var).a;
                    osVar.l(ts1.REWIND_WINDOW);
                    emulatorActivity7.F1.setValue(rewindWindow);
                    emulatorActivity7.h0(0);
                } else if (pu1Var instanceof nu1) {
                    nu1 nu1Var = (nu1) pu1Var;
                    if (nu1Var.b == mu1.SAVING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    List list = nu1Var.a;
                    py pyVar = new py(z, emulatorActivity7, 2);
                    osVar.l(ts1.SAVE_STATES_DIALOG);
                    emulatorActivity7.H1.setValue(new dr1(list, z, pyVar));
                    emulatorActivity7.h0(0);
                    if (z) {
                        i2 = R.string.save_state;
                    } else {
                        i2 = R.string.load_state;
                    }
                    String string6 = emulatorActivity7.getString(i2);
                    string6.getClass();
                    k42 k42Var6 = emulatorActivity7.J0;
                    if (k42Var6 != null) {
                        k42Var6.a(new et0(-913739810, true, new w3(string6, list, emulatorActivity7, 12)));
                    }
                } else if (b53.x(pu1Var, du1.a)) {
                    osVar.l(ts1.ACHIEVEMENTS_DIALOG);
                    emulatorActivity7.w1.setValue(Boolean.TRUE);
                } else if (b53.x(pu1Var, iu1.a)) {
                    osVar.l(ts1.PENDING_SUBMISSION_CONFIRM_EXIT);
                    emulatorActivity7.x1.setValue(Boolean.TRUE);
                } else if (b53.x(pu1Var, eu1.a)) {
                    osVar.l(ts1.PRESETS_DIALOG);
                    emulatorActivity7.y1.setValue(Boolean.TRUE);
                    emulatorActivity7.h0(0);
                } else if (b53.x(pu1Var, ku1.a)) {
                    int i10 = EmulatorActivity.P1;
                    emulatorActivity7.H0();
                } else if (pu1Var instanceof ou1) {
                    ou1 ou1Var = (ou1) pu1Var;
                    final rg5 rg5Var = ou1Var.a;
                    VideoRenderer videoRenderer = ou1Var.b;
                    final vx2 vx2Var = ou1Var.c;
                    xa6 xa6Var = emulatorActivity7.I1;
                    ip3 C = l07.C();
                    String string7 = emulatorActivity7.getString(R.string.key_mapping);
                    string7.getClass();
                    C.add(new ti4(EmulatorActivity.l0(string7, vx2Var.a), new ki2() { // from class: vq1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v2, types: [android.os.Parcelable, bp5, java.lang.Object] */
                        @Override // defpackage.ki2
                        public final Object c() {
                            String str4;
                            int i11 = r3;
                            o27 o27Var = o27.a;
                            rg5 rg5Var2 = rg5Var;
                            EmulatorActivity emulatorActivity8 = emulatorActivity7;
                            switch (i11) {
                                case 0:
                                    h9 h9Var = emulatorActivity8.l1;
                                    rg5Var2.getClass();
                                    Intent intent3 = new Intent(emulatorActivity8, InputSetupActivity.class);
                                    ?? obj3 = new Object();
                                    obj3.A = rg5Var2;
                                    intent3.putExtra("rom", (Parcelable) obj3);
                                    h9Var.a(intent3);
                                    return o27Var;
                                case 1:
                                    int i12 = EmulatorActivity.P1;
                                    Intent intent4 = new Intent(emulatorActivity8, LayoutSelectorActivity.class);
                                    UUID uuid = rg5Var2.f.c;
                                    if (uuid != null) {
                                        str4 = uuid.toString();
                                    } else {
                                        str4 = null;
                                    }
                                    intent4.putExtra("selected_layout_id", str4);
                                    emulatorActivity8.m1.a(intent4);
                                    return o27Var;
                                default:
                                    int i13 = EmulatorActivity.P1;
                                    is5 is5Var = rg5Var2.f.b;
                                    String[] stringArray = emulatorActivity8.getResources().getStringArray(R.array.game_runtime_mic_source_options);
                                    stringArray.getClass();
                                    List<is5> n1 = tq0.n1(is5.getEntries());
                                    ArrayList arrayList = new ArrayList(uq0.y0(n1, 10));
                                    for (is5 is5Var2 : n1) {
                                        arrayList.add(stringArray[is5Var2.ordinal()]);
                                    }
                                    int i14 = 0;
                                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                    int indexOf = n1.indexOf(is5Var);
                                    if (indexOf >= 0) {
                                        i14 = indexOf;
                                    }
                                    String string8 = emulatorActivity8.getString(R.string.microphone_source);
                                    string8.getClass();
                                    emulatorActivity8.a0(new ar1(i14, new x(25, emulatorActivity8, n1), string8, nu.F0(strArr)));
                                    return o27Var;
                            }
                        }
                    }));
                    String string8 = emulatorActivity7.getString(R.string.controller_layout);
                    string8.getClass();
                    C.add(new ti4(EmulatorActivity.l0(string8, vx2Var.b), new ki2() { // from class: vq1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v2, types: [android.os.Parcelable, bp5, java.lang.Object] */
                        @Override // defpackage.ki2
                        public final Object c() {
                            String str4;
                            int i11 = r3;
                            o27 o27Var = o27.a;
                            rg5 rg5Var2 = rg5Var;
                            EmulatorActivity emulatorActivity8 = emulatorActivity7;
                            switch (i11) {
                                case 0:
                                    h9 h9Var = emulatorActivity8.l1;
                                    rg5Var2.getClass();
                                    Intent intent3 = new Intent(emulatorActivity8, InputSetupActivity.class);
                                    ?? obj3 = new Object();
                                    obj3.A = rg5Var2;
                                    intent3.putExtra("rom", (Parcelable) obj3);
                                    h9Var.a(intent3);
                                    return o27Var;
                                case 1:
                                    int i12 = EmulatorActivity.P1;
                                    Intent intent4 = new Intent(emulatorActivity8, LayoutSelectorActivity.class);
                                    UUID uuid = rg5Var2.f.c;
                                    if (uuid != null) {
                                        str4 = uuid.toString();
                                    } else {
                                        str4 = null;
                                    }
                                    intent4.putExtra("selected_layout_id", str4);
                                    emulatorActivity8.m1.a(intent4);
                                    return o27Var;
                                default:
                                    int i13 = EmulatorActivity.P1;
                                    is5 is5Var = rg5Var2.f.b;
                                    String[] stringArray = emulatorActivity8.getResources().getStringArray(R.array.game_runtime_mic_source_options);
                                    stringArray.getClass();
                                    List<is5> n1 = tq0.n1(is5.getEntries());
                                    ArrayList arrayList = new ArrayList(uq0.y0(n1, 10));
                                    for (is5 is5Var2 : n1) {
                                        arrayList.add(stringArray[is5Var2.ordinal()]);
                                    }
                                    int i14 = 0;
                                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                    int indexOf = n1.indexOf(is5Var);
                                    if (indexOf >= 0) {
                                        i14 = indexOf;
                                    }
                                    String string82 = emulatorActivity8.getString(R.string.microphone_source);
                                    string82.getClass();
                                    emulatorActivity8.a0(new ar1(i14, new x(25, emulatorActivity8, n1), string82, nu.F0(strArr)));
                                    return o27Var;
                            }
                        }
                    }));
                    String string9 = emulatorActivity7.getString(R.string.filter);
                    string9.getClass();
                    C.add(new ti4(EmulatorActivity.l0(string9, vx2Var.c), new yc0(emulatorActivity7, videoRenderer, rg5Var, vx2Var, 2)));
                    if (vx2Var.d) {
                        String string10 = emulatorActivity7.getString(R.string.video_retroarch_shader_preset_title);
                        string10.getClass();
                        C.add(new ti4(EmulatorActivity.l0(string10, vx2Var.e), new ki2() { // from class: wq1
                            @Override // defpackage.ki2
                            public final Object c() {
                                int i11 = r4;
                                o27 o27Var = o27.a;
                                rg5 rg5Var2 = rg5Var;
                                vx2 vx2Var2 = vx2Var;
                                EmulatorActivity emulatorActivity8 = emulatorActivity7;
                                switch (i11) {
                                    case 0:
                                        int i12 = EmulatorActivity.P1;
                                        emulatorActivity8.J0(R.string.video_retroarch_shader_preset_title, vx2Var2.g, rg5Var2.f.m, new z(1, emulatorActivity8.U(), hv1.class, "onRunningRomRetroArchPresetPathSelected", "onRunningRomRetroArchPresetPathSelected(Ljava/lang/String;)V", 0, 0, 7));
                                        return o27Var;
                                    default:
                                        int i13 = EmulatorActivity.P1;
                                        emulatorActivity8.J0(R.string.video_retroarch_shader_parameters_title, vx2Var2.g, rg5Var2.f.n, new z(1, emulatorActivity8.U(), hv1.class, "onRunningRomRetroArchParametersSelected", "onRunningRomRetroArchParametersSelected(Ljava/lang/String;)V", 0, 0, 6));
                                        return o27Var;
                                }
                            }
                        }));
                        String string11 = emulatorActivity7.getString(R.string.video_retroarch_shader_parameters_title);
                        string11.getClass();
                        C.add(new ti4(EmulatorActivity.l0(string11, vx2Var.f), new ki2() { // from class: wq1
                            @Override // defpackage.ki2
                            public final Object c() {
                                int i11 = r4;
                                o27 o27Var = o27.a;
                                rg5 rg5Var2 = rg5Var;
                                vx2 vx2Var2 = vx2Var;
                                EmulatorActivity emulatorActivity8 = emulatorActivity7;
                                switch (i11) {
                                    case 0:
                                        int i12 = EmulatorActivity.P1;
                                        emulatorActivity8.J0(R.string.video_retroarch_shader_preset_title, vx2Var2.g, rg5Var2.f.m, new z(1, emulatorActivity8.U(), hv1.class, "onRunningRomRetroArchPresetPathSelected", "onRunningRomRetroArchPresetPathSelected(Ljava/lang/String;)V", 0, 0, 7));
                                        return o27Var;
                                    default:
                                        int i13 = EmulatorActivity.P1;
                                        emulatorActivity8.J0(R.string.video_retroarch_shader_parameters_title, vx2Var2.g, rg5Var2.f.n, new z(1, emulatorActivity8.U(), hv1.class, "onRunningRomRetroArchParametersSelected", "onRunningRomRetroArchParametersSelected(Ljava/lang/String;)V", 0, 0, 6));
                                        return o27Var;
                                }
                            }
                        }));
                    }
                    String string12 = emulatorActivity7.getString(R.string.microphone_source);
                    string12.getClass();
                    C.add(new ti4(EmulatorActivity.l0(string12, vx2Var.h), new ki2() { // from class: vq1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v2, types: [android.os.Parcelable, bp5, java.lang.Object] */
                        @Override // defpackage.ki2
                        public final Object c() {
                            String str4;
                            int i11 = r3;
                            o27 o27Var = o27.a;
                            rg5 rg5Var2 = rg5Var;
                            EmulatorActivity emulatorActivity8 = emulatorActivity7;
                            switch (i11) {
                                case 0:
                                    h9 h9Var = emulatorActivity8.l1;
                                    rg5Var2.getClass();
                                    Intent intent3 = new Intent(emulatorActivity8, InputSetupActivity.class);
                                    ?? obj3 = new Object();
                                    obj3.A = rg5Var2;
                                    intent3.putExtra("rom", (Parcelable) obj3);
                                    h9Var.a(intent3);
                                    return o27Var;
                                case 1:
                                    int i12 = EmulatorActivity.P1;
                                    Intent intent4 = new Intent(emulatorActivity8, LayoutSelectorActivity.class);
                                    UUID uuid = rg5Var2.f.c;
                                    if (uuid != null) {
                                        str4 = uuid.toString();
                                    } else {
                                        str4 = null;
                                    }
                                    intent4.putExtra("selected_layout_id", str4);
                                    emulatorActivity8.m1.a(intent4);
                                    return o27Var;
                                default:
                                    int i13 = EmulatorActivity.P1;
                                    is5 is5Var = rg5Var2.f.b;
                                    String[] stringArray = emulatorActivity8.getResources().getStringArray(R.array.game_runtime_mic_source_options);
                                    stringArray.getClass();
                                    List<is5> n1 = tq0.n1(is5.getEntries());
                                    ArrayList arrayList = new ArrayList(uq0.y0(n1, 10));
                                    for (is5 is5Var2 : n1) {
                                        arrayList.add(stringArray[is5Var2.ordinal()]);
                                    }
                                    int i14 = 0;
                                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                    int indexOf = n1.indexOf(is5Var);
                                    if (indexOf >= 0) {
                                        i14 = indexOf;
                                    }
                                    String string82 = emulatorActivity8.getString(R.string.microphone_source);
                                    string82.getClass();
                                    emulatorActivity8.a0(new ar1(i14, new x(25, emulatorActivity8, n1), string82, nu.F0(strArr)));
                                    return o27Var;
                            }
                        }
                    }));
                    ip3 t = l07.t(C);
                    if (t.isEmpty()) {
                        emulatorActivity7.g0();
                    } else {
                        String string13 = emulatorActivity7.getString(R.string.rom_settings);
                        string13.getClass();
                        br1 br1Var = new br1(string13, t);
                        cr1 cr1Var = (cr1) tq0.U0(xa6Var);
                        if ((cr1Var instanceof br1) && ((br1) cr1Var).a.equals(string13)) {
                            xa6Var.set(xa6Var.size() - 1, br1Var);
                        } else {
                            emulatorActivity7.a0(br1Var);
                        }
                    }
                } else if (b53.x(pu1Var, ju1.a)) {
                    int i11 = EmulatorActivity.P1;
                    if (emulatorActivity7.W()) {
                        emulatorActivity7.u0();
                    }
                } else if (pu1Var instanceof fu1) {
                    fu1 fu1Var = (fu1) pu1Var;
                    int i12 = fu1Var.a;
                    Long l2 = fu1Var.b;
                    int i13 = EmulatorActivity.P1;
                    String T2 = emulatorActivity7.T(l2);
                    if (T2 != null) {
                        string5 = emulatorActivity7.getString(R.string.offline_ra_pending_message_with_expiration, Integer.valueOf(i12), T2);
                    } else {
                        string5 = emulatorActivity7.getString(R.string.offline_ra_pending_message, Integer.valueOf(i12));
                    }
                    string5.getClass();
                    tb tbVar = emulatorActivity7.q1;
                    if (tbVar != null) {
                        tbVar.dismiss();
                    }
                    sb sbVar = new sb(emulatorActivity7);
                    String string14 = emulatorActivity7.getString(R.string.offline_ra_pending_title);
                    pb pbVar = (pb) sbVar.L;
                    pbVar.d = string14;
                    pbVar.f = string5;
                    pbVar.m = false;
                    sbVar.z(R.string.offline_ra_sync_now, new oq1(emulatorActivity7, 3));
                    sbVar.x(R.string.offline_ra_continue_offline, new oq1(emulatorActivity7, 4));
                    emulatorActivity7.q1 = sbVar.C();
                } else if (pu1Var instanceof gu1) {
                    int i14 = ((gu1) pu1Var).a;
                    tb tbVar2 = emulatorActivity7.r1;
                    if (tbVar2 != null) {
                        tbVar2.dismiss();
                    }
                    sb sbVar2 = new sb(emulatorActivity7);
                    pb pbVar2 = (pb) sbVar2.L;
                    pbVar2.d = emulatorActivity7.getString(R.string.offline_ra_syncing_title);
                    pbVar2.f = emulatorActivity7.getString(R.string.offline_ra_syncing_message, Integer.valueOf(i14));
                    pbVar2.m = false;
                    tb l3 = sbVar2.l();
                    emulatorActivity7.r1 = l3;
                    l3.show();
                } else if (b53.x(pu1Var, zt1.a)) {
                    tb tbVar3 = emulatorActivity7.r1;
                    if (tbVar3 != null) {
                        tbVar3.dismiss();
                    }
                    emulatorActivity7.r1 = null;
                } else {
                    i.c();
                    return null;
                }
                return o27.a;
        }
    }
}
