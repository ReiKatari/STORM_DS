package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s22  reason: default package */
/* loaded from: classes.dex */
public final class s22 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public s22(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static s22 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(z22.O);
        return new s22(bytes, 2, bytes.length);
    }

    public static s22 b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[z22.F[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j2 : jArr) {
            wrap.putInt((int) j2);
        }
        return new s22(wrap.array(), 4, jArr.length);
    }

    public static s22 c(w22[] w22VarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[z22.F[5] * w22VarArr.length]);
        wrap.order(byteOrder);
        for (w22 w22Var : w22VarArr) {
            wrap.putInt((int) w22Var.a);
            wrap.putInt((int) w22Var.b);
        }
        return new s22(wrap.array(), 5, w22VarArr.length);
    }

    public static s22 d(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[z22.F[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new s22(wrap.array(), 3, iArr.length);
    }

    public final double e(ByteOrder byteOrder) {
        Serializable h = h(byteOrder);
        if (h != null) {
            if (h instanceof String) {
                return Double.parseDouble((String) h);
            }
            if (h instanceof long[]) {
                long[] jArr = (long[]) h;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h instanceof int[]) {
                int[] iArr = (int[]) h;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h instanceof double[]) {
                double[] dArr = (double[]) h;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h instanceof w22[]) {
                w22[] w22VarArr = (w22[]) h;
                if (w22VarArr.length == 1) {
                    w22 w22Var = w22VarArr[0];
                    return w22Var.a / w22Var.b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int f(ByteOrder byteOrder) {
        Serializable h = h(byteOrder);
        if (h != null) {
            if (h instanceof String) {
                return Integer.parseInt((String) h);
            }
            if (h instanceof long[]) {
                long[] jArr = (long[]) h;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h instanceof int[]) {
                int[] iArr = (int[]) h;
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
        Serializable h = h(byteOrder);
        if (h != null) {
            if (h instanceof String) {
                return (String) h;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (h instanceof long[]) {
                long[] jArr = (long[]) h;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h instanceof int[]) {
                int[] iArr = (int[]) h;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h instanceof double[]) {
                double[] dArr = (double[]) h;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h instanceof w22[]) {
                w22[] w22VarArr = (w22[]) h;
                while (i < w22VarArr.length) {
                    sb.append(w22VarArr[i].a);
                    sb.append('/');
                    sb.append(w22VarArr[i].b);
                    i++;
                    if (i != w22VarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [w22[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [w22[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(java.nio.ByteOrder r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s22.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(z22.E[this.a]);
        sb.append(", data length:");
        return wh1.m(sb, this.d.length, ")");
    }

    public s22(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
