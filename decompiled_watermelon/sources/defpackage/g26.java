package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.zip.CRC32;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g26  reason: default package */
/* loaded from: classes.dex */
public final class g26 implements Closeable {
    public static final byte[] e0 = {55, 122, -68, -81, 39, 28};
    public final String A;
    public SeekableByteChannel B;
    public final la L;
    public InputStream Y;
    public byte[] Z;
    public final int d0;
    public int R = -1;
    public int X = -1;
    public final ArrayList c0 = new ArrayList();

    public g26(FileChannel fileChannel, String str, boolean z, int i) {
        this.B = fileChannel;
        this.A = str;
        this.d0 = i;
        try {
            this.L = I();
            this.Z = null;
        } catch (Throwable th) {
            if (z) {
                this.B.close();
            }
            throw th;
        }
    }

    public static int B(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        i.l();
        return 0;
    }

    public static BitSet C(int i, ByteBuffer byteBuffer) {
        if (B(byteBuffer) != 0) {
            BitSet bitSet = new BitSet(i);
            for (int i2 = 0; i2 < i; i2++) {
                bitSet.set(i2, true);
            }
            return bitSet;
        }
        return D(i, byteBuffer);
    }

    public static BitSet D(int i, ByteBuffer byteBuffer) {
        boolean z;
        BitSet bitSet = new BitSet(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 == 0) {
                i3 = B(byteBuffer);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, md2] */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v24 */
    public static void J(ByteBuffer byteBuffer, la laVar) {
        long j;
        int i;
        md2[] md2VarArr;
        md2[] md2VarArr2;
        long j2;
        ?? r6;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        long K;
        long K2;
        byte[] bArr;
        int B = B(byteBuffer);
        long j3 = 4294967295L;
        if (B == 6) {
            laVar.B = K(byteBuffer);
            int K3 = (int) K(byteBuffer);
            int B2 = B(byteBuffer);
            if (B2 == 9) {
                laVar.L = new long[K3];
                int i3 = 0;
                while (true) {
                    long[] jArr = (long[]) laVar.L;
                    if (i3 >= jArr.length) {
                        break;
                    }
                    jArr[i3] = K(byteBuffer);
                    i3++;
                }
                B2 = B(byteBuffer);
            }
            if (B2 == 10) {
                laVar.R = C(K3, byteBuffer);
                laVar.X = new long[K3];
                for (int i4 = 0; i4 < K3; i4++) {
                    if (((BitSet) laVar.R).get(i4)) {
                        p(4, byteBuffer);
                        ((long[]) laVar.X)[i4] = byteBuffer.getInt() & 4294967295L;
                    }
                }
                B(byteBuffer);
            }
            B = B(byteBuffer);
        }
        if (B == 7) {
            B(byteBuffer);
            int K4 = (int) K(byteBuffer);
            md2[] md2VarArr3 = new md2[K4];
            laVar.Y = md2VarArr3;
            B(byteBuffer);
            int i5 = 0;
            while (i5 < K4) {
                ?? obj = new Object();
                long j4 = j3;
                int K5 = (int) K(byteBuffer);
                cq0[] cq0VarArr = new cq0[K5];
                long j5 = 0;
                int i6 = 0;
                long j6 = 0;
                while (i6 < K5) {
                    long j7 = j4;
                    int B3 = B(byteBuffer);
                    int i7 = B3 & 15;
                    if ((B3 & 16) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((B3 & 32) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((B3 & 128) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    byte[] bArr2 = new byte[i7];
                    p(i7, byteBuffer);
                    byteBuffer.get(bArr2);
                    if (z) {
                        K = 1;
                        K2 = 1;
                    } else {
                        K = K(byteBuffer);
                        K2 = K(byteBuffer);
                    }
                    long j8 = j5 + K;
                    j6 += K2;
                    md2[] md2VarArr4 = md2VarArr3;
                    if (z2) {
                        int K6 = (int) K(byteBuffer);
                        bArr = new byte[K6];
                        p(K6, byteBuffer);
                        byteBuffer.get(bArr);
                    } else {
                        bArr = null;
                    }
                    byte[] bArr3 = bArr;
                    if (!z3) {
                        cq0VarArr[i6] = new cq0(bArr2, K, K2, bArr3);
                        i6++;
                        md2VarArr3 = md2VarArr4;
                        j5 = j8;
                        j4 = j7;
                    } else {
                        f81.j("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                        return;
                    }
                }
                md2[] md2VarArr5 = md2VarArr3;
                long j9 = j4;
                obj.a = cq0VarArr;
                obj.b = j5;
                obj.c = j6;
                long j10 = j6 - 1;
                int i8 = (int) j10;
                m20[] m20VarArr = new m20[i8];
                int i9 = 0;
                while (i9 < i8) {
                    m20VarArr[i9] = new m20(K(byteBuffer), K(byteBuffer));
                    i9++;
                    md2VarArr5 = md2VarArr5;
                    j10 = j10;
                }
                md2[] md2VarArr6 = md2VarArr5;
                obj.d = m20VarArr;
                long j11 = j5 - j10;
                int i10 = (int) j11;
                long[] jArr2 = new long[i10];
                if (j11 == 1) {
                    int i11 = 0;
                    while (i11 < ((int) j5)) {
                        if (obj.d != null) {
                            i2 = 0;
                            while (true) {
                                m20[] m20VarArr2 = obj.d;
                                if (i2 >= m20VarArr2.length) {
                                    break;
                                } else if (m20VarArr2[i2].b == i11) {
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
                        jArr2[i12] = K(byteBuffer);
                    }
                }
                obj.e = jArr2;
                md2VarArr6[i5] = obj;
                i5++;
                md2VarArr3 = md2VarArr6;
                j3 = j9;
            }
            md2[] md2VarArr7 = md2VarArr3;
            j = j3;
            int i13 = 0;
            B(byteBuffer);
            for (int i14 = 0; i14 < K4; i14++) {
                md2 md2Var = md2VarArr7[i14];
                d(md2Var.c, "totalOutputStreams");
                md2Var.f = new long[(int) md2Var.c];
                for (int i15 = 0; i15 < md2Var.c; i15++) {
                    md2Var.f[i15] = K(byteBuffer);
                }
            }
            if (B(byteBuffer) == 10) {
                BitSet C = C(K4, byteBuffer);
                int i16 = 0;
                while (i16 < K4) {
                    if (C.get(i16)) {
                        md2 md2Var2 = md2VarArr7[i16];
                        md2Var2.g = true;
                        p(4, byteBuffer);
                        md2Var2.h = byteBuffer.getInt() & j;
                        r6 = i13;
                    } else {
                        r6 = i13;
                        md2VarArr7[i16].g = r6;
                    }
                    i16++;
                    i13 = r6;
                }
                i = i13;
                B(byteBuffer);
            } else {
                i = 0;
            }
            B = B(byteBuffer);
        } else {
            j = 4294967295L;
            i = 0;
            laVar.Y = md2.j;
        }
        if (B == 8) {
            md2[] md2VarArr8 = (md2[]) laVar.Y;
            int length = md2VarArr8.length;
            for (int i17 = i; i17 < length; i17++) {
                md2VarArr8[i17].i = 1;
            }
            long length2 = ((md2[]) laVar.Y).length;
            int B4 = B(byteBuffer);
            if (B4 == 13) {
                md2[] md2VarArr9 = (md2[]) laVar.Y;
                int length3 = md2VarArr9.length;
                long j12 = 0;
                for (int i18 = i; i18 < length3; i18++) {
                    md2 md2Var3 = md2VarArr9[i18];
                    long K7 = K(byteBuffer);
                    md2Var3.i = (int) K7;
                    j12 += K7;
                }
                long j13 = j12;
                B4 = B(byteBuffer);
                length2 = j13;
            }
            n85 n85Var = new n85((int) length2);
            long[] jArr3 = (long[]) n85Var.R;
            BitSet bitSet = (BitSet) n85Var.L;
            long[] jArr4 = (long[]) n85Var.B;
            md2[] md2VarArr10 = (md2[]) laVar.Y;
            int length4 = md2VarArr10.length;
            int i19 = i;
            int i20 = i19;
            while (i19 < length4) {
                md2 md2Var4 = md2VarArr10[i19];
                if (md2Var4.i != 0) {
                    if (B4 == 9) {
                        int i21 = i;
                        j2 = 0;
                        while (i21 < md2Var4.i - 1) {
                            long K8 = K(byteBuffer);
                            jArr4[i20] = K8;
                            j2 += K8;
                            i21++;
                            i20++;
                        }
                    } else {
                        j2 = 0;
                    }
                    if (j2 <= md2Var4.b()) {
                        jArr4[i20] = md2Var4.b() - j2;
                        i20++;
                    } else {
                        f81.j("sum of unpack sizes of folder exceeds total unpack size");
                        return;
                    }
                }
                i19++;
                i = 0;
            }
            if (B4 == 9) {
                B4 = B(byteBuffer);
            }
            int i22 = 0;
            for (md2 md2Var5 : (md2[]) laVar.Y) {
                int i23 = md2Var5.i;
                if (i23 != 1 || !md2Var5.g) {
                    i22 += i23;
                }
            }
            if (B4 == 10) {
                BitSet C2 = C(i22, byteBuffer);
                long[] jArr5 = new long[i22];
                for (int i24 = 0; i24 < i22; i24++) {
                    if (C2.get(i24)) {
                        p(4, byteBuffer);
                        jArr5[i24] = byteBuffer.getInt() & j;
                    }
                }
                int i25 = 0;
                int i26 = 0;
                for (md2 md2Var6 : (md2[]) laVar.Y) {
                    if (md2Var6.i == 1 && md2Var6.g) {
                        bitSet.set(i25, true);
                        jArr3[i25] = md2Var6.h;
                        i25++;
                    } else {
                        for (int i27 = 0; i27 < md2Var6.i; i27++) {
                            bitSet.set(i25, C2.get(i26));
                            jArr3[i25] = jArr5[i26];
                            i25++;
                            i26++;
                        }
                    }
                }
                B(byteBuffer);
            }
            laVar.Z = n85Var;
            B(byteBuffer);
        }
    }

    public static long K(ByteBuffer byteBuffer) {
        long B = B(byteBuffer);
        int i = 128;
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((i & B) == 0) {
                return ((B & (i - 1)) << (i2 * 8)) | j;
            }
            j |= B(byteBuffer) << (i2 * 8);
            i >>>= 1;
        }
        return j;
    }

    public static long R(ByteBuffer byteBuffer, long j) {
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

    public static int d(long j, String str) {
        if (j <= 2147483647L && j >= 0) {
            return (int) j;
        }
        throw new IOException(String.format("Cannot handle % %,d", str, Long.valueOf(j)));
    }

    public static void p(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining >= i) {
            return;
        }
        throw new EOFException(String.format("remaining %,d < expectRemaining %,d", Integer.valueOf(remaining), Integer.valueOf(i)));
    }

    public static void w(LinkedHashMap linkedHashMap, int i) {
        linkedHashMap.computeIfAbsent(Integer.valueOf(i), new Object());
    }

    public final void F(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        SeekableByteChannel seekableByteChannel = this.B;
        int i = av2.a;
        int remaining = byteBuffer.remaining();
        yu2 yu2Var = zu2.a;
        int remaining2 = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != seekableByteChannel.read(byteBuffer)) {
        }
        if (remaining2 - byteBuffer.remaining() >= remaining) {
            byteBuffer.flip();
        } else {
            i.l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:297:0x0718, code lost:
        defpackage.f81.j("Error parsing file names");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [tn0, v1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e26, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [e26, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [tn0, v1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.la I() {
        /*
            Method dump skipped, instructions count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g26.I():la");
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [tn0, v1] */
    public final void N(int i, y16 y16Var) {
        long j;
        this.c0.clear();
        InputStream inputStream = this.Y;
        if (inputStream != null) {
            inputStream.close();
            this.Y = null;
        }
        la laVar = this.L;
        md2 md2Var = ((md2[]) laVar.Y)[i];
        q9 q9Var = (q9) laVar.d0;
        int i2 = ((int[]) q9Var.B)[i];
        this.B.position(laVar.B + 32 + ((long[]) q9Var.L)[i2]);
        d26 d26Var = new d26(this, new BufferedInputStream(new s40(this.B, ((long[]) laVar.L)[i2])));
        LinkedList linkedList = new LinkedList();
        InputStream inputStream2 = d26Var;
        for (cq0 cq0Var : md2Var.a()) {
            if (cq0Var.b == 1 && cq0Var.c == 1) {
                h26 byId = h26.byId(cq0Var.a);
                if (md2Var.a != null) {
                    int i3 = 0;
                    while (true) {
                        cq0[] cq0VarArr = md2Var.a;
                        if (i3 >= cq0VarArr.length) {
                            break;
                        } else if (cq0VarArr[i3] == cq0Var) {
                            j = md2Var.f[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                    long j2 = j;
                    inputStream2 = hq0.a(this.A, inputStream2, j2, cq0Var, this.Z, this.d0);
                    linkedList.addFirst(new i26(byId, ((i0) hq0.a.get(byId)).b(cq0Var)));
                }
                j = 0;
                long j22 = j;
                inputStream2 = hq0.a(this.A, inputStream2, j22, cq0Var, this.Z, this.d0);
                linkedList.addFirst(new i26(byId, ((i0) hq0.a.get(byId)).b(cq0Var)));
            } else {
                f81.j("Multi input/output stream coders are not yet supported");
                return;
            }
        }
        y16Var.a(linkedList);
        if (md2Var.g) {
            int i4 = un0.R;
            ?? v1Var = new v1();
            v1Var.y = -1L;
            v1Var.x = new CRC32();
            v1Var.u = new e1(inputStream2);
            v1Var.y = md2Var.b();
            v1Var.z = md2Var.h;
            inputStream2 = v1Var.p0();
        }
        this.Y = inputStream2;
    }

    public final void Q(ByteBuffer byteBuffer, e26 e26Var) {
        long j;
        String str;
        int i;
        int i2;
        BitSet bitSet;
        boolean z;
        boolean z2;
        int i3;
        int B = B(byteBuffer);
        if (B == 6) {
            long K = K(byteBuffer);
            if (K >= 0) {
                long j2 = 32 + K;
                if (j2 <= this.B.size() && j2 >= 0) {
                    e26Var.a = d(K(byteBuffer), "numPackStreams");
                    int B2 = B(byteBuffer);
                    if (B2 == 9) {
                        long j3 = 0;
                        j = 0;
                        for (int i4 = 0; i4 < e26Var.a; i4++) {
                            long K2 = K(byteBuffer);
                            j3 += K2;
                            long j4 = j2 + j3;
                            if (K2 < 0 || j4 > this.B.size() || j4 < K) {
                                throw new IOException("packSize (" + K2 + ") is out of range");
                            }
                        }
                        B2 = B(byteBuffer);
                    } else {
                        j = 0;
                    }
                    if (B2 == 10) {
                        long cardinality = C(e26Var.a, byteBuffer).cardinality() * 4;
                        if (R(byteBuffer, cardinality) >= cardinality) {
                            B2 = B(byteBuffer);
                        } else {
                            f81.j("invalid number of CRCs in PackInfo");
                            return;
                        }
                    }
                    if (B2 == 0) {
                        B = B(byteBuffer);
                    } else {
                        f81.j(wh1.j("Badly terminated PackInfo (", B2, ")"));
                        return;
                    }
                }
            }
            throw new IOException("packPos (" + K + ") is out of range");
        }
        j = 0;
        String str2 = "negative unpackSize";
        if (B != 7) {
            str = "negative unpackSize";
            i = 0;
        } else {
            int B3 = B(byteBuffer);
            if (B3 == 11) {
                e26Var.f = d(K(byteBuffer), "numFolders");
                if (B(byteBuffer) == 0) {
                    LinkedList<Integer> linkedList = new LinkedList();
                    int i5 = 0;
                    while (true) {
                        int i6 = e26Var.f;
                        if (i5 < i6) {
                            int d = d(K(byteBuffer), "numCoders");
                            if (d != 0) {
                                e26Var.b += d;
                                long j5 = j;
                                long j6 = j5;
                                int i7 = 0;
                                while (i7 < d) {
                                    int B4 = B(byteBuffer);
                                    int i8 = B4 & 15;
                                    p(i8, byteBuffer);
                                    byteBuffer.get(new byte[i8]);
                                    if ((B4 & 16) == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ((B4 & 32) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if ((B4 & 128) == 0) {
                                        if (z) {
                                            j5++;
                                            j6++;
                                            i3 = d;
                                        } else {
                                            i3 = d;
                                            j5 += d(K(byteBuffer), "numInStreams");
                                            j6 += d(K(byteBuffer), "numOutStreams");
                                        }
                                        if (z2) {
                                            long d2 = d(K(byteBuffer), "propertiesSize");
                                            if (R(byteBuffer, d2) < d2) {
                                                f81.j("invalid propertiesSize in folder");
                                                return;
                                            }
                                        }
                                        i7++;
                                        d = i3;
                                    } else {
                                        f81.j("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                                        return;
                                    }
                                }
                                d(j5, "totalInStreams");
                                d(j6, "totalOutStreams");
                                e26Var.c += j6;
                                e26Var.d += j5;
                                if (j6 != j) {
                                    int d3 = d(j6 - 1, "numBindPairs");
                                    long j7 = d3;
                                    if (j5 >= j7) {
                                        BitSet bitSet2 = new BitSet((int) j5);
                                        int i9 = 0;
                                        while (i9 < d3) {
                                            int i10 = d3;
                                            int d4 = d(K(byteBuffer), "inIndex");
                                            int i11 = i5;
                                            String str3 = str2;
                                            if (j5 > d4) {
                                                bitSet2.set(d4);
                                                if (j6 > d(K(byteBuffer), "outIndex")) {
                                                    i9++;
                                                    str2 = str3;
                                                    i5 = i11;
                                                    d3 = i10;
                                                } else {
                                                    f81.j("outIndex is bigger than number of outStreams");
                                                    return;
                                                }
                                            } else {
                                                f81.j("inIndex is bigger than number of inStreams");
                                                return;
                                            }
                                        }
                                        int i12 = i5;
                                        String str4 = str2;
                                        int d5 = d(j5 - j7, "numPackedStreams");
                                        if (d5 == 1) {
                                            if (bitSet2.nextClearBit(0) == -1) {
                                                f81.j("Couldn't find stream's bind pair index");
                                                return;
                                            }
                                        } else {
                                            for (int i13 = 0; i13 < d5; i13++) {
                                                if (d(K(byteBuffer), "packedStreamIndex") >= j5) {
                                                    f81.j("packedStreamIndex is bigger than number of totalInStreams");
                                                    return;
                                                }
                                            }
                                            continue;
                                        }
                                        linkedList.add(Integer.valueOf((int) j6));
                                        i5 = i12 + 1;
                                        str2 = str4;
                                    } else {
                                        f81.j("Total input streams can't be less than the number of bind pairs");
                                        return;
                                    }
                                } else {
                                    f81.j("Total output streams can't be 0");
                                    return;
                                }
                            } else {
                                f81.j("Folder without coders");
                                return;
                            }
                        } else {
                            str = str2;
                            i = 0;
                            if (e26Var.d - (e26Var.c - i6) >= e26Var.a) {
                                int B5 = B(byteBuffer);
                                if (B5 == 12) {
                                    for (Integer num : linkedList) {
                                        int intValue = num.intValue();
                                        for (int i14 = 0; i14 < intValue; i14++) {
                                            if (K(byteBuffer) < j) {
                                                i.i(str);
                                                return;
                                            }
                                        }
                                    }
                                    int B6 = B(byteBuffer);
                                    if (B6 == 10) {
                                        BitSet C = C(e26Var.f, byteBuffer);
                                        e26Var.g = C;
                                        long cardinality2 = C.cardinality() * 4;
                                        if (R(byteBuffer, cardinality2) >= cardinality2) {
                                            B6 = B(byteBuffer);
                                        } else {
                                            f81.j("invalid number of CRCs in UnpackInfo");
                                            return;
                                        }
                                    }
                                    if (B6 == 0) {
                                        B = B(byteBuffer);
                                    } else {
                                        f81.j("Badly terminated UnpackInfo");
                                        return;
                                    }
                                } else {
                                    f81.j(wh1.g(B5, "Expected kCodersUnpackSize, got "));
                                    return;
                                }
                            } else {
                                f81.j("archive doesn't contain enough packed streams");
                                return;
                            }
                        }
                    }
                } else {
                    f81.j("External unsupported");
                    return;
                }
            } else {
                f81.j(wh1.g(B3, "Expected kFolder, got "));
                return;
            }
        }
        if (B == 8) {
            int B7 = B(byteBuffer);
            LinkedList<Integer> linkedList2 = new LinkedList();
            if (B7 == 13) {
                for (int i15 = i; i15 < e26Var.f; i15++) {
                    linkedList2.add(Integer.valueOf(d(K(byteBuffer), "numStreams")));
                }
                e26Var.e = linkedList2.stream().mapToLong(new Object()).sum();
                B7 = B(byteBuffer);
            } else {
                e26Var.e = e26Var.f;
            }
            d(e26Var.e, "totalUnpackStreams");
            if (B7 == 9) {
                for (Integer num2 : linkedList2) {
                    int intValue2 = num2.intValue();
                    if (intValue2 != 0) {
                        for (int i16 = i; i16 < intValue2 - 1; i16++) {
                            if (K(byteBuffer) < j) {
                                f81.j(str);
                                return;
                            }
                        }
                        continue;
                    }
                }
                B7 = B(byteBuffer);
            }
            if (linkedList2.isEmpty()) {
                BitSet bitSet3 = e26Var.g;
                i2 = e26Var.f;
                if (bitSet3 != null) {
                    i2 -= bitSet3.cardinality();
                }
            } else {
                int i17 = i;
                for (Integer num3 : linkedList2) {
                    int intValue3 = num3.intValue();
                    if (intValue3 == 1 && (bitSet = e26Var.g) != null) {
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
            if (B7 == 10) {
                d(i2, "numDigests");
                long cardinality3 = C(i2, byteBuffer).cardinality() * 4;
                if (R(byteBuffer, cardinality3) >= cardinality3) {
                    B7 = B(byteBuffer);
                } else {
                    f81.j("invalid number of missing CRCs in SubStreamInfo");
                    return;
                }
            }
            if (B7 == 0) {
                B = B(byteBuffer);
            } else {
                f81.j("Badly terminated SubStreamsInfo");
                return;
            }
        }
        if (B == 0) {
            return;
        }
        f81.j("Badly terminated StreamsInfo");
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
        if ((r14 - r8) != ((defpackage.y16[]) r3.c0)[r17.R].o) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (java.lang.Math.max(0L, r12.L - r12.i()) != ((defpackage.y16[]) r3.c0)[r17.R].o) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Type inference failed for: r1v2, types: [v1, q40] */
    /* JADX WARN: Type inference failed for: r1v6, types: [tn0, v1] */
    /* JADX WARN: Type inference failed for: r5v10, types: [tn0, v1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [v1, q40] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g26.i(int, boolean):void");
    }

    public final String toString() {
        return this.L.toString();
    }

    public final InputStream x(y16 y16Var) {
        la laVar;
        byte[] bArr;
        int i = 0;
        while (true) {
            laVar = this.L;
            y16[] y16VarArr = (y16[]) laVar.c0;
            if (i < y16VarArr.length) {
                if (y16Var == y16VarArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            i(i, true);
            this.R = i;
            this.X = ((int[]) ((q9) laVar.d0).X)[i];
            if (((y16[]) laVar.c0)[i].o == 0) {
                return new ByteArrayInputStream(n40.a);
            }
            ArrayList arrayList = this.c0;
            if (!arrayList.isEmpty()) {
                while (arrayList.size() > 1) {
                    InputStream inputStream = (InputStream) arrayList.remove(0);
                    try {
                        yu2 yu2Var = zu2.a;
                        long j = Long.MAX_VALUE;
                        while (j > 0) {
                            yu2 yu2Var2 = zu2.a;
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
            i.n("No current 7z entry (call getNextEntry() first).");
            return null;
        }
        f81.k("Can not find ", y16Var.a, " in ", this.A);
        return null;
    }
}
