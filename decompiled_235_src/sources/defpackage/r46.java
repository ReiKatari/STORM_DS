package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r46  reason: default package */
/* loaded from: classes.dex */
public final class r46 implements q46 {
    public final qn2 A;
    public final ja4 B;
    public ja4 L;

    public r46(Map map, qn2 qn2Var) {
        ja4 ja4Var;
        this.A = qn2Var;
        if (map != null && !map.isEmpty()) {
            ja4Var = new ja4(map.size());
            for (Map.Entry entry : map.entrySet()) {
                ja4Var.m(entry.getKey(), entry.getValue());
            }
        } else {
            ja4Var = null;
        }
        this.B = ja4Var;
    }

    @Override // defpackage.q46
    public final m44 a(String str, on2 on2Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!g04.J(str.charAt(i))) {
                ja4 ja4Var = this.L;
                if (ja4Var == null) {
                    long[] jArr = b66.a;
                    ja4Var = new ja4();
                    this.L = ja4Var;
                }
                Object g = ja4Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    ja4Var.m(str, g);
                }
                ((List) g).add(on2Var);
                return new m44(ja4Var, str, on2Var, 13);
            }
        }
        i.h("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.q46
    public final boolean c(Object obj) {
        return ((Boolean) this.A.g(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    @Override // defpackage.q46
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map d() {
        int i;
        int i2;
        char c;
        long j;
        long j2;
        long j3;
        ja4 ja4Var;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i4;
        char c2;
        long j4;
        ja4 ja4Var2 = this.B;
        if (ja4Var2 == null && this.L == null) {
            return zt1.A;
        }
        int i5 = 0;
        if (ja4Var2 != null) {
            i = ja4Var2.e;
        } else {
            i = 0;
        }
        ja4 ja4Var3 = this.L;
        if (ja4Var3 != null) {
            i2 = ja4Var3.e;
        } else {
            i2 = 0;
        }
        HashMap hashMap = new HashMap(i + i2);
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i6 = 8;
        if (ja4Var2 != null) {
            Object[] objArr = ja4Var2.b;
            Object[] objArr2 = ja4Var2.c;
            long[] jArr3 = ja4Var2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i7];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j6 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i10], (List) objArr2[i10]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i9++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i8 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    c3 = c;
                    j5 = j;
                }
                ja4Var = this.L;
                if (ja4Var != null) {
                    Object[] objArr3 = ja4Var.b;
                    Object[] objArr4 = ja4Var.c;
                    long[] jArr4 = ja4Var.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j7 = jArr4[i11];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                int i13 = i5;
                                while (i13 < i12) {
                                    if ((j7 & j3) < j2) {
                                        int i14 = (i11 << 3) + i13;
                                        Object obj = objArr3[i14];
                                        List list = (List) objArr4[i14];
                                        String str = (String) obj;
                                        i4 = i6;
                                        if (list.size() == 1) {
                                            Object c4 = ((on2) list.get(i5)).c();
                                            if (c4 != null) {
                                                if (c(c4)) {
                                                    hashMap.put(str, hf.w(c4));
                                                } else {
                                                    u34.f(qo2.z(c4));
                                                    return null;
                                                }
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i5 < size) {
                                                long[] jArr5 = jArr4;
                                                Object c5 = ((on2) list.get(i5)).c();
                                                if (c5 != null && !c(c5)) {
                                                    u34.f(qo2.z(c5));
                                                    return null;
                                                }
                                                arrayList.add(c5);
                                                i5++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i4 = i6;
                                    }
                                    j7 >>= i4;
                                    i13++;
                                    i6 = i4;
                                    jArr4 = jArr2;
                                    i5 = 0;
                                }
                                jArr = jArr4;
                                i3 = i6;
                                if (i12 != i3) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i3 = i6;
                            }
                            if (i11 == length2) {
                                break;
                            }
                            i11++;
                            i6 = i3;
                            jArr4 = jArr;
                            i5 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        ja4Var = this.L;
        if (ja4Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.q46
    public final Object e(String str) {
        List list;
        ja4 ja4Var = this.B;
        if (ja4Var != null) {
            list = (List) ja4Var.k(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && ja4Var != null) {
            List subList = list.subList(1, list.size());
            int f = ja4Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = ja4Var.c;
            Object obj = objArr[f];
            ja4Var.b[f] = str;
            objArr[f] = subList;
            List list2 = (List) obj;
        }
        return list.get(0);
    }
}
