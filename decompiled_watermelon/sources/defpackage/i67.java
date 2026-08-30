package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i67  reason: default package */
/* loaded from: classes.dex */
public final class i67 implements m93 {
    public static final i67 a = new Object();
    public static final vt4 b = new vt4("kotlin.uuid.Uuid", tt4.p);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        String concat;
        String X = b91Var.X();
        X.getClass();
        int length = X.length();
        int i = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (X.length() <= 64) {
                    concat = X;
                } else {
                    concat = X.substring(0, 64).concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(X.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j = 0;
            while (i < 8) {
                long j2 = j << 4;
                char charAt = X.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = gr2.b[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                gk2.h0(X, i, "a hexadecimal digit");
                throw null;
            }
            if (X.charAt(8) == '-') {
                long j4 = 0;
                for (int i2 = 9; i2 < 13; i2++) {
                    long j5 = j4 << 4;
                    char charAt2 = X.charAt(i2);
                    if ((charAt2 >>> '\b') == 0) {
                        long j6 = gr2.b[charAt2];
                        if (j6 >= 0) {
                            j4 = j5 | j6;
                        }
                    }
                    gk2.h0(X, i2, "a hexadecimal digit");
                    throw null;
                }
                if (X.charAt(13) == '-') {
                    long j7 = 0;
                    for (int i3 = 14; i3 < 18; i3++) {
                        long j8 = j7 << 4;
                        char charAt3 = X.charAt(i3);
                        if ((charAt3 >>> '\b') == 0) {
                            long j9 = gr2.b[charAt3];
                            if (j9 >= 0) {
                                j7 = j8 | j9;
                            }
                        }
                        gk2.h0(X, i3, "a hexadecimal digit");
                        throw null;
                    }
                    if (X.charAt(18) == '-') {
                        long j10 = 0;
                        for (int i4 = 19; i4 < 23; i4++) {
                            long j11 = j10 << 4;
                            char charAt4 = X.charAt(i4);
                            if ((charAt4 >>> '\b') == 0) {
                                long j12 = gr2.b[charAt4];
                                if (j12 >= 0) {
                                    j10 = j11 | j12;
                                }
                            }
                            gk2.h0(X, i4, "a hexadecimal digit");
                            throw null;
                        }
                        if (X.charAt(23) == '-') {
                            long j13 = 0;
                            for (int i5 = 24; i5 < 36; i5++) {
                                long j14 = j13 << 4;
                                char charAt5 = X.charAt(i5);
                                if ((charAt5 >>> '\b') == 0) {
                                    long j15 = gr2.b[charAt5];
                                    if (j15 >= 0) {
                                        j13 = j14 | j15;
                                    }
                                }
                                gk2.h0(X, i5, "a hexadecimal digit");
                                throw null;
                            }
                            long j16 = (j << 32) | (j4 << 16) | j7;
                            long j17 = (j10 << 48) | j13;
                            if (j16 != 0 || j17 != 0) {
                                return new h67(j16, j17);
                            }
                        } else {
                            gk2.h0(X, 23, "'-' (hyphen)");
                            throw null;
                        }
                    } else {
                        gk2.h0(X, 18, "'-' (hyphen)");
                        throw null;
                    }
                } else {
                    gk2.h0(X, 13, "'-' (hyphen)");
                    throw null;
                }
            } else {
                gk2.h0(X, 8, "'-' (hyphen)");
                throw null;
            }
        } else {
            long j18 = 0;
            while (i < 16) {
                long j19 = j18 << 4;
                char charAt6 = X.charAt(i);
                if ((charAt6 >>> '\b') == 0) {
                    long j20 = gr2.b[charAt6];
                    if (j20 >= 0) {
                        j18 = j19 | j20;
                        i++;
                    }
                }
                gk2.h0(X, i, "a hexadecimal digit");
                throw null;
            }
            long j21 = 0;
            for (int i6 = 16; i6 < 32; i6++) {
                long j22 = j21 << 4;
                char charAt7 = X.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j23 = gr2.b[charAt7];
                    if (j23 >= 0) {
                        j21 = j22 | j23;
                    }
                }
                gk2.h0(X, i6, "a hexadecimal digit");
                throw null;
            }
            if (j18 != 0 || j21 != 0) {
                return new h67(j18, j21);
            }
        }
        return h67.L;
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        h67 h67Var = (h67) obj;
        h67Var.getClass();
        mz1Var.b0(h67Var.toString());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
