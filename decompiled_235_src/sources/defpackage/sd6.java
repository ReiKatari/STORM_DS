package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd6  reason: default package */
/* loaded from: classes.dex */
public final class sd6 implements Closeable {
    public static final byte[] f0 = {55, 122, -68, -81, 39, 28};
    public final String A;
    public SeekableByteChannel B;
    public final qa L;
    public InputStream Y;
    public byte[] Z;
    public final int e0;
    public int R = -1;
    public int X = -1;
    public final ArrayList d0 = new ArrayList();

    public sd6(FileChannel fileChannel, String str, boolean z, int i) {
        this.B = fileChannel;
        this.A = str;
        this.e0 = i;
        try {
            this.L = D();
            this.Z = null;
        } catch (Throwable th) {
            if (z) {
                this.B.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, fi2] */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v24 */
    public static void F(ByteBuffer byteBuffer, qa qaVar) {
        long j;
        int i;
        fi2[] fi2VarArr;
        fi2[] fi2VarArr2;
        long j2;
        ?? r6;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        long J;
        long J2;
        byte[] bArr;
        int u = u(byteBuffer);
        long j3 = 4294967295L;
        if (u == 6) {
            qaVar.B = J(byteBuffer);
            int J3 = (int) J(byteBuffer);
            int u2 = u(byteBuffer);
            if (u2 == 9) {
                qaVar.L = new long[J3];
                int i3 = 0;
                while (true) {
                    long[] jArr = (long[]) qaVar.L;
                    if (i3 >= jArr.length) {
                        break;
                    }
                    jArr[i3] = J(byteBuffer);
                    i3++;
                }
                u2 = u(byteBuffer);
            }
            if (u2 == 10) {
                qaVar.R = v(J3, byteBuffer);
                qaVar.X = new long[J3];
                for (int i4 = 0; i4 < J3; i4++) {
                    if (((BitSet) qaVar.R).get(i4)) {
                        k(4, byteBuffer);
                        ((long[]) qaVar.X)[i4] = byteBuffer.getInt() & 4294967295L;
                    }
                }
                u(byteBuffer);
            }
            u = u(byteBuffer);
        }
        if (u == 7) {
            u(byteBuffer);
            int J4 = (int) J(byteBuffer);
            fi2[] fi2VarArr3 = new fi2[J4];
            qaVar.Y = fi2VarArr3;
            u(byteBuffer);
            int i5 = 0;
            while (i5 < J4) {
                ?? obj = new Object();
                long j4 = j3;
                int J5 = (int) J(byteBuffer);
                ps0[] ps0VarArr = new ps0[J5];
                long j5 = 0;
                int i6 = 0;
                long j6 = 0;
                while (i6 < J5) {
                    long j7 = j4;
                    int u3 = u(byteBuffer);
                    int i7 = u3 & 15;
                    if ((u3 & 16) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((u3 & 32) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((u3 & 128) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    byte[] bArr2 = new byte[i7];
                    k(i7, byteBuffer);
                    byteBuffer.get(bArr2);
                    if (z) {
                        J = 1;
                        J2 = 1;
                    } else {
                        J = J(byteBuffer);
                        J2 = J(byteBuffer);
                    }
                    long j8 = j5 + J;
                    j6 += J2;
                    fi2[] fi2VarArr4 = fi2VarArr3;
                    if (z2) {
                        int J6 = (int) J(byteBuffer);
                        bArr = new byte[J6];
                        k(J6, byteBuffer);
                        byteBuffer.get(bArr);
                    } else {
                        bArr = null;
                    }
                    byte[] bArr3 = bArr;
                    if (!z3) {
                        ps0VarArr[i6] = new ps0(bArr2, J, J2, bArr3);
                        i6++;
                        fi2VarArr3 = fi2VarArr4;
                        j5 = j8;
                        j4 = j7;
                    } else {
                        e41.i("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                        return;
                    }
                }
                fi2[] fi2VarArr5 = fi2VarArr3;
                long j9 = j4;
                obj.a = ps0VarArr;
                obj.b = j5;
                obj.c = j6;
                long j10 = j6 - 1;
                int i8 = (int) j10;
                h40[] h40VarArr = new h40[i8];
                int i9 = 0;
                while (i9 < i8) {
                    h40VarArr[i9] = new h40(J(byteBuffer), J(byteBuffer));
                    i9++;
                    fi2VarArr5 = fi2VarArr5;
                    j10 = j10;
                }
                fi2[] fi2VarArr6 = fi2VarArr5;
                obj.d = h40VarArr;
                long j11 = j5 - j10;
                int i10 = (int) j11;
                long[] jArr2 = new long[i10];
                if (j11 == 1) {
                    int i11 = 0;
                    while (i11 < ((int) j5)) {
                        if (obj.d != null) {
                            i2 = 0;
                            while (true) {
                                h40[] h40VarArr2 = obj.d;
                                if (i2 >= h40VarArr2.length) {
                                    break;
                                } else if (h40VarArr2[i2].b == i11) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        i2 = -1;
                        if (i2 < 0) {
                            break;
                        }
                        i11++;
                    }
                    jArr2[0] = i11;
                } else {
                    for (int i12 = 0; i12 < i10; i12++) {
                        jArr2[i12] = J(byteBuffer);
                    }
                }
                obj.e = jArr2;
                fi2VarArr6[i5] = obj;
                i5++;
                fi2VarArr3 = fi2VarArr6;
                j3 = j9;
            }
            fi2[] fi2VarArr7 = fi2VarArr3;
            j = j3;
            int i13 = 0;
            u(byteBuffer);
            for (int i14 = 0; i14 < J4; i14++) {
                fi2 fi2Var = fi2VarArr7[i14];
                e(fi2Var.c, "totalOutputStreams");
                fi2Var.f = new long[(int) fi2Var.c];
                for (int i15 = 0; i15 < fi2Var.c; i15++) {
                    fi2Var.f[i15] = J(byteBuffer);
                }
            }
            if (u(byteBuffer) == 10) {
                BitSet v = v(J4, byteBuffer);
                int i16 = 0;
                while (i16 < J4) {
                    if (v.get(i16)) {
                        fi2 fi2Var2 = fi2VarArr7[i16];
                        fi2Var2.g = true;
                        k(4, byteBuffer);
                        fi2Var2.h = byteBuffer.getInt() & j;
                        r6 = i13;
                    } else {
                        r6 = i13;
                        fi2VarArr7[i16].g = r6;
                    }
                    i16++;
                    i13 = r6;
                }
                i = i13;
                u(byteBuffer);
            } else {
                i = 0;
            }
            u = u(byteBuffer);
        } else {
            j = 4294967295L;
            i = 0;
            qaVar.Y = fi2.j;
        }
        if (u == 8) {
            fi2[] fi2VarArr8 = (fi2[]) qaVar.Y;
            int length = fi2VarArr8.length;
            for (int i17 = i; i17 < length; i17++) {
                fi2VarArr8[i17].i = 1;
            }
            long length2 = ((fi2[]) qaVar.Y).length;
            int u4 = u(byteBuffer);
            if (u4 == 13) {
                fi2[] fi2VarArr9 = (fi2[]) qaVar.Y;
                int length3 = fi2VarArr9.length;
                long j12 = 0;
                for (int i18 = i; i18 < length3; i18++) {
                    fi2 fi2Var3 = fi2VarArr9[i18];
                    long J7 = J(byteBuffer);
                    fi2Var3.i = (int) J7;
                    j12 += J7;
                }
                long j13 = j12;
                u4 = u(byteBuffer);
                length2 = j13;
            }
            m44 m44Var = new m44((int) length2);
            long[] jArr3 = (long[]) m44Var.R;
            BitSet bitSet = (BitSet) m44Var.L;
            long[] jArr4 = (long[]) m44Var.B;
            fi2[] fi2VarArr10 = (fi2[]) qaVar.Y;
            int length4 = fi2VarArr10.length;
            int i19 = i;
            int i20 = i19;
            while (i19 < length4) {
                fi2 fi2Var4 = fi2VarArr10[i19];
                if (fi2Var4.i != 0) {
                    if (u4 == 9) {
                        int i21 = i;
                        j2 = 0;
                        while (i21 < fi2Var4.i - 1) {
                            long J8 = J(byteBuffer);
                            jArr4[i20] = J8;
                            j2 += J8;
                            i21++;
                            i20++;
                        }
                    } else {
                        j2 = 0;
                    }
                    if (j2 <= fi2Var4.b()) {
                        jArr4[i20] = fi2Var4.b() - j2;
                        i20++;
                    } else {
                        e41.i("sum of unpack sizes of folder exceeds total unpack size");
                        return;
                    }
                }
                i19++;
                i = 0;
            }
            if (u4 == 9) {
                u4 = u(byteBuffer);
            }
            int i22 = 0;
            for (fi2 fi2Var5 : (fi2[]) qaVar.Y) {
                int i23 = fi2Var5.i;
                if (i23 != 1 || !fi2Var5.g) {
                    i22 += i23;
                }
            }
            if (u4 == 10) {
                BitSet v2 = v(i22, byteBuffer);
                long[] jArr5 = new long[i22];
                for (int i24 = 0; i24 < i22; i24++) {
                    if (v2.get(i24)) {
                        k(4, byteBuffer);
                        jArr5[i24] = byteBuffer.getInt() & j;
                    }
                }
                int i25 = 0;
                int i26 = 0;
                for (fi2 fi2Var6 : (fi2[]) qaVar.Y) {
                    if (fi2Var6.i == 1 && fi2Var6.g) {
                        bitSet.set(i25, true);
                        jArr3[i25] = fi2Var6.h;
                        i25++;
                    } else {
                        for (int i27 = 0; i27 < fi2Var6.i; i27++) {
                            bitSet.set(i25, v2.get(i26));
                            jArr3[i25] = jArr5[i26];
                            i25++;
                            i26++;
                        }
                    }
                }
                u(byteBuffer);
            }
            qaVar.Z = m44Var;
            u(byteBuffer);
        }
    }

    public static long J(ByteBuffer byteBuffer) {
        long u = u(byteBuffer);
        int i = 128;
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((i & u) == 0) {
                return ((u & (i - 1)) << (i2 * 8)) | j;
            }
            j |= u(byteBuffer) << (i2 * 8);
            i >>>= 1;
        }
        return j;
    }

    public static long X(ByteBuffer byteBuffer, long j) {
        if (j < 1) {
            return 0L;
        }
        int position = byteBuffer.position();
        long remaining = byteBuffer.remaining();
        if (remaining < j) {
            j = remaining;
        }
        byteBuffer.position(position + ((int) j));
        return j;
    }

    public static int e(long j, String str) {
        if (j <= 2147483647L && j >= 0) {
            return (int) j;
        }
        throw new IOException(String.format("Cannot handle % %,d", str, Long.valueOf(j)));
    }

    public static void k(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining >= i) {
            return;
        }
        throw new EOFException(String.format("remaining %,d < expectRemaining %,d", Integer.valueOf(remaining), Integer.valueOf(i)));
    }

    public static void n(LinkedHashMap linkedHashMap, int i) {
        linkedHashMap.computeIfAbsent(Integer.valueOf(i), new bu(2));
    }

    public static int u(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        i.n();
        return 0;
    }

    public static BitSet v(int i, ByteBuffer byteBuffer) {
        if (u(byteBuffer) != 0) {
            BitSet bitSet = new BitSet(i);
            for (int i2 = 0; i2 < i; i2++) {
                bitSet.set(i2, true);
            }
            return bitSet;
        }
        return x(i, byteBuffer);
    }

    public static BitSet x(int i, ByteBuffer byteBuffer) {
        boolean z;
        BitSet bitSet = new BitSet(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 == 0) {
                i3 = u(byteBuffer);
                i2 = 128;
            }
            if ((i3 & i2) != 0) {
                z = true;
            } else {
                z = false;
            }
            bitSet.set(i4, z);
            i2 >>>= 1;
        }
        return bitSet;
    }

    public final void A(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        SeekableByteChannel seekableByteChannel = this.B;
        int i = c13.a;
        int remaining = byteBuffer.remaining();
        a13 a13Var = b13.a;
        int remaining2 = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != seekableByteChannel.read(byteBuffer)) {
        }
        if (remaining2 - byteBuffer.remaining() >= remaining) {
            byteBuffer.flip();
        } else {
            i.n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:297:0x0719, code lost:
        defpackage.e41.i("Error parsing file names");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [dq0, w1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [qd6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [qd6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [dq0, w1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qa D() {
        DataInputStream dataInputStream;
        long reverseBytes;
        long j;
        long j2;
        long j3;
        fi2[] fi2VarArr;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        long j4;
        int i2;
        int i3;
        InputStream inputStream;
        long j5;
        ByteBuffer order = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        A(order);
        byte[] bArr = new byte[6];
        order.get(bArr);
        if (Arrays.equals(bArr, f0)) {
            byte b = order.get();
            byte b2 = order.get();
            if (b == 0) {
                long j6 = order.getInt() & 4294967295L;
                if (j6 == 0) {
                    long position = this.B.position();
                    ByteBuffer allocate = ByteBuffer.allocate(20);
                    A(allocate);
                    this.B.position(position);
                    while (allocate.hasRemaining()) {
                        if (allocate.get() != 0) {
                            int i4 = eq0.R;
                            ?? w1Var = new w1();
                            w1Var.x = -1L;
                            w1Var.w = new CRC32();
                            w1Var.t = new f1(new v60(this.B, 20L));
                            w1Var.x = 20L;
                            w1Var.y = j6;
                            dataInputStream = new DataInputStream(w1Var.l0());
                            try {
                                reverseBytes = Long.reverseBytes(dataInputStream.readLong());
                                if (reverseBytes < 0 && reverseBytes + 32 <= this.B.size()) {
                                    long reverseBytes2 = Long.reverseBytes(dataInputStream.readLong());
                                    long j7 = reverseBytes + reverseBytes2;
                                    if (j7 >= reverseBytes && j7 + 32 <= this.B.size()) {
                                        ip6 ip6Var = new ip6(reverseBytes, reverseBytes2, Integer.reverseBytes(dataInputStream.readInt()) & 4294967295L);
                                        dataInputStream.close();
                                        long j8 = ip6Var.b;
                                        e(j8, "nextHeaderSize");
                                        int i5 = (int) j8;
                                        this.B.position(ip6Var.a + 32);
                                        long position2 = this.B.position();
                                        CheckedInputStream checkedInputStream = new CheckedInputStream(Channels.newInputStream(this.B), new CRC32());
                                        long j9 = i5;
                                        if (checkedInputStream.skip(j9) == j9) {
                                            if (ip6Var.c == checkedInputStream.getChecksum().getValue()) {
                                                this.B.position(position2);
                                                qa qaVar = new qa();
                                                ByteBuffer order2 = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
                                                A(order2);
                                                int u = u(order2);
                                                int i6 = -1;
                                                int i7 = this.e0;
                                                int i8 = 0;
                                                if (u == 23) {
                                                    int position3 = order2.position();
                                                    ?? obj = new Object();
                                                    U(order2, obj);
                                                    obj.a(i7);
                                                    order2.position(position3);
                                                    F(order2, qaVar);
                                                    fi2[] fi2VarArr2 = (fi2[]) qaVar.Y;
                                                    if (fi2VarArr2.length != 0) {
                                                        if (((long[]) qaVar.L).length != 0) {
                                                            fi2 fi2Var = fi2VarArr2[0];
                                                            this.B.position(qaVar.B + 32);
                                                            j2 = 1;
                                                            v60 v60Var = new v60(this.B, ((long[]) qaVar.L)[0]);
                                                            InputStream inputStream2 = v60Var;
                                                            for (ps0 ps0Var : fi2Var.a()) {
                                                                if (ps0Var.b == 1 && ps0Var.c == 1) {
                                                                    if (fi2Var.a != null) {
                                                                        int i9 = 0;
                                                                        while (true) {
                                                                            ps0[] ps0VarArr = fi2Var.a;
                                                                            if (i9 >= ps0VarArr.length) {
                                                                                break;
                                                                            } else if (ps0VarArr[i9] == ps0Var) {
                                                                                j5 = fi2Var.f[i9];
                                                                                break;
                                                                            } else {
                                                                                i9++;
                                                                            }
                                                                        }
                                                                        inputStream2 = us0.a(this.A, inputStream2, j5, ps0Var, null, this.e0);
                                                                    }
                                                                    j5 = 0;
                                                                    inputStream2 = us0.a(this.A, inputStream2, j5, ps0Var, null, this.e0);
                                                                } else {
                                                                    e41.i("Multi input/output stream coders are not yet supported");
                                                                    return null;
                                                                }
                                                            }
                                                            InputStream inputStream3 = inputStream2;
                                                            eq0 eq0Var = inputStream3;
                                                            if (fi2Var.g) {
                                                                int i10 = eq0.R;
                                                                ?? w1Var2 = new w1();
                                                                w1Var2.x = -1L;
                                                                w1Var2.w = new CRC32();
                                                                w1Var2.t = new f1(inputStream3);
                                                                w1Var2.x = fi2Var.b();
                                                                w1Var2.y = fi2Var.h;
                                                                eq0Var = w1Var2.l0();
                                                            }
                                                            int e = e(fi2Var.b(), "unpackSize");
                                                            int i11 = c13.a;
                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                            long j10 = e;
                                                            byte[] bArr2 = (byte[]) b13.a.get();
                                                            Arrays.fill(bArr2, (byte) 0);
                                                            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                                            if (i12 == 0) {
                                                                inputStream = eq0Var;
                                                                j = 0;
                                                            } else {
                                                                int length = bArr2.length;
                                                                j = 0;
                                                                if (i12 > 0 && j10 < length) {
                                                                    i3 = (int) j10;
                                                                } else {
                                                                    i3 = length;
                                                                }
                                                                long j11 = 0;
                                                                while (i3 > 0) {
                                                                    int read = eq0Var.read(bArr2, 0, i3);
                                                                    if (-1 == read) {
                                                                        break;
                                                                    }
                                                                    byteArrayOutputStream.write(bArr2, 0, read);
                                                                    InputStream inputStream4 = eq0Var;
                                                                    j11 += read;
                                                                    if (i12 > 0) {
                                                                        i3 = (int) Math.min(j10 - j11, length);
                                                                    }
                                                                    eq0Var = inputStream4;
                                                                }
                                                                inputStream = eq0Var;
                                                            }
                                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                            if (byteArray.length >= e) {
                                                                inputStream.close();
                                                                order2 = ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN);
                                                                qaVar = new qa();
                                                                u = u(order2);
                                                            } else {
                                                                e41.i("premature end of stream");
                                                            }
                                                        } else {
                                                            e41.i("no packed streams, can't read encoded header");
                                                        }
                                                    } else {
                                                        e41.i("no folders, can't read encoded header");
                                                    }
                                                } else {
                                                    j = 0;
                                                    j2 = 1;
                                                }
                                                boolean z4 = true;
                                                if (u == 1) {
                                                    int position4 = order2.position();
                                                    ?? obj2 = new Object();
                                                    int u2 = u(order2);
                                                    if (u2 == 2) {
                                                        for (long J = J(order2); J != j; J = J(order2)) {
                                                            long e2 = e(J(order2), "propertySize");
                                                            if (X(order2, e2) < e2) {
                                                                e41.i("invalid property size");
                                                                break;
                                                            }
                                                        }
                                                        u2 = u(order2);
                                                    }
                                                    if (u2 != 3) {
                                                        int i13 = 4;
                                                        if (u2 == 4) {
                                                            U(order2, obj2);
                                                            u2 = u(order2);
                                                        }
                                                        int i14 = 8;
                                                        if (u2 == 5) {
                                                            j3 = j2;
                                                            obj2.h = e(J(order2), "numFiles");
                                                            int i15 = -1;
                                                            while (true) {
                                                                int u3 = u(order2);
                                                                if (u3 == 0) {
                                                                    obj2.i = obj2.h - Math.max(i15, i8);
                                                                    u2 = u(order2);
                                                                } else {
                                                                    int i16 = i13;
                                                                    long J2 = J(order2);
                                                                    switch (u3) {
                                                                        case 14:
                                                                            i15 = x(obj2.h, order2).cardinality();
                                                                            break;
                                                                        case 15:
                                                                            if (i15 != -1) {
                                                                                x(i15, order2);
                                                                                break;
                                                                            } else {
                                                                                e41.i("Header format error: kEmptyStream must appear before kEmptyFile");
                                                                                break;
                                                                            }
                                                                        case 16:
                                                                            if (i15 != -1) {
                                                                                x(i15, order2);
                                                                                break;
                                                                            } else {
                                                                                e41.i("Header format error: kEmptyStream must appear before kAnti");
                                                                                break;
                                                                            }
                                                                        case 17:
                                                                            if (u(order2) == 0) {
                                                                                int e3 = e(J2 - j3, "file names length");
                                                                                if ((e3 & 1) == 0) {
                                                                                    int i17 = 0;
                                                                                    for (int i18 = 0; i18 < e3; i18 += 2) {
                                                                                        k(2, order2);
                                                                                        if (order2.getChar() == 0) {
                                                                                            i17++;
                                                                                        }
                                                                                    }
                                                                                    if (i17 == obj2.h) {
                                                                                        break;
                                                                                    } else {
                                                                                        e41.i(lb1.o(xg6.t("Invalid number of file names (", i17, " instead of "), obj2.h, ")"));
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    e41.i("File names length invalid");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                e41.i("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 18:
                                                                            int cardinality = v(obj2.h, order2).cardinality();
                                                                            if (u(order2) == 0) {
                                                                                long j12 = cardinality * 8;
                                                                                if (X(order2, j12) >= j12) {
                                                                                    break;
                                                                                } else {
                                                                                    e41.i("invalid creation dates size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                e41.i("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 19:
                                                                            int cardinality2 = v(obj2.h, order2).cardinality();
                                                                            if (u(order2) == 0) {
                                                                                long j13 = cardinality2 * 8;
                                                                                if (X(order2, j13) >= j13) {
                                                                                    break;
                                                                                } else {
                                                                                    e41.i("invalid access dates size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                e41.i("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 20:
                                                                            int cardinality3 = v(obj2.h, order2).cardinality();
                                                                            if (u(order2) == 0) {
                                                                                long j14 = cardinality3 * 8;
                                                                                if (X(order2, j14) >= j14) {
                                                                                    break;
                                                                                } else {
                                                                                    e41.i("invalid modification dates size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                e41.i("Not implemented");
                                                                                break;
                                                                            }
                                                                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                                                            int cardinality4 = v(obj2.h, order2).cardinality();
                                                                            if (u(order2) == 0) {
                                                                                long j15 = cardinality4 * 4;
                                                                                if (X(order2, j15) >= j15) {
                                                                                    break;
                                                                                } else {
                                                                                    e41.i("invalid windows attributes size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                e41.i("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 22:
                                                                        case ConnectionResult.API_DISABLED /* 23 */:
                                                                        default:
                                                                            if (X(order2, J2) >= J2) {
                                                                                break;
                                                                            } else {
                                                                                e41.i(lb1.g(u3, "Incomplete property of type "));
                                                                                break;
                                                                            }
                                                                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                                                            e41.i("kStartPos is unsupported, please report");
                                                                            break;
                                                                        case 25:
                                                                            if (X(order2, J2) >= J2) {
                                                                                break;
                                                                            } else {
                                                                                e41.i("Incomplete kDummy property");
                                                                                break;
                                                                            }
                                                                    }
                                                                    i13 = i16;
                                                                    i8 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            j3 = j2;
                                                        }
                                                        int i19 = i13;
                                                        if (u2 == 0) {
                                                            obj2.a(i7);
                                                            order2.position(position4);
                                                            int u4 = u(order2);
                                                            if (u4 == 2) {
                                                                for (long J3 = J(order2); J3 != j; J3 = J(order2)) {
                                                                    int J4 = (int) J(order2);
                                                                    k(J4, order2);
                                                                    order2.get(new byte[J4]);
                                                                }
                                                                u4 = u(order2);
                                                            }
                                                            if (u4 != 3) {
                                                                if (u4 == i19) {
                                                                    F(order2, qaVar);
                                                                    u4 = u(order2);
                                                                }
                                                                if (u4 == 5) {
                                                                    int J5 = (int) J(order2);
                                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                    BitSet bitSet = null;
                                                                    BitSet bitSet2 = null;
                                                                    BitSet bitSet3 = null;
                                                                    while (true) {
                                                                        int u5 = u(order2);
                                                                        if (u5 == 0) {
                                                                            int i20 = 0;
                                                                            int i21 = 0;
                                                                            int i22 = 0;
                                                                            while (true) {
                                                                                if (i20 < J5) {
                                                                                    md6 md6Var = (md6) linkedHashMap.get(Integer.valueOf(i20));
                                                                                    if (md6Var == null) {
                                                                                        i = J5;
                                                                                    } else {
                                                                                        if (bitSet != null && bitSet.get(i20)) {
                                                                                            z = false;
                                                                                        } else {
                                                                                            z = z4;
                                                                                        }
                                                                                        md6Var.b = z;
                                                                                        if (z) {
                                                                                            m44 m44Var = (m44) qaVar.Z;
                                                                                            if (m44Var != null) {
                                                                                                md6Var.c = false;
                                                                                                md6Var.d = false;
                                                                                                md6Var.m = ((BitSet) m44Var.L).get(i22);
                                                                                                m44 m44Var2 = (m44) qaVar.Z;
                                                                                                i = J5;
                                                                                                md6Var.n = ((long[]) m44Var2.R)[i22];
                                                                                                long j16 = ((long[]) m44Var2.B)[i22];
                                                                                                md6Var.o = j16;
                                                                                                if (j16 >= j) {
                                                                                                    i22++;
                                                                                                } else {
                                                                                                    e41.i("broken archive, entry with negative size");
                                                                                                }
                                                                                            } else {
                                                                                                e41.i("Archive contains file with streams but no subStreamsInfo");
                                                                                            }
                                                                                        } else {
                                                                                            i = J5;
                                                                                            if (bitSet2 != null && bitSet2.get(i21)) {
                                                                                                z2 = false;
                                                                                            } else {
                                                                                                z2 = true;
                                                                                            }
                                                                                            md6Var.c = z2;
                                                                                            if (bitSet3 != null && bitSet3.get(i21)) {
                                                                                                z3 = true;
                                                                                            } else {
                                                                                                z3 = false;
                                                                                            }
                                                                                            md6Var.d = z3;
                                                                                            md6Var.m = false;
                                                                                            j4 = j;
                                                                                            md6Var.o = j4;
                                                                                            i21++;
                                                                                            i20++;
                                                                                            j = j4;
                                                                                            J5 = i;
                                                                                            z4 = true;
                                                                                        }
                                                                                    }
                                                                                    j4 = j;
                                                                                    i20++;
                                                                                    j = j4;
                                                                                    J5 = i;
                                                                                    z4 = true;
                                                                                } else {
                                                                                    long j17 = j;
                                                                                    qaVar.d0 = (md6[]) linkedHashMap.values().stream().filter(new cu(1)).toArray(new Object());
                                                                                    int length2 = ((fi2[]) qaVar.Y).length;
                                                                                    int[] iArr = new int[length2];
                                                                                    int i23 = 0;
                                                                                    for (int i24 = 0; i24 < length2; i24++) {
                                                                                        iArr[i24] = i23;
                                                                                        i23 += ((fi2[]) qaVar.Y)[i24].e.length;
                                                                                    }
                                                                                    int length3 = ((long[]) qaVar.L).length;
                                                                                    long[] jArr = new long[length3];
                                                                                    long j18 = j17;
                                                                                    for (int i25 = 0; i25 < length3; i25++) {
                                                                                        jArr[i25] = j18;
                                                                                        j18 += ((long[]) qaVar.L)[i25];
                                                                                    }
                                                                                    int[] iArr2 = new int[length2];
                                                                                    int[] iArr3 = new int[((md6[]) qaVar.d0).length];
                                                                                    int i26 = 0;
                                                                                    int i27 = 0;
                                                                                    int i28 = 0;
                                                                                    while (true) {
                                                                                        md6[] md6VarArr = (md6[]) qaVar.d0;
                                                                                        if (i26 < md6VarArr.length) {
                                                                                            if (!md6VarArr[i26].b && i27 == 0) {
                                                                                                iArr3[i26] = i6;
                                                                                            } else {
                                                                                                if (i27 == 0) {
                                                                                                    while (true) {
                                                                                                        fi2VarArr = (fi2[]) qaVar.Y;
                                                                                                        if (i28 < fi2VarArr.length) {
                                                                                                            iArr2[i28] = i26;
                                                                                                            if (fi2VarArr[i28].i <= 0) {
                                                                                                                i28++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (i28 >= fi2VarArr.length) {
                                                                                                        e41.i("Too few folders in archive");
                                                                                                    }
                                                                                                }
                                                                                                iArr3[i26] = i28;
                                                                                                if (((md6[]) qaVar.d0)[i26].b && (i27 = i27 + 1) >= ((fi2[]) qaVar.Y)[i28].i) {
                                                                                                    i28++;
                                                                                                    i27 = 0;
                                                                                                }
                                                                                            }
                                                                                            i26++;
                                                                                        } else {
                                                                                            qaVar.e0 = new eb(iArr, jArr, iArr2, iArr3, 20);
                                                                                            u(order2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i29 = J5;
                                                                            long J6 = J(order2);
                                                                            if (u5 != 25) {
                                                                                switch (u5) {
                                                                                    case 14:
                                                                                        i2 = i29;
                                                                                        bitSet = x(i2, order2);
                                                                                        continue;
                                                                                    case 15:
                                                                                        i2 = i29;
                                                                                        bitSet2 = x(bitSet.cardinality(), order2);
                                                                                        continue;
                                                                                    case 16:
                                                                                        i2 = i29;
                                                                                        bitSet3 = x(bitSet.cardinality(), order2);
                                                                                        continue;
                                                                                    case 17:
                                                                                        i2 = i29;
                                                                                        u(order2);
                                                                                        int i30 = (int) (J6 - j3);
                                                                                        byte[] bArr3 = new byte[i30];
                                                                                        k(i30, order2);
                                                                                        order2.get(bArr3);
                                                                                        int i31 = 0;
                                                                                        int i32 = 0;
                                                                                        for (int i33 = 0; i33 < i30; i33 += 2) {
                                                                                            if (bArr3[i33] == 0 && bArr3[i33 + 1] == 0) {
                                                                                                n(linkedHashMap, i31);
                                                                                                ((md6) linkedHashMap.get(Integer.valueOf(i31))).a = new String(bArr3, i32, i33 - i32, StandardCharsets.UTF_16LE);
                                                                                                i31++;
                                                                                                i32 = i33 + 2;
                                                                                            }
                                                                                        }
                                                                                        if (i32 == i30 && i31 == i2) {
                                                                                            continue;
                                                                                        }
                                                                                        break;
                                                                                    case 18:
                                                                                        i2 = i29;
                                                                                        BitSet v = v(i2, order2);
                                                                                        u(order2);
                                                                                        for (int i34 = 0; i34 < i2; i34++) {
                                                                                            n(linkedHashMap, i34);
                                                                                            md6 md6Var2 = (md6) linkedHashMap.get(Integer.valueOf(i34));
                                                                                            boolean z5 = v.get(i34);
                                                                                            md6Var2.e = z5;
                                                                                            if (z5) {
                                                                                                k(i14, order2);
                                                                                                md6Var2.h = zb2.a(order2.getLong());
                                                                                            }
                                                                                        }
                                                                                        continue;
                                                                                    case 19:
                                                                                        i2 = i29;
                                                                                        BitSet v2 = v(i2, order2);
                                                                                        u(order2);
                                                                                        for (int i35 = 0; i35 < i2; i35++) {
                                                                                            n(linkedHashMap, i35);
                                                                                            md6 md6Var3 = (md6) linkedHashMap.get(Integer.valueOf(i35));
                                                                                            boolean z6 = v2.get(i35);
                                                                                            md6Var3.g = z6;
                                                                                            if (z6) {
                                                                                                k(i14, order2);
                                                                                                md6Var3.j = zb2.a(order2.getLong());
                                                                                            }
                                                                                        }
                                                                                        continue;
                                                                                    case 20:
                                                                                        i2 = i29;
                                                                                        BitSet v3 = v(i2, order2);
                                                                                        u(order2);
                                                                                        for (int i36 = 0; i36 < i2; i36++) {
                                                                                            n(linkedHashMap, i36);
                                                                                            md6 md6Var4 = (md6) linkedHashMap.get(Integer.valueOf(i36));
                                                                                            boolean z7 = v3.get(i36);
                                                                                            md6Var4.f = z7;
                                                                                            if (z7) {
                                                                                                k(i14, order2);
                                                                                                md6Var4.i = zb2.a(order2.getLong());
                                                                                            }
                                                                                        }
                                                                                        continue;
                                                                                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                                                                        i2 = i29;
                                                                                        BitSet v4 = v(i2, order2);
                                                                                        u(order2);
                                                                                        for (int i37 = 0; i37 < i2; i37++) {
                                                                                            n(linkedHashMap, i37);
                                                                                            md6 md6Var5 = (md6) linkedHashMap.get(Integer.valueOf(i37));
                                                                                            boolean z8 = v4.get(i37);
                                                                                            md6Var5.k = z8;
                                                                                            if (z8) {
                                                                                                k(4, order2);
                                                                                                md6Var5.l = order2.getInt();
                                                                                            }
                                                                                        }
                                                                                        continue;
                                                                                    default:
                                                                                        X(order2, J6);
                                                                                        i2 = i29;
                                                                                        continue;
                                                                                }
                                                                            } else {
                                                                                i2 = i29;
                                                                                X(order2, J6);
                                                                            }
                                                                            J5 = i2;
                                                                            i14 = 8;
                                                                            z4 = true;
                                                                            i6 = -1;
                                                                            j = 0;
                                                                        }
                                                                    }
                                                                }
                                                                qaVar.Z = null;
                                                                return qaVar;
                                                            }
                                                            e41.i("Additional streams unsupported");
                                                        } else {
                                                            e41.i(lb1.g(u2, "Badly terminated header, found "));
                                                        }
                                                    } else {
                                                        e41.i("Additional streams unsupported");
                                                    }
                                                } else {
                                                    e41.i("Broken or unsupported archive: no Header");
                                                }
                                            } else {
                                                e41.i("NextHeader CRC-32 mismatch");
                                            }
                                        } else {
                                            e41.i("Problem computing NextHeader CRC-32");
                                        }
                                        return null;
                                    }
                                    throw new IOException("nextHeaderSize is out of bounds");
                                }
                                throw new IOException("nextHeaderOffset is out of bounds");
                            } catch (Throwable th) {
                                try {
                                    dataInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                    e41.i("archive seems to be invalid.\nYou may want to retry and enable the tryToRecoverBrokenArchives if the archive could be a multi volume archive that has been closed prematurely.");
                    return null;
                }
                int i42 = eq0.R;
                ?? w1Var3 = new w1();
                w1Var3.x = -1L;
                w1Var3.w = new CRC32();
                w1Var3.t = new f1(new v60(this.B, 20L));
                w1Var3.x = 20L;
                w1Var3.y = j6;
                dataInputStream = new DataInputStream(w1Var3.l0());
                reverseBytes = Long.reverseBytes(dataInputStream.readLong());
                if (reverseBytes < 0) {
                }
                throw new IOException("nextHeaderOffset is out of bounds");
            }
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", Byte.valueOf(b), Byte.valueOf(b2)));
        }
        e41.i("Bad 7z signature");
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [dq0, w1] */
    public final void N(int i, md6 md6Var) {
        long j;
        this.d0.clear();
        InputStream inputStream = this.Y;
        if (inputStream != null) {
            inputStream.close();
            this.Y = null;
        }
        qa qaVar = this.L;
        fi2 fi2Var = ((fi2[]) qaVar.Y)[i];
        eb ebVar = (eb) qaVar.e0;
        int i2 = ((int[]) ebVar.B)[i];
        this.B.position(qaVar.B + 32 + ((long[]) ebVar.L)[i2]);
        pd6 pd6Var = new pd6(this, new BufferedInputStream(new v60(this.B, ((long[]) qaVar.L)[i2])));
        LinkedList linkedList = new LinkedList();
        InputStream inputStream2 = pd6Var;
        for (ps0 ps0Var : fi2Var.a()) {
            if (ps0Var.b == 1 && ps0Var.c == 1) {
                td6 byId = td6.byId(ps0Var.a);
                if (fi2Var.a != null) {
                    int i3 = 0;
                    while (true) {
                        ps0[] ps0VarArr = fi2Var.a;
                        if (i3 >= ps0VarArr.length) {
                            break;
                        } else if (ps0VarArr[i3] == ps0Var) {
                            j = fi2Var.f[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                    long j2 = j;
                    inputStream2 = us0.a(this.A, inputStream2, j2, ps0Var, this.Z, this.e0);
                    linkedList.addFirst(new ud6(byId, ((j0) us0.a.get(byId)).b(ps0Var)));
                }
                j = 0;
                long j22 = j;
                inputStream2 = us0.a(this.A, inputStream2, j22, ps0Var, this.Z, this.e0);
                linkedList.addFirst(new ud6(byId, ((j0) us0.a.get(byId)).b(ps0Var)));
            } else {
                e41.i("Multi input/output stream coders are not yet supported");
                return;
            }
        }
        md6Var.a(linkedList);
        if (fi2Var.g) {
            int i4 = eq0.R;
            ?? w1Var = new w1();
            w1Var.x = -1L;
            w1Var.w = new CRC32();
            w1Var.t = new f1(inputStream2);
            w1Var.x = fi2Var.b();
            w1Var.y = fi2Var.h;
            inputStream2 = w1Var.l0();
        }
        this.Y = inputStream2;
    }

    public final void U(ByteBuffer byteBuffer, qd6 qd6Var) {
        long j;
        String str;
        int i;
        int i2;
        BitSet bitSet;
        boolean z;
        boolean z2;
        int i3;
        int u = u(byteBuffer);
        if (u == 6) {
            long J = J(byteBuffer);
            if (J >= 0) {
                long j2 = 32 + J;
                if (j2 <= this.B.size() && j2 >= 0) {
                    qd6Var.a = e(J(byteBuffer), "numPackStreams");
                    int u2 = u(byteBuffer);
                    if (u2 == 9) {
                        long j3 = 0;
                        j = 0;
                        for (int i4 = 0; i4 < qd6Var.a; i4++) {
                            long J2 = J(byteBuffer);
                            j3 += J2;
                            long j4 = j2 + j3;
                            if (J2 < 0 || j4 > this.B.size() || j4 < J) {
                                e41.i(lb1.i(J2, "packSize (", ") is out of range"));
                                return;
                            }
                        }
                        u2 = u(byteBuffer);
                    } else {
                        j = 0;
                    }
                    if (u2 == 10) {
                        long cardinality = v(qd6Var.a, byteBuffer).cardinality() * 4;
                        if (X(byteBuffer, cardinality) >= cardinality) {
                            u2 = u(byteBuffer);
                        } else {
                            e41.i("invalid number of CRCs in PackInfo");
                            return;
                        }
                    }
                    if (u2 == 0) {
                        u = u(byteBuffer);
                    } else {
                        e41.i(lb1.k("Badly terminated PackInfo (", u2, ")"));
                        return;
                    }
                }
            }
            e41.i(lb1.i(J, "packPos (", ") is out of range"));
            return;
        }
        j = 0;
        String str2 = "negative unpackSize";
        if (u != 7) {
            str = "negative unpackSize";
            i = 0;
        } else {
            int u3 = u(byteBuffer);
            if (u3 == 11) {
                qd6Var.f = e(J(byteBuffer), "numFolders");
                if (u(byteBuffer) == 0) {
                    LinkedList<Integer> linkedList = new LinkedList();
                    int i5 = 0;
                    while (true) {
                        int i6 = qd6Var.f;
                        if (i5 < i6) {
                            int e = e(J(byteBuffer), "numCoders");
                            if (e != 0) {
                                qd6Var.b += e;
                                long j5 = j;
                                long j6 = j5;
                                int i7 = 0;
                                while (i7 < e) {
                                    int u4 = u(byteBuffer);
                                    int i8 = u4 & 15;
                                    k(i8, byteBuffer);
                                    byteBuffer.get(new byte[i8]);
                                    if ((u4 & 16) == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ((u4 & 32) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if ((u4 & 128) == 0) {
                                        if (z) {
                                            j5++;
                                            j6++;
                                            i3 = e;
                                        } else {
                                            i3 = e;
                                            j5 += e(J(byteBuffer), "numInStreams");
                                            j6 += e(J(byteBuffer), "numOutStreams");
                                        }
                                        if (z2) {
                                            long e2 = e(J(byteBuffer), "propertiesSize");
                                            if (X(byteBuffer, e2) < e2) {
                                                e41.i("invalid propertiesSize in folder");
                                                return;
                                            }
                                        }
                                        i7++;
                                        e = i3;
                                    } else {
                                        e41.i("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                                        return;
                                    }
                                }
                                e(j5, "totalInStreams");
                                e(j6, "totalOutStreams");
                                qd6Var.c += j6;
                                qd6Var.d += j5;
                                if (j6 != j) {
                                    int e3 = e(j6 - 1, "numBindPairs");
                                    long j7 = e3;
                                    if (j5 >= j7) {
                                        BitSet bitSet2 = new BitSet((int) j5);
                                        int i9 = 0;
                                        while (i9 < e3) {
                                            int i10 = e3;
                                            int e4 = e(J(byteBuffer), "inIndex");
                                            int i11 = i5;
                                            String str3 = str2;
                                            if (j5 > e4) {
                                                bitSet2.set(e4);
                                                if (j6 > e(J(byteBuffer), "outIndex")) {
                                                    i9++;
                                                    str2 = str3;
                                                    i5 = i11;
                                                    e3 = i10;
                                                } else {
                                                    e41.i("outIndex is bigger than number of outStreams");
                                                    return;
                                                }
                                            } else {
                                                e41.i("inIndex is bigger than number of inStreams");
                                                return;
                                            }
                                        }
                                        int i12 = i5;
                                        String str4 = str2;
                                        int e5 = e(j5 - j7, "numPackedStreams");
                                        if (e5 == 1) {
                                            if (bitSet2.nextClearBit(0) == -1) {
                                                e41.i("Couldn't find stream's bind pair index");
                                                return;
                                            }
                                        } else {
                                            for (int i13 = 0; i13 < e5; i13++) {
                                                if (e(J(byteBuffer), "packedStreamIndex") >= j5) {
                                                    e41.i("packedStreamIndex is bigger than number of totalInStreams");
                                                    return;
                                                }
                                            }
                                            continue;
                                        }
                                        linkedList.add(Integer.valueOf((int) j6));
                                        i5 = i12 + 1;
                                        str2 = str4;
                                    } else {
                                        e41.i("Total input streams can't be less than the number of bind pairs");
                                        return;
                                    }
                                } else {
                                    e41.i("Total output streams can't be 0");
                                    return;
                                }
                            } else {
                                e41.i("Folder without coders");
                                return;
                            }
                        } else {
                            str = str2;
                            i = 0;
                            if (qd6Var.d - (qd6Var.c - i6) >= qd6Var.a) {
                                int u5 = u(byteBuffer);
                                if (u5 == 12) {
                                    for (Integer num : linkedList) {
                                        int intValue = num.intValue();
                                        for (int i14 = 0; i14 < intValue; i14++) {
                                            if (J(byteBuffer) < j) {
                                                i.h(str);
                                                return;
                                            }
                                        }
                                    }
                                    int u6 = u(byteBuffer);
                                    if (u6 == 10) {
                                        BitSet v = v(qd6Var.f, byteBuffer);
                                        qd6Var.g = v;
                                        long cardinality2 = v.cardinality() * 4;
                                        if (X(byteBuffer, cardinality2) >= cardinality2) {
                                            u6 = u(byteBuffer);
                                        } else {
                                            e41.i("invalid number of CRCs in UnpackInfo");
                                            return;
                                        }
                                    }
                                    if (u6 == 0) {
                                        u = u(byteBuffer);
                                    } else {
                                        e41.i("Badly terminated UnpackInfo");
                                        return;
                                    }
                                } else {
                                    e41.i(lb1.g(u5, "Expected kCodersUnpackSize, got "));
                                    return;
                                }
                            } else {
                                e41.i("archive doesn't contain enough packed streams");
                                return;
                            }
                        }
                    }
                } else {
                    e41.i("External unsupported");
                    return;
                }
            } else {
                e41.i(lb1.g(u3, "Expected kFolder, got "));
                return;
            }
        }
        if (u == 8) {
            int u7 = u(byteBuffer);
            LinkedList<Integer> linkedList2 = new LinkedList();
            if (u7 == 13) {
                for (int i15 = i; i15 < qd6Var.f; i15++) {
                    linkedList2.add(Integer.valueOf(e(J(byteBuffer), "numStreams")));
                }
                qd6Var.e = linkedList2.stream().mapToLong(new Object()).sum();
                u7 = u(byteBuffer);
            } else {
                qd6Var.e = qd6Var.f;
            }
            e(qd6Var.e, "totalUnpackStreams");
            if (u7 == 9) {
                for (Integer num2 : linkedList2) {
                    int intValue2 = num2.intValue();
                    if (intValue2 != 0) {
                        for (int i16 = i; i16 < intValue2 - 1; i16++) {
                            if (J(byteBuffer) < j) {
                                e41.i(str);
                                return;
                            }
                        }
                        continue;
                    }
                }
                u7 = u(byteBuffer);
            }
            if (linkedList2.isEmpty()) {
                BitSet bitSet3 = qd6Var.g;
                i2 = qd6Var.f;
                if (bitSet3 != null) {
                    i2 -= bitSet3.cardinality();
                }
            } else {
                int i17 = i;
                for (Integer num3 : linkedList2) {
                    int intValue3 = num3.intValue();
                    if (intValue3 == 1 && (bitSet = qd6Var.g) != null) {
                        int i18 = i + 1;
                        if (!bitSet.get(i)) {
                            i = i18;
                        } else {
                            i = i18;
                        }
                    }
                    i17 += intValue3;
                }
                i2 = i17;
            }
            if (u7 == 10) {
                e(i2, "numDigests");
                long cardinality3 = v(i2, byteBuffer).cardinality() * 4;
                if (X(byteBuffer, cardinality3) >= cardinality3) {
                    u7 = u(byteBuffer);
                } else {
                    e41.i("invalid number of missing CRCs in SubStreamInfo");
                    return;
                }
            }
            if (u7 == 0) {
                u = u(byteBuffer);
            } else {
                e41.i("Badly terminated SubStreamsInfo");
                return;
            }
        }
        if (u == 0) {
            return;
        }
        e41.i("Badly terminated StreamsInfo");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.nio.channels.SeekableByteChannel, byte[]] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SeekableByteChannel seekableByteChannel = this.B;
        if (seekableByteChannel != null) {
            try {
                seekableByteChannel.close();
            } finally {
                this.B = null;
                byte[] bArr = this.Z;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.Z = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
        if ((r14 - r8) != ((defpackage.md6[]) r3.d0)[r17.R].o) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (java.lang.Math.max(0L, r12.L - r12.h()) != ((defpackage.md6[]) r3.d0)[r17.R].o) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Type inference failed for: r1v2, types: [w1, t60] */
    /* JADX WARN: Type inference failed for: r1v6, types: [dq0, w1] */
    /* JADX WARN: Type inference failed for: r5v10, types: [dq0, w1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [w1, t60] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, boolean z) {
        boolean z2;
        boolean z3;
        f1 f1Var;
        boolean z4;
        ArrayList arrayList = this.d0;
        qa qaVar = this.L;
        eb ebVar = (eb) qaVar.e0;
        if (ebVar != null) {
            int i2 = ((int[]) ebVar.X)[i];
            if (i2 < 0) {
                arrayList.clear();
                return;
            }
            md6[] md6VarArr = (md6[]) qaVar.d0;
            md6 md6Var = md6VarArr[i];
            if (this.X == i2) {
                if (i > 0) {
                    md6Var.a(md6VarArr[i - 1].p);
                }
                if (z && md6Var.p == null) {
                    md6Var.a(((md6[]) qaVar.d0)[((int[]) ((eb) qaVar.e0).R)[i2]].p);
                }
                z2 = true;
            } else {
                this.X = i2;
                N(i2, md6Var);
                z2 = false;
            }
            if (z) {
                md6 md6Var2 = ((md6[]) qaVar.d0)[i];
                if (this.R == i) {
                    if (!arrayList.isEmpty()) {
                        InputStream inputStream = (InputStream) arrayList.get(arrayList.size() - 1);
                        if (inputStream instanceof eq0) {
                            eq0 eq0Var = (eq0) inputStream;
                            long j = eq0Var.L;
                            synchronized (eq0Var) {
                                z4 = true;
                                long j2 = eq0Var.A;
                            }
                        } else {
                            z4 = true;
                            if (inputStream instanceof u60) {
                                u60 u60Var = (u60) inputStream;
                            }
                        }
                        if (!z && this.R == i && !z3) {
                            return;
                        }
                        int i3 = u60.X;
                        ?? w1Var = new w1();
                        w1Var.w = -1L;
                        w1Var.x = true;
                        w1Var.t = new f1(this.Y);
                        w1Var.w = Math.max(-1L, md6Var.o);
                        w1Var.x = false;
                        f1Var = w1Var.t;
                        if (f1Var != null) {
                            p55 u60Var2 = new u60((InputStream) f1Var.t, w1Var.w, w1Var.x);
                            if (md6Var.m) {
                                int i4 = eq0.R;
                                ?? w1Var2 = new w1();
                                w1Var2.x = -1L;
                                w1Var2.w = new CRC32();
                                w1Var2.t = new f1(u60Var2);
                                w1Var2.y = md6Var.n;
                                u60Var2 = w1Var2.l0();
                            }
                            arrayList.add(u60Var2);
                            return;
                        }
                        i.m("origin == null");
                        return;
                    }
                } else {
                    z4 = true;
                }
                int i5 = ((int[]) ((eb) qaVar.e0).R)[this.X];
                if (z2) {
                    int i6 = this.R;
                    if (i6 < i) {
                        i5 = i6 + 1;
                    } else {
                        N(i2, md6Var2);
                    }
                }
                while (i5 < i) {
                    md6 md6Var3 = ((md6[]) qaVar.d0)[i5];
                    int i7 = u60.X;
                    ?? w1Var3 = new w1();
                    w1Var3.w = -1L;
                    w1Var3.x = z4;
                    w1Var3.t = new f1(this.Y);
                    w1Var3.w = Math.max(-1L, md6Var3.o);
                    w1Var3.x = false;
                    f1 f1Var2 = w1Var3.t;
                    if (f1Var2 != null) {
                        p55 u60Var3 = new u60((InputStream) f1Var2.t, w1Var3.w, w1Var3.x);
                        if (md6Var3.m) {
                            int i8 = eq0.R;
                            ?? w1Var4 = new w1();
                            w1Var4.x = -1L;
                            w1Var4.w = new CRC32();
                            w1Var4.t = new f1(u60Var3);
                            w1Var4.x = md6Var3.o;
                            w1Var4.y = md6Var3.n;
                            u60Var3 = w1Var4.l0();
                        }
                        arrayList.add(u60Var3);
                        md6Var3.a(md6Var2.p);
                        i5++;
                        z4 = true;
                    } else {
                        i.m("origin == null");
                        return;
                    }
                }
                z3 = true;
                if (!z) {
                }
                int i32 = u60.X;
                ?? w1Var5 = new w1();
                w1Var5.w = -1L;
                w1Var5.x = true;
                w1Var5.t = new f1(this.Y);
                w1Var5.w = Math.max(-1L, md6Var.o);
                w1Var5.x = false;
                f1Var = w1Var5.t;
                if (f1Var != null) {
                }
            }
            z3 = false;
            if (!z) {
            }
            int i322 = u60.X;
            ?? w1Var52 = new w1();
            w1Var52.w = -1L;
            w1Var52.x = true;
            w1Var52.t = new f1(this.Y);
            w1Var52.w = Math.max(-1L, md6Var.o);
            w1Var52.x = false;
            f1Var = w1Var52.t;
            if (f1Var != null) {
            }
        } else {
            e41.i("Archive doesn't contain stream information to read entries");
        }
    }

    public final InputStream r(md6 md6Var) {
        qa qaVar;
        byte[] bArr;
        int i = 0;
        while (true) {
            qaVar = this.L;
            md6[] md6VarArr = (md6[]) qaVar.d0;
            if (i < md6VarArr.length) {
                if (md6Var == md6VarArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            h(i, true);
            this.R = i;
            this.X = ((int[]) ((eb) qaVar.e0).X)[i];
            if (((md6[]) qaVar.d0)[i].o == 0) {
                return new ByteArrayInputStream(q60.b);
            }
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty()) {
                while (arrayList.size() > 1) {
                    InputStream inputStream = (InputStream) arrayList.remove(0);
                    try {
                        a13 a13Var = b13.a;
                        long j = Long.MAX_VALUE;
                        while (j > 0) {
                            a13 a13Var2 = b13.a;
                            long read = inputStream.read(new byte[8192], 0, (int) Math.min(j, bArr.length));
                            if (read < 0) {
                                break;
                            }
                            j -= read;
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return (InputStream) arrayList.get(0);
            }
            i.m("No current 7z entry (call getNextEntry() first).");
            return null;
        }
        e41.k("Can not find ", md6Var.a, " in ", this.A);
        return null;
    }

    public final String toString() {
        return this.L.toString();
    }
}
