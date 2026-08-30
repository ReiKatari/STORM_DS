package p6;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f11366a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11367b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11368c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f11369d;

    public c(long j2, byte[] bArr, int i2, int i10) {
        this.f11366a = i2;
        this.f11367b = i10;
        this.f11368c = j2;
        this.f11369d = bArr;
    }

    public static c a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(g.O);
        return new c(bytes, 2, bytes.length);
    }

    public static c b(long j2, ByteOrder byteOrder) {
        long[] jArr = {j2};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new c(wrap.array(), 4, jArr.length);
    }

    public static c c(e[] eVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[5] * eVarArr.length]);
        wrap.order(byteOrder);
        for (e eVar : eVarArr) {
            wrap.putInt((int) eVar.f11374a);
            wrap.putInt((int) eVar.f11375b);
        }
        return new c(wrap.array(), 5, eVarArr.length);
    }

    public static c d(int i2, ByteOrder byteOrder) {
        int[] iArr = {i2};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new c(wrap.array(), 3, iArr.length);
    }

    public final double e(ByteOrder byteOrder) {
        Serializable h2 = h(byteOrder);
        if (h2 != null) {
            if (h2 instanceof String) {
                return Double.parseDouble((String) h2);
            }
            if (h2 instanceof long[]) {
                long[] jArr = (long[]) h2;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h2 instanceof int[]) {
                int[] iArr = (int[]) h2;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h2 instanceof double[]) {
                double[] dArr = (double[]) h2;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h2 instanceof e[]) {
                e[] eVarArr = (e[]) h2;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.f11374a / eVar.f11375b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int f(ByteOrder byteOrder) {
        Serializable h2 = h(byteOrder);
        if (h2 != null) {
            if (h2 instanceof String) {
                return Integer.parseInt((String) h2);
            }
            if (h2 instanceof long[]) {
                long[] jArr = (long[]) h2;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h2 instanceof int[]) {
                int[] iArr = (int[]) h2;
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

    public final String g(ByteOrder byteOrder) {
        Serializable h2 = h(byteOrder);
        if (h2 != null) {
            if (h2 instanceof String) {
                return (String) h2;
            }
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            if (h2 instanceof long[]) {
                long[] jArr = (long[]) h2;
                while (i2 < jArr.length) {
                    sb2.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h2 instanceof int[]) {
                int[] iArr = (int[]) h2;
                while (i2 < iArr.length) {
                    sb2.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h2 instanceof double[]) {
                double[] dArr = (double[]) h2;
                while (i2 < dArr.length) {
                    sb2.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h2 instanceof e[]) {
                e[] eVarArr = (e[]) h2;
                while (i2 < eVarArr.length) {
                    sb2.append(eVarArr[i2].f11374a);
                    sb2.append('/');
                    sb2.append(eVarArr[i2].f11375b);
                    i2++;
                    if (i2 != eVarArr.length) {
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
    /* JADX WARN: Type inference failed for: r14v25, types: [p6.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [p6.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.E[this.f11366a]);
        sb2.append(", data length:");
        return w.d.q(sb2, this.f11369d.length, ")");
    }

    public c(byte[] bArr, int i2, int i10) {
        this(-1L, bArr, i2, i10);
    }
}
