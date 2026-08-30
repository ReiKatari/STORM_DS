package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d2 implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final d2 f10291a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final g1 f10292b = new g1("kotlin.uuid.Uuid", ld.d.f9029w);

    @Override // jd.a
    public final Object a(md.c cVar) {
        String concat;
        String B = cVar.B();
        B.getClass();
        int length = B.length();
        int i2 = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (B.length() <= 64) {
                    concat = B;
                } else {
                    concat = B.substring(0, 64).concat("...");
                }
                sb2.append(concat);
                sb2.append("\" of length ");
                sb2.append(B.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long j2 = 0;
            while (i2 < 8) {
                long j10 = j2 << 4;
                char charAt = B.charAt(i2);
                if ((charAt >>> '\b') == 0) {
                    long j11 = vc.b.f13787b[charAt];
                    if (j11 >= 0) {
                        j2 = j10 | j11;
                        i2++;
                    }
                }
                p7.l.y(B, i2, "a hexadecimal digit");
                throw null;
            }
            if (B.charAt(8) == '-') {
                long j12 = 0;
                for (int i10 = 9; i10 < 13; i10++) {
                    long j13 = j12 << 4;
                    char charAt2 = B.charAt(i10);
                    if ((charAt2 >>> '\b') == 0) {
                        long j14 = vc.b.f13787b[charAt2];
                        if (j14 >= 0) {
                            j12 = j13 | j14;
                        }
                    }
                    p7.l.y(B, i10, "a hexadecimal digit");
                    throw null;
                }
                if (B.charAt(13) == '-') {
                    long j15 = 0;
                    for (int i11 = 14; i11 < 18; i11++) {
                        long j16 = j15 << 4;
                        char charAt3 = B.charAt(i11);
                        if ((charAt3 >>> '\b') == 0) {
                            long j17 = vc.b.f13787b[charAt3];
                            if (j17 >= 0) {
                                j15 = j16 | j17;
                            }
                        }
                        p7.l.y(B, i11, "a hexadecimal digit");
                        throw null;
                    }
                    if (B.charAt(18) == '-') {
                        long j18 = 0;
                        for (int i12 = 19; i12 < 23; i12++) {
                            long j19 = j18 << 4;
                            char charAt4 = B.charAt(i12);
                            if ((charAt4 >>> '\b') == 0) {
                                long j20 = vc.b.f13787b[charAt4];
                                if (j20 >= 0) {
                                    j18 = j19 | j20;
                                }
                            }
                            p7.l.y(B, i12, "a hexadecimal digit");
                            throw null;
                        }
                        if (B.charAt(23) == '-') {
                            long j21 = 0;
                            for (int i13 = 24; i13 < 36; i13++) {
                                long j22 = j21 << 4;
                                char charAt5 = B.charAt(i13);
                                if ((charAt5 >>> '\b') == 0) {
                                    long j23 = vc.b.f13787b[charAt5];
                                    if (j23 >= 0) {
                                        j21 = j22 | j23;
                                    }
                                }
                                p7.l.y(B, i13, "a hexadecimal digit");
                                throw null;
                            }
                            long j24 = (j2 << 32) | (j12 << 16) | j15;
                            long j25 = (j18 << 48) | j21;
                            if (j24 != 0 || j25 != 0) {
                                return new yc.a(j24, j25);
                            }
                        } else {
                            p7.l.y(B, 23, "'-' (hyphen)");
                            throw null;
                        }
                    } else {
                        p7.l.y(B, 18, "'-' (hyphen)");
                        throw null;
                    }
                } else {
                    p7.l.y(B, 13, "'-' (hyphen)");
                    throw null;
                }
            } else {
                p7.l.y(B, 8, "'-' (hyphen)");
                throw null;
            }
        } else {
            long j26 = 0;
            while (i2 < 16) {
                long j27 = j26 << 4;
                char charAt6 = B.charAt(i2);
                if ((charAt6 >>> '\b') == 0) {
                    long j28 = vc.b.f13787b[charAt6];
                    if (j28 >= 0) {
                        j26 = j27 | j28;
                        i2++;
                    }
                }
                p7.l.y(B, i2, "a hexadecimal digit");
                throw null;
            }
            long j29 = 0;
            for (int i14 = 16; i14 < 32; i14++) {
                long j30 = j29 << 4;
                char charAt7 = B.charAt(i14);
                if ((charAt7 >>> '\b') == 0) {
                    long j31 = vc.b.f13787b[charAt7];
                    if (j31 >= 0) {
                        j29 = j30 | j31;
                    }
                }
                p7.l.y(B, i14, "a hexadecimal digit");
                throw null;
            }
            if (j26 != 0 || j29 != 0) {
                return new yc.a(j26, j29);
            }
        }
        return yc.a.L;
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        yc.a aVar = (yc.a) obj;
        aVar.getClass();
        dVar.r(aVar.toString());
    }

    @Override // jd.a
    public final ld.e e() {
        return f10292b;
    }
}
