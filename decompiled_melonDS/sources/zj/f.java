package zj;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: b  reason: collision with root package name */
    public final c f15157b = new c();

    public f() {
        new c();
    }

    @Override // zj.b
    public final byte[] a(int i2) {
        d dVar;
        Object obj;
        c cVar = this.f15157b;
        Object obj2 = null;
        if (i2 >= 32768) {
            synchronized (cVar) {
                dVar = (d) cVar.get(Integer.valueOf(i2));
            }
            if (dVar != null) {
                while (true) {
                    synchronized (dVar) {
                        Object[] objArr = dVar.f15154a;
                        int i10 = dVar.f15155b;
                        obj = objArr[i10];
                        objArr[i10] = null;
                        dVar.f15155b = (i10 - 1) & 511;
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
            return new byte[i2];
        }
        return bArr;
    }

    @Override // zj.b
    public final void b(byte[] bArr) {
        d dVar;
        c cVar = this.f15157b;
        int length = bArr.length;
        if (length < 32768) {
            return;
        }
        synchronized (cVar) {
            try {
                dVar = (d) cVar.get(Integer.valueOf(length));
                if (dVar == null) {
                    dVar = new d();
                    cVar.put(Integer.valueOf(length), dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        SoftReference softReference = new SoftReference(bArr);
        synchronized (dVar) {
            int i2 = (dVar.f15155b + 1) & 511;
            dVar.f15155b = i2;
            dVar.f15154a[i2] = softReference;
        }
    }
}
