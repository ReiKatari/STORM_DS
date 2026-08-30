package ah;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hh.p1;
import hh.q1;
import hh.r1;
import hh.s1;
import hh.t1;
import hh.u1;
import java.text.SimpleDateFormat;
import java.util.List;
import kf.d2;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ EmulatorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(EmulatorActivity emulatorActivity, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = emulatorActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                cc.c cVar = (cc.c) obj2;
                yb.y yVar = yb.y.f14813a;
                ((t) t(cVar, (oe.h0) obj)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                cc.c cVar2 = (cc.c) obj2;
                yb.y yVar2 = yb.y.f14813a;
                ((t) t(cVar2, (oe.h0) obj)).v(yVar2);
                return yVar2;
            case 2:
                cc.c cVar3 = (cc.c) obj2;
                yb.y yVar3 = yb.y.f14813a;
                ((t) t(cVar3, (hh.f1) obj)).v(yVar3);
                return yVar3;
            case 3:
                cc.c cVar4 = (cc.c) obj2;
                yb.y yVar4 = yb.y.f14813a;
                ((t) t(cVar4, (Integer) obj)).v(yVar4);
                return yVar4;
            case 4:
                cc.c cVar5 = (cc.c) obj2;
                yb.y yVar5 = yb.y.f14813a;
                ((t) t(cVar5, (u1) obj)).v(yVar5);
                return yVar5;
            case l1.c.f8511g /* 5 */:
                cc.c cVar6 = (cc.c) obj2;
                yb.y yVar6 = yb.y.f14813a;
                ((t) t(cVar6, (hh.z) obj)).v(yVar6);
                return yVar6;
            case l1.c.f8509e /* 6 */:
                cc.c cVar7 = (cc.c) obj2;
                yb.y yVar7 = yb.y.f14813a;
                ((t) t(cVar7, (hh.o) obj)).v(yVar7);
                return yVar7;
            default:
                cc.c cVar8 = (cc.c) obj2;
                yb.y yVar8 = yb.y.f14813a;
                ((t) t(cVar8, (hh.e1) obj)).v(yVar8);
                return yVar8;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                t tVar = new t(this.Z, cVar, 0);
                tVar.Y = obj;
                return tVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                t tVar2 = new t(this.Z, cVar, 1);
                tVar2.Y = obj;
                return tVar2;
            case 2:
                t tVar3 = new t(this.Z, cVar, 2);
                tVar3.Y = obj;
                return tVar3;
            case 3:
                t tVar4 = new t(this.Z, cVar, 3);
                tVar4.Y = obj;
                return tVar4;
            case 4:
                t tVar5 = new t(this.Z, cVar, 4);
                tVar5.Y = obj;
                return tVar5;
            case l1.c.f8511g /* 5 */:
                t tVar6 = new t(this.Z, cVar, 5);
                tVar6.Y = obj;
                return tVar6;
            case l1.c.f8509e /* 6 */:
                t tVar7 = new t(this.Z, cVar, 6);
                tVar7.Y = obj;
                return tVar7;
            default:
                t tVar8 = new t(this.Z, cVar, 7);
                tVar8.Y = obj;
                return tVar8;
        }
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [nc.t, java.lang.Object] */
    @Override // ec.a
    public final Object v(Object obj) {
        yb.j jVar;
        RuntimeLayoutView runtimeLayoutView;
        switch (this.X) {
            case 0:
                oe.h0 h0Var = (oe.h0) this.Y;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                b bVar = this.Z.O0;
                if (bVar != null) {
                    h0Var.getClass();
                    synchronized (bVar.f734o) {
                        bVar.f735p = h0Var;
                        bVar.f736q = true;
                        bVar.f725e = true;
                        bVar.f726f = false;
                    }
                    return yb.y.f14813a;
                }
                nc.k.f("mainScreenRenderer");
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                oe.h0 h0Var2 = (oe.h0) this.Y;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                ih.f fVar = this.Z.G0;
                if (fVar != null) {
                    h0Var2.getClass();
                    b bVar2 = fVar.R;
                    bVar2.getClass();
                    synchronized (bVar2.f734o) {
                        bVar2.f735p = h0Var2;
                        bVar2.f736q = true;
                        bVar2.f725e = true;
                        bVar2.f726f = false;
                    }
                }
                return yb.y.f14813a;
            case 2:
                hh.f1 f1Var = (hh.f1) this.Y;
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                EmulatorActivity emulatorActivity = this.Z;
                b bVar3 = emulatorActivity.O0;
                if (bVar3 != null) {
                    synchronized (bVar3.f722b) {
                        bVar3.f723c = f1Var;
                        bVar3.f724d = true;
                    }
                    ih.f fVar2 = emulatorActivity.G0;
                    if (fVar2 != null) {
                        fVar2.Y = f1Var;
                        ih.d dVar = fVar2.X.f9508d0;
                        if (dVar != null) {
                            b bVar4 = (b) dVar;
                            synchronized (bVar4.f722b) {
                                bVar4.f723c = f1Var;
                                bVar4.f724d = true;
                            }
                        }
                    }
                    return yb.y.f14813a;
                }
                nc.k.f("mainScreenRenderer");
                throw null;
            case 3:
                Integer num = (Integer) this.Y;
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                EmulatorActivity emulatorActivity2 = this.Z;
                d5.f fVar3 = emulatorActivity2.f9504y0;
                if (num == null) {
                    if (fVar3 != null) {
                        ((TextView) fVar3.f3844f).setText((CharSequence) null);
                    } else {
                        nc.k.f("binding");
                        throw null;
                    }
                } else if (fVar3 != null) {
                    ((TextView) fVar3.f3844f).setText(emulatorActivity2.getString(R.string.info_fps, num));
                } else {
                    nc.k.f("binding");
                    throw null;
                }
                return yb.y.f14813a;
            case 4:
                u1 u1Var = (u1) this.Y;
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (nc.k.a(u1Var, hh.k1.f6542a)) {
                    jVar = new yb.j(new Integer((int) R.string.error_load_gba_rom), new Integer(0));
                } else if (nc.k.a(u1Var, hh.o1.f6557a)) {
                    jVar = new yb.j(new Integer((int) R.string.saved), new Integer(0));
                } else if (nc.k.a(u1Var, hh.n1.f6551a)) {
                    jVar = new yb.j(new Integer((int) R.string.loaded), new Integer(0));
                } else if (nc.k.a(u1Var, q1.f6564a)) {
                    jVar = new yb.j(new Integer((int) R.string.rewind_not_enabled), new Integer(0));
                } else if (nc.k.a(u1Var, p1.f6560a)) {
                    jVar = new yb.j(new Integer((int) R.string.rewind_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (nc.k.a(u1Var, r1.f6568a)) {
                    jVar = new yb.j(new Integer((int) R.string.failed_load_state), new Integer(0));
                } else if (nc.k.a(u1Var, s1.f6570a)) {
                    jVar = new yb.j(new Integer((int) R.string.failed_save_state), new Integer(0));
                } else if (nc.k.a(u1Var, t1.f6578a)) {
                    jVar = new yb.j(new Integer((int) R.string.cant_load_empty_slot), new Integer(0));
                } else if (nc.k.a(u1Var, hh.j1.f6536a)) {
                    jVar = new yb.j(new Integer((int) R.string.save_states_unavailable_ra_hardcore_enabled), new Integer(1));
                } else if (!nc.k.a(u1Var, hh.g1.f6528a) && !nc.k.a(u1Var, hh.h1.f6531a)) {
                    if (nc.k.a(u1Var, hh.i1.f6533a)) {
                        jVar = new yb.j(new Integer((int) R.string.retro_achievements_relaunch_to_apply_settings), new Integer(1));
                    } else if (nc.k.a(u1Var, hh.l1.f6545a)) {
                        jVar = new yb.j(new Integer((int) R.string.emulator_stop_gba_mode_unsupported), new Integer(0));
                    } else if (nc.k.a(u1Var, hh.m1.f6548a)) {
                        jVar = new yb.j(new Integer((int) R.string.emulator_stop_internal_error), new Integer(1));
                    } else {
                        m9.o.o();
                        return null;
                    }
                } else {
                    jVar = new yb.j(new Integer((int) R.string.save_states_not_supported), new Integer(1));
                }
                Toast.makeText(this.Z, ((Number) jVar.A).intValue(), ((Number) jVar.B).intValue()).show();
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                EmulatorActivity emulatorActivity3 = this.Z;
                a4.n nVar = emulatorActivity3.Z0;
                hh.z zVar = (hh.z) this.Y;
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (nc.k.a(zVar, hh.p.f6558a)) {
                    ih.a aVar7 = emulatorActivity3.N0;
                    if (aVar7 != null) {
                        aVar7.a();
                        ih.f fVar4 = emulatorActivity3.G0;
                        if (fVar4 != null) {
                            fVar4.dismiss();
                        }
                        emulatorActivity3.finish();
                    } else {
                        nc.k.f("choreographerFrameRenderer");
                        throw null;
                    }
                } else if (zVar instanceof hh.q) {
                    Intent intent = new Intent(emulatorActivity3, CheatsActivity.class);
                    oe.e0 e0Var = ((hh.q) zVar).f6561a;
                    intent.putExtra("key_rom_info", new eg.h(e0Var.f10924b, e0Var.f10923a, e0Var.f10925c, e0Var.f10926d));
                    emulatorActivity3.T0.a(intent);
                } else if (nc.k.a(zVar, hh.r.f6565a)) {
                    emulatorActivity3.S0.a(new Intent(emulatorActivity3, SettingsActivity.class));
                } else if (zVar instanceof hh.u) {
                    hh.e0 e0Var2 = ((hh.u) zVar).f6579a;
                    List list = e0Var2.f6516a;
                    int i2 = EmulatorActivity.f9503a1;
                    int size = list.size();
                    String[] strArr = new String[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        strArr[i10] = emulatorActivity3.getString(((k1) list.get(i10)).getTextResource());
                    }
                    nVar.k(hh.d.PAUSE_MENU);
                    bk.a aVar8 = new bk.a(emulatorActivity3);
                    aVar8.w(R.string.pause);
                    l lVar = new l(0, e0Var2, emulatorActivity3);
                    l.d dVar2 = (l.d) aVar8.L;
                    dVar2.f8371q = strArr;
                    dVar2.f8373s = lVar;
                    dVar2.f8369o = new j(emulatorActivity3, 1);
                    dVar2.f8368n = new d(emulatorActivity3, 1);
                    aVar8.y();
                } else if (zVar instanceof hh.w) {
                    RewindWindow rewindWindow = ((hh.w) zVar).f6583a;
                    nVar.k(hh.d.REWIND_WINDOW);
                    d5.f fVar5 = emulatorActivity3.f9504y0;
                    if (fVar5 != null) {
                        ((MotionLayout) fVar5.f3839a).z(R.id.rewind_visible);
                        jh.c cVar = emulatorActivity3.W0;
                        cVar.getClass();
                        rewindWindow.getClass();
                        cVar.f7904e = rewindWindow;
                        cVar.f7619a.b();
                        RecyclerView recyclerView = cVar.f7905f;
                        if (recyclerView != null) {
                            recyclerView.h0(0);
                        }
                    } else {
                        nc.k.f("binding");
                        throw null;
                    }
                } else if (zVar instanceof hh.y) {
                    List list2 = ((hh.y) zVar).f6585a;
                    a7.l lVar2 = new a7.l(4, zVar, emulatorActivity3);
                    int i11 = EmulatorActivity.f9503a1;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy", emulatorActivity3.getResources().getConfiguration().getLocales().get(0));
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("kk:mm:ss", emulatorActivity3.getResources().getConfiguration().getLocales().get(0));
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    com.squareup.picasso.a0 a0Var = emulatorActivity3.C0;
                    if (a0Var != null) {
                        obj3.A = new lh.d(list2, a0Var, simpleDateFormat, simpleDateFormat2, new a7.l(2, obj2, lVar2), new a7.l(3, emulatorActivity3, obj3));
                        RecyclerView recyclerView2 = new RecyclerView(emulatorActivity3, null);
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                        recyclerView2.setLayoutManager(linearLayoutManager);
                        recyclerView2.i(new j7.p(recyclerView2.getContext(), linearLayoutManager.f1605p));
                        recyclerView2.setAdapter((j7.k0) obj3.A);
                        recyclerView2.setDescendantFocusability(262144);
                        nVar.k(hh.d.SAVE_STATES_DIALOG);
                        bk.a aVar9 = new bk.a(emulatorActivity3);
                        l.d dVar3 = (l.d) aVar9.L;
                        dVar3.f8359d = emulatorActivity3.getString(R.string.save_slot);
                        aVar9.x(recyclerView2);
                        aVar9.u(R.string.cancel, new m(0));
                        dVar3.f8369o = new j(emulatorActivity3, 2);
                        dVar3.f8368n = new d(emulatorActivity3, 2);
                        obj2.A = aVar9.y();
                    } else {
                        nc.k.f("picasso");
                        throw null;
                    }
                } else if (nc.k.a(zVar, hh.t.f6571a)) {
                    nVar.k(hh.d.ACHIEVEMENTS_DIALOG);
                    emulatorActivity3.X0.setValue(Boolean.TRUE);
                } else if (nc.k.a(zVar, hh.v.f6581a)) {
                    nVar.k(hh.d.PENDING_SUBMISSION_CONFIRM_EXIT);
                    emulatorActivity3.Y0.setValue(Boolean.TRUE);
                } else {
                    m9.o.o();
                    return null;
                }
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                final EmulatorActivity emulatorActivity4 = this.Z;
                a4.n nVar2 = emulatorActivity4.Z0;
                hh.o oVar = (hh.o) this.Y;
                dc.a aVar10 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (oVar instanceof hh.l) {
                    d5.f fVar6 = emulatorActivity4.f9504y0;
                    if (fVar6 != null) {
                        ((RuntimeLayoutView) fVar6.f3846h).setVisibility(4);
                        d5.f fVar7 = emulatorActivity4.f9504y0;
                        if (fVar7 != null) {
                            ((TextView) fVar7.f3844f).setVisibility(8);
                            d5.f fVar8 = emulatorActivity4.f9504y0;
                            if (fVar8 != null) {
                                ((TextView) fVar8.f3845g).setVisibility(8);
                            } else {
                                nc.k.f("binding");
                                throw null;
                            }
                        } else {
                            nc.k.f("binding");
                            throw null;
                        }
                    } else {
                        nc.k.f("binding");
                        throw null;
                    }
                } else if (oVar instanceof hh.m) {
                    EmulatorActivity.A(emulatorActivity4);
                    a7.v vVar = emulatorActivity4.K0;
                    if (vVar != null) {
                        ConsoleType consoleType = ((hh.m) oVar).f6546a;
                        consoleType.getClass();
                        ((vg.c) ((a7.v) vVar.L).getValue()).f(consoleType);
                    } else {
                        nc.k.f("emulatorLaunchValidatorDelegate");
                        throw null;
                    }
                } else if (oVar instanceof hh.n) {
                    EmulatorActivity.A(emulatorActivity4);
                    a7.v vVar2 = emulatorActivity4.K0;
                    if (vVar2 != null) {
                        ze.a aVar11 = ((hh.n) oVar).f6549a;
                        aVar11.getClass();
                        vg.c cVar2 = (vg.c) ((a7.v) vVar2.L).getValue();
                        cVar2.f13834e = new vg.b(aVar11);
                        zc.x.v(androidx.lifecycle.s0.h(cVar2), null, null, new mh.m(cVar2, aVar11, null, 15), 3);
                    } else {
                        nc.k.f("emulatorLaunchValidatorDelegate");
                        throw null;
                    }
                } else if (!nc.k.a(oVar, hh.f.f6522a) && !nc.k.a(oVar, hh.g.f6526a)) {
                    if (!(oVar instanceof hh.k) && !(oVar instanceof hh.j)) {
                        if (oVar instanceof hh.h) {
                            d5.f fVar9 = emulatorActivity4.f9504y0;
                            if (fVar9 != null) {
                                ((RuntimeLayoutView) fVar9.f3846h).setVisibility(4);
                                d5.f fVar10 = emulatorActivity4.f9504y0;
                                if (fVar10 != null) {
                                    ((TextView) fVar10.f3844f).setVisibility(8);
                                    d5.f fVar11 = emulatorActivity4.f9504y0;
                                    if (fVar11 != null) {
                                        ((TextView) fVar11.f3845g).setVisibility(8);
                                        nVar2.k(hh.d.ROM_LOAD_ERROR_DIALOG);
                                        bk.a aVar12 = new bk.a(emulatorActivity4);
                                        ((l.d) aVar12.L).m = false;
                                        aVar12.w(R.string.error_load_rom);
                                        aVar12.t(R.string.error_load_rom_message);
                                        aVar12.v(R.string.ok, new DialogInterface.OnClickListener() { // from class: ah.i
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                                int i13 = r2;
                                                EmulatorActivity emulatorActivity5 = emulatorActivity4;
                                                switch (i13) {
                                                    case 0:
                                                        int i14 = EmulatorActivity.f9503a1;
                                                        emulatorActivity5.finish();
                                                        return;
                                                    case DSiCameraSource.FrontCamera /* 1 */:
                                                        int i15 = EmulatorActivity.f9503a1;
                                                        dialogInterface.dismiss();
                                                        emulatorActivity5.finish();
                                                        return;
                                                    default:
                                                        int i16 = EmulatorActivity.f9503a1;
                                                        dialogInterface.dismiss();
                                                        emulatorActivity5.finish();
                                                        return;
                                                }
                                            }
                                        });
                                        aVar12.y();
                                    } else {
                                        nc.k.f("binding");
                                        throw null;
                                    }
                                } else {
                                    nc.k.f("binding");
                                    throw null;
                                }
                            } else {
                                nc.k.f("binding");
                                throw null;
                            }
                        } else if (oVar instanceof hh.e) {
                            d5.f fVar12 = emulatorActivity4.f9504y0;
                            if (fVar12 != null) {
                                ((RuntimeLayoutView) fVar12.f3846h).setVisibility(4);
                                d5.f fVar13 = emulatorActivity4.f9504y0;
                                if (fVar13 != null) {
                                    ((TextView) fVar13.f3844f).setVisibility(8);
                                    d5.f fVar14 = emulatorActivity4.f9504y0;
                                    if (fVar14 != null) {
                                        ((TextView) fVar14.f3845g).setVisibility(8);
                                        nVar2.k(hh.d.FIRMWARE_LOAD_ERROR_DIALOG);
                                        bk.a aVar13 = new bk.a(emulatorActivity4);
                                        l.d dVar4 = (l.d) aVar13.L;
                                        dVar4.m = false;
                                        aVar13.w(R.string.error_load_firmware);
                                        dVar4.f8361f = emulatorActivity4.getResources().getString(R.string.error_load_firmware_message, ((hh.e) oVar).f6515a.toString());
                                        aVar13.v(R.string.ok, new DialogInterface.OnClickListener() { // from class: ah.i
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                                int i13 = r2;
                                                EmulatorActivity emulatorActivity5 = emulatorActivity4;
                                                switch (i13) {
                                                    case 0:
                                                        int i14 = EmulatorActivity.f9503a1;
                                                        emulatorActivity5.finish();
                                                        return;
                                                    case DSiCameraSource.FrontCamera /* 1 */:
                                                        int i15 = EmulatorActivity.f9503a1;
                                                        dialogInterface.dismiss();
                                                        emulatorActivity5.finish();
                                                        return;
                                                    default:
                                                        int i16 = EmulatorActivity.f9503a1;
                                                        dialogInterface.dismiss();
                                                        emulatorActivity5.finish();
                                                        return;
                                                }
                                            }
                                        });
                                        aVar13.y();
                                    } else {
                                        nc.k.f("binding");
                                        throw null;
                                    }
                                } else {
                                    nc.k.f("binding");
                                    throw null;
                                }
                            } else {
                                nc.k.f("binding");
                                throw null;
                            }
                        } else if (oVar instanceof hh.i) {
                            d5.f fVar15 = emulatorActivity4.f9504y0;
                            if (fVar15 != null) {
                                ((RuntimeLayoutView) fVar15.f3846h).setVisibility(4);
                                d5.f fVar16 = emulatorActivity4.f9504y0;
                                if (fVar16 != null) {
                                    ((TextView) fVar16.f3844f).setVisibility(8);
                                    d5.f fVar17 = emulatorActivity4.f9504y0;
                                    if (fVar17 != null) {
                                        ((TextView) fVar17.f3845g).setVisibility(8);
                                        String str = ((hh.i) oVar).f6532a;
                                        nVar2.k(hh.d.ROM_NOT_FOUND_DIALOG);
                                        bk.a aVar14 = new bk.a(emulatorActivity4);
                                        aVar14.w(R.string.error_rom_not_found);
                                        String string = emulatorActivity4.getString(R.string.error_rom_not_found_info, str);
                                        l.d dVar5 = (l.d) aVar14.L;
                                        dVar5.f8361f = string;
                                        aVar14.v(R.string.ok, new DialogInterface.OnClickListener() { // from class: ah.i
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                                int i13 = r2;
                                                EmulatorActivity emulatorActivity5 = emulatorActivity4;
                                                switch (i13) {
                                                    case 0:
                                                        int i14 = EmulatorActivity.f9503a1;
                                                        emulatorActivity5.finish();
                                                        return;
                                                    case DSiCameraSource.FrontCamera /* 1 */:
                                                        int i15 = EmulatorActivity.f9503a1;
                                                        dialogInterface.dismiss();
                                                        emulatorActivity5.finish();
                                                        return;
                                                    default:
                                                        int i16 = EmulatorActivity.f9503a1;
                                                        dialogInterface.dismiss();
                                                        emulatorActivity5.finish();
                                                        return;
                                                }
                                            }
                                        });
                                        dVar5.f8369o = new j(emulatorActivity4, 0);
                                        aVar14.y();
                                    } else {
                                        nc.k.f("binding");
                                        throw null;
                                    }
                                } else {
                                    nc.k.f("binding");
                                    throw null;
                                }
                            } else {
                                nc.k.f("binding");
                                throw null;
                            }
                        } else {
                            m9.o.o();
                            return null;
                        }
                    } else {
                        int i12 = EmulatorActivity.f9503a1;
                        emulatorActivity4.getWindow().setSustainedPerformanceMode(((d2) emulatorActivity4.C().f763b).f8181b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity4.D();
                        d5.f fVar18 = emulatorActivity4.f9504y0;
                        if (fVar18 != null) {
                            ((TextView) fVar18.f3845g).setVisibility(8);
                            d5.f fVar19 = emulatorActivity4.f9504y0;
                            if (fVar19 != null) {
                                ((RuntimeLayoutView) fVar19.f3846h).setVisibility(0);
                                emulatorActivity4.V0.f(true);
                            } else {
                                nc.k.f("binding");
                                throw null;
                            }
                        } else {
                            nc.k.f("binding");
                            throw null;
                        }
                    }
                } else {
                    EmulatorActivity.A(emulatorActivity4);
                }
                return yb.y.f14813a;
            default:
                hh.e1 e1Var = (hh.e1) this.Y;
                dc.a aVar15 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                EmulatorActivity emulatorActivity5 = this.Z;
                q qVar = emulatorActivity5.R0;
                if (e1Var != null) {
                    ve.n nVar3 = e1Var.f6521e;
                    d0.d.g0(emulatorActivity5, e1Var.f6520d);
                    d5.f fVar20 = emulatorActivity5.f9504y0;
                    if (fVar20 != null) {
                        RuntimeLayoutView runtimeLayoutView2 = (RuntimeLayoutView) fVar20.f3846h;
                        sh.d dVar6 = sh.d.MAIN_SCREEN;
                        dVar6.getClass();
                        runtimeLayoutView2.f9511d0 = e1Var;
                        runtimeLayoutView2.e(nVar3, dVar6);
                        runtimeLayoutView2.h();
                        runtimeLayoutView2.j();
                        ve.c cVar3 = ve.c.BUTTON_TOGGLE_SOFT_INPUT;
                        runtimeLayoutView2.g(cVar3, runtimeLayoutView2.f9514g0);
                        ve.c cVar4 = ve.c.BUTTON_FAST_FORWARD_TOGGLE;
                        runtimeLayoutView2.g(cVar4, qVar.f807a);
                        ve.c cVar5 = ve.c.BUTTON_MICROPHONE_TOGGLE;
                        runtimeLayoutView2.g(cVar5, qVar.f808b);
                        Handler handler = emulatorActivity5.H0;
                        if (handler != null) {
                            handler.post(new h(emulatorActivity5, 1));
                            ih.f fVar21 = emulatorActivity5.G0;
                            if (fVar21 != null) {
                                RuntimeLayoutView runtimeLayoutView3 = fVar21.B;
                                sh.d dVar7 = sh.d.SECONDARY_SCREEN;
                                runtimeLayoutView3.getClass();
                                dVar7.getClass();
                                runtimeLayoutView3.f9511d0 = e1Var;
                                runtimeLayoutView3.e(nVar3, dVar7);
                                runtimeLayoutView3.h();
                                runtimeLayoutView3.j();
                                runtimeLayoutView3.g(cVar3, runtimeLayoutView3.f9514g0);
                                fVar21.a();
                                runtimeLayoutView3.g(cVar4, qVar.f807a);
                                runtimeLayoutView3.g(cVar5, qVar.f808b);
                            }
                        } else {
                            nc.k.f("handler");
                            throw null;
                        }
                    } else {
                        nc.k.f("binding");
                        throw null;
                    }
                } else {
                    d5.f fVar22 = emulatorActivity5.f9504y0;
                    if (fVar22 != null) {
                        ((RuntimeLayoutView) fVar22.f3846h).b();
                        ih.f fVar23 = emulatorActivity5.G0;
                        if (fVar23 != null && (runtimeLayoutView = fVar23.B) != null) {
                            runtimeLayoutView.b();
                        }
                    } else {
                        nc.k.f("binding");
                        throw null;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
