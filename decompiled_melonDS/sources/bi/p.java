package bi;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.romlist.RomListActivity;
import oe.t0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ RomListActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(RomListActivity romListActivity, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = romListActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                cc.c cVar = (cc.c) obj2;
                yb.y yVar = yb.y.f14813a;
                ((p) t(cVar, (pe.b) obj)).v(yVar);
                return yVar;
            default:
                cc.c cVar2 = (cc.c) obj2;
                yb.y yVar2 = yb.y.f14813a;
                ((p) t(cVar2, (oe.n) obj)).v(yVar2);
                return yVar2;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                p pVar = new p(this.Z, cVar, 0);
                pVar.Y = obj;
                return pVar;
            default:
                p pVar2 = new p(this.Z, cVar, 1);
                pVar2.Y = obj;
                return pVar2;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        String string;
        String str;
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        final RomListActivity romListActivity = this.Z;
        switch (i2) {
            case 0:
                final pe.b bVar = (pe.b) this.Y;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                int i10 = o.f2307a[bVar.f11615a.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = RomListActivity.D0;
                        bk.a aVar2 = new bk.a(romListActivity);
                        String string2 = romListActivity.getString(R.string.nightly_update_available);
                        l.d dVar = (l.d) aVar2.L;
                        dVar.f8359d = string2;
                        dVar.f8361f = romListActivity.getString(R.string.nightly_update_available_message);
                        aVar2.v(R.string.update, new DialogInterface.OnClickListener() { // from class: bi.i
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                int i13 = r3;
                                pe.b bVar2 = bVar;
                                RomListActivity romListActivity2 = romListActivity;
                                switch (i13) {
                                    case 0:
                                        int i14 = RomListActivity.D0;
                                        romListActivity2.C(bVar2);
                                        return;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        int i15 = RomListActivity.D0;
                                        j0 A = romListActivity2.A();
                                        bVar2.getClass();
                                        hf.b bVar3 = A.f2300b;
                                        bVar3.getClass();
                                        SharedPreferences.Editor edit = bVar3.f6492c.edit();
                                        edit.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                        edit.apply();
                                        return;
                                    case 2:
                                        int i16 = RomListActivity.D0;
                                        romListActivity2.C(bVar2);
                                        return;
                                    default:
                                        int i17 = RomListActivity.D0;
                                        j0 A2 = romListActivity2.A();
                                        bVar2.getClass();
                                        hf.b bVar4 = A2.f2300b;
                                        bVar4.getClass();
                                        SharedPreferences.Editor edit2 = bVar4.f6492c.edit();
                                        edit2.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                        edit2.apply();
                                        return;
                                }
                            }
                        });
                        aVar2.u(R.string.remind_later_update, new DialogInterface.OnClickListener() { // from class: bi.i
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                int i13 = r3;
                                pe.b bVar2 = bVar;
                                RomListActivity romListActivity2 = romListActivity;
                                switch (i13) {
                                    case 0:
                                        int i14 = RomListActivity.D0;
                                        romListActivity2.C(bVar2);
                                        return;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        int i15 = RomListActivity.D0;
                                        j0 A = romListActivity2.A();
                                        bVar2.getClass();
                                        hf.b bVar3 = A.f2300b;
                                        bVar3.getClass();
                                        SharedPreferences.Editor edit = bVar3.f6492c.edit();
                                        edit.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                        edit.apply();
                                        return;
                                    case 2:
                                        int i16 = RomListActivity.D0;
                                        romListActivity2.C(bVar2);
                                        return;
                                    default:
                                        int i17 = RomListActivity.D0;
                                        j0 A2 = romListActivity2.A();
                                        bVar2.getClass();
                                        hf.b bVar4 = A2.f2300b;
                                        bVar4.getClass();
                                        SharedPreferences.Editor edit2 = bVar4.f6492c.edit();
                                        edit2.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                        edit2.apply();
                                        return;
                                }
                            }
                        });
                        aVar2.y();
                        return yVar;
                    }
                    m9.o.o();
                    return null;
                }
                ob.c cVar = romListActivity.f9572y0;
                if (cVar != null) {
                    String str2 = bVar.f11619e;
                    List<ob.a> list = cVar.f10872c;
                    for (ob.a aVar3 : list) {
                        aVar3.getClass();
                    }
                    b9.e eVar = cVar.f10870a;
                    if (str2 != null) {
                        sj.g gVar = new sj.g((ArrayList) eVar.B, (k0.g) eVar.R, (ArrayList) eVar.L);
                        int i12 = 0;
                        while (true) {
                            int length = str2.length();
                            int i13 = i12;
                            while (true) {
                                if (i13 < length) {
                                    char charAt = str2.charAt(i13);
                                    if (charAt != '\n' && charAt != '\r') {
                                        i13++;
                                    }
                                } else {
                                    i13 = -1;
                                }
                            }
                            if (i13 != -1) {
                                gVar.i(str2.substring(i12, i13));
                                i12 = i13 + 1;
                                if (i12 < str2.length() && str2.charAt(i13) == '\r' && str2.charAt(i12) == '\n') {
                                    i12 = i13 + 2;
                                }
                            } else {
                                if (str2.length() > 0 && (i12 == 0 || i12 < str2.length())) {
                                    gVar.i(str2.substring(i12));
                                }
                                gVar.f(gVar.f12983n);
                                p1.a0 a0Var = new p1.a0(12, gVar.f12981k, gVar.m);
                                gVar.f12980j.getClass();
                                sj.l lVar = new sj.l(a0Var);
                                for (xj.a aVar4 : gVar.f12984o) {
                                    aVar4.f(lVar);
                                }
                                vj.i iVar = (vj.i) gVar.f12982l.f12968b;
                                Iterator it = ((ArrayList) eVar.X).iterator();
                                if (!it.hasNext()) {
                                    for (ob.a aVar5 : list) {
                                        aVar5.getClass();
                                    }
                                    jb.c cVar2 = cVar.f10871b;
                                    b9.e eVar2 = new b9.e((ob.b) cVar2.L, new ob.d(2), new ob.i(), Collections.unmodifiableMap(((ob.d) cVar2.B).f10873a), new l7.a(7));
                                    eVar2.M(iVar);
                                    for (ob.a aVar6 : list) {
                                        aVar6.getClass();
                                    }
                                    ob.i iVar2 = (ob.i) eVar2.R;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar2.A);
                                    Iterator it2 = iVar2.B.iterator();
                                    while (it2.hasNext()) {
                                        ob.g gVar2 = (ob.g) it2.next();
                                        spannableStringBuilder.setSpan(gVar2.f10875a, gVar2.f10876b, gVar2.f10877c, gVar2.f10878d);
                                    }
                                    if (TextUtils.isEmpty(spannableStringBuilder) && !TextUtils.isEmpty(str2)) {
                                        spannableStringBuilder = new SpannableStringBuilder(str2);
                                    }
                                    bk.a aVar7 = new bk.a(romListActivity);
                                    l.d dVar2 = (l.d) aVar7.L;
                                    t0 t0Var = bVar.f11618d;
                                    int i14 = k.f2306a[t0Var.A.ordinal()];
                                    String str3 = "";
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            if (i14 == 3) {
                                                string = "";
                                            } else if (i14 == 4) {
                                                str = romListActivity.getString(R.string.version_nightly);
                                                str.getClass();
                                                dVar2.f8359d = romListActivity.getString(R.string.update_available, str);
                                                dVar2.f8361f = spannableStringBuilder;
                                                aVar7.v(R.string.update, new DialogInterface.OnClickListener() { // from class: bi.i
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i122) {
                                                        int i132 = r3;
                                                        pe.b bVar2 = bVar;
                                                        RomListActivity romListActivity2 = romListActivity;
                                                        switch (i132) {
                                                            case 0:
                                                                int i142 = RomListActivity.D0;
                                                                romListActivity2.C(bVar2);
                                                                return;
                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                int i15 = RomListActivity.D0;
                                                                j0 A = romListActivity2.A();
                                                                bVar2.getClass();
                                                                hf.b bVar3 = A.f2300b;
                                                                bVar3.getClass();
                                                                SharedPreferences.Editor edit = bVar3.f6492c.edit();
                                                                edit.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                                edit.apply();
                                                                return;
                                                            case 2:
                                                                int i16 = RomListActivity.D0;
                                                                romListActivity2.C(bVar2);
                                                                return;
                                                            default:
                                                                int i17 = RomListActivity.D0;
                                                                j0 A2 = romListActivity2.A();
                                                                bVar2.getClass();
                                                                hf.b bVar4 = A2.f2300b;
                                                                bVar4.getClass();
                                                                SharedPreferences.Editor edit2 = bVar4.f6492c.edit();
                                                                edit2.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                                edit2.apply();
                                                                return;
                                                        }
                                                    }
                                                });
                                                aVar7.u(R.string.cancel, null);
                                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: bi.i
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i122) {
                                                        int i132 = r3;
                                                        pe.b bVar2 = bVar;
                                                        RomListActivity romListActivity2 = romListActivity;
                                                        switch (i132) {
                                                            case 0:
                                                                int i142 = RomListActivity.D0;
                                                                romListActivity2.C(bVar2);
                                                                return;
                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                int i15 = RomListActivity.D0;
                                                                j0 A = romListActivity2.A();
                                                                bVar2.getClass();
                                                                hf.b bVar3 = A.f2300b;
                                                                bVar3.getClass();
                                                                SharedPreferences.Editor edit = bVar3.f6492c.edit();
                                                                edit.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                                edit.apply();
                                                                return;
                                                            case 2:
                                                                int i16 = RomListActivity.D0;
                                                                romListActivity2.C(bVar2);
                                                                return;
                                                            default:
                                                                int i17 = RomListActivity.D0;
                                                                j0 A2 = romListActivity2.A();
                                                                bVar2.getClass();
                                                                hf.b bVar4 = A2.f2300b;
                                                                bVar4.getClass();
                                                                SharedPreferences.Editor edit2 = bVar4.f6492c.edit();
                                                                edit2.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                                edit2.apply();
                                                                return;
                                                        }
                                                    }
                                                };
                                                dVar2.f8366k = dVar2.f8356a.getText(R.string.skip_update);
                                                dVar2.f8367l = onClickListener;
                                                aVar7.y();
                                                return yVar;
                                            } else {
                                                m9.o.o();
                                            }
                                        } else {
                                            string = romListActivity.getString(R.string.version_beta);
                                        }
                                    } else {
                                        string = romListActivity.getString(R.string.version_alpha);
                                    }
                                    string.getClass();
                                    if (string.length() != 0) {
                                        str3 = " ";
                                    }
                                    str = string + str3 + t0Var.B + "." + t0Var.L + "." + t0Var.R;
                                    dVar2.f8359d = romListActivity.getString(R.string.update_available, str);
                                    dVar2.f8361f = spannableStringBuilder;
                                    aVar7.v(R.string.update, new DialogInterface.OnClickListener() { // from class: bi.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i122) {
                                            int i132 = r3;
                                            pe.b bVar2 = bVar;
                                            RomListActivity romListActivity2 = romListActivity;
                                            switch (i132) {
                                                case 0:
                                                    int i142 = RomListActivity.D0;
                                                    romListActivity2.C(bVar2);
                                                    return;
                                                case DSiCameraSource.FrontCamera /* 1 */:
                                                    int i15 = RomListActivity.D0;
                                                    j0 A = romListActivity2.A();
                                                    bVar2.getClass();
                                                    hf.b bVar3 = A.f2300b;
                                                    bVar3.getClass();
                                                    SharedPreferences.Editor edit = bVar3.f6492c.edit();
                                                    edit.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                    edit.apply();
                                                    return;
                                                case 2:
                                                    int i16 = RomListActivity.D0;
                                                    romListActivity2.C(bVar2);
                                                    return;
                                                default:
                                                    int i17 = RomListActivity.D0;
                                                    j0 A2 = romListActivity2.A();
                                                    bVar2.getClass();
                                                    hf.b bVar4 = A2.f2300b;
                                                    bVar4.getClass();
                                                    SharedPreferences.Editor edit2 = bVar4.f6492c.edit();
                                                    edit2.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                    edit2.apply();
                                                    return;
                                            }
                                        }
                                    });
                                    aVar7.u(R.string.cancel, null);
                                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: bi.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i122) {
                                            int i132 = r3;
                                            pe.b bVar2 = bVar;
                                            RomListActivity romListActivity2 = romListActivity;
                                            switch (i132) {
                                                case 0:
                                                    int i142 = RomListActivity.D0;
                                                    romListActivity2.C(bVar2);
                                                    return;
                                                case DSiCameraSource.FrontCamera /* 1 */:
                                                    int i15 = RomListActivity.D0;
                                                    j0 A = romListActivity2.A();
                                                    bVar2.getClass();
                                                    hf.b bVar3 = A.f2300b;
                                                    bVar3.getClass();
                                                    SharedPreferences.Editor edit = bVar3.f6492c.edit();
                                                    edit.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                    edit.apply();
                                                    return;
                                                case 2:
                                                    int i16 = RomListActivity.D0;
                                                    romListActivity2.C(bVar2);
                                                    return;
                                                default:
                                                    int i17 = RomListActivity.D0;
                                                    j0 A2 = romListActivity2.A();
                                                    bVar2.getClass();
                                                    hf.b bVar4 = A2.f2300b;
                                                    bVar4.getClass();
                                                    SharedPreferences.Editor edit2 = bVar4.f6492c.edit();
                                                    edit2.putString("github_updates_skip_version", bVar2.f11618d.toString());
                                                    edit2.apply();
                                                    return;
                                            }
                                        }
                                    };
                                    dVar2.f8366k = dVar2.f8356a.getText(R.string.skip_update);
                                    dVar2.f8367l = onClickListener2;
                                    aVar7.y();
                                    return yVar;
                                }
                                throw w.d.k(it);
                            }
                        }
                    } else {
                        m9.o.i("input must not be null");
                    }
                    return null;
                }
                nc.k.f("markwon");
                throw null;
            default:
                oe.n nVar = (oe.n) this.Y;
                dc.a aVar8 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                l.g gVar3 = romListActivity.C0;
                if (gVar3 != null) {
                    if (nVar instanceof oe.m) {
                        View findViewById = gVar3.findViewById(R.id.progress_bar_download_progress);
                        findViewById.getClass();
                        ProgressBar progressBar = (ProgressBar) findViewById;
                        View findViewById2 = gVar3.findViewById(R.id.text_download_progress);
                        findViewById2.getClass();
                        oe.m mVar = (oe.m) nVar;
                        double d4 = mVar.f10949b;
                        double d10 = mVar.f10948a;
                        double d11 = 1024;
                        progressBar.setIndeterminate(false);
                        progressBar.setProgress((int) ((d4 / d10) * 100));
                        ((TextView) findViewById2).setText(romListActivity.getString(R.string.download_progress_sizes, Double.valueOf((d4 / d11) / d11), Double.valueOf((d10 / d11) / d11)));
                        return yVar;
                    } else if (nVar instanceof oe.k) {
                        gVar3.dismiss();
                        romListActivity.C0 = null;
                        return yVar;
                    } else if (nVar instanceof oe.l) {
                        gVar3.dismiss();
                        romListActivity.C0 = null;
                        Toast.makeText(romListActivity, (int) R.string.update_download_failed, 1).show();
                        return yVar;
                    } else {
                        m9.o.o();
                        return null;
                    }
                }
                return yVar;
        }
    }
}
