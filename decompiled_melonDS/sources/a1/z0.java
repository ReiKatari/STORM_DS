package a1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class z0 implements Iterator, oc.a {
    public final /* synthetic */ int A;
    public int B;
    public final Object L;

    public z0(nd.y yVar) {
        this.A = 2;
        this.L = yVar;
        this.B = yVar.f10278c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                if (this.B < ((x0) this.L).g()) {
                    return true;
                }
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (this.B < ((ViewGroup) this.L).getChildCount()) {
                    return true;
                }
                return false;
            case 2:
                if (this.B > 0) {
                    return true;
                }
                return false;
            case 3:
                if (this.B < ((Object[]) this.L).length) {
                    return true;
                }
                return false;
            case 4:
                if (this.B < ((byte[]) this.L).length) {
                    return true;
                }
                return false;
            case l1.c.f8511g /* 5 */:
                if (this.B < ((int[]) this.L).length) {
                    return true;
                }
                return false;
            case l1.c.f8509e /* 6 */:
                if (this.B < ((long[]) this.L).length) {
                    return true;
                }
                return false;
            case 7:
                if (this.B < ((short[]) this.L).length) {
                    return true;
                }
                return false;
            default:
                if (this.B < ((zb.e) this.L).a()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                int i2 = this.B;
                this.B = i2 + 1;
                return ((x0) this.L).h(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                int i10 = this.B;
                this.B = i10 + 1;
                View childAt = ((ViewGroup) this.L).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                nd.y yVar = (nd.y) this.L;
                int i11 = yVar.f10278c;
                int i12 = this.B;
                this.B = i12 - 1;
                return yVar.f10280e[i11 - i12];
            case 3:
                try {
                    int i13 = this.B;
                    this.B = i13 + 1;
                    return ((Object[]) this.L)[i13];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.B--;
                    m9.o.x(e6.getMessage());
                    return null;
                }
            case 4:
                int i14 = this.B;
                byte[] bArr = (byte[]) this.L;
                if (i14 < bArr.length) {
                    this.B = i14 + 1;
                    return new yb.p(bArr[i14]);
                }
                m9.o.x(String.valueOf(i14));
                return null;
            case l1.c.f8511g /* 5 */:
                int i15 = this.B;
                int[] iArr = (int[]) this.L;
                if (i15 < iArr.length) {
                    this.B = i15 + 1;
                    return new yb.r(iArr[i15]);
                }
                m9.o.x(String.valueOf(i15));
                return null;
            case l1.c.f8509e /* 6 */:
                int i16 = this.B;
                long[] jArr = (long[]) this.L;
                if (i16 < jArr.length) {
                    this.B = i16 + 1;
                    return new yb.t(jArr[i16]);
                }
                m9.o.x(String.valueOf(i16));
                return null;
            case 7:
                int i17 = this.B;
                short[] sArr = (short[]) this.L;
                if (i17 < sArr.length) {
                    this.B = i17 + 1;
                    return new yb.w(sArr[i17]);
                }
                m9.o.x(String.valueOf(i17));
                return null;
            default:
                if (hasNext()) {
                    int i18 = this.B;
                    this.B = i18 + 1;
                    return ((zb.e) this.L).get(i18);
                }
                fj.j.l();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case DSiCameraSource.FrontCamera /* 1 */:
                int i2 = this.B - 1;
                this.B = i2;
                ((ViewGroup) this.L).removeViewAt(i2);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case l1.c.f8511g /* 5 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case l1.c.f8509e /* 6 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z0(Object[] objArr) {
        this.A = 3;
        objArr.getClass();
        this.L = objArr;
    }

    public /* synthetic */ z0(int i2, Object obj) {
        this.A = i2;
        this.L = obj;
    }
}
