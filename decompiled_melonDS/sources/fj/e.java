package fj;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements g, f, Cloneable, ByteChannel {
    public b0 A;
    public long B;

    @Override // fj.e0
    public final void A(e eVar, long j2) {
        b0 b0Var;
        b0 b0Var2;
        b0 b10;
        int i2;
        eVar.getClass();
        if (eVar != this) {
            d0.d.K(eVar.B, 0L, j2);
            while (j2 > 0) {
                b0 b0Var3 = eVar.A;
                b0Var3.getClass();
                int i10 = b0Var3.f4978c;
                eVar.A.getClass();
                int i11 = (j2 > (i10 - b0Var.f4977b) ? 1 : (j2 == (i10 - b0Var.f4977b) ? 0 : -1));
                int i12 = 0;
                if (i11 < 0) {
                    b0 b0Var4 = this.A;
                    if (b0Var4 != null) {
                        b0Var2 = b0Var4.f4982g;
                    } else {
                        b0Var2 = null;
                    }
                    if (b0Var2 != null && b0Var2.f4980e) {
                        long j10 = b0Var2.f4978c + j2;
                        if (b0Var2.f4979d) {
                            i2 = 0;
                        } else {
                            i2 = b0Var2.f4977b;
                        }
                        if (j10 - i2 <= 8192) {
                            b0 b0Var5 = eVar.A;
                            b0Var5.getClass();
                            b0Var5.d(b0Var2, (int) j2);
                            eVar.B -= j2;
                            this.B += j2;
                            return;
                        }
                    }
                    b0 b0Var6 = eVar.A;
                    b0Var6.getClass();
                    int i13 = (int) j2;
                    if (i13 > 0 && i13 <= b0Var6.f4978c - b0Var6.f4977b) {
                        if (i13 >= 1024) {
                            b10 = b0Var6.c();
                        } else {
                            b10 = c0.b();
                            byte[] bArr = b0Var6.f4976a;
                            byte[] bArr2 = b10.f4976a;
                            int i14 = b0Var6.f4977b;
                            zb.k.k(bArr, bArr2, 0, i14, i14 + i13, 2);
                        }
                        b10.f4978c = b10.f4977b + i13;
                        b0Var6.f4977b += i13;
                        b0 b0Var7 = b0Var6.f4982g;
                        b0Var7.getClass();
                        b0Var7.b(b10);
                        eVar.A = b10;
                    } else {
                        a0.j.h("byteCount out of range");
                        return;
                    }
                }
                b0 b0Var8 = eVar.A;
                b0Var8.getClass();
                long j11 = b0Var8.f4978c - b0Var8.f4977b;
                eVar.A = b0Var8.a();
                b0 b0Var9 = this.A;
                if (b0Var9 == null) {
                    this.A = b0Var8;
                    b0Var8.f4982g = b0Var8;
                    b0Var8.f4981f = b0Var8;
                } else {
                    b0 b0Var10 = b0Var9.f4982g;
                    b0Var10.getClass();
                    b0Var10.b(b0Var8);
                    b0 b0Var11 = b0Var8.f4982g;
                    if (b0Var11 != b0Var8) {
                        b0Var11.getClass();
                        if (b0Var11.f4980e) {
                            int i15 = b0Var8.f4978c - b0Var8.f4977b;
                            b0 b0Var12 = b0Var8.f4982g;
                            b0Var12.getClass();
                            int i16 = 8192 - b0Var12.f4978c;
                            b0 b0Var13 = b0Var8.f4982g;
                            b0Var13.getClass();
                            if (!b0Var13.f4979d) {
                                b0 b0Var14 = b0Var8.f4982g;
                                b0Var14.getClass();
                                i12 = b0Var14.f4977b;
                            }
                            if (i15 <= i16 + i12) {
                                b0 b0Var15 = b0Var8.f4982g;
                                b0Var15.getClass();
                                b0Var8.d(b0Var15, i15);
                                b0Var8.a();
                                c0.a(b0Var8);
                            }
                        }
                    } else {
                        a0.j.p("cannot compact");
                        return;
                    }
                }
                eVar.B -= j11;
                this.B += j11;
                j2 -= j11;
            }
            return;
        }
        a0.j.h("source == this");
    }

    public final byte B(long j2) {
        d0.d.K(this.B, j2, 1L);
        b0 b0Var = this.A;
        b0Var.getClass();
        long j10 = this.B;
        if (j10 - j2 < j2) {
            while (j10 > j2) {
                b0Var = b0Var.f4982g;
                b0Var.getClass();
                j10 -= b0Var.f4978c - b0Var.f4977b;
            }
            return b0Var.f4976a[(int) ((b0Var.f4977b + j2) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i2 = b0Var.f4978c;
            int i10 = b0Var.f4977b;
            long j12 = (i2 - i10) + j11;
            if (j12 <= j2) {
                b0Var = b0Var.f4981f;
                b0Var.getClass();
                j11 = j12;
            } else {
                return b0Var.f4976a[(int) ((i10 + j2) - j11)];
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [fj.e, java.lang.Object] */
    @Override // fj.g
    public final String D(long j2) {
        if (j2 >= 0) {
            long j10 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j10 = j2 + 1;
            }
            long j11 = j10;
            long F = F((byte) 10, 0L, j11);
            if (F != -1) {
                return gj.a.c(this, F);
            }
            if (j11 < this.B && B(j11 - 1) == 13 && B(j11) == 10) {
                return gj.a.c(this, j11);
            }
            ?? obj = new Object();
            w(obj, 0L, Math.min(32, this.B));
            long min = Math.min(this.B, j2);
            String e6 = obj.o(obj.B).e();
            throw new EOFException("\\n not found: limit=" + min + " content=" + e6 + (char) 8230);
        }
        a0.j.e(kc.a.e(j2, "limit < 0: "));
        return null;
    }

    public final long F(byte b10, long j2, long j10) {
        b0 b0Var;
        long j11 = 0;
        if (0 <= j2 && j2 <= j10) {
            long j12 = this.B;
            if (j10 > j12) {
                j10 = j12;
            }
            if (j2 != j10 && (b0Var = this.A) != null) {
                if (j12 - j2 < j2) {
                    while (j12 > j2) {
                        b0Var = b0Var.f4982g;
                        b0Var.getClass();
                        j12 -= b0Var.f4978c - b0Var.f4977b;
                    }
                    while (j12 < j10) {
                        byte[] bArr = b0Var.f4976a;
                        int min = (int) Math.min(b0Var.f4978c, (b0Var.f4977b + j10) - j12);
                        for (int i2 = (int) ((b0Var.f4977b + j2) - j12); i2 < min; i2++) {
                            if (bArr[i2] == b10) {
                                return (i2 - b0Var.f4977b) + j12;
                            }
                        }
                        j12 += b0Var.f4978c - b0Var.f4977b;
                        b0Var = b0Var.f4981f;
                        b0Var.getClass();
                        j2 = j12;
                    }
                    return -1L;
                }
                while (true) {
                    long j13 = (b0Var.f4978c - b0Var.f4977b) + j11;
                    if (j13 > j2) {
                        break;
                    }
                    b0Var = b0Var.f4981f;
                    b0Var.getClass();
                    j11 = j13;
                }
                while (j11 < j10) {
                    byte[] bArr2 = b0Var.f4976a;
                    int min2 = (int) Math.min(b0Var.f4978c, (b0Var.f4977b + j10) - j11);
                    for (int i10 = (int) ((b0Var.f4977b + j2) - j11); i10 < min2; i10++) {
                        if (bArr2[i10] == b10) {
                            return (i10 - b0Var.f4977b) + j11;
                        }
                    }
                    j11 += b0Var.f4978c - b0Var.f4977b;
                    b0Var = b0Var.f4981f;
                    b0Var.getClass();
                    j2 = j11;
                }
                return -1L;
            }
            return -1L;
        }
        long j14 = this.B;
        throw new IllegalArgumentException(("size=" + j14 + " fromIndex=" + j2 + " toIndex=" + j10).toString());
    }

    public final long G(h hVar) {
        int i2;
        int i10;
        hVar.getClass();
        b0 b0Var = this.A;
        if (b0Var != null) {
            long j2 = this.B;
            long j10 = 0;
            if (j2 < 0) {
                while (j2 > 0) {
                    b0Var = b0Var.f4982g;
                    b0Var.getClass();
                    j2 -= b0Var.f4978c - b0Var.f4977b;
                }
                if (hVar.d() == 2) {
                    byte i11 = hVar.i(0);
                    byte i12 = hVar.i(1);
                    while (j2 < this.B) {
                        byte[] bArr = b0Var.f4976a;
                        i2 = (int) ((b0Var.f4977b + j10) - j2);
                        int i13 = b0Var.f4978c;
                        while (i2 < i13) {
                            byte b10 = bArr[i2];
                            if (b10 != i11 && b10 != i12) {
                                i2++;
                            }
                            i10 = b0Var.f4977b;
                        }
                        j10 = (b0Var.f4978c - b0Var.f4977b) + j2;
                        b0Var = b0Var.f4981f;
                        b0Var.getClass();
                        j2 = j10;
                    }
                    return -1L;
                }
                byte[] h2 = hVar.h();
                while (j2 < this.B) {
                    byte[] bArr2 = b0Var.f4976a;
                    i2 = (int) ((b0Var.f4977b + j10) - j2);
                    int i14 = b0Var.f4978c;
                    while (i2 < i14) {
                        byte b11 = bArr2[i2];
                        for (byte b12 : h2) {
                            if (b11 == b12) {
                                i10 = b0Var.f4977b;
                            }
                        }
                        i2++;
                    }
                    j10 = (b0Var.f4978c - b0Var.f4977b) + j2;
                    b0Var = b0Var.f4981f;
                    b0Var.getClass();
                    j2 = j10;
                }
                return -1L;
            }
            j2 = 0;
            while (true) {
                long j11 = (b0Var.f4978c - b0Var.f4977b) + j2;
                if (j11 > 0) {
                    break;
                }
                b0Var = b0Var.f4981f;
                b0Var.getClass();
                j2 = j11;
            }
            if (hVar.d() == 2) {
                byte i15 = hVar.i(0);
                byte i16 = hVar.i(1);
                while (j2 < this.B) {
                    byte[] bArr3 = b0Var.f4976a;
                    i2 = (int) ((b0Var.f4977b + j10) - j2);
                    int i17 = b0Var.f4978c;
                    while (i2 < i17) {
                        byte b13 = bArr3[i2];
                        if (b13 != i15 && b13 != i16) {
                            i2++;
                        }
                        i10 = b0Var.f4977b;
                    }
                    j10 = (b0Var.f4978c - b0Var.f4977b) + j2;
                    b0Var = b0Var.f4981f;
                    b0Var.getClass();
                    j2 = j10;
                }
                return -1L;
            }
            byte[] h10 = hVar.h();
            while (j2 < this.B) {
                byte[] bArr4 = b0Var.f4976a;
                i2 = (int) ((b0Var.f4977b + j10) - j2);
                int i18 = b0Var.f4978c;
                while (i2 < i18) {
                    byte b14 = bArr4[i2];
                    for (byte b15 : h10) {
                        if (b14 == b15) {
                            i10 = b0Var.f4977b;
                        }
                    }
                    i2++;
                }
                j10 = (b0Var.f4978c - b0Var.f4977b) + j2;
                b0Var = b0Var.f4981f;
                b0Var.getClass();
                j2 = j10;
            }
            return -1L;
            return (i2 - i10) + j2;
        }
        return -1L;
    }

    public final boolean H(long j2, h hVar, int i2) {
        hVar.getClass();
        if (i2 >= 0 && j2 >= 0 && i2 + j2 <= this.B && i2 <= hVar.d()) {
            if (i2 == 0 || gj.a.a(this, hVar, j2, j2 + 1, i2) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final byte[] I(long j2) {
        if (j2 >= 0 && j2 <= 2147483647L) {
            if (this.B >= j2) {
                int i2 = (int) j2;
                byte[] bArr = new byte[i2];
                int i10 = 0;
                while (i10 < i2) {
                    int read = read(bArr, i10, i2 - i10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        a0.j.c();
                        return null;
                    }
                }
                return bArr;
            }
            a0.j.c();
            return null;
        }
        a0.j.e(kc.a.e(j2, "byteCount: "));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
        r3 = r19.B - r1;
        r19.B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (r2 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r1 >= r14) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r3 == r17) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
        if (r2 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + d0.d.h0(B(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
        a0.j.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
        if (r2 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
        return -r8;
     */
    /* JADX WARN: Type inference failed for: r1v15, types: [fj.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long J() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.e.J():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[EDGE_INSN: B:41:0x008d->B:37:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [fj.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K() {
        /*
            r14 = this;
            long r0 = r14.B
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            fj.b0 r6 = r14.A
            r6.getClass()
            byte[] r7 = r6.f4976a
            int r8 = r6.f4977b
            int r9 = r6.f4978c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            fj.e r0 = new fj.e
            r0.<init>()
            r0.g0(r4)
            r0.e0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.Y()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = d0.d.h0(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r8 != r9) goto L85
            fj.b0 r7 = r6.a()
            r14.A = r7
            fj.c0.a(r6)
            goto L87
        L85:
            r6.f4977b = r8
        L87:
            if (r1 != 0) goto L8d
            fj.b0 r6 = r14.A
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.B
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.B = r1
            return r4
        L94:
            a0.j.c()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.e.K():long");
    }

    public final short L() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // fj.f
    public final /* bridge */ /* synthetic */ f M(int i2, byte[] bArr) {
        b0(i2, bArr);
        return this;
    }

    @Override // fj.g
    public final void O(long j2) {
        if (this.B >= j2) {
            return;
        }
        a0.j.c();
    }

    @Override // fj.f
    public final /* bridge */ /* synthetic */ f P(String str) {
        k0(str);
        return this;
    }

    @Override // fj.f
    public final /* bridge */ /* synthetic */ f Q(long j2) {
        f0(j2);
        return this;
    }

    @Override // fj.g
    public final String S(Charset charset) {
        charset.getClass();
        return X(this.B, charset);
    }

    @Override // fj.g
    public final InputStream U() {
        return new d(this, 0);
    }

    @Override // fj.g
    public final int V(v vVar) {
        vVar.getClass();
        int d4 = gj.a.d(this, vVar, false);
        if (d4 == -1) {
            return -1;
        }
        skip(vVar.A[d4].d());
        return d4;
    }

    @Override // fj.g
    public final long W(f fVar) {
        long j2 = this.B;
        if (j2 > 0) {
            fVar.A(this, j2);
        }
        return j2;
    }

    public final String X(long j2, Charset charset) {
        charset.getClass();
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0 && j2 <= 2147483647L) {
            if (this.B >= j2) {
                if (i2 == 0) {
                    return "";
                }
                b0 b0Var = this.A;
                b0Var.getClass();
                int i10 = b0Var.f4977b;
                if (i10 + j2 > b0Var.f4978c) {
                    return new String(I(j2), charset);
                }
                int i11 = (int) j2;
                String str = new String(b0Var.f4976a, i10, i11, charset);
                int i12 = b0Var.f4977b + i11;
                b0Var.f4977b = i12;
                this.B -= j2;
                if (i12 == b0Var.f4978c) {
                    this.A = b0Var.a();
                    c0.a(b0Var);
                }
                return str;
            }
            a0.j.c();
            return null;
        }
        a0.j.e(kc.a.e(j2, "byteCount: "));
        return null;
    }

    public final String Y() {
        return X(this.B, vc.a.f13781a);
    }

    public final h Z(int i2) {
        if (i2 == 0) {
            return h.R;
        }
        d0.d.K(this.B, 0L, i2);
        b0 b0Var = this.A;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            b0Var.getClass();
            int i13 = b0Var.f4978c;
            int i14 = b0Var.f4977b;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                b0Var = b0Var.f4981f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12];
        int[] iArr = new int[i12 * 2];
        b0 b0Var2 = this.A;
        int i15 = 0;
        while (i10 < i2) {
            b0Var2.getClass();
            bArr[i15] = b0Var2.f4976a;
            i10 += b0Var2.f4978c - b0Var2.f4977b;
            iArr[i15] = Math.min(i10, i2);
            iArr[i15 + i12] = b0Var2.f4977b;
            b0Var2.f4979d = true;
            i15++;
            b0Var2 = b0Var2.f4981f;
        }
        return new d0(bArr, iArr);
    }

    public final b0 a0(int i2) {
        if (i2 >= 1 && i2 <= 8192) {
            b0 b0Var = this.A;
            if (b0Var == null) {
                b0 b10 = c0.b();
                this.A = b10;
                b10.f4982g = b10;
                b10.f4981f = b10;
                return b10;
            }
            b0 b0Var2 = b0Var.f4982g;
            b0Var2.getClass();
            if (b0Var2.f4978c + i2 <= 8192 && b0Var2.f4980e) {
                return b0Var2;
            }
            b0 b11 = c0.b();
            b0Var2.b(b11);
            return b11;
        }
        a0.j.h("unexpected capacity");
        return null;
    }

    public final void b0(int i2, byte[] bArr) {
        bArr.getClass();
        int i10 = 0;
        long j2 = i2;
        d0.d.K(bArr.length, 0, j2);
        while (i10 < i2) {
            b0 a02 = a0(1);
            int min = Math.min(i2 - i10, 8192 - a02.f4978c);
            int i11 = i10 + min;
            zb.k.f(a02.f4978c, i10, i11, bArr, a02.f4976a);
            a02.f4978c += min;
            i10 = i11;
        }
        this.B += j2;
    }

    public final void c0(h hVar) {
        hVar.getClass();
        hVar.s(this, hVar.d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fj.e, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.B == 0) {
            return obj;
        }
        b0 b0Var = this.A;
        b0Var.getClass();
        b0 c4 = b0Var.c();
        obj.A = c4;
        c4.f4982g = c4;
        c4.f4981f = c4;
        for (b0 b0Var2 = b0Var.f4981f; b0Var2 != b0Var; b0Var2 = b0Var2.f4981f) {
            b0 b0Var3 = c4.f4982g;
            b0Var3.getClass();
            b0Var2.getClass();
            b0Var3.b(b0Var2.c());
        }
        obj.B = this.B;
        return obj;
    }

    public final void d0(g0 g0Var) {
        g0Var.getClass();
        do {
        } while (g0Var.k(this, 8192L) != -1);
    }

    public final void e0(int i2) {
        b0 a02 = a0(1);
        byte[] bArr = a02.f4976a;
        int i10 = a02.f4978c;
        a02.f4978c = i10 + 1;
        bArr[i10] = (byte) i2;
        this.B++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        long j2 = this.B;
        e eVar = (e) obj;
        if (j2 != eVar.B) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        b0 b0Var = this.A;
        b0Var.getClass();
        b0 b0Var2 = eVar.A;
        b0Var2.getClass();
        int i2 = b0Var.f4977b;
        int i10 = b0Var2.f4977b;
        long j10 = 0;
        while (j10 < this.B) {
            long min = Math.min(b0Var.f4978c - i2, b0Var2.f4978c - i10);
            long j11 = 0;
            while (j11 < min) {
                int i11 = i2 + 1;
                int i12 = i10 + 1;
                if (b0Var.f4976a[i2] != b0Var2.f4976a[i10]) {
                    return false;
                }
                j11++;
                i2 = i11;
                i10 = i12;
            }
            if (i2 == b0Var.f4978c) {
                b0Var = b0Var.f4981f;
                b0Var.getClass();
                i2 = b0Var.f4977b;
            }
            if (i10 == b0Var2.f4978c) {
                b0Var2 = b0Var2.f4981f;
                b0Var2.getClass();
                i10 = b0Var2.f4977b;
            }
            j10 += min;
        }
        return true;
    }

    @Override // fj.g0
    public final i0 f() {
        return i0.f4986d;
    }

    public final void f0(long j2) {
        boolean z10;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            e0(48);
            return;
        }
        int i10 = 0;
        if (i2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                k0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        byte[] bArr = gj.a.f5681a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j2)) * 10) >>> 5;
        if (j2 > gj.a.f5682b[numberOfLeadingZeros]) {
            i10 = 1;
        }
        int i11 = numberOfLeadingZeros + i10;
        if (z10) {
            i11++;
        }
        b0 a02 = a0(i11);
        byte[] bArr2 = a02.f4976a;
        int i12 = a02.f4978c + i11;
        while (j2 != 0) {
            long j10 = 10;
            i12--;
            bArr2[i12] = gj.a.f5681a[(int) (j2 % j10)];
            j2 /= j10;
        }
        if (z10) {
            bArr2[i12 - 1] = 45;
        }
        a02.f4978c += i11;
        this.B += i11;
    }

    public final void g0(long j2) {
        if (j2 == 0) {
            e0(48);
            return;
        }
        long j10 = (j2 >>> 1) | j2;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i2 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        b0 a02 = a0(i2);
        byte[] bArr = a02.f4976a;
        int i10 = a02.f4978c;
        for (int i11 = (i10 + i2) - 1; i11 >= i10; i11--) {
            bArr[i11] = gj.a.f5681a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        a02.f4978c += i2;
        this.B += i2;
    }

    public final void h0(int i2) {
        b0 a02 = a0(4);
        byte[] bArr = a02.f4976a;
        int i10 = a02.f4978c;
        bArr[i10] = (byte) ((i2 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i2 & 255);
        a02.f4978c = i10 + 4;
        this.B += 4;
    }

    public final int hashCode() {
        b0 b0Var = this.A;
        if (b0Var == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i10 = b0Var.f4978c;
            for (int i11 = b0Var.f4977b; i11 < i10; i11++) {
                i2 = (i2 * 31) + b0Var.f4976a[i11];
            }
            b0Var = b0Var.f4981f;
            b0Var.getClass();
        } while (b0Var != this.A);
        return i2;
    }

    public final void i0(int i2) {
        b0 a02 = a0(2);
        byte[] bArr = a02.f4976a;
        int i10 = a02.f4978c;
        bArr[i10] = (byte) ((i2 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i2 & 255);
        a02.f4978c = i10 + 2;
        this.B += 2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i2, int i10, String str) {
        char charAt;
        char c4;
        str.getClass();
        if (i2 >= 0) {
            if (i10 >= i2) {
                if (i10 <= str.length()) {
                    while (i2 < i10) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 128) {
                            b0 a02 = a0(1);
                            byte[] bArr = a02.f4976a;
                            int i11 = a02.f4978c - i2;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i2 + 1;
                            bArr[i2 + i11] = (byte) charAt2;
                            while (true) {
                                i2 = i12;
                                if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                                    break;
                                }
                                i12 = i2 + 1;
                                bArr[i2 + i11] = (byte) charAt;
                            }
                            int i13 = a02.f4978c;
                            int i14 = (i11 + i2) - i13;
                            a02.f4978c = i13 + i14;
                            this.B += i14;
                        } else {
                            if (charAt2 < 2048) {
                                b0 a03 = a0(2);
                                byte[] bArr2 = a03.f4976a;
                                int i15 = a03.f4978c;
                                bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                                a03.f4978c = i15 + 2;
                                this.B += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i16 = i2 + 1;
                                if (i16 < i10) {
                                    c4 = str.charAt(i16);
                                } else {
                                    c4 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c4 && c4 < 57344) {
                                    int i17 = (((charAt2 & 1023) << 10) | (c4 & 1023)) + 65536;
                                    b0 a04 = a0(4);
                                    byte[] bArr3 = a04.f4976a;
                                    int i18 = a04.f4978c;
                                    bArr3[i18] = (byte) ((i17 >> 18) | 240);
                                    bArr3[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                                    bArr3[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                                    bArr3[i18 + 3] = (byte) ((i17 & 63) | 128);
                                    a04.f4978c = i18 + 4;
                                    this.B += 4;
                                    i2 += 2;
                                } else {
                                    e0(63);
                                    i2 = i16;
                                }
                            } else {
                                b0 a05 = a0(3);
                                byte[] bArr4 = a05.f4976a;
                                int i19 = a05.f4978c;
                                bArr4[i19] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i19 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i19 + 2] = (byte) ((charAt2 & '?') | 128);
                                a05.f4978c = i19 + 3;
                                this.B += 3;
                            }
                            i2++;
                        }
                    }
                    return;
                }
                StringBuilder i20 = kc.a.i("endIndex > string.length: ", i10, " > ");
                i20.append(str.length());
                throw new IllegalArgumentException(i20.toString().toString());
            }
            a0.j.e(kc.a.d(i10, i2, "endIndex < beginIndex: ", " < "));
            return;
        }
        a0.j.e(w.d.l(i2, "beginIndex < 0: "));
    }

    @Override // fj.g0
    public final long k(e eVar, long j2) {
        eVar.getClass();
        if (j2 >= 0) {
            long j10 = this.B;
            if (j10 == 0) {
                return -1L;
            }
            if (j2 > j10) {
                j2 = j10;
            }
            eVar.A(this, j2);
            return j2;
        }
        a0.j.e(kc.a.e(j2, "byteCount < 0: "));
        return 0L;
    }

    public final void k0(String str) {
        str.getClass();
        j0(0, str.length(), str);
    }

    public final void l0(int i2) {
        if (i2 < 128) {
            e0(i2);
        } else if (i2 < 2048) {
            b0 a02 = a0(2);
            byte[] bArr = a02.f4976a;
            int i10 = a02.f4978c;
            bArr[i10] = (byte) ((i2 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i2 & 63) | 128);
            a02.f4978c = i10 + 2;
            this.B += 2;
        } else if (55296 <= i2 && i2 < 57344) {
            e0(63);
        } else if (i2 < 65536) {
            b0 a03 = a0(3);
            byte[] bArr2 = a03.f4976a;
            int i11 = a03.f4978c;
            bArr2[i11] = (byte) ((i2 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i2 & 63) | 128);
            a03.f4978c = i11 + 3;
            this.B += 3;
        } else if (i2 <= 1114111) {
            b0 a04 = a0(4);
            byte[] bArr3 = a04.f4976a;
            int i12 = a04.f4978c;
            bArr3[i12] = (byte) ((i2 >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((i2 & 63) | 128);
            a04.f4978c = i12 + 4;
            this.B += 4;
        } else {
            a0.j.h("Unexpected code point: 0x".concat(d0.d.i0(i2)));
        }
    }

    @Override // fj.g
    public final h o(long j2) {
        if (j2 >= 0 && j2 <= 2147483647L) {
            if (this.B >= j2) {
                if (j2 >= 4096) {
                    h Z = Z((int) j2);
                    skip(j2);
                    return Z;
                }
                return new h(I(j2));
            }
            a0.j.c();
            return null;
        }
        a0.j.e(kc.a.e(j2, "byteCount: "));
        return null;
    }

    @Override // fj.f
    public final /* bridge */ /* synthetic */ f p(h hVar) {
        c0(hVar);
        return this;
    }

    public final int read(byte[] bArr, int i2, int i10) {
        d0.d.K(bArr.length, i2, i10);
        b0 b0Var = this.A;
        if (b0Var == null) {
            return -1;
        }
        int min = Math.min(i10, b0Var.f4978c - b0Var.f4977b);
        byte[] bArr2 = b0Var.f4976a;
        int i11 = b0Var.f4977b;
        zb.k.f(i2, i11, i11 + min, bArr2, bArr);
        int i12 = b0Var.f4977b + min;
        b0Var.f4977b = i12;
        this.B -= min;
        if (i12 == b0Var.f4978c) {
            this.A = b0Var.a();
            c0.a(b0Var);
        }
        return min;
    }

    @Override // fj.g
    public final byte readByte() {
        if (this.B != 0) {
            b0 b0Var = this.A;
            b0Var.getClass();
            int i2 = b0Var.f4977b;
            int i10 = b0Var.f4978c;
            int i11 = i2 + 1;
            byte b10 = b0Var.f4976a[i2];
            this.B--;
            if (i11 == i10) {
                this.A = b0Var.a();
                c0.a(b0Var);
                return b10;
            }
            b0Var.f4977b = i11;
            return b10;
        }
        a0.j.c();
        return (byte) 0;
    }

    @Override // fj.g
    public final int readInt() {
        if (this.B >= 4) {
            b0 b0Var = this.A;
            b0Var.getClass();
            int i2 = b0Var.f4977b;
            int i10 = b0Var.f4978c;
            if (i10 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = b0Var.f4976a;
            int i11 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
            int i12 = i2 + 3;
            int i13 = i2 + 4;
            int i14 = (bArr[i12] & 255) | i11 | ((bArr[i2 + 2] & 255) << 8);
            this.B -= 4;
            if (i13 == i10) {
                this.A = b0Var.a();
                c0.a(b0Var);
                return i14;
            }
            b0Var.f4977b = i13;
            return i14;
        }
        a0.j.c();
        return 0;
    }

    @Override // fj.g
    public final short readShort() {
        if (this.B >= 2) {
            b0 b0Var = this.A;
            b0Var.getClass();
            int i2 = b0Var.f4977b;
            int i10 = b0Var.f4978c;
            if (i10 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = b0Var.f4976a;
            int i11 = i2 + 1;
            int i12 = i2 + 2;
            int i13 = (bArr[i11] & 255) | ((bArr[i2] & 255) << 8);
            this.B -= 2;
            if (i12 == i10) {
                this.A = b0Var.a();
                c0.a(b0Var);
            } else {
                b0Var.f4977b = i12;
            }
            return (short) i13;
        }
        a0.j.c();
        return (short) 0;
    }

    @Override // fj.g
    public final boolean s(long j2) {
        if (this.B >= j2) {
            return true;
        }
        return false;
    }

    @Override // fj.g
    public final void skip(long j2) {
        while (j2 > 0) {
            b0 b0Var = this.A;
            if (b0Var != null) {
                int min = (int) Math.min(j2, b0Var.f4978c - b0Var.f4977b);
                long j10 = min;
                this.B -= j10;
                j2 -= j10;
                int i2 = b0Var.f4977b + min;
                b0Var.f4977b = i2;
                if (i2 == b0Var.f4978c) {
                    this.A = b0Var.a();
                    c0.a(b0Var);
                }
            } else {
                a0.j.c();
                return;
            }
        }
    }

    public final void t() {
        skip(this.B);
    }

    public final String toString() {
        long j2 = this.B;
        if (j2 <= 2147483647L) {
            return Z((int) j2).toString();
        }
        long j10 = this.B;
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + j10).toString());
    }

    public final long v() {
        long j2 = this.B;
        if (j2 == 0) {
            return 0L;
        }
        b0 b0Var = this.A;
        b0Var.getClass();
        b0 b0Var2 = b0Var.f4982g;
        b0Var2.getClass();
        int i2 = b0Var2.f4978c;
        if (i2 < 8192 && b0Var2.f4980e) {
            return j2 - (i2 - b0Var2.f4977b);
        }
        return j2;
    }

    public final void w(e eVar, long j2, long j10) {
        eVar.getClass();
        long j11 = j2;
        d0.d.K(this.B, j11, j10);
        if (j10 != 0) {
            eVar.B += j10;
            b0 b0Var = this.A;
            while (true) {
                b0Var.getClass();
                long j12 = b0Var.f4978c - b0Var.f4977b;
                if (j11 < j12) {
                    break;
                }
                j11 -= j12;
                b0Var = b0Var.f4981f;
            }
            b0 b0Var2 = b0Var;
            long j13 = j10;
            while (j13 > 0) {
                b0Var2.getClass();
                b0 c4 = b0Var2.c();
                int i2 = c4.f4977b + ((int) j11);
                c4.f4977b = i2;
                c4.f4978c = Math.min(i2 + ((int) j13), c4.f4978c);
                b0 b0Var3 = eVar.A;
                if (b0Var3 == null) {
                    c4.f4982g = c4;
                    c4.f4981f = c4;
                    eVar.A = c4;
                } else {
                    b0 b0Var4 = b0Var3.f4982g;
                    b0Var4.getClass();
                    b0Var4.b(c4);
                }
                j13 -= c4.f4978c - c4.f4977b;
                b0Var2 = b0Var2.f4981f;
                j11 = 0;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            b0 a02 = a0(1);
            int min = Math.min(i2, 8192 - a02.f4978c);
            byteBuffer.get(a02.f4976a, a02.f4978c, min);
            i2 -= min;
            a02.f4978c += min;
        }
        this.B += remaining;
        return remaining;
    }

    @Override // fj.f
    public final /* bridge */ /* synthetic */ f writeByte(int i2) {
        e0(i2);
        return this;
    }

    @Override // fj.f
    public final /* bridge */ /* synthetic */ f writeInt(int i2) {
        h0(i2);
        return this;
    }

    @Override // fj.f
    public final /* bridge */ /* synthetic */ f writeShort(int i2) {
        i0(i2);
        return this;
    }

    public final boolean z() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    @Override // fj.g
    public final e b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, fj.e0
    public final void close() {
    }

    @Override // fj.f, fj.e0, java.io.Flushable
    public final void flush() {
    }

    @Override // fj.f
    public final f write(byte[] bArr) {
        bArr.getClass();
        b0(bArr.length, bArr);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        b0 b0Var = this.A;
        if (b0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), b0Var.f4978c - b0Var.f4977b);
        byteBuffer.put(b0Var.f4976a, b0Var.f4977b, min);
        int i2 = b0Var.f4977b + min;
        b0Var.f4977b = i2;
        this.B -= min;
        if (i2 == b0Var.f4978c) {
            this.A = b0Var.a();
            c0.a(b0Var);
        }
        return min;
    }
}
