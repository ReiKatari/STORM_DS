package g3;

import a4.n1;
import a4.o0;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements l {

    /* renamed from: a  reason: collision with root package name */
    public final b4.x f5527a;

    /* renamed from: b  reason: collision with root package name */
    public final b4.x f5528b;

    /* renamed from: d  reason: collision with root package name */
    public final i f5530d;

    /* renamed from: f  reason: collision with root package name */
    public a1.b0 f5532f;

    /* renamed from: h  reason: collision with root package name */
    public g0 f5534h;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f5529c = new g0(2, null, 14);

    /* renamed from: e  reason: collision with root package name */
    public final n f5531e = new n(this);

    /* renamed from: g  reason: collision with root package name */
    public final a1.h0 f5533g = new a1.h0(1);

    public p(b4.x xVar, b4.x xVar2) {
        this.f5527a = xVar;
        this.f5528b = xVar2;
        this.f5530d = new i(this, xVar2);
    }

    public final boolean a(boolean z10) {
        n1 n1Var;
        if (f() != null) {
            g0 f8 = f();
            i(null);
            if (f8 != null) {
                f8.P0(e0.Active, e0.Inactive);
                if (!f8.A.f1777h0) {
                    x3.a.c("visitAncestors called on an unattached node");
                }
                b3.o oVar = f8.A.X;
                o0 t5 = a4.l.t(f8);
                while (t5 != null) {
                    if ((t5.A0.f268f.R & 1024) != 0) {
                        while (oVar != null) {
                            if ((oVar.L & 1024) != 0) {
                                p2.b bVar = null;
                                b3.o oVar2 = oVar;
                                while (oVar2 != null) {
                                    if (oVar2 instanceof g0) {
                                        ((g0) oVar2).P0(e0.ActiveParent, e0.Inactive);
                                    } else if ((oVar2.L & 1024) != 0 && (oVar2 instanceof a4.k)) {
                                        int i2 = 0;
                                        for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                            if ((oVar3.L & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    oVar2 = oVar3;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new p2.b(new b3.o[16]);
                                                    }
                                                    if (oVar2 != null) {
                                                        bVar.b(oVar2);
                                                        oVar2 = null;
                                                    }
                                                    bVar.b(oVar3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    oVar2 = a4.l.e(bVar);
                                }
                            }
                            oVar = oVar.X;
                        }
                    }
                    t5 = t5.u();
                    if (t5 != null && (n1Var = t5.A0) != null) {
                        oVar = n1Var.f267e;
                    } else {
                        oVar = null;
                    }
                }
            }
        }
        return true;
    }

    public final boolean b(int i2, boolean z10, boolean z11) {
        boolean z12 = true;
        if (!z10) {
            int i10 = m.f5524a[d.u(this.f5529c, i2).ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    a(z10);
                } else {
                    m9.o.o();
                    return false;
                }
            } else {
                z12 = false;
            }
        } else {
            a(z10);
        }
        if (z12 && z11) {
            c();
        }
        return z12;
    }

    public final void c() {
        b4.x xVar = this.f5527a;
        if (!xVar.isFocused() && !xVar.hasFocus()) {
            if (xVar.hasFocus()) {
                View findFocus = xVar.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                xVar.clearFocus();
                return;
            }
            return;
        }
        xVar.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r8 == null) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r14, mc.a r15) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.p.d(android.view.KeyEvent, mc.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x012a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(int r21, h3.c r22, mc.l r23) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.p.e(int, h3.c, mc.l):java.lang.Boolean");
    }

    public final g0 f() {
        g0 g0Var = this.f5534h;
        if (g0Var != null && g0Var.f1777h0) {
            return g0Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.t, java.lang.Object] */
    public final boolean g(int i2, boolean z10) {
        boolean z11;
        ?? obj = new Object();
        obj.A = Boolean.FALSE;
        g0 f8 = f();
        Boolean e6 = e(i2, this.f5527a.getEmbeddedViewFocusRect(), new o(obj, i2));
        if (!nc.k.a(e6, Boolean.TRUE) || f8 == f()) {
            if (e6 != null && obj.A != null) {
                if (!e6.booleanValue() || !((Boolean) obj.A).booleanValue()) {
                    if ((i2 == 1 || i2 == 2) && z10 && b(i2, false, false)) {
                        Boolean e10 = e(i2, null, new b4.u(i2, 3));
                        if (e10 != null) {
                            z11 = e10.booleanValue();
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(int i2) {
        boolean z10 = false;
        if (!b(i2, false, false)) {
            return false;
        }
        Boolean e6 = e(i2, null, new b4.u(i2, 2));
        if (e6 != null) {
            z10 = e6.booleanValue();
        }
        if (!z10) {
            c();
        }
        return z10;
    }

    public final void i(g0 g0Var) {
        g0 g0Var2 = this.f5534h;
        this.f5534h = g0Var;
        a1.h0 h0Var = this.f5533g;
        Object[] objArr = h0Var.f44a;
        int i2 = h0Var.f45b;
        for (int i10 = 0; i10 < i2; i10++) {
            ((j) objArr[i10]).a(g0Var2, g0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
        if (r4.f25e != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
        if (((r4.f21a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
        r33 = true;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
        r3 = r4.f23c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
        if (r3 <= r5) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
        if (java.lang.Long.compare((r4.f24d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
        r3 = r4.f21a;
        r8 = r4.f23c;
        r9 = r4.f22b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
        if (r13 >= r10) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
        r32 = r6;
        r22 = r15;
        r5 = zb.k.y(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0132, code lost:
        if (r5 == r8) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0134, code lost:
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0141, code lost:
        if (r13 != r22) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0143, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
        if (r13 == 254) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016a, code lost:
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018a, code lost:
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018d, code lost:
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019e, code lost:
        if (((r34 >> r6) & 255) != r22) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a0, code lost:
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c4, code lost:
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ed, code lost:
        r33 = r7;
        r4.f25e = a1.u0.a(r4.f23c) - r4.f24d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fe, code lost:
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0200, code lost:
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
        r3 = a1.u0.b(r4.f23c);
        r5 = r4.f21a;
        r6 = r4.f22b;
        r7 = r4.f23c;
        r4.c(r3);
        r3 = r4.f21a;
        r8 = r4.f22b;
        r9 = r4.f23c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021f, code lost:
        if (r10 >= r7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022e, code lost:
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0230, code lost:
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026e, code lost:
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0274, code lost:
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027d, code lost:
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0281, code lost:
        r32 = r3;
        r4.f24d++;
        r3 = r4.f25e;
        r5 = r4.f21a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029b, code lost:
        if (((r7 >> r9) & 255) != r22) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029d, code lost:
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
        r4.f25e = r3 - r21;
        r3 = r4.f23c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0349, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x034b, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.p.j(android.view.KeyEvent):boolean");
    }
}
