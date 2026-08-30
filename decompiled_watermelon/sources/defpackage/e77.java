package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e77  reason: default package */
/* loaded from: classes.dex */
public final class e77 extends g77 implements Iterable, f93 {
    public final String A;
    public final float B;
    public final float L;
    public final float R;
    public final float X;
    public final float Y;
    public final float Z;
    public final float c0;
    public final List d0;
    public final List e0;

    public e77(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.A = str;
        this.B = f;
        this.L = f2;
        this.R = f3;
        this.X = f4;
        this.Y = f5;
        this.Z = f6;
        this.c0 = f7;
        this.d0 = list;
        this.e0 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e77)) {
            e77 e77Var = (e77) obj;
            if (b53.x(this.A, e77Var.A) && this.B == e77Var.B && this.L == e77Var.L && this.R == e77Var.R && this.X == e77Var.X && this.Y == e77Var.Y && this.Z == e77Var.Z && this.c0 == e77Var.c0 && b53.x(this.d0, e77Var.d0) && b53.x(this.e0, e77Var.e0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.e0.hashCode() + b31.b(ej6.a(this.c0, ej6.a(this.Z, ej6.a(this.Y, ej6.a(this.X, ej6.a(this.R, ej6.a(this.L, ej6.a(this.B, this.A.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.d0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ym4(this);
    }
}
