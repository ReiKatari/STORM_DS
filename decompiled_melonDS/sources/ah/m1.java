package ah;

import android.util.Log;
import androidx.preference.Preference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 implements og.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f797a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f798b;

    public m1(int i2, byte b10) {
        this.f797a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f798b = new LinkedHashMap(0, 0.75f, true);
                return;
            case 2:
                this.f798b = new LinkedHashMap();
                return;
            case 3:
            case 4:
            default:
                this.f798b = new LinkedHashMap();
                return;
            case l1.c.f8511g /* 5 */:
                this.f798b = new LinkedHashMap();
                return;
            case l1.c.f8509e /* 6 */:
                this.f798b = new LinkedHashMap();
                return;
            case 7:
                this.f798b = new LinkedHashMap();
                return;
            case 8:
                this.f798b = new LinkedHashMap();
                return;
        }
    }

    @Override // og.k
    public og.j a(ve.c cVar) {
        int i2 = this.f797a;
        cVar.getClass();
        switch (i2) {
            case 0:
                LinkedHashMap linkedHashMap = this.f798b;
                Object obj = linkedHashMap.get(cVar);
                if (obj == null) {
                    switch (l1.f796a[cVar.ordinal()]) {
                        case DSiCameraSource.FrontCamera /* 1 */:
                            obj = new fh.a(0);
                            break;
                        case 2:
                            obj = new fh.a(0);
                            break;
                        case 3:
                            obj = new tg.a(1);
                            break;
                        case 4:
                            obj = new tg.a(0);
                            break;
                        case l1.c.f8511g /* 5 */:
                        case l1.c.f8509e /* 6 */:
                        case 7:
                            obj = new fh.c(cVar, 0);
                            break;
                        default:
                            obj = new fh.c(cVar, 1);
                            break;
                    }
                    linkedHashMap.put(cVar, obj);
                }
                return (og.j) obj;
            default:
                LinkedHashMap linkedHashMap2 = this.f798b;
                Object obj2 = linkedHashMap2.get(cVar);
                if (obj2 == null) {
                    int i10 = rh.a.f12721a[cVar.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    obj2 = new fh.c(new fh.c(cVar, 1));
                                } else {
                                    obj2 = new fh.c(new tg.a(0));
                                }
                            } else {
                                obj2 = new fh.c(new tg.a(1));
                            }
                        } else {
                            obj2 = new fh.a(1);
                        }
                    } else {
                        obj2 = new fh.a(2);
                    }
                    linkedHashMap2.put(cVar, obj2);
                }
                return (og.j) obj2;
        }
    }

    public void b(nc.e eVar, mc.l lVar) {
        lVar.getClass();
        LinkedHashMap linkedHashMap = this.f798b;
        if (!linkedHashMap.containsKey(eVar)) {
            linkedHashMap.put(eVar, new w6.e(eVar, lVar));
        } else {
            m9.o.e(46, eVar.b(), "A `initializer` with the same `clazz` has already been added: ");
        }
    }

    public void c(n7.a aVar) {
        aVar.getClass();
        int i2 = aVar.f10095a;
        int i10 = aVar.f10096b;
        Integer valueOf = Integer.valueOf(i2);
        LinkedHashMap linkedHashMap = this.f798b;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i10)) + " with " + aVar);
        }
        treeMap.put(Integer.valueOf(i10), aVar);
    }

    public Map d() {
        LinkedHashMap linkedHashMap = this.f798b;
        if (linkedHashMap.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public jb.e e() {
        Collection values = this.f798b.values();
        values.getClass();
        w6.e[] eVarArr = (w6.e[]) values.toArray(new w6.e[0]);
        return new jb.e(2, (w6.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }

    public p8.h f() {
        p8.h hVar = new p8.h(this.f798b);
        p7.j.J(hVar);
        return hVar;
    }

    public void g(Object obj, Object obj2) {
        this.f798b.put(obj, obj2);
    }

    public void h(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            nc.e a10 = nc.u.a(obj.getClass());
            if (!a10.equals(nc.u.a(Boolean.TYPE)) && !a10.equals(nc.u.a(Byte.TYPE)) && !a10.equals(nc.u.a(Integer.TYPE)) && !a10.equals(nc.u.a(Long.TYPE)) && !a10.equals(nc.u.a(Float.TYPE)) && !a10.equals(nc.u.a(Double.TYPE)) && !a10.equals(nc.u.a(String.class)) && !a10.equals(nc.u.a(Boolean[].class)) && !a10.equals(nc.u.a(Byte[].class)) && !a10.equals(nc.u.a(Integer[].class)) && !a10.equals(nc.u.a(Long[].class)) && !a10.equals(nc.u.a(Float[].class)) && !a10.equals(nc.u.a(Double[].class)) && !a10.equals(nc.u.a(String[].class))) {
                int i2 = 0;
                if (a10.equals(nc.u.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = p8.i.f11495a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i2 < length) {
                        objArr[i2] = Boolean.valueOf(zArr[i2]);
                        i2++;
                    }
                } else if (a10.equals(nc.u.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = p8.i.f11495a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i2 < length2) {
                        objArr[i2] = Byte.valueOf(bArr[i2]);
                        i2++;
                    }
                } else if (a10.equals(nc.u.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = p8.i.f11495a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i2 < length3) {
                        objArr[i2] = Integer.valueOf(iArr[i2]);
                        i2++;
                    }
                } else if (a10.equals(nc.u.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = p8.i.f11495a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i2 < length4) {
                        objArr[i2] = Long.valueOf(jArr[i2]);
                        i2++;
                    }
                } else if (a10.equals(nc.u.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = p8.i.f11495a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i2 < length5) {
                        objArr[i2] = Float.valueOf(fArr[i2]);
                        i2++;
                    }
                } else if (a10.equals(nc.u.a(double[].class))) {
                    double[] dArr = (double[]) obj;
                    String str7 = p8.i.f11495a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i2 < length6) {
                        objArr[i2] = Double.valueOf(dArr[i2]);
                        i2++;
                    }
                } else {
                    fj.j.s("Key ", str, " has invalid type ", a10);
                    return;
                }
                obj = objArr;
            }
        }
        this.f798b.put(str, obj);
    }

    public void i(HashMap hashMap) {
        hashMap.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            h(entry.getValue(), (String) entry.getKey());
        }
    }

    public List j(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f798b;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (nc.k.a(((x8.i) entry.getKey()).f14391a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (x8.i iVar : linkedHashMap.keySet()) {
            linkedHashMap2.remove(iVar);
        }
        return zb.l.p0(linkedHashMap.values());
    }

    public q8.j k(x8.i iVar) {
        iVar.getClass();
        return (q8.j) this.f798b.remove(iVar);
    }

    public q8.j l(x8.i iVar) {
        LinkedHashMap linkedHashMap = this.f798b;
        Object obj = linkedHashMap.get(iVar);
        if (obj == null) {
            obj = new q8.j(iVar);
            linkedHashMap.put(iVar, obj);
        }
        return (q8.j) obj;
    }

    public m1(int i2) {
        this.f797a = 4;
        this.f798b = new LinkedHashMap(i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Preference.DEFAULT_ORDER);
    }

    public m1(m9.p pVar) {
        this.f797a = 3;
        this.f798b = zb.v.J(pVar.A);
    }
}
