package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t22  reason: default package */
/* loaded from: classes.dex */
public final class t22 {
    public final int a;
    public final int b;
    public final byte[] c;

    public t22(byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static t22 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[a32.p[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new t22(wrap.array(), 4, 1);
    }

    public static t22 b(x22 x22Var, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[a32.p[5]]);
        wrap.order(byteOrder);
        x22 x22Var2 = new x22[]{x22Var}[0];
        wrap.putInt((int) x22Var2.a);
        wrap.putInt((int) x22Var2.b);
        return new t22(wrap.array(), 5, 1);
    }

    public static t22 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[a32.p[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new t22(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g != null) {
            if (g instanceof String) {
                return Double.parseDouble((String) g);
            }
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof double[]) {
                double[] dArr = (double[]) g;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof x22[]) {
                x22[] x22VarArr = (x22[]) g;
                if (x22VarArr.length == 1) {
                    x22 x22Var = x22VarArr[0];
                    return x22Var.a / x22Var.b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g != null) {
            if (g instanceof String) {
                return Integer.parseInt((String) g);
            }
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
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
        Serializable g = g(byteOrder);
        if (g != null) {
            if (g instanceof String) {
                return (String) g;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (g instanceof double[]) {
                double[] dArr = (double[]) g;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (g instanceof x22[]) {
                x22[] x22VarArr = (x22[]) g;
                while (i < x22VarArr.length) {
                    sb.append(x22VarArr[i].a);
                    sb.append('/');
                    sb.append(x22VarArr[i].b);
                    i++;
                    if (i != x22VarArr.length) {
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
    /* JADX WARN: Type inference failed for: r13v16, types: [x22[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [x22[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t22.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(a32.o[this.a]);
        sb.append(", data length:");
        return wh1.m(sb, this.c.length, ")");
    }
}
