package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nu */
/* loaded from: classes.dex */
public abstract class nu extends l {
    public static char A0(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            i.i("Array has more than one element.");
            return (char) 0;
        }
        vd6.e("Array is empty.");
        return (char) 0;
    }

    public static final void B0(Object[] objArr, LinkedHashSet linkedHashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List C0(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(dArr.length);
                for (double d : dArr) {
                    arrayList.add(Double.valueOf(d));
                }
                return arrayList;
            }
            return l07.b0(Double.valueOf(dArr[0]));
        }
        return pp1.A;
    }

    public static List D0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(Float.valueOf(f));
                }
                return arrayList;
            }
            return l07.b0(Float.valueOf(fArr[0]));
        }
        return pp1.A;
    }

    public static List E0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return l07.b0(Long.valueOf(jArr[0]));
        }
        return pp1.A;
    }

    public static List F0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
                asList.getClass();
                return asList;
            }
            return l07.b0(objArr[0]);
        }
        return pp1.A;
    }

    public static List G0(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z : zArr) {
                    arrayList.add(Boolean.valueOf(z));
                }
                return arrayList;
            }
            return l07.b0(Boolean.valueOf(zArr[0]));
        }
        return pp1.A;
    }

    public static Set H0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(objArr.length));
                B0(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return hi2.X(objArr[0]);
        }
        return up1.A;
    }

    public static Integer[] I0(int[] iArr) {
        iArr.getClass();
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static ArrayList J0(Object[] objArr, Object[] objArr2) {
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new ti4(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static List X(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static boolean Y(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (i == iArr[i2]) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public static boolean Z(long[] jArr, long j) {
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (j == jArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static boolean a0(Object[] objArr, Object obj) {
        objArr.getClass();
        if (w0(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean b0(Object[] objArr, Object[] objArr2) {
        if (objArr != objArr2) {
            if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    Object obj2 = objArr2[i];
                    if (obj != obj2) {
                        if (obj != null && obj2 != null) {
                            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                                if (!b0((Object[]) obj, (Object[]) obj2)) {
                                }
                            } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                                if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                }
                            } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                                if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                }
                            } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                                if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                }
                            } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                                if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                }
                            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                                if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                }
                            } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                                if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                }
                            } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                                if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                }
                            } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                                if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                }
                            } else if ((obj instanceof f17) && (obj2 instanceof f17)) {
                                if (!Arrays.equals(((f17) obj).A, ((f17) obj2).A)) {
                                }
                            } else if ((obj instanceof d27) && (obj2 instanceof d27)) {
                                if (!Arrays.equals(((d27) obj).A, ((d27) obj2).A)) {
                                }
                            } else if ((obj instanceof s17) && (obj2 instanceof s17)) {
                                if (!Arrays.equals(((s17) obj).A, ((s17) obj2).A)) {
                                }
                            } else if ((obj instanceof x17) && (obj2 instanceof x17)) {
                                if (!Arrays.equals(((x17) obj).A, ((x17) obj2).A)) {
                                }
                            } else if (!obj.equals(obj2)) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static void c0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void d0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void e0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void f0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void g0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        c0(0, i, i2, bArr, bArr2);
    }

    public static /* synthetic */ void h0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        d0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void i0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        f0(objArr, objArr2, 0, i, i2);
    }

    public static byte[] j0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        l.z(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] k0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        l.z(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void l0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void m0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList o0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object p0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        vd6.e("Array is empty.");
        return null;
    }

    public static Object q0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b33, d33] */
    public static d33 r0(int[] iArr) {
        return new b33(0, iArr.length - 1, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b33, d33] */
    public static d33 s0(Object[] objArr) {
        objArr.getClass();
        return new b33(0, objArr.length - 1, 1);
    }

    public static int t0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer u0(int[] iArr, int i) {
        if (i >= 0 && i < iArr.length) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static Object v0(int i, Object[] objArr) {
        objArr.getClass();
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static int w0(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String x0(byte[] bArr, mi2 mi2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) mi2Var.n(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String y0(Object[] objArr, String str, String str2, nl0 nl0Var, int i) {
        if ((i & 32) != 0) {
            nl0Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ", ");
            }
            yf2.i(sb, obj, nl0Var);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static Object[] z0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }
}
