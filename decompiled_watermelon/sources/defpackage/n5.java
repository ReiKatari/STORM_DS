package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n5  reason: default package */
/* loaded from: classes.dex */
public final class n5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 1:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 3:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 4:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 5:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case ig7.b /* 6 */:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 7:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 8:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 9:
                ((n5) t((j11) obj2, (List) obj)).v(o27Var);
                return o27Var;
            case 10:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 11:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case mj2.L /* 12 */:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 13:
                ((n5) t((j11) obj2, (Uri[]) obj)).v(o27Var);
                return o27Var;
            case 14:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case ig7.e /* 15 */:
                ((n5) t((j11) obj2, (List) obj)).v(o27Var);
                return o27Var;
            case 16:
                ((n5) t((j11) obj2, (List) obj)).v(o27Var);
                return o27Var;
            case 17:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 18:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 19:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 20:
                ((n5) t((j11) obj2, obj)).v(o27Var);
                return o27Var;
            case 21:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 22:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 23:
                ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 24:
                ((n5) t((j11) obj2, (kl5) obj)).v(o27Var);
                return o27Var;
            case 25:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 26:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 27:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 28:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((n5) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                return new n5((List) this.Y, (rj4) obj2, j11Var, 0);
            case 1:
                return new n5((File) this.Y, (yg) obj2, j11Var, 1);
            case 2:
                return new n5((cd) this.Y, (kw) obj2, j11Var, 2);
            case 3:
                return new n5((jw) this.Y, (kw) obj2, j11Var, 3);
            case 4:
                return new n5((cg7) this.Y, (k24) obj2, j11Var, 4);
            case 5:
                return new n5((qi0) this.Y, (nc7) obj2, j11Var, 5);
            case ig7.b /* 6 */:
                return new n5((db0) this.Y, (String) obj2, j11Var, 6);
            case 7:
                n5 n5Var = new n5((s41) obj2, j11Var, 7);
                n5Var.Y = obj;
                return n5Var;
            case 8:
                return new n5((Object) ((w61) obj2), (List) this.Y, j11Var, 8);
            case 9:
                n5 n5Var2 = new n5((i71) obj2, j11Var, 9);
                n5Var2.Y = obj;
                return n5Var2;
            case 10:
                return new n5((hv1) this.Y, (Uri) obj2, j11Var, 10);
            case 11:
                return new n5((hv1) this.Y, (String) obj2, j11Var, 11);
            case mj2.L /* 12 */:
                return new n5((hv1) this.Y, (ConsoleType) obj2, j11Var, 12);
            case 13:
                n5 n5Var3 = new n5((d72) obj2, j11Var, 13);
                n5Var3.Y = obj;
                return n5Var3;
            case 14:
                n5 n5Var4 = new n5((b5) obj2, j11Var, 14);
                n5Var4.Y = obj;
                return n5Var4;
            case ig7.e /* 15 */:
                n5 n5Var5 = new n5((sg3) obj2, j11Var, 15);
                n5Var5.Y = obj;
                return n5Var5;
            case 16:
                n5 n5Var6 = new n5((eh3) obj2, j11Var, 16);
                n5Var6.Y = obj;
                return n5Var6;
            case 17:
                n5 n5Var7 = new n5((ym3) obj2, j11Var, 17);
                n5Var7.Y = obj;
                return n5Var7;
            case 18:
                return new n5((Object) ((rs3) obj2), (List) this.Y, j11Var, 18);
            case 19:
                return new n5((wn4) this.Y, (i90) obj2, j11Var, 19);
            case 20:
                n5 n5Var8 = new n5((ka) obj2, j11Var, 20);
                n5Var8.Y = obj;
                return n5Var8;
            case 21:
                return new n5((md5) this.Y, (Collection) obj2, j11Var, 21);
            case 22:
                return new n5((mi2) this.Y, (rg5) obj2, j11Var, 22);
            case 23:
                n5 n5Var9 = new n5((wc2) obj2, j11Var, 23);
                n5Var9.Y = obj;
                return n5Var9;
            case 24:
                n5 n5Var10 = new n5((RomDetailsActivity) obj2, j11Var, 24);
                n5Var10.Y = obj;
                return n5Var10;
            case 25:
                return new n5((RomDetailsActivity) this.Y, (rg5) obj2, j11Var, 25);
            case 26:
                return new n5((RomDetailsActivity) this.Y, (Uri) obj2, j11Var, 26);
            case 27:
                return new n5((rg5) this.Y, (vm5) obj2, j11Var, 27);
            case 28:
                return new n5((a) this.Y, (rg5) obj2, j11Var, 28);
            default:
                return new n5((a) this.Y, (Uri) obj2, j11Var, 29);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        String str;
        pd0 pd0Var;
        String string;
        int i;
        ReentrantLock reentrantLock;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        byte[] bArr = null;
        switch (this.X) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                List list = (List) this.Y;
                rj4 rj4Var = (rj4) this.Z;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((c6) it.next()).a == rj4Var.h()) {
                            return o27.a;
                        }
                    }
                }
                rj4Var.i(((c6) tq0.K0(list)).a);
                return o27.a;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                File file = (File) this.Y;
                if (file.exists()) {
                    k91 a = yg.a((yg) this.Z, file);
                    File file2 = (File) a.A;
                    if (file2.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        pz1 pz1Var = new pz1(fileInputStream.getFD(), ((kg6) a.B).a(fileInputStream, file2.getName().getBytes(StandardCharsets.UTF_8)));
                        try {
                            bArr = pu.z(pz1Var);
                            pz1Var.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                dt3.W(pz1Var, th);
                                throw th2;
                            }
                        }
                    } else {
                        f81.y(file2.getName(), "file doesn't exist: ");
                    }
                }
                return bArr;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((cd) this.Y).F(((kw) this.Z).a);
                return o27.a;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Iterator it2 = ((jw) this.Y).e.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ((sc0) it2.next()).F(((kw) this.Z).a);
                }
                return o27.a;
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                boolean booleanValue = ((Boolean) ((k24) this.Z).getValue()).booleanValue();
                bg7 bg7Var = ((cg7) this.Y).a;
                if (booleanValue) {
                    bg7Var.g(2);
                } else {
                    bg7Var.b(2);
                }
                return o27.a;
            case 5:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                qi0 qi0Var = (qi0) this.Y;
                if (qi0Var != null) {
                    qi0Var.o();
                }
                nc7 nc7Var = (nc7) this.Z;
                if (nc7Var != null) {
                    nc7Var.a(null);
                }
                return o27.a;
            case ig7.b /* 6 */:
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return ((db0) this.Y).d((String) this.Z);
            case 7:
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                s41 s41Var = (s41) this.Z;
                AtomicReference atomicReference = s41Var.b;
                kd6 w = tq5.w((o31) this.Y, null, null, new y((c63) s41Var.b.getAndSet(null), s41Var, null, 27), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, w)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                p31 p31Var9 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ee6 ee6Var = ((w61) this.Z).e;
                q61 q61Var = new q61((List) this.Y);
                ee6Var.getClass();
                ee6Var.l(null, q61Var);
                return o27.a;
            case 9:
                List list2 = (List) this.Y;
                p31 p31Var10 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                boolean isEmpty = list2.isEmpty();
                ee6 ee6Var2 = ((i71) this.Z).d;
                if (isEmpty) {
                    x61 x61Var = x61.a;
                    ee6Var2.getClass();
                    ee6Var2.l(null, x61Var);
                } else {
                    y61 y61Var = new y61(list2);
                    ee6Var2.getClass();
                    ee6Var2.l(null, y61Var);
                }
                return o27.a;
            case 10:
                p31 p31Var11 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1 hv1Var = (hv1) this.Y;
                hv1.W(hv1Var, new ot1(null, null));
                tq5.w(hv1Var.z, null, null, new ba1(hv1Var, (Uri) this.Z, null, 9), 3);
                return o27.a;
            case 11:
                p31 p31Var12 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1 hv1Var2 = (hv1) this.Y;
                hv1.W(hv1Var2, new ot1(null, null));
                tq5.w(hv1Var2.z, null, null, new ba1(hv1Var2, (String) this.Z, null, 10), 3);
                return o27.a;
            case mj2.L /* 12 */:
                p31 p31Var13 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1 hv1Var3 = (hv1) this.Y;
                tq5.w(ua7.a(hv1Var3), null, null, new ba1(hv1Var3, (ConsoleType) this.Z, null, 8), 3);
                return o27.a;
            case 13:
                Uri[] uriArr = (Uri[]) this.Y;
                p31 p31Var14 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                d72 d72Var = (d72) this.Z;
                int j0 = zt3.j0(uriArr.length);
                if (j0 < 16) {
                    j0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
                for (Uri uri : uriArr) {
                    linkedHashMap.put(uri.toString(), uri);
                }
                Map map = d72Var.t;
                d72Var.t = linkedHashMap;
                Set keySet = linkedHashMap.keySet();
                synchronized (d72Var.o) {
                    try {
                        Iterator it3 = d72Var.p.keySet().iterator();
                        while (it3.hasNext()) {
                            String str2 = (String) it3.next();
                            if (!keySet.contains(str2)) {
                                it3.remove();
                                d72Var.q.remove(str2);
                                z3 = true;
                            }
                        }
                        if (z3) {
                            d72Var.g();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z3) {
                    d72Var.t();
                }
                Set<String> I = hi2.I(map.keySet(), linkedHashMap.keySet());
                Set I2 = hi2.I(linkedHashMap.keySet(), map.keySet());
                ArrayList arrayList = new ArrayList();
                for (String str3 : I) {
                    Uri uri2 = (Uri) map.get(str3);
                    if (uri2 != null) {
                        arrayList.add(uri2);
                    }
                }
                Set<Uri> s1 = tq0.s1(arrayList);
                Set s12 = tq0.s1(I2);
                if (d72Var.n.get()) {
                    if (!s1.isEmpty() && !s1.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri3 : s1) {
                            try {
                                kc5Var = DocumentsContract.getTreeDocumentId(uri3);
                            } catch (Throwable th4) {
                                kc5Var = new kc5(th4);
                            }
                            boolean z4 = kc5Var instanceof kc5;
                            Object obj2 = kc5Var;
                            if (z4) {
                                obj2 = null;
                            }
                            String str4 = (String) obj2;
                            if (str4 != null) {
                                arrayList2.add(str4);
                            }
                        }
                        if (!arrayList2.isEmpty() && tq0.Z0(d72Var.m, new wo(d72Var, arrayList2))) {
                            d72Var.q(true);
                        }
                    }
                    if (!s12.isEmpty()) {
                        tq5.w(d72Var.h, null, null, new ba1(d72Var, s12, null, 16), 3);
                    }
                }
                return o27.a;
            case 14:
                p31 p31Var15 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                e31 w2 = ((o31) this.Y).w();
                b5 b5Var = (b5) this.Z;
                try {
                    at6 at6Var = new at6();
                    at6Var.d0 = ln2.E(ln2.D(w2), true, at6Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = at6.e0;
                    while (true) {
                        int i2 = atomicIntegerFieldUpdater.get(at6Var);
                        if (i2 != 0) {
                            if (i2 != 2 && i2 != 3) {
                                at6.t(i2);
                                throw null;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(at6Var, i2, 0)) {
                        }
                    }
                    Object c = b5Var.c();
                    at6Var.s();
                    return c;
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case ig7.e /* 15 */:
                List<nd3> list3 = (List) this.Y;
                p31 p31Var16 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                sg3 sg3Var = (sg3) this.Z;
                UUID uuid = ((oy5) sg3Var.e.getValue()).a;
                if (list3 == null || !list3.isEmpty()) {
                    for (nd3 nd3Var : list3) {
                        if (b53.x(nd3Var.a, uuid)) {
                            return o27.a;
                        }
                    }
                }
                sg3Var.e();
                return o27.a;
            case 16:
                List<nd3> list4 = (List) this.Y;
                p31 p31Var17 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                eh3 eh3Var = (eh3) this.Z;
                UUID uuid2 = ((oy5) eh3Var.g.A.getValue()).a;
                if (list4 == null || !list4.isEmpty()) {
                    for (nd3 nd3Var2 : list4) {
                        if (b53.x(nd3Var2.a, uuid2)) {
                            return o27.a;
                        }
                    }
                }
                eh3Var.e();
                return o27.a;
            case 17:
                p31 p31Var18 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                o31 o31Var = (o31) this.Y;
                ym3 ym3Var = (ym3) this.Z;
                rm3 rm3Var = ym3Var.A;
                if (rm3Var.b().compareTo(qm3.INITIALIZED) >= 0) {
                    rm3Var.a(ym3Var);
                } else {
                    ln2.t(o31Var.w(), null);
                }
                return o27.a;
            case 18:
                p31 p31Var19 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                b16 b16Var = new b16();
                for (f47 f47Var : (List) this.Y) {
                    b16Var.a(f47Var.o);
                }
                if (((Number) b16Var.b().g.a().getUpper()).intValue() > 30) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 19:
                i90 i90Var = (i90) this.Z;
                wn4 wn4Var = (wn4) this.Y;
                p31 p31Var20 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                try {
                    String[] cameraIdList = wn4Var.j.getCameraIdList();
                    cameraIdList.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (String str5 : cameraIdList) {
                        try {
                            str5.getClass();
                            pd0Var = dk7.p(str5, null, null);
                        } catch (IllegalArgumentException e2) {
                            Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str, e2);
                            pd0Var = null;
                        }
                        if (pd0Var != null) {
                            arrayList3.add(pd0Var);
                        }
                    }
                    Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList3);
                    wn4Var.c(arrayList3, null);
                    i90Var.a(arrayList3);
                } catch (Exception e3) {
                    Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e3);
                    wn4Var.c(null, e3);
                    i90Var.c(e3);
                }
                return o27.a;
            case 20:
                p31 p31Var21 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Object obj3 = this.Y;
                ka kaVar = (ka) this.Z;
                xt xtVar = (xt) kaVar.Z;
                xtVar.addLast(obj3);
                q60 q60Var = (q60) kaVar.Y;
                for (Object o = q60Var.o(); !(o instanceof wj0); o = q60Var.o()) {
                    xj0.b(o);
                    xtVar.addLast(o);
                }
                Log.d("CXCP", "PruningProcessingQueue: Pruning " + xtVar);
                ((mi2) kaVar.B).n(xtVar);
                return o27.a;
            case 21:
                p31 p31Var22 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                md5 md5Var = (md5) this.Y;
                c55 s = iq0.s(md5Var.a);
                kh1 kh1Var = new kh1(new w72(new y82(tq0.E0((Collection) this.Z), new vu4(18), 2), true, new vu4(19)).iterator(), new nh5(12));
                while (kh1Var.hasNext()) {
                    tw2 tw2Var = new tw2(md5Var.a);
                    tw2Var.c = (String) kh1Var.next();
                    tw2Var.o = j80.ENABLED;
                    tw2Var.n = j80.DISABLED;
                    h76 h76Var = h76.c;
                    tw2Var.q = new i55();
                    tw2Var.s = null;
                    tw2Var.t = null;
                    tw2Var.u = null;
                    tq5.e(s.e, null, null, new a55(s, tw2Var.a(), null, 0), 3);
                }
                return o27.a;
            case 22:
                p31 p31Var23 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((mi2) this.Y).n((rg5) this.Z);
                return o27.a;
            case 23:
                o31 o31Var2 = (o31) this.Y;
                p31 p31Var24 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                try {
                    wc2.a((wc2) this.Z);
                } catch (Throwable unused) {
                }
                return o27.a;
            case 24:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.Z;
                kl5 kl5Var = (kl5) this.Y;
                p31 p31Var25 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (kl5Var instanceof hl5) {
                    hl5 hl5Var = (hl5) kl5Var;
                    String str6 = hl5Var.a;
                    il5 il5Var = hl5Var.b;
                    int i3 = pk5.a[il5Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
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
                    if (il5Var == il5.SERVER_REJECTED) {
                        String str7 = hl5Var.c;
                        if (str7 == null) {
                            str7 = romDetailsActivity.getString(R.string.offline_ra_sync_skipped_server_rejected_unknown_reason);
                            str7.getClass();
                        }
                        string = romDetailsActivity.getString(i, str6, str7);
                    } else {
                        string = romDetailsActivity.getString(i, str6);
                    }
                } else if (kl5Var instanceof jl5) {
                    string = romDetailsActivity.getString(R.string.offline_ra_sync_skipped_summary_toast, new Integer(((jl5) kl5Var).a));
                } else {
                    i.c();
                    return null;
                }
                string.getClass();
                Toast.makeText(romDetailsActivity, string, 1).show();
                return o27.a;
            case 25:
                p31 p31Var26 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                rp5 rp5Var = ((RomDetailsActivity) this.Y).A0;
                if (rp5Var != null) {
                    return rp5Var.f((rg5) this.Z);
                }
                b53.g0("romSaveFileManager");
                throw null;
            case 26:
                p31 p31Var27 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                rp5 rp5Var2 = ((RomDetailsActivity) this.Y).A0;
                if (rp5Var2 != null) {
                    return Boolean.valueOf(rp5Var2.c((Uri) this.Z));
                }
                b53.g0("romSaveFileManager");
                throw null;
            case 27:
                p31 p31Var28 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                String valueOf = String.valueOf(((rg5) this.Y).d.hashCode());
                vm5 vm5Var = (vm5) this.Z;
                Map map2 = vm5Var.d;
                map2.getClass();
                synchronized (map2) {
                    try {
                        Map map3 = vm5Var.d;
                        map3.getClass();
                        Object obj4 = map3.get(valueOf);
                        ReentrantLock reentrantLock2 = obj4;
                        if (obj4 == null) {
                            ReentrantLock reentrantLock3 = new ReentrantLock();
                            map3.put(valueOf, reentrantLock3);
                            reentrantLock2 = reentrantLock3;
                        }
                        reentrantLock = (ReentrantLock) reentrantLock2;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                vm5 vm5Var2 = (vm5) this.Z;
                rg5 rg5Var = (rg5) this.Y;
                reentrantLock.lock();
                try {
                    return vm5.a(vm5Var2, valueOf, rg5Var);
                } finally {
                    reentrantLock.unlock();
                }
            case 28:
                p31 p31Var29 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                rp5 rp5Var3 = ((a) this.Y).Y;
                if (rp5Var3 != null) {
                    return rp5Var3.f((rg5) this.Z);
                }
                b53.g0("romSaveFileManager");
                throw null;
            default:
                p31 p31Var30 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                rp5 rp5Var4 = ((a) this.Y).Y;
                if (rp5Var4 != null) {
                    return Boolean.valueOf(rp5Var4.c((Uri) this.Z));
                }
                b53.g0("romSaveFileManager");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Object obj, List list, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.Y = list;
    }
}
