package ah;

import android.content.DialogInterface;
import android.net.Uri;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import cd.q1;
import java.text.NumberFormat;
import java.util.ArrayList;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ l(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        hh.k kVar;
        String str;
        String str2;
        String obj;
        String obj2;
        int i10 = this.A;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i10) {
            case 0:
                int i11 = EmulatorActivity.f9503a1;
                k1 k1Var = (k1) ((hh.e0) obj4).f6516a.get(i2);
                h1 C = ((EmulatorActivity) obj3).C();
                q1 q1Var = C.f777q;
                cd.e1 e1Var = C.O;
                k1Var.getClass();
                boolean z10 = k1Var instanceof lh.a;
                hh.r rVar = hh.r.f6565a;
                if (z10) {
                    hh.k kVar2 = null;
                    oe.e0 e0Var = null;
                    hh.k kVar3 = null;
                    switch (i0.f787a[((lh.a) k1Var).ordinal()]) {
                        case DSiCameraSource.FrontCamera /* 1 */:
                            e1Var.p(rVar);
                            return;
                        case 2:
                            Object value = q1Var.getValue();
                            if (value instanceof hh.k) {
                                kVar2 = (hh.k) value;
                            }
                            if (kVar2 != null) {
                                e1Var.p(new hh.y(C.o(kVar2.f6537a), hh.x.SAVING));
                                return;
                            }
                            return;
                        case 3:
                            Object value2 = q1Var.getValue();
                            if (value2 instanceof hh.k) {
                                kVar3 = (hh.k) value2;
                            }
                            if (kVar3 != null) {
                                e1Var.p(new hh.y(C.o(kVar3.f6537a), hh.x.LOADING));
                                return;
                            }
                            return;
                        case 4:
                            zc.x.v(C.f775o, null, null, new g0(C, null, 2), 3);
                            return;
                        case l1.c.f8511g /* 5 */:
                            Object value3 = q1Var.getValue();
                            if (value3 instanceof hh.k) {
                                kVar = (hh.k) value3;
                            } else {
                                kVar = null;
                            }
                            if (kVar != null) {
                                ze.a aVar = kVar.f6537a;
                                xf.a aVar2 = C.f767f;
                                Uri uri = aVar.f15056d;
                                aVar2.getClass();
                                uri.getClass();
                                zd.f a10 = aVar2.a(k6.a.d(aVar2.f14600a, uri));
                                if (a10 != null) {
                                    e0Var = a10.a(aVar);
                                }
                                if (e0Var != null) {
                                    e1Var.p(new hh.q(e0Var));
                                    return;
                                }
                                return;
                            }
                            return;
                        case l1.c.f8509e /* 6 */:
                            e1Var.p(hh.t.f6571a);
                            return;
                        case 7:
                            C.r();
                            return;
                        case 8:
                            C.m(false);
                            return;
                        default:
                            m9.o.o();
                            return;
                    }
                } else if (k1Var instanceof dh.a) {
                    int i12 = i0.f788b[((dh.a) k1Var).ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                pf.j jVar = C.f773l;
                                jVar.getClass();
                                MelonEmulator.f9466a.stopEmulation();
                                jVar.f11634g.a();
                                EmulatorMessageQueue emulatorMessageQueue = jVar.f11638k;
                                emulatorMessageQueue.f9482c.post(new pf.l(emulatorMessageQueue, 0));
                                e1Var.p(hh.p.f6558a);
                                return;
                            }
                            m9.o.o();
                            return;
                        }
                        C.r();
                        return;
                    }
                    e1Var.p(rVar);
                    return;
                } else {
                    return;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                jb.c cVar = (jb.c) obj4;
                FirmwareBirthdayPreference firmwareBirthdayPreference = (FirmwareBirthdayPreference) obj3;
                Object obj5 = FirmwareBirthdayPreference.A;
                int parseInt = Integer.parseInt(((TextView) cVar.B).getText().toString());
                int parseInt2 = Integer.parseInt(((TextView) cVar.L).getText().toString());
                NumberFormat numberFormat = FirmwareBirthdayPreference.B;
                String str3 = numberFormat.format(Integer.valueOf(parseInt)) + "/" + numberFormat.format(Integer.valueOf(parseInt2));
                if (firmwareBirthdayPreference.callChangeListener(str3)) {
                    firmwareBirthdayPreference.persistString(str3);
                }
                dialogInterface.dismiss();
                return;
            case 2:
                jb.c cVar2 = (jb.c) obj3;
                gi.e i13 = ((RetroAchievementsPreferencesFragment) obj4).i();
                Editable text = ((EditText) cVar2.L).getText();
                if (text == null || (obj2 = text.toString()) == null) {
                    str = "";
                } else {
                    str = obj2;
                }
                Editable text2 = ((EditText) cVar2.B).getText();
                if (text2 == null || (obj = text2.toString()) == null) {
                    str2 = "";
                } else {
                    str2 = obj;
                }
                zc.x.v(androidx.lifecycle.s0.h(i13), null, null, new a9.d(i13, str, str2, (cc.c) null, 14), 3);
                dialogInterface.dismiss();
                return;
            case 3:
                me.magnum.melonds.ui.layouteditor.b.k((me.magnum.melonds.ui.layouteditor.b) obj4, (fc.a) obj3, i2);
                return;
            default:
                ((me.magnum.melonds.ui.layouteditor.b) obj3).L.f9067u.h((ve.c) ((ArrayList) obj4).get(i2));
                return;
        }
    }
}
