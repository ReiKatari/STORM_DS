package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds7  reason: default package */
/* loaded from: classes.dex */
public abstract class ds7 {
    public static e33 a;

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
                        linkedHashSet.add(new n21(readBoolean, parse));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ge7.t(objectInputStream, th);
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
                ge7.t(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final e33 b() {
        e33 e33Var = a;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(1.0f, 21.0f);
        ww2Var.l(22.0f);
        ww2Var.m(12.0f, 2.0f);
        ww2Var.m(1.0f, 21.0f);
        ww2Var.g();
        ww2Var.o(13.0f, 18.0f);
        ww2Var.l(-2.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(2.0f);
        ww2Var.u(2.0f);
        ww2Var.g();
        ww2Var.o(13.0f, 14.0f);
        ww2Var.l(-2.0f);
        ww2Var.u(-4.0f);
        ww2Var.l(2.0f);
        ww2Var.u(4.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b = d33Var.b();
        a = b;
        return b;
    }

    public static final w10 c(int i) {
        if (i != 0) {
            if (i == 1) {
                return w10.LINEAR;
            }
            i.h(lb1.k("Could not convert ", i, " to BackoffPolicy"));
            return null;
        }
        return w10.EXPONENTIAL;
    }

    public static final kf4 d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return kf4.TEMPORARILY_UNMETERED;
                            }
                            i.h(lb1.k("Could not convert ", i, " to NetworkType"));
                            return null;
                        }
                        return kf4.METERED;
                    }
                    return kf4.NOT_ROAMING;
                }
                return kf4.UNMETERED;
            }
            return kf4.CONNECTED;
        }
        return kf4.NOT_REQUIRED;
    }

    public static final oo4 e(int i) {
        if (i != 0) {
            if (i == 1) {
                return oo4.DROP_WORK_REQUEST;
            }
            i.h(lb1.k("Could not convert ", i, " to OutOfQuotaPolicy"));
            return null;
        }
        return oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static final iw7 f(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return iw7.CANCELLED;
                            }
                            i.h(lb1.k("Could not convert ", i, " to State"));
                            return null;
                        }
                        return iw7.BLOCKED;
                    }
                    return iw7.FAILED;
                }
                return iw7.SUCCEEDED;
            }
            return iw7.RUNNING;
        }
        return iw7.ENQUEUED;
    }

    public static final int g(iw7 iw7Var) {
        iw7Var.getClass();
        switch (gx7.a[iw7Var.ordinal()]) {
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
            case 6:
                return 5;
            default:
                i.d();
                return 0;
        }
    }

    public static final af4 h(byte[] bArr) {
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
                af4 A = kn2.A(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return A;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ge7.t(byteArrayInputStream, th);
                    throw th2;
                }
            }
        }
        return new af4(null);
    }
}
