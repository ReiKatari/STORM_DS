package wc;

import p1.a0;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f14199a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f14200b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f14201c = {3, 6};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f14202d = {1, 2, 4, 5, 7, 8};

    public static final long a(long j2, long j10) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            if (j10 != 4611686018427387903L && j10 != -4611686018427387903L) {
                return p7.j.h(j2 + j10, -4611686018427387903L, 4611686018427387903L);
            }
            return j10;
        } else if (-4611686018427387903L < j10 && j10 < 4611686018427387903L) {
            return j2;
        } else {
            if ((j10 ^ j2) >= 0) {
                return j2;
            }
            return 9223372036854759646L;
        }
    }

    public static final long b(long j2, e eVar) {
        long j10;
        eVar.getClass();
        int i2 = f.f14197a[eVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            j10 = 1;
                        } else {
                            wa.b.e(eVar, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j10 = 1000;
                    }
                } else {
                    j10 = 60000;
                }
            } else {
                j10 = 3600000;
            }
        } else {
            j10 = 86400000;
        }
        if (j2 == 0) {
            return 0L;
        }
        if (j2 == 1) {
            if (j10 <= 4611686018427387903L) {
                return j10;
            }
        } else if (j10 == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j2)) - Long.numberOfLeadingZeros(j10);
            if (numberOfLeadingZeros < 63) {
                return j2 * j10;
            }
            if (numberOfLeadingZeros <= 63) {
                long j11 = j2 * j10;
                if (j11 <= 4611686018427387903L) {
                    return j11;
                }
            }
        }
        return 4611686018427387903L;
    }

    public static final long c(long j2) {
        long j10 = (j2 << 1) + 1;
        b.B.getClass();
        int i2 = c.f14195a;
        return j10;
    }

    public static final void d(StringBuilder sb2, StringBuilder sb3, int i2) {
        if (i2 < 10) {
            sb2.append('0');
        }
        sb3.append(i2);
    }

    public static g e(long j2) {
        long j10 = j2 / 1000;
        if ((j2 ^ 1000) < 0 && j10 * 1000 != j2) {
            j10--;
        }
        long j11 = j2 % 1000;
        int i2 = (int) ((j11 + (1000 & (((j11 ^ 1000) & ((-j11) | j11)) >> 63))) * 1000000);
        if (j10 < -31557014167219200L) {
            return g.L;
        }
        if (j10 > 31556889864403199L) {
            return g.R;
        }
        return f(i2, j10);
    }

    public static g f(int i2, long j2) {
        long j10 = i2;
        long j11 = j10 / 1000000000;
        if ((j10 ^ 1000000000) < 0 && j11 * 1000000000 != j10) {
            j11--;
        }
        long j12 = j2 + j11;
        if ((j2 ^ j12) < 0 && (j11 ^ j2) >= 0) {
            if (j2 > 0) {
                return g.R;
            }
            return g.L;
        } else if (j12 < -31557014167219200L) {
            return g.L;
        } else {
            if (j12 > 31556889864403199L) {
                return g.R;
            }
            long j13 = j10 % 1000000000;
            return new g((int) (j13 + ((((j13 ^ 1000000000) & ((-j13) | j13)) >> 63) & 1000000000)), j12);
        }
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [ih.h, java.lang.Object] */
    public static g g(String str) {
        int i2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        long j2;
        char charAt;
        a0 a0Var;
        char charAt2;
        str.getClass();
        if (str.length() == 0) {
            a0Var = new a0(str, "An empty string is not a valid Instant");
        } else {
            char charAt3 = str.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i2 = 0;
                charAt3 = ' ';
            } else {
                i2 = 1;
            }
            int i18 = 0;
            int i19 = i2;
            while (i19 < str.length() && '0' <= (charAt2 = str.charAt(i19)) && charAt2 < ':') {
                i18 = (i18 * 10) + (str.charAt(i19) - '0');
                i19++;
            }
            int i20 = i19 - i2;
            if (i20 > 10) {
                a0Var = j(str, "Expected at most 10 digits for the year number, got " + i20 + " digits");
            } else if (i20 == 10 && nc.k.b(str.charAt(i2), 50) >= 0) {
                a0Var = j(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i20 + " digits");
            } else if (i20 < 4) {
                a0Var = j(str, "The year number must be padded to 4 digits, got " + i20 + " digits");
            } else if (charAt3 == '+' && i20 == 4) {
                a0Var = j(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i20 != 4) {
                a0Var = j(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i18 = -i18;
                }
                int i21 = i19 + 16;
                if (str.length() < i21) {
                    a0Var = j(str, "The input string is too short");
                } else {
                    a0 i22 = i(str, "'-'", i19, new h1(5));
                    if (i22 == null) {
                        a0 i23 = i(str, "'-'", i19 + 3, new h1(6));
                        a0Var = i23;
                        if (i23 == null) {
                            a0 i24 = i(str, "'T' or 't'", i19 + 6, new h1(7));
                            a0Var = i24;
                            if (i24 == null) {
                                a0 i25 = i(str, "':'", i19 + 9, new h1(8));
                                a0Var = i25;
                                if (i25 == null) {
                                    a0 i26 = i(str, "':'", i19 + 12, new h1(9));
                                    a0Var = i26;
                                    if (i26 == null) {
                                        for (int i27 = 0; i27 < 10; i27++) {
                                            i22 = i(str, "an ASCII digit", f14200b[i27] + i19, new h1(10));
                                            if (i22 == null) {
                                            }
                                        }
                                        int k10 = k(i19 + 1, str);
                                        int k11 = k(i19 + 4, str);
                                        int k12 = k(i19 + 7, str);
                                        int k13 = k(i19 + 10, str);
                                        int k14 = k(i19 + 13, str);
                                        int i28 = i19 + 15;
                                        if (str.charAt(i28) == '.') {
                                            i28 = i21;
                                            int i29 = 0;
                                            while (i28 < str.length() && '0' <= (charAt = str.charAt(i28)) && charAt < ':') {
                                                i29 = (i29 * 10) + (str.charAt(i28) - '0');
                                                i28++;
                                            }
                                            int i30 = i28 - i21;
                                            if (1 <= i30 && i30 < 10) {
                                                i10 = i29 * f14199a[9 - i30];
                                            } else {
                                                a0Var = j(str, "1..9 digits are supported for the fraction of the second, got " + i30 + " digits");
                                            }
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i28 >= str.length()) {
                                            a0Var = j(str, "The UTC offset at the end of the string is missing");
                                        } else {
                                            char charAt4 = str.charAt(i28);
                                            if (charAt4 != '+' && charAt4 != '-') {
                                                if (charAt4 != 'Z' && charAt4 != 'z') {
                                                    a0Var = j(str, "Expected the UTC offset at position " + i28 + ", got '" + charAt4 + '\'');
                                                } else {
                                                    int i31 = i28 + 1;
                                                    if (str.length() == i31) {
                                                        i14 = 0;
                                                        if (1 > k10) {
                                                        }
                                                        a0Var = j(str, "Expected a month number in 1..12, got " + k10);
                                                    } else {
                                                        a0Var = j(str, "Extra text after the instant at position " + i31);
                                                    }
                                                }
                                            } else {
                                                int length = str.length() - i28;
                                                if (length > 9) {
                                                    a0Var = j(str, "The UTC offset string \"" + n(16, str.subSequence(i28, str.length()).toString()) + "\" is too long");
                                                } else if (length % 3 != 0) {
                                                    a0Var = j(str, "Invalid UTC offset string \"" + str.subSequence(i28, str.length()).toString() + '\"');
                                                } else {
                                                    int i32 = 0;
                                                    for (int i33 = 2; i32 < i33; i33 = 2) {
                                                        int i34 = i28 + f14201c[i32];
                                                        if (i34 >= str.length()) {
                                                            break;
                                                        } else if (str.charAt(i34) != ':') {
                                                            StringBuilder i35 = kc.a.i("Expected ':' at index ", i34, ", got '");
                                                            i35.append(str.charAt(i34));
                                                            i35.append('\'');
                                                            a0Var = j(str, i35.toString());
                                                            break;
                                                        } else {
                                                            i32++;
                                                        }
                                                    }
                                                    int i36 = 0;
                                                    while (i36 < 6 && (i15 = f14202d[i36] + i28) < str.length()) {
                                                        char charAt5 = str.charAt(i15);
                                                        int i37 = i36;
                                                        if ('0' <= charAt5 && charAt5 < ':') {
                                                            i36 = i37 + 1;
                                                        } else {
                                                            StringBuilder i38 = kc.a.i("Expected an ASCII digit at index ", i15, ", got '");
                                                            i38.append(str.charAt(i15));
                                                            i38.append('\'');
                                                            a0Var = j(str, i38.toString());
                                                            break;
                                                        }
                                                    }
                                                    int k15 = k(i28 + 1, str);
                                                    if (length > 3) {
                                                        i11 = k(i28 + 4, str);
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                    if (length > 6) {
                                                        i12 = k(i28 + 7, str);
                                                    } else {
                                                        i12 = 0;
                                                    }
                                                    if (i11 > 59) {
                                                        a0Var = j(str, "Expected offset-minute-of-hour in 0..59, got " + i11);
                                                    } else if (i12 > 59) {
                                                        a0Var = j(str, "Expected offset-second-of-minute in 0..59, got " + i12);
                                                    } else if (k15 > 17 && (k15 != 18 || i11 != 0 || i12 != 0)) {
                                                        a0Var = j(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i28, str.length()).toString());
                                                    } else {
                                                        int i39 = (i11 * 60) + (k15 * 3600) + i12;
                                                        if (charAt4 == '-') {
                                                            i13 = -1;
                                                        } else {
                                                            i13 = 1;
                                                        }
                                                        i14 = i39 * i13;
                                                        if (1 > k10 && k10 < 13) {
                                                            if (1 <= k11) {
                                                                int i40 = i18 & 3;
                                                                if (i40 == 0 && (i18 % 100 != 0 || i18 % 400 == 0)) {
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                if (k10 != 2) {
                                                                    if (k10 != 4 && k10 != 6 && k10 != 9 && k10 != 11) {
                                                                        i16 = 31;
                                                                    } else {
                                                                        i16 = 30;
                                                                    }
                                                                } else if (z10) {
                                                                    i16 = 29;
                                                                } else {
                                                                    i16 = 28;
                                                                }
                                                                if (k11 <= i16) {
                                                                    if (k12 > 23) {
                                                                        a0Var = j(str, "Expected hour in 0..23, got " + k12);
                                                                    } else if (k13 > 59) {
                                                                        a0Var = j(str, "Expected minute-of-hour in 0..59, got " + k13);
                                                                    } else if (k14 > 59) {
                                                                        a0Var = j(str, "Expected second-of-minute in 0..59, got " + k14);
                                                                    } else {
                                                                        long j10 = i18;
                                                                        long j11 = 365 * j10;
                                                                        if (j10 >= 0) {
                                                                            i17 = i14;
                                                                            j2 = ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j11;
                                                                        } else {
                                                                            i17 = i14;
                                                                            j2 = j11 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))));
                                                                        }
                                                                        long j12 = j2 + (((k10 * 367) - 362) / 12) + (k11 - 1);
                                                                        if (k10 > 2) {
                                                                            j12 = (i40 == 0 && (i18 % 100 != 0 || i18 % 400 == 0)) ? (-1) + j12 : j12 - 2;
                                                                        }
                                                                        ?? obj = new Object();
                                                                        obj.A = (((j12 - 719528) * 86400) + (((k13 * 60) + (k12 * 3600)) + k14)) - i17;
                                                                        obj.B = i10;
                                                                        a0Var = obj;
                                                                    }
                                                                }
                                                            }
                                                            StringBuilder j13 = kc.a.j("Expected a valid day-of-month for month ", k10, " of year ", i18, ", got ");
                                                            j13.append(k11);
                                                            a0Var = j(str, j13.toString());
                                                        } else {
                                                            a0Var = j(str, "Expected a month number in 1..12, got " + k10);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a0Var = i22;
                    break;
                }
            }
        }
        return a0Var.toInstant();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b7, code lost:
        if (r8 == r24.length()) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01bf, code lost:
        if (r24.charAt(r8) != 'S') goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c1, code lost:
        r2 = (r13 * 1000000000) + r14;
        r4 = r10;
        r13 = wc.e.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d5, code lost:
        switch(wc.d.f14196a[r13.ordinal()]) {
            case 1: goto L160;
            case 2: goto L159;
            case 3: goto L158;
            case 4: goto L157;
            case 5: goto L156;
            case 6: goto L155;
            case 7: goto L153;
            default: goto L107;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d8, code lost:
        wa.b.e(r13, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e0, code lost:
        r13 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e6, code lost:
        r13 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ec, code lost:
        r13 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f2, code lost:
        r13 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f8, code lost:
        r13 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01fe, code lost:
        r13 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0204, code lost:
        r13 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0209, code lost:
        r2 = pc.a.N(r2 * r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x020e, code lost:
        r13 = r2 * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
        if (r8 >= r24.length()) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
        r4 = r24.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
        if ('0' > r4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        if (r4 >= ':') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
        if (r8 == r24.length()) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
        if (r3 == '+') goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (r3 == '-') goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ef, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f1, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f5, code lost:
        if (r8 == (r21 + r3)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f7, code lost:
        r6 = r7.f14204a;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193 A[LOOP:7: B:108:0x0191->B:109:0x0193, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0156 A[LOOP:5: B:97:0x0154->B:98:0x0156, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long h(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.j.h(java.lang.String):long");
    }

    public static final a0 i(CharSequence charSequence, String str, int i2, mc.l lVar) {
        char charAt = charSequence.charAt(i2);
        if (((Boolean) lVar.k(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return j(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i2);
    }

    public static final a0 j(CharSequence charSequence, String str) {
        return new a0(charSequence, str + " when parsing an Instant from \"" + n(64, charSequence) + '\"');
    }

    public static final int k(int i2, CharSequence charSequence) {
        return (charSequence.charAt(i2 + 1) - '0') + ((charSequence.charAt(i2) - '0') * 10);
    }

    public static final long l(int i2, e eVar) {
        eVar.getClass();
        if (eVar.compareTo(e.SECONDS) <= 0) {
            long j2 = i2;
            e eVar2 = e.NANOSECONDS;
            eVar2.getClass();
            long convert = eVar2.getTimeUnit$kotlin_stdlib().convert(j2, eVar.getTimeUnit$kotlin_stdlib());
            l7.a aVar = b.B;
            long j10 = convert << 1;
            int i10 = c.f14195a;
            return j10;
        }
        return m(i2, eVar);
    }

    public static final long m(long j2, e eVar) {
        eVar.getClass();
        e eVar2 = e.NANOSECONDS;
        eVar2.getClass();
        long convert = eVar.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, eVar2.getTimeUnit$kotlin_stdlib());
        if ((-convert) <= j2 && j2 <= convert) {
            long convert2 = eVar2.getTimeUnit$kotlin_stdlib().convert(j2, eVar.getTimeUnit$kotlin_stdlib());
            l7.a aVar = b.B;
            long j10 = convert2 << 1;
            int i2 = c.f14195a;
            return j10;
        }
        e eVar3 = e.MILLISECONDS;
        if (eVar.compareTo(eVar3) >= 0) {
            long signum = Long.signum(j2);
            if (j2 < -9223372036854775807L) {
                j2 = -9223372036854775807L;
            }
            return c(b(Math.abs(j2), eVar) * signum);
        }
        eVar3.getClass();
        return c(p7.j.h(eVar3.getTimeUnit$kotlin_stdlib().convert(j2, eVar.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
    }

    public static final String n(int i2, CharSequence charSequence) {
        if (charSequence.length() <= i2) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i2).toString() + "...";
    }
}
