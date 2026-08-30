package z2;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements Iterable, oc.a {
    public static final j X = new j(0, 0, 0, null);
    public final long A;
    public final long B;
    public final long L;
    public final long[] R;

    public j(long j2, long j10, long j11, long[] jArr) {
        this.A = j2;
        this.B = j10;
        this.L = j11;
        this.R = jArr;
    }

    public final j a(j jVar) {
        j jVar2;
        long j2;
        long[] jArr;
        j jVar3 = X;
        if (jVar == jVar3) {
            return this;
        }
        if (this == jVar3) {
            return jVar3;
        }
        long j10 = jVar.L;
        long j11 = jVar.L;
        long[] jArr2 = jVar.R;
        long j12 = jVar.B;
        long j13 = jVar.A;
        long j14 = this.L;
        if (j10 == j14 && jArr2 == (jArr = this.R)) {
            return new j(this.A & (~j13), this.B & (~j12), j14, jArr);
        }
        if (jArr2 != null) {
            jVar2 = this;
            for (long j15 : jArr2) {
                jVar2 = jVar2.b(j15);
            }
        } else {
            jVar2 = this;
        }
        long j16 = 0;
        if (j12 != 0) {
            int i2 = 0;
            while (i2 < 64) {
                if (((1 << i2) & j12) != j16) {
                    j2 = j16;
                    jVar2 = jVar2.b(i2 + j11);
                } else {
                    j2 = j16;
                }
                i2++;
                j16 = j2;
            }
        }
        long j17 = j16;
        if (j13 != j17) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j13) != j17) {
                    jVar2 = jVar2.b(i10 + j11 + 64);
                }
            }
        }
        return jVar2;
    }

    public final j b(long j2) {
        long[] jArr;
        int c4;
        long[] jArr2;
        long j10 = j2 - this.L;
        long j11 = 0;
        if (nc.k.c(j10, j11) >= 0 && nc.k.c(j10, 64) < 0) {
            long j12 = 1 << ((int) j10);
            long j13 = this.B;
            if ((j13 & j12) != 0) {
                return new j(this.A, j13 & (~j12), this.L, this.R);
            }
        } else if (nc.k.c(j10, 64) >= 0 && nc.k.c(j10, 128) < 0) {
            long j14 = 1 << (((int) j10) - 64);
            long j15 = this.A;
            if ((j15 & j14) != 0) {
                return new j(j15 & (~j14), this.B, this.L, this.R);
            }
        } else if (nc.k.c(j10, j11) < 0 && (jArr = this.R) != null && (c4 = q.c(jArr, j2)) >= 0) {
            int length = jArr.length;
            int i2 = length - 1;
            if (i2 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i2];
                if (c4 > 0) {
                    zb.k.h(jArr, jArr3, 0, 0, c4);
                }
                if (c4 < i2) {
                    zb.k.h(jArr, jArr3, c4, c4 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.A, this.B, this.L, jArr2);
        }
        return this;
    }

    public final boolean c(long j2) {
        long[] jArr;
        long j10 = j2 - this.L;
        long j11 = 0;
        if (nc.k.c(j10, j11) >= 0 && nc.k.c(j10, 64) < 0) {
            if (((1 << ((int) j10)) & this.B) == 0) {
                return false;
            }
            return true;
        } else if (nc.k.c(j10, 64) >= 0 && nc.k.c(j10, 128) < 0) {
            if (((1 << (((int) j10) - 64)) & this.A) == 0) {
                return false;
            }
            return true;
        } else if (nc.k.c(j10, j11) > 0 || (jArr = this.R) == null || q.c(jArr, j2) < 0) {
            return false;
        } else {
            return true;
        }
    }

    public final j d(j jVar) {
        j jVar2;
        j jVar3;
        long[] jArr;
        j jVar4 = X;
        if (jVar == jVar4) {
            return this;
        }
        if (this == jVar4) {
            return jVar;
        }
        long j2 = jVar.L;
        long j10 = jVar.L;
        long[] jArr2 = jVar.R;
        long j11 = jVar.B;
        long j12 = jVar.A;
        long j13 = this.L;
        int i2 = (j2 > j13 ? 1 : (j2 == j13 ? 0 : -1));
        long j14 = this.B;
        long j15 = this.A;
        if (i2 == 0 && jArr2 == (jArr = this.R)) {
            return new j(j15 | j12, j14 | j11, j13, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.R;
        if (jArr3 == null) {
            if (jArr3 != null) {
                jVar3 = jVar;
                for (long j16 : jArr3) {
                    jVar3 = jVar3.e(j16);
                }
            } else {
                jVar3 = jVar;
            }
            int i11 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
            long j17 = this.L;
            if (i11 != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if (((1 << i12) & j14) != 0) {
                        jVar3 = jVar3.e(i12 + j17);
                    }
                }
            }
            if (j15 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j15) != 0) {
                        jVar3 = jVar3.e(i10 + j17 + 64);
                    }
                    i10++;
                }
            }
            return jVar3;
        }
        if (jArr2 != null) {
            jVar2 = this;
            for (long j18 : jArr2) {
                jVar2 = jVar2.e(j18);
            }
        } else {
            jVar2 = this;
        }
        if (j11 != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if (((1 << i13) & j11) != 0) {
                    jVar2 = jVar2.e(i13 + j10);
                }
            }
        }
        if (j12 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j12) != 0) {
                    jVar2 = jVar2.e(i10 + j10 + 64);
                }
                i10++;
            }
        }
        return jVar2;
    }

    public final j e(long j2) {
        long[] jArr;
        long j10;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j11 = this.L;
        long j12 = j2 - j11;
        long j13 = 0;
        int c4 = nc.k.c(j12, j13);
        long j14 = this.B;
        int i2 = 64;
        long j15 = 0;
        if (c4 >= 0 && nc.k.c(j12, 64) < 0) {
            long j16 = 1 << ((int) j12);
            if ((j14 & j16) == 0) {
                return new j(this.A, j14 | j16, this.L, this.R);
            }
        } else {
            long j17 = 64;
            int c10 = nc.k.c(j12, j17);
            long j18 = this.A;
            if (c10 >= 0 && nc.k.c(j12, 128) < 0) {
                long j19 = 1 << (((int) j12) - 64);
                if ((j18 & j19) == 0) {
                    return new j(j18 | j19, this.B, this.L, this.R);
                }
            } else {
                long j20 = 128;
                int c11 = nc.k.c(j12, j20);
                long[] jArr5 = this.R;
                if (c11 >= 0) {
                    if (!c(j2)) {
                        long j21 = 1;
                        long j22 = ((j2 + j21) / j17) * j17;
                        if (nc.k.c(j22, j13) < 0) {
                            j22 = (Long.MAX_VALUE - j20) + j21;
                        }
                        long j23 = j11;
                        long j24 = j18;
                        rd.k kVar = null;
                        while (true) {
                            if (nc.k.c(j23, j22) < 0) {
                                if (j14 != 0) {
                                    if (kVar == null) {
                                        kVar = new rd.k(jArr5);
                                    }
                                    int i10 = 0;
                                    while (i10 < i2) {
                                        if ((j14 & (1 << i10)) != 0) {
                                            jArr4 = jArr5;
                                            ((a1.z) kVar.B).a(i10 + j23);
                                        } else {
                                            jArr4 = jArr5;
                                        }
                                        i10++;
                                        jArr5 = jArr4;
                                        i2 = 64;
                                    }
                                }
                                long[] jArr6 = jArr5;
                                if (j24 == 0) {
                                    j10 = j22;
                                    jArr = jArr6;
                                    break;
                                }
                                j23 += j17;
                                jArr5 = jArr6;
                                j14 = j24;
                                i2 = 64;
                                j24 = 0;
                            } else {
                                jArr = jArr5;
                                j10 = j23;
                                j15 = j14;
                                break;
                            }
                        }
                        if (kVar != null) {
                            a1.z zVar = (a1.z) kVar.B;
                            int i11 = zVar.f120b;
                            if (i11 == 0) {
                                jArr3 = null;
                            } else {
                                long[] jArr7 = new long[i11];
                                long[] jArr8 = zVar.f119a;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    jArr7[i12] = jArr8[i12];
                                }
                                jArr3 = jArr7;
                            }
                            if (jArr3 != null) {
                                jArr2 = jArr3;
                                return new j(j24, j15, j10, jArr2).e(j2);
                            }
                        }
                        jArr2 = jArr;
                        return new j(j24, j15, j10, jArr2).e(j2);
                    }
                } else if (jArr5 == null) {
                    return new j(this.A, this.B, this.L, new long[]{j2});
                } else {
                    int c12 = q.c(jArr5, j2);
                    if (c12 < 0) {
                        int i13 = -(c12 + 1);
                        int length = jArr5.length;
                        long[] jArr9 = new long[length + 1];
                        zb.k.h(jArr5, jArr9, 0, 0, i13);
                        zb.k.h(jArr5, jArr9, i13 + 1, i13, length);
                        jArr9[i13] = j2;
                        return new j(this.A, this.B, this.L, jArr9);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return p7.m.y(new i(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(zb.m.G(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            boolean z10 = true;
            i2++;
            if (i2 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null) {
                z10 = obj instanceof CharSequence;
            }
            if (z10) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
