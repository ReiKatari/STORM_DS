package c;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f2331a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2332b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2333c;

    public b(byte[] bArr, int i2, int i10) {
        this.f2331a = i2;
        this.f2332b = i10;
        this.f2333c = bArr;
    }

    public static b a(long j2, ByteOrder byteOrder) {
        long[] jArr = {j2};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[e.f2345p[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new b(wrap.array(), 4, 1);
    }

    public static b b(d dVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[e.f2345p[5]]);
        wrap.order(byteOrder);
        d dVar2 = new d[]{dVar}[0];
        wrap.putInt((int) dVar2.f2338a);
        wrap.putInt((int) dVar2.f2339b);
        return new b(wrap.array(), 5, 1);
    }

    public static b c(int i2, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[e.f2345p[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i2}[0]);
        return new b(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Double.parseDouble((String) g10);
            }
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof d[]) {
                d[] dVarArr = (d[]) g10;
                if (dVarArr.length == 1) {
                    d dVar = dVarArr[0];
                    return dVar.f2338a / dVar.f2339b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Integer.parseInt((String) g10);
            }
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return (String) g10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                while (i2 < jArr.length) {
                    sb2.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                while (i2 < iArr.length) {
                    sb2.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                while (i2 < dArr.length) {
                    sb2.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof d[]) {
                d[] dVarArr = (d[]) g10;
                while (i2 < dVarArr.length) {
                    sb2.append(dVarArr[i2].f2338a);
                    sb2.append('/');
                    sb2.append(dVarArr[i2].f2339b);
                    i2++;
                    if (i2 != dVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [c.d[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [c.d[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(e.f2344o[this.f2331a]);
        sb2.append(", data length:");
        return w.d.q(sb2, this.f2333c.length, ")");
    }
}
