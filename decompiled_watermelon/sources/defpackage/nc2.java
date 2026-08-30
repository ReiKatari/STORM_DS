package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nc2  reason: default package */
/* loaded from: classes.dex */
public final class nc2 implements jc2 {
    public final ee a;
    public final ee b;
    public final gc2 d;
    public p14 f;
    public ed2 h;
    public final ed2 c = new ed2(2, null, 14);
    public final lc2 e = new lc2(this);
    public final w14 g = new w14(1);

    public nc2(ee eeVar, ee eeVar2) {
        this.a = eeVar;
        this.b = eeVar2;
        this.d = new gc2(this, eeVar2);
    }

    public final boolean a(boolean z) {
        zc0 zc0Var;
        if (f() != null) {
            ed2 f = f();
            i(null);
            if (f != null) {
                f.S0(bd2.Active, bd2.Inactive);
                if (!f.A.i0) {
                    mz2.c("visitAncestors called on an unattached node");
                }
                yy3 yy3Var = f.A.X;
                vf3 P = l.P(f);
                while (P != null) {
                    if ((((yy3) P.A0.g).R & 1024) != 0) {
                        while (yy3Var != null) {
                            if ((yy3Var.L & 1024) != 0) {
                                yy3 yy3Var2 = yy3Var;
                                o24 o24Var = null;
                                while (yy3Var2 != null) {
                                    if (yy3Var2 instanceof ed2) {
                                        ((ed2) yy3Var2).S0(bd2.ActiveParent, bd2.Inactive);
                                    } else if ((yy3Var2.L & 1024) != 0 && (yy3Var2 instanceof xc1)) {
                                        int i = 0;
                                        for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                            if ((yy3Var3.L & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    yy3Var2 = yy3Var3;
                                                } else {
                                                    if (o24Var == null) {
                                                        o24Var = new o24(new yy3[16]);
                                                    }
                                                    if (yy3Var2 != null) {
                                                        o24Var.b(yy3Var2);
                                                        yy3Var2 = null;
                                                    }
                                                    o24Var.b(yy3Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    yy3Var2 = l.p(o24Var);
                                }
                            }
                            yy3Var = yy3Var.X;
                        }
                    }
                    P = P.u();
                    if (P != null && (zc0Var = P.A0) != null) {
                        yy3Var = (lm6) zc0Var.f;
                    } else {
                        yy3Var = null;
                    }
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (!z) {
            int i2 = kc2.a[ei7.c(this.c, i).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    a(z);
                } else {
                    i.c();
                    return false;
                }
            } else {
                z3 = false;
            }
        } else {
            a(z);
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        ee eeVar = this.a;
        if (!eeVar.isFocused() && !eeVar.hasFocus()) {
            if (eeVar.hasFocus()) {
                View findFocus = eeVar.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                eeVar.clearFocus();
                return;
            }
            return;
        }
        eeVar.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r7 == null) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r13, defpackage.ki2 r14) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.d(android.view.KeyEvent, ki2):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x012e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(int r21, defpackage.y55 r22, defpackage.mi2 r23) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.e(int, y55, mi2):java.lang.Boolean");
    }

    public final ed2 f() {
        ed2 ed2Var = this.h;
        if (ed2Var != null && ed2Var.i0) {
            return ed2Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, n75] */
    public final boolean g(int i, boolean z) {
        boolean z2;
        ?? obj = new Object();
        obj.A = Boolean.FALSE;
        ed2 f = f();
        Boolean e = e(i, this.a.getEmbeddedViewFocusRect(), new mc2(i, obj));
        if (!b53.x(e, Boolean.TRUE) || f == f()) {
            if (e != null && obj.A != null) {
                if (!e.booleanValue() || !((Boolean) obj.A).booleanValue()) {
                    if ((i == 1 || i == 2) && z && b(i, false, false)) {
                        Boolean e2 = e(i, null, new be(i, 3));
                        if (e2 != null) {
                            z2 = e2.booleanValue();
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(int i) {
        boolean z = false;
        if (!b(i, false, false)) {
            return false;
        }
        Boolean e = e(i, null, new be(i, 2));
        if (e != null) {
            z = e.booleanValue();
        }
        if (!z) {
            c();
        }
        return z;
    }

    public final void i(ed2 ed2Var) {
        ed2 ed2Var2 = this.h;
        this.h = ed2Var;
        w14 w14Var = this.g;
        Object[] objArr = w14Var.a;
        int i = w14Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((hc2) objArr[i2]).a(ed2Var2, ed2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (r4.e != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
        r37 = 1;
        r39 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
        if (r0 <= 8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
        if (java.lang.Long.compare((r4.d * 32) ^ Long.MIN_VALUE, (r0 * 25) ^ Long.MIN_VALUE) > 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
        if (r14 >= r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
        r15 = r5;
        r18 = r6;
        r39 = 128;
        r5 = defpackage.nu.t0(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r18;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0129, code lost:
        if (r6 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012b, code lost:
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r22 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0139, code lost:
        if (r22 != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013b, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0140, code lost:
        if (r22 == 254) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
        r18 = java.lang.Long.hashCode(r12[r6]) * r28;
        r22 = r13;
        r13 = (r18 ^ (r18 << 16)) >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0165, code lost:
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0167, code lost:
        r15 = r7;
        r0[r8] = (r0[r8] & (~(255 << r9))) | ((r18 & 127) << r9);
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r7 = r15;
        r13 = r22;
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018a, code lost:
        r15 = r7;
        r7 = r14 >> 3;
        r25 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019b, code lost:
        if (((r25 >> r8) & 255) != 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019d, code lost:
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r36];
        r12[r36] = r33;
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c5, code lost:
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r36];
        r12[r36] = r5;
        r6 = r36 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e2, code lost:
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + r15;
        r7 = r15;
        r13 = r22;
        r15 = r29;
        r5 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f6, code lost:
        r15 = r7;
        r4.e = defpackage.wu5.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0202, code lost:
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0206, code lost:
        r15 = 1;
        r39 = 128;
        r0 = defpackage.wu5.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0220, code lost:
        if (r12 >= r7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0230, code lost:
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0232, code lost:
        r13 = r6[r12];
        r16 = java.lang.Long.hashCode(r13) * r28;
        r16 = r16 ^ (r16 << 16);
        r37 = r15;
        r15 = r4.b(r16 >>> 7);
        r17 = r0;
        r0 = r16 & 127;
        r16 = r5;
        r18 = r6;
        r5 = r0;
        r0 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r5 = (r17[r0] & (~(255 << r19))) | (r5 << r19);
        r17[r0] = r5;
        r17[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0272, code lost:
        r17 = r0;
        r16 = r5;
        r18 = r6;
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027a, code lost:
        r12 = r12 + 1;
        r5 = r16;
        r0 = r17;
        r6 = r18;
        r15 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0285, code lost:
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0289, code lost:
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02a2, code lost:
        if (((r6 >> r8) & 255) != r39) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a4, code lost:
        r21 = r37 == 1 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a6, code lost:
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r37 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x034c, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x034e, code lost:
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.KeyEvent r40) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.j(android.view.KeyEvent):boolean");
    }
}
