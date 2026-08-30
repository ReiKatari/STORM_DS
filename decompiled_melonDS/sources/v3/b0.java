package v3;

import a4.j1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13630a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13631b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f13632c;

    /* renamed from: d  reason: collision with root package name */
    public final PointerInputEventHandler f13633d;

    public b0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i2) {
        obj = (i2 & 1) != 0 ? null : obj;
        obj2 = (i2 & 2) != 0 ? null : obj2;
        objArr = (i2 & 4) != 0 ? null : objArr;
        this.f13630a = obj;
        this.f13631b = obj2;
        this.f13632c = objArr;
        this.f13633d = pointerInputEventHandler;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new h0(this.f13630a, this.f13631b, this.f13632c, this.f13633d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!nc.k.a(this.f13630a, b0Var.f13630a) || !nc.k.a(this.f13631b, b0Var.f13631b)) {
            return false;
        }
        Object[] objArr = b0Var.f13632c;
        Object[] objArr2 = this.f13632c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        if (this.f13633d == b0Var.f13633d) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        h0 h0Var = (h0) oVar;
        Object obj = h0Var.f13658i0;
        Object obj2 = this.f13630a;
        boolean z10 = true;
        boolean z11 = !nc.k.a(obj, obj2);
        h0Var.f13658i0 = obj2;
        Object obj3 = h0Var.f13659j0;
        Object obj4 = this.f13631b;
        if (!nc.k.a(obj3, obj4)) {
            z11 = true;
        }
        h0Var.f13659j0 = obj4;
        Object[] objArr = h0Var.f13660k0;
        Object[] objArr2 = this.f13632c;
        if (objArr != null && objArr2 == null) {
            z11 = true;
        }
        if (objArr == null && objArr2 != null) {
            z11 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z11 = true;
        }
        h0Var.f13660k0 = objArr2;
        Class<?> cls = h0Var.f13661l0.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f13633d;
        if (cls == pointerInputEventHandler.getClass()) {
            z10 = z11;
        }
        if (z10) {
            h0Var.Q0();
        }
        h0Var.f13661l0 = pointerInputEventHandler;
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11 = 0;
        Object obj = this.f13630a;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = i2 * 31;
        Object obj2 = this.f13631b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        Object[] objArr = this.f13632c;
        if (objArr != null) {
            i11 = Arrays.hashCode(objArr);
        }
        return this.f13633d.hashCode() + ((i13 + i11) * 31);
    }
}
