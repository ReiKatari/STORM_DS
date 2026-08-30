package a9;

import a4.n;
import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import cd.q1;
import d1.i0;
import f2.p0;
import f2.q0;
import f2.t;
import fj.z;
import j7.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import kf.r0;
import mc.p;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement;
import me.magnum.melonds.ui.romlist.RomListActivity;
import n2.f1;
import oe.d0;
import p8.v;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends ec.j implements p {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.Y = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                cc.c cVar = (cc.c) obj2;
                y yVar = y.f14813a;
                ((k) t(cVar, (t8.c) obj)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                cc.c cVar2 = (cc.c) obj2;
                y yVar2 = y.f14813a;
                ((k) t(cVar2, (y) obj)).v(yVar2);
                return yVar2;
            case 2:
                cc.c cVar3 = (cc.c) obj2;
                y yVar3 = y.f14813a;
                ((k) t(cVar3, (d0) obj)).v(yVar3);
                return yVar3;
            case 3:
                return ((k) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 4:
                return ((k) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8511g /* 5 */:
                cc.c cVar4 = (cc.c) obj2;
                y yVar4 = y.f14813a;
                ((k) t(cVar4, (u) obj)).v(yVar4);
                return yVar4;
            case l1.c.f8509e /* 6 */:
                return ((k) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 7:
                cc.c cVar5 = (cc.c) obj2;
                y yVar5 = y.f14813a;
                ((k) t(cVar5, (u) obj)).v(yVar5);
                return yVar5;
            case 8:
                cc.c cVar6 = (cc.c) obj2;
                y yVar6 = y.f14813a;
                ((k) t(cVar6, (u) obj)).v(yVar6);
                return yVar6;
            default:
                cc.c cVar7 = (cc.c) obj2;
                y yVar7 = y.f14813a;
                ((k) t(cVar7, (u) obj)).v(yVar7);
                return yVar7;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new k(0, cVar, (x8.p) this.Y);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new k(1, cVar, (RomListActivity) this.Y);
            case 2:
                return new k(2, cVar, (me.magnum.melonds.ui.romlist.a) this.Y);
            case 3:
                return new k(3, cVar, (e9.e) this.Y);
            case 4:
                return new k(4, cVar, (f2.p) this.Y);
            case l1.c.f8511g /* 5 */:
                return new k(5, cVar, (s9.a) this.Y);
            case l1.c.f8509e /* 6 */:
                return new k(6, cVar, (List) this.Y);
            case 7:
                return new k(7, cVar, (r0) this.Y);
            case 8:
                return new k(8, cVar, (n) this.Y);
            default:
                return new k(9, cVar, (xg.h) this.Y);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, fj.e0] */
    @Override // ec.a
    public final Object v(Object obj) {
        String str;
        TextClassificationContext build;
        TextClassifier createTextClassificationSession;
        RASimpleRuntimeAchievement rASimpleRuntimeAchievement;
        int i2;
        int i10;
        boolean z10 = false;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                String str2 = l.f675a;
                v.e().a(str2, "Constraints changed for " + ((x8.p) this.Y));
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                int i11 = RomListActivity.D0;
                bk.a aVar3 = new bk.a((RomListActivity) this.Y);
                aVar3.w(R.string.error_invalid_directory);
                aVar3.t(R.string.error_invalid_directory_description);
                aVar3.v(R.string.ok, null);
                ((l.d) aVar3.L).m = true;
                aVar3.y();
                return y.f14813a;
            case 2:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                bi.y yVar = ((me.magnum.melonds.ui.romlist.a) this.Y).f9574b0;
                if (yVar != null) {
                    o.c(new bi.u(yVar.f2327i.size())).a(yVar);
                    return y.f14813a;
                }
                nc.k.f("romListAdapter");
                throw null;
            case 3:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                e9.e eVar = (e9.e) this.Y;
                synchronized (eVar) {
                    if (eVar.f4432f0 && !eVar.f4433g0) {
                        try {
                            eVar.G();
                        } catch (IOException unused) {
                            eVar.f4434h0 = true;
                        }
                        try {
                            if (eVar.f4429c0 >= 2000) {
                                z10 = true;
                            }
                            if (z10) {
                                eVar.I();
                            }
                        } catch (IOException unused2) {
                            eVar.f4435i0 = true;
                            eVar.f4430d0 = new z(new Object());
                        }
                        return y.f14813a;
                    }
                    return y.f14813a;
                }
            case 4:
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                f2.p pVar = (f2.p) this.Y;
                Context context = pVar.f4769b;
                t tVar = pVar.f4770c;
                TextClassificationManager l10 = c3.p.l(context.getSystemService(c3.p.o()));
                int i12 = q0.f4776a[tVar.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        str = "textview";
                    } else {
                        m9.o.o();
                        return null;
                    }
                } else {
                    str = "edittext";
                }
                p0.n();
                build = a6.j.j(context.getPackageName(), str).build();
                createTextClassificationSession = l10.createTextClassificationSession(build);
                pVar.f4773f = createTextClassificationSession;
                return createTextClassificationSession;
            case l1.c.f8511g /* 5 */:
                dc.a aVar7 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                ((s9.a) this.Y).c(false);
                return y.f14813a;
            case l1.c.f8509e /* 6 */:
                dc.a aVar8 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                RASimpleRuntimeAchievement[] runtimeAchievements = MelonEmulator.f9466a.getRuntimeAchievements();
                List<xe.o> list = (List) this.Y;
                ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
                for (xe.o oVar : list) {
                    int length = runtimeAchievements.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            rASimpleRuntimeAchievement = runtimeAchievements[i13];
                            if (rASimpleRuntimeAchievement.getId() != oVar.f14585a.f11012a) {
                                i13++;
                            }
                        } else {
                            rASimpleRuntimeAchievement = null;
                        }
                    }
                    if (rASimpleRuntimeAchievement != null) {
                        i2 = rASimpleRuntimeAchievement.getValue();
                    } else {
                        i2 = 0;
                    }
                    if (rASimpleRuntimeAchievement != null) {
                        i10 = rASimpleRuntimeAchievement.getTarget();
                    } else {
                        i10 = 0;
                    }
                    arrayList.add(new xe.n(oVar, i2, i10));
                }
                return arrayList;
            case 7:
                dc.a aVar9 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r0 r0Var = (r0) this.Y;
                File file = new File(r0Var.f8263a.getFilesDir(), "backgrounds.json");
                try {
                    String e6 = r0Var.f8264b.e(p7.k.l((List) r0Var.f8267e.getValue()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
                    outputStreamWriter.write(e6);
                    outputStreamWriter.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return y.f14813a;
            case 8:
                dc.a aVar10 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                n nVar = (n) this.Y;
                if (((Boolean) ((f1) nVar.R).getValue()).booleanValue()) {
                    ((mc.a) nVar.B).b();
                } else {
                    ((i0) nVar.L).f3596c.setValue(Boolean.TRUE);
                }
                return y.f14813a;
            default:
                dc.a aVar11 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                q1 q1Var = ((xg.h) this.Y).f14610e;
                yg.c cVar = yg.c.f14820a;
                q1Var.getClass();
                q1Var.k(null, cVar);
                return y.f14813a;
        }
    }
}
