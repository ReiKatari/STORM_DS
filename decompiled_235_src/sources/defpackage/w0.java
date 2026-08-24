package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w0  reason: default package */
/* loaded from: classes.dex */
public class w0 implements Iterator, zf3 {
    public final /* synthetic */ int A;
    public int B;
    public final Object L;

    public w0(wb6 wb6Var) {
        this.A = 3;
        this.L = wb6Var;
        this.B = wb6Var.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        Object obj = this.L;
        switch (i) {
            case 0:
                if (this.B >= ((z0) obj).a()) {
                    return false;
                }
                return true;
            case 1:
                if (this.B >= ((float[]) obj).length) {
                    return false;
                }
                return true;
            case 2:
                if (this.B >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
            case 3:
                if (this.B <= 0) {
                    return false;
                }
                return true;
            case 4:
                if (this.B <= 0) {
                    return false;
                }
                return true;
            case 5:
                if (this.B >= ((un6) obj).f()) {
                    return false;
                }
                return true;
            case 6:
                if (this.B >= ((byte[]) obj).length) {
                    return false;
                }
                return true;
            case 7:
                if (this.B >= ((int[]) obj).length) {
                    return false;
                }
                return true;
            case 8:
                if (this.B >= ((long[]) obj).length) {
                    return false;
                }
                return true;
            case 9:
                if (this.B >= ((short[]) obj).length) {
                    return false;
                }
                return true;
            default:
                if (this.B >= ((ViewGroup) obj).getChildCount()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        Object obj = this.L;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.B;
                    this.B = i2 + 1;
                    return ((z0) obj).get(i2);
                }
                fa6.c();
                return null;
            case 1:
                try {
                    int i3 = this.B;
                    this.B = i3 + 1;
                    return Float.valueOf(((float[]) obj)[i3]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.B--;
                    fa6.e(e.getMessage());
                    return null;
                }
            case 2:
                try {
                    int i4 = this.B;
                    this.B = i4 + 1;
                    return ((Object[]) obj)[i4];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.B--;
                    fa6.e(e2.getMessage());
                    return null;
                }
            case 3:
                wb6 wb6Var = (wb6) obj;
                int f = wb6Var.f();
                int i5 = this.B;
                this.B = i5 - 1;
                return wb6Var.j(f - i5);
            case 4:
                s52 s52Var = (s52) obj;
                int i6 = s52Var.c;
                int i7 = this.B;
                this.B = i7 - 1;
                return s52Var.e[i6 - i7];
            case 5:
                int i8 = this.B;
                this.B = i8 + 1;
                return ((un6) obj).g(i8);
            case 6:
                int i9 = this.B;
                byte[] bArr = (byte[]) obj;
                if (i9 < bArr.length) {
                    this.B = i9 + 1;
                    return new ze7(bArr[i9]);
                }
                fa6.e(String.valueOf(i9));
                return null;
            case 7:
                int i10 = this.B;
                int[] iArr = (int[]) obj;
                if (i10 < iArr.length) {
                    this.B = i10 + 1;
                    return new mf7(iArr[i10]);
                }
                fa6.e(String.valueOf(i10));
                return null;
            case 8:
                int i11 = this.B;
                long[] jArr = (long[]) obj;
                if (i11 < jArr.length) {
                    this.B = i11 + 1;
                    return new rf7(jArr[i11]);
                }
                fa6.e(String.valueOf(i11));
                return null;
            case 9:
                int i12 = this.B;
                short[] sArr = (short[]) obj;
                if (i12 < sArr.length) {
                    this.B = i12 + 1;
                    return new xf7(sArr[i12]);
                }
                fa6.e(String.valueOf(i12));
                return null;
            default:
                int i13 = this.B;
                this.B = i13 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i13);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 8:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 9:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.B - 1;
                this.B = i;
                ((ViewGroup) this.L).removeViewAt(i);
                return;
        }
    }

    public w0(Object[] objArr) {
        this.A = 2;
        objArr.getClass();
        this.L = objArr;
    }

    public /* synthetic */ w0(Object obj, int i) {
        this.A = i;
        this.L = obj;
    }

    public w0(s52 s52Var) {
        this.A = 4;
        this.L = s52Var;
        this.B = s52Var.c;
    }
}
