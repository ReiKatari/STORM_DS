package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e81  reason: default package */
/* loaded from: classes.dex */
public final class e81 implements jd3 {
    public final /* synthetic */ int a;
    public final LinkedHashMap b;

    public e81(int i, byte b) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new LinkedHashMap();
                return;
            case 2:
                this.b = new LinkedHashMap();
                return;
            case 3:
                this.b = new LinkedHashMap();
                return;
            case 4:
                this.b = new LinkedHashMap(0, 0.75f, true);
                return;
            case 5:
            case ig7.b /* 6 */:
            default:
                this.b = new LinkedHashMap();
                return;
            case 7:
                this.b = new LinkedHashMap();
                return;
            case 8:
                this.b = new LinkedHashMap();
                return;
            case 9:
                this.b = new LinkedHashMap();
                return;
        }
    }

    @Override // defpackage.jd3
    public id3 a(vc3 vc3Var) {
        int i = this.a;
        LinkedHashMap linkedHashMap = this.b;
        vc3Var.getClass();
        switch (i) {
            case 1:
                Object obj = linkedHashMap.get(vc3Var);
                if (obj == null) {
                    int i2 = ao1.a[vc3Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        obj = new s66(new s66(vc3Var, 0));
                                    } else {
                                        obj = new s66(new i70(0));
                                    }
                                } else {
                                    obj = new s66(new i70(1));
                                }
                            } else {
                                obj = new i70(2);
                            }
                        } else {
                            obj = new g40(0);
                        }
                    } else {
                        obj = new g40(1);
                    }
                    linkedHashMap.put(vc3Var, obj);
                }
                return (id3) obj;
            default:
                Object obj2 = linkedHashMap.get(vc3Var);
                if (obj2 == null) {
                    switch (fs5.a[vc3Var.ordinal()]) {
                        case 1:
                            obj2 = new ks5();
                            break;
                        case 2:
                            obj2 = new ks5();
                            break;
                        case 3:
                            obj2 = new ks5(0.6666667f);
                            break;
                        case 4:
                            obj2 = new i70(1);
                            break;
                        case 5:
                            obj2 = new i70(0);
                            break;
                        case ig7.b /* 6 */:
                        case 7:
                        case 8:
                            obj2 = new s66(vc3Var, 1);
                            break;
                        default:
                            obj2 = new s66(vc3Var, 0);
                            break;
                    }
                    linkedHashMap.put(vc3Var, obj2);
                }
                return (id3) obj2;
        }
    }

    public void b(qo0 qo0Var, mi2 mi2Var) {
        mi2Var.getClass();
        LinkedHashMap linkedHashMap = this.b;
        if (!linkedHashMap.containsKey(qo0Var)) {
            linkedHashMap.put(qo0Var, new ta7(qo0Var, mi2Var));
        } else {
            f81.d(46, qo0Var.b(), "A `initializer` with the same `clazz` has already been added: ");
        }
    }

    public void c(py3 py3Var) {
        py3Var.getClass();
        int i = py3Var.a;
        int i2 = py3Var.b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + py3Var);
        }
        treeMap.put(Integer.valueOf(i2), py3Var);
    }

    public l9 d() {
        Collection values = this.b.values();
        values.getClass();
        ta7[] ta7VarArr = (ta7[]) values.toArray(new ta7[0]);
        return new l9(2, (ta7[]) Arrays.copyOf(ta7VarArr, ta7VarArr.length));
    }

    public g81 e() {
        g81 g81Var = new g81(this.b);
        a53.Q(g81Var);
        return g81Var;
    }

    public Map f() {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public void g(Object obj, Object obj2) {
        this.b.put(obj, obj2);
    }

    public void h(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            qo0 a = q75.a(obj.getClass());
            if (!a.equals(q75.a(Boolean.TYPE)) && !a.equals(q75.a(Byte.TYPE)) && !a.equals(q75.a(Integer.TYPE)) && !a.equals(q75.a(Long.TYPE)) && !a.equals(q75.a(Float.TYPE)) && !a.equals(q75.a(Double.TYPE)) && !a.equals(q75.a(String.class)) && !a.equals(q75.a(Boolean[].class)) && !a.equals(q75.a(Byte[].class)) && !a.equals(q75.a(Integer[].class)) && !a.equals(q75.a(Long[].class)) && !a.equals(q75.a(Float[].class)) && !a.equals(q75.a(Double[].class)) && !a.equals(q75.a(String[].class))) {
                int i = 0;
                if (a.equals(q75.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = j81.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (a.equals(q75.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = j81.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (a.equals(q75.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = j81.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (a.equals(q75.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = j81.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (a.equals(q75.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = j81.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else if (a.equals(q75.a(double[].class))) {
                    double[] dArr = (double[]) obj;
                    String str7 = j81.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                } else {
                    vd6.g("Key ", str, " has invalid type ", a);
                    return;
                }
                obj = objArr;
            }
        }
        this.b.put(str, obj);
    }

    public void i(String str, k83 k83Var) {
        k83Var.getClass();
        k73 k73Var = (k73) this.b.put(str, k83Var);
    }

    public void j(HashMap hashMap) {
        hashMap.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            h(entry.getValue(), (String) entry.getKey());
        }
    }

    public td6 k(gh7 gh7Var) {
        gh7Var.getClass();
        return (td6) this.b.remove(gh7Var);
    }

    public List l(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.b;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (b53.x(((gh7) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (gh7 gh7Var : linkedHashMap.keySet()) {
            linkedHashMap2.remove(gh7Var);
        }
        return tq0.n1(linkedHashMap.values());
    }

    public td6 m(gh7 gh7Var) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(gh7Var);
        if (obj == null) {
            obj = new td6(gh7Var);
            linkedHashMap.put(gh7Var, obj);
        }
        return (td6) obj;
    }

    public e81(nj4 nj4Var) {
        this.a = 6;
        this.b = zt3.s0(nj4Var.A);
    }

    public e81(int i) {
        this.a = 5;
        this.b = new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Preference.DEFAULT_ORDER);
    }
}
