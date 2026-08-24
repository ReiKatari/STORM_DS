package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw6  reason: default package */
/* loaded from: classes.dex */
public final class iw6 extends e74 {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final PointerInputEventHandler d;

    public iw6(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new ow6(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw6)) {
            return false;
        }
        iw6 iw6Var = (iw6) obj;
        if (!nb3.k(this.a, iw6Var.a) || !nb3.k(this.b, iw6Var.b)) {
            return false;
        }
        Object[] objArr = iw6Var.c;
        Object[] objArr2 = this.c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        if (this.d == iw6Var.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ow6 ow6Var = (ow6) z64Var;
        Object obj = ow6Var.k0;
        Object obj2 = this.a;
        boolean z = true;
        boolean z2 = !nb3.k(obj, obj2);
        ow6Var.k0 = obj2;
        Object obj3 = ow6Var.l0;
        Object obj4 = this.b;
        if (!nb3.k(obj3, obj4)) {
            z2 = true;
        }
        ow6Var.l0 = obj4;
        Object[] objArr = ow6Var.m0;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z2 = true;
        }
        if (objArr == null && objArr2 != null) {
            z2 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z2 = true;
        }
        ow6Var.m0 = objArr2;
        Class<?> cls = ow6Var.n0.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass()) {
            z = z2;
        }
        if (z) {
            ow6Var.T0();
        }
        ow6Var.n0 = pointerInputEventHandler;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object[] objArr = this.c;
        if (objArr != null) {
            i3 = Arrays.hashCode(objArr);
        }
        return this.d.hashCode() + ((i5 + i3) * 31);
    }
}
