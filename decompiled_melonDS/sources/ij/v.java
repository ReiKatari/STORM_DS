package ij;

import java.io.BufferedInputStream;
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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f7136d0 = {55, 122, -68, -81, 39, 28};
    public final String A;
    public SeekableByteChannel B;
    public final d1.s L;
    public InputStream Y;
    public byte[] Z;

    /* renamed from: c0  reason: collision with root package name */
    public final int f7138c0;
    public int R = -1;
    public int X = -1;

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList f7137b0 = new ArrayList();

    public v(FileChannel fileChannel, String str, boolean z10, int i2) {
        this.B = fileChannel;
        this.A = str;
        this.f7138c0 = i2;
        try {
            this.L = F();
            this.Z = null;
        } catch (Throwable th2) {
            if (z10) {
                this.B.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, ij.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v24 */
    public static void G(ByteBuffer byteBuffer, d1.s sVar) {
        long j2;
        int i2;
        l[] lVarArr;
        l[] lVarArr2;
        long j10;
        ?? r62;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        long H;
        long H2;
        byte[] bArr;
        int v10 = v(byteBuffer);
        long j11 = 4294967295L;
        if (v10 == 6) {
            sVar.f3664b = H(byteBuffer);
            int H3 = (int) H(byteBuffer);
            int v11 = v(byteBuffer);
            if (v11 == 9) {
                sVar.f3665c = new long[H3];
                int i11 = 0;
                while (true) {
                    long[] jArr = (long[]) sVar.f3665c;
                    if (i11 >= jArr.length) {
                        break;
                    }
                    jArr[i11] = H(byteBuffer);
                    i11++;
                }
                v11 = v(byteBuffer);
            }
            if (v11 == 10) {
                sVar.f3666d = w(H3, byteBuffer);
                sVar.f3667e = new long[H3];
                for (int i12 = 0; i12 < H3; i12++) {
                    if (((BitSet) sVar.f3666d).get(i12)) {
                        m(4, byteBuffer);
                        ((long[]) sVar.f3667e)[i12] = byteBuffer.getInt() & 4294967295L;
                    }
                }
                v(byteBuffer);
            }
            v10 = v(byteBuffer);
        }
        if (v10 == 7) {
            v(byteBuffer);
            int H4 = (int) H(byteBuffer);
            l[] lVarArr3 = new l[H4];
            sVar.f3668f = lVarArr3;
            v(byteBuffer);
            int i13 = 0;
            while (i13 < H4) {
                ?? obj = new Object();
                long j12 = j11;
                int H5 = (int) H(byteBuffer);
                f[] fVarArr = new f[H5];
                long j13 = 0;
                int i14 = 0;
                long j14 = 0;
                while (i14 < H5) {
                    long j15 = j12;
                    int v12 = v(byteBuffer);
                    int i15 = v12 & 15;
                    if ((v12 & 16) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((v12 & 32) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((v12 & 128) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    byte[] bArr2 = new byte[i15];
                    m(i15, byteBuffer);
                    byteBuffer.get(bArr2);
                    if (z10) {
                        H = 1;
                        H2 = 1;
                    } else {
                        H = H(byteBuffer);
                        H2 = H(byteBuffer);
                    }
                    long j16 = j13 + H;
                    j14 += H2;
                    l[] lVarArr4 = lVarArr3;
                    if (z11) {
                        int H6 = (int) H(byteBuffer);
                        bArr = new byte[H6];
                        m(H6, byteBuffer);
                        byteBuffer.get(bArr);
                    } else {
                        bArr = null;
                    }
                    byte[] bArr3 = bArr;
                    if (!z12) {
                        fVarArr[i14] = new f(bArr2, H, H2, bArr3);
                        i14++;
                        lVarArr3 = lVarArr4;
                        j13 = j16;
                        j12 = j15;
                    } else {
                        fj.j.h("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                        return;
                    }
                }
                l[] lVarArr5 = lVarArr3;
                long j17 = j12;
                obj.f7098a = fVarArr;
                obj.f7099b = j13;
                obj.f7100c = j14;
                long j18 = j14 - 1;
                int i16 = (int) j18;
                gj.f[] fVarArr2 = new gj.f[i16];
                int i17 = 0;
                while (i17 < i16) {
                    fVarArr2[i17] = new gj.f(H(byteBuffer), H(byteBuffer));
                    i17++;
                    lVarArr5 = lVarArr5;
                    j18 = j18;
                }
                l[] lVarArr6 = lVarArr5;
                obj.f7101d = fVarArr2;
                long j19 = j13 - j18;
                int i18 = (int) j19;
                long[] jArr2 = new long[i18];
                if (j19 == 1) {
                    int i19 = 0;
                    while (i19 < ((int) j13)) {
                        if (obj.f7101d != null) {
                            i10 = 0;
                            while (true) {
                                gj.f[] fVarArr3 = obj.f7101d;
                                if (i10 >= fVarArr3.length) {
                                    break;
                                } else if (fVarArr3[i10].f5690b == i19) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        i10 = -1;
                        if (i10 < 0) {
                            break;
                        }
                        i19++;
                    }
                    jArr2[0] = i19;
                } else {
                    for (int i20 = 0; i20 < i18; i20++) {
                        jArr2[i20] = H(byteBuffer);
                    }
                }
                obj.f7102e = jArr2;
                lVarArr6[i13] = obj;
                i13++;
                lVarArr3 = lVarArr6;
                j11 = j17;
            }
            l[] lVarArr7 = lVarArr3;
            j2 = j11;
            int i21 = 0;
            v(byteBuffer);
            for (int i22 = 0; i22 < H4; i22++) {
                l lVar = lVarArr7[i22];
                d(lVar.f7100c, "totalOutputStreams");
                lVar.f7103f = new long[(int) lVar.f7100c];
                for (int i23 = 0; i23 < lVar.f7100c; i23++) {
                    lVar.f7103f[i23] = H(byteBuffer);
                }
            }
            if (v(byteBuffer) == 10) {
                BitSet w10 = w(H4, byteBuffer);
                int i24 = 0;
                while (i24 < H4) {
                    if (w10.get(i24)) {
                        l lVar2 = lVarArr7[i24];
                        lVar2.f7104g = true;
                        m(4, byteBuffer);
                        lVar2.f7105h = byteBuffer.getInt() & j2;
                        r62 = i21;
                    } else {
                        r62 = i21;
                        lVarArr7[i24].f7104g = r62;
                    }
                    i24++;
                    i21 = r62;
                }
                i2 = i21;
                v(byteBuffer);
            } else {
                i2 = 0;
            }
            v10 = v(byteBuffer);
        } else {
            j2 = 4294967295L;
            i2 = 0;
            sVar.f3668f = l.f7097j;
        }
        if (v10 == 8) {
            l[] lVarArr8 = (l[]) sVar.f3668f;
            int length = lVarArr8.length;
            for (int i25 = i2; i25 < length; i25++) {
                lVarArr8[i25].f7106i = 1;
            }
            long length2 = ((l[]) sVar.f3668f).length;
            int v13 = v(byteBuffer);
            if (v13 == 13) {
                l[] lVarArr9 = (l[]) sVar.f3668f;
                int length3 = lVarArr9.length;
                long j20 = 0;
                for (int i26 = i2; i26 < length3; i26++) {
                    l lVar3 = lVarArr9[i26];
                    long H7 = H(byteBuffer);
                    lVar3.f7106i = (int) H7;
                    j20 += H7;
                }
                long j21 = j20;
                v13 = v(byteBuffer);
                length2 = j21;
            }
            a4.n nVar = new a4.n((int) length2);
            long[] jArr3 = (long[]) nVar.R;
            BitSet bitSet = (BitSet) nVar.L;
            long[] jArr4 = (long[]) nVar.B;
            l[] lVarArr10 = (l[]) sVar.f3668f;
            int length4 = lVarArr10.length;
            int i27 = i2;
            int i28 = i27;
            while (i27 < length4) {
                l lVar4 = lVarArr10[i27];
                if (lVar4.f7106i != 0) {
                    if (v13 == 9) {
                        int i29 = i2;
                        j10 = 0;
                        while (i29 < lVar4.f7106i - 1) {
                            long H8 = H(byteBuffer);
                            jArr4[i28] = H8;
                            j10 += H8;
                            i29++;
                            i28++;
                        }
                    } else {
                        j10 = 0;
                    }
                    if (j10 <= lVar4.b()) {
                        jArr4[i28] = lVar4.b() - j10;
                        i28++;
                    } else {
                        fj.j.h("sum of unpack sizes of folder exceeds total unpack size");
                        return;
                    }
                }
                i27++;
                i2 = 0;
            }
            if (v13 == 9) {
                v13 = v(byteBuffer);
            }
            int i30 = 0;
            for (l lVar5 : (l[]) sVar.f3668f) {
                int i31 = lVar5.f7106i;
                if (i31 != 1 || !lVar5.f7104g) {
                    i30 += i31;
                }
            }
            if (v13 == 10) {
                BitSet w11 = w(i30, byteBuffer);
                long[] jArr5 = new long[i30];
                for (int i32 = 0; i32 < i30; i32++) {
                    if (w11.get(i32)) {
                        m(4, byteBuffer);
                        jArr5[i32] = byteBuffer.getInt() & j2;
                    }
                }
                int i33 = 0;
                int i34 = 0;
                for (l lVar6 : (l[]) sVar.f3668f) {
                    if (lVar6.f7106i == 1 && lVar6.f7104g) {
                        bitSet.set(i33, true);
                        jArr3[i33] = lVar6.f7105h;
                        i33++;
                    } else {
                        for (int i35 = 0; i35 < lVar6.f7106i; i35++) {
                            bitSet.set(i33, w11.get(i34));
                            jArr3[i33] = jArr5[i34];
                            i33++;
                            i34++;
                        }
                    }
                }
                v(byteBuffer);
            }
            sVar.f3669g = nVar;
            v(byteBuffer);
        }
    }

    public static long H(ByteBuffer byteBuffer) {
        long v10 = v(byteBuffer);
        int i2 = 128;
        long j2 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            if ((i2 & v10) == 0) {
                return ((v10 & (i2 - 1)) << (i10 * 8)) | j2;
            }
            j2 |= v(byteBuffer) << (i10 * 8);
            i2 >>>= 1;
        }
        return j2;
    }

    public static long K(ByteBuffer byteBuffer, long j2) {
        if (j2 < 1) {
            return 0L;
        }
        int position = byteBuffer.position();
        long remaining = byteBuffer.remaining();
        if (remaining < j2) {
            j2 = remaining;
        }
        byteBuffer.position(position + ((int) j2));
        return j2;
    }

    public static int d(long j2, String str) {
        if (j2 <= 2147483647L && j2 >= 0) {
            return (int) j2;
        }
        throw new IOException(String.format("Cannot handle % %,d", str, Long.valueOf(j2)));
    }

    public static void m(int i2, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining >= i2) {
            return;
        }
        throw new EOFException(String.format("remaining %,d < expectRemaining %,d", Integer.valueOf(remaining), Integer.valueOf(i2)));
    }

    public static void t(LinkedHashMap linkedHashMap, int i2) {
        linkedHashMap.computeIfAbsent(Integer.valueOf(i2), new Object());
    }

    public static int v(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        a0.j.c();
        return 0;
    }

    public static BitSet w(int i2, ByteBuffer byteBuffer) {
        if (v(byteBuffer) != 0) {
            BitSet bitSet = new BitSet(i2);
            for (int i10 = 0; i10 < i2; i10++) {
                bitSet.set(i10, true);
            }
            return bitSet;
        }
        return z(i2, byteBuffer);
    }

    public static BitSet z(int i2, ByteBuffer byteBuffer) {
        boolean z10;
        BitSet bitSet = new BitSet(i2);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i2; i12++) {
            if (i10 == 0) {
                i11 = v(byteBuffer);
                i10 = 128;
            }
            if ((i11 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            bitSet.set(i12, z10);
            i10 >>>= 1;
        }
        return bitSet;
    }

    public final void B(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        SeekableByteChannel seekableByteChannel = this.B;
        int i2 = mj.c.f9708a;
        int remaining = byteBuffer.remaining();
        nj.b bVar = nj.c.f10450a;
        int remaining2 = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != seekableByteChannel.read(byteBuffer)) {
        }
        if (remaining2 - byteBuffer.remaining() >= remaining) {
            byteBuffer.flip();
        } else {
            a0.j.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [oj.c, rj.c] */
    /* JADX WARN: Type inference failed for: r2v30, types: [oj.c, rj.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ij.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [ij.t, java.lang.Object] */
    public final d1.s F() {
        DataInputStream dataInputStream;
        long reverseBytes;
        long j2;
        long j10;
        long j11;
        int i2;
        l[] lVarArr;
        boolean z10;
        int i10;
        BitSet bitSet;
        boolean z11;
        boolean z12;
        long j12;
        int i11;
        InputStream inputStream;
        long j13;
        ByteBuffer order = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        B(order);
        byte[] bArr = new byte[6];
        order.get(bArr);
        if (Arrays.equals(bArr, f7136d0)) {
            byte b10 = order.get();
            byte b11 = order.get();
            if (b10 == 0) {
                long j14 = order.getInt() & 4294967295L;
                if (j14 == 0) {
                    long position = this.B.position();
                    ByteBuffer allocate = ByteBuffer.allocate(20);
                    B(allocate);
                    this.B.position(position);
                    while (allocate.hasRemaining()) {
                        if (allocate.get() != 0) {
                            int i12 = rj.d.R;
                            ?? cVar = new oj.c();
                            cVar.f12780i = -1L;
                            cVar.f12779h = new CRC32();
                            cVar.f11054e = new oj.a(new e(this.B, 20L));
                            cVar.f12780i = 20L;
                            cVar.f12781j = j14;
                            dataInputStream = new DataInputStream(cVar.B0());
                            try {
                                reverseBytes = Long.reverseBytes(dataInputStream.readLong());
                                if (reverseBytes < 0 && reverseBytes + 32 <= this.B.size()) {
                                    long reverseBytes2 = Long.reverseBytes(dataInputStream.readLong());
                                    long j15 = reverseBytes + reverseBytes2;
                                    if (j15 >= reverseBytes && j15 + 32 <= this.B.size()) {
                                        y yVar = new y(reverseBytes, reverseBytes2, Integer.reverseBytes(dataInputStream.readInt()) & 4294967295L);
                                        dataInputStream.close();
                                        long j16 = yVar.f7143b;
                                        d(j16, "nextHeaderSize");
                                        int i13 = (int) j16;
                                        this.B.position(yVar.f7142a + 32);
                                        long position2 = this.B.position();
                                        CheckedInputStream checkedInputStream = new CheckedInputStream(Channels.newInputStream(this.B), new CRC32());
                                        long j17 = i13;
                                        if (checkedInputStream.skip(j17) == j17) {
                                            if (yVar.f7144c == checkedInputStream.getChecksum().getValue()) {
                                                this.B.position(position2);
                                                d1.s sVar = new d1.s();
                                                ByteBuffer order2 = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
                                                B(order2);
                                                int v10 = v(order2);
                                                int i14 = -1;
                                                int i15 = this.f7138c0;
                                                int i16 = 0;
                                                if (v10 == 23) {
                                                    int position3 = order2.position();
                                                    ?? obj = new Object();
                                                    J(order2, obj);
                                                    obj.a(i15);
                                                    order2.position(position3);
                                                    G(order2, sVar);
                                                    l[] lVarArr2 = (l[]) sVar.f3668f;
                                                    if (lVarArr2.length != 0) {
                                                        if (((long[]) sVar.f3665c).length != 0) {
                                                            l lVar = lVarArr2[0];
                                                            this.B.position(sVar.f3664b + 32);
                                                            j10 = 1;
                                                            e eVar = new e(this.B, ((long[]) sVar.f3665c)[0]);
                                                            InputStream inputStream2 = eVar;
                                                            for (f fVar : lVar.a()) {
                                                                if (fVar.f7090b == 1 && fVar.f7091c == 1) {
                                                                    if (lVar.f7098a != null) {
                                                                        int i17 = 0;
                                                                        while (true) {
                                                                            f[] fVarArr = lVar.f7098a;
                                                                            if (i17 >= fVarArr.length) {
                                                                                break;
                                                                            } else if (fVarArr[i17] == fVar) {
                                                                                j13 = lVar.f7103f[i17];
                                                                                break;
                                                                            } else {
                                                                                i17++;
                                                                            }
                                                                        }
                                                                        inputStream2 = k.a(this.A, inputStream2, j13, fVar, null, this.f7138c0);
                                                                    }
                                                                    j13 = 0;
                                                                    inputStream2 = k.a(this.A, inputStream2, j13, fVar, null, this.f7138c0);
                                                                } else {
                                                                    fj.j.h("Multi input/output stream coders are not yet supported");
                                                                    return null;
                                                                }
                                                            }
                                                            InputStream inputStream3 = inputStream2;
                                                            rj.d dVar = inputStream3;
                                                            if (lVar.f7104g) {
                                                                int i18 = rj.d.R;
                                                                ?? cVar2 = new oj.c();
                                                                cVar2.f12780i = -1L;
                                                                cVar2.f12779h = new CRC32();
                                                                cVar2.f11054e = new oj.a(inputStream3);
                                                                cVar2.f12780i = lVar.b();
                                                                cVar2.f12781j = lVar.f7105h;
                                                                dVar = cVar2.B0();
                                                            }
                                                            int d4 = d(lVar.b(), "unpackSize");
                                                            int i19 = mj.c.f9708a;
                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                            long j18 = d4;
                                                            byte[] bArr2 = (byte[]) nj.c.f10450a.get();
                                                            Arrays.fill(bArr2, (byte) 0);
                                                            int i20 = (j18 > 0L ? 1 : (j18 == 0L ? 0 : -1));
                                                            if (i20 == 0) {
                                                                inputStream = dVar;
                                                                j2 = 0;
                                                            } else {
                                                                int length = bArr2.length;
                                                                j2 = 0;
                                                                if (i20 > 0 && j18 < length) {
                                                                    i11 = (int) j18;
                                                                } else {
                                                                    i11 = length;
                                                                }
                                                                long j19 = 0;
                                                                while (i11 > 0) {
                                                                    int read = dVar.read(bArr2, 0, i11);
                                                                    if (-1 == read) {
                                                                        break;
                                                                    }
                                                                    byteArrayOutputStream.write(bArr2, 0, read);
                                                                    InputStream inputStream4 = dVar;
                                                                    j19 += read;
                                                                    if (i20 > 0) {
                                                                        i11 = (int) Math.min(j18 - j19, length);
                                                                    }
                                                                    dVar = inputStream4;
                                                                }
                                                                inputStream = dVar;
                                                            }
                                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                            if (byteArray.length >= d4) {
                                                                inputStream.close();
                                                                order2 = ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN);
                                                                sVar = new d1.s();
                                                                v10 = v(order2);
                                                            } else {
                                                                fj.j.h("premature end of stream");
                                                            }
                                                        } else {
                                                            fj.j.h("no packed streams, can't read encoded header");
                                                        }
                                                    } else {
                                                        fj.j.h("no folders, can't read encoded header");
                                                    }
                                                } else {
                                                    j2 = 0;
                                                    j10 = 1;
                                                }
                                                if (v10 == 1) {
                                                    int position4 = order2.position();
                                                    ?? obj2 = new Object();
                                                    int v11 = v(order2);
                                                    if (v11 == 2) {
                                                        for (long H = H(order2); H != j2; H = H(order2)) {
                                                            long d10 = d(H(order2), "propertySize");
                                                            if (K(order2, d10) < d10) {
                                                                fj.j.h("invalid property size");
                                                                break;
                                                            }
                                                        }
                                                        v11 = v(order2);
                                                    }
                                                    if (v11 != 3) {
                                                        int i21 = 4;
                                                        if (v11 == 4) {
                                                            J(order2, obj2);
                                                            v11 = v(order2);
                                                        }
                                                        if (v11 == 5) {
                                                            j11 = j10;
                                                            i2 = 8;
                                                            obj2.f7131h = d(H(order2), "numFiles");
                                                            int i22 = -1;
                                                            while (true) {
                                                                int v12 = v(order2);
                                                                if (v12 == 0) {
                                                                    obj2.f7132i = obj2.f7131h - Math.max(i22, i16);
                                                                    v11 = v(order2);
                                                                } else {
                                                                    int i23 = i21;
                                                                    long H2 = H(order2);
                                                                    switch (v12) {
                                                                        case 14:
                                                                            i22 = z(obj2.f7131h, order2).cardinality();
                                                                            break;
                                                                        case l1.c.f8512h /* 15 */:
                                                                            if (i22 != -1) {
                                                                                z(i22, order2);
                                                                                break;
                                                                            } else {
                                                                                fj.j.h("Header format error: kEmptyStream must appear before kEmptyFile");
                                                                                break;
                                                                            }
                                                                        case 16:
                                                                            if (i22 != -1) {
                                                                                z(i22, order2);
                                                                                break;
                                                                            } else {
                                                                                fj.j.h("Header format error: kEmptyStream must appear before kAnti");
                                                                                break;
                                                                            }
                                                                        case 17:
                                                                            if (v(order2) == 0) {
                                                                                int d11 = d(H2 - j11, "file names length");
                                                                                if ((d11 & 1) == 0) {
                                                                                    int i24 = 0;
                                                                                    for (int i25 = 0; i25 < d11; i25 += 2) {
                                                                                        m(2, order2);
                                                                                        if (order2.getChar() == 0) {
                                                                                            i24++;
                                                                                        }
                                                                                    }
                                                                                    if (i24 == obj2.f7131h) {
                                                                                        break;
                                                                                    } else {
                                                                                        fj.j.h(w.d.q(kc.a.i("Invalid number of file names (", i24, " instead of "), obj2.f7131h, ")"));
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    fj.j.h("File names length invalid");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                fj.j.h("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 18:
                                                                            int cardinality = w(obj2.f7131h, order2).cardinality();
                                                                            if (v(order2) == 0) {
                                                                                long j20 = cardinality * 8;
                                                                                if (K(order2, j20) >= j20) {
                                                                                    break;
                                                                                } else {
                                                                                    fj.j.h("invalid creation dates size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                fj.j.h("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 19:
                                                                            int cardinality2 = w(obj2.f7131h, order2).cardinality();
                                                                            if (v(order2) == 0) {
                                                                                long j21 = cardinality2 * 8;
                                                                                if (K(order2, j21) >= j21) {
                                                                                    break;
                                                                                } else {
                                                                                    fj.j.h("invalid access dates size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                fj.j.h("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 20:
                                                                            int cardinality3 = w(obj2.f7131h, order2).cardinality();
                                                                            if (v(order2) == 0) {
                                                                                long j22 = cardinality3 * 8;
                                                                                if (K(order2, j22) >= j22) {
                                                                                    break;
                                                                                } else {
                                                                                    fj.j.h("invalid modification dates size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                fj.j.h("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 21:
                                                                            int cardinality4 = w(obj2.f7131h, order2).cardinality();
                                                                            if (v(order2) == 0) {
                                                                                long j23 = cardinality4 * 4;
                                                                                if (K(order2, j23) >= j23) {
                                                                                    break;
                                                                                } else {
                                                                                    fj.j.h("invalid windows attributes size");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                fj.j.h("Not implemented");
                                                                                break;
                                                                            }
                                                                        case 22:
                                                                        case 23:
                                                                        default:
                                                                            if (K(order2, H2) >= H2) {
                                                                                break;
                                                                            } else {
                                                                                fj.j.h(w.d.l(v12, "Incomplete property of type "));
                                                                                break;
                                                                            }
                                                                        case 24:
                                                                            fj.j.h("kStartPos is unsupported, please report");
                                                                            break;
                                                                        case 25:
                                                                            if (K(order2, H2) >= H2) {
                                                                                break;
                                                                            } else {
                                                                                fj.j.h("Incomplete kDummy property");
                                                                                break;
                                                                            }
                                                                    }
                                                                    i21 = i23;
                                                                    i16 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            j11 = j10;
                                                            i2 = 8;
                                                        }
                                                        int i26 = i21;
                                                        if (v11 == 0) {
                                                            obj2.a(i15);
                                                            order2.position(position4);
                                                            int v13 = v(order2);
                                                            if (v13 == 2) {
                                                                for (long H3 = H(order2); H3 != j2; H3 = H(order2)) {
                                                                    int H4 = (int) H(order2);
                                                                    m(H4, order2);
                                                                    order2.get(new byte[H4]);
                                                                }
                                                                v13 = v(order2);
                                                            }
                                                            if (v13 != 3) {
                                                                if (v13 == i26) {
                                                                    G(order2, sVar);
                                                                    v13 = v(order2);
                                                                }
                                                                if (v13 == 5) {
                                                                    int H5 = (int) H(order2);
                                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                    BitSet bitSet2 = null;
                                                                    BitSet bitSet3 = null;
                                                                    BitSet bitSet4 = null;
                                                                    while (true) {
                                                                        int v14 = v(order2);
                                                                        if (v14 == 0) {
                                                                            int i27 = 0;
                                                                            int i28 = 0;
                                                                            int i29 = 0;
                                                                            while (true) {
                                                                                if (i27 < H5) {
                                                                                    n nVar = (n) linkedHashMap.get(Integer.valueOf(i27));
                                                                                    if (nVar == null) {
                                                                                        i10 = i14;
                                                                                        bitSet = bitSet3;
                                                                                        j12 = j2;
                                                                                    } else {
                                                                                        if (bitSet2 != null && bitSet2.get(i27)) {
                                                                                            z10 = false;
                                                                                        } else {
                                                                                            z10 = true;
                                                                                        }
                                                                                        nVar.f7110b = z10;
                                                                                        if (z10) {
                                                                                            a4.n nVar2 = (a4.n) sVar.f3669g;
                                                                                            if (nVar2 != null) {
                                                                                                nVar.f7111c = false;
                                                                                                nVar.f7112d = false;
                                                                                                nVar.m = ((BitSet) nVar2.L).get(i29);
                                                                                                a4.n nVar3 = (a4.n) sVar.f3669g;
                                                                                                i10 = i14;
                                                                                                BitSet bitSet5 = bitSet3;
                                                                                                nVar.f7121n = ((long[]) nVar3.R)[i29];
                                                                                                long j24 = ((long[]) nVar3.B)[i29];
                                                                                                nVar.f7122o = j24;
                                                                                                if (j24 >= j2) {
                                                                                                    i29++;
                                                                                                    j12 = j2;
                                                                                                    bitSet = bitSet5;
                                                                                                } else {
                                                                                                    fj.j.h("broken archive, entry with negative size");
                                                                                                }
                                                                                            } else {
                                                                                                fj.j.h("Archive contains file with streams but no subStreamsInfo");
                                                                                            }
                                                                                        } else {
                                                                                            i10 = i14;
                                                                                            BitSet bitSet6 = bitSet3;
                                                                                            bitSet = bitSet6;
                                                                                            if (bitSet6 != null && bitSet.get(i28)) {
                                                                                                z11 = false;
                                                                                            } else {
                                                                                                z11 = true;
                                                                                            }
                                                                                            nVar.f7111c = z11;
                                                                                            if (bitSet4 != null && bitSet4.get(i28)) {
                                                                                                z12 = true;
                                                                                            } else {
                                                                                                z12 = false;
                                                                                            }
                                                                                            nVar.f7112d = z12;
                                                                                            nVar.m = false;
                                                                                            j12 = j2;
                                                                                            nVar.f7122o = j12;
                                                                                            i28++;
                                                                                            i27++;
                                                                                            bitSet3 = bitSet;
                                                                                            j2 = j12;
                                                                                            i14 = i10;
                                                                                        }
                                                                                    }
                                                                                    i27++;
                                                                                    bitSet3 = bitSet;
                                                                                    j2 = j12;
                                                                                    i14 = i10;
                                                                                } else {
                                                                                    int i30 = i14;
                                                                                    long j25 = j2;
                                                                                    sVar.f3670h = (n[]) linkedHashMap.values().stream().filter(new Object()).toArray(new Object());
                                                                                    int length2 = ((l[]) sVar.f3668f).length;
                                                                                    int[] iArr = new int[length2];
                                                                                    int i31 = 0;
                                                                                    for (int i32 = 0; i32 < length2; i32++) {
                                                                                        iArr[i32] = i31;
                                                                                        i31 += ((l[]) sVar.f3668f)[i32].f7102e.length;
                                                                                    }
                                                                                    int length3 = ((long[]) sVar.f3665c).length;
                                                                                    long[] jArr = new long[length3];
                                                                                    long j26 = j25;
                                                                                    for (int i33 = 0; i33 < length3; i33++) {
                                                                                        jArr[i33] = j26;
                                                                                        j26 += ((long[]) sVar.f3665c)[i33];
                                                                                    }
                                                                                    int[] iArr2 = new int[length2];
                                                                                    int[] iArr3 = new int[((n[]) sVar.f3670h).length];
                                                                                    int i34 = 0;
                                                                                    int i35 = 0;
                                                                                    int i36 = 0;
                                                                                    while (true) {
                                                                                        n[] nVarArr = (n[]) sVar.f3670h;
                                                                                        if (i34 < nVarArr.length) {
                                                                                            if (!nVarArr[i34].f7110b && i35 == 0) {
                                                                                                iArr3[i34] = i30;
                                                                                            } else {
                                                                                                if (i35 == 0) {
                                                                                                    while (true) {
                                                                                                        lVarArr = (l[]) sVar.f3668f;
                                                                                                        if (i36 < lVarArr.length) {
                                                                                                            iArr2[i36] = i34;
                                                                                                            if (lVarArr[i36].f7106i <= 0) {
                                                                                                                i36++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (i36 >= lVarArr.length) {
                                                                                                        fj.j.h("Too few folders in archive");
                                                                                                    }
                                                                                                }
                                                                                                iArr3[i34] = i36;
                                                                                                if (((n[]) sVar.f3670h)[i34].f7110b && (i35 = i35 + 1) >= ((l[]) sVar.f3668f)[i36].f7106i) {
                                                                                                    i36++;
                                                                                                    i35 = 0;
                                                                                                }
                                                                                            }
                                                                                            i34++;
                                                                                        } else {
                                                                                            sVar.f3671i = new b9.e(iArr, jArr, iArr2, iArr3, 14);
                                                                                            v(order2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i37 = i14;
                                                                            BitSet bitSet7 = bitSet3;
                                                                            long H6 = H(order2);
                                                                            if (v14 != 25) {
                                                                                switch (v14) {
                                                                                    case 14:
                                                                                        bitSet2 = z(H5, order2);
                                                                                        break;
                                                                                    case l1.c.f8512h /* 15 */:
                                                                                        bitSet3 = z(bitSet2.cardinality(), order2);
                                                                                        continue;
                                                                                        i14 = i37;
                                                                                        j2 = 0;
                                                                                    case 16:
                                                                                        bitSet4 = z(bitSet2.cardinality(), order2);
                                                                                        break;
                                                                                    case 17:
                                                                                        v(order2);
                                                                                        int i38 = (int) (H6 - j11);
                                                                                        byte[] bArr3 = new byte[i38];
                                                                                        m(i38, order2);
                                                                                        order2.get(bArr3);
                                                                                        int i39 = 0;
                                                                                        int i40 = 0;
                                                                                        for (int i41 = 0; i41 < i38; i41 += 2) {
                                                                                            if (bArr3[i41] == 0 && bArr3[i41 + 1] == 0) {
                                                                                                t(linkedHashMap, i40);
                                                                                                ((n) linkedHashMap.get(Integer.valueOf(i40))).f7109a = new String(bArr3, i39, i41 - i39, StandardCharsets.UTF_16LE);
                                                                                                i40++;
                                                                                                i39 = i41 + 2;
                                                                                            }
                                                                                        }
                                                                                        if (i39 != i38 || i40 != H5) {
                                                                                        }
                                                                                        break;
                                                                                    case 18:
                                                                                        BitSet w10 = w(H5, order2);
                                                                                        v(order2);
                                                                                        for (int i42 = 0; i42 < H5; i42++) {
                                                                                            t(linkedHashMap, i42);
                                                                                            n nVar4 = (n) linkedHashMap.get(Integer.valueOf(i42));
                                                                                            boolean z13 = w10.get(i42);
                                                                                            nVar4.f7113e = z13;
                                                                                            if (z13) {
                                                                                                m(8, order2);
                                                                                                nVar4.f7116h = qj.b.a(order2.getLong());
                                                                                            }
                                                                                        }
                                                                                        i2 = 8;
                                                                                        break;
                                                                                    case 19:
                                                                                        BitSet w11 = w(H5, order2);
                                                                                        v(order2);
                                                                                        for (int i43 = 0; i43 < H5; i43++) {
                                                                                            t(linkedHashMap, i43);
                                                                                            n nVar5 = (n) linkedHashMap.get(Integer.valueOf(i43));
                                                                                            boolean z14 = w11.get(i43);
                                                                                            nVar5.f7115g = z14;
                                                                                            if (z14) {
                                                                                                m(8, order2);
                                                                                                nVar5.f7118j = qj.b.a(order2.getLong());
                                                                                            }
                                                                                        }
                                                                                        i2 = 8;
                                                                                        break;
                                                                                    case 20:
                                                                                        BitSet w12 = w(H5, order2);
                                                                                        v(order2);
                                                                                        int i44 = 0;
                                                                                        while (i44 < H5) {
                                                                                            t(linkedHashMap, i44);
                                                                                            n nVar6 = (n) linkedHashMap.get(Integer.valueOf(i44));
                                                                                            boolean z15 = w12.get(i44);
                                                                                            nVar6.f7114f = z15;
                                                                                            if (z15) {
                                                                                                m(i2, order2);
                                                                                                nVar6.f7117i = qj.b.a(order2.getLong());
                                                                                            }
                                                                                            i44++;
                                                                                            i2 = 8;
                                                                                        }
                                                                                        i2 = 8;
                                                                                        break;
                                                                                    case 21:
                                                                                        BitSet w13 = w(H5, order2);
                                                                                        v(order2);
                                                                                        for (int i45 = 0; i45 < H5; i45++) {
                                                                                            t(linkedHashMap, i45);
                                                                                            n nVar7 = (n) linkedHashMap.get(Integer.valueOf(i45));
                                                                                            boolean z16 = w13.get(i45);
                                                                                            nVar7.f7119k = z16;
                                                                                            if (z16) {
                                                                                                m(4, order2);
                                                                                                nVar7.f7120l = order2.getInt();
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        K(order2, H6);
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                K(order2, H6);
                                                                            }
                                                                            bitSet3 = bitSet7;
                                                                            i14 = i37;
                                                                            j2 = 0;
                                                                        }
                                                                    }
                                                                    fj.j.h("Error parsing file names");
                                                                }
                                                                sVar.f3669g = null;
                                                                return sVar;
                                                            }
                                                            fj.j.h("Additional streams unsupported");
                                                        } else {
                                                            fj.j.h(w.d.l(v11, "Badly terminated header, found "));
                                                        }
                                                    } else {
                                                        fj.j.h("Additional streams unsupported");
                                                    }
                                                } else {
                                                    fj.j.h("Broken or unsupported archive: no Header");
                                                }
                                            } else {
                                                fj.j.h("NextHeader CRC-32 mismatch");
                                            }
                                        } else {
                                            fj.j.h("Problem computing NextHeader CRC-32");
                                        }
                                        return null;
                                    }
                                    throw new IOException("nextHeaderSize is out of bounds");
                                }
                                throw new IOException("nextHeaderOffset is out of bounds");
                            } catch (Throwable th2) {
                                try {
                                    dataInputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    }
                    fj.j.h("archive seems to be invalid.\nYou may want to retry and enable the tryToRecoverBrokenArchives if the archive could be a multi volume archive that has been closed prematurely.");
                    return null;
                }
                int i122 = rj.d.R;
                ?? cVar3 = new oj.c();
                cVar3.f12780i = -1L;
                cVar3.f12779h = new CRC32();
                cVar3.f11054e = new oj.a(new e(this.B, 20L));
                cVar3.f12780i = 20L;
                cVar3.f12781j = j14;
                dataInputStream = new DataInputStream(cVar3.B0());
                reverseBytes = Long.reverseBytes(dataInputStream.readLong());
                if (reverseBytes < 0) {
                }
                throw new IOException("nextHeaderOffset is out of bounds");
            }
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", Byte.valueOf(b10), Byte.valueOf(b11)));
        }
        fj.j.h("Bad 7z signature");
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [oj.c, rj.c] */
    public final void I(int i2, n nVar) {
        long j2;
        this.f7137b0.clear();
        InputStream inputStream = this.Y;
        if (inputStream != null) {
            inputStream.close();
            this.Y = null;
        }
        d1.s sVar = this.L;
        l lVar = ((l[]) sVar.f3668f)[i2];
        b9.e eVar = (b9.e) sVar.f3671i;
        int i10 = ((int[]) eVar.B)[i2];
        this.B.position(sVar.f3664b + 32 + ((long[]) eVar.L)[i10]);
        s sVar2 = new s(this, new BufferedInputStream(new e(this.B, ((long[]) sVar.f3665c)[i10])));
        LinkedList linkedList = new LinkedList();
        InputStream inputStream2 = sVar2;
        for (f fVar : lVar.a()) {
            if (fVar.f7090b == 1 && fVar.f7091c == 1) {
                w byId = w.byId(fVar.f7089a);
                if (lVar.f7098a != null) {
                    int i11 = 0;
                    while (true) {
                        f[] fVarArr = lVar.f7098a;
                        if (i11 >= fVarArr.length) {
                            break;
                        } else if (fVarArr[i11] == fVar) {
                            j2 = lVar.f7103f[i11];
                            break;
                        } else {
                            i11++;
                        }
                    }
                    long j10 = j2;
                    inputStream2 = k.a(this.A, inputStream2, j10, fVar, this.Z, this.f7138c0);
                    linkedList.addFirst(new x(byId, ((d) k.f7096a.get(byId)).b(fVar)));
                }
                j2 = 0;
                long j102 = j2;
                inputStream2 = k.a(this.A, inputStream2, j102, fVar, this.Z, this.f7138c0);
                linkedList.addFirst(new x(byId, ((d) k.f7096a.get(byId)).b(fVar)));
            } else {
                fj.j.h("Multi input/output stream coders are not yet supported");
                return;
            }
        }
        nVar.a(linkedList);
        if (lVar.f7104g) {
            int i12 = rj.d.R;
            ?? cVar = new oj.c();
            cVar.f12780i = -1L;
            cVar.f12779h = new CRC32();
            cVar.f11054e = new oj.a(inputStream2);
            cVar.f12780i = lVar.b();
            cVar.f12781j = lVar.f7105h;
            inputStream2 = cVar.B0();
        }
        this.Y = inputStream2;
    }

    public final void J(ByteBuffer byteBuffer, t tVar) {
        long j2;
        String str;
        int i2;
        int i10;
        BitSet bitSet;
        boolean z10;
        boolean z11;
        int i11;
        int v10 = v(byteBuffer);
        if (v10 == 6) {
            long H = H(byteBuffer);
            if (H >= 0) {
                long j10 = 32 + H;
                if (j10 <= this.B.size() && j10 >= 0) {
                    tVar.f7124a = d(H(byteBuffer), "numPackStreams");
                    int v11 = v(byteBuffer);
                    if (v11 == 9) {
                        long j11 = 0;
                        j2 = 0;
                        for (int i12 = 0; i12 < tVar.f7124a; i12++) {
                            long H2 = H(byteBuffer);
                            j11 += H2;
                            long j12 = j10 + j11;
                            if (H2 < 0 || j12 > this.B.size() || j12 < H) {
                                throw new IOException("packSize (" + H2 + ") is out of range");
                            }
                        }
                        v11 = v(byteBuffer);
                    } else {
                        j2 = 0;
                    }
                    if (v11 == 10) {
                        long cardinality = w(tVar.f7124a, byteBuffer).cardinality() * 4;
                        if (K(byteBuffer, cardinality) >= cardinality) {
                            v11 = v(byteBuffer);
                        } else {
                            fj.j.h("invalid number of CRCs in PackInfo");
                            return;
                        }
                    }
                    if (v11 == 0) {
                        v10 = v(byteBuffer);
                    } else {
                        fj.j.h(w.d.m("Badly terminated PackInfo (", v11, ")"));
                        return;
                    }
                }
            }
            throw new IOException("packPos (" + H + ") is out of range");
        }
        j2 = 0;
        String str2 = "negative unpackSize";
        if (v10 != 7) {
            str = "negative unpackSize";
            i2 = 0;
        } else {
            int v12 = v(byteBuffer);
            if (v12 == 11) {
                tVar.f7129f = d(H(byteBuffer), "numFolders");
                if (v(byteBuffer) == 0) {
                    LinkedList<Integer> linkedList = new LinkedList();
                    int i13 = 0;
                    while (true) {
                        int i14 = tVar.f7129f;
                        if (i13 < i14) {
                            int d4 = d(H(byteBuffer), "numCoders");
                            if (d4 != 0) {
                                tVar.f7125b += d4;
                                long j13 = j2;
                                long j14 = j13;
                                int i15 = 0;
                                while (i15 < d4) {
                                    int v13 = v(byteBuffer);
                                    int i16 = v13 & 15;
                                    m(i16, byteBuffer);
                                    byteBuffer.get(new byte[i16]);
                                    if ((v13 & 16) == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if ((v13 & 32) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if ((v13 & 128) == 0) {
                                        if (z10) {
                                            j13++;
                                            j14++;
                                            i11 = d4;
                                        } else {
                                            i11 = d4;
                                            j13 += d(H(byteBuffer), "numInStreams");
                                            j14 += d(H(byteBuffer), "numOutStreams");
                                        }
                                        if (z11) {
                                            long d10 = d(H(byteBuffer), "propertiesSize");
                                            if (K(byteBuffer, d10) < d10) {
                                                fj.j.h("invalid propertiesSize in folder");
                                                return;
                                            }
                                        }
                                        i15++;
                                        d4 = i11;
                                    } else {
                                        fj.j.h("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                                        return;
                                    }
                                }
                                d(j13, "totalInStreams");
                                d(j14, "totalOutStreams");
                                tVar.f7126c += j14;
                                tVar.f7127d += j13;
                                if (j14 != j2) {
                                    int d11 = d(j14 - 1, "numBindPairs");
                                    long j15 = d11;
                                    if (j13 >= j15) {
                                        BitSet bitSet2 = new BitSet((int) j13);
                                        int i17 = 0;
                                        while (i17 < d11) {
                                            int i18 = i13;
                                            String str3 = str2;
                                            int d12 = d(H(byteBuffer), "inIndex");
                                            int i19 = d11;
                                            if (j13 > d12) {
                                                bitSet2.set(d12);
                                                if (j14 > d(H(byteBuffer), "outIndex")) {
                                                    i17++;
                                                    d11 = i19;
                                                    str2 = str3;
                                                    i13 = i18;
                                                } else {
                                                    fj.j.h("outIndex is bigger than number of outStreams");
                                                    return;
                                                }
                                            } else {
                                                fj.j.h("inIndex is bigger than number of inStreams");
                                                return;
                                            }
                                        }
                                        int i20 = i13;
                                        String str4 = str2;
                                        int d13 = d(j13 - j15, "numPackedStreams");
                                        if (d13 == 1) {
                                            if (bitSet2.nextClearBit(0) == -1) {
                                                fj.j.h("Couldn't find stream's bind pair index");
                                                return;
                                            }
                                        } else {
                                            for (int i21 = 0; i21 < d13; i21++) {
                                                if (d(H(byteBuffer), "packedStreamIndex") >= j13) {
                                                    fj.j.h("packedStreamIndex is bigger than number of totalInStreams");
                                                    return;
                                                }
                                            }
                                            continue;
                                        }
                                        linkedList.add(Integer.valueOf((int) j14));
                                        i13 = i20 + 1;
                                        str2 = str4;
                                    } else {
                                        fj.j.h("Total input streams can't be less than the number of bind pairs");
                                        return;
                                    }
                                } else {
                                    fj.j.h("Total output streams can't be 0");
                                    return;
                                }
                            } else {
                                fj.j.h("Folder without coders");
                                return;
                            }
                        } else {
                            str = str2;
                            i2 = 0;
                            if (tVar.f7127d - (tVar.f7126c - i14) >= tVar.f7124a) {
                                int v14 = v(byteBuffer);
                                if (v14 == 12) {
                                    for (Integer num : linkedList) {
                                        int intValue = num.intValue();
                                        for (int i22 = 0; i22 < intValue; i22++) {
                                            if (H(byteBuffer) < j2) {
                                                a0.j.h(str);
                                                return;
                                            }
                                        }
                                    }
                                    int v15 = v(byteBuffer);
                                    if (v15 == 10) {
                                        BitSet w10 = w(tVar.f7129f, byteBuffer);
                                        tVar.f7130g = w10;
                                        long cardinality2 = w10.cardinality() * 4;
                                        if (K(byteBuffer, cardinality2) >= cardinality2) {
                                            v15 = v(byteBuffer);
                                        } else {
                                            fj.j.h("invalid number of CRCs in UnpackInfo");
                                            return;
                                        }
                                    }
                                    if (v15 == 0) {
                                        v10 = v(byteBuffer);
                                    } else {
                                        fj.j.h("Badly terminated UnpackInfo");
                                        return;
                                    }
                                } else {
                                    fj.j.h(w.d.l(v14, "Expected kCodersUnpackSize, got "));
                                    return;
                                }
                            } else {
                                fj.j.h("archive doesn't contain enough packed streams");
                                return;
                            }
                        }
                    }
                } else {
                    fj.j.h("External unsupported");
                    return;
                }
            } else {
                fj.j.h(w.d.l(v12, "Expected kFolder, got "));
                return;
            }
        }
        if (v10 == 8) {
            int v16 = v(byteBuffer);
            LinkedList<Integer> linkedList2 = new LinkedList();
            if (v16 == 13) {
                for (int i23 = i2; i23 < tVar.f7129f; i23++) {
                    linkedList2.add(Integer.valueOf(d(H(byteBuffer), "numStreams")));
                }
                tVar.f7128e = linkedList2.stream().mapToLong(new Object()).sum();
                v16 = v(byteBuffer);
            } else {
                tVar.f7128e = tVar.f7129f;
            }
            d(tVar.f7128e, "totalUnpackStreams");
            if (v16 == 9) {
                for (Integer num2 : linkedList2) {
                    int intValue2 = num2.intValue();
                    if (intValue2 != 0) {
                        for (int i24 = i2; i24 < intValue2 - 1; i24++) {
                            if (H(byteBuffer) < j2) {
                                fj.j.h(str);
                                return;
                            }
                        }
                        continue;
                    }
                }
                v16 = v(byteBuffer);
            }
            if (linkedList2.isEmpty()) {
                BitSet bitSet3 = tVar.f7130g;
                i10 = tVar.f7129f;
                if (bitSet3 != null) {
                    i10 -= bitSet3.cardinality();
                }
            } else {
                int i25 = i2;
                for (Integer num3 : linkedList2) {
                    int intValue3 = num3.intValue();
                    if (intValue3 == 1 && (bitSet = tVar.f7130g) != null) {
                        int i26 = i2 + 1;
                        if (!bitSet.get(i2)) {
                            i2 = i26;
                        } else {
                            i2 = i26;
                        }
                    }
                    i25 += intValue3;
                }
                i10 = i25;
            }
            if (v16 == 10) {
                d(i10, "numDigests");
                long cardinality3 = w(i10, byteBuffer).cardinality() * 4;
                if (K(byteBuffer, cardinality3) >= cardinality3) {
                    v16 = v(byteBuffer);
                } else {
                    fj.j.h("invalid number of missing CRCs in SubStreamInfo");
                    return;
                }
            }
            if (v16 == 0) {
                v10 = v(byteBuffer);
            } else {
                fj.j.h("Badly terminated SubStreamsInfo");
                return;
            }
        }
        if (v10 == 0) {
            return;
        }
        fj.j.h("Badly terminated StreamsInfo");
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
        if ((r14 - r8) != ((ij.n[]) r3.f3670h)[r17.R].f7122o) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (java.lang.Math.max(0L, r12.L - r12.i()) != ((ij.n[]) r3.f3670h)[r17.R].f7122o) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Type inference failed for: r0v3, types: [oj.c, rj.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [oj.c, rj.c] */
    /* JADX WARN: Type inference failed for: r5v10, types: [oj.c, rj.c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [oj.c, rj.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.v.i(int, boolean):void");
    }

    public final String toString() {
        return this.L.toString();
    }
}
