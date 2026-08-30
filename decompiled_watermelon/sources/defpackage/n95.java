package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureResult;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.common.workers.RetroArchShaderInstallWorker;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n95  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n95 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ n95(n95 n95Var, fa5 fa5Var) {
        this.A = 20;
        this.B = n95Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i;
        int i2;
        hm3 hm3Var;
        boolean isToggle;
        lv6 lv6Var;
        boolean toggleValue;
        jd0 c;
        float intBitsToFloat;
        int i3 = this.A;
        boolean z = true;
        Object obj2 = null;
        Boolean bool = null;
        Object obj3 = this.B;
        switch (i3) {
            case 0:
                du5 du5Var = (du5) obj3;
                k24 k24Var = (k24) obj;
                if (k24Var instanceof ra6) {
                    ra6 ra6Var = (ra6) k24Var;
                    if (ra6Var.getValue() != null) {
                        Object value = ra6Var.getValue();
                        value.getClass();
                        obj2 = du5Var.i(value);
                    }
                    ta6 e = ra6Var.e();
                    e.getClass();
                    return new tj4(obj2, e);
                }
                i.i("Failed requirement.");
                return null;
            case 1:
                ih ihVar = (ih) obj;
                ihVar.getClass();
                Iterator it = ((Map) obj3).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        CaptureResult.Key key = (CaptureResult.Key) entry.getKey();
                        key.getClass();
                        if (!tq0.F0((List) entry.getValue(), ihVar.A.get(key))) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                RetroArchShaderInstallWorker retroArchShaderInstallWorker = (RetroArchShaderInstallWorker) obj3;
                ze5 ze5Var = (ze5) obj;
                Context context = retroArchShaderInstallWorker.a;
                long currentTimeMillis = System.currentTimeMillis();
                if ((ze5Var instanceof ye5) || currentTimeMillis - retroArchShaderInstallWorker.h >= 250) {
                    retroArchShaderInstallWorker.h = currentTimeMillis;
                    if (ze5Var instanceof we5) {
                        gi1 gi1Var = ((we5) ze5Var).a;
                        long j = gi1Var.a;
                        long j2 = gi1Var.b;
                        ti4[] ti4VarArr = {new ti4("phase", "downloading"), new ti4("downloaded_bytes", Long.valueOf(j2)), new ti4("total_bytes", Long.valueOf(j))};
                        e81 e81Var = new e81(0, (byte) 0);
                        for (int i4 = 0; i4 < 3; i4++) {
                            ti4 ti4Var = ti4VarArr[i4];
                            e81Var.h(ti4Var.B, (String) ti4Var.A);
                        }
                        retroArchShaderInstallWorker.c(e81Var.e());
                        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        if (i5 > 0) {
                            i2 = (int) ((j2 * 100) / j);
                        } else {
                            i2 = 0;
                        }
                        String string = context.getString(R.string.video_retroarch_shader_downloading);
                        string.getClass();
                        if (i5 > 0) {
                            z = false;
                        }
                        retroArchShaderInstallWorker.b(retroArchShaderInstallWorker.g(string, i2, z));
                    } else if (ze5Var instanceof xe5) {
                        ti4 ti4Var2 = new ti4("phase", "extracting");
                        xe5 xe5Var = (xe5) ze5Var;
                        int i6 = xe5Var.a;
                        int i7 = xe5Var.b;
                        ti4[] ti4VarArr2 = {ti4Var2, new ti4("entries_done", Integer.valueOf(i6)), new ti4("entries_total", Integer.valueOf(i7))};
                        e81 e81Var2 = new e81(0, (byte) 0);
                        for (int i8 = 0; i8 < 3; i8++) {
                            ti4 ti4Var3 = ti4VarArr2[i8];
                            e81Var2.h(ti4Var3.B, (String) ti4Var3.A);
                        }
                        retroArchShaderInstallWorker.c(e81Var2.e());
                        if (i7 > 0) {
                            i = (i6 * 100) / i7;
                        } else {
                            i = 0;
                        }
                        String string2 = context.getString(R.string.video_retroarch_shader_extracting);
                        string2.getClass();
                        if (i7 > 0) {
                            z = false;
                        }
                        retroArchShaderInstallWorker.b(retroArchShaderInstallWorker.g(string2, i, z));
                    } else if (b53.x(ze5Var, ye5.a)) {
                        e81 e81Var3 = new e81(0, (byte) 0);
                        ti4 ti4Var4 = new ti4[]{new ti4("phase", "finalizing")}[0];
                        e81Var3.h(ti4Var4.B, (String) ti4Var4.A);
                        retroArchShaderInstallWorker.c(e81Var3.e());
                        String string3 = context.getString(R.string.video_retroarch_shader_finalizing);
                        string3.getClass();
                        retroArchShaderInstallWorker.b(retroArchShaderInstallWorker.g(string3, 100, true));
                    } else {
                        i.c();
                        return null;
                    }
                }
                return o27.a;
            case 3:
                Object N0 = tq0.N0(((Integer) obj).intValue(), ((ri5) obj3).a);
                if (!(N0 instanceof kh5)) {
                    return null;
                }
                return (kh5) N0;
            case 4:
                lm5 lm5Var = (lm5) obj;
                lm5Var.getClass();
                return ((String[]) obj3)[lm5Var.ordinal()];
            case 5:
                rg5 rg5Var = (rg5) obj;
                int i9 = RomDetailsActivity.I0;
                rg5Var.getClass();
                js1 A = ((r9) obj3).A();
                A.f = new is1(rg5Var);
                tq5.w(ua7.a(A), null, null, new ba1(A, rg5Var, null, 6), 3);
                return o27.a;
            case ig7.b /* 6 */:
                rg5 rg5Var2 = (rg5) obj;
                int i10 = RomListActivity.J0;
                rg5Var2.getClass();
                r9 r9Var = ((RomListActivity) obj3).D0;
                if (r9Var != null) {
                    js1 A2 = r9Var.A();
                    A2.f = new is1(rg5Var2);
                    tq5.w(ua7.a(A2), null, null, new ba1(A2, rg5Var2, null, 6), 3);
                    return o27.a;
                }
                b53.g0("emulatorLauncherValidatorDelegate");
                throw null;
            case 7:
                vh2 vh2Var = (vh2) obj;
                vh2Var.getClass();
                ((wd1) obj3).i = vh2Var;
                return o27.a;
            case 8:
                lt5 lt5Var = ((kt5) obj3).L;
                if (lt5Var != null) {
                    z = lt5Var.c(obj);
                }
                return Boolean.valueOf(z);
            case 9:
                fw5 fw5Var = (fw5) obj3;
                float floatValue = ((Float) obj).floatValue();
                qj4 qj4Var = fw5Var.a;
                float h = qj4Var.h() + floatValue + fw5Var.f;
                float l = io2.l(h, RecyclerView.A1, fw5Var.e.h());
                if (h != l) {
                    z = false;
                }
                float h2 = l - qj4Var.h();
                int round = Math.round(h2);
                qj4Var.i(qj4Var.h() + round);
                fw5Var.f = h2 - round;
                if (!z) {
                    floatValue = h2;
                }
                return Float.valueOf(floatValue);
            case 10:
                ax5 ax5Var = (ax5) obj3;
                return new mb4(ax5Var.c(ax5Var.k, ((mb4) obj).a, ax5Var.j));
            case 11:
                qh qhVar = (qh) obj3;
                rp4 rp4Var = (rp4) obj;
                long j3 = rp4Var.c;
                bq6 bq6Var = (bq6) qhVar.R;
                if (bq6Var.k() && bq6Var.n().a.B.length() != 0 && (hm3Var = bq6Var.d) != null && hm3Var.d() != null) {
                    qhVar.r(bq6Var.n(), j3, false, k45.j0);
                } else {
                    z = false;
                }
                if (z) {
                    rp4Var.a();
                }
                return o27.a;
            case mj2.L /* 12 */:
                obj.getClass();
                return ((d5) obj3).c();
            case 13:
                ShortcutSetupActivity shortcutSetupActivity = (ShortcutSetupActivity) obj3;
                rg5 rg5Var3 = (rg5) obj;
                int i11 = ShortcutSetupActivity.B0;
                rg5Var3.getClass();
                Intent intent = new Intent(shortcutSetupActivity.getPackageName() + ".LAUNCH_ROM");
                intent.putExtra("uri", rg5Var3.d.toString());
                tq5.w(hk2.y(shortcutSetupActivity), null, null, new zw5(shortcutSetupActivity, rg5Var3, intent, null, 3), 3);
                return o27.a;
            case 14:
                e76 e76Var = (e76) obj3;
                zz5 zz5Var = e76Var.f;
                zz5Var.getClass();
                if (!b53.x(e76Var.f, zz5Var)) {
                    or4.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                e24 e24Var = e76Var.e;
                Object obj4 = e76Var.c;
                if (e24Var == null) {
                    if (obj4 == null) {
                        e76Var.c = obj;
                    } else {
                        e24 e24Var2 = xu5.a;
                        e24 e24Var3 = new e24();
                        e24Var3.a(obj4);
                        e24Var3.a(obj);
                        e76Var.e = e24Var3;
                        e76Var.c = null;
                    }
                } else {
                    if (obj4 != null) {
                        or4.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    e24Var.a(obj);
                }
                return o27.a;
            case ig7.e /* 15 */:
                return Boolean.valueOf(b53.x(((q42) obj).a, (p96) obj3));
            case 16:
                bb6 bb6Var = (bb6) obj3;
                synchronized (bb6Var.g) {
                    ab6 ab6Var = bb6Var.i;
                    ab6Var.getClass();
                    Object obj5 = ab6Var.b;
                    obj5.getClass();
                    int i12 = ab6Var.d;
                    s14 s14Var = ab6Var.c;
                    if (s14Var == null) {
                        s14Var = new s14();
                        ab6Var.c = s14Var;
                        ab6Var.f.m(obj5, s14Var);
                    }
                    ab6Var.b(obj, i12, obj5, s14Var);
                }
                return o27.a;
            case 17:
                go goVar = (go) obj;
                ((aj2) obj3).j(goVar.e.getValue(), dt3.g0.b.n(goVar.f));
                return o27.a;
            case 18:
                Drawable drawable = (Drawable) obj3;
                hk1 hk1Var = (hk1) obj;
                oh0 s = hk1Var.I().s();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (hk1Var.d() >> 32)), (int) Float.intBitsToFloat((int) (hk1Var.d() & 4294967295L)));
                drawable.draw(jd.a(s));
                return o27.a;
            case 19:
                ((mi2) obj).n((xn6) obj3);
                return o27.a;
            case 20:
                n95 n95Var = (n95) obj3;
                zx6 zx6Var = (zx6) obj;
                if (zx6Var instanceof z9) {
                    n95Var.n(((z9) zx6Var).j0);
                    return Boolean.TRUE;
                }
                i.n("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 21:
                up6 up6Var = (up6) obj3;
                float floatValue2 = ((Float) obj).floatValue();
                pj4 pj4Var = up6Var.a;
                float h3 = pj4Var.h() + floatValue2;
                pj4 pj4Var2 = up6Var.b;
                if (h3 > pj4Var2.h()) {
                    floatValue2 = pj4Var2.h() - pj4Var.h();
                } else if (h3 < RecyclerView.A1) {
                    floatValue2 = -pj4Var.h();
                }
                pj4Var.i(pj4Var.h() + floatValue2);
                return Float.valueOf(floatValue2);
            case 22:
                rr6 rr6Var = (rr6) obj3;
                so soVar = (so) obj;
                po poVar = (po) soVar.a;
                if (poVar instanceof mo3) {
                    mo3 mo3Var = (mo3) poVar;
                    if (mo3Var.b == null) {
                        return so.a(soVar, new mo3(mo3Var.a, rr6Var), 0, 14);
                    }
                }
                if (poVar instanceof lo3) {
                    lo3 lo3Var = (lo3) poVar;
                    if (lo3Var.b == null) {
                        return so.a(soVar, new lo3(lo3Var.a, rr6Var), 0, 14);
                    }
                    return soVar;
                }
                return soVar;
            case 23:
                rz5 rz5Var = (rz5) obj3;
                ch chVar = (ch) obj;
                isToggle = chVar.a.isToggle();
                if (isToggle) {
                    toggleValue = chVar.a.getToggleValue();
                    bool = Boolean.valueOf(toggleValue);
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        lv6Var = lv6.On;
                    } else {
                        lv6Var = lv6.Off;
                    }
                    l93[] l93VarArr = pz5.a;
                    qz5 qz5Var = mz5.K;
                    l93 l93Var = pz5.a[26];
                    rz5Var.b(qz5Var, lv6Var);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                Throwable th = (Throwable) obj;
                ((ew6) obj3).j = null;
                return o27.a;
            case 25:
                uy6 uy6Var = (uy6) obj3;
                ro0 ro0Var = (ro0) obj;
                ro0Var.getClass();
                ro0.a(ro0Var, "first", uy6Var.a.e());
                ro0.a(ro0Var, "second", uy6Var.b.e());
                ro0.a(ro0Var, "third", uy6Var.c.e());
                return o27.a;
            case 26:
                bd0 bd0Var = (bd0) obj;
                bd0Var.getClass();
                ke0 ke0Var = ((j57) obj3).a;
                synchronized (ke0Var.c) {
                    if (!ke0Var.d) {
                        StringBuilder sb = new StringBuilder("CameraGraph-");
                        cw cwVar = hd0.b;
                        cwVar.getClass();
                        sb.append(cw.b.incrementAndGet(cwVar));
                        c = ke0Var.c(bd0Var, new hd0(sb.toString()));
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                return c;
            case 27:
                Throwable th2 = (Throwable) obj;
                for (hc1 hc1Var : (List) obj3) {
                    hc1Var.b();
                }
                return o27.a;
            case 28:
                jd7 jd7Var = (jd7) obj3;
                hk1 hk1Var2 = (hk1) obj;
                hk1Var2.getClass();
                long floatToRawIntBits = (Float.floatToRawIntBits(17.0f * intBitsToFloat) << 32) | (Float.floatToRawIntBits(11.0f * intBitsToFloat) & 4294967295L);
                float intBitsToFloat2 = 3.0f * (Float.intBitsToFloat((int) (hk1Var2.d() & 4294967295L)) / 24.0f);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                hk1.u(hk1Var2, jd7Var.j, 0L, floatToRawIntBits, floatToRawIntBits2, RecyclerView.A1, 240);
                hk1.u(hk1Var2, jd7Var.l, (Float.floatToRawIntBits(13.0f * intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.A1) << 32), floatToRawIntBits, floatToRawIntBits2, RecyclerView.A1, 240);
                for (ti4 ti4Var5 : nd7.b) {
                    hk1Var2.S(nd7.a, (Float.floatToRawIntBits((((Number) ti4Var5.A).floatValue() - 0.8f) * intBitsToFloat) << 32) | (Float.floatToRawIntBits((((Number) ti4Var5.B).floatValue() - 1.1f) * intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(1.6f * intBitsToFloat) << 32) | (Float.floatToRawIntBits(2.2f * intBitsToFloat) & 4294967295L), r72.a);
                }
                return o27.a;
            default:
                hk1 hk1Var3 = (hk1) obj;
                hk1Var3.getClass();
                hk1.y0(hk1Var3, (zn3) obj3, 0L, 0L, RecyclerView.A1, null, 126);
                return o27.a;
        }
    }

    public /* synthetic */ n95(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }
}
