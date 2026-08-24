package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c30  reason: default package */
/* loaded from: classes.dex */
public final class c30 extends mu {
    public final z20 b = new z20();

    public c30() {
        new z20();
    }

    @Override // defpackage.mu
    public final byte[] a(int i) {
        a30 a30Var;
        Object obj;
        z20 z20Var = this.b;
        Object obj2 = null;
        if (i >= 32768) {
            synchronized (z20Var) {
                a30Var = (a30) z20Var.get(Integer.valueOf(i));
            }
            if (a30Var != null) {
                while (true) {
                    synchronized (a30Var) {
                        Object[] objArr = a30Var.a;
                        int i2 = a30Var.b;
                        obj = objArr[i2];
                        objArr[i2] = null;
                        a30Var.b = (i2 - 1) & 511;
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

    @Override // defpackage.mu
    public final void b(byte[] bArr) {
        a30 a30Var;
        z20 z20Var = this.b;
        int length = bArr.length;
        if (length < 32768) {
            return;
        }
        synchronized (z20Var) {
            try {
                a30Var = (a30) z20Var.get(Integer.valueOf(length));
                if (a30Var == null) {
                    a30Var = new a30();
                    z20Var.put(Integer.valueOf(length), a30Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SoftReference softReference = new SoftReference(bArr);
        synchronized (a30Var) {
            int i = (a30Var.b + 1) & 511;
            a30Var.b = i;
            a30Var.a[i] = softReference;
        }
    }
}
