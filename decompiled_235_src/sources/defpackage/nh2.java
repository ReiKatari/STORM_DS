package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh2  reason: default package */
/* loaded from: classes.dex */
public final class nh2 {
    public static final nh2 b = new nh2();
    public static final nh2 c = new nh2();
    public static final nh2 d = new nh2();
    public final ua4 a = new ua4(new ph2[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004c, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(nh2 nh2Var) {
        nh2Var.getClass();
        if (nh2Var != b) {
            if (nh2Var != c) {
                ua4 ua4Var = nh2Var.a;
                int i = ua4Var.L;
                if (i == 0) {
                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    return false;
                }
                Object[] objArr = ua4Var.A;
                boolean z = false;
                for (int i2 = 0; i2 < i; i2++) {
                    ph2 ph2Var = (ph2) objArr[i2];
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
                        int i3 = ua4Var2.L;
                        if (i3 != 0) {
                            z64 z64Var3 = (z64) ua4Var2.l(i3 - 1);
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
                                                if (((vh2) z64Var3).Y0(7)) {
                                                    z = true;
                                                    break;
                                                }
                                            } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                                int i4 = 0;
                                                for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                                    if ((z64Var4.L & 1024) != 0) {
                                                        i4++;
                                                        if (i4 == 1) {
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
                                                if (i4 == 1) {
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
                return z;
            }
            i.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        i.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        return false;
    }
}
