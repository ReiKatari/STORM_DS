package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import android.widget.Toast;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m5  reason: default package */
/* loaded from: classes.dex */
public final class m5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }

    private final Object v(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        l06 l06Var = ((RomDetailsActivity) this.Y).B0;
        if (l06Var != null) {
            return l06Var.f((pq5) this.Z);
        }
        nb3.a0("romSaveFileManager");
        throw null;
    }

    private final Object x(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        l06 l06Var = ((RomDetailsActivity) this.Y).B0;
        if (l06Var != null) {
            return Boolean.valueOf(l06Var.c((Uri) this.Z));
        }
        nb3.a0("romSaveFileManager");
        throw null;
    }

    private final Object z(Object obj) {
        ReentrantLock reentrantLock;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        String valueOf = String.valueOf(((pq5) this.Y).d.hashCode());
        kx5 kx5Var = (kx5) this.Z;
        Map map = kx5Var.d;
        map.getClass();
        synchronized (map) {
            try {
                Map map2 = kx5Var.d;
                map2.getClass();
                Object obj2 = map2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ReentrantLock();
                    map2.put(valueOf, obj2);
                }
                reentrantLock = (ReentrantLock) obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
        kx5 kx5Var2 = (kx5) this.Z;
        pq5 pq5Var = (pq5) this.Y;
        reentrantLock.lock();
        try {
            return kx5.a(kx5Var2, valueOf, pq5Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 1:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 3:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 4:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 5:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 6:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 7:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 10:
                ((m5) q((r41) obj2, (List) obj)).s(jg7Var);
                return jg7Var;
            case 11:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 12:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 13:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 14:
                ((m5) q((r41) obj2, (Uri[]) obj)).s(jg7Var);
                return jg7Var;
            case 15:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 16:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 17:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 18:
                ((m5) q((r41) obj2, (List) obj)).s(jg7Var);
                return jg7Var;
            case 19:
                ((m5) q((r41) obj2, (List) obj)).s(jg7Var);
                return jg7Var;
            case 20:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 22:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                ((m5) q((r41) obj2, obj)).s(jg7Var);
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 25:
                ((m5) q((r41) obj2, (zv5) obj)).s(jg7Var);
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 27:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 28:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((m5) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                return new m5((List) this.Y, (ts4) obj2, r41Var, 0);
            case 1:
                return new m5((File) this.Y, (kh) obj2, r41Var, 1);
            case 2:
                return new m5((rd) this.Y, (cx) obj2, r41Var, 2);
            case 3:
                return new m5((bx) this.Y, (cx) obj2, r41Var, 3);
            case 4:
                return new m5((cv7) this.Y, (qa4) obj2, r41Var, 4);
            case 5:
                m5 m5Var = new m5((e70) obj2, r41Var, 5);
                m5Var.Y = obj;
                return m5Var;
            case 6:
                return new m5((yk0) this.Y, (pq7) obj2, r41Var, 6);
            case 7:
                return new m5((ld0) this.Y, (String) obj2, r41Var, 7);
            case 8:
                m5 m5Var2 = new m5((c81) obj2, r41Var, 8);
                m5Var2.Y = obj;
                return m5Var2;
            case 9:
                return new m5((Object) ((la1) obj2), (List) this.Y, r41Var, 9);
            case 10:
                m5 m5Var3 = new m5((xa1) obj2, r41Var, 10);
                m5Var3.Y = obj;
                return m5Var3;
            case 11:
                return new m5((sz1) this.Y, (Uri) obj2, r41Var, 11);
            case 12:
                return new m5((sz1) this.Y, (String) obj2, r41Var, 12);
            case 13:
                return new m5((sz1) this.Y, (ConsoleType) obj2, r41Var, 13);
            case 14:
                m5 m5Var4 = new m5((xb2) obj2, r41Var, 14);
                m5Var4.Y = obj;
                return m5Var4;
            case 15:
                return new m5((Context) this.Y, (Throwable) obj2, r41Var, 15);
            case 16:
                return new m5((String) this.Y, (String) obj2, r41Var, 16);
            case 17:
                m5 m5Var5 = new m5((a5) obj2, r41Var, 17);
                m5Var5.Y = obj;
                return m5Var5;
            case 18:
                m5 m5Var6 = new m5((qn3) obj2, r41Var, 18);
                m5Var6.Y = obj;
                return m5Var6;
            case 19:
                m5 m5Var7 = new m5((eo3) obj2, r41Var, 19);
                m5Var7.Y = obj;
                return m5Var7;
            case 20:
                m5 m5Var8 = new m5((au3) obj2, r41Var, 20);
                m5Var8.Y = obj;
                return m5Var8;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new m5((Object) ((wz3) obj2), (List) this.Y, r41Var, 21);
            case 22:
                return new m5((bx4) this.Y, (qb0) obj2, r41Var, 22);
            case ConnectionResult.API_DISABLED /* 23 */:
                m5 m5Var9 = new m5((pa) obj2, r41Var, 23);
                m5Var9.Y = obj;
                return m5Var9;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new m5((hn5) this.Y, (Collection) obj2, r41Var, 24);
            case 25:
                m5 m5Var10 = new m5((RomDetailsActivity) obj2, r41Var, 25);
                m5Var10.Y = obj;
                return m5Var10;
            case SubAllocator.N4 /* 26 */:
                return new m5((RomDetailsActivity) this.Y, (pq5) obj2, r41Var, 26);
            case 27:
                return new m5((RomDetailsActivity) this.Y, (Uri) obj2, r41Var, 27);
            case 28:
                return new m5((pq5) this.Y, (kx5) obj2, r41Var, 28);
            default:
                return new m5((a) this.Y, (pq5) obj2, r41Var, 29);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        Object em5Var;
        ArrayList arrayList;
        String str;
        List list;
        String str2;
        boolean z2;
        yf0 yf0Var;
        String string;
        int i;
        boolean z3 = true;
        int i2 = 0;
        byte[] bArr = null;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                List list2 = (List) this.Y;
                ts4 ts4Var = (ts4) this.Z;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((c6) it.next()).a == ts4Var.h()) {
                            return jg7.a;
                        }
                    }
                }
                ts4Var.i(((c6) gt0.H0(list2)).a);
                return jg7.a;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                File file = (File) this.Y;
                if (file.exists()) {
                    yc1 a = kh.a((kh) this.Z, file);
                    File file2 = (File) a.A;
                    if (file2.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        e42 e42Var = new e42(fileInputStream.getFD(), ((bs6) a.B).a(fileInputStream, file2.getName().getBytes(StandardCharsets.UTF_8)));
                        try {
                            bArr = f04.M(e42Var);
                            e42Var.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ge7.t(e42Var, th);
                                throw th2;
                            }
                        }
                    } else {
                        e41.x(file2.getName(), "file doesn't exist: ");
                    }
                }
                return bArr;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((rd) this.Y).n(((cx) this.Z).a);
                return jg7.a;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Iterator it2 = ((bx) this.Y).e.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ((bf0) it2.next()).n(((cx) this.Z).a);
                }
                return jg7.a;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                boolean booleanValue = ((Boolean) ((qa4) this.Z).getValue()).booleanValue();
                bv7 bv7Var = ((cv7) this.Y).a;
                if (booleanValue) {
                    bv7Var.f(2);
                } else {
                    bv7Var.a(2);
                }
                return jg7.a;
            case 5:
                jg7 jg7Var = jg7.a;
                w61 w61Var = (w61) this.Y;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                e70 e70Var = (e70) this.Z;
                if (e70Var.h) {
                    e70Var.h = false;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : e70Var.e.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        File file3 = e70Var.c;
                        String jSONObject2 = jSONObject.toString();
                        jSONObject2.getClass();
                        jc2.F0(file3, jSONObject2);
                    } catch (Throwable unused) {
                    }
                }
                return jg7Var;
            case 6:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                yk0 yk0Var = (yk0) this.Y;
                if (yk0Var != null) {
                    yk0Var.o();
                }
                pq7 pq7Var = (pq7) this.Z;
                if (pq7Var != null) {
                    pq7Var.a(null);
                }
                return jg7.a;
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return ((ld0) this.Y).d((String) this.Z);
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                c81 c81Var = (c81) this.Z;
                AtomicReference atomicReference = c81Var.b;
                ap6 L = hv.L((w61) this.Y, null, null, new z((rc3) c81Var.b.getAndSet(null), c81Var, null, 27), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, L)) {
                        if (atomicReference.get() != null) {
                            z3 = false;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 9:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var = ((la1) this.Z).g;
                ea1 ea1Var = new ea1((List) this.Y);
                tp6Var.getClass();
                tp6Var.m(null, ea1Var);
                return jg7.a;
            case 10:
                List list3 = (List) this.Y;
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                boolean isEmpty = list3.isEmpty();
                tp6 tp6Var2 = ((xa1) this.Z).d;
                if (isEmpty) {
                    ma1 ma1Var = ma1.a;
                    tp6Var2.getClass();
                    tp6Var2.m(null, ma1Var);
                } else {
                    na1 na1Var = new na1(list3);
                    tp6Var2.getClass();
                    tp6Var2.m(null, na1Var);
                }
                return jg7.a;
            case 11:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1 sz1Var = (sz1) this.Y;
                sz1.T(sz1Var, new zx1(null, null));
                hv.L(sz1Var.z, null, null, new xd1(sz1Var, (Uri) this.Z, null, 9), 3);
                return jg7.a;
            case 12:
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1 sz1Var2 = (sz1) this.Y;
                sz1.T(sz1Var2, new zx1(null, null));
                hv.L(sz1Var2.z, null, null, new xd1(sz1Var2, (String) this.Z, null, 10), 3);
                return jg7.a;
            case 13:
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1 sz1Var3 = (sz1) this.Y;
                hv.L(to7.a(sz1Var3), null, null, new xd1(sz1Var3, (ConsoleType) this.Z, null, 8), 3);
                return jg7.a;
            case 14:
                Uri[] uriArr = (Uri[]) this.Y;
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                xb2 xb2Var = (xb2) this.Z;
                int k0 = c14.k0(uriArr.length);
                if (k0 < 16) {
                    k0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                for (Uri uri : uriArr) {
                    linkedHashMap.put(uri.toString(), uri);
                }
                Map map = xb2Var.t;
                xb2Var.t = linkedHashMap;
                Set keySet = linkedHashMap.keySet();
                synchronized (xb2Var.o) {
                    try {
                        Iterator it3 = xb2Var.p.keySet().iterator();
                        z = false;
                        while (it3.hasNext()) {
                            String str3 = (String) it3.next();
                            if (!keySet.contains(str3)) {
                                it3.remove();
                                xb2Var.q.remove(str3);
                                z = true;
                            }
                        }
                        if (z) {
                            xb2Var.h();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z) {
                    xb2Var.w();
                }
                Set<String> F = ii2.F(map.keySet(), linkedHashMap.keySet());
                Set F2 = ii2.F(linkedHashMap.keySet(), map.keySet());
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : F) {
                    Uri uri2 = (Uri) map.get(str4);
                    if (uri2 != null) {
                        arrayList2.add(uri2);
                    }
                }
                Set<Uri> p1 = gt0.p1(arrayList2);
                Set p12 = gt0.p1(F2);
                if (xb2Var.n.get()) {
                    if (!p1.isEmpty() && !p1.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Uri uri3 : p1) {
                            try {
                                em5Var = DocumentsContract.getTreeDocumentId(uri3);
                            } catch (Throwable th4) {
                                em5Var = new em5(th4);
                            }
                            if (em5Var instanceof em5) {
                                em5Var = null;
                            }
                            String str5 = (String) em5Var;
                            if (str5 != null) {
                                arrayList3.add(str5);
                            }
                        }
                        if (!arrayList3.isEmpty() && gt0.W0(xb2Var.m, new ip(xb2Var, arrayList3))) {
                            xb2Var.t(true);
                        }
                    }
                    if (!p12.isEmpty()) {
                        hv.L(xb2Var.h, null, null, new xd1(xb2Var, p12, null, 16), 3);
                    }
                }
                return jg7.a;
            case 15:
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Toast.makeText((Context) this.Y, "Ошибка сохранения: " + ((Throwable) this.Z).getMessage(), 0).show();
                return jg7.a;
            case 16:
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String obj2 = qs6.T0((String) this.Y).toString();
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                while (i3 < obj2.length()) {
                    char charAt = obj2.charAt(i3);
                    char c = 40960;
                    if ((12352 <= charAt && charAt < 12544) || (19968 <= charAt && charAt < 40960)) {
                        ArrayList arrayList5 = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        int length = obj2.length();
                        int i4 = i2;
                        boolean z4 = true;
                        while (i4 < length) {
                            char charAt2 = obj2.charAt(i4);
                            if (19968 <= charAt2 && charAt2 < c) {
                                z2 = false;
                            } else if ((12352 <= charAt2 && charAt2 < 12448) || (12448 <= charAt2 && charAt2 < 12544)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (sb.length() > 0) {
                                    arrayList5.add(sb.toString());
                                    sb = new StringBuilder();
                                }
                                z4 = true;
                            } else {
                                if (!z4 && z4 != z2 && sb.length() >= 2) {
                                    arrayList5.add(sb.toString());
                                    sb = new StringBuilder();
                                }
                                sb.append(charAt2);
                                z4 = z2;
                            }
                            i4++;
                            c = 40960;
                        }
                        if (sb.length() > 0) {
                            arrayList5.add(sb.toString());
                        }
                        ArrayList arrayList6 = new ArrayList();
                        int size = arrayList5.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj3 = arrayList5.get(i5);
                            i5++;
                            int length2 = ((String) obj3).length();
                            if (1 <= length2 && length2 < 9) {
                                arrayList6.add(obj3);
                            }
                        }
                        Iterator it4 = gt0.e1(gt0.k1(gt0.o1(arrayList6)), 6).iterator();
                        while (it4.hasNext()) {
                            String str6 = (String) it4.next();
                            Iterator it5 = it4;
                            String str7 = obj2;
                            ArrayList arrayList7 = arrayList4;
                            Map m0 = c14.m0(new vr4("あ", "a"), new vr4("い", "i"), new vr4("う", "u"), new vr4("え", "e"), new vr4("お", "o"), new vr4("か", "ka"), new vr4("き", "ki"), new vr4("く", "ku"), new vr4("け", "ke"), new vr4("こ", "ko"), new vr4("さ", "sa"), new vr4("し", "shi"), new vr4("す", "su"), new vr4("せ", "se"), new vr4("そ", "so"), new vr4("た", "ta"), new vr4("ち", "chi"), new vr4("つ", "tsu"), new vr4("て", "te"), new vr4("と", "to"), new vr4("な", "na"), new vr4("に", "ni"), new vr4("ぬ", "nu"), new vr4("ね", "ne"), new vr4("の", "no"), new vr4("は", "ha"), new vr4("ひ", "hi"), new vr4("ふ", "fu"), new vr4("へ", "he"), new vr4("ほ", "ho"), new vr4("ま", "ma"), new vr4("み", "mi"), new vr4("む", "mu"), new vr4("め", "me"), new vr4("も", "mo"), new vr4("や", "ya"), new vr4("ゆ", "yu"), new vr4("よ", "yo"), new vr4("ら", "ra"), new vr4("り", "ri"), new vr4("る", "ru"), new vr4("れ", "re"), new vr4("ろ", "ro"), new vr4("わ", "wa"), new vr4("を", "wo"), new vr4("ん", "n"), new vr4("が", "ga"), new vr4("ぎ", "gi"), new vr4("ぐ", "gu"), new vr4("げ", "ge"), new vr4("ご", "go"), new vr4("ざ", "za"), new vr4("じ", "ji"), new vr4("ず", "zu"), new vr4("ぜ", "ze"), new vr4("ぞ", "zo"), new vr4("だ", "da"), new vr4("ぢ", "ji"), new vr4("づ", "zu"), new vr4("で", "de"), new vr4("ど", "do"), new vr4("ば", "ba"), new vr4("び", "bi"), new vr4("ぶ", "bu"), new vr4("べ", "be"), new vr4("ぼ", "bo"), new vr4("ぱ", "pa"), new vr4("ぴ", "pi"), new vr4("ぷ", "pu"), new vr4("ぺ", "pe"), new vr4("ぽ", "po"));
                            StringBuilder sb2 = new StringBuilder();
                            int length3 = str6.length();
                            int i6 = 0;
                            while (i6 < length3) {
                                int i7 = length3;
                                String valueOf = String.valueOf(str6.charAt(i6));
                                String str8 = (String) m0.get(valueOf);
                                if (str8 != null) {
                                    valueOf = str8;
                                }
                                sb2.append(valueOf);
                                i6++;
                                length3 = i7;
                            }
                            String sb3 = sb2.toString();
                            if (!xs6.Y(str6, "る", false) && !xs6.Y(str6, "す", false) && !xs6.Y(str6, "く", false) && !xs6.Y(str6, "む", false) && !xs6.Y(str6, "た", false) && !xs6.Y(str6, "ない", false)) {
                                if (!xs6.Y(str6, "い", false) && !xs6.Y(str6, "な", false)) {
                                    if (!xs6.Y(str6, "は", false) && !xs6.Y(str6, "が", false) && !xs6.Y(str6, "を", false) && !xs6.Y(str6, "に", false) && !xs6.Y(str6, "で", false)) {
                                        str2 = "Существительное / Noun";
                                    } else {
                                        str2 = "Частица / Particle";
                                    }
                                } else {
                                    str2 = "Прилагательное / Adj";
                                }
                            } else {
                                str2 = "Глагол / Verb";
                            }
                            arrayList7.add(new kp2(str6, str6, sb3, str2, hf.b0("Игровой термин / Лексическая единица контекста")));
                            it4 = it5;
                            arrayList4 = arrayList7;
                            obj2 = str7;
                        }
                        arrayList = arrayList4;
                        str = obj2;
                        return new jp2(str, (String) this.Z, arrayList);
                    }
                    i3++;
                    arrayList4 = arrayList4;
                    obj2 = obj2;
                    i2 = 0;
                }
                String str9 = obj2;
                arrayList = arrayList4;
                Pattern compile = Pattern.compile("[\\s,.:;!?\"'()]+");
                compile.getClass();
                qs6.H0(0);
                str = str9;
                Matcher matcher = compile.matcher(str);
                if (!matcher.find()) {
                    list = hf.b0(str.toString());
                } else {
                    ArrayList arrayList8 = new ArrayList(10);
                    int i8 = 0;
                    while (true) {
                        arrayList8.add(str.subSequence(i8, matcher.start()).toString());
                        i8 = matcher.end();
                        if (!matcher.find()) {
                            arrayList8.add(str.subSequence(i8, str.length()).toString());
                            list = arrayList8;
                        }
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj4 : list) {
                    String str10 = (String) obj4;
                    if (!qs6.v0(str10) && str10.length() > 1) {
                        arrayList9.add(obj4);
                    }
                }
                for (String str11 : gt0.e1(arrayList9, 8)) {
                    String lowerCase = str11.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    arrayList.add(new kp2(str11, lowerCase, "", "Слово / Lexeme", hf.b0("Термин / Игровой контекст")));
                }
                return new jp2(str, (String) this.Z, arrayList);
            case 17:
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                l61 A = ((w61) this.Y).A();
                a5 a5Var = (a5) this.Z;
                try {
                    r57 r57Var = new r57();
                    r57Var.e0 = yh2.y(yh2.u(A), true, r57Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r57.f0;
                    while (true) {
                        int i9 = atomicIntegerFieldUpdater.get(r57Var);
                        if (i9 != 0) {
                            if (i9 != 2 && i9 != 3) {
                                r57.t(i9);
                                throw null;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(r57Var, i9, 0)) {
                        }
                    }
                    Object c2 = a5Var.c();
                    r57Var.s();
                    return c2;
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 18:
                List<fk3> list4 = (List) this.Y;
                x61 x61Var19 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                qn3 qn3Var = (qn3) this.Z;
                UUID uuid = ((ba6) qn3Var.e.getValue()).a;
                if (list4 == null || !list4.isEmpty()) {
                    for (fk3 fk3Var : list4) {
                        if (nb3.k(fk3Var.a, uuid)) {
                            return jg7.a;
                        }
                    }
                }
                qn3Var.e();
                return jg7.a;
            case 19:
                List<fk3> list5 = (List) this.Y;
                x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                eo3 eo3Var = (eo3) this.Z;
                UUID uuid2 = ((ba6) eo3Var.g.A.getValue()).a;
                if (list5 == null || !list5.isEmpty()) {
                    for (fk3 fk3Var2 : list5) {
                        if (nb3.k(fk3Var2.a, uuid2)) {
                            return jg7.a;
                        }
                    }
                }
                eo3Var.e();
                return jg7.a;
            case 20:
                x61 x61Var21 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                w61 w61Var2 = (w61) this.Y;
                au3 au3Var = (au3) this.Z;
                ut3 ut3Var = au3Var.A;
                if (ut3Var.b().compareTo(tt3.INITIALIZED) >= 0) {
                    ut3Var.a(au3Var);
                } else {
                    yh2.m(w61Var2.A(), null);
                }
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                x61 x61Var22 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                pc6 pc6Var = new pc6();
                for (di7 di7Var : (List) this.Y) {
                    pc6Var.a(di7Var.o);
                }
                if (((Number) pc6Var.b().g.a().getUpper()).intValue() <= 30) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 22:
                qb0 qb0Var = (qb0) this.Z;
                bx4 bx4Var = (bx4) this.Y;
                x61 x61Var23 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                try {
                    String[] cameraIdList = bx4Var.j.getCameraIdList();
                    cameraIdList.getClass();
                    ArrayList arrayList10 = new ArrayList();
                    int length4 = cameraIdList.length;
                    while (i2 < length4) {
                        String str12 = cameraIdList[i2];
                        try {
                            str12.getClass();
                            yf0Var = nc1.J(str12, null, null);
                        } catch (IllegalArgumentException e2) {
                            Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str12, e2);
                            yf0Var = null;
                        }
                        if (yf0Var != null) {
                            arrayList10.add(yf0Var);
                        }
                        i2++;
                    }
                    Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList10);
                    bx4Var.c(arrayList10, null);
                    qb0Var.a(arrayList10);
                } catch (Exception e3) {
                    Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e3);
                    bx4Var.c(null, e3);
                    qb0Var.c(e3);
                }
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                x61 x61Var24 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Object obj5 = this.Y;
                pa paVar = (pa) this.Z;
                pu puVar = (pu) paVar.Z;
                puVar.addLast(obj5);
                v80 v80Var = (v80) paVar.Y;
                for (Object m = v80Var.m(); !(m instanceof fm0); m = v80Var.m()) {
                    gm0.b(m);
                    puVar.addLast(m);
                }
                Log.d("CXCP", "PruningProcessingQueue: Pruning " + puVar);
                ((qn2) paVar.B).g(puVar);
                return jg7.a;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                x61 x61Var25 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                hn5 hn5Var = (hn5) this.Y;
                pe5 q = vs0.q(hn5Var.a);
                ol1 ol1Var = new ol1(new pc2(new qd2(gt0.B0((Collection) this.Z), new gn5(0), 2), true, new gn5(1)).iterator(), new gn5(23));
                while (ol1Var.hasNext()) {
                    x23 x23Var = new x23(hn5Var.a);
                    x23Var.c = (String) ol1Var.next();
                    x23Var.p = ra0.ENABLED;
                    x23Var.o = ra0.DISABLED;
                    wi6 wi6Var = wi6.c;
                    x23Var.r = new ve5();
                    x23Var.t = null;
                    x23Var.u = null;
                    x23Var.v = null;
                    hv.i(q.e, null, null, new ne5(q, x23Var.a(), null, 0), 3);
                }
                return jg7.a;
            case 25:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.Z;
                zv5 zv5Var = (zv5) this.Y;
                x61 x61Var26 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (zv5Var instanceof wv5) {
                    wv5 wv5Var = (wv5) zv5Var;
                    String str13 = wv5Var.a;
                    xv5 xv5Var = wv5Var.b;
                    int i10 = gv5.a[xv5Var.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
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
                    if (xv5Var == xv5.SERVER_REJECTED) {
                        String str14 = wv5Var.c;
                        if (str14 == null) {
                            str14 = romDetailsActivity.getString(R.string.offline_ra_sync_skipped_server_rejected_unknown_reason);
                            str14.getClass();
                        }
                        string = romDetailsActivity.getString(i, str13, str14);
                    } else {
                        string = romDetailsActivity.getString(i, str13);
                    }
                } else if (zv5Var instanceof yv5) {
                    string = romDetailsActivity.getString(R.string.offline_ra_sync_skipped_summary_toast, new Integer(((yv5) zv5Var).a));
                } else {
                    i.d();
                    return null;
                }
                string.getClass();
                Toast.makeText(romDetailsActivity, string, 1).show();
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                return v(obj);
            case 27:
                return x(obj);
            case 28:
                return z(obj);
            default:
                x61 x61Var27 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                l06 l06Var = ((a) this.Y).Y;
                if (l06Var != null) {
                    return l06Var.f((pq5) this.Z);
                }
                nb3.a0("romSaveFileManager");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, List list, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.Y = list;
    }
}
