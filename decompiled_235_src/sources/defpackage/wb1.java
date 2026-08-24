package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb1  reason: default package */
/* loaded from: classes.dex */
public final class wb1 implements bk3 {
    public final /* synthetic */ int a;
    public final LinkedHashMap b;

    public wb1(int i, byte b) {
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
            case 6:
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

    @Override // defpackage.bk3
    public ak3 a(nj3 nj3Var) {
        int i = this.a;
        LinkedHashMap linkedHashMap = this.b;
        nj3Var.getClass();
        switch (i) {
            case 1:
                Object obj = linkedHashMap.get(nj3Var);
                if (obj == null) {
                    int i2 = ks1.a[nj3Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        obj = new hs1(new hs1(nj3Var));
                                    } else {
                                        obj = new hs1(new p90(0));
                                    }
                                } else {
                                    obj = new hs1(new p90(1));
                                }
                            } else {
                                obj = new p90(2);
                            }
                        } else {
                            obj = new e60(0);
                        }
                    } else {
                        obj = new e60(1);
                    }
                    linkedHashMap.put(nj3Var, obj);
                }
                return (ak3) obj;
            default:
                Object obj2 = linkedHashMap.get(nj3Var);
                if (obj2 == null) {
                    int i3 = x26.a[nj3Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        obj2 = new hs1(nj3Var);
                                    } else {
                                        obj2 = new p90(0);
                                    }
                                } else {
                                    obj2 = new p90(1);
                                }
                            } else {
                                obj2 = new c36(0.6666667f);
                            }
                        } else {
                            obj2 = new c36();
                        }
                    } else {
                        obj2 = new c36();
                    }
                    linkedHashMap.put(nj3Var, obj2);
                }
                return (ak3) obj2;
        }
    }

    public void b(ar0 ar0Var, qn2 qn2Var) {
        qn2Var.getClass();
        LinkedHashMap linkedHashMap = this.b;
        if (!linkedHashMap.containsKey(ar0Var)) {
            linkedHashMap.put(ar0Var, new so7(ar0Var, qn2Var));
        } else {
            e41.j("A `initializer` with the same `clazz` has already been added: ", 46, ar0Var.b());
        }
    }

    public void c(i64 i64Var) {
        i64Var.getClass();
        int i = i64Var.a;
        int i2 = i64Var.b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + i64Var);
        }
        treeMap.put(Integer.valueOf(i2), i64Var);
    }

    public m9 d() {
        Collection values = this.b.values();
        values.getClass();
        so7[] so7VarArr = (so7[]) values.toArray(new so7[0]);
        return new m9((so7[]) Arrays.copyOf(so7VarArr, so7VarArr.length), 2);
    }

    public xb1 e() {
        xb1 xb1Var = new xb1(this.b);
        u24.H(xb1Var);
        return xb1Var;
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
            ar0 a = gh5.a(obj.getClass());
            if (!a.equals(gh5.a(Boolean.TYPE)) && !a.equals(gh5.a(Byte.TYPE)) && !a.equals(gh5.a(Integer.TYPE)) && !a.equals(gh5.a(Long.TYPE)) && !a.equals(gh5.a(Float.TYPE)) && !a.equals(gh5.a(Double.TYPE)) && !a.equals(gh5.a(String.class)) && !a.equals(gh5.a(Boolean[].class)) && !a.equals(gh5.a(Byte[].class)) && !a.equals(gh5.a(Integer[].class)) && !a.equals(gh5.a(Long[].class)) && !a.equals(gh5.a(Float[].class)) && !a.equals(gh5.a(Double[].class)) && !a.equals(gh5.a(String[].class))) {
                int i = 0;
                if (a.equals(gh5.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = ac1.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (a.equals(gh5.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = ac1.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (a.equals(gh5.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = ac1.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (a.equals(gh5.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = ac1.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (a.equals(gh5.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = ac1.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else if (a.equals(gh5.a(double[].class))) {
                    double[] dArr = (double[]) obj;
                    String str7 = ac1.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                } else {
                    fa6.f("Key ", str, " has invalid type ", a);
                    return;
                }
                obj = objArr;
            }
        }
        this.b.put(str, obj);
    }

    public void i(String str, df3 df3Var) {
        df3Var.getClass();
        de3 de3Var = (de3) this.b.put(str, df3Var);
    }

    public void j(HashMap hashMap) {
        hashMap.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            h(entry.getValue(), (String) entry.getKey());
        }
    }

    public jp6 k(gw7 gw7Var) {
        gw7Var.getClass();
        return (jp6) this.b.remove(gw7Var);
    }

    public List l(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.b;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (nb3.k(((gw7) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (gw7 gw7Var : linkedHashMap.keySet()) {
            linkedHashMap2.remove(gw7Var);
        }
        return gt0.k1(linkedHashMap.values());
    }

    public jp6 m(gw7 gw7Var) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(gw7Var);
        if (obj == null) {
            obj = new jp6(gw7Var);
            linkedHashMap.put(gw7Var, obj);
        }
        return (jp6) obj;
    }

    public wb1(ps4 ps4Var) {
        this.a = 6;
        this.b = c14.t0(ps4Var.A);
    }

    public wb1(int i) {
        this.a = 5;
        this.b = new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }
}
