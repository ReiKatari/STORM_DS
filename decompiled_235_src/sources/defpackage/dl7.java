package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl7  reason: default package */
/* loaded from: classes.dex */
public final class dl7 extends fl7 implements Iterable, zf3 {
    public final String A;
    public final float B;
    public final float L;
    public final float R;
    public final float X;
    public final float Y;
    public final float Z;
    public final float d0;
    public final List e0;
    public final List f0;

    public dl7(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.A = str;
        this.B = f;
        this.L = f2;
        this.R = f3;
        this.X = f4;
        this.Y = f5;
        this.Z = f6;
        this.d0 = f7;
        this.e0 = list;
        this.f0 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof dl7)) {
            dl7 dl7Var = (dl7) obj;
            if (nb3.k(this.A, dl7Var.A) && this.B == dl7Var.B && this.L == dl7Var.L && this.R == dl7Var.R && this.X == dl7Var.X && this.Y == dl7Var.Y && this.Z == dl7Var.Z && this.d0 == dl7Var.d0 && nb3.k(this.e0, dl7Var.e0) && nb3.k(this.f0, dl7Var.f0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f0.hashCode() + i61.b(xg6.a(this.d0, xg6.a(this.Z, xg6.a(this.Y, xg6.a(this.X, xg6.a(this.R, xg6.a(this.L, xg6.a(this.B, this.A.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), this.e0, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dw4(this);
    }
}
