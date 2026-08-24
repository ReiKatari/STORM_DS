package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k72  reason: default package */
/* loaded from: classes.dex */
public final class k72 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public k72(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static k72 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(r72.Q);
        return new k72(bytes, 2, bytes.length);
    }

    public static k72 b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[r72.H[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j2 : jArr) {
            wrap.putInt((int) j2);
        }
        return new k72(wrap.array(), 4, jArr.length);
    }

    public static k72 c(o72[] o72VarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[r72.H[5] * o72VarArr.length]);
        wrap.order(byteOrder);
        for (o72 o72Var : o72VarArr) {
            wrap.putInt((int) o72Var.a);
            wrap.putInt((int) o72Var.b);
        }
        return new k72(wrap.array(), 5, o72VarArr.length);
    }

    public static k72 d(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[r72.H[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new k72(wrap.array(), 3, iArr.length);
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
            } else if (h instanceof o72[]) {
                o72[] o72VarArr = (o72[]) h;
                if (o72VarArr.length == 1) {
                    o72 o72Var = o72VarArr[0];
                    return o72Var.a / o72Var.b;
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
            } else if (h instanceof o72[]) {
                o72[] o72VarArr = (o72[]) h;
                while (i < o72VarArr.length) {
                    sb.append(o72VarArr[i].a);
                    sb.append('/');
                    sb.append(o72VarArr[i].b);
                    i++;
                    if (i != o72VarArr.length) {
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
    /* JADX WARN: Type inference failed for: r13v16, types: [o72[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [o72[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(ByteOrder byteOrder) {
        i72 i72Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                i72Var = new i72(bArr);
                try {
                    i72Var.L = byteOrder;
                    int i = this.a;
                    int i2 = 0;
                    int i3 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    i72Var.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, r72.Q);
                            try {
                                i72Var.close();
                                return str;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str;
                            }
                        case 2:
                        case 7:
                            if (i3 >= r72.I.length) {
                                int i4 = 0;
                                while (true) {
                                    byte[] bArr2 = r72.I;
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
                                    i72Var.close();
                                    return str;
                                }
                            }
                            str = sb.toString();
                            i72Var.close();
                            return str;
                        case 3:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = i72Var.readUnsignedShort();
                                i2++;
                            }
                            try {
                                i72Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i3];
                            while (i2 < i3) {
                                r13[i2] = i72Var.readInt() & 4294967295L;
                                i2++;
                            }
                            i72Var.close();
                            return r13;
                        case 5:
                            r13 = new o72[i3];
                            while (i2 < i3) {
                                r13[i2] = new o72(i72Var.readInt() & 4294967295L, i72Var.readInt() & 4294967295L);
                                i2++;
                            }
                            i72Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = i72Var.readShort();
                                i2++;
                            }
                            i72Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = i72Var.readInt();
                                i2++;
                            }
                            i72Var.close();
                            return r13;
                        case 10:
                            r13 = new o72[i3];
                            while (i2 < i3) {
                                r13[i2] = new o72(i72Var.readInt(), i72Var.readInt());
                                i2++;
                            }
                            i72Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = i72Var.readFloat();
                                i2++;
                            }
                            i72Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = i72Var.readDouble();
                                i2++;
                            }
                            i72Var.close();
                            return r13;
                        default:
                            try {
                                i72Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (i72Var != null) {
                        try {
                            i72Var.close();
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
            i72Var = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(r72.G[this.a]);
        sb.append(", data length:");
        return lb1.o(sb, this.d.length, ")");
    }

    public k72(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
