package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ii7  reason: default package */
/* loaded from: classes.dex */
public abstract class ii7 {
    public static final LinkedHashSet a(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new iz0(readBoolean, parse));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dt3.W(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dt3.W(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final ed2 b(ed2 ed2Var) {
        ed2 f = ((nc2) ((ee) l.Q(ed2Var)).getFocusOwner()).f();
        if (f != null && f.i0) {
            return f;
        }
        return null;
    }

    public static final y55 c(ed2 ed2Var) {
        m74 m74Var;
        if (ed2Var.i0 && (m74Var = ed2Var.c0) != null) {
            rd3 s = me2.s(m74Var);
            if (!s.c0()) {
                s = null;
            }
            if (s != null) {
                return ed2Var.U0(s);
            }
        }
        return y55.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0026, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ed2 d(defpackage.ed2 r8) {
        /*
            yy3 r0 = r8.A
            boolean r0 = r0.i0
            r1 = 0
            if (r0 != 0) goto L9
            goto Laf
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.mz2.c(r0)
        L10:
            o24 r0 = new o24
            r2 = 16
            yy3[] r3 = new defpackage.yy3[r2]
            r0.<init>(r3)
            yy3 r8 = r8.A
            yy3 r3 = r8.Y
            if (r3 != 0) goto L23
            defpackage.l.l(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.L
            if (r8 == 0) goto Laf
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            yy3 r8 = (defpackage.yy3) r8
            int r3 = r8.R
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            defpackage.l.l(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.L
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lac
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof defpackage.ed2
            r5 = 1
            if (r4 == 0) goto L71
            ed2 r8 = (defpackage.ed2) r8
            yy3 r4 = r8.A
            boolean r4 = r4.i0
            if (r4 == 0) goto La7
            bd2 r4 = r8.W0()
            int[] r6 = defpackage.gd2.b
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L70
            r5 = 2
            if (r4 == r5) goto L70
            r5 = 3
            if (r4 == r5) goto L70
            r8 = 4
            if (r4 != r8) goto L6c
            goto La7
        L6c:
            defpackage.i.c()
            return r1
        L70:
            return r8
        L71:
            int r4 = r8.L
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La7
            boolean r4 = r8 instanceof defpackage.xc1
            if (r4 == 0) goto La7
            r4 = r8
            xc1 r4 = (defpackage.xc1) r4
            yy3 r4 = r4.k0
            r6 = 0
        L81:
            if (r4 == 0) goto La4
            int r7 = r4.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La1
            int r6 = r6 + 1
            if (r6 != r5) goto L8f
            r8 = r4
            goto La1
        L8f:
            if (r3 != 0) goto L98
            o24 r3 = new o24
            yy3[] r7 = new defpackage.yy3[r2]
            r3.<init>(r7)
        L98:
            if (r8 == 0) goto L9e
            r3.b(r8)
            r8 = r1
        L9e:
            r3.b(r4)
        La1:
            yy3 r4 = r4.Y
            goto L81
        La4:
            if (r6 != r5) goto La7
            goto L45
        La7:
            yy3 r8 = defpackage.l.p(r3)
            goto L45
        Lac:
            yy3 r8 = r8.Y
            goto L3c
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii7.d(ed2):ed2");
    }

    public static final f00 e(int i) {
        if (i != 0) {
            if (i == 1) {
                return f00.LINEAR;
            }
            i.i(wh1.j("Could not convert ", i, " to BackoffPolicy"));
            return null;
        }
        return f00.EXPONENTIAL;
    }

    public static final v64 f(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return v64.TEMPORARILY_UNMETERED;
                            }
                            i.i(wh1.j("Could not convert ", i, " to NetworkType"));
                            return null;
                        }
                        return v64.METERED;
                    }
                    return v64.NOT_ROAMING;
                }
                return v64.UNMETERED;
            }
            return v64.CONNECTED;
        }
        return v64.NOT_REQUIRED;
    }

    public static final mf4 g(int i) {
        if (i != 0) {
            if (i == 1) {
                return mf4.DROP_WORK_REQUEST;
            }
            i.i(wh1.j("Could not convert ", i, " to OutOfQuotaPolicy"));
            return null;
        }
        return mf4.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static final ih7 h(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return ih7.CANCELLED;
                            }
                            i.i(wh1.j("Could not convert ", i, " to State"));
                            return null;
                        }
                        return ih7.BLOCKED;
                    }
                    return ih7.FAILED;
                }
                return ih7.SUCCEEDED;
            }
            return ih7.RUNNING;
        }
        return ih7.ENQUEUED;
    }

    public static final boolean i(ed2 ed2Var) {
        vf3 vf3Var;
        m74 m74Var;
        vf3 vf3Var2;
        m74 m74Var2 = ed2Var.c0;
        if (m74Var2 != null && (vf3Var = m74Var2.j0) != null && vf3Var.I() && (m74Var = ed2Var.c0) != null && (vf3Var2 = m74Var.j0) != null && vf3Var2.H()) {
            return true;
        }
        return false;
    }

    public static final int j(ih7 ih7Var) {
        ih7Var.getClass();
        switch (hi7.a[ih7Var.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case ig7.b /* 6 */:
                return 5;
            default:
                i.c();
                return 0;
        }
    }

    public static final m64 k(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT >= 28 && bArr.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                m64 r = mj2.r(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return r;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dt3.W(byteArrayInputStream, th);
                    throw th2;
                }
            }
        }
        return new m64(null);
    }
}
