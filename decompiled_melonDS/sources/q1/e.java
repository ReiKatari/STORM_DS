package q1;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import androidx.work.impl.WorkDatabase;
import b4.b1;
import j0.f2;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import l4.q0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import n2.w0;
import p1.i0;
import u1.h1;
import u1.o1;
import u1.s0;
import w.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ e(o1 o1Var, l4.f fVar, b1 b1Var) {
        this.A = 6;
        this.B = fVar;
        this.L = b1Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [nc.t, java.lang.Object] */
    private final Object a() {
        int i2;
        long a10;
        int i10;
        wi.x[] xVarArr;
        wi.b0 b0Var = (wi.b0) this.L;
        ?? obj = new Object();
        wi.p pVar = (wi.p) ((ai.i) this.B).L;
        synchronized (pVar.f14273q0) {
            synchronized (pVar) {
                wi.b0 b0Var2 = pVar.f14269l0;
                wi.b0 b0Var3 = new wi.b0();
                b0Var2.getClass();
                for (int i11 = 0; i11 < 10; i11++) {
                    if (((1 << i11) & b0Var2.f14224a) != 0) {
                        b0Var3.b(i11, b0Var2.f14225b[i11]);
                    }
                }
                for (int i12 = 0; i12 < 10; i12++) {
                    if (((1 << i12) & b0Var.f14224a) != 0) {
                        b0Var3.b(i12, b0Var.f14225b[i12]);
                    }
                }
                obj.A = b0Var3;
                a10 = b0Var3.a() - b0Var2.a();
                i10 = (a10 > 0L ? 1 : (a10 == 0L ? 0 : -1));
                if (i10 != 0 && !pVar.B.isEmpty()) {
                    xVarArr = (wi.x[]) pVar.B.values().toArray(new wi.x[0]);
                    wi.b0 b0Var4 = (wi.b0) obj.A;
                    b0Var4.getClass();
                    pVar.f14269l0 = b0Var4;
                    si.b.b(pVar.f14261d0, pVar.L + " onSettings", new e(13, pVar, (Object) obj));
                }
                xVarArr = null;
                wi.b0 b0Var42 = (wi.b0) obj.A;
                b0Var42.getClass();
                pVar.f14269l0 = b0Var42;
                si.b.b(pVar.f14261d0, pVar.L + " onSettings", new e(13, pVar, (Object) obj));
            }
            try {
                pVar.f14273q0.d((wi.b0) obj.A);
            } catch (IOException e6) {
                wi.c cVar = wi.c.PROTOCOL_ERROR;
                pVar.d(cVar, cVar, e6);
            }
        }
        if (xVarArr != null) {
            for (wi.x xVar : xVarArr) {
                synchronized (xVar) {
                    xVar.X += a10;
                    if (i10 > 0) {
                        xVar.notifyAll();
                    }
                }
            }
        }
        return yb.y.f14813a;
    }

    @Override // mc.a
    public final Object b() {
        String str;
        CameraCharacteristics.Key key;
        String text;
        Intent intent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        boolean z10 = true;
        int i2 = 0;
        switch (this.A) {
            case 0:
                a0 a0Var = (a0) this.L;
                p pVar = (p) ((n2.e0) this.B).getValue();
                return new q(a0Var, pVar, new c8.c0((sc.d) ((i0) a0Var.f12096d.f12199f).getValue(), pVar));
            case DSiCameraSource.FrontCamera /* 1 */:
                ((mc.a) this.B).b();
                ((rg.d) this.L).a();
                return yb.y.f14813a;
            case 2:
                me.magnum.melonds.ui.layouteditor.b bVar = (me.magnum.melonds.ui.layouteditor.b) this.B;
                sh.b bVar2 = (sh.b) this.L;
                rh.t tVar = bVar.f9541b0;
                if (tVar != null) {
                    sh.d dVar = bVar.A;
                    UUID uuid = bVar2.f12921a;
                    dVar.getClass();
                    LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) ((rd.k) tVar).B;
                    int i10 = LayoutEditorActivity.K0;
                    layoutEditorActivity.B();
                    Intent intent2 = new Intent(layoutEditorActivity, BackgroundsActivity.class);
                    if (uuid != null) {
                        str = uuid.toString();
                    } else {
                        str = null;
                    }
                    intent2.putExtra("initial_background_id", str);
                    int i11 = rh.f.f12742a[dVar.ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            layoutEditorActivity.I0.a(intent2);
                        } else {
                            m9.o.o();
                            return null;
                        }
                    } else {
                        layoutEditorActivity.H0.a(intent2);
                    }
                }
                return yb.y.f14813a;
            case 3:
                he.g gVar = (he.g) this.B;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.L;
                synchronized (t8.g.f13144b) {
                    LinkedHashMap linkedHashMap = t8.g.f13145c;
                    linkedHashMap.remove(gVar);
                    if (linkedHashMap.isEmpty()) {
                        p8.v.e().a(t8.h.f13149a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(t8.g.f13143a);
                        t8.g.f13148f = false;
                        t8.g.f13146d = null;
                        t8.g.f13147e = false;
                    }
                }
                return yb.y.f14813a;
            case 4:
                q4.x xVar = (q4.x) this.B;
                w0 w0Var = (w0) this.L;
                if (!q0.b(xVar.f12277b, ((q4.x) w0Var.getValue()).f12277b) || !nc.k.a(xVar.f12278c, ((q4.x) w0Var.getValue()).f12278c)) {
                    w0Var.setValue(xVar);
                }
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                o1 o1Var = (o1) this.B;
                l4.h hVar = (l4.h) this.L;
                if (o1Var != null) {
                    z2.p pVar2 = o1Var.f13378c;
                    boolean isEmpty = pVar2.isEmpty();
                    l4.h hVar2 = o1Var.f13377b;
                    if (!isEmpty) {
                        s0 s0Var = new s0(hVar2);
                        int size = pVar2.size();
                        while (i2 < size) {
                            ((mc.l) pVar2.get(i2)).k(s0Var);
                            i2++;
                        }
                        hVar2 = s0Var.f13425b;
                    }
                    o1Var.f13377b = hVar2;
                    if (hVar2 != null) {
                        return hVar2;
                    }
                    return hVar;
                }
                return hVar;
            case l1.c.f8509e /* 6 */:
                b1 b1Var = (b1) this.L;
                l4.p pVar3 = (l4.p) ((l4.f) this.B).f8790a;
                if (pVar3 instanceof l4.o) {
                    try {
                        String str2 = ((l4.o) pVar3).f8863a;
                        b1Var.getClass();
                        try {
                            b1Var.f1792a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                        } catch (ActivityNotFoundException e6) {
                            throw new IllegalArgumentException(kc.a.c('.', "Can't open ", str2), e6);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return yb.y.f14813a;
            case 7:
                u8.a aVar = (u8.a) this.L;
                v8.e eVar = ((u8.b) this.B).f13504a;
                eVar.getClass();
                synchronized (eVar.f13765d) {
                    if (((LinkedHashSet) eVar.f13767f).remove(aVar) && ((LinkedHashSet) eVar.f13767f).isEmpty()) {
                        eVar.h();
                    }
                }
                return yb.y.f14813a;
            case 8:
                ((mc.l) this.B).k(Float.valueOf(((n2.b1) this.L).g()));
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                ((ConnectivityManager) this.B).unregisterNetworkCallback((l9.f) this.L);
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                List<f2> list = (List) this.L;
                x.j jVar = ((w.b1) this.B).m;
                j0.g gVar2 = z0.f14105a;
                jVar.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                    long[] jArr = (long[]) jVar.a(key);
                    if (jArr != null && jArr.length != 0) {
                        HashSet hashSet = new HashSet();
                        for (long j2 : jArr) {
                            hashSet.add(Long.valueOf(j2));
                        }
                        for (f2 f2Var : list) {
                            if (!hashSet.contains(Long.valueOf(f2Var.f7198c.getValue()))) {
                            }
                        }
                        return Boolean.valueOf(z10);
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
            case 11:
                wi.p pVar4 = (wi.p) this.B;
                wi.x xVar2 = (wi.x) this.L;
                try {
                    pVar4.A.b(xVar2);
                } catch (IOException e10) {
                    zi.f fVar = zi.f.f15151a;
                    zi.f.f15151a.i("Http2Connection.Listener failure for " + pVar4.L, 4, e10);
                    try {
                        xVar2.c(wi.c.PROTOCOL_ERROR, e10);
                    } catch (IOException unused2) {
                    }
                }
                return yb.y.f14813a;
            case 12:
                return a();
            case 13:
                wi.p pVar5 = (wi.p) this.B;
                pVar5.A.a(pVar5, (wi.b0) ((nc.t) this.L).A);
                return yb.y.f14813a;
            case 14:
                q8.p pVar6 = (q8.p) this.B;
                WorkDatabase workDatabase = pVar6.f12373c;
                workDatabase.getClass();
                workDatabase.o(new a2.n(29, new w.g(7, pVar6, (UUID) this.L)));
                q8.i.b(pVar6.f12372b, pVar6.f12373c, pVar6.f12375e);
                return yb.y.f14813a;
            case l1.c.f8512h /* 15 */:
                return ((h1) this.B).k((WorkDatabase) this.L);
            case 16:
                ((nc.t) this.B).A = ((mc.a) this.L).b();
                return yb.y.f14813a;
            case 17:
                return new x4.j(p7.n.u(((b2.g) this.B).h0((y3.z) ((mc.a) this.L).b())));
            case 18:
                ((x1.d) this.B).f14327d.k((x1.g) this.L);
                return yb.y.f14813a;
            default:
                Context context = (Context) this.B;
                TextClassification textClassification = (TextClassification) this.L;
                text = textClassification.getText();
                if (text != null) {
                    i2 = text.hashCode();
                }
                intent = textClassification.getIntent();
                PendingIntent activity = PendingIntent.getActivity(context, i2, intent, 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e11) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e11);
                    }
                } else {
                    activity.send();
                }
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ e(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }
}
