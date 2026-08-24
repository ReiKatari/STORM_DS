package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl6  reason: default package */
/* loaded from: classes.dex */
public final class zl6 implements Iterable, zf3 {
    public static final zl6 X = new zl6(0, 0, 0, null);
    public final long A;
    public final long B;
    public final long L;
    public final long[] R;

    public zl6(long j, long j2, long j3, long[] jArr) {
        this.A = j;
        this.B = j2;
        this.L = j3;
        this.R = jArr;
    }

    public final zl6 a(zl6 zl6Var) {
        long[] jArr;
        zl6 zl6Var2 = this;
        zl6 zl6Var3 = X;
        if (zl6Var == zl6Var3) {
            return zl6Var2;
        }
        if (zl6Var2 == zl6Var3) {
            return zl6Var3;
        }
        long j = zl6Var.L;
        long j2 = zl6Var.L;
        long[] jArr2 = zl6Var.R;
        long j3 = zl6Var.B;
        long j4 = zl6Var.A;
        long j5 = zl6Var2.L;
        if (j == j5 && jArr2 == (jArr = zl6Var2.R)) {
            return new zl6(zl6Var2.A & (~j4), zl6Var2.B & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                zl6Var2 = zl6Var2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    zl6Var2 = zl6Var2.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    zl6Var2 = zl6Var2.b(i2 + j2 + 64);
                }
            }
        }
        return zl6Var2;
    }

    public final zl6 b(long j) {
        long[] jArr;
        int k;
        long[] jArr2;
        long j2 = j - this.L;
        if (nb3.q(j2, 0L) >= 0 && nb3.q(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.B;
            if ((j4 & j3) != 0) {
                return new zl6(this.A, j4 & (~j3), this.L, this.R);
            }
        } else if (nb3.q(j2, 64L) >= 0 && nb3.q(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.A;
            if ((j6 & j5) != 0) {
                return new zl6(j6 & (~j5), this.B, this.L, this.R);
            }
        } else if (nb3.q(j2, 0L) < 0 && (jArr = this.R) != null && (k = mp2.k(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (k > 0) {
                    fv.s0(jArr, jArr3, 0, 0, k);
                }
                if (k < i) {
                    fv.s0(jArr, jArr3, k, k + 1, length);
                }
                jArr2 = jArr3;
            }
            return new zl6(this.A, this.B, this.L, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.L;
        if (nb3.q(j2, 0L) >= 0 && nb3.q(j2, 64L) < 0) {
            if (((1 << ((int) j2)) & this.B) != 0) {
                return true;
            }
            return false;
        } else if (nb3.q(j2, 64L) >= 0 && nb3.q(j2, 128L) < 0) {
            if (((1 << (((int) j2) - 64)) & this.A) != 0) {
                return true;
            }
            return false;
        } else if (nb3.q(j2, 0L) <= 0 && (jArr = this.R) != null && mp2.k(jArr, j) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public final zl6 d(zl6 zl6Var) {
        zl6 zl6Var2;
        long[] jArr;
        zl6 zl6Var3 = this;
        zl6 zl6Var4 = X;
        if (zl6Var == zl6Var4) {
            return zl6Var3;
        }
        if (zl6Var3 == zl6Var4) {
            return zl6Var;
        }
        long j = zl6Var.L;
        long j2 = zl6Var.L;
        long[] jArr2 = zl6Var.R;
        long j3 = zl6Var.B;
        long j4 = zl6Var.A;
        long j5 = zl6Var3.L;
        int i = (j > j5 ? 1 : (j == j5 ? 0 : -1));
        long j6 = zl6Var3.B;
        long j7 = zl6Var3.A;
        if (i == 0 && jArr2 == (jArr = zl6Var3.R)) {
            return new zl6(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = zl6Var3.R;
        if (jArr3 == null) {
            if (jArr3 != null) {
                zl6Var2 = zl6Var;
                for (long j8 : jArr3) {
                    zl6Var2 = zl6Var2.f(j8);
                }
            } else {
                zl6Var2 = zl6Var;
            }
            int i3 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            long j9 = zl6Var3.L;
            if (i3 != 0) {
                for (int i4 = 0; i4 < 64; i4++) {
                    if (((1 << i4) & j6) != 0) {
                        zl6Var2 = zl6Var2.f(i4 + j9);
                    }
                }
            }
            if (j7 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j7) != 0) {
                        zl6Var2 = zl6Var2.f(i2 + j9 + 64);
                    }
                    i2++;
                }
            }
            return zl6Var2;
        }
        if (jArr2 != null) {
            for (long j10 : jArr2) {
                zl6Var3 = zl6Var3.f(j10);
            }
        }
        if (j3 != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if (((1 << i5) & j3) != 0) {
                    zl6Var3 = zl6Var3.f(i5 + j2);
                }
            }
        }
        if (j4 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j4) != 0) {
                    zl6Var3 = zl6Var3.f(i2 + j2 + 64);
                }
                i2++;
            }
        }
        return zl6Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
        if (r5 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
        r0 = (defpackage.t94) r5.A;
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0138, code lost:
        if (r3 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013d, code lost:
        r4 = new long[r3];
        r0 = r0.a;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
        if (r6 >= r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
        r4[r6] = r0[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014b, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014c, code lost:
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0152, code lost:
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
        return new defpackage.zl6(r22, r24, r26, r28).f(r30);
     */
    /* JADX WARN: Type inference failed for: r5v10, types: [s35, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zl6 f(long j) {
        long[] jArr;
        long j2;
        long j3;
        s35 s35Var;
        int i;
        t94 t94Var;
        long j4 = this.L;
        long j5 = j - j4;
        long j6 = 0;
        int q = nb3.q(j5, 0L);
        long j7 = this.B;
        if (q >= 0 && nb3.q(j5, 64L) < 0) {
            long j8 = 1 << ((int) j5);
            if ((j7 & j8) == 0) {
                return new zl6(this.A, j7 | j8, this.L, this.R);
            }
        } else {
            int q2 = nb3.q(j5, 64L);
            long j9 = this.A;
            int i2 = 64;
            if (q2 >= 0 && nb3.q(j5, 128L) < 0) {
                long j10 = 1 << (((int) j5) - 64);
                if ((j9 & j10) == 0) {
                    return new zl6(j9 | j10, this.B, this.L, this.R);
                }
            } else {
                int q3 = nb3.q(j5, 128L);
                long[] jArr2 = this.R;
                if (q3 >= 0) {
                    if (!c(j)) {
                        long j11 = ((j + 1) / 64) * 64;
                        if (nb3.q(j11, 0L) < 0) {
                            j11 = 9223372036854775680L;
                        }
                        long j12 = j9;
                        s35 s35Var2 = null;
                        while (true) {
                            if (nb3.q(j4, j11) < 0) {
                                if (j7 != j6) {
                                    if (s35Var2 == null) {
                                        ?? obj = new Object();
                                        if (jArr2 != null) {
                                            long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                                            jArr = null;
                                            t94Var = new t94(copyOf.length);
                                            int i3 = t94Var.b;
                                            if (i3 >= 0) {
                                                j3 = j6;
                                                if (copyOf.length != 0) {
                                                    int length = copyOf.length + i3;
                                                    long[] jArr3 = t94Var.a;
                                                    if (jArr3.length < length) {
                                                        t94Var.a = Arrays.copyOf(jArr3, Math.max(length, (jArr3.length * 3) / 2));
                                                    }
                                                    long[] jArr4 = t94Var.a;
                                                    int i4 = t94Var.b;
                                                    if (i3 != i4) {
                                                        fv.s0(jArr4, jArr4, copyOf.length + i3, i3, i4);
                                                    }
                                                    fv.s0(copyOf, jArr4, i3, 0, copyOf.length);
                                                    t94Var.b += copyOf.length;
                                                }
                                            } else {
                                                e41.q("");
                                                throw null;
                                            }
                                        } else {
                                            j3 = j6;
                                            jArr = null;
                                            t94Var = new t94();
                                        }
                                        obj.A = t94Var;
                                        s35Var2 = obj;
                                    } else {
                                        j3 = j6;
                                        jArr = null;
                                        s35Var2 = s35Var2;
                                    }
                                    i = i2;
                                    for (int i5 = 0; i5 < i; i5++) {
                                        if (((1 << i5) & j7) != j3) {
                                            ((t94) s35Var2.A).a(i5 + j4);
                                        }
                                    }
                                } else {
                                    j3 = j6;
                                    i = i2;
                                    jArr = null;
                                }
                                if (j12 == j3) {
                                    j2 = j11;
                                    s35Var = s35Var2;
                                    break;
                                }
                                j4 += 64;
                                i2 = i;
                                j7 = j12;
                                j6 = j3;
                                j12 = j6;
                                s35Var2 = s35Var2;
                            } else {
                                jArr = null;
                                j2 = j4;
                                j3 = j7;
                                s35Var = s35Var2;
                                break;
                            }
                        }
                    }
                } else if (jArr2 == null) {
                    return new zl6(this.A, this.B, this.L, new long[]{j});
                } else {
                    int k = mp2.k(jArr2, j);
                    if (k < 0) {
                        int i6 = -(k + 1);
                        int length2 = jArr2.length;
                        long[] jArr5 = new long[length2 + 1];
                        fv.s0(jArr2, jArr5, 0, 0, i6);
                        fv.s0(jArr2, jArr5, i6 + 1, i6, length2);
                        jArr5[i6] = j;
                        return new zl6(this.A, this.B, this.L, jArr5);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return qo2.C(new yl6(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(ht0.v0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
