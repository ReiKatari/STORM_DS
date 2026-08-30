package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ok6  reason: default package */
/* loaded from: classes.dex */
public final class ok6 extends dz3 {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final PointerInputEventHandler d;

    public ok6(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new uk6(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok6)) {
            return false;
        }
        ok6 ok6Var = (ok6) obj;
        if (!b53.x(this.a, ok6Var.a) || !b53.x(this.b, ok6Var.b)) {
            return false;
        }
        Object[] objArr = ok6Var.c;
        Object[] objArr2 = this.c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        if (this.d == ok6Var.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        uk6 uk6Var = (uk6) yy3Var;
        Object obj = uk6Var.j0;
        Object obj2 = this.a;
        boolean z = true;
        boolean z2 = !b53.x(obj, obj2);
        uk6Var.j0 = obj2;
        Object obj3 = uk6Var.k0;
        Object obj4 = this.b;
        if (!b53.x(obj3, obj4)) {
            z2 = true;
        }
        uk6Var.k0 = obj4;
        Object[] objArr = uk6Var.l0;
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
        uk6Var.l0 = objArr2;
        Class<?> cls = uk6Var.m0.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass()) {
            z = z2;
        }
        if (z) {
            uk6Var.T0();
        }
        uk6Var.m0 = pointerInputEventHandler;
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
