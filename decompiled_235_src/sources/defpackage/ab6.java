package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ab6  reason: default package */
/* loaded from: classes.dex */
public final class ab6 {
    public final sm3 a;
    public final bu1 b;
    public final g93 c;
    public final ca4 d = new ca4(2);

    public ab6(sm3 sm3Var, bu1 bu1Var, p94 p94Var) {
        this.a = sm3Var;
        this.b = bu1Var;
        this.c = p94Var;
    }

    public final xa6 a() {
        return new xa6(this.b, false, this.a, new ta6());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(sm3 sm3Var, ta6 ta6Var) {
        String str;
        String str2;
        boolean z;
        a87 a87Var;
        a87 a87Var2;
        oh ohVar;
        boolean z2;
        Boolean bool;
        AutofillValue forToggle;
        AutofillValue forText;
        ca4 ca4Var = this.d;
        Object[] objArr = ca4Var.a;
        int i = ca4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            nd ndVar = (nd) objArr[i2];
            s63 s63Var = ndVar.A;
            te teVar = ndVar.L;
            ta6 x = sm3Var.x();
            int i3 = sm3Var.B;
            oh ohVar2 = null;
            if (ta6Var != null) {
                Object g = ta6Var.A.g(bb6.F);
                if (g == null) {
                    g = null;
                }
                fp fpVar = (fp) g;
                if (fpVar != null) {
                    str = fpVar.B;
                    if (x != null) {
                        Object g2 = x.A.g(bb6.F);
                        if (g2 == null) {
                            g2 = null;
                        }
                        fp fpVar2 = (fp) g2;
                        if (fpVar2 != null) {
                            str2 = fpVar2.B;
                            z = true;
                            if (str != str2) {
                                if (str == null) {
                                    s63Var.v(teVar, i3, true);
                                } else if (str2 == null) {
                                    s63Var.v(teVar, i3, false);
                                } else if (nb3.k((rf) xk2.r(x, bb6.s), xd5.Y)) {
                                    if (str2.length() >= 5000) {
                                        if (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) {
                                            str2 = qs6.S0(4999, str2);
                                        } else {
                                            str2 = qs6.S0(5000, str2);
                                        }
                                    }
                                    forText = AutofillValue.forText(str2);
                                    ((AutofillManager) s63Var.B).notifyValueChanged(teVar, i3, forText);
                                }
                            }
                            if (ta6Var != null) {
                                Object g3 = ta6Var.A.g(bb6.K);
                                if (g3 == null) {
                                    g3 = null;
                                }
                                a87Var = (a87) g3;
                            } else {
                                a87Var = null;
                            }
                            if (x != null) {
                                Object g4 = x.A.g(bb6.K);
                                if (g4 == null) {
                                    g4 = null;
                                }
                                a87Var2 = (a87) g4;
                            } else {
                                a87Var2 = null;
                            }
                            if (a87Var != a87Var2) {
                                if (a87Var == null) {
                                    s63Var.v(teVar, i3, true);
                                } else if (a87Var2 == null) {
                                    s63Var.v(teVar, i3, false);
                                } else if (nb3.k((rf) xk2.r(x, bb6.s), xd5.Z)) {
                                    int i4 = kd.a[a87Var2.ordinal()];
                                    if (i4 != 1) {
                                        if (i4 != 2) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.FALSE;
                                        }
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                    if (bool != null) {
                                        forToggle = AutofillValue.forToggle(bool.booleanValue());
                                        ((AutofillManager) s63Var.B).notifyValueChanged(teVar, i3, forToggle);
                                    }
                                }
                            }
                            if (ta6Var != null) {
                                Object g5 = ta6Var.A.g(bb6.t);
                                if (g5 == null) {
                                    g5 = null;
                                }
                                ohVar = (oh) g5;
                            } else {
                                ohVar = null;
                            }
                            if (x != null) {
                                Object g6 = x.A.g(bb6.t);
                                if (g6 != null) {
                                    ohVar2 = g6;
                                }
                                ohVar2 = ohVar2;
                            }
                            if (!nb3.k(ohVar, ohVar2)) {
                                if (ohVar == null) {
                                    s63Var.v(teVar, i3, true);
                                } else if (ohVar2 != null) {
                                    ((AutofillManager) s63Var.B).notifyValueChanged(teVar, i3, ohVar2.a);
                                } else {
                                    s63Var.v(teVar, i3, false);
                                }
                            }
                            if (ta6Var == null && ta6Var.A.b(bb6.r)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z = (x == null && x.A.b(bb6.r)) ? false : false;
                            if (z2 != z) {
                                q94 q94Var = ndVar.d0;
                                if (z) {
                                    q94Var.a(i3);
                                } else {
                                    q94Var.f(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    z = true;
                    if (str != str2) {
                    }
                    if (ta6Var != null) {
                    }
                    if (x != null) {
                    }
                    if (a87Var != a87Var2) {
                    }
                    if (ta6Var != null) {
                    }
                    if (x != null) {
                    }
                    if (!nb3.k(ohVar, ohVar2)) {
                    }
                    if (ta6Var == null) {
                    }
                    z2 = false;
                    if (x == null) {
                    }
                    if (z2 != z) {
                    }
                }
            }
            str = null;
            if (x != null) {
            }
            str2 = null;
            z = true;
            if (str != str2) {
            }
            if (ta6Var != null) {
            }
            if (x != null) {
            }
            if (a87Var != a87Var2) {
            }
            if (ta6Var != null) {
            }
            if (x != null) {
            }
            if (!nb3.k(ohVar, ohVar2)) {
            }
            if (ta6Var == null) {
            }
            z2 = false;
            if (x == null) {
            }
            if (z2 != z) {
            }
        }
    }
}
