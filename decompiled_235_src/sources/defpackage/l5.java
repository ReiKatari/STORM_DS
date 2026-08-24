package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.io.File;
import java.io.Serializable;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l5  reason: default package */
/* loaded from: classes.dex */
public final class l5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(ut3 ut3Var, tt3 tt3Var, eo2 eo2Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 29;
        this.d0 = ut3Var;
        this.f0 = tt3Var;
        this.e0 = eo2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r8.e(r7) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object A(Object obj) {
        hb4 hb4Var;
        eo2 eo2Var;
        Throwable th;
        fb4 fb4Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        fb4Var = (fb4) this.Z;
                        try {
                            oi2.Y(obj);
                            fb4Var.h(null);
                            return jg7.a;
                        } catch (Throwable th2) {
                            th = th2;
                            fb4Var.h(null);
                            throw th;
                        }
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eo2Var = (eo2) ((hw6) this.d0);
                oi2.Y(obj);
                hb4Var = (fb4) this.Z;
            } else {
                oi2.Y(obj);
                hb4Var = (hb4) this.f0;
                eo2Var = (eo2) this.e0;
                this.Z = hb4Var;
                this.d0 = (hw6) eo2Var;
                this.Y = 1;
            }
            bf4 bf4Var = new bf4(eo2Var, null, 10);
            this.Z = hb4Var;
            this.d0 = null;
            this.Y = 2;
            if (g04.C(bf4Var, this) != x61Var) {
                fb4Var = hb4Var;
                fb4Var.h(null);
                return jg7.a;
            }
            return x61Var;
        } catch (Throwable th3) {
            hb4 hb4Var2 = hb4Var;
            th = th3;
            fb4Var = hb4Var2;
            fb4Var.h(null);
            throw th;
        }
    }

    private final Object v(Object obj) {
        Object em5Var;
        em5 em5Var2;
        Object b;
        String str;
        l61 l61Var = this.B;
        Map map = (Map) this.d0;
        l85 l85Var = (l85) this.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        hb5 hb5Var = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String encode = URLEncoder.encode((String) entry.getKey(), "utf-8");
                    String encode2 = URLEncoder.encode((String) entry.getValue(), "utf-8");
                    arrayList.add(encode + "=" + encode2);
                }
                String P0 = gt0.P0(arrayList, "&", null, null, null, 62);
                s9 s9Var = new s9(13);
                int i2 = mk5.a;
                xh5 xh5Var = n34.d;
                s9Var.D("POST", jx2.q(P0, xk2.k("application/x-www-form-urlencoded")));
                cn5 cn5Var = l85Var.e;
                en5 en5Var = cn5Var.c;
                if (en5Var == null) {
                    en5Var = cn5Var.a();
                }
                String str2 = en5Var.d;
                if (str2 != null) {
                    s9Var.I(str2);
                    pa paVar = new pa(s9Var);
                    String str3 = (String) map.get("u");
                    if (str3 != null && (str = (String) map.get("t")) != null) {
                        hb5Var = new hb5(str3, str);
                    }
                    this.Y = 1;
                    obj = l85Var.f(paVar, hb5Var, true, this);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                } else {
                    throw new IllegalStateException("RAOfflineProxy is selected but no active loopback host is available");
                }
            }
            em5Var = (wl5) obj;
        } catch (Throwable th) {
            l61Var.getClass();
            yh2.o(l61Var);
            em5Var = new em5(th);
        }
        ar0 ar0Var = (ar0) this.e0;
        qn2 qn2Var = (qn2) this.f0;
        if (!(em5Var instanceof em5)) {
            try {
                oi2.Y(em5Var);
                wl5 wl5Var = (wl5) em5Var;
                b = l85.b(l85Var, ar0Var, wl5Var, qn2Var);
                wl5Var.close();
            } catch (Throwable th2) {
                l61Var.getClass();
                yh2.o(l61Var);
                em5Var2 = new em5(th2);
            }
            return new hm5(b);
        }
        Throwable a = hm5.a(em5Var);
        a.getClass();
        em5Var2 = new em5(a);
        b = em5Var2;
        return new hm5(b);
    }

    private final Object x(Object obj) {
        tu0 tu0Var;
        tu0 tu0Var2 = (tu0) this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            if (i != 0) {
                if (i == 1) {
                    tu0Var = (tu0) this.Z;
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                this.Z = tu0Var2;
                this.Y = 1;
                obj = ad5.a((ad5) this.e0, (fd5) this.f0, this);
                if (obj == x61Var) {
                    return x61Var;
                }
                tu0Var = tu0Var2;
            }
            tu0Var.b0(obj);
        } catch (CancellationException e) {
            tu0Var2.s(e);
            throw e;
        } catch (Throwable th) {
            tu0Var2.v0(th);
        }
        return jg7.a;
    }

    private final Object z(Object obj) {
        Intent intent = (Intent) this.Z;
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ic1 ic1Var = ic1.a;
                    ad adVar = new ad((ReleaseStateCommandReceiver) this.e0, (Context) this.f0, intent, null, 3);
                    this.Y = 1;
                    if (ic1Var.a(adVar, this) == x61Var) {
                        return x61Var;
                    }
                }
            } catch (Exception e) {
                String action = intent.getAction();
                Log.w("DebugCommand", "Release state command failed: action=" + action, e);
            }
            pendingResult.finish();
            return jg7.a;
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((l5) q((r41) obj2, (rj) obj)).s(jg7Var);
            case 2:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 5:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((l5) q((r41) obj2, (q35) obj)).s(jg7Var);
            case 12:
                return ((l5) q((r41) obj2, new gm0(((gm0) obj).a))).s(jg7Var);
            case 13:
                return ((l5) q((r41) obj2, (ch6) obj)).s(jg7Var);
            case 14:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 15:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 16:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 17:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 18:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 19:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 20:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 22:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED /* 23 */:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 25:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case SubAllocator.N4 /* 26 */:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 27:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 28:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((l5) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        switch (i) {
            case 0:
                return new l5((eo2) this.e0, (ta5) obj2, (qa4) this.d0, r41Var);
            case 1:
                l5 l5Var = new l5((qn2) this.d0, (ki) this.e0, (et3) obj2, r41Var, 1);
                l5Var.Z = obj;
                return l5Var;
            case 2:
                return new l5(this.e0, (gn) obj2, (qa4) this.Z, (qa4) this.d0, r41Var);
            case 3:
                return new l5((gl6) this.Z, (Resources) this.d0, (Cheat) this.e0, (aq0) obj2, r41Var, 3);
            case 4:
                return new l5((cp2) this.d0, (aq0) this.e0, (String) obj2, r41Var, 4);
            case 5:
                return new l5((dx0) this.Z, (ScrollCaptureSession) this.d0, (Rect) this.e0, (Consumer) obj2, r41Var, 5);
            case 6:
                return new l5((ww2) this.Z, (yw7) this.d0, (AtomicInteger) this.e0, (gx3) obj2, r41Var, 6);
            case 7:
                return new l5((ConstraintTrackingWorker) this.Z, (nx3) this.d0, (ww2) this.e0, (yw7) obj2, r41Var, 7);
            case 8:
                return new l5((hu1) this.Z, (sz1) this.d0, (dy1) this.e0, (c46) obj2, r41Var, 8);
            case 9:
                return new l5((nv4) this.Z, (sz1) this.d0, (pq5) this.e0, (v80) obj2, r41Var, 9);
            case 10:
                return new l5((sz1) this.Z, (String) this.d0, (String) this.e0, (vj4) obj2, r41Var, 10);
            case 11:
                l5 l5Var2 = new l5((ut3) this.d0, (tt3) this.e0, (le2) obj2, r41Var, 11);
                l5Var2.Z = obj;
                return l5Var2;
            case 12:
                l5 l5Var3 = new l5((dh5) this.e0, (ne2) obj2, r41Var);
                l5Var3.d0 = obj;
                return l5Var3;
            case 13:
                l5 l5Var4 = new l5((le2) this.d0, (na4) this.e0, this.f0, r41Var, 13);
                l5Var4.Z = obj;
                return l5Var4;
            case 14:
                return new l5((eh6) this.Z, (le2) this.d0, (na4) this.e0, this.f0, r41Var, 14);
            case 15:
                return new l5((f13) this.Z, (String) this.d0, (String) this.e0, (String) obj2, r41Var, 15);
            case 16:
                return new l5((hq2) this.Z, (Bitmap) this.d0, (String) this.e0, (List) obj2, r41Var, 16);
            case 17:
                return new l5((String) this.Z, (String) this.d0, (String) this.e0, (String) obj2, r41Var, 17);
            case 18:
                l5 l5Var5 = new l5((qa4) this.Z, (g53) obj2, r41Var);
                l5Var5.e0 = obj;
                return l5Var5;
            case 19:
                return new l5((UUID) this.e0, (qa4) this.d0, (qa4) obj2, r41Var);
            case 20:
                return new l5((na4) this.Z, (gl6) this.d0, (Resources) this.e0, (qn2) obj2, r41Var, 20);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                l5 l5Var6 = new l5((d51) obj2, (eo2) this.e0, r41Var, 21);
                l5Var6.d0 = obj;
                return l5Var6;
            case 22:
                l5 l5Var7 = new l5((n96) this.d0, (sb4) this.e0, (ga7) obj2, r41Var, 22);
                l5Var7.Z = obj;
                return l5Var7;
            case ConnectionResult.API_DISABLED /* 23 */:
                return new l5((oj4) this.Z, (String) this.d0, (String) this.e0, (yi4) obj2, r41Var, 23);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new l5((zx4) obj2, (eo2) this.e0, r41Var, 24);
            case 25:
                return new l5((l85) this.Z, (Map) this.d0, (ar0) this.e0, (qn2) obj2, r41Var, 25);
            case SubAllocator.N4 /* 26 */:
                return new l5((tu0) this.d0, (ad5) this.e0, (fd5) obj2, r41Var, 26);
            case 27:
                return new l5((Intent) this.Z, (BroadcastReceiver.PendingResult) this.d0, (ReleaseStateCommandReceiver) this.e0, (Context) obj2, r41Var, 27);
            case 28:
                return new l5((hb4) obj2, (eo2) this.e0, r41Var, 28);
            default:
                l5 l5Var8 = new l5((ut3) this.d0, (tt3) obj2, (eo2) this.e0, r41Var);
                l5Var8.Z = obj;
                return l5Var8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0293, code lost:
        if (r0 == r6) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ca, code lost:
        if (defpackage.kj2.l(r5, androidx.recyclerview.widget.RecyclerView.B1, r2, r7, r26, 4) == r6) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02cd, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0459, code lost:
        if (defpackage.f04.C(r3, r6, r26) == r0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x054d, code lost:
        if (r0.b(r2, r26) == r3) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0569, code lost:
        if (defpackage.f04.C(r1, r6, r26) == r3) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0572, code lost:
        if (r0.b(r2, r26) == r3) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x059d, code lost:
        if (defpackage.f04.v(r5, r18, r26) == r3) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x085d, code lost:
        if (r3 == r2) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0235, code lost:
        if (r0 == r13) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:512:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, ah5] */
    /* JADX WARN: Type inference failed for: r6v17, types: [hw6, eo2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:199:0x043e -> B:203:0x045d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x0459 -> B:203:0x045d). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object o;
        Object obj2;
        Object b;
        Object obj3;
        Object e;
        cp2 cp2Var;
        hp0 hp0Var;
        cp2 cp2Var2;
        Object a;
        Object a2;
        Object d0;
        dh5 dh5Var;
        em0 em0Var;
        Throwable th;
        dh5 dh5Var2;
        Object j;
        w61 w61Var;
        ah5 ah5Var;
        w61 w61Var2;
        ah5 ah5Var2;
        qa4 qa4Var;
        Object o2;
        fb4 fb4Var;
        eo2 eo2Var;
        fb4 fb4Var2;
        Object em5Var;
        Object d02;
        ti4 ti4Var;
        long j2;
        Object obj4;
        int i;
        zx4 zx4Var;
        fb4 fb4Var3;
        Object N;
        boolean isDestroyed;
        fb4 fb4Var4;
        Throwable th2;
        Object N2;
        int i2 = this.X;
        Object obj5 = jg7.a;
        Object obj6 = this.f0;
        Object obj7 = null;
        switch (i2) {
            case 0:
                qa4 qa4Var2 = (qa4) this.d0;
                Object obj8 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qa4Var2 = (qa4) this.Z;
                        oi2.Y(obj);
                        o = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qa4Var2.setValue(qs3.b);
                    this.Z = qa4Var2;
                    this.Y = 1;
                    o = ((eo2) this.e0).o((ta5) obj6, this);
                    if (o == obj8) {
                        return obj8;
                    }
                }
                Object obj9 = ((hm5) o).A;
                if (hm5.a(obj9) == null) {
                    obj2 = new rs3((ya5) obj9);
                } else {
                    obj2 = qs3.a;
                }
                qa4Var2.setValue(obj2);
                return obj5;
            case 1:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ji jiVar = new ji((rj) this.Z, (qn2) this.d0, (ki) this.e0, (et3) obj6, null, 0);
                    this.Y = 1;
                    if (g04.C(jiVar, this) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            case 2:
                gn gnVar = (gn) obj6;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (!nb3.k(this.e0, gnVar.e.getValue())) {
                        Object obj10 = this.e0;
                        io6 io6Var = in.a;
                        this.Y = 1;
                        if (gn.c((gn) obj6, obj10, (to) ((qa4) this.Z).getValue(), null, this, 12) == x61Var2) {
                            return x61Var2;
                        }
                    }
                    return obj5;
                }
                io6 io6Var2 = in.a;
                qn2 qn2Var = (qn2) ((qa4) this.d0).getValue();
                if (qn2Var != null) {
                    qn2Var.g(gnVar.d());
                }
                return obj5;
            case 3:
                int i6 = 0;
                Cheat cheat = (Cheat) this.e0;
                Resources resources = (Resources) this.d0;
                Object obj11 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        b = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    String string = resources.getString(R.string.cheat_deleted, cheat.getName());
                    string.getClass();
                    String string2 = resources.getString(R.string.undo);
                    this.Y = 1;
                    b = gl6.b((gl6) this.Z, string, string2, this, 4);
                    if (b == obj11) {
                        return obj11;
                    }
                }
                if (((ll6) b) == ll6.ActionPerformed) {
                    aq0 aq0Var = (aq0) obj6;
                    aq0Var.getClass();
                    cheat.getClass();
                    ArrayList arrayList = aq0Var.f;
                    arrayList.getClass();
                    int size = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i6 < size) {
                            Object obj12 = arrayList.get(i6);
                            i6++;
                            jh1 jh1Var = (jh1) obj12;
                            jh1Var.getClass();
                            if (!nb3.k(jh1Var.a.getId(), cheat.getId())) {
                                i8++;
                            }
                        } else {
                            i8 = -1;
                        }
                    }
                    if (i8 >= 0) {
                        obj3 = arrayList.remove(i8);
                    } else {
                        obj3 = null;
                    }
                    jh1 jh1Var2 = (jh1) obj3;
                    if (jh1Var2 != null) {
                        hv.L(to7.a(aq0Var), null, null, new z(aq0Var, jh1Var2, null, 20), 3);
                    }
                }
                return obj5;
            case 4:
                cp2 cp2Var3 = (cp2) this.d0;
                aq0 aq0Var2 = (aq0) this.e0;
                Object obj13 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            cp2Var2 = (cp2) this.Z;
                            oi2.Y(obj);
                            if (cp2Var3 == null) {
                                v46 v46Var = aq0Var2.c;
                                cp2Var2.getClass();
                                Long l = cp2Var2.a;
                                String str = cp2Var2.b;
                                String str2 = cp2Var2.c;
                                String str3 = cp2Var2.d;
                                List<an0> list = cp2Var2.e;
                                ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
                                for (an0 an0Var : list) {
                                    arrayList2.add(u24.m(an0Var));
                                }
                                v46Var.c(new pp2(l, str, str2, str3, arrayList2), "selected_game");
                            }
                            return obj5;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    e = obj;
                } else {
                    oi2.Y(obj);
                    if (cp2Var3 != null) {
                        cp2Var = cp2Var3;
                        hp0Var = aq0Var2.b;
                        this.Z = cp2Var;
                        this.Y = 2;
                        if (((h16) hp0Var).c((String) obj6, cp2Var, this) != obj13) {
                            cp2Var2 = cp2Var;
                            if (cp2Var3 == null) {
                            }
                            return obj5;
                        }
                        return obj13;
                    }
                    lx5 lx5Var = aq0Var2.d;
                    if (lx5Var != null) {
                        cp2 cp2Var4 = new cp2(null, lx5Var.d, lx5Var.a, lx5Var.b(), yt1.A);
                        hp0 hp0Var2 = aq0Var2.b;
                        this.Z = null;
                        this.Y = 1;
                        e = ((h16) hp0Var2).e(cp2Var4, this);
                        break;
                    }
                    return obj5;
                }
                cp2Var = (cp2) e;
                hp0Var = aq0Var2.b;
                this.Z = cp2Var;
                this.Y = 2;
                if (((h16) hp0Var).c((String) obj6, cp2Var, this) != obj13) {
                }
                return obj13;
            case 5:
                Object obj14 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        oi2.Y(obj);
                        a = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Rect rect = (Rect) this.e0;
                    m93 m93Var = new m93(rect.left, rect.top, rect.right, rect.bottom);
                    this.Y = 1;
                    a = dx0.a((dx0) this.Z, (ScrollCaptureSession) this.d0, m93Var, this);
                    if (a == obj14) {
                        return obj14;
                    }
                }
                ((Consumer) obj6).accept(ej2.Z((m93) a));
                return obj5;
            case 6:
                Object obj15 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oi2.Y(obj);
                        a2 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    a2 = i21.a((ww2) this.Z, (yw7) this.d0, this);
                    if (a2 == obj15) {
                        return obj15;
                    }
                }
                ((AtomicInteger) this.e0).set(((Number) a2).intValue());
                ((gx3) obj6).cancel(true);
                return obj5;
            case 7:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object g = ConstraintTrackingWorker.g((ConstraintTrackingWorker) this.Z, (nx3) this.d0, (ww2) this.e0, (yw7) obj6, this);
                if (g != x61Var3) {
                    return g;
                }
                return x61Var3;
            case 8:
                Object obj16 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        oi2.Y(obj);
                        d0 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    ag agVar = new ag((sz1) this.d0, (dy1) this.e0, (c46) obj6, null, 6);
                    this.Y = 1;
                    d0 = hv.d0(de1Var, agVar, this);
                    if (d0 == obj16) {
                        return obj16;
                    }
                }
                ((hu1) this.Z).g((List) d0);
                return obj5;
            case 9:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    v70 v70Var = new v70((nv4) this.Z, (sz1) this.d0, (pq5) this.e0, (v80) obj6, (r41) null, 1);
                    this.Y = 1;
                    if (g04.C(v70Var, this) == x61Var4) {
                        return x61Var4;
                    }
                }
                return obj5;
            case 10:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (((sz1) this.Z).j.c((String) this.d0, (String) this.e0, (vj4) obj6, this) == x61Var5) {
                        return x61Var5;
                    }
                }
                return obj5;
            case 11:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    re2 re2Var = new re2((le2) obj6, (q35) this.Z, null, 0);
                    this.Y = 1;
                    if (np2.c0((ut3) this.d0, (tt3) this.e0, re2Var, this) == x61Var6) {
                        return x61Var6;
                    }
                }
                return obj5;
            case 12:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        dh5Var2 = (dh5) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Object obj17 = ((gm0) this.d0).a;
                    dh5Var = (dh5) this.e0;
                    boolean z = obj17 instanceof fm0;
                    if (!z) {
                        dh5Var.A = obj17;
                    }
                    ne2 ne2Var = (ne2) obj6;
                    if (z) {
                        if (obj17 instanceof em0) {
                            em0Var = (em0) obj17;
                        } else {
                            em0Var = null;
                        }
                        if (em0Var != null) {
                            th = em0Var.a;
                        } else {
                            th = null;
                        }
                        if (th == null) {
                            Object obj18 = dh5Var.A;
                            if (obj18 != null) {
                                if (obj18 != fh4.a) {
                                    obj7 = obj18;
                                }
                                this.d0 = obj17;
                                this.Z = dh5Var;
                                this.Y = 1;
                                if (ne2Var.a(obj7, this) == x61Var7) {
                                    return x61Var7;
                                }
                                dh5Var2 = dh5Var;
                            }
                            dh5Var.A = fh4.c;
                        } else {
                            throw th;
                        }
                    }
                    return obj5;
                }
                dh5Var = dh5Var2;
                dh5Var.A = fh4.c;
                return obj5;
            case 13:
                na4 na4Var = (na4) this.e0;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        oi2.Y(obj);
                        return obj5;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i19 = uf2.a[((ch6) this.Z).ordinal()];
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 == 3) {
                            if (obj6 == pf6.a) {
                                na4Var.h();
                            } else {
                                na4Var.k(obj6);
                            }
                        } else {
                            i.d();
                            return null;
                        }
                    }
                } else {
                    this.Y = 1;
                    if (((le2) this.d0).b(na4Var, this) == x61Var8) {
                        return x61Var8;
                    }
                }
                return obj5;
            case 14:
                le2 le2Var = (le2) this.d0;
                na4 na4Var2 = (na4) this.e0;
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            if (i20 != 3 && i20 != 4) {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj);
                            this.Y = 3;
                            break;
                        }
                    }
                    oi2.Y(obj);
                    return obj5;
                }
                oi2.Y(obj);
                eh6 eh6Var = (eh6) this.Z;
                if (eh6Var == dh6.a) {
                    this.Y = 1;
                    break;
                } else if (eh6Var == dh6.b) {
                    yt6 i21 = ((t1) na4Var2).i();
                    ai0 ai0Var = new ai0(2, null, 1);
                    this.Y = 2;
                    break;
                } else {
                    le2 z2 = f04.z(eh6Var.d(((t1) na4Var2).i()));
                    l5 l5Var = new l5(le2Var, na4Var2, this.f0, (r41) null, 13);
                    this.Y = 4;
                    break;
                }
                return x61Var9;
            case 15:
                String str4 = (String) obj6;
                Object obj19 = x61.COROUTINE_SUSPENDED;
                int i22 = this.Y;
                if (i22 != 0) {
                    if (i22 == 1) {
                        oi2.Y(obj);
                        j = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    j = ((f13) this.Z).j((String) this.d0, (String) this.e0, str4, this);
                    if (j == obj19) {
                        return obj19;
                    }
                }
                return qp2.a((String) j, str4);
            case 16:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i23 = this.Y;
                if (i23 != 0) {
                    if (i23 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                wp2 wp2Var = ((hq2) this.Z).h;
                Bitmap bitmap = (Bitmap) this.d0;
                String str5 = (String) this.e0;
                this.Y = 1;
                wp2Var.getClass();
                Object d03 = hv.d0(xk1.a, new up2(wp2Var, bitmap, (List) obj6, str5, null), this);
                if (d03 != x61Var10) {
                    return d03;
                }
                return x61Var10;
            case 17:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i24 = this.Y;
                if (i24 != 0) {
                    if (i24 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Serializable a3 = qr1.a.a((String) this.Z, (String) this.d0, (String) this.e0, (String) obj6, "default", this);
                if (a3 == x61Var11) {
                    return x61Var11;
                }
                return a3;
            case 18:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i25 = this.Y;
                if (i25 != 0) {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            ah5Var2 = (ah5) this.d0;
                            w61Var2 = (w61) this.e0;
                            oi2.Y(obj);
                            ah5Var = ah5Var2;
                            w61Var = w61Var2;
                            cn cnVar = new cn((qa4) this.Z, (g53) obj6, ah5Var, w61Var, 5);
                            ah5 ah5Var3 = ah5Var;
                            w61 w61Var3 = w61Var;
                            this.e0 = w61Var3;
                            this.d0 = ah5Var3;
                            this.Y = 1;
                            if (b().Z(d90.u0) == null) {
                                if (ii2.x(b()).a(cnVar, this) != x61Var12) {
                                    w61Var2 = w61Var3;
                                    ah5Var2 = ah5Var3;
                                    if (ah5Var2.A == RecyclerView.B1) {
                                        g21 f0 = np2.f0(new er2(w61Var2, 3));
                                        ?? hw6Var = new hw6(2, null);
                                        this.e0 = w61Var2;
                                        this.d0 = ah5Var2;
                                        this.Y = 2;
                                        break;
                                    }
                                    ah5Var = ah5Var2;
                                    w61Var = w61Var2;
                                    cn cnVar2 = new cn((qa4) this.Z, (g53) obj6, ah5Var, w61Var, 5);
                                    ah5 ah5Var32 = ah5Var;
                                    w61 w61Var32 = w61Var;
                                    this.e0 = w61Var32;
                                    this.d0 = ah5Var32;
                                    this.Y = 1;
                                    if (b().Z(d90.u0) == null) {
                                    }
                                }
                                return x61Var12;
                            }
                            u34.a();
                            return null;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ah5Var2 = (ah5) this.d0;
                    w61Var2 = (w61) this.e0;
                    oi2.Y(obj);
                    if (ah5Var2.A == RecyclerView.B1) {
                    }
                    ah5Var = ah5Var2;
                    w61Var = w61Var2;
                    cn cnVar22 = new cn((qa4) this.Z, (g53) obj6, ah5Var, w61Var, 5);
                    ah5 ah5Var322 = ah5Var;
                    w61 w61Var322 = w61Var;
                    this.e0 = w61Var322;
                    this.d0 = ah5Var322;
                    this.Y = 1;
                    if (b().Z(d90.u0) == null) {
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj20 = new Object();
                    obj20.A = 1.0f;
                    w61Var = (w61) this.e0;
                    ah5Var = obj20;
                    cn cnVar222 = new cn((qa4) this.Z, (g53) obj6, ah5Var, w61Var, 5);
                    ah5 ah5Var3222 = ah5Var;
                    w61 w61Var3222 = w61Var;
                    this.e0 = w61Var3222;
                    this.d0 = ah5Var3222;
                    this.Y = 1;
                    if (b().Z(d90.u0) == null) {
                    }
                }
            case 19:
                UUID uuid = (UUID) this.e0;
                Object obj21 = x61.COROUTINE_SUSPENDED;
                int i26 = this.Y;
                if (i26 != 0) {
                    if (i26 == 1) {
                        oi2.Y(obj);
                        qa4Var = (qa4) this.Z;
                        o2 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qa4Var = (qa4) obj6;
                    if (uuid != null) {
                        this.Z = qa4Var;
                        this.Y = 1;
                        o2 = ((eo2) ((qa4) this.d0).getValue()).o(uuid, this);
                        if (o2 == obj21) {
                            return obj21;
                        }
                    }
                    qa4Var.setValue(obj7);
                    return obj5;
                }
                obj7 = (String) o2;
                qa4Var.setValue(obj7);
                return obj5;
            case 20:
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i27 = this.Y;
                if (i27 != 0) {
                    if (i27 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    vc vcVar = new vc((gl6) this.d0, (Resources) this.e0, (qn2) obj6, 6);
                    this.Y = 1;
                    if (((na4) this.Z).b(vcVar, this) == x61Var13) {
                        return x61Var13;
                    }
                }
                e41.c();
                return null;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i28 = this.Y;
                try {
                    if (i28 != 0) {
                        if (i28 != 1) {
                            if (i28 == 2) {
                                fb4Var2 = (fb4) this.d0;
                                try {
                                    oi2.Y(obj);
                                    fb4Var2.h(null);
                                    return obj5;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fb4Var2.h(null);
                                    throw th;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eo2Var = (eo2) ((hw6) this.Z);
                        fb4Var = (fb4) this.d0;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        yh2.o(((w61) this.d0).A());
                        hb4 hb4Var = (hb4) ((d51) obj6).B;
                        eo2 eo2Var2 = (eo2) this.e0;
                        this.d0 = hb4Var;
                        this.Z = (hw6) eo2Var2;
                        this.Y = 1;
                        if (lb4.k(hb4Var, this) != x61Var14) {
                            fb4Var = hb4Var;
                            eo2Var = eo2Var2;
                        }
                        return x61Var14;
                    }
                    this.d0 = fb4Var;
                    this.Z = null;
                    this.Y = 2;
                    if (g04.C(eo2Var, this) != x61Var14) {
                        fb4Var2 = fb4Var;
                        fb4Var2.h(null);
                        return obj5;
                    }
                    return x61Var14;
                } catch (Throwable th4) {
                    th = th4;
                    fb4Var2 = fb4Var;
                    fb4Var2.h(null);
                    throw th;
                }
            case 22:
                sb4 sb4Var = (sb4) this.e0;
                n96 n96Var = (n96) this.d0;
                Object obj22 = x61.COROUTINE_SUSPENDED;
                int i29 = this.Y;
                if (i29 != 0) {
                    if (i29 == 1 || i29 == 2) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61 w61Var4 = (w61) this.Z;
                    vs4 vs4Var = n96Var.c;
                    rs4 rs4Var = n96Var.i;
                    if (!nb3.k(vs4Var.getValue(), sb4Var)) {
                        this.Y = 1;
                        ga7 ga7Var = n96Var.e;
                        if (ga7Var == null || (r0 = eb4.a(n96Var.l, new h96(ga7Var, n96Var, sb4Var, (r41) null), this)) != obj22) {
                            Object obj23 = obj5;
                            break;
                        }
                    } else {
                        float h = rs4Var.h();
                        sc7 Y = ge7.Y((int) (rs4Var.h() * ((float) (((Number) ((ga7) obj6).l.getValue()).longValue() / 1000000))), 0, null, 6);
                        x3 x3Var = new x3(w61Var4, n96Var, sb4Var, 24);
                        this.Y = 2;
                        break;
                    }
                }
                return obj5;
            case ConnectionResult.API_DISABLED /* 23 */:
                String str6 = (String) this.e0;
                String str7 = (String) this.d0;
                oj4 oj4Var = (oj4) this.Z;
                vi viVar = oj4Var.a;
                Object obj24 = x61.COROUTINE_SUSPENDED;
                int i30 = this.Y;
                try {
                } catch (Exception e2) {
                    em5Var = new em5(e2);
                }
                if (i30 != 0) {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            oi2.Y(obj);
                            obj4 = obj5;
                            em5Var = obj4;
                            return new hm5(em5Var);
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    d02 = obj;
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    kh khVar = viVar.a;
                    File a4 = viVar.a(str7, str6);
                    khVar.getClass();
                    xe1 xe1Var2 = xk1.a;
                    d02 = hv.d0(de1.L, new m5(a4, khVar, (r41) null, 1), this);
                    if (d02 == obj24) {
                        return obj24;
                    }
                }
                byte[] bArr = (byte[]) d02;
                if (bArr == null || (ti4Var = (ti4) pi4.a.a(ti4.Companion.serializer(), bArr)) == null) {
                    ti4Var = new ti4(0, yt1.A);
                }
                List list2 = ti4Var.a;
                ej4 j3 = oj4Var.j(list2);
                ui4 ui4Var = j3.a;
                int i31 = jj4.a[ui4Var.ordinal()];
                if (i31 != 1 && i31 != 2) {
                    return new hm5(new em5(new IllegalStateException("Offline ledger integrity is " + ui4Var)));
                }
                Long l2 = j3.b;
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                obj4 = obj5;
                long j4 = j2 + 1;
                byte[] bArr2 = j3.c;
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                yi4 a5 = yi4.a((yi4) obj6, j4, bArr2);
                p45 p45Var = pi4.a;
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(p45Var.b(yi4.Companion.serializer(), a5));
                digest.getClass();
                PrivateKey privateKey = oj4Var.b.a().getPrivate();
                Signature signature = Signature.getInstance("SHA256withECDSA");
                signature.initSign(privateKey);
                signature.update(digest);
                byte[] sign = signature.sign();
                sign.getClass();
                bj4 bj4Var = new bj4(a5, digest, sign);
                if (bArr == null) {
                    i = 1;
                } else {
                    int i32 = ti4Var.b;
                    if (i32 > 0) {
                        i = i32;
                    } else {
                        i = 0;
                    }
                }
                byte[] b2 = p45Var.b(ti4.Companion.serializer(), new ti4(i, gt0.U0(bj4Var, list2)));
                this.Y = 2;
                kh khVar2 = viVar.a;
                File a6 = viVar.a(str7, str6);
                khVar2.getClass();
                xe1 xe1Var3 = xk1.a;
                Object d04 = hv.d0(de1.L, new ag(a6, khVar2, b2, null, 2), this);
                if (d04 != obj24) {
                    d04 = obj4;
                }
                if (d04 != obj24) {
                    d04 = obj4;
                    break;
                }
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                Object obj25 = x61.COROUTINE_SUSPENDED;
                int i33 = this.Y;
                try {
                    if (i33 != 0) {
                        if (i33 != 1) {
                            if (i33 != 2) {
                                if (i33 == 3) {
                                    oi2.Y(obj);
                                    return obj;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fb4Var4 = (fb4) this.Z;
                            try {
                                oi2.Y(obj);
                                fb4Var3 = fb4Var4;
                                N = obj;
                                r3 = oc3.d(N);
                                fb4Var3.h(null);
                                bf4 bf4Var = new bf4(r3, (eo2) this.e0, null, 5);
                                this.Z = null;
                                this.d0 = null;
                                this.Y = 3;
                                N2 = xk2.N(200L, bf4Var, this);
                                if (N2 != obj25) {
                                    return N2;
                                }
                                return obj25;
                            } catch (Throwable th5) {
                                th2 = th5;
                                fb4Var4.h(null);
                                throw th2;
                            }
                        }
                        zx4Var = (zx4) this.d0;
                        fb4Var3 = (fb4) this.Z;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        zx4Var = (zx4) obj6;
                        fb4Var3 = zx4Var.e;
                        this.Z = fb4Var3;
                        this.d0 = zx4Var;
                        this.Y = 1;
                        if (fb4Var3.e(this) == obj25) {
                            return obj25;
                        }
                    }
                    TextClassifier textClassifier = zx4Var.f;
                    if (textClassifier != null) {
                        isDestroyed = textClassifier.isDestroyed();
                        if (isDestroyed) {
                        }
                        fb4Var3.h(null);
                        bf4 bf4Var2 = new bf4(textClassifier, (eo2) this.e0, null, 5);
                        this.Z = null;
                        this.d0 = null;
                        this.Y = 3;
                        N2 = xk2.N(200L, bf4Var2, this);
                        if (N2 != obj25) {
                        }
                    }
                    y3 y3Var = new y3(zx4Var, (r41) null, 12);
                    this.Z = fb4Var3;
                    this.d0 = null;
                    this.Y = 2;
                    N = xk2.N(300L, y3Var, this);
                    if (N == obj25) {
                        return obj25;
                    }
                    textClassifier = oc3.d(N);
                    fb4Var3.h(null);
                    bf4 bf4Var22 = new bf4(textClassifier, (eo2) this.e0, null, 5);
                    this.Z = null;
                    this.d0 = null;
                    this.Y = 3;
                    N2 = xk2.N(200L, bf4Var22, this);
                    if (N2 != obj25) {
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    fb4Var4 = fb4Var3;
                    fb4Var4.h(null);
                    throw th2;
                }
            case 25:
                return v(obj);
            case SubAllocator.N4 /* 26 */:
                return x(obj);
            case 27:
                return z(obj);
            case 28:
                return A(obj);
            default:
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                int i34 = this.Y;
                if (i34 != 0) {
                    if (i34 == 1) {
                        oi2.Y(obj);
                        return obj5;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                w61 w61Var5 = (w61) this.Z;
                xe1 xe1Var4 = xk1.a;
                jv2 jv2Var = e04.a.Y;
                hn hnVar = new hn((ut3) this.d0, (tt3) obj6, w61Var5, (eo2) this.e0, (r41) null, 8);
                this.Y = 1;
                if (hv.d0(jv2Var, hnVar, this) == x61Var15) {
                    return x61Var15;
                }
                return obj5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(eo2 eo2Var, ta5 ta5Var, qa4 qa4Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 0;
        this.e0 = eo2Var;
        this.f0 = ta5Var;
        this.d0 = qa4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(qa4 qa4Var, g53 g53Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 18;
        this.Z = qa4Var;
        this.f0 = g53Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(dh5 dh5Var, ne2 ne2Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 12;
        this.e0 = dh5Var;
        this.f0 = ne2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(Object obj, gn gnVar, qa4 qa4Var, qa4 qa4Var2, r41 r41Var) {
        super(2, r41Var);
        this.X = 2;
        this.e0 = obj;
        this.f0 = gnVar;
        this.Z = qa4Var;
        this.d0 = qa4Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, eo2 eo2Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.f0 = obj;
        this.e0 = eo2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
        this.f0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Object obj2, Object obj3, Object obj4, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(UUID uuid, qa4 qa4Var, qa4 qa4Var2, r41 r41Var) {
        super(2, r41Var);
        this.X = 19;
        this.e0 = uuid;
        this.d0 = qa4Var;
        this.f0 = qa4Var2;
    }
}
