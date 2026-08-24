package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk7  reason: default package */
/* loaded from: classes.dex */
public final class fk7 implements gg3 {
    public static final fk7 a = new Object();
    public static final x25 b = new x25("kotlin.uuid.Uuid", v25.m);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        String concat;
        String I = sc1Var.I();
        I.getClass();
        int length = I.length();
        int i = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (I.length() <= 64) {
                    concat = I;
                } else {
                    concat = I.substring(0, 64).concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(I.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j = 0;
            while (i < 8) {
                long j2 = j << 4;
                char charAt = I.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = hx2.b[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                xk2.K(I, i, "a hexadecimal digit");
                throw null;
            }
            if (I.charAt(8) == '-') {
                long j4 = 0;
                for (int i2 = 9; i2 < 13; i2++) {
                    long j5 = j4 << 4;
                    char charAt2 = I.charAt(i2);
                    if ((charAt2 >>> '\b') == 0) {
                        long j6 = hx2.b[charAt2];
                        if (j6 >= 0) {
                            j4 = j5 | j6;
                        }
                    }
                    xk2.K(I, i2, "a hexadecimal digit");
                    throw null;
                }
                if (I.charAt(13) == '-') {
                    long j7 = 0;
                    for (int i3 = 14; i3 < 18; i3++) {
                        long j8 = j7 << 4;
                        char charAt3 = I.charAt(i3);
                        if ((charAt3 >>> '\b') == 0) {
                            long j9 = hx2.b[charAt3];
                            if (j9 >= 0) {
                                j7 = j8 | j9;
                            }
                        }
                        xk2.K(I, i3, "a hexadecimal digit");
                        throw null;
                    }
                    if (I.charAt(18) == '-') {
                        long j10 = 0;
                        for (int i4 = 19; i4 < 23; i4++) {
                            long j11 = j10 << 4;
                            char charAt4 = I.charAt(i4);
                            if ((charAt4 >>> '\b') == 0) {
                                long j12 = hx2.b[charAt4];
                                if (j12 >= 0) {
                                    j10 = j11 | j12;
                                }
                            }
                            xk2.K(I, i4, "a hexadecimal digit");
                            throw null;
                        }
                        if (I.charAt(23) == '-') {
                            long j13 = 0;
                            for (int i5 = 24; i5 < 36; i5++) {
                                long j14 = j13 << 4;
                                char charAt5 = I.charAt(i5);
                                if ((charAt5 >>> '\b') == 0) {
                                    long j15 = hx2.b[charAt5];
                                    if (j15 >= 0) {
                                        j13 = j14 | j15;
                                    }
                                }
                                xk2.K(I, i5, "a hexadecimal digit");
                                throw null;
                            }
                            long j16 = (j << 32) | (j4 << 16) | j7;
                            long j17 = (j10 << 48) | j13;
                            if (j16 != 0 || j17 != 0) {
                                return new ek7(j16, j17);
                            }
                        } else {
                            xk2.K(I, 23, "'-' (hyphen)");
                            throw null;
                        }
                    } else {
                        xk2.K(I, 18, "'-' (hyphen)");
                        throw null;
                    }
                } else {
                    xk2.K(I, 13, "'-' (hyphen)");
                    throw null;
                }
            } else {
                xk2.K(I, 8, "'-' (hyphen)");
                throw null;
            }
        } else {
            long j18 = 0;
            while (i < 16) {
                long j19 = j18 << 4;
                char charAt6 = I.charAt(i);
                if ((charAt6 >>> '\b') == 0) {
                    long j20 = hx2.b[charAt6];
                    if (j20 >= 0) {
                        j18 = j19 | j20;
                        i++;
                    }
                }
                xk2.K(I, i, "a hexadecimal digit");
                throw null;
            }
            long j21 = 0;
            for (int i6 = 16; i6 < 32; i6++) {
                long j22 = j21 << 4;
                char charAt7 = I.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j23 = hx2.b[charAt7];
                    if (j23 >= 0) {
                        j21 = j22 | j23;
                    }
                }
                xk2.K(I, i6, "a hexadecimal digit");
                throw null;
            }
            if (j18 != 0 || j21 != 0) {
                return new ek7(j18, j21);
            }
        }
        return ek7.L;
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        ek7 ek7Var = (ek7) obj;
        ek7Var.getClass();
        x32Var.d0(ek7Var.toString());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
