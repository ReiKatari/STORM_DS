package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l72  reason: default package */
/* loaded from: classes.dex */
public final class l72 {
    public final int a;
    public final int b;
    public final byte[] c;

    public l72(byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static l72 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[s72.r[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new l72(wrap.array(), 4, 1);
    }

    public static l72 b(p72 p72Var, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[s72.r[5]]);
        wrap.order(byteOrder);
        p72 p72Var2 = new p72[]{p72Var}[0];
        wrap.putInt((int) p72Var2.a);
        wrap.putInt((int) p72Var2.b);
        return new l72(wrap.array(), 5, 1);
    }

    public static l72 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[s72.r[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new l72(wrap.array(), 3, 1);
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
            } else if (g instanceof p72[]) {
                p72[] p72VarArr = (p72[]) g;
                if (p72VarArr.length == 1) {
                    p72 p72Var = p72VarArr[0];
                    return p72Var.a / p72Var.b;
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
            } else if (g instanceof p72[]) {
                p72[] p72VarArr = (p72[]) g;
                while (i < p72VarArr.length) {
                    sb.append(p72VarArr[i].a);
                    sb.append('/');
                    sb.append(p72VarArr[i].b);
                    i++;
                    if (i != p72VarArr.length) {
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
    /* JADX WARN: Type inference failed for: r13v16, types: [p72[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [p72[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        j72 j72Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.c;
        InputStream inputStream2 = null;
        try {
            try {
                j72Var = new j72(bArr);
                try {
                    j72Var.B = byteOrder;
                    int i = this.a;
                    int i2 = 0;
                    int i3 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    j72Var.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, s72.A);
                            try {
                                j72Var.close();
                                return str;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str;
                            }
                        case 2:
                        case 7:
                            if (i3 >= s72.s.length) {
                                int i4 = 0;
                                while (true) {
                                    byte[] bArr2 = s72.s;
                                    if (i4 < bArr2.length) {
                                        if (bArr[i4] == bArr2[i4]) {
                                            i4++;
                                        }
                                    } else {
                                        i2 = bArr2.length;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i2 < i3) {
                                byte b2 = bArr[i2];
                                if (b2 != 0) {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i2++;
                                } else {
                                    str = sb.toString();
                                    j72Var.close();
                                    return str;
                                }
                            }
                            str = sb.toString();
                            j72Var.close();
                            return str;
                        case 3:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = j72Var.readUnsignedShort();
                                i2++;
                            }
                            try {
                                j72Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i3];
                            while (i2 < i3) {
                                r13[i2] = j72Var.readInt() & 4294967295L;
                                i2++;
                            }
                            j72Var.close();
                            return r13;
                        case 5:
                            r13 = new p72[i3];
                            while (i2 < i3) {
                                r13[i2] = new p72(j72Var.readInt() & 4294967295L, j72Var.readInt() & 4294967295L);
                                i2++;
                            }
                            j72Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = j72Var.readShort();
                                i2++;
                            }
                            j72Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = j72Var.readInt();
                                i2++;
                            }
                            j72Var.close();
                            return r13;
                        case 10:
                            r13 = new p72[i3];
                            while (i2 < i3) {
                                r13[i2] = new p72(j72Var.readInt(), j72Var.readInt());
                                i2++;
                            }
                            j72Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = j72Var.readFloat();
                                i2++;
                            }
                            j72Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = j72Var.readDouble();
                                i2++;
                            }
                            j72Var.close();
                            return r13;
                        default:
                            try {
                                j72Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (j72Var != null) {
                        try {
                            j72Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e7) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            j72Var = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(s72.q[this.a]);
        sb.append(", data length:");
        return lb1.o(sb, this.c.length, ")");
    }
}
