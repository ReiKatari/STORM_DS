package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eh2  reason: default package */
/* loaded from: classes.dex */
public final class eh2 implements ah2 {
    public final te a;
    public final te b;
    public final xg2 d;
    public v94 f;
    public vh2 h;
    public final vh2 c = new vh2(2, null, 14);
    public final ch2 e = new ch2(this);
    public final ca4 g = new ca4(1);

    public eh2(te teVar, te teVar2) {
        this.a = teVar;
        this.b = teVar2;
        this.d = new xg2(this, teVar2);
    }

    public final boolean a(boolean z) {
        if0 if0Var;
        if (f() != null) {
            vh2 f = f();
            i(null);
            if (f != null) {
                f.S0(sh2.Active, sh2.Inactive);
                if (!f.A.j0) {
                    p53.c("visitAncestors called on an unattached node");
                }
                z64 z64Var = f.A.X;
                sm3 f0 = nc1.f0(f);
                while (f0 != null) {
                    if ((((z64) f0.B0.g).R & 1024) != 0) {
                        while (z64Var != null) {
                            if ((z64Var.L & 1024) != 0) {
                                z64 z64Var2 = z64Var;
                                ua4 ua4Var = null;
                                while (z64Var2 != null) {
                                    if (z64Var2 instanceof vh2) {
                                        ((vh2) z64Var2).S0(sh2.ActiveParent, sh2.Inactive);
                                    } else if ((z64Var2.L & 1024) != 0 && (z64Var2 instanceof zg1)) {
                                        int i = 0;
                                        for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                            if ((z64Var3.L & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    z64Var2 = z64Var3;
                                                } else {
                                                    if (ua4Var == null) {
                                                        ua4Var = new ua4(new z64[16]);
                                                    }
                                                    if (z64Var2 != null) {
                                                        ua4Var.b(z64Var2);
                                                        z64Var2 = null;
                                                    }
                                                    ua4Var.b(z64Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    z64Var2 = nc1.A(ua4Var);
                                }
                            }
                            z64Var = z64Var.X;
                        }
                    }
                    f0 = f0.v();
                    if (f0 != null && (if0Var = f0.B0) != null) {
                        z64Var = (vy6) if0Var.f;
                    } else {
                        z64Var = null;
                    }
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (!z) {
            int i2 = bh2.a[jx2.E(this.c, i).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    a(z);
                } else {
                    i.d();
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
        te teVar = this.a;
        if (!teVar.isFocused() && !teVar.hasFocus()) {
            if (teVar.hasFocus()) {
                View findFocus = teVar.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                teVar.clearFocus();
                return;
            }
            return;
        }
        teVar.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r7 == null) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, on2 on2Var) {
        z64 z64Var;
        z64 z64Var2;
        if0 if0Var;
        z64 z64Var3;
        if0 if0Var2;
        int i;
        if0 if0Var3;
        boolean z;
        vh2 vh2Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            } else if (!j(keyEvent)) {
                return false;
            } else {
                vh2 q = yh2.q(vh2Var);
                if (q != null) {
                    if (!q.A.j0) {
                        p53.c("visitLocalDescendants called on an unattached node");
                    }
                    z64 z64Var4 = q.A;
                    if ((z64Var4.R & 9216) != 0) {
                        z64Var2 = null;
                        for (z64 z64Var5 = z64Var4.Y; z64Var5 != null; z64Var5 = z64Var5.Y) {
                            int i2 = z64Var5.L;
                            if ((i2 & 9216) != 0) {
                                if ((i2 & 1024) != 0) {
                                    break;
                                }
                                z64Var2 = z64Var5;
                            }
                        }
                    } else {
                        z64Var2 = null;
                    }
                }
                if (q != null) {
                    if (!q.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var6 = q.A;
                    sm3 f0 = nc1.f0(q);
                    loop11: while (true) {
                        if (f0 != null) {
                            if ((((z64) f0.B0.g).R & 8192) != 0) {
                                while (z64Var6 != null) {
                                    if ((z64Var6.L & 8192) != 0) {
                                        ua4 ua4Var = null;
                                        z64Var3 = z64Var6;
                                        while (z64Var3 != null) {
                                            if (z64Var3 instanceof bh3) {
                                                break loop11;
                                            }
                                            if ((z64Var3.L & 8192) != 0 && (z64Var3 instanceof zg1)) {
                                                int i3 = 0;
                                                for (z64 z64Var7 = ((zg1) z64Var3).l0; z64Var7 != null; z64Var7 = z64Var7.Y) {
                                                    if ((z64Var7.L & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            z64Var3 = z64Var7;
                                                        } else {
                                                            if (ua4Var == null) {
                                                                ua4Var = new ua4(new z64[16]);
                                                            }
                                                            if (z64Var3 != null) {
                                                                ua4Var.b(z64Var3);
                                                                z64Var3 = null;
                                                            }
                                                            ua4Var.b(z64Var7);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            z64Var3 = nc1.A(ua4Var);
                                        }
                                        continue;
                                    }
                                    z64Var6 = z64Var6.X;
                                }
                            }
                            f0 = f0.v();
                            if (f0 != null && (if0Var2 = f0.B0) != null) {
                                z64Var6 = (vy6) if0Var2.f;
                            } else {
                                z64Var6 = null;
                            }
                        } else {
                            z64Var3 = null;
                            break;
                        }
                    }
                    bh3 bh3Var = (bh3) z64Var3;
                    if (bh3Var != null) {
                        z64Var2 = ((z64) bh3Var).A;
                        if (z64Var2 != null) {
                            if (!z64Var2.A.j0) {
                                p53.c("visitAncestors called on an unattached node");
                            }
                            z64 z64Var8 = z64Var2.A.X;
                            sm3 f02 = nc1.f0(z64Var2);
                            ArrayList arrayList = null;
                            while (f02 != null) {
                                if ((((z64) f02.B0.g).R & 8192) != 0) {
                                    while (z64Var8 != null) {
                                        if ((z64Var8.L & 8192) != 0) {
                                            z64 z64Var9 = z64Var8;
                                            ua4 ua4Var2 = null;
                                            while (z64Var9 != null) {
                                                if (z64Var9 instanceof bh3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(z64Var9);
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                if (z && (z64Var9.L & 8192) != 0 && (z64Var9 instanceof zg1)) {
                                                    int i4 = 0;
                                                    for (z64 z64Var10 = ((zg1) z64Var9).l0; z64Var10 != null; z64Var10 = z64Var10.Y) {
                                                        if ((z64Var10.L & 8192) != 0) {
                                                            i4++;
                                                            if (i4 == 1) {
                                                                z64Var9 = z64Var10;
                                                            } else {
                                                                if (ua4Var2 == null) {
                                                                    ua4Var2 = new ua4(new z64[16]);
                                                                }
                                                                if (z64Var9 != null) {
                                                                    ua4Var2.b(z64Var9);
                                                                    z64Var9 = null;
                                                                }
                                                                ua4Var2.b(z64Var10);
                                                            }
                                                        }
                                                    }
                                                    if (i4 == 1) {
                                                    }
                                                }
                                                z64Var9 = nc1.A(ua4Var2);
                                            }
                                        }
                                        z64Var8 = z64Var8.X;
                                    }
                                }
                                f02 = f02.v();
                                if (f02 != null && (if0Var3 = f02.B0) != null) {
                                    z64Var8 = (vy6) if0Var3.f;
                                } else {
                                    z64Var8 = null;
                                }
                            }
                            if (arrayList != null && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i5 = i - 1;
                                    if (((bh3) arrayList.get(i)).k(keyEvent)) {
                                        return true;
                                    }
                                    if (i5 < 0) {
                                        break;
                                    }
                                    i = i5;
                                }
                            }
                            z64 z64Var11 = z64Var2.A;
                            ua4 ua4Var3 = null;
                            while (z64Var11 != null) {
                                if (z64Var11 instanceof bh3) {
                                    if (((bh3) z64Var11).k(keyEvent)) {
                                        return true;
                                    }
                                } else if ((z64Var11.L & 8192) != 0 && (z64Var11 instanceof zg1)) {
                                    int i6 = 0;
                                    for (z64 z64Var12 = ((zg1) z64Var11).l0; z64Var12 != null; z64Var12 = z64Var12.Y) {
                                        if ((z64Var12.L & 8192) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                z64Var11 = z64Var12;
                                            } else {
                                                if (ua4Var3 == null) {
                                                    ua4Var3 = new ua4(new z64[16]);
                                                }
                                                if (z64Var11 != null) {
                                                    ua4Var3.b(z64Var11);
                                                    z64Var11 = null;
                                                }
                                                ua4Var3.b(z64Var12);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                z64Var11 = nc1.A(ua4Var3);
                            }
                            if (((Boolean) on2Var.c()).booleanValue()) {
                                return true;
                            }
                            z64 z64Var13 = z64Var2.A;
                            ua4 ua4Var4 = null;
                            while (z64Var13 != null) {
                                if (z64Var13 instanceof bh3) {
                                    if (((bh3) z64Var13).B(keyEvent)) {
                                        return true;
                                    }
                                } else if ((z64Var13.L & 8192) != 0 && (z64Var13 instanceof zg1)) {
                                    int i7 = 0;
                                    for (z64 z64Var14 = ((zg1) z64Var13).l0; z64Var14 != null; z64Var14 = z64Var14.Y) {
                                        if ((z64Var14.L & 8192) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                z64Var13 = z64Var14;
                                            } else {
                                                if (ua4Var4 == null) {
                                                    ua4Var4 = new ua4(new z64[16]);
                                                }
                                                if (z64Var13 != null) {
                                                    ua4Var4.b(z64Var13);
                                                    z64Var13 = null;
                                                }
                                                ua4Var4.b(z64Var14);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                z64Var13 = nc1.A(ua4Var4);
                            }
                            if (arrayList != null) {
                                int size = arrayList.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    if (((bh3) arrayList.get(i8)).B(keyEvent)) {
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                }
                if (!vh2Var.A.j0) {
                    p53.c("visitAncestors called on an unattached node");
                }
                z64 z64Var15 = vh2Var.A.X;
                sm3 f03 = nc1.f0(vh2Var);
                loop15: while (true) {
                    if (f03 != null) {
                        if ((((z64) f03.B0.g).R & 8192) != 0) {
                            while (z64Var15 != null) {
                                if ((z64Var15.L & 8192) != 0) {
                                    z64Var = z64Var15;
                                    ua4 ua4Var5 = null;
                                    while (z64Var != null) {
                                        if (z64Var instanceof bh3) {
                                            break loop15;
                                        }
                                        if ((z64Var.L & 8192) != 0 && (z64Var instanceof zg1)) {
                                            int i9 = 0;
                                            for (z64 z64Var16 = ((zg1) z64Var).l0; z64Var16 != null; z64Var16 = z64Var16.Y) {
                                                if ((z64Var16.L & 8192) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        z64Var = z64Var16;
                                                    } else {
                                                        if (ua4Var5 == null) {
                                                            ua4Var5 = new ua4(new z64[16]);
                                                        }
                                                        if (z64Var != null) {
                                                            ua4Var5.b(z64Var);
                                                            z64Var = null;
                                                        }
                                                        ua4Var5.b(z64Var16);
                                                    }
                                                }
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        z64Var = nc1.A(ua4Var5);
                                    }
                                    continue;
                                }
                                z64Var15 = z64Var15.X;
                            }
                        }
                        f03 = f03.v();
                        if (f03 != null && (if0Var = f03.B0) != null) {
                            z64Var15 = (vy6) if0Var.f;
                        } else {
                            z64Var15 = null;
                        }
                    } else {
                        z64Var = null;
                        break;
                    }
                }
                bh3 bh3Var2 = (bh3) z64Var;
                if (bh3Var2 != null) {
                    z64Var2 = ((z64) bh3Var2).A;
                } else {
                    z64Var2 = null;
                }
                if (z64Var2 != null) {
                }
                return false;
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x012e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, of5 of5Var, qn2 qn2Var) {
        boolean i2;
        vh2 vh2Var;
        if0 if0Var;
        nh2 nh2Var;
        nh2 nh2Var2;
        nh2 nh2Var3;
        vh2 vh2Var2 = this.c;
        vh2 q = yh2.q(vh2Var2);
        int i3 = 4;
        te teVar = this.b;
        boolean z = false;
        if (q != null) {
            kk3 layoutDirection = teVar.getLayoutDirection();
            ih2 T0 = q.T0();
            if (i == 1) {
                nh2Var = T0.b;
            } else if (i == 2) {
                nh2Var = T0.c;
            } else if (i == 5) {
                nh2Var = T0.d;
            } else if (i == 6) {
                nh2Var = T0.e;
            } else if (i == 3) {
                int i4 = xh2.a[layoutDirection.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        nh2Var3 = T0.i;
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    nh2Var3 = T0.h;
                }
                if (nh2Var3 == nh2.b) {
                    nh2Var3 = null;
                }
                if (nh2Var3 == null) {
                    nh2Var = T0.f;
                } else {
                    nh2Var = nh2Var3;
                }
            } else if (i == 4) {
                int i5 = xh2.a[layoutDirection.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        nh2Var2 = T0.h;
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    nh2Var2 = T0.i;
                }
                if (nh2Var2 == nh2.b) {
                    nh2Var2 = null;
                }
                if (nh2Var2 == null) {
                    nh2Var = T0.g;
                } else {
                    nh2Var = nh2Var2;
                }
            } else if (i == 7 || i == 8) {
                mj0 mj0Var = new mj0(i);
                eh2 eh2Var = (eh2) ((te) nc1.g0(q)).getFocusOwner();
                vh2 f = eh2Var.f();
                if (i == 7) {
                    T0.j.getClass();
                } else {
                    T0.k.g(mj0Var);
                }
                if (mj0Var.b) {
                    nh2Var = nh2.c;
                } else if (f != eh2Var.f()) {
                    nh2Var = nh2.d;
                } else {
                    nh2Var = nh2.b;
                }
            } else {
                i.m("invalid FocusDirection");
                return null;
            }
            nh2 nh2Var4 = nh2.c;
            if (!nb3.k(nh2Var, nh2Var4)) {
                if (nb3.k(nh2Var, nh2.d)) {
                    vh2 q2 = yh2.q(vh2Var2);
                    if (q2 != null) {
                        return (Boolean) qn2Var.g(q2);
                    }
                } else {
                    nh2 nh2Var5 = nh2.b;
                    if (!nb3.k(nh2Var, nh2Var5)) {
                        if (nh2Var != nh2Var5) {
                            if (nh2Var != nh2Var4) {
                                ua4 ua4Var = nh2Var.a;
                                int i6 = ua4Var.L;
                                if (i6 == 0) {
                                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                                } else {
                                    Object[] objArr = ua4Var.A;
                                    boolean z2 = false;
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        ph2 ph2Var = (ph2) objArr[i7];
                                        if (!((z64) ph2Var).A.j0) {
                                            p53.c("visitChildren called on an unattached node");
                                        }
                                        ua4 ua4Var2 = new ua4(new z64[16]);
                                        z64 z64Var = ((z64) ph2Var).A;
                                        z64 z64Var2 = z64Var.Y;
                                        if (z64Var2 == null) {
                                            nc1.z(ua4Var2, z64Var);
                                        } else {
                                            ua4Var2.b(z64Var2);
                                        }
                                        while (true) {
                                            int i8 = ua4Var2.L;
                                            if (i8 != 0) {
                                                z64 z64Var3 = (z64) ua4Var2.l(i8 - 1);
                                                if ((z64Var3.R & 1024) == 0) {
                                                    nc1.z(ua4Var2, z64Var3);
                                                } else {
                                                    while (true) {
                                                        if (z64Var3 == null) {
                                                            break;
                                                        } else if ((z64Var3.L & 1024) != 0) {
                                                            ua4 ua4Var3 = null;
                                                            while (z64Var3 != null) {
                                                                if (z64Var3 instanceof vh2) {
                                                                    if (((Boolean) qn2Var.g((vh2) z64Var3)).booleanValue()) {
                                                                        z2 = true;
                                                                        break;
                                                                    }
                                                                } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                                                    int i9 = 0;
                                                                    for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                                                        if ((z64Var4.L & 1024) != 0) {
                                                                            i9++;
                                                                            if (i9 == 1) {
                                                                                z64Var3 = z64Var4;
                                                                            } else {
                                                                                if (ua4Var3 == null) {
                                                                                    ua4Var3 = new ua4(new z64[16]);
                                                                                }
                                                                                if (z64Var3 != null) {
                                                                                    ua4Var3.b(z64Var3);
                                                                                    z64Var3 = null;
                                                                                }
                                                                                ua4Var3.b(z64Var4);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i9 == 1) {
                                                                    }
                                                                }
                                                                z64Var3 = nc1.A(ua4Var3);
                                                            }
                                                            continue;
                                                        } else {
                                                            z64Var3 = z64Var3.Y;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z = z2;
                                }
                                return Boolean.valueOf(z);
                            }
                            i.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        i.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        return null;
                    }
                }
            }
            return null;
        }
        q = null;
        kk3 layoutDirection2 = teVar.getLayoutDirection();
        ln lnVar = new ln(q, this, qn2Var, 5);
        if (i == 1 || i == 2) {
            if (i == 1) {
                i2 = ej2.x(vh2Var2, lnVar);
            } else if (i == 2) {
                i2 = ej2.i(vh2Var2, lnVar);
            } else {
                i.m("This function should only be used for 1-D focus search");
                return null;
            }
            return Boolean.valueOf(i2);
        } else if (i == 3 || i == 4 || i == 5 || i == 6) {
            return uj2.e0(i, lnVar, vh2Var2, of5Var);
        } else {
            if (i == 7) {
                int i10 = xh2.a[layoutDirection2.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        i3 = 3;
                    } else {
                        i.d();
                        return null;
                    }
                }
                vh2 q3 = yh2.q(vh2Var2);
                if (q3 != null) {
                    return uj2.e0(i3, lnVar, q3, of5Var);
                }
                return null;
            } else if (i == 8) {
                vh2 q4 = yh2.q(vh2Var2);
                if (q4 != null) {
                    if (!q4.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var5 = q4.A.X;
                    sm3 f0 = nc1.f0(q4);
                    loop5: while (f0 != null) {
                        if ((((z64) f0.B0.g).R & 1024) != 0) {
                            while (z64Var5 != null) {
                                if ((z64Var5.L & 1024) != 0) {
                                    z64 z64Var6 = z64Var5;
                                    ua4 ua4Var4 = null;
                                    while (z64Var6 != null) {
                                        if (z64Var6 instanceof vh2) {
                                            vh2 vh2Var3 = (vh2) z64Var6;
                                            if (vh2Var3.T0().a) {
                                                vh2Var = vh2Var3;
                                                break loop5;
                                            }
                                        } else if ((z64Var6.L & 1024) != 0 && (z64Var6 instanceof zg1)) {
                                            int i11 = 0;
                                            for (z64 z64Var7 = ((zg1) z64Var6).l0; z64Var7 != null; z64Var7 = z64Var7.Y) {
                                                if ((z64Var7.L & 1024) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        z64Var6 = z64Var7;
                                                    } else {
                                                        if (ua4Var4 == null) {
                                                            ua4Var4 = new ua4(new z64[16]);
                                                        }
                                                        if (z64Var6 != null) {
                                                            ua4Var4.b(z64Var6);
                                                            z64Var6 = null;
                                                        }
                                                        ua4Var4.b(z64Var7);
                                                    }
                                                }
                                            }
                                            if (i11 != 1) {
                                                z64Var6 = nc1.A(ua4Var4);
                                            }
                                        }
                                        z64Var6 = nc1.A(ua4Var4);
                                    }
                                    continue;
                                }
                                z64Var5 = z64Var5.X;
                            }
                        }
                        f0 = f0.v();
                        if (f0 != null && (if0Var = f0.B0) != null) {
                            z64Var5 = (vy6) if0Var.f;
                        } else {
                            z64Var5 = null;
                        }
                    }
                }
                vh2Var = null;
                if (vh2Var != null && vh2Var != vh2Var2) {
                    z = ((Boolean) lnVar.g(vh2Var)).booleanValue();
                }
                return Boolean.valueOf(z);
            } else {
                u34.B(qg2.a(i), "Focus search invoked with invalid FocusDirection ");
                return null;
            }
        }
    }

    public final vh2 f() {
        vh2 vh2Var = this.h;
        if (vh2Var != null && vh2Var.j0) {
            return vh2Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dh5, java.lang.Object] */
    public final boolean g(int i, boolean z) {
        boolean z2;
        ?? obj = new Object();
        obj.A = Boolean.FALSE;
        vh2 f = f();
        Boolean e = e(i, this.a.getEmbeddedViewFocusRect(), new dh2(i, obj));
        if (!nb3.k(e, Boolean.TRUE) || f == f()) {
            if (e != null && obj.A != null) {
                if (!e.booleanValue() || !((Boolean) obj.A).booleanValue()) {
                    if ((i == 1 || i == 2) && z && b(i, false, false)) {
                        Boolean e2 = e(i, null, new qe(i, 3));
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
        Boolean e = e(i, null, new qe(i, 2));
        if (e != null) {
            z = e.booleanValue();
        }
        if (!z) {
            c();
        }
        return z;
    }

    public final void i(vh2 vh2Var) {
        vh2 vh2Var2 = this.h;
        this.h = vh2Var;
        ca4 ca4Var = this.g;
        Object[] objArr = ca4Var.a;
        int i = ca4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((yg2) objArr[i2]).a(vh2Var2, vh2Var);
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
        r5 = defpackage.fv.H0(r0);
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
        r4.e = defpackage.b66.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0202, code lost:
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0206, code lost:
        r15 = 1;
        r39 = 128;
        r0 = defpackage.b66.b(r4.c);
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
    */
    public final boolean j(KeyEvent keyEvent) {
        int i;
        long j;
        int i2;
        boolean z;
        long m = xk2.m(keyEvent);
        int u = xk2.u(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i4 = 0;
        int i5 = 1;
        if (u == 2) {
            v94 v94Var = this.f;
            if (v94Var == null) {
                v94Var = new v94(3);
                this.f = v94Var;
            }
            v94 v94Var2 = v94Var;
            int hashCode = Long.hashCode(m) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = v94Var2.c;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = v94Var2.a;
                int i12 = i10 >> 3;
                int i13 = (i10 & 7) << 3;
                long j3 = (jArr[i12] >>> i13) | ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                int i14 = i3;
                long j4 = i8;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i10 + (Long.numberOfTrailingZeros(j6) >> 3)) & i9;
                    long j7 = j2;
                    if (v94Var2.b[i2] == m) {
                        z = 1;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                i3 = i14;
                j2 = j;
            }
            v94Var2.b[i2] = m;
            return z;
        } else if (u != 1) {
            return true;
        } else {
            v94 v94Var3 = this.f;
            if (v94Var3 == null || !v94Var3.a(m)) {
                return false;
            }
            v94 v94Var4 = this.f;
            if (v94Var4 != null) {
                int hashCode2 = Long.hashCode(m) * (-862048943);
                int i15 = hashCode2 ^ (hashCode2 << 16);
                int i16 = i15 & 127;
                int i17 = v94Var4.c;
                int i18 = i15 >>> 7;
                loop5: while (true) {
                    int i19 = i18 & i17;
                    long[] jArr2 = v94Var4.a;
                    int i20 = i19 >> 3;
                    int i21 = (i19 & 7) << 3;
                    long j8 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                    long j9 = (i16 * 72340172838076673L) ^ j8;
                    long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                    while (true) {
                        if (j10 == 0) {
                            break;
                        }
                        i = ((Long.numberOfTrailingZeros(j10) >> 3) + i19) & i17;
                        if (v94Var4.b[i] == m) {
                            break loop5;
                        }
                        j10 &= j10 - 1;
                    }
                    i4 += 8;
                    i18 = i19 + i4;
                }
                if (i >= 0) {
                    v94Var4.d--;
                    long[] jArr3 = v94Var4.a;
                    int i22 = v94Var4.c;
                    int i23 = i >> 3;
                    int i24 = (i & 7) << 3;
                    long j11 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                    jArr3[i23] = j11;
                    jArr3[(((i - 7) & i22) + (i22 & 7)) >> 3] = j11;
                    return true;
                }
            }
            return true;
        }
    }
}
