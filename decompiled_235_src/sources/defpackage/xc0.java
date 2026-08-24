package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc0  reason: default package */
/* loaded from: classes.dex */
public final class xc0 {
    public final me0 a;
    public final t57 b;
    public final int c;
    public final Map d;
    public final Map e;
    public final jr6 f;
    public final ks6 g;
    public final boolean h;
    public final int i;
    public final Object j;
    public boolean k;
    public vc0 l;
    public final di m;

    public xc0(me0 me0Var, t57 t57Var, int i, Map map, Map map2, jr6 jr6Var, ks6 ks6Var, boolean z) {
        me0Var.getClass();
        t57Var.getClass();
        map.getClass();
        map2.getClass();
        ks6Var.getClass();
        this.a = me0Var;
        this.b = t57Var;
        this.c = i;
        this.d = map;
        this.e = map2;
        this.f = jr6Var;
        this.g = ks6Var;
        this.h = z;
        uw uwVar = yc0.a;
        uwVar.getClass();
        this.i = uw.b.incrementAndGet(uwVar);
        this.j = new Object();
        List list = jr6Var.Y;
        di diVar = null;
        if (!list.isEmpty()) {
            gr6 gr6Var = (gr6) gt0.H0(list);
            Surface inputSurface = me0Var.getInputSurface();
            if (inputSurface != null) {
                try {
                    diVar = hf.H(inputSurface, gr6Var.a, new fr6(gr6Var.b), t57Var.a());
                } catch (RuntimeException e) {
                    Log.e("CXCP", "Failed to create ImageWriter for session " + this.a + "! Reprocessing will not be supported!", e);
                }
                if (diVar != null) {
                    Log.d("CXCP", "Created ImageWriter " + diVar + " for session " + this.a);
                }
            } else {
                i.m("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
        }
        this.m = diVar;
    }

    public static final void a(xc0 xc0Var, vc0 vc0Var) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + vc0Var);
        if (((jg7) xc0Var.b.b(2000L, new wc0(vc0Var, null, 0))) == null) {
            Log.e("CXCP", xc0Var + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + vc0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0595 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vc0 b(boolean z, List list, Map map, Map map2, Map map3, d51 d51Var, List list2) {
        int i;
        String str;
        jr6 jr6Var;
        String str2;
        ArrayMap arrayMap;
        Iterator it;
        int i2;
        boolean a;
        long j;
        boolean a2;
        Iterator it2;
        String str3;
        me0 me0Var;
        int i3;
        Iterator it3;
        ArrayList arrayList;
        boolean a3;
        boolean z2;
        boolean a4;
        Boolean bool;
        ArrayList arrayList2;
        int i4;
        boolean a5;
        boolean z3;
        boolean a6;
        Map map4 = map;
        Map map5 = map3;
        map4.getClass();
        map2.getClass();
        map5.getClass();
        d51Var.getClass();
        list2.getClass();
        ArrayList arrayList3 = new ArrayList(list.size());
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        String str4 = "build(...) should never be called with an empty request list!";
        if (!list.isEmpty()) {
            me0 me0Var2 = this.a;
            boolean z4 = me0Var2 instanceof qd;
            String str5 = "CXCP";
            jr6 jr6Var2 = this.f;
            if (z4) {
                Iterator it4 = list.iterator();
                Boolean bool2 = null;
                Boolean bool3 = null;
                while (it4.hasNext()) {
                    kk5 kk5Var = (kk5) it4.next();
                    List list3 = kk5Var.a;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            ((kr6) it5.next()).getClass();
                            it2 = it4;
                            ArrayList arrayList5 = jr6Var2.d0;
                            if (arrayList5 != null && arrayList5.isEmpty()) {
                                str3 = str4;
                                me0Var = me0Var2;
                            } else {
                                str3 = str4;
                                int size = arrayList5.size();
                                me0Var = me0Var2;
                                int i5 = 0;
                                while (i5 < size) {
                                    Object obj = arrayList5.get(i5);
                                    int i6 = i5 + 1;
                                    ArrayList arrayList6 = arrayList5;
                                    ir6 ir6Var = (ir6) obj;
                                    int i7 = size;
                                    sp4 sp4Var = ir6Var.g;
                                    tp4 tp4Var = ir6Var.i;
                                    if (sp4Var == null) {
                                        i3 = i6;
                                        it3 = it5;
                                        arrayList = arrayList3;
                                        a3 = false;
                                    } else {
                                        i3 = i6;
                                        it3 = it5;
                                        arrayList = arrayList3;
                                        a3 = sp4.a(sp4Var.a, 1L);
                                    }
                                    if (!a3) {
                                        if (tp4Var == null) {
                                            a4 = false;
                                        } else {
                                            a4 = tp4.a(tp4Var.a, 0L);
                                        }
                                        if (!a4 && tp4Var != null) {
                                            size = i7;
                                            arrayList5 = arrayList6;
                                            i5 = i3;
                                            arrayList3 = arrayList;
                                            it5 = it3;
                                        }
                                    }
                                    z2 = true;
                                    break;
                                }
                            }
                            it4 = it2;
                            str4 = str3;
                            me0Var2 = me0Var;
                            arrayList3 = arrayList3;
                            it5 = it5;
                        }
                    }
                    it2 = it4;
                    str3 = str4;
                    me0Var = me0Var2;
                    arrayList = arrayList3;
                    z2 = false;
                    Boolean valueOf = Boolean.valueOf(z2);
                    if (bool2 != null && !bool2.equals(valueOf)) {
                        Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool2.booleanValue() + ". Current request contains preview stream use case or hint: " + z2 + '.');
                    }
                    List<kr6> list4 = kk5Var.a;
                    if (list4 == null || !list4.isEmpty()) {
                        for (kr6 kr6Var : list4) {
                            kr6Var.getClass();
                            ArrayList arrayList7 = jr6Var2.d0;
                            if (arrayList7 == null || !arrayList7.isEmpty()) {
                                int size2 = arrayList7.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    Object obj2 = arrayList7.get(i8);
                                    i8++;
                                    ir6 ir6Var2 = (ir6) obj2;
                                    sp4 sp4Var2 = ir6Var2.g;
                                    if (sp4Var2 == null) {
                                        bool = valueOf;
                                        arrayList2 = arrayList7;
                                        i4 = size2;
                                        a5 = false;
                                    } else {
                                        bool = valueOf;
                                        arrayList2 = arrayList7;
                                        i4 = size2;
                                        a5 = sp4.a(sp4Var2.a, 3L);
                                    }
                                    if (!a5) {
                                        tp4 tp4Var2 = ir6Var2.i;
                                        if (tp4Var2 == null) {
                                            a6 = false;
                                        } else {
                                            a6 = tp4.a(tp4Var2.a, 1L);
                                        }
                                        if (!a6) {
                                            valueOf = bool;
                                            arrayList7 = arrayList2;
                                            size2 = i4;
                                        }
                                    }
                                    z3 = true;
                                    break;
                                }
                            }
                            valueOf = valueOf;
                        }
                    }
                    bool = valueOf;
                    z3 = false;
                    Boolean valueOf2 = Boolean.valueOf(z3);
                    Boolean bool4 = bool3;
                    if (bool4 != null && !bool4.equals(valueOf2)) {
                        Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool4.booleanValue() + ". Current request contains video stream use case: " + z3 + '.');
                    }
                    ArrayList arrayList8 = jr6Var2.d0;
                    if (arrayList8 == null || !arrayList8.isEmpty()) {
                        int size3 = arrayList8.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Object obj3 = arrayList8.get(i9);
                            i9++;
                            if (!((ir6) obj3).a()) {
                                Log.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + jr6Var2.d0);
                                return null;
                            }
                        }
                        continue;
                    }
                    bool3 = valueOf2;
                    it4 = it2;
                    str4 = str3;
                    me0Var2 = me0Var;
                    bool2 = bool;
                    arrayList3 = arrayList;
                }
            }
            String str6 = str4;
            me0 me0Var3 = me0Var2;
            ArrayList arrayList9 = arrayList3;
            if (!list.isEmpty()) {
                Iterator it6 = list.iterator();
                while (true) {
                    String str7 = "Check failed.";
                    if (it6.hasNext()) {
                        kk5 kk5Var2 = (kk5) it6.next();
                        Iterator it7 = kk5Var2.a.iterator();
                        boolean z5 = false;
                        while (it7.hasNext()) {
                            int i10 = ((kr6) it7.next()).a;
                            if (arrayMap4.containsKey(new kr6(i10))) {
                                z5 = true;
                            } else {
                                Iterator it8 = it6;
                                Surface surface = (Surface) this.d.get(new kr6(i10));
                                if (surface != null) {
                                    arrayMap2.put(surface, new kr6(i10));
                                    arrayMap4.put(new kr6(i10), surface);
                                    ki0 e = jr6Var2.e(i10);
                                    String str8 = "Required value was null.";
                                    if (e != null) {
                                        ArrayList arrayList10 = e.b;
                                        int size4 = arrayList10.size();
                                        int i11 = 0;
                                        while (i11 < size4) {
                                            Object obj4 = arrayList10.get(i11);
                                            i11++;
                                            ArrayList arrayList11 = arrayList10;
                                            ir6 ir6Var3 = (ir6) obj4;
                                            String str9 = str8;
                                            Iterator it9 = it7;
                                            Object obj5 = this.e.get(new gp4(ir6Var3.a));
                                            if (obj5 != null) {
                                                arrayMap3.put((Surface) obj5, new gp4(ir6Var3.a));
                                                str8 = str9;
                                                arrayList10 = arrayList11;
                                                it7 = it9;
                                            } else {
                                                i.m(str9);
                                                return null;
                                            }
                                        }
                                        z5 = true;
                                    } else {
                                        i.m("Required value was null.");
                                        return null;
                                    }
                                }
                                it6 = it8;
                            }
                        }
                        Iterator it10 = it6;
                        if (!z5) {
                            Log.i("CXCP", "  Failed to bind any surfaces for " + kk5Var2 + '!');
                            return null;
                        } else if (z5) {
                            it6 = it10;
                        } else {
                            i.m("Check failed.");
                            return null;
                        }
                    } else {
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            kk5 kk5Var3 = (kk5) it11.next();
                            Log.d(str5, "Building CaptureRequest for " + kk5Var3);
                            bl5 bl5Var = kk5Var3.e;
                            if (bl5Var != null) {
                                i = bl5Var.a;
                            } else {
                                i = this.c;
                            }
                            CaptureRequest.Builder D = me0Var3.L().D(i);
                            if (D == null) {
                                Log.i(str5, "Failed to create a CaptureRequest.Builder from " + ((Object) bl5.b(i)) + '!');
                                D = null;
                            }
                            if (D == null) {
                                return null;
                            }
                            k54 k54Var = ug0.b;
                            Object obj6 = map5.get(k54Var);
                            if (obj6 == null) {
                                obj6 = map4.get(k54Var);
                            }
                            D.setTag(obj6);
                            int size5 = kk5Var3.a.size();
                            boolean z6 = false;
                            for (int i12 = 0; i12 < size5; i12++) {
                                Surface surface2 = (Surface) arrayMap4.get(kk5Var3.a.get(i12));
                                if (surface2 != null) {
                                    D.addTarget(surface2);
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                yh2.R(D, map4);
                                yh2.R(D, map2);
                                yh2.R(D, kk5Var3.b);
                                yh2.R(D, map5);
                                ww wwVar = yc0.c;
                                wwVar.getClass();
                                long incrementAndGet = ww.b.incrementAndGet(wwVar);
                                CaptureRequest build = D.build();
                                build.getClass();
                                me0 me0Var4 = this.a;
                                ArrayMap arrayMap5 = arrayMap3;
                                if (me0Var4 instanceof qd) {
                                    qd qdVar = (qd) me0Var4;
                                    bf0 bf0Var = qdVar.A;
                                    try {
                                        Trace.beginSection("CXCP#createHighSpeedRequestList");
                                        List<CaptureRequest> list5 = qdVar.X.createHighSpeedRequestList(build);
                                        try {
                                            Trace.endSection();
                                        } catch (IllegalArgumentException unused) {
                                            Log.w(str5, "Failed to createHighSpeedRequestList from " + bf0Var + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                                            list5 = null;
                                            if (list5 != null) {
                                            }
                                        } catch (IllegalStateException unused2) {
                                            Log.w(str5, "Failed to createHighSpeedRequestList. " + bf0Var + " may be closed.");
                                            list5 = null;
                                            if (list5 != null) {
                                            }
                                        } catch (UnsupportedOperationException unused3) {
                                            Log.w(str5, "Failed to createHighSpeedRequestList from " + bf0Var + " because the output surface was not available.");
                                            list5 = null;
                                            if (list5 != null) {
                                            }
                                        }
                                        if (list5 != null) {
                                            return null;
                                        }
                                        List list6 = kk5Var3.a;
                                        if (list6 == null || !list6.isEmpty()) {
                                            Iterator it12 = list6.iterator();
                                            while (it12.hasNext()) {
                                                ((kr6) it12.next()).getClass();
                                                ArrayList arrayList12 = jr6Var2.d0;
                                                if (arrayList12 != null && arrayList12.isEmpty()) {
                                                    it = it12;
                                                } else {
                                                    int size6 = arrayList12.size();
                                                    it = it12;
                                                    int i13 = 0;
                                                    while (i13 < size6) {
                                                        Object obj7 = arrayList12.get(i13);
                                                        int i14 = i13 + 1;
                                                        ir6 ir6Var4 = (ir6) obj7;
                                                        ArrayList arrayList13 = arrayList12;
                                                        sp4 sp4Var3 = ir6Var4.g;
                                                        if (sp4Var3 == null) {
                                                            i2 = size6;
                                                            str = str5;
                                                            a = false;
                                                        } else {
                                                            i2 = size6;
                                                            str = str5;
                                                            a = sp4.a(sp4Var3.a, 3L);
                                                        }
                                                        if (!a) {
                                                            tp4 tp4Var3 = ir6Var4.i;
                                                            if (tp4Var3 == null) {
                                                                a2 = false;
                                                                j = 1;
                                                            } else {
                                                                j = 1;
                                                                a2 = tp4.a(tp4Var3.a, 1L);
                                                            }
                                                            if (!a2) {
                                                                arrayList12 = arrayList13;
                                                                i13 = i14;
                                                                size6 = i2;
                                                                str5 = str;
                                                            }
                                                        } else {
                                                            j = 1;
                                                        }
                                                        int size7 = list5.size();
                                                        int i15 = 0;
                                                        while (i15 < size7) {
                                                            int i16 = size7;
                                                            int i17 = i15;
                                                            od0 od0Var = new od0(this.a, list5.get(i15), map, map2, map5, arrayMap4, z, kk5Var3, incrementAndGet);
                                                            arrayList4.add(list5.get(i17));
                                                            arrayList9.add(od0Var);
                                                            map5 = map3;
                                                            str7 = str7;
                                                            jr6Var2 = jr6Var2;
                                                            j = j;
                                                            arrayMap2 = arrayMap2;
                                                            i15 = i17 + 1;
                                                            size7 = i16;
                                                        }
                                                        arrayMap = arrayMap2;
                                                        map4 = map;
                                                        map5 = map3;
                                                        arrayMap3 = arrayMap5;
                                                        str5 = str;
                                                        arrayMap2 = arrayMap;
                                                    }
                                                }
                                                it12 = it;
                                                map5 = map3;
                                                arrayList9 = arrayList9;
                                                str7 = str7;
                                                jr6Var2 = jr6Var2;
                                                str5 = str5;
                                                arrayMap2 = arrayMap2;
                                            }
                                        }
                                        str = str5;
                                        jr6Var = jr6Var2;
                                        str2 = str7;
                                        arrayMap = arrayMap2;
                                        arrayList9 = arrayList9;
                                        map4 = map;
                                        map5 = map3;
                                        od0 od0Var2 = new od0(this.a, list5.get(0), map4, map2, map5, arrayMap4, z, kk5Var3, incrementAndGet);
                                        arrayList4.add(list5.get(0));
                                        arrayList9.add(od0Var2);
                                    } catch (Throwable th) {
                                        Trace.endSection();
                                        throw th;
                                        break;
                                    }
                                } else {
                                    str = str5;
                                    jr6Var = jr6Var2;
                                    str2 = str7;
                                    arrayMap = arrayMap2;
                                    map4 = map;
                                    map5 = map3;
                                    od0 od0Var3 = new od0(me0Var4, build, map4, map2, map5, arrayMap4, z, kk5Var3, incrementAndGet);
                                    arrayList4.add(build);
                                    arrayList9.add(od0Var3);
                                }
                                str7 = str2;
                                jr6Var2 = jr6Var;
                                arrayMap3 = arrayMap5;
                                str5 = str;
                                arrayMap2 = arrayMap;
                            } else {
                                i.m(str7);
                                return null;
                            }
                        }
                        return new vc0(me0Var3.L().h(), z, arrayList4, arrayList9, list2, d51Var, arrayMap2, arrayMap3, this.f, this.g);
                    }
                }
            } else {
                i.m(str6);
                return null;
            }
        } else {
            i.m("build(...) should never be called with an empty request list!");
            return null;
        }
    }

    public final void c() {
        vc0 vc0Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.j) {
                if (!this.k) {
                    this.k = true;
                    di diVar = this.m;
                    if (diVar != null) {
                        i61.z(diVar);
                    }
                    Surface inputSurface = this.a.getInputSurface();
                    if (inputSurface != null) {
                        inputSurface.release();
                    }
                    vc0Var = this.l;
                } else {
                    vc0Var = null;
                }
            }
            if (this.h && vc0Var != null) {
                a(this, vc0Var);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final Integer d(vc0 vc0Var) {
        Integer Q;
        synchronized (this.j) {
            if (this.k) {
                Log.w("CXCP", this + " disconnected. " + vc0Var + " won't be submitted");
                return null;
            }
            if (vc0Var.c.size() == 1) {
                me0 me0Var = this.a;
                if (!(me0Var instanceof qd)) {
                    if (vc0Var.b) {
                        if (this.h) {
                            this.l = vc0Var;
                        }
                        Q = me0Var.i((CaptureRequest) vc0Var.c.get(0), vc0Var);
                    } else {
                        Q = me0Var.d0((CaptureRequest) vc0Var.c.get(0), vc0Var);
                    }
                    return Q;
                }
            }
            boolean z = vc0Var.b;
            me0 me0Var2 = this.a;
            ArrayList arrayList = vc0Var.c;
            if (z) {
                Q = me0Var2.o(arrayList, vc0Var);
            } else {
                Q = me0Var2.Q(arrayList, vc0Var);
            }
            return Q;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.i;
    }
}
