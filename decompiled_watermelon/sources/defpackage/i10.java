package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i10  reason: default package */
/* loaded from: classes.dex */
public final class i10 extends ut {
    public final f10 b = new f10();

    public i10() {
        new f10();
    }

    @Override // defpackage.ut
    public final byte[] a(int i) {
        g10 g10Var;
        Object obj;
        f10 f10Var = this.b;
        Object obj2 = null;
        if (i >= 32768) {
            synchronized (f10Var) {
                g10Var = (g10) f10Var.get(Integer.valueOf(i));
            }
            if (g10Var != null) {
                while (true) {
                    synchronized (g10Var) {
                        Object[] objArr = g10Var.a;
                        int i2 = g10Var.b;
                        obj = objArr[i2];
                        objArr[i2] = null;
                        g10Var.b = (i2 - 1) & 511;
                    }
                    Reference reference = (Reference) obj;
                    if (reference == null) {
                        break;
                    }
                    Object obj3 = reference.get();
                    if (obj3 != null) {
                        obj2 = obj3;
                        break;
                    }
                }
            }
        }
        byte[] bArr = (byte[]) obj2;
        if (bArr == null) {
            return new byte[i];
        }
        return bArr;
    }

    @Override // defpackage.ut
    public final void b(byte[] bArr) {
        g10 g10Var;
        f10 f10Var = this.b;
        int length = bArr.length;
        if (length < 32768) {
            return;
        }
        synchronized (f10Var) {
            try {
                g10Var = (g10) f10Var.get(Integer.valueOf(length));
                if (g10Var == null) {
                    g10Var = new g10();
                    f10Var.put(Integer.valueOf(length), g10Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SoftReference softReference = new SoftReference(bArr);
        synchronized (g10Var) {
            int i = (g10Var.b + 1) & 511;
            g10Var.b = i;
            g10Var.a[i] = softReference;
        }
    }
}
